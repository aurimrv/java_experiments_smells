package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with a large number of vertices,
   * when inserting an edge and printing the graph,
   * then the number of vertices should remain as constructed.
   * Related to requirement: REQ-GRAPH-001 (basic construction invariants).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 1377, 0);
      grafo0.imprime();
      assertEquals(1345, grafo0.numVertices());
  }

  /**
   * Given a graph, when inserting then removing a specific edge,
   * then the returned Aresta should expose expected endpoints and weight.
   * Related to requirement: REQ-GRAPH-002 (insert/remove edge behavior).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 1345, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1345);
      assertEquals(1345, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(1345, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
  }

  /**
   * Given a graph, when requesting the first adjacency for a vertex,
   * then the graph size should remain unchanged.
   * Related to requirement: REQ-GRAPH-003 (adjacency access does not mutate graph size).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1349);
      grafo0.primeiroListaAdj(0);
      assertEquals(1349, grafo0.numVertices());
  }

  /**
   * Given a graph, when checking existence of a non-inserted edge,
   * then the result should be false and graph size should remain unchanged.
   * Related to requirement: REQ-GRAPH-004 (edge existence query).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      boolean boolean0 = grafo0.existeAresta(1, 1348);
      assertEquals(1345, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Given a graph, when inserting a self-loop,
   * then existeAresta should report it and the graph size should be unchanged.
   * Related to requirement: REQ-GRAPH-005 (self-loop handling).
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(1345, grafo0.numVertices());
  }

  /**
   * Given a graph with an inserted self-loop, when attempting to remove a different edge,
   * then retiraAresta should return null and the graph size should remain unchanged.
   * Related to requirement: REQ-GRAPH-006 (remove non-existent edge).
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1345);
      assertNull(grafo_Aresta0);
      assertEquals(1345, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with N vertices,
   * when querying numVertices immediately after construction,
   * then it should return the provided size.
   * Related to requirement: REQ-GRAPH-001 (constructor invariant).
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(628);
      int int0 = grafo0.numVertices();
      assertEquals(628, int0);
  }

  /**
   * Given a graph with at least one edge, when transposing the graph,
   * then a new graph instance should be returned with the same number of vertices.
   * Related to requirement: REQ-GRAPH-007 (transpose correctness).
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(1345, grafo1.numVertices());
  }

  /**
   * Given a graph where an edge with negative indices/weights is inserted,
   * when fetching the next adjacency, then the returned Aresta should reflect the inserted values.
   * Related to requirement: REQ-GRAPH-008 (support for negative weights/indices if allowed).
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(1072);
      grafo0.insereAresta(0, (-1103), (-1103));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertNotNull(grafo_Aresta0);
      
      int int0 = grafo_Aresta0.v2();
      assertEquals(1072, grafo0.numVertices());
      assertEquals((-1103), grafo_Aresta0.peso());
      assertEquals((-1103), int0);
      assertEquals(0, grafo_Aresta0.v1());
  }
}