package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for basic Grafo behaviors (REQ-GRAFO-001).
 * These tests were improved from auto-generated cases to include
 * explicit Given-When-Then structure, descriptive assertion messages,
 * and a test category for easier selection.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-GRAFO-001: Inserting an edge and printing the graph should not change the declared number of vertices.
   * Given a graph with 2450 vertices
   * When an edge is inserted and the graph is printed
   * Then numVertices() should remain 2450
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2450);
      grafo0.insereAresta(298, 298, 298);
      grafo0.imprime();
      assertEquals(2450, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-002: Inserting an edge and then removing it should return the correct Aresta instance.
   * Given a graph with 1957 vertices
   * When an edge (0->1957) is inserted and then removed
   * Then the removed Aresta reports v1=0, v2=1957 and peso=1957
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1957);
      grafo0.insereAresta(0, 1957, 1957);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1957);
      assertEquals(0, grafo_Aresta0.v1());
      assertNotNull(grafo_Aresta0);
      assertEquals(1957, grafo_Aresta0.v2());
      assertEquals(1957, grafo_Aresta0.peso());
      assertEquals(1957, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-003: After inserting a self-loop edge, proxAdj should return that adjacency.
   * Given a graph with 2450 vertices
   * When a self-loop edge (0->0) is inserted with weight 2450 and proxAdj(0) is queried
   * Then the returned Aresta should reflect the inserted values
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2450);
      grafo0.insereAresta(0, 0, 2450);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(2450, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(2450, grafo_Aresta0.peso());
  }

  /**
   * REQ-GRAFO-004: Querying the first adjacency of a vertex on a newly constructed graph should not alter graph size.
   * Given a graph with 78 vertices
   * When primeiroListaAdj(0) is invoked
   * Then numVertices() should remain 78
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(78);
      grafo0.primeiroListaAdj(0);
      assertEquals(78, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-005: Newly constructed graph should not contain a self-edge by default.
   * Given a graph with 2450 vertices
   * When existeAresta(0,0) is queried without prior insertion
   * Then the method returns false and graph size remains 2450
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2450);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(2450, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * REQ-GRAFO-006: Inserting a self-edge with a negative weight should register as an existing edge.
   * Given a graph with 2450 vertices
   * When a self-edge with negative weight is inserted
   * Then existeAresta(0,0) should return true
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(2450);
      grafo0.insereAresta(0, 0, (-1582));
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(2450, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-007: Removing a non-existent edge should return null.
   * Given a graph with 1957 vertices and an inserted self-edge (0->0)
   * When attempting to remove edge (0->1957) which was not inserted
   * Then retiraAresta should return null and numVertices remains 1957
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1957);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1957);
      assertEquals(1957, grafo0.numVertices());
      assertNull(grafo_Aresta0);
  }

  /**
   * REQ-GRAFO-008: numVertices should reflect the constructor argument.
   * Given a graph constructed with 2450 vertices
   * When numVertices() is queried
   * Then it should return 2450
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(2450);
      int int0 = grafo0.numVertices();
      assertEquals(2450, int0);
  }

  /**
   * REQ-GRAFO-009: grafoTransposto should return a distinct graph object with the same number of vertices.
   * Given a graph with 2450 vertices and a self-edge inserted
   * When the transpose graph is created
   * Then the new graph is a separate instance and has the same number of vertices
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2450);
      grafo0.insereAresta(0, 0, (-1582));

      // When: compute transpose
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then: validate instance inequality and vertex counts
      assertEquals("Transposed graph should preserve vertex count", 2450, grafo1.numVertices());
      assertEquals("Original graph vertex count should remain unchanged", 2450, grafo0.numVertices());
      assertNotSame("Transpose should be a distinct graph instance", grafo1, grafo0);
  }
}