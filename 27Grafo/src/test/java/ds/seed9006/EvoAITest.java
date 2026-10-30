package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and documented test class for Grafo.
 *
 * Traceability: REQ-GRAFO-001 Basic graph operations (create, insert, remove, transpose, adjacency).
 *
 * NOTE: This class preserves the EvoSuite runner configuration (required by test generation environment).
 */
 
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with N vertices,
   * When inserting an edge and printing the graph,
   * Then the number of vertices should remain equal to N.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);
      grafo0.insereAresta(0, 2016, 0);
      grafo0.imprime();
      assertEquals(240, grafo0.numVertices());
  }

  /**
   * Given a graph and a self-loop edge inserted with a negative weight,
   * When removing that edge,
   * Then the returned edge instance should reflect the inserted values.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-449));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals((-449), grafo_Aresta0.peso());
      assertEquals(1165, grafo0.numVertices());
  }

  /**
   * Given a graph with one inserted adjacency,
   * When requesting the next adjacency for a vertex,
   * Then the returned adjacency should reflect the inserted edge.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-435));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertNotNull(grafo_Aresta0);
      assertEquals(1165, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals((-435), grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
  }

  /**
   * Given a freshly created graph,
   * When requesting the first adjacency list for a vertex that has no edges,
   * Then the number of vertices remains as initialized (sanity check).
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.primeiroListaAdj(0);
      assertEquals(1165, grafo0.numVertices());
  }

  /**
   * Given a graph with no edges,
   * When checking existence of a self-loop,
   * Then the result should be false.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(240, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Given a graph where a self-loop is inserted,
   * When checking existence of that edge,
   * Then existeAresta should report true.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(240, grafo0.numVertices());
      assertTrue(boolean0);
  }

  /**
   * Given a graph with an existing self-loop,
   * When attempting to remove a non-existent adjacent edge,
   * Then retiraAresta should return null and the graph size remain unchanged.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-449));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 41);
      assertNull(grafo_Aresta0);
      assertEquals(1165, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with a specified number of vertices,
   * When querying numVertices,
   * Then it should return the exact number used during construction.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(212);
      int int0 = grafo0.numVertices();
      assertEquals(212, int0);
  }

  /**
   * Given a graph with a self-loop,
   * When obtaining the transposed graph,
   * Then the transposed graph should be a distinct object with the same number of vertices.
   *
   * Traceability: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-449));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(1165, grafo0.numVertices());
      assertNotSame(grafo1, grafo0);
      assertEquals(1165, grafo1.numVertices());
  }
}