/*
 * Improved unit tests for Grafo class.
 * Linked requirement: REQ-1234 (graph basic operations)
 *
 * Note: This file has been revised to add clarity, structure (Given-When-Then),
 * and descriptive assertion messages. Original EvoSuite-run configuration
 * (EvoRunner and EvoRunnerParameters) is preserved as required.
 */
package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with 291 vertices,
   * When an edge is inserted and the graph is printed,
   * Then the number of vertices should remain 291.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(291);

      // When: insert an edge and print (print is a side-effect; verifying it doesn't change vertex count)
      grafo0.insereAresta(0, 1, 105);
      grafo0.imprime();

      // Then
      assertEquals("After inserting an edge and printing, the graph should still have 291 vertices",
                   291, grafo0.numVertices());
  }

  /**
   * Given a graph with 2784 vertices and an inserted edge,
   * When attempting to remove a non-existing edge between 0 and 0,
   * Then retiraAresta should return null and number of vertices should remain unchanged.
   *
   * Requirement: REQ-1234
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
   * Given a graph with 2784 vertices and an inserted edge from 1224 to 2784,
   * When retrieving the next adjacency for vertex 1224,
   * Then the returned edge should reference v1=1224, v2=2784 and have the correct weight; vertex count unchanged.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(1224, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(1224);
      assertEquals(1224, grafo_Aresta0.v1());
      assertEquals(2784, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals(2784, grafo_Aresta0.peso());
      assertEquals(2784, grafo_Aresta0.v2());
  }

  /**
   * Given a graph with 2784 vertices,
   * When calling primeiroListaAdj for a vertex,
   * Then the number of vertices should remain unchanged (sanity check).
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2784);

      // When: request the first adjacency in the list for a vertex (no edges inserted)
      grafo0.primeiroListaAdj(1224);

      // Then
      assertEquals("primeiroListaAdj should not affect the number of vertices; expected 2784",
                   2784, grafo0.numVertices());
  }

  /**
   * Given a graph with 2784 vertices and an inserted edge from 1224 to 2784,
   * When checking existence of that edge,
   * Then existeAresta should return true and vertex count unchanged.
   *
   * Requirement: REQ-1234
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
   * Given a graph with 2784 vertices and an inserted edge,
   * When removing the inserted edge,
   * Then retiraAresta should return the removed edge with expected properties; vertex count unchanged.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(1224, 2784, 2784);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1224, 2784);
      assertEquals(2784, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(2784, grafo0.numVertices());
      assertEquals(1224, grafo_Aresta0.v1());
      assertEquals(2784, grafo_Aresta0.peso());
  }

  /**
   * Given a graph with 2784 vertices and an inserted edge from 0 to 2784,
   * When checking for the existence of an unrelated edge (0 -> 0),
   * Then existeAresta should return false and number of vertices remain unchanged.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(2784);
      grafo0.insereAresta(0, 2784, 2784);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertFalse(boolean0);
      assertEquals(2784, grafo0.numVertices());
  }

  /**
   * Given a graph instantiated with 473 vertices,
   * When querying number of vertices,
   * Then it should return 473.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(473);
      int int0 = grafo0.numVertices();
      assertEquals(473, int0);
  }

  /**
   * Given a graph with an inserted self-loop (1 -> 1),
   * When computing the transpose graph,
   * Then the transpose should be a distinct Grafo instance and both graphs should have the same vertex count.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(473);
      grafo0.insereAresta(1, 1, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(473, grafo0.numVertices());
      assertEquals(473, grafo1.numVertices());
  }
}