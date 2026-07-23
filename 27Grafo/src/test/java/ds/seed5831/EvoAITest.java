package ds.seed5831;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Unit tests for ds.Grafo (REQ-001).
 *
 * Each test follows a Given-When-Then structure and includes descriptive assertion messages
 * to improve diagnosability. Tests are categorized as UnitTest for selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with a fixed number of vertices,
   * When inserting an edge with a target index that is outside the usual small-range and printing,
   * Then the graph size must remain unchanged and printing must not throw.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    final int n = 1345;
    Grafo grafo0 = new Grafo(n);

    // When: attempt to insert an edge (may be out-of-range depending on implementation)
    grafo0.insereAresta(0, 1377, 0);

    // And: call imprime() to ensure no exception and stable state
    grafo0.imprime();

    // Then: number of vertices unchanged and graph object is non-null
    assertNotNull("Graph instance should not be null after construction", grafo0);
    assertEquals("Number of vertices should remain unchanged after inserting an edge",
                 n, grafo0.numVertices());
  }

  /**
   * Given a graph and an inserted edge,
   * When removing that edge via retiraAresta,
   * Then the returned Aresta must contain expected endpoints and weight, and the graph must retain its vertex count.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given
    final int n = 1345;
    Grafo grafo0 = new Grafo(n);

    // When: insert an edge then remove it
    grafo0.insereAresta(0, 1345, 0);
    Grafo.Aresta removed = grafo0.retiraAresta(0, 1345);

    // Then: removed edge should be non-null and have expected fields
    assertNotNull("retiraAresta should return the removed edge when available", removed);
    assertEquals("Removed edge v1 must match insertion source", 0, removed.v1());
    assertEquals("Removed edge v2 must match insertion target", 1345, removed.v2());
    assertEquals("Removed edge weight must match insertion weight", 0, removed.peso());
    // Graph size must remain the same
    assertEquals("Number of vertices should not change when removing an edge", n, grafo0.numVertices());
    // Removing should have removed that specific adjacency (if supported by implementation)
    assertFalse("Edge should no longer exist after removal",
                grafo0.existeAresta(0, 1345));
  }

  /**
   * Given an empty adjacency for a freshly created graph,
   * When querying the first adjacency of vertex 0,
   * Then the graph size remains correct and the first adjacency is absent (null) in an empty graph.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given
    final int n = 1349;
    Grafo grafo0 = new Grafo(n);

    // When
    Grafo.Aresta first = grafo0.primeiroListaAdj(0);

    // Then
    assertEquals("Number of vertices must match constructor argument", n, grafo0.numVertices());
    // For a newly created graph with no edges, primeiroListaAdj is expected to be null
    assertNull("Expected no adjacency for vertex 0 in a newly constructed empty graph", first);
  }

  /**
   * Given a graph with no edges,
   * When checking for an edge that was not inserted,
   * Then existeAresta must return false and vertex count remains unchanged.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given
    final int n = 1345;
    Grafo grafo0 = new Grafo(n);

    // When
    boolean exists = grafo0.existeAresta(1, 1348);

    // Then
    assertFalse("Non-inserted edge should not exist", exists);
    assertEquals("Vertex count should remain unchanged", n, grafo0.numVertices());
  }

  /**
   * Given a graph,
   * When inserting a self-loop edge (0 -> 0),
   * Then existeAresta should report the presence and adjacency operations should reflect it.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given
    final int n = 1345;
    Grafo grafo0 = new Grafo(n);

    // When
    grafo0.insereAresta(0, 0, 0);

    // Then
    assertTrue("Inserted self-loop (0->0) should be reported as existing", grafo0.existeAresta(0, 0));
    assertEquals("Number of vertices should remain as constructed", n, grafo0.numVertices());

    // Additionally ensure primeiroListaAdj returns the self-loop as first adjacency and that it can be removed
    Grafo.Aresta first = grafo0.primeiroListaAdj(0);
    assertNotNull("First adjacency for vertex 0 should not be null after inserting a self-loop", first);
    assertEquals("First adjacency v1 should be source 0", 0, first.v1());
    assertEquals("First adjacency v2 should be target 0", 0, first.v2());

    Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
    assertNotNull("Removing the inserted self-loop should return the edge", removed);
    assertFalse("Self-loop should not exist anymore after removal", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a graph with an inserted edge,
   * When attempting to remove a non-matching edge,
   * Then retiraAresta should return null and original edge should remain.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given
    final int n = 1345;
    Grafo grafo0 = new Grafo(n);
    grafo0.insereAresta(0, 0, 0);

    // When: attempt to remove an edge that does not match the inserted one
    Grafo.Aresta attempt = grafo0.retiraAresta(0, 1345);

    // Then
    assertNull("retiraAresta should return null when asked to remove a non-existent target edge", attempt);
    assertEquals("Vertex count should remain unchanged after a failed removal", n, grafo0.numVertices());
    // The originally inserted self-loop should still be present
    assertTrue("Original self-loop should still exist after failed removal attempt", grafo0.existeAresta(0, 0));
  }

  /**
   * Given construction with a specific number of vertices,
   * When querying numVertices,
   * Then it returns the provided count and the graph has no accidental edges.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given
    final int n = 628;
    Grafo grafo0 = new Grafo(n);

    // When
    int count = grafo0.numVertices();

    // Then
    assertEquals("numVertices must return the constructor argument", n, count);
    // Also ensure empty graph has no adjacency at vertex 0
    Grafo.Aresta first = grafo0.primeiroListaAdj(0);
    assertNull("Newly constructed graph should have no adjacency for vertex 0", first);
    assertFalse("No self-edge should exist in a fresh graph", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a graph with a self-loop,
   * When taking the transpose,
   * Then the resulting graph is a distinct instance but has the same number of vertices and appropriate adjacencies for the self-loop.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given
    final int n = 1345;
    Grafo grafo0 = new Grafo(n);
    grafo0.insereAresta(0, 0, 0);

    // When
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then
    assertNotSame("grafoTransposto must return a different graph instance", grafo0, grafo1);
    assertEquals("Transposed graph must preserve vertex count", grafo0.numVertices(), grafo1.numVertices());
    // For a self-loop, the transposed graph should also have the same self-loop
    assertTrue("Transposed graph should contain the self-loop (0->0)", grafo1.existeAresta(0, 0));
    Grafo.Aresta first = grafo1.primeiroListaAdj(0);
    assertNotNull("Transposed graph should expose the adjacency for vertex 0", first);
    assertEquals("Transposed adjacency should preserve source for self-loop", 0, first.v1());
    assertEquals("Transposed adjacency should preserve target for self-loop", 0, first.v2());
  }

  /**
   * Given a graph,
   * When inserting an edge with negative indices or weights (implementation may allow negatives in weight and v2),
   * Then proxAdj should return the adjacency and its fields must match what was inserted.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Given
    final int n = 1072;
    Grafo grafo0 = new Grafo(n);

    // When
    grafo0.insereAresta(0, (-1103), (-1103));
    Grafo.Aresta adj = grafo0.proxAdj(0);

    // Then: ensure adjacency is retrievable and fields match insertion
    assertNotNull("proxAdj should return an adjacency after insertion (if insertion supported)", adj);
    assertEquals("Adjacency source must be 0", 0, adj.v1());
    assertEquals("Adjacency target must match the inserted value", -1103, adj.v2());
    assertEquals("Adjacency weight must match the inserted value", -1103, adj.peso());
    // Graph size verification
    assertEquals("Vertex count must equal the constructor argument", n, grafo0.numVertices());
  }
}