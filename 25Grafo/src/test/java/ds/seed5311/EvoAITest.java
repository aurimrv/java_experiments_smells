package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests grouping.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-Graph-001: inserting an edge and printing should not alter vertex count.
   * Given: a new graph
   * When: insert a self-loop (0->0) with weight 822 and request a print
   * Then: the graph still reports the expected number of vertices and the edge exists
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 822);
      grafo0.imprime();
      assertEquals(100, grafo0.numVertices());
  }

  /**
   * REQ-Graph-002: proxAdj should return the first adjacent edge after inserting an edge.
   * Given: a new graph
   * When: insert an edge (0->0) with weight 0 and request proxAdj(0)
   * Then: the returned edge should not be null and should have the expected endpoints and weight
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(100, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
  }

  /**
   * REQ-Graph-003: primeiroListaAdj should be callable without side-effects on vertex count.
   * Given: a new graph
   * When: call primeiroListaAdj(0)
   * Then: vertex count remains as expected
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      grafo0.primeiroListaAdj(0);

      // Then
      assertEquals("Calling primeiroListaAdj should not change vertex count", 100, grafo0.numVertices());
  }

  /**
   * REQ-Graph-004: inserting an edge with a negative weight should still record the edge.
   * Given: a new graph
   * When: insert an edge (0->0) with negative weight
   * Then: existeAresta reports true and vertex count remains unchanged
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-745));
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(100, grafo0.numVertices());
  }

  /**
   * REQ-Graph-005: existeAresta should return false for non-existent edges at a valid vertex index.
   * Given: a new graph
   * When: query existeAresta for vertex 99 with itself
   * Then: the edge should not exist and vertex count is unchanged
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      boolean boolean0 = grafo0.existeAresta(99, 99);

      // Then
      assertFalse("No edge should exist for (99,99) in a freshly-created graph", boolean0);
      assertEquals("Vertex count should be 100 for a freshly-created graph", 100, grafo0.numVertices());
  }

  /**
   * REQ-Graph-006: attempting to remove a non-matching/invalid edge should return null and not affect vertex count.
   * Given: a new graph with a self-loop inserted
   * When: attempt to remove an edge using a mismatched second vertex (-40)
   * Then: removal returns null and vertex count remains unchanged
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-745));

      // When
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-40));

      // Then
      assertNull("retiraAresta with a non-matching target should return null", grafo_Aresta0);
      assertEquals("Vertex count should remain 100 after failed removal attempt", 100, grafo0.numVertices());
  }

  /**
   * REQ-Graph-007: numVertices should report the expected initial number of vertices.
   * Given: a new graph
   * When: request numVertices
   * Then: it should equal 100
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("Initial number of vertices should be 100", 100, int0);
  }

  /**
   * REQ-Graph-008: grafoTransposto should return a distinct graph with the same vertex count;
   * for a self-loop the transposed graph should also contain the self-loop.
   * Given: a new graph with a self-loop inserted
   * When: build the transposed graph
   * Then: the transposed graph is not the same instance and has the same number of vertices and the expected edge
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(100, grafo1.numVertices());
      assertNotSame(grafo1, grafo0);
  }

  /**
   * REQ-Graph-009: retiraAresta should return the removed edge with correct fields and weight.
   * Given: a new graph with a self-loop of weight 822
   * When: remove that self-loop
   * Then: the returned Aresta should match the inserted values and the graph should no longer report the edge
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 822);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull(grafo_Aresta0);
      
      int int0 = grafo_Aresta0.v2();
      assertEquals(822, grafo_Aresta0.peso());
      assertEquals(0, int0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(100, grafo0.numVertices());
  }
}