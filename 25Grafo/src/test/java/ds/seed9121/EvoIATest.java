package ds.seed9121;

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
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-6204));
      grafo0.imprime();
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals("Edge weight should be 0", 0, grafo_Aresta0.peso());
      assertEquals("Edge v2 should be 0", 0, grafo_Aresta0.v2());
      assertEquals("Edge v1 should be 0", 0, grafo_Aresta0.v1());
      assertNotNull("Edge should not be null", grafo_Aresta0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.primeiroListaAdj(0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      assertTrue("Edge should exist", boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertFalse("Edge should not exist", boolean0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-621));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull("Removed edge should not be null", grafo_Aresta0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      assertEquals("Edge v1 should be 0", 0, grafo_Aresta0.v1());
      assertEquals("Edge v2 should be 0", 0, grafo_Aresta0.v2());
      assertEquals("Edge weight should be -621", -621, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 100);
      assertNull("Removed edge should be null when edge does not exist", grafo_Aresta0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      int int0 = grafo0.numVertices();
      assertEquals("Number of vertices should be 100", 100, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-621));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      // Additional assertions could verify properties of the transposed graph.
  }
}