package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      grafo0.imprime();
      assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(983, 1, 983);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(983, 1);
      assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
      assertEquals("v1 should be 983", 983, grafo_Aresta0.v1());
      assertEquals("v2 should be 1", 1, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals("peso should be 983", 983, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      Grafo grafo1 = grafo0.grafoTransposto();
      Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(0, 2325);
      assertNull("Expected null when removing non-existent edge", grafo_Aresta0);
      assertEquals("Number of vertices should be 1003", 1003, grafo1.numVertices());
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
        fail("Expected ArrayIndexOutOfBoundsException due to invalid vertex index");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         assertTrue("Exception message should contain '1003'", e.getMessage().contains("1003"));
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.primeiroListaAdj(0);
      assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(0, 937);
      assertEquals("Number of vertices in transposed graph should be 1003", 1003, grafo1.numVertices());
      assertTrue("Edge should exist between 0 and 937", boolean0);
      assertEquals("Number of vertices in original graph should be 1003", 1003, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1597);
      int int0 = grafo0.numVertices();
      assertEquals("Number of vertices should be 1597", 1597, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(968, 0, 968);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(0, 1003);
      assertFalse("Edge should not exist between 0 and 1003", boolean0);
      assertEquals("Number of vertices should be 1003", 1003, grafo1.numVertices());
  }
}