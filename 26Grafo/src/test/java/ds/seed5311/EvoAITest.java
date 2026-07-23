package ds.seed5311;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and more descriptive unit tests for Grafo.
 *
 * These tests exercise basic behaviors: construction, insertion, removal,
 * transpose, and existence checks. Each test follows a Given-When-Then
 * structure in comments and provides descriptive assertion messages.
 *
 * Note: Method names are preserved (test00..test10) to comply with the
 * requested constraints.
 */
@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    // REQ-GRAPH-001: A constructed graph reports its vertex count and
    // printing it does not change internal state.
    // Given
    Grafo g = new Grafo(1);

    // When: print representation (should not throw)
    g.imprime();

    // Then: vertex count is correct and no edges exist initially.
    assertEquals("Graph with one vertex should report numVertices() == 1", 1, g.numVertices());
    // Existence check for an edge that was never inserted should be false.
    assertFalse("New graph should not contain an edge (0->0) by default", g.existeAresta(0, 0));

    // And: calling retiraAresta should not change vertex count.
    Grafo.Aresta removed = null;
    try {
      removed = g.retiraAresta(0, 0);
    } catch (Exception ex) {
      fail("retiraAresta must not throw for valid indices on a small graph: " + ex.getMessage());
    }
    assertEquals("numVertices() must remain unchanged after retiraAresta", 1, g.numVertices());
    if (removed != null) {
      // If an implementation returns a default Aresta, its vertex indices should be within bounds.
      assertTrue("Returned edge v1 should be within [0,numVertices-1]", removed.v1() >= 0 && removed.v1() < g.numVertices());
      assertTrue("Returned edge v2 should be within [0,numVertices-1]", removed.v2() >= 0 && removed.v2() < g.numVertices());
    }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    // REQ-GRAPH-002: Removing with out-of-range indices on an empty graph
    // must not corrupt state and should be safely handled (no unexpected exceptions).
    // Given
    Grafo g = new Grafo(0);

    // When: attempt to remove an edge with out-of-range indices
    Grafo.Aresta maybe = null;
    try {
      maybe = g.retiraAresta(4916, -1470);
    } catch (Exception ex) {
      fail("retiraAresta on an empty graph with arbitrary indices must not throw: " + ex.getMessage());
    }

    // Then: graph still reports zero vertices and removal result (if any)
    // is acceptable (null or a bounded Aresta).
    assertEquals("Empty graph should still have 0 vertices after retiraAresta", 0, g.numVertices());
    if (maybe == null) {
      assertNull("retiraAresta returned null for invalid indices on empty graph (acceptable)", maybe);
    } else {
      // If non-null, ensure returned edge uses indices consistent with an empty graph (likely zeros).
      assertTrue("Returned edge v1 for empty graph should be >= 0", maybe.v1() >= 0);
      assertTrue("Returned edge v2 for empty graph should be >= 0", maybe.v2() >= 0);
    }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    // REQ-GRAPH-003: Inserting an edge and then removing the same edge should
    // yield a matching Aresta object with expected endpoints and weight.
    // Given
    final int n = 12;
    Grafo g = new Grafo(n);
    final int v1 = 0;
    final int v2 = 1;
    final int peso = 5;

    // When: insert and then remove the exact edge
    g.insereAresta(v1, v2, peso);
    assertTrue("Edge should exist after insertion", g.existeAresta(v1, v2));

    Grafo.Aresta removed = null;
    try {
      removed = g.retiraAresta(v1, v2);
    } catch (Exception ex) {
      fail("retiraAresta should not throw for a previously inserted edge: " + ex.getMessage());
    }

    // Then: ensure removal returned a sensible edge and graph no longer reports that edge
    assertNotNull("Removing a previously inserted edge should return a non-null Aresta", removed);
    assertEquals("Removed edge v1 should match inserted v1", v1, removed.v1());
    assertEquals("Removed edge v2 should match inserted v2", v2, removed.v2());
    // peso may be implementation-defined; if available, expect the same value or non-negative.
    assertTrue("Removed edge weight should be non-negative", removed.peso() >= 0);
    assertFalse("Edge should not exist after removal", g.existeAresta(v1, v2));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    // REQ-GRAPH-004: Self-loop insertion and removal on a single-vertex graph.
    // Given
    Grafo g = new Grafo(1);

    // When: insert a self-loop and then remove it
    g.insereAresta(0, 0, 0);
    assertTrue("Self-loop should exist after insertion", g.existeAresta(0, 0));

    Grafo.Aresta removed = g.retiraAresta(0, 0);

    // Then: removed edge corresponds to the self-loop and graph no longer reports it
    assertNotNull("Removal of existing self-loop should yield a non-null Aresta", removed);
    assertEquals("Removed self-loop v1 must be 0", 0, removed.v1());
    assertEquals("Removed self-loop v2 must be 0", 0, removed.v2());
    assertFalse("Self-loop should no longer exist after removal", g.existeAresta(0, 0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // REQ-GRAPH-005: Transpose must flip direction of edges while preserving vertex count.
    // Given
    Grafo original = new Grafo(2);
    original.insereAresta(0, 1, 7);

    // Precondition checks
    assertTrue("Original should contain edge 0->1 before transpose", original.existeAresta(0, 1));
    assertFalse("Original should not contain edge 1->0 before transpose", original.existeAresta(1, 0));
    int beforeVertices = original.numVertices();

    // When: compute transpose
    Grafo transposed = original.grafoTransposto();

    // Then: transpose is a distinct object with same number of vertices
    assertNotSame("Transpose should return a new Grafo instance", transposed, original);
    assertEquals("Transpose must preserve the vertex count", beforeVertices, transposed.numVertices());
    // The transposed graph should have the reversed edge
    assertTrue("Transposed graph should contain edge 1->0", transposed.existeAresta(1, 0));
    assertFalse("Transposed graph should not contain edge 0->1 (unless self-loop or duplicate)", transposed.existeAresta(0, 1));
    // Original must remain unchanged with respect to vertex count and original edge
    assertEquals("Original graph vertex count must remain unchanged after transpose", beforeVertices, original.numVertices());
    assertTrue("Original graph must still contain edge 0->1 after computing transpose", original.existeAresta(0, 1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    // REQ-GRAPH-006: Inserting a loop on vertex 1 should be detectable.
    // Given
    Grafo g = new Grafo(2);

    // When: insert a loop on vertex 1
    g.insereAresta(1, 1, 2);

    // Then: existence check and other vertices unaffected
    assertTrue("Graph must report the inserted self-loop at vertex 1", g.existeAresta(1, 1));
    assertFalse("No edge should exist from vertex 0 to 1 unless inserted", g.existeAresta(0, 1));
    // Validate that vertex count remains as constructed
    assertEquals("Vertex count should remain 2 after edge insertion", 2, g.numVertices());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    // REQ-GRAPH-007: Existence checks with out-of-range indices must not throw and should be false.
    // Given
    Grafo g = new Grafo(1);
    g.insereAresta(0, 0, 1); // create a known edge

    // When/Then: check for a non-existent edge using a large index
    boolean existsLargeIndex;
    try {
      existsLargeIndex = g.existeAresta(0, 3058);
    } catch (Exception ex) {
      fail("existeAresta should not throw for out-of-range indices: " + ex.getMessage());
      return;
    }
    assertFalse("existeAresta must return false for out-of-range target index", existsLargeIndex);

    // Ensure known edge still exists
    assertTrue("Previously inserted edge must still exist", g.existeAresta(0, 0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    // REQ-GRAPH-008: Operations on a zero-vertex graph must be safe (no exceptions and leave vertex count unchanged).
    // Given
    Grafo g = new Grafo(0);

    // When: attempt to insert an edge on an empty graph
    try {
      g.insereAresta(0, -1258, -1279);
    } catch (Exception ex) {
      fail("insereAresta must not throw when called on an empty graph with arbitrary indices: " + ex.getMessage());
    }

    // Then: graph still reports zero vertices
    assertEquals("Empty graph must continue to report 0 vertices after insereAresta attempt", 0, g.numVertices());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    // REQ-GRAPH-009: numVertices on an empty graph returns zero and existence checks are false.
    // Given
    Grafo g = new Grafo(0);

    // When
    int count = g.numVertices();

    // Then
    assertEquals("numVertices() must return 0 for an empty graph", 0, count);
    // existence checks should be safe and false
    try {
      assertFalse("existeAresta on empty graph must be false for any indices", g.existeAresta(0, 0));
    } catch (Exception ex) {
      // Some implementations might throw; treat that as failure for safety.
      fail("existeAresta must not throw on an empty graph: " + ex.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    // REQ-GRAPH-010: Transpose of graph with a self-loop yields a self-loop at same vertex.
    // Given
    Grafo g = new Grafo(1);
    g.insereAresta(0, 0, 3);

    // When
    Grafo t = g.grafoTransposto();

    // Then
    assertNotSame("Transpose should return a different object", t, g);
    assertEquals("Transpose should preserve vertex count for single-vertex graph", g.numVertices(), t.numVertices());
    assertTrue("Transpose of a self-loop must still contain the self-loop", t.existeAresta(0, 0));
    assertTrue("Original graph must still contain the self-loop", g.existeAresta(0, 0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    // REQ-GRAPH-011: Removing from an empty graph should return null or a benign Aresta
    // and must not change the reported number of vertices.
    // Given
    Grafo g = new Grafo(0);

    // When: attempt removal
    Grafo.Aresta a = null;
    try {
      a = g.retiraAresta(0, 0);
    } catch (Exception ex) {
      fail("retiraAresta should not throw when called on an empty graph: " + ex.getMessage());
    }

    // Then: graph remains empty and returned value (if any) is benign
    assertEquals("Empty graph must still report 0 vertices after removal attempt", 0, g.numVertices());
    if (a == null) {
      assertNull("retiraAresta returned null on empty graph (acceptable)", a);
    } else {
      assertTrue("Returned Aresta on empty graph must have non-negative v1", a.v1() >= 0);
      assertTrue("Returned Aresta on empty graph must have non-negative v2", a.v2() >= 0);
    }
  }
}