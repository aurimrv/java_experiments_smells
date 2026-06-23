package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1934, (-1016));
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
      // TODO: Add test for invalid edge insertion or exception handling
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      Grafo grafo0 = new Grafo(894);
      grafo0.insereAresta(4605, 894, 254);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(4151, 0);
      assertNotNull("Removed edge should not be null", grafo_Aresta0);
      assertEquals("Edge weight should be 0", 0, grafo_Aresta0.peso());
      assertEquals("Edge v1 should be 4151", 4151, grafo_Aresta0.v1());
      assertEquals("Edge v2 should be 0", 0, grafo_Aresta0.v2());
      // TODO: Add test for invalid edge removal or exception
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      Grafo grafo0 = new Grafo(4154);
      grafo0.insereAresta(4450, 4450, 4450);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4450);
      assertNotNull("Removed edge should not be null", grafo_Aresta0);
      assertEquals("Edge v1 should be 0", 0, grafo_Aresta0.v1());
      assertEquals("Edge weight should be 4450", 4450, grafo_Aresta0.peso());
      assertEquals("Edge v2 should be 4450", 4450, grafo_Aresta0.v2());
      // TODO: Add test for invalid edge removal or exception
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(0, 0, 0);
      grafo0.insereAresta(0, 360, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNull("Removed edge should be null", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
      Grafo grafo0 = new Grafo(894);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(894, grafo1.numVertices());
      // TODO: Add test for transposed graph with invalid state or empty graph
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(0, 0, 0);
      grafo0.insereAresta(0, 360, 0);
      boolean boolean0 = grafo0.existeAresta(0, 360);
      assertTrue("Edge should exist", boolean0);
      // TODO: Add test for non-existing edge or invalid input
  }

  @Test(timeout = 4000)
  public void test6() throws Throwable {
      Grafo grafo0 = new Grafo(894);
      grafo0.insereAresta(894, 894, (-1193));
      boolean boolean0 = grafo0.existeAresta(0, 4);
      assertFalse("Edge should not exist", boolean0);
      // TODO: Add test for invalid vertex indices or exception
  }

  @Test(timeout = 4000)
  public void test7() throws Throwable {
      Grafo grafo0 = new Grafo(1);
      int[] intArray0 = new int[1];
      grafo0.cab = intArray0;
      grafo0.insereAresta(1, 1, 1);
      assertEquals(1, grafo0.numVertices());
      // TODO: Add test for invalid array modification or exception
  }

  @Test(timeout = 4000)
  public void test8() throws Throwable {
      Grafo grafo0 = new Grafo(433);
      int int0 = grafo0.numVertices();
      assertEquals(433, int0);
      // TODO: Add test for invalid graph or exception
  }

  @Test(timeout = 4000)
  public void test9() throws Throwable {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1934, (-1016));
      grafo0.grafoTransposto();
      assertEquals(1, grafo0.numVertices());
      // TODO: Add test for invalid transpose or exception
  }
}