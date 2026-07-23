package ds.seed5311;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Unit tests for basic Grafo behaviors.
 *
 * Requirement traceability:
 * - REQ-GRAFO-01: Graph creation and vertex count
 * - REQ-GRAFO-02: Edge insertion, existence and removal
 * - REQ-GRAFO-03: Adjacency accessors and transpose behavior
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  // Reusable constants to avoid magic numbers and improve readability
  private static final int DEFAULT_VERTICES = 652;
  private static final int SMALL_VERTICES = 639;
  private static final int LARGE_VERTICES = 4663;
  private static final int V0 = 0;
  private static final int V_ALT = 628;
  private static final int WEIGHT_ZERO = 0;

  /**
   * Given a graph with an inserted self-loop edge,
   * when imprime() is called,
   * then the method should not alter the number of vertices.
   *
   * REQ: REQ-GRAFO-01
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    final int expectedVertices = DEFAULT_VERTICES;
    Grafo grafo = new Grafo(expectedVertices);
    grafo.insereAresta(V0, V0, WEIGHT_ZERO);

    // When
    // call imprime() primarily to ensure it does not throw and does not modify graph size
    grafo.imprime();

    // Then
    assertEquals("imprime() must not change the number of vertices",
        expectedVertices, grafo.numVertices());
  }

  /**
   * Given a graph with a single self-loop inserted,
   * when the edge is removed via retiraAresta,
   * then the returned Aresta must reflect the inserted values and the edge should no longer exist.
   *
   * REQ: REQ-GRAFO-02
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Grafo grafo = new Grafo(DEFAULT_VERTICES);
    grafo.insereAresta(V0, V0, WEIGHT_ZERO);

    // When
    Grafo.Aresta removed = grafo.retiraAresta(V0, V0);

    // Then
    assertNotNull("retiraAresta should return the removed edge for an existing self-loop", removed);
    assertEquals("Removed edge must have correct source vertex", V0, removed.v1());
    assertEquals("Removed edge must have correct target vertex", V0, removed.v2());
    assertEquals("Removed edge must have correct weight", WEIGHT_ZERO, removed.peso());
    assertFalse("After removal, existeAresta should report the edge as absent", grafo.existeAresta(V0, V0));
    assertEquals("Number of vertices must remain unchanged after edge removal", DEFAULT_VERTICES, grafo.numVertices());
  }

  /**
   * Given a graph with an inserted self-loop,
   * when proxAdj is queried for the vertex,
   * then it should return the adjacent edge with correct attributes.
   *
   * REQ: REQ-GRAFO-03
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Grafo grafo = new Grafo(DEFAULT_VERTICES);
    grafo.insereAresta(V0, V0, WEIGHT_ZERO);

    // When
    Grafo.Aresta adj = grafo.proxAdj(V0);

    // Then
    assertNotNull("proxAdj should return the adjacency for a vertex that has an edge", adj);
    assertEquals("Adjacency must have expected source vertex", V0, adj.v1());
    assertEquals("Adjacency must have expected target vertex", V0, adj.v2());
    assertEquals("Adjacency must have expected weight", WEIGHT_ZERO, adj.peso());
    assertEquals("Number of vertices should remain unchanged after adjacency access", DEFAULT_VERTICES, grafo.numVertices());
  }

  /**
   * Given a graph created with a specific vertex count,
   * when primeiroListaAdj is called for a vertex index within range but with no edges,
   * then it should not throw and the number of vertices should remain the same.
   *
   * REQ: REQ-GRAFO-01
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    final int vertices = DEFAULT_VERTICES;
    Grafo grafo = new Grafo(vertices);

    // When
    Grafo.Aresta first = grafo.primeiroListaAdj(V_ALT);

    // Then
    assertNull("primeiroListaAdj should return null for a vertex with no adjacent edges", first);
    assertEquals("Graph vertex count must remain equal to constructor argument", vertices, grafo.numVertices());
  }

  /**
   * Given a large graph with no edges,
   * when existeAresta is queried for a pair likely out of the populated edges,
   * then it should return false without changing graph size.
   *
   * REQ: REQ-GRAFO-02
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    final int vertices = LARGE_VERTICES;
    Grafo grafo = new Grafo(vertices);

    // When
    boolean exists = grafo.existeAresta(189, vertices); // second index equals vertex count; expected to be absent

    // Then
    assertFalse("Non-existing/out-of-range adjacency should be reported as absent", exists);
    assertEquals("Graph vertex count must remain as constructed", vertices, grafo.numVertices());
  }

  /**
   * Given a graph with an inserted edge,
   * when existeAresta is called for that edge,
   * then it should return true. After removal the edge should no longer exist.
   *
   * REQ: REQ-GRAFO-02
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    Grafo grafo = new Grafo(DEFAULT_VERTICES);
    grafo.insereAresta(V0, V0, WEIGHT_ZERO);

    // When / Then
    assertTrue("existeAresta must return true for an inserted self-loop", grafo.existeAresta(V0, V0));

    // Clean-up verification: remove and ensure it's gone
    Grafo.Aresta removed = grafo.retiraAresta(V0, V0);
    assertNotNull("retiraAresta should remove the previously inserted edge", removed);
    assertFalse("After retiraAresta, existeAresta must return false", grafo.existeAresta(V0, V0));
    assertEquals("Graph vertex count must remain unchanged after operations", DEFAULT_VERTICES, grafo.numVertices());
  }

  /**
   * Given a graph with a single inserted self-loop,
   * when attempting to remove a non-existent edge,
   * then retiraAresta should return null and graph state must remain stable.
   *
   * REQ: REQ-GRAFO-02
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given
    Grafo grafo = new Grafo(DEFAULT_VERTICES);
    grafo.insereAresta(V0, V0, WEIGHT_ZERO);

    // When: attempt to remove a different (non-existent) edge
    Grafo.Aresta result = grafo.retiraAresta(V0, V_ALT);

    // Then
    assertNull("retiraAresta must return null when trying to remove a non-existent adjacency", result);
    assertTrue("Original self-loop should still exist after failed removal of another edge", grafo.existeAresta(V0, V0));
    assertEquals("Graph vertex count must remain unchanged", DEFAULT_VERTICES, grafo.numVertices());
  }

  /**
   * Given a graph constructed with a specific number of vertices,
   * when numVertices is queried,
   * then it should return that count.
   *
   * REQ: REQ-GRAFO-01
   */
  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given
    final int vertices = LARGE_VERTICES;

    // When
    Grafo grafo = new Grafo(vertices);
    int count = grafo.numVertices();

    // Then
    assertEquals("numVertices must return the number provided to the constructor", vertices, count);
    assertTrue("numVertices should be non-negative", count >= 0);
  }

  /**
   * Given a graph with an inserted self-loop,
   * when grafoTransposto is created,
   * then it should be a distinct object with the same number of vertices and equivalent transposed edges.
   *
   * REQ: REQ-GRAFO-03
   */
  @Test(timeout = 4000)
  public void test8() throws Throwable {
    // Given
    Grafo original = new Grafo(SMALL_VERTICES);
    original.insereAresta(V0, V0, WEIGHT_ZERO); // self-loop; transpose should preserve self-loop

    // When
    Grafo transposed = original.grafoTransposto();

    // Then
    assertNotSame("grafoTransposto must return a distinct Grafo instance", transposed, original);
    assertEquals("Transposed graph must have the same number of vertices", original.numVertices(), transposed.numVertices());
    assertTrue("Transposed graph must contain the transposed edge corresponding to the original", transposed.existeAresta(V0, V0));
    assertTrue("Original graph must still contain its edge after transpose", original.existeAresta(V0, V0));
  }
}