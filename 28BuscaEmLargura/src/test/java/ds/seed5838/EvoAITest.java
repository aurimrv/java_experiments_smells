package ds.seed5838;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests so tests can be categorized.
 */
interface UnitTest {}

/**
 * Evo - improved and documented test class for basic Grafo behaviors.
 *
 * Requirement reference: REQ-GRAFO-001 Basic graph operations (creation, insertion,
 * existence, removal, transpose, adjacency iteration).
 *
 * Notes:
 * - Each test follows a Given-When-Then style in comments.
 * - Assertions include descriptive messages to aid diagnosis on failure.
 * - Tests are intentionally focused on one primary behavior per test method.
 */
@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a graph with a single vertex
    Grafo grafo0 = new Grafo(1);

    // When: we insert an edge (exercise the insertion path) and request a print
    // (printing is a side-effect; ensure it doesn't throw).
    grafo0.insereAresta(0, 1, 1);
    grafo0.imprime();

    // Then: the graph should still report the expected number of vertices.
    assertEquals("Graph should report 1 vertex after creation and insertion.", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: a small graph and an inserted edge with weight 0
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 1, 0);

    // When: we obtain the next adjacent edge for vertex 0
    Grafo.Aresta adj = grafo0.proxAdj(0);

    // Then: the adjacency should exist and have the expected endpoints and weight
    assertNotNull("Expected an adjacency for vertex 0 after inserting edge (0->1).", adj);
    assertEquals("Aresta.v1 should be the source vertex (0).", 0, adj.v1());
    assertEquals("Aresta.v2 should be the destination vertex (1).", 1, adj.v2());
    assertEquals("Aresta.peso should match the inserted weight (0).", 0, adj.peso());
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: a graph created with a specific number of vertices
    final int expectedVertices = 239;
    Grafo grafo0 = new Grafo(expectedVertices);

    // When: we access the adjacency list for a valid vertex index (should not throw)
    grafo0.primeiroListaAdj(0);

    // Then: the number of vertices must match the constructor parameter
    assertEquals("Graph should report the number of vertices provided at construction.",
        expectedVertices, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given: a graph and an inserted self-consistent edge between two vertices
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 1, 1);

    // When: we query whether that edge exists
    boolean exists = grafo0.existeAresta(0, 1);

    // Then: the edge should be reported as existing
    assertTrue("Inserted edge (0->1) should be present in the graph.", exists);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given: a minimal graph (single vertex)
    Grafo grafo0 = new Grafo(1);

    // When: we check for a non-inserted edge (0->0)
    boolean exists = grafo0.existeAresta(0, 0);

    // Then: the edge should not exist
    assertFalse("No edge (0->0) has been inserted; existeAresta should return false.", exists);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given: a larger graph and an inserted self-loop edge with negative weight
    Grafo grafo0 = new Grafo(4052);
    grafo0.insereAresta(1438, 1438, -1);

    // When: we remove that edge
    Grafo.Aresta removed = grafo0.retiraAresta(1438, 1438);

    // Then: the removed edge should be returned with the expected fields
    assertNotNull("retiraAresta should return the removed Aresta for an existing edge.", removed);
    assertEquals("Removed edge v1 should match the source index.", 1438, removed.v1());
    assertEquals("Removed edge v2 should match the destination index.", 1438, removed.v2());
    assertEquals("Removed edge peso should match the inserted negative weight.", -1, removed.peso());
    assertEquals("Vertex count should remain unchanged after edge removal.", 4052, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given: a graph with a single inserted edge
    Grafo grafo0 = new Grafo(4052);
    grafo0.insereAresta(1438, 1438, -1);

    // When: we attempt to remove a non-existing edge (different destination)
    Grafo.Aresta removed = grafo0.retiraAresta(1438, 4052);

    // Then: removal should return null indicating no such edge was present
    assertNull("retiraAresta should return null when attempting to remove a non-existent edge.", removed);
    assertEquals("Vertex count should remain unchanged after failed removal.", 4052, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given/When: construct a graph with a chosen vertex count
    final int expected = 1688;
    Grafo grafo0 = new Grafo(expected);

    // Then: number of vertices should match the constructor parameter
    assertEquals("numVertices must return the value provided to the constructor.", expected, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test8() throws Throwable {
    // Given: a graph and one inserted edge
    Grafo grafo0 = new Grafo(2084);
    grafo0.insereAresta(10, 0, -1);

    // When: we obtain the transpose of the graph
    Grafo transposed = grafo0.grafoTransposto();

    // Then: the transposed graph should be a distinct object and maintain the same number of vertices
    assertNotSame("grafoTransposto should return a new Grafo instance (not the same object).", transposed, grafo0);
    assertEquals("Transposed graph should have the same number of vertices as the original.", grafo0.numVertices(), transposed.numVertices());
  }
}