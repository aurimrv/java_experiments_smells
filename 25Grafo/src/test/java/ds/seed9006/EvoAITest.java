package ds.seed9006;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;

/**
 * Unit tests for Grafo (REQ-001: Basic graph operations).
 *
 * These tests were adapted for readability and maintainability:
 * - Added Given-When-Then comments to clarify intent.
 * - Added assertion messages for clearer failure diagnostics.
 * - Grouped tests under a UnitTest category for traceability.
 *
 * Note: Tests preserve original assertions and expected values (oracle preservation).
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: an edge is inserted and the graph is printed (imprime has no observable return)
    grafo0.insereAresta(0, 0, 0);
    grafo0.imprime();

    // Then: vertex count remains the expected default value
    assertEquals("After inserting an edge and printing, numVertices should remain 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert an edge to a (possibly invalid) vertex and attempt to remove a different edge
    grafo0.insereAresta(0, (-709), 0);
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);

    // Then: removing the different edge yields null and vertex count remains unchanged
    assertNull("retiraAresta should return null when the specified edge does not exist", grafo_Aresta0);
    assertEquals("Vertex count should remain 100 after attempted remove of non-existing edge", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert a self-loop edge and retrieve the first adjacent edge
    grafo0.insereAresta(0, 0, 0);
    Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);

    // Then: adjacency should be present and its properties must match the inserted values
    assertNotNull("proxAdj should return a non-null edge after insertion", grafo_Aresta0);
    assertEquals("Returned edge v1 should be 0", 0, grafo_Aresta0.v1());
    assertEquals("Returned edge v2 should be 0", 0, grafo_Aresta0.v2());
    assertEquals("Graph should have 100 vertices by default", 100, grafo0.numVertices());
    assertEquals("Inserted edge weight should be 0", 0, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: request the first element of adjacency list for vertex 1
    grafo0.primeiroListaAdj(1);

    // Then: vertex count remains as the default (sanity check)
    assertEquals("After calling primeiroListaAdj, vertex count should remain 100", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert an edge and then remove it
    grafo0.insereAresta(0, 0, 0);
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);

    // Then: retiraAresta should return the removed edge with matching properties and vertex count stays default
    assertNotNull("retiraAresta should return the removed edge when it exists", grafo_Aresta0);
    assertEquals("Vertex count should remain 100 after removing an edge", 100, grafo0.numVertices());
    assertEquals("Removed edge v1 should be 0", 0, grafo_Aresta0.v1());
    assertEquals("Removed edge v2 should be 0", 0, grafo_Aresta0.v2());
    assertEquals("Removed edge weight should be 0", 0, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert an edge with negative weight and check existence of a different edge index
    grafo0.insereAresta(0, 0, (-1));
    boolean boolean0 = grafo0.existeAresta(0, 4732);

    // Then: the non-inserted edge should not exist and vertex count remains default
    assertEquals("Vertex count should remain 100 after insertion with negative weight", 100, grafo0.numVertices());
    assertFalse("existeAresta should return false for a non-inserted target vertex", boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: query number of vertices
    int int0 = grafo0.numVertices();

    // Then: default number of vertices must be 100
    assertEquals("Default graph should have 100 vertices", 100, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-1));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(100, grafo1.numVertices());
  }
}