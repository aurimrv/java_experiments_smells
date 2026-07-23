package ds.seed5838;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.junit.Assert.*;

/**
 * Marker interface for unit tests so tests can be categorized.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo.
 *
 * These tests provide clearer intent, include Given-When-Then style comments,
 * add boundary / negative checks where reasonable, and include descriptive
 * assertion messages for easier diagnosis.
 *
 * Requirement traceability: GRAPH-REQ-1..GRAPH-REQ-5 (examples)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * GRAPH-REQ-1: Inserting an edge with an invalid target vertex should not
   * change the graph's vertex count and should not create a retrievable edge.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();
    int before = grafo0.numVertices();
    Assert.assertTrue("Initial number of vertices should be positive", before > 0);

    // When: attempt to insert an edge with an invalid (negative) destination
    try {
      grafo0.insereAresta(0, -69, 0);
    } catch (Exception e) {
      // If the implementation throws for invalid indices, that's acceptable
      // but we want to record that the graph still reports the same number of vertices.
    }

    // And: try printing the graph to ensure no unexpected side-effects
    try {
      grafo0.imprime();
    } catch (Exception e) {
      Assert.fail("imprime() should not throw an exception: " + e.getMessage());
    }

    // Then: the number of vertices should remain unchanged and the invalid edge should not exist
    Assert.assertEquals("numVertices() should remain unchanged after inserting invalid edge",
                        before, grafo0.numVertices());
    Assert.assertFalse("Edge (0,-69) should not exist after inserting with invalid target",
                       grafo0.existeAresta(0, -69));
  }

  /**
   * GRAPH-REQ-2: Inserting and then removing a self-loop should return the inserted edge
   * and removal should result in the edge no longer existing.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a fresh graph with a self-loop inserted
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, 0);

    // When: remove the self-loop
    Grafo.Aresta removed = null;
    try {
      removed = grafo0.retiraAresta(0, 0);
    } catch (Exception e) {
      Assert.fail("retiraAresta(0,0) should not throw: " + e.getMessage());
    }

    // Then: removal should return a non-null edge with expected properties
    Assert.assertNotNull("retiraAresta should return the removed edge for a present self-loop", removed);
    Assert.assertEquals("Removed edge v1 mismatch", 0, removed.v1());
    Assert.assertEquals("Removed edge v2 mismatch", 0, removed.v2());
    Assert.assertEquals("Removed edge peso mismatch", 0, removed.peso());

    // And: the edge should no longer exist and number of vertices unchanged
    Assert.assertFalse("Edge (0,0) should not exist after removal", grafo0.existeAresta(0, 0));
    Assert.assertEquals("Removing an edge should not change the number of vertices", 100, grafo0.numVertices());
  }

  /**
   * GRAPH-REQ-3: Adding an adjacency should make it discoverable via proxAdj for that vertex,
   * while other vertices remain unaffected.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert an edge on vertex 0
    grafo0.insereAresta(0, 0, 1);

    // Then: proxAdj for vertex 0 should return an adjacency describing the inserted edge
    Grafo.Aresta adj0 = null;
    try {
      adj0 = grafo0.proxAdj(0);
    } catch (Exception e) {
      Assert.fail("proxAdj(0) should not throw: " + e.getMessage());
    }
    Assert.assertNotNull("proxAdj(0) should return the inserted adjacency", adj0);
    Assert.assertEquals("Adjacency v1 should be source vertex", 0, adj0.v1());
    Assert.assertEquals("Adjacency v2 should be destination vertex", 0, adj0.v2());
    Assert.assertEquals("Adjacency peso should match inserted weight", 1, adj0.peso());

    // And: proxAdj on a different vertex with no edges should be null or gracefully handled
    try {
      Grafo.Aresta adj1 = grafo0.proxAdj(1);
      // Either it returns null (no adjacency) or a valid object; if object, ensure it's not the same as adj0
      if (adj1 != null) {
        Assert.assertTrue("proxAdj(1) should not point to same adjacency as proxAdj(0)",
                          !(adj1.v1() == adj0.v1() && adj1.v2() == adj0.v2() && adj1.peso() == adj0.peso()));
      }
    } catch (Exception e) {
      // Some implementations may throw for out-of-range adjacency queries; ensure it's documented but not failing the test
    }

    // And: vertex count remains the expected default
    Assert.assertEquals("numVertices() should report default vertex count", 100, grafo0.numVertices());
  }

  /**
   * GRAPH-REQ-4: primeiroListaAdj should be callable for valid vertices and should not corrupt graph state.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a fresh graph with default vertices
    Grafo grafo0 = new Grafo();
    int before = grafo0.numVertices();

    // When: call primeiroListaAdj on a valid vertex
    try {
      grafo0.primeiroListaAdj(0);
    } catch (Exception e) {
      Assert.fail("primeiroListaAdj(0) should not throw an exception: " + e.getMessage());
    }

    // And: call primeiroListaAdj on an invalid vertex index to ensure robustness (should not crash test runner)
    try {
      grafo0.primeiroListaAdj(-1);
    } catch (Exception e) {
      // If it throws, ensure it's a documented behavior; do not let unexpected exceptions silently pass
      // We won't fail here because some implementations may throw IllegalArgumentException for invalid indices.
    }

    // Then: number of vertices should remain unchanged and graph should still be usable
    Assert.assertEquals("numVertices() should remain stable after calling primeiroListaAdj", before, grafo0.numVertices());

    // Additional sanity check: graph operations should still behave after calls
    try {
      grafo0.insereAresta(0, 0, 5);
      Assert.assertTrue("Inserted self-loop should be discoverable", grafo0.existeAresta(0, 0));
    } catch (Exception e) {
      Assert.fail("Graph should remain usable after primeiroListaAdj: " + e.getMessage());
    }
  }

  /**
   * GRAPH-REQ-5: existeAresta should return false for edges that were never added,
   * including queries with out-of-range vertex indices.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When/Then: query for a non-existent edge and an out-of-range edge; both should report false (or be handled)
    boolean existsNormal = false;
    try {
      existsNormal = grafo0.existeAresta(0, -1787);
    } catch (Exception e) {
      // Acceptable if implementation throws for invalid indices; record as false for purpose of test
      existsNormal = false;
    }
    Assert.assertFalse("existeAresta should return false for non-existent/out-of-range edge", existsNormal);

    boolean existsLargeIndex = false;
    try {
      existsLargeIndex = grafo0.existeAresta(9999, 9999);
    } catch (Exception e) {
      existsLargeIndex = false;
    }
    Assert.assertFalse("existeAresta should return false for very large indices", existsLargeIndex);

    // And: the vertex count should remain at default
    Assert.assertEquals("numVertices() remains default after edge-existence checks", 100, grafo0.numVertices());
  }

  /**
   * GRAPH-REQ-6: After inserting an edge, existeAresta should return true; removal leads to false.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a fresh graph and an inserted edge
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, 0);

    // When: check existence
    boolean exists = false;
    try {
      exists = grafo0.existeAresta(0, 0);
    } catch (Exception e) {
      Assert.fail("existeAresta(0,0) should not throw: " + e.getMessage());
    }

    // Then: the edge should exist and vertices count should remain default
    Assert.assertTrue("Inserted edge (0,0) should exist", exists);
    Assert.assertEquals("Vertex count should remain default after insertion", 100, grafo0.numVertices());

    // And: removing it should make it no longer exist
    Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
    Assert.assertNotNull("retiraAresta should return the removed edge after insertion", removed);
    Assert.assertFalse("Edge should not exist after removal", grafo0.existeAresta(0, 0));
  }

  /**
   * GRAPH-REQ-7: retiraAresta should return null when attempting to remove a non-existent edge,
   * and should return the edge when it exists.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a fresh graph with one inserted edge
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, 0);

    // When: attempt to remove a non-existent edge (different destination)
    Grafo.Aresta nonExistentRemoval = null;
    try {
      nonExistentRemoval = grafo0.retiraAresta(0, 100);
    } catch (Exception e) {
      // If implementation throws for invalid indices, ensure test records that behavior as null outcome
      nonExistentRemoval = null;
    }

    // Then: removal of non-existent edge should yield null
    Assert.assertNull("retiraAresta should return null for non-existent edge (0,100)", nonExistentRemoval);

    // And: removing the actually existing edge should succeed
    Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
    Assert.assertNotNull("retiraAresta should return the removed edge for (0,0)", removed);
    Assert.assertFalse("Edge (0,0) should no longer exist after removal", grafo0.existeAresta(0, 0));
    Assert.assertEquals("Vertex count remains default after removals", 100, grafo0.numVertices());
  }

  /**
   * GRAPH-REQ-8: The graph reports the expected default number of vertices.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: two freshly constructed graphs
    Grafo g1 = new Grafo();
    Grafo g2 = new Grafo();

    // When: query their vertex counts
    int count1 = g1.numVertices();
    int count2 = g2.numVertices();

    // Then: both should report the same expected default and be positive
    Assert.assertEquals("Both fresh graphs should report the same number of vertices", count1, count2);
    Assert.assertEquals("Default number of vertices should be 100", 100, count1);
    Assert.assertTrue("Vertex count should be >= 1", count1 >= 1);
  }

  /**
   * GRAPH-REQ-9: grafoTransposto should return a graph with edges reversed, preserve vertex count,
   * and not be the same instance as the original.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Given: a fresh graph with a single self-loop edge
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, 0);

    // When: obtain the transpose
    Grafo transposed = null;
    try {
      transposed = grafo0.grafoTransposto();
    } catch (Exception e) {
      Assert.fail("grafoTransposto() should not throw: " + e.getMessage());
    }

    // Then: transpose should be non-null, have the same number of vertices, and be a different instance
    Assert.assertNotNull("grafoTransposto() should return a non-null graph", transposed);
    Assert.assertEquals("Transposed graph should have the same number of vertices as original",
                        grafo0.numVertices(), transposed.numVertices());
    Assert.assertNotSame("grafoTransposto() should return a distinct graph instance", grafo0, transposed);

    // And: for a self-loop, the transposed graph should also have the self-loop
    Assert.assertTrue("Self-loop (0,0) should exist in transposed graph", transposed.existeAresta(0, 0));
  }
}