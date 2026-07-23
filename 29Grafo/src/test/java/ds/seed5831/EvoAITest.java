package ds.seed5831;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved tests for ds.Grafo.
 *
 * NOTE: Test method names are preserved from the original generated class.
 * Each test includes a short requirement reference, Given-When-Then comments,
 * and clearer, descriptive assertions.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Requirement: REQ-GRAFO-001
   * Given a graph with three vertices,
   * When an edge 0->2 is inserted and the structure is printed,
   * Then the graph keeps the declared number of vertices and the inserted edge exists.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Grafo grafo = new Grafo(3);

    // When
    grafo.insereAresta(0, 2, 5);
    // imprime() is a side-effect method for human-readable output; ensure it does not throw.
    grafo.imprime();

    // Then
    assertEquals("Graph should retain the declared number of vertices", 3, grafo.numVertices());
    assertTrue("Inserted edge 0->2 should exist", grafo.existeAresta(0, 2));
  }

  /**
   * Requirement: REQ-GRAFO-002
   * Given a graph with vertices and an inserted edge,
   * When the edge is removed,
   * Then the returned Aresta reflects the removed edge and the edge no longer exists in the graph.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 2, 7);

    // When
    Grafo.Aresta removed = grafo.retiraAresta(0, 2);

    // Then
    assertNotNull("retiraAresta should return the removed Aresta when it exists", removed);
    assertEquals("Removed edge should have origin vertex 0", 0, removed.v1());
    assertEquals("Removed edge should have destination vertex 2", 2, removed.v2());
    assertEquals("Removed edge should preserve the weight", 7, removed.peso());
    assertFalse("After removal, the edge should no longer exist", grafo.existeAresta(0, 2));
    assertEquals("Graph should retain its declared number of vertices", 3, grafo.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-003
   * Given an empty adjacency list for a vertex,
   * When primeiroListaAdj is queried,
   * Then it should return null to indicate no adjacent edges.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Grafo grafo = new Grafo(4);

    // When
    Grafo.Aresta firstAdj = grafo.primeiroListaAdj(0);

    // Then
    assertNull("primeiroListaAdj should return null when there are no adjacent edges", firstAdj);
    assertEquals("Graph should report the correct number of vertices", 4, grafo.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-004
   * Given a graph without a specific edge,
   * When existeAresta is called for that edge,
   * Then it should return false.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1); // different edge

    // When
    boolean exists = grafo.existeAresta(1, 4); // edge not inserted

    // Then
    assertFalse("Non-inserted edge 1->4 should not exist", exists);
    assertEquals("Graph should report the correct number of vertices", 5, grafo.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-005
   * Given a graph,
   * When a self-loop is inserted,
   * Then existeAresta should report it and retiraAresta should be able to remove it.
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Grafo grafo = new Grafo(2);

    // When
    grafo.insereAresta(0, 0, 0);
    boolean existsAfterInsert = grafo.existeAresta(0, 0);
    Grafo.Aresta removed = grafo.retiraAresta(0, 0);

    // Then
    assertTrue("Self-loop 0->0 should exist after insertion", existsAfterInsert);
    assertNotNull("retiraAresta should return the self-loop Aresta when removed", removed);
    assertEquals("Removed self-loop should have origin 0", 0, removed.v1());
    assertEquals("Removed self-loop should have destination 0", 0, removed.v2());
    assertEquals("Removed self-loop should have weight 0", 0, removed.peso());
    assertFalse("Self-loop should no longer exist after removal", grafo.existeAresta(0, 0));
    assertEquals("Graph should report the correct number of vertices", 2, grafo.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-006
   * Given a graph without the requested edge,
   * When retiraAresta is called for a non-existent edge,
   * Then null should be returned.
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 2);

    // When
    Grafo.Aresta removed = grafo.retiraAresta(1, 2); // edge 1->2 does not exist

    // Then
    assertNull("retiraAresta should return null for a non-existent edge", removed);
    assertEquals("Graph should report the correct number of vertices", 3, grafo.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-007
   * Given graphs with declared sizes,
   * When asked for numVertices,
   * Then the declared size is returned (including zero-sized graphs).
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given & When
    Grafo grafoTypical = new Grafo(628);
    Grafo grafoZero = new Grafo(0);

    // Then
    assertEquals("Typical graph should report the declared number of vertices", 628, grafoTypical.numVertices());
    assertEquals("Zero-sized graph should report zero vertices", 0, grafoZero.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-008
   * Given a graph with a self-loop,
   * When the graph is transposed,
   * Then the transposed graph is a different instance but preserves vertex count and self-loop existence.
   */
  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 0, 10);

    // When
    Grafo transposed = grafo.grafoTransposto();

    // Then
    assertNotSame("grafoTransposto should return a different Grafo instance", transposed, grafo);
    assertEquals("Transposed graph should have same number of vertices", grafo.numVertices(), transposed.numVertices());
    assertTrue("Self-loop should remain in the transposed graph", transposed.existeAresta(0, 0));
  }

  /**
   * Requirement: REQ-GRAFO-009
   * Given an edge with a negative weight,
   * When proxAdj is used to obtain adjacency information,
   * Then the returned Aresta contains the correct destination and negative weight.
   */
  @Test(timeout = 4000)
  public void test8() throws Throwable {
    // Given
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 3, -1103);

    // When
    Grafo.Aresta adj = grafo.proxAdj(0);

    // Then
    assertNotNull("proxAdj should return the adjacent Aresta for vertex 0", adj);
    assertEquals("The origin of the returned edge should be 0", 0, adj.v1());
    assertEquals("The destination of the returned edge should be 3", 3, adj.v2());
    assertEquals("The returned edge should preserve the negative weight", -1103, adj.peso());
    assertEquals("Graph should report the correct number of vertices", 4, grafo.numVertices());
  }
}