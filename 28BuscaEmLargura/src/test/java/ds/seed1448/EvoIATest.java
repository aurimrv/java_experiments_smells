package ds.seed1448;

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
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);
      grafo0.imprime();
      assertEquals("Number of vertices should be 2581", 2581, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2585);
      grafo0.insereAresta(1315, 1960, 2585);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1315, 1960);
      assertNotNull("Removed edge should not be null", grafo_Aresta0);
      assertEquals("Edge weight should be 2585", 2585, grafo_Aresta0.peso());
      assertEquals("Number of vertices should be 2585", 2585, grafo0.numVertices());
      assertEquals("Edge destination vertex should be 1960", 1960, grafo_Aresta0.v2());
      assertEquals("Edge source vertex should be 1315", 1315, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2585);
      grafo0.insereAresta(1315, 1315, 1947);
      grafo0.insereAresta(1315, 1947, 2585);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals("Number of vertices in transposed graph should be 2585", 2585, grafo1.numVertices());
      assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.primeiroListaAdj(0);
      assertEquals("Number of vertices should be 1", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2585);
      boolean boolean0 = grafo0.existeAresta(1947, 2006);
      assertEquals("Number of vertices should be 2585", 2585, grafo0.numVertices());
      assertFalse("Edge should not exist between 1947 and 2006", boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1315, 1315);
      assertNull("Removed edge should be null as it does not exist", grafo_Aresta0);
      assertEquals("Number of vertices should be 2581", 2581, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1745);
      int int0 = grafo0.numVertices();
      assertEquals("Number of vertices should be 1745", 1745, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(1960, 1315);
      assertEquals("Number of vertices in original graph should be 2581", 2581, grafo0.numVertices());
      assertEquals("Number of vertices in transposed graph should be 2581", 2581, grafo1.numVertices());
      assertTrue("Edge should exist from 1960 to 1315 in transposed graph", boolean0);
  }

}