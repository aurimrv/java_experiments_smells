package ds.seed5838;

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

/**
 * Improved, human-readable tests for Grafo based on the original EvoSuite-generated cases.
 *
 * Traceability: REQ-GRAFO-01..09 (basic graph operations: construction, insert/remove edge,
 * adjacency iteration, transpose, and existence checks).
 *
 * Note: The class keeps the EvoSuite runner and parameters intact as required.
 */

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with one vertex, when inserting an edge and printing,
   * then the number of vertices should remain 1.
   *
   * REQ-GRAFO-01: graph retains correct vertex count after operations.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1, 1);
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * Given a single-vertex graph, when inserting an edge and querying the next adjacent,
   * then the returned edge must reflect the inserted values.
   *
   * REQ-GRAFO-02: adjacency iteration returns inserted edge with correct endpoints and weight.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(1, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(1, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
  }

  /**
   * Given a graph constructed with 239 vertices, when querying the first adjacency for vertex 0,
   * then the graph should still report 239 vertices.
   *
   * REQ-GRAFO-03: construction with N vertices must report correct size.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(239);
      grafo0.primeiroListaAdj(0);
      assertEquals(239, grafo0.numVertices());
  }

  /**
   * Given a single-vertex graph, when inserting a self-to-other edge and checking existence,
   * then existeAresta should reflect the insertion and vertex count remains correct.
   *
   * REQ-GRAFO-04: existeAresta must detect previously inserted edges.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1, 1);
      boolean boolean0 = grafo0.existeAresta(0, 1);
      assertTrue(boolean0);
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * Given a single-vertex graph, when checking for a non-inserted self-loop,
   * then existeAresta should return false and vertex count should remain correct.
   *
   * REQ-GRAFO-05: existeAresta returns false for absent edges.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(1, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Given a large graph, when inserting and then removing a self-edge,
   * then retiraAresta should return the same edge object with matching properties.
   *
   * REQ-GRAFO-06: retiraAresta returns the removed edge with original endpoints and weight.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(4052);
      grafo0.insereAresta(1438, 1438, (-1));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1438, 1438);
      assertEquals(4052, grafo0.numVertices());
      assertEquals(1438, grafo_Aresta0.v1());
      assertEquals(1438, grafo_Aresta0.v2());
      assertEquals((-1), grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
  }

  /**
   * Given a large graph and a previously inserted self-edge, when attempting to remove a non-existent edge,
   * then retiraAresta should return null and the graph size should be unchanged.
   *
   * REQ-GRAFO-07: retiraAresta returns null when edge is not present.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(4052);
      grafo0.insereAresta(1438, 1438, (-1));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1438, 4052);
      assertNull(grafo_Aresta0);
      assertEquals(4052, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with 1688 vertices, when querying the number of vertices,
   * then the reported count must match the constructor parameter.
   *
   * REQ-GRAFO-08: numVertices reflects construction parameter.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1688);
      int int0 = grafo0.numVertices();
      assertEquals(1688, int0);
  }

  /**
   * Given a graph with several vertices and an inserted directed edge,
   * when taking the transpose, then the transpose should be a distinct graph
   * with the same number of vertices.
   *
   * REQ-GRAFO-09: grafoTransposto produces a graph with the same size and independent object identity.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(2084);
      grafo0.insereAresta(10, 0, (-1));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(2084, grafo0.numVertices());
      assertEquals(2084, grafo1.numVertices());
  }
}