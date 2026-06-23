package ds.seed6733;

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
      grafo0.insereAresta(0, 0, 0);
      grafo0.imprime();
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      // Additional assertions to verify edge insertion
      assertTrue("Edge should exist after insertion", grafo0.existeAresta(0, 0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.primeiroListaAdj(1);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      // Additional boundary tests could be added here
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      boolean boolean0 = grafo0.existeAresta(0, 239);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue("Edge should exist after insertion", boolean0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-74));
      assertNull("Expected null when removing non-existent edge", grafo_Aresta0);
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      int int0 = grafo0.numVertices();
      assertEquals("Number of vertices should be 100", 100, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
      assertEquals("Number of vertices should be 100", 100, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 1, (-1));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals("Destination vertex should be 1", 1, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals((-1), grafo_Aresta0.peso());
  }
}