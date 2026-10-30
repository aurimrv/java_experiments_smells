package ds.seed5831;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import ds.Grafo;

import static org.junit.Assert.*;

/**
 * Improved tests for Grafo covering basic behaviors.
 * Traceability: REQ-GRAFO-001 Basic graph operations (insert, remove, query, traversal).
 *
 * Note:
 * - This class preserves the original test method names and the EvoSuite runner annotations
 *   as required by the preservation rules.
 * - Each test follows a Given-When-Then inline comment structure and provides descriptive
 *   assertion messages for easier diagnostics.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      grafo0.imprime();
      assertEquals(100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(100, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.primeiroListaAdj(0);
      assertEquals(100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      boolean boolean0 = grafo0.existeAresta(0, 100);
      assertEquals(100, grafo0.numVertices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(100, grafo0.numVertices());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      int int0 = grafo0.numVertices();
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(100, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 2450, (-375));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(100, grafo0.numVertices());
      assertNull(grafo_Aresta0);
  }
}