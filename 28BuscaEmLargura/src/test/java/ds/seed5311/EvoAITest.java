package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Grafo focusing on core behaviors.
 * Traceability: REQ-GRAPH-CORE
 *
 * Note: This class preserves the original test methods and their oracles.
 * Each test has been improved with Given-When-Then structure, clearer messages,
 * and light additional checks where safe to improve diagnosability.
 */
interface UnitTest {}

  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  private static final int V_652 = 652;
  private static final int V_4663 = 4663;
  private static final int V_639 = 639;

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      grafo0.imprime();
      assertEquals(652, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull(grafo_Aresta0);
      assertEquals(652, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(652, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.primeiroListaAdj(628);
      assertEquals(652, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(4663);
      boolean boolean0 = grafo0.existeAresta(189, 4663);
      assertEquals(4663, grafo0.numVertices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(652, grafo0.numVertices());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(652);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 628);
      assertEquals(652, grafo0.numVertices());
      assertNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(4663);
      int int0 = grafo0.numVertices();
      assertEquals(4663, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(639);
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(639, grafo1.numVertices());
      assertNotSame(grafo1, grafo0);
  }
}