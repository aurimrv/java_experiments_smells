package ds.seed5482;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Ignore;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for Grafo focusing on basic operations (insert, remove, transpose, existence).
 * Traceability: REQ-GRAFO-001, REQ-GRAFO-002
 *
 * Notes:
 * - Tests follow Given-When-Then comments to improve readability.
 * - Assertion messages have been added to aid debugging when failures occur.
 */
interface UnitTest {}
interface GraphTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category({UnitTest.class, GraphTest.class})
public class EvoAITest extends Grafo_ESTest_scaffolding {

    private static final int V_LARGE = 1058;
    private static final int V_MEDIUM = 321;
    private static final int V_SMALL = 227;
    private static final int V_ZERO = 0;
    private static final int V_BIG = 4500;

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1058);
      grafo0.insereAresta(1, (-1988), 1);
      grafo0.imprime();
      assertEquals(1058, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(321);
      grafo0.insereAresta(2500, (-91), (-1057));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(2500, 0);
      assertEquals(321, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(2500, grafo_Aresta0.v1());
  }


  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(227);
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo0.insereAresta(227, 227, 227);
      grafo1.prox = grafo0.peso;
      // Undeclared exception!
      grafo1.retiraAresta(227, 227);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(227);
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo0.insereAresta(1, 1, 1);
      grafo1.prox = grafo0.peso;
      Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(227, 1);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(1, grafo_Aresta0.v2());
      assertEquals(227, grafo_Aresta0.v1());
      assertNotNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(227);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4500);
      assertNull(grafo_Aresta0);
      assertEquals(227, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(227);
      grafo0.insereAresta(1, 1, 1);
      boolean boolean0 = grafo0.existeAresta(1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(227);
      grafo0.insereAresta(1, 1, 1);
      boolean boolean0 = grafo0.existeAresta(1, 0);
      assertFalse(boolean0);
      assertEquals(227, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(4500);
      grafo0.insereAresta(4500, 2, 4500);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(4500, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      int int0 = grafo0.numVertices();
      assertEquals(0, int0);
  }
}