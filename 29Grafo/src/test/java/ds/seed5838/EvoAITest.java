package ds.seed5838;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests.
 */
interface UnitTest {}

/**
 * Test suite for Grafo class.
 *
 * <p>Each test references requirement REQ-GRAFO-001 for basic graph operations
 * (insert, remove, adjacency, transpose, and vertex count).</p>
 *
 * Note: Tests are written with Given-When-Then comments and provide descriptive
 * assertion messages to improve diagnosability.
 */
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-GRAFO-001
   *
   * Given a graph with one vertex
   * When an edge insertion is attempted
   * Then the number of vertices remains 1
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(1);

    // When: insert an edge (used as setup/behavioral exercise)
    grafo0.insereAresta(0, 1, 1);

    // Then: the graph should report the same number of vertices it was created with
    assertEquals("Graph should report the originally configured number of vertices (1).",
        1, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph with one vertex and an inserted edge from 0 to 1 with weight 0
   * When querying the first adjacent edge of vertex 0
   * Then the returned edge must have expected endpoints and weight
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(1);

    // When
    grafo0.insereAresta(0, 1, 0);
    Grafo.Aresta aresta = grafo0.proxAdj(0);

    // Then: single composite assertion describing all expected properties
    assertTrue("Expected non-null adjacent edge with v1=0, v2=1, peso=0 and graph vertex count 1.",
        aresta != null
            && aresta.v1() == 0
            && aresta.v2() == 1
            && aresta.peso() == 0
            && grafo0.numVertices() == 1);
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph initialized with 239 vertices
   * When requesting the first adjacency list of vertex 0
   * Then the graph should still report 239 vertices
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(239);

    // When: exercise primeiroListaAdj as part of behavior
    grafo0.primeiroListaAdj(0);

    // Then
    assertEquals("After calling primeiroListaAdj, the vertex count must remain 239.",
        239, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph with one vertex and an inserted edge from 0 to 1
   * When checking for the existence of that edge
   * Then existeAresta should return true
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(1);

    // When
    grafo0.insereAresta(0, 1, 1);
    boolean exists = grafo0.existeAresta(0, 1);

    // Then
    assertTrue("Inserted edge (0->1) should exist according to existeAresta.",
        exists);
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph with one vertex
   * When checking for a self-edge that was not inserted
   * Then existeAresta should return false
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(1);

    // When
    boolean exists = grafo0.existeAresta(0, 0);

    // Then
    assertFalse("No self-edge was inserted; existeAresta(0,0) should be false.",
        exists);
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a large graph and an inserted self-edge with negative weight
   * When removing that edge
   * Then the removed edge should be returned with correct properties
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(4052);

    // When
    grafo0.insereAresta(1438, 1438, -1);
    Grafo.Aresta removed = grafo0.retiraAresta(1438, 1438);

    // Then: composite check in a single assertion for clarity
    assertTrue("Removed edge must be non-null and have v1=1438, v2=1438, peso=-1, and graph must keep 4052 vertices.",
        removed != null
            && removed.v1() == 1438
            && removed.v2() == 1438
            && removed.peso() == -1
            && grafo0.numVertices() == 4052);
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph with an inserted self-edge
   * When attempting to remove a non-existent edge (different target)
   * Then retiraAresta should return null
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(4052);
    grafo0.insereAresta(1438, 1438, -1);

    // When
    Grafo.Aresta removed = grafo0.retiraAresta(1438, 4052);

    // Then
    assertNull("Attempting to remove a non-existent edge should return null.", removed);
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph created with 1688 vertices
   * When querying the number of vertices
   * Then the reported count should match the requested size
   */
  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(1688);

    // When
    int count = grafo0.numVertices();

    // Then
    assertEquals("Graph must report the number of vertices it was created with (1688).",
        1688, count);
  }

  /**
   * REQ-GRAFO-001
   *
   * Given a graph with an inserted edge (10->0, weight -1)
   * When obtaining the transposed graph
   * Then the transposed graph should be a distinct object and vertex counts should match
   */
  @Test(timeout = 4000)
  public void test8() throws Throwable {
    // Given
    Grafo grafo0 = new Grafo(2084);
    grafo0.insereAresta(10, 0, -1);

    // When
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then: single composite assertion asserting identity and vertex counts
    assertTrue("Transposed graph should be a different instance and both graphs should report 2084 vertices.",
        grafo1 != grafo0
            && grafo0.numVertices() == 2084
            && grafo1.numVertices() == 2084);
  }
}