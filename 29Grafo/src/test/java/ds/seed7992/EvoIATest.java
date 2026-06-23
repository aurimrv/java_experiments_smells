package ds.seed7992;

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
      Grafo grafo0 = new Grafo(6671);
      grafo0.insereAresta(0, 0, 6671);
      grafo0.imprime();
      assertEquals("Number of vertices should be 6671", 6671, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1371);
      grafo0.insereAresta(0, 0, (-819));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertNotNull("Aresta should not be null", grafo_Aresta0);
      assertEquals("v1 should be 0", 0, grafo_Aresta0.v1());
      assertEquals("v2 should be 0", 0, grafo_Aresta0.v2());
      assertEquals("peso should be -819", -819, grafo_Aresta0.peso());
      assertEquals("Number of vertices should be 1371", 1371, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.primeiroListaAdj(1);
      assertEquals("Number of vertices should be 313", 313, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals("Number of vertices should be 313", 313, grafo0.numVertices());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      boolean boolean0 = grafo0.existeAresta(1, 0);
      assertFalse(boolean0);
      assertEquals("Number of vertices should be 313", 313, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull("Removed edge should not be null", grafo_Aresta0);
      assertEquals("v1 should be 0", 0, grafo_Aresta0.v1());
      assertEquals("v2 should be 0", 0, grafo_Aresta0.v2());
      assertEquals("peso should be -6647", -6647, grafo_Aresta0.peso());
      assertEquals("Number of vertices should be 313", 313, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1);
      assertNull("Removed edge should be null for non-existing edge", grafo_Aresta0);
      assertEquals("Number of vertices should be 313", 313, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(673);
      int int0 = grafo0.numVertices();
      assertEquals("Number of vertices should be 673", 673, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals("Original graph vertices should be 313", 313, grafo0.numVertices());
      assertEquals("Transposed graph vertices should be 313", 313, grafo1.numVertices());
      assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
  }
}