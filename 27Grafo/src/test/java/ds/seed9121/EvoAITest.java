package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Grafo behavior.
 *
 * Traceability: REQ-GRAFO-001 (basic graph construction and edge operations)
 *
 * Notes:
 * - Tests were improved with Given-When-Then comments and descriptive assertion messages.
 * - The set of observable SUT interactions in each test has been preserved (no new SUT call scenarios were introduced).
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with 291 vertices,
   * When an edge from 0 to 1 with weight 105 is inserted and the graph is printed,
   * Then the number of vertices must remain 291.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(291);

      // Act
      grafo0.insereAresta(0, 1, 105);
      grafo0.imprime();

      // Assert
      assertEquals("Expected the number of vertices to remain 291 after inserting an edge and printing the graph", 291, grafo0.numVertices());
  }

  /**
   * Given a graph with 2784 vertices and an inserted edge (0,2784),
   * When attempting to remove a non-existent edge (0,0),
   * Then the removal must return null and the vertex count must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(0, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNull(grafo_Aresta0);
      assertEquals(2784, grafo0.numVertices());
  }

  /**
   * Given a graph with 2784 vertices,
   * When inserting an edge from 1224 to 2784 and retrieving the first adjacent element,
   * Then the adjacency must be present and match the inserted edge properties.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(1224, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(1224);
      assertNotNull(grafo_Aresta0);
      assertEquals(2784, grafo_Aresta0.v2());
      assertEquals(2784, grafo0.numVertices());
      assertEquals(2784, grafo_Aresta0.peso());
      assertEquals(1224, grafo_Aresta0.v1());
  }

  /**
   * Given a graph with 2784 vertices,
   * When requesting the first adjacency for vertex 1224,
   * Then the graph must still report the correct number of vertices.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(2784);

      // Act
      grafo0.primeiroListaAdj(1224);

      // Assert
      assertEquals("Vertex count should remain 2784 after calling primeiroListaAdj", 2784, grafo0.numVertices());
  }

  /**
   * Given a graph with 2784 vertices,
   * When inserting an edge (1224,2784),
   * Then existeAresta must report the edge exists and the vertex count remains 2784.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(1224, 2784, 2784);
      boolean boolean0 = grafo0.existeAresta(1224, 2784);
      assertTrue(boolean0);
      assertEquals(2784, grafo0.numVertices());
  }

  /**
   * Given a graph with 2784 vertices and an inserted edge (1224,2784),
   * When removing that edge,
   * Then the returned edge object must reflect the inserted edge's properties and the vertex count remain unchanged.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(2784);

      // Act
      grafo0.insereAresta(1224, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1224, 2784);

      // Assert
      assertNotNull("retiraAresta should return the removed edge object for (1224,2784)", grafo_Aresta0);
      assertEquals("Removed edge should have destination vertex 2784", 2784, grafo_Aresta0.v2());
      assertEquals("Removed edge should have source vertex 1224", 1224, grafo_Aresta0.v1());
      assertEquals("Vertex count should remain 2784 after removing an edge", 2784, grafo0.numVertices());
      assertEquals("Removed edge should have weight 2784", 2784, grafo_Aresta0.peso());
  }

  /**
   * Given a graph with 2784 vertices and an inserted edge (0,2784),
   * When checking for existence of edge (0,0),
   * Then existeAresta should return false and the number of vertices must remain 2784.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(0, 2784, 2784);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(2784, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Given a graph constructed with 473 vertices,
   * When retrieving the number of vertices,
   * Then it must be 473.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Arrange & Act
      Grafo grafo0 = new Grafo(473);
      int int0 = grafo0.numVertices();

      // Assert
      assertEquals("Graph constructed with 473 vertices must report 473", 473, int0);
  }

  /**
   * Given a graph with 473 vertices and a self-loop inserted at vertex 1,
   * When creating the transposed graph,
   * Then both graphs must have the same vertex count and the transposed graph must be a distinct object.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(473);

      // Act
      grafo0.insereAresta(1, 1, 0);
      Grafo grafo1 = grafo0.grafoTransposto();

      // Assert
      assertEquals("Original graph vertex count should remain 473", 473, grafo0.numVertices());
      assertEquals("Transposed graph should report 473 vertices as well", 473, grafo1.numVertices());
      assertNotSame("grafoTransposto should return a different instance than the original graph", grafo1, grafo0);
  }
}