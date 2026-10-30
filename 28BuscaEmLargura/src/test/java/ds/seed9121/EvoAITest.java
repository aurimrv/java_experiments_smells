package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for ds.Grafo - improved from auto-generated seeds.
 *
 * Traceability:
 * - REQ-GRAFO-001: Graph basic operations (insert/remove/exists/adjacency)
 *
 * Note: This test class preserves the original EvoSuite runner configuration
 * and the original test method names and oracles. Each test follows a
 * Given-When-Then comment structure and provides descriptive assertion messages.
 */
interface UnitTest {}

 
 
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-GRAFO-001
   * Given a newly created graph with N vertices,
   * When an edge is inserted and the graph is printed,
   * Then the number of vertices remains N.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(291);

      // When (setup + action)
      grafo0.insereAresta(0, 1, 105);
      grafo0.imprime();

      // Then
      assertEquals("Graph should still report the original number of vertices after insertion and print.",
                   291, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001
   * Given a graph with many vertices,
   * When an insertion is attempted and a removal of a non-existent edge is performed,
   * Then removal should return null and the vertex count remains unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2784);

      // When (setup + action)
      grafo0.insereAresta(0, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);

      // Then
      assertNull("Removing a non-existent edge should return null.", grafo_Aresta0);
      assertEquals("Vertex count must remain unchanged after failed removal.", 2784, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001
   * Given a graph and an inserted edge,
   * When querying the next adjacency for the source vertex,
   * Then the returned edge must reflect the inserted values.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(1224, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(1224);
      assertEquals(2784, grafo_Aresta0.peso());
      assertEquals(2784, grafo_Aresta0.v2());
      assertEquals(2784, grafo0.numVertices());
      assertEquals(1224, grafo_Aresta0.v1());
      assertNotNull(grafo_Aresta0);
  }

  /**
   * REQ-GRAFO-001
   * Given a graph,
   * When requesting the first adjacency list for a (possibly empty) vertex index,
   * Then the operation should complete without changing the vertex count.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2784);

      // When
      grafo0.primeiroListaAdj(1224);

      // Then
      assertEquals("primeiroListaAdj must not alter the number of vertices.", 2784, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001
   * Given a graph and an inserted edge,
   * When checking existence of that edge,
   * Then existeAresta should report true for the inserted edge.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2784);

      // When
      grafo0.insereAresta(1224, 2784, 2784);
      boolean boolean0 = grafo0.existeAresta(1224, 2784);

      // Then
      assertTrue("Inserted edge should exist between v1=1224 and v2=2784.", boolean0);
      assertEquals("Graph vertex count should remain unchanged after insertion.", 2784, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001
   * Given a graph with an inserted edge,
   * When that edge is removed,
   * Then the returned Aresta should match insertion values and graph size stays the same.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(1224, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1224, 2784);
      assertEquals(2784, grafo_Aresta0.peso());
      assertEquals(2784, grafo0.numVertices());
      assertEquals(1224, grafo_Aresta0.v1());
      assertNotNull(grafo_Aresta0);
      assertEquals(2784, grafo_Aresta0.v2());
  }

  /**
   * REQ-GRAFO-001
   * Given an insertion of an edge that targets a non-zero vertex,
   * When checking existence of an edge from 0 to 0,
   * Then it should correctly report that such an unrelated edge does not exist.
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
   * REQ-GRAFO-001
   * Given a graph,
   * When querying numVertices,
   * Then it should report the initialized size.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(473);

      // When
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("numVertices should report the initialized vertex count.", 473, int0);
  }

  /**
   * REQ-GRAFO-001
   * Given a graph with a self-loop,
   * When creating the transpose graph,
   * Then the transpose should have the same number of vertices and be a distinct object.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(473);
      grafo0.insereAresta(1, 1, 0);

      // When
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then
      assertEquals("Transposed graph should have the same vertex count as the original.", 473, grafo1.numVertices());
      assertEquals("Original graph vertex count should remain unchanged.", 473, grafo0.numVertices());
      assertNotSame("grafoTransposto should return a distinct graph instance, not the same reference.", grafo1, grafo0);
  }
}