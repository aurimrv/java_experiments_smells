package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 * Defined at package scope as required by JUnit Category usage.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a fresh graph and a planned edge insertion
    final int v1 = 0;
    final int v2 = 483;
    final int weight = 483;
    Grafo grafo0 = new Grafo();

    // When: the edge is inserted
    grafo0.insereAresta(v1, v2, weight);

    // Then: the graph should still report the expected number of vertices
    assertEquals("After inserting an edge, expected 100 vertices.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a graph with repeated insertion on the same pair (to exercise idempotency/overwrite)
    final int from = 1;
    final int to = 1;
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(from, to, 1);
    grafo0.insereAresta(from, to, 81);

    // When: we compute the transpose of the graph
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then: the transpose should be a distinct object and preserve expected vertex count
    assertEquals("Transpose graph should have 100 vertices.", 100, grafo1.numVertices());
    assertNotSame("grafoTransposto should return a different instance than the original graph.", grafo1, grafo0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a fresh graph
    final int vertex = 1;
    Grafo grafo0 = new Grafo();

    // When: we query the first adjacent element for a vertex (behavior documented by API)
    grafo0.primeiroListaAdj(vertex);

    // Then: the basic graph invariant (vertex count) should hold
    assertEquals("Calling primeiroListaAdj must not change vertex count; expected 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a graph and an insertion with a negative weight (exercise non-positive weight handling)
    final int v = 1;
    final int w = -1646;
    Grafo grafo0 = new Grafo();

    // When: insert an edge with a negative weight
    grafo0.insereAresta(v, v, w);

    // Then: the edge should be visible via existeAresta and vertex count unchanged
    boolean boolean0 = grafo0.existeAresta(v, v);
    assertTrue("Edge inserted with negative weight should exist according to existeAresta.", boolean0);
    assertEquals("Vertex count should remain 100 after insertion.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a graph with an inserted edge and an attempt to remove a non-existing neighbor
    final int from = 1;
    final int toInserted = 1;
    final int toRemove = 55;
    Grafo grafo0 = new Grafo();

    // When: insert one edge and attempt to remove a different, absent edge
    grafo0.insereAresta(from, toInserted, 1);
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(from, toRemove);

    // Then: removing a non-existent edge should return null and vertices remain unchanged
    assertNull("retiraAresta should return null when attempting to remove a non-existent edge.", grafo_Aresta0);
    assertEquals("Vertex count should remain 100 after failed removal attempt.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a newly constructed graph
    Grafo grafo0 = new Grafo();

    // When: retrieving the number of vertices
    int int0 = grafo0.numVertices();

    // Then: the default size should be the expected constant
    assertEquals("New graph should initialize with 100 vertices.", 100, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertFalse(boolean0);
      assertEquals(100, grafo0.numVertices());
  }
}