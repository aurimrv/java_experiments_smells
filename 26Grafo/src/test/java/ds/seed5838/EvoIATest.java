package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      grafo0.insereAresta(2, 3242, 2);
      grafo0.imprime();
      assertEquals("Number of vertices should be 2", 2, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(266);
      grafo0.insereAresta(721, 266, 1);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals("Edge weight should be 0", 0, grafo_Aresta0.peso());
      assertNotNull("Returned edge should not be null", grafo_Aresta0);
      assertEquals("Edge vertex v1 should be 0", 0, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1514);
      grafo0.insereAresta(1514, 1514, 1514);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1514);
      assertEquals("Edge weight should be 1514", 1514, grafo_Aresta0.peso());
      assertEquals("Edge vertex v1 should be 0", 0, grafo_Aresta0.v1());
      assertEquals("Edge vertex v2 should be 1514", 1514, grafo_Aresta0.v2());
      assertNotNull("Returned edge should not be null", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1249);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4415);
      assertNull("Expected no edge to be returned", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1694);
      grafo0.insereAresta(1463, 760, 1694);
      boolean boolean0 = grafo0.existeAresta(1463, 760);
      assertTrue("Edge should exist between vertices 1463 and 760", boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1694);
      grafo0.insereAresta(1463, 760, 1694);
      boolean boolean0 = grafo0.existeAresta(1463, 1254);
      assertFalse("Edge should not exist between vertices 1463 and 1254", boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      int[] intArray0 = new int[0];
      grafo0.cab = intArray0;
      grafo0.insereAresta(0, 0, 0);
      assertEquals("Number of vertices should be 0", 0, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      int int0 = grafo0.numVertices();
      assertEquals("Number of vertices should be 0", 0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(105);
      grafo0.insereAresta(105, 4500, 1333);
      grafo0.grafoTransposto();
      assertEquals("Number of vertices should be 105", 105, grafo0.numVertices());
  }
}