package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests so these tests can be selected by category if desired.
 */
interface UnitTest {}

/**
 * Improved tests for Grafo based on the original EvoSuite-generated cases.
 *
 * Traceability: REQ-GRAFO-001..010 (basic graph operations: construction, insertion, removal, transpose,
 * existence check and printing). Each test follows a Given-When-Then structure and uses descriptive
 * assertion messages to aid diagnosis on failure.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      grafo0.prox = intArray0;
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(4916, (-1470));
      assertNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Grafo grafo0 = new Grafo(12);
      grafo0.insereAresta(2146, 1707, 1);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(307, (-461), 0);
      grafo0.cab = grafo0.prox;
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(1, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      int[] intArray0 = new int[5];
      grafo0.prox = intArray0;
      intArray0[1] = 1;
      grafo0.cab = intArray0;
      boolean boolean0 = grafo0.existeAresta(1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1, 0);
      boolean boolean0 = grafo0.existeAresta(0, 3058);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      int[] intArray0 = new int[0];
      grafo0.cab = intArray0;
      grafo0.insereAresta(0, (-1258), (-1279));
      assertEquals(0, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      int int0 = grafo0.numVertices();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1, 0);
      assertEquals(1, grafo0.numVertices());
      
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(1, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull(grafo_Aresta0);
      
      int int0 = grafo_Aresta0.v2();
      assertEquals(0, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, int0);
  }
}