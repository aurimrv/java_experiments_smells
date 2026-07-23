package ds.seed9006;

import ds.Grafo;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and focused unit tests for ds.Grafo.
 *
 * Notes:
 * - Each test documents a short requirement id (REQ-000x) and contains assertions
 *   with descriptive messages so failures are diagnosable.
 * - Tests exercise boundary and typical cases where reasonable while avoiding
 *   direct manipulation of Grafo internals.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-0001: Graph creation and printing should work for typical and boundary sizes.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] sizes = new int[] {0, 1, 960};
    for (int s : sizes) {
      Grafo g = new Grafo(s);
      Assert.assertEquals("Constructor should set number of vertices (" + s + ")", s, g.numVertices());
      try {
        // imprime() is a non-modifying I/O helper; it must not throw for valid graphs.
        g.imprime();
      } catch (Exception e) {
        Assert.fail("imprime() should not throw for graph size " + s + " but threw: " + e);
      }
    }
  }

  /**
   * REQ-0002: Single-vertex graph reports size and initially has no edges.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    Grafo g = new Grafo(1);
    try {
      g.imprime();
    } catch (Exception e) {
      Assert.fail("imprime() on single-vertex graph should not throw, but threw: " + e);
    }
    Assert.assertEquals("Graph of size 1 must report 1 vertex", 1, g.numVertices());
    // A fresh graph should not contain edges by default.
    boolean hasSelfLoop = g.existeAresta(0, 0);
    Assert.assertFalse("No edges expected in a fresh graph of size 1 (self-loop at 0)", hasSelfLoop);
  }

  /**
   * REQ-0003: retiraAresta on non-existent or out-of-range endpoints should behave safely and return null.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    Grafo g = new Grafo(2);
    // Attempt to remove an edge using indices equal to the vertex count (out-of-range).
    Grafo.Aresta aOutOfRange = null;
    try {
      aOutOfRange = g.retiraAresta(2, 2);
    } catch (IndexOutOfBoundsException e) {
      // If implementation throws an IndexOutOfBoundsException, treat that as acceptable but fail with diagnostic.
      Assert.fail("retiraAresta should return null for out-of-range endpoints rather than throw; threw: " + e);
    }
    Assert.assertNull("retiraAresta should return null for out-of-range endpoints", aOutOfRange);

    // Also verify removing a non-present edge inside bounds returns null.
    Grafo.Aresta aMissing = g.retiraAresta(0, 1);
    Assert.assertNull("retiraAresta should return null when the specified edge is not present", aMissing);
  }

  /**
   * REQ-0004: Inserting multiple edges between the same endpoints should result in the last inserted weight being returned on removal.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    Grafo g = new Grafo(0);
    // The test uses vertex 0 even for a graph constructed with 0; historically some implementations accept this.
    g.insereAresta(0, 0, 580);
    g.insereAresta(0, 0, -1);
    Grafo.Aresta removed = g.retiraAresta(0, 0);
    Assert.assertNotNull("retiraAresta should return the removed edge when it exists", removed);
    Assert.assertEquals("v1 should match the requested source vertex", 0, removed.v1());
    Assert.assertEquals("v2 should match the requested target vertex", 0, removed.v2());
    Assert.assertEquals("peso should reflect the last inserted weight for that edge", -1, removed.peso());
  }

  /**
   * REQ-0005: Removing an edge with indices equal to the vertex count must be handled safely (expected: null) and numVertices unchanged.
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    Grafo g = new Grafo(2733);
    Grafo.Aresta removed = g.retiraAresta(2733, 2733);
    Assert.assertNull("retiraAresta on out-of-range vertices should return null", removed);
    Assert.assertEquals("Number of vertices should remain as constructed", 2733, g.numVertices());
  }

  /**
   * REQ-0006: Inserting and then removing a valid self-loop should reflect the inserted weight and update edge existence.
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    Grafo g = new Grafo(1907);
    Assert.assertEquals("numVertices must match constructor parameter", 1907, g.numVertices());
    // Initially there should be no self-loop at vertex 0.
    if (g.numVertices() > 0) {
      Assert.assertFalse("Fresh graph should have no self-loop at 0", g.existeAresta(0, 0));
      // Insert a valid self-loop at vertex 0 and verify its presence and removal.
      g.insereAresta(0, 0, 1234);
      Assert.assertTrue("Self-loop at 0 should exist after insertion", g.existeAresta(0, 0));
      Grafo.Aresta removed = g.retiraAresta(0, 0);
      Assert.assertNotNull("retiraAresta should return the inserted edge", removed);
      Assert.assertEquals("Removed edge should report the inserted weight", 1234, removed.peso());
    }
  }

  /**
   * REQ-0007: Operations on an empty graph should not corrupt vertex count and should not throw unexpected exceptions.
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    Grafo g = new Grafo(0);
    try {
      // Perform several operations that the implementation should tolerate even on an empty graph.
      g.insereAresta(0, -606, -1921);
      g.insereAresta(0, -653, -606);
      g.existeAresta(0, -3119);
    } catch (Exception e) {
      Assert.fail("Operations on an empty graph should not throw unexpected exceptions: " + e);
    }
    Assert.assertEquals("Empty graph must remain with 0 vertices", 0, g.numVertices());
  }

  /**
   * REQ-0008: Large graph construction must set the expected number of vertices.
   */
  @Test(timeout = 4000)
  public void test7() throws Throwable {
    Grafo g = new Grafo(4500);
    Assert.assertEquals("Graph size must match the constructor parameter for a large graph", 4500, g.numVertices());
    if (g.numVertices() > 0) {
      // Basic check that a freshly created large graph does not contain a self-loop at 0.
      Assert.assertFalse("Newly created large graph should not have a self-loop at 0", g.existeAresta(0, 0));
    }
  }

  /**
   * REQ-0009: grafoTransposto must produce a graph where an inserted edge (u,v) appears as (v,u).
   */
  @Test(timeout = 4000)
  public void test8() throws Throwable {
    Grafo g = new Grafo(3);
    // Insert a well-defined small-edge and verify transpose contains the reversed edge.
    g.insereAresta(0, 1, 2719);
    Grafo gt = g.grafoTransposto();
    Grafo.Aresta transposed = gt.retiraAresta(1, 0);
    Assert.assertNotNull("Transpose should contain edge (1,0) after inserting (0,1) in the original graph", transposed);
    Assert.assertEquals("v1 of the transposed edge must be the original target", 1, transposed.v1());
    Assert.assertEquals("v2 of the transposed edge must be the original source", 0, transposed.v2());
    Assert.assertEquals("peso should match the inserted weight after transpose", 2719, transposed.peso());
  }
}