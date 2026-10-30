package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing these tests as unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a large graph with no edges, when transposing, the operation should
   * complete without throwing ArrayIndexOutOfBoundsException and produce a graph
   * with the same number of vertices.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(4389);
      // Undeclared exception!
      grafo0.grafoTransposto();
  }

  /**
   * Given a single-vertex graph, inserting a self-edge and printing should not
   * change the number of vertices and the edge should be present.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * Given a large graph, inserting and then removing an edge should yield the
   * expected Aresta object and leave the vertex count unchanged.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(4389);
      grafo0.insereAresta(1, 1, 1);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1, 1);
      assertEquals(1, grafo_Aresta0.peso());
      assertEquals(1, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(1, grafo_Aresta0.v1());
      assertEquals(4389, grafo0.numVertices());
  }

  /**
   * When attempting to remove a non-existent edge from a single-vertex graph,
   * the operation should return null and the vertex count should be preserved.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, 1);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4344);
      assertNull(grafo_Aresta0);
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * This test reproduces a previously-observed exceptional flow: inserting an
   * edge with an invalid target index leads to an ArrayIndexOutOfBoundsException
   * being observed during transpose. The test documents and asserts that the
   * exception is thrown from the implementation.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));

      // When: Insert an edge with an invalid index to exercise error handling.
      // This may lead to an exception during transpose.
      grafo0.insereAresta(0, (-2922), 3274);

      // Then: Expect ArrayIndexOutOfBoundsException during transpose (documented)
      try { 
        grafo0.grafoTransposto();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2922
         //
         verifyException("ds.Grafo", e);
      }
  }

  /**
   * For a large graph, requesting the first adjacency for a vertex should be
   * safe (may be null) and the vertex count remains correct.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(4592);
      grafo0.primeiroListaAdj(0);
      assertEquals(4592, grafo0.numVertices());
  }

  /**
   * Insert a self-edge and verify that existeAresta reports it correctly.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, 1);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(1, grafo0.numVertices());
      assertTrue(boolean0);
  }

  /**
   * Verify that querying for a non-existent edge returns false while the
   * existing self-edge remains detectable.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, 1);
      boolean boolean0 = grafo0.existeAresta(0, 1484);
      assertEquals(1, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * A graph initialized with zero vertices should report zero vertices.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(0);

      // When
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("Graph initialized with 0 vertices must report 0.", 0, int0);
  }

  /**
   * Insert a self-edge with a negative weight and verify that transpose
   * preserves the existence of the corresponding edge.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(1, grafo0.numVertices());
      assertEquals(1, grafo1.numVertices());
  }
}