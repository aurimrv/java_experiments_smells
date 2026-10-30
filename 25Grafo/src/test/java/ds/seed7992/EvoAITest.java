package ds.seed7992;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;

/**
 * Unit tests for Grafo focusing on basic adjacency operations and invariants.
 * Requirement traceability: REQ-DS-001 (basic graph operations)
 *
 * These tests are structured with explicit Given/When/Then comments and descriptive
 * assertion messages. They are annotated with a UnitTest category for selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a fresh Grafo instance
    Grafo grafo0 = new Grafo();

    // When: insert an edge and request a textual print of the graph
    // (imprime() is used as an observational side-effect; it must not change vertex count)
    grafo0.insereAresta(0, 1, 0);
    grafo0.imprime();

    // Then: the number of vertices remains the expected default
    assertEquals("Unexpected number of vertices after inserting an edge and printing the graph", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-3016));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals((-3016), grafo_Aresta0.peso());
      assertEquals(100, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-3016));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(100, grafo0.numVertices());
      assertEquals((-3016), grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.primeiroListaAdj(0);
      assertEquals(100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      boolean boolean0 = grafo0.existeAresta(0, 1);
      assertEquals(100, grafo0.numVertices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-3016));
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(100, grafo0.numVertices());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a fresh Grafo with a known inserted self-loop
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, (-3016));

    // When: attempt to remove a non-existent edge (0->826)
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 826);

    // Then: the removal should yield null (edge not present) and vertex count unchanged
    assertEquals("Unexpected number of vertices after attempting to remove a non-existent edge", 100, grafo0.numVertices());
    assertNull("retiraAresta should return null when no matching edge exists", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: a newly created Grafo

    // When: obtain the number of vertices
    Grafo grafo0 = new Grafo();
    int int0 = grafo0.numVertices();

    // Then: it must match the expected default
    assertEquals("Default graph should initialize with the expected number of vertices", 100, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(100, grafo0.numVertices());
  }
}