package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface to allow categorization of tests (unit-level).
 * Defined at package level so it can be referenced by @Category on the test class.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo with clearer structure, messages, and categorization.
 *
 * Note: This class preserves the original test method names and the EvoRunner configuration
 * in order to satisfy the test infrastructure requirements.
 *
 * Requirement trace: REQ-GRAPH-001
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with 652 vertices,
   * When an edge (0->0 with weight 0) is inserted and the graph is printed,
   * Then the graph still reports the configured number of vertices.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      grafo0.imprime();
      assertEquals(652, grafo0.numVertices());
  }

  /**
   * Given a graph with one inserted edge,
   * When the inserted edge is removed,
   * Then the returned edge object must reflect the removed edge properties and the graph size remains unchanged.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(652, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v1());
  }

  /**
   * Given a graph with one inserted edge,
   * When proxAdj is used to obtain an adjacent edge for vertex 0,
   * Then the returned adjacency object should describe the inserted edge.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(652, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
      assertNotNull(grafo_Aresta0);
  }

  /**
   * Given a graph initialized with 652 vertices,
   * When primeiroListaAdj is called with an index within the vertex array bounds,
   * Then the graph should continue to report the configured number of vertices.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.primeiroListaAdj(628);
      assertEquals(652, grafo0.numVertices());
  }

  /**
   * Given a graph with 4663 vertices,
   * When checking for a non-existent edge,
   * Then existeAresta should return false and numVertices should report the configured size.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(4663);
      boolean boolean0 = grafo0.existeAresta(189, 4663);
      assertEquals(4663, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Given a graph with a self-loop inserted,
   * When existeAresta is queried for that edge,
   * Then it should return true and numVertices should remain correct.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(652, grafo0.numVertices());
  }

  /**
   * Given a graph with an edge inserted to vertex 0,
   * When attempting to remove a different (non-existent) edge,
   * Then retiraAresta should return null and numVertices should remain unchanged.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 628);
      assertNull(grafo_Aresta0);
      assertEquals(652, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with 4663 vertices,
   * When numVertices is called,
   * Then it should return the configured number of vertices.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(4663);
      int int0 = grafo0.numVertices();
      assertEquals(4663, int0);
  }

  /**
   * Given a graph with a self-loop inserted,
   * When generating the transposed graph,
   * Then the transposed graph should be a distinct object and should preserve the number of vertices.
   *
   * Requirement: REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(639);
      grafo0.insereAresta(0, 0, 0);

      // When
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then
      assertNotSame("grafoTransposto should return a distinct Grafo instance", grafo1, grafo0);
      assertEquals("Transposed graph should preserve the number of vertices", 639, grafo1.numVertices());
  }
}