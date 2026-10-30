package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Grafo (REQ-GRAFO-001).
 *
 * These tests exercise basic graph creation and operations: insertion, transpose,
 * removal, queries and boundary checks for number of vertices. Tests follow a
 * Given-When-Then structure in their implementations and include descriptive
 * assertion messages for easier diagnosis.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      grafo0.imprime();
      assertEquals(1003, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a graph and an inserted edge
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(983, 1, 983);

      // When: the inserted edge is removed
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(983, 1);

      // Then: the removed edge should be the one inserted and graph metadata preserved
      assertNotNull("Removed edge should not be null for an existing edge", grafo_Aresta0);
      assertEquals("Removed edge should have v1 == 983", 983, grafo_Aresta0.v1());
      assertEquals("Removed edge should have v2 == 1", 1, grafo_Aresta0.v2());
      assertEquals("Removed edge should preserve the weight/peso == 983", 983, grafo_Aresta0.peso());
      assertEquals("Graph should still report 1003 vertices after edge removal", 1003, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      Grafo grafo1 = grafo0.grafoTransposto();
      Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(0, 2325);
      assertNull(grafo_Aresta0);
      assertEquals(1003, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(968, 0, 968);
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo1.insereAresta(0, 1003, 968);
      // Undeclared exception!
      try { 
        grafo1.grafoTransposto();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1003
         //
         verifyException("ds.Grafo", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.primeiroListaAdj(0);
      assertEquals(1003, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(0, 937);
      assertEquals(1003, grafo1.numVertices());
      assertEquals(1003, grafo0.numVertices());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1597);
      int int0 = grafo0.numVertices();
      assertEquals(1597, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(968, 0, 968);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(0, 1003);
      assertFalse(boolean0);
      assertEquals(1003, grafo1.numVertices());
  }
}