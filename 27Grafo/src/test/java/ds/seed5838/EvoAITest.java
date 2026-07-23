package ds.seed5838;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for the Grafo class.
 *
 * Requirements covered:
 * - REQ-Graph-001: Graph construction and vertex count
 * - REQ-Graph-002: Edge insertion, existence and retrieval
 * - REQ-Graph-003: Edge removal and transposition behavior
 *
 * These tests are structured with Given-When-Then comments and include
 * descriptive assertion messages to aid traceability and diagnostics.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a graph with a single declared vertex
    Grafo grafo0 = new Grafo(1);

    // When: we insert an edge and request a textual dump (imprime)
    // Note: imprime() is treated as an observation step (may print to stdout).
    grafo0.insereAresta(0, 1, 1);
    grafo0.imprime();

    // Then: the graph should report the original vertex count and the inserted edge should be observable
    assertEquals("Vertex count should remain equal to the constructor argument",
                 1, grafo0.numVertices());
    assertTrue("Inserted edge (0->1) should exist after insereAresta",
               grafo0.existeAresta(0, 1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a small graph
    Grafo grafo0 = new Grafo(1);

    // When: insert an edge with weight zero and retrieve the first adjacency for vertex 0
    grafo0.insereAresta(0, 1, 0);
    Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);

    // Then: the adjacency returned should match the inserted edge properties and the graph size remains unchanged
    assertNotNull("proxAdj should return a non-null Aresta after insertion", grafo_Aresta0);
    assertEquals("Edge weight should match the inserted weight", 0, grafo_Aresta0.peso());
    assertEquals("Edge destination (v2) should match the inserted value", 1, grafo_Aresta0.v2());
    assertEquals("Edge source (v1) should match the queried vertex", 0, grafo_Aresta0.v1());
    assertEquals("Vertex count should remain unchanged after insertion", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a graph constructed with 239 vertices
    Grafo grafo0 = new Grafo(239);

    // When: we request the first adjacency list for a valid vertex index
    // This call is primarily to ensure no exception is thrown for typical usage.
    grafo0.primeiroListaAdj(0);

    // Then: the graph reports the expected number of vertices and has no unexpected self-edge by default
    assertEquals("Number of vertices should match constructor argument", 239, grafo0.numVertices());
    assertFalse("New graph should not contain a self-loop at vertex 0 by default",
                grafo0.existeAresta(0, 0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a graph and an inserted edge
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 1, 1);

    // When: we check for the existence of that edge
    boolean exists = grafo0.existeAresta(0, 1);

    // Then: the edge must exist and vertex count remains correct
    assertTrue("Inserted edge (0->1) should be reported as existing", exists);
    assertEquals("Vertex count should remain as constructed", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: a freshly created graph with one vertex
    Grafo grafo0 = new Grafo(1);

    // When: we query for a non-existent self-edge
    boolean exists = grafo0.existeAresta(0, 0);

    // Then: the edge should not exist and graph size should be unchanged
    assertFalse("No self-loop should exist in a new graph unless explicitly inserted", exists);
    assertEquals("Vertex count should remain as constructed", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a large graph and an inserted self-loop with negative weight
    Grafo grafo0 = new Grafo(4052);
    grafo0.insereAresta(1438, 1438, -1);

    // When: we remove the self-loop
    Grafo.Aresta removed = grafo0.retiraAresta(1438, 1438);

    // Then: the removal should return the removed edge with correct properties and graph size unchanged
    assertNotNull("retiraAresta should return the removed Aresta for an existing edge", removed);
    assertEquals("Removed edge should have the expected weight", -1, removed.peso());
    assertEquals("Removed edge v2 should match", 1438, removed.v2());
    assertEquals("Removed edge v1 should match", 1438, removed.v1());
    assertEquals("Vertex count should remain unchanged after removing an edge", 4052, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a graph with a self-loop inserted
    Grafo grafo0 = new Grafo(4052);
    grafo0.insereAresta(1438, 1438, -1);

    // When: we attempt to remove a non-existent edge between valid but different vertices
    Grafo.Aresta result = grafo0.retiraAresta(1438, 4052);

    // Then: retiraAresta should return null for a non-existing edge and vertex count should be unchanged
    assertNull("Removing a non-existent edge should return null", result);
    assertEquals("Vertex count should remain unchanged after unsuccessful removal", 4052, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: construction of a graph with a typical positive vertex count
    Grafo grafo0 = new Grafo(1688);

    // When: retrieving the reported vertex count
    int count = grafo0.numVertices();

    // Then: the count should match the constructor argument and the graph should initially contain no edges
    assertEquals("Graph should report the same number of vertices as provided in constructor", 1688, count);
    assertFalse("Freshly constructed graph should not have an arbitrary edge (0->0) unless inserted",
                grafo0.existeAresta(0, 0));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Given: a graph with one directed edge inserted
    Grafo grafo0 = new Grafo(2084);
    grafo0.insereAresta(10, 0, -1);

    // When: transposing the graph
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then: the transposed graph should be a distinct instance, sizes preserved, and the edge directions reversed
    assertNotSame("Transposed graph should be a different object instance", grafo1, grafo0);
    assertEquals("Transposed graph should preserve vertex count", 2084, grafo1.numVertices());
    assertEquals("Original graph should preserve vertex count", 2084, grafo0.numVertices());

    // If the graph stores the reversed edge in the transpose, (0->10) should exist there.
    assertTrue("Original graph should contain the inserted edge (10->0)",
               grafo0.existeAresta(10, 0));
    assertTrue("Transposed graph should contain the reversed edge (0->10)",
               grafo1.existeAresta(0, 10));
  }
}