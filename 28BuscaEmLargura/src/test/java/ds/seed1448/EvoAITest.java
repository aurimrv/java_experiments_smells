package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Grafo focused on basic graph operations.
 *
 * Traceability: REQ-GRAPH-001 Basic graph creation and edge manipulation.
 *
 * NOTE: Tests were improved for readability, assertions now include messages and
 * each test follows a Given-When-Then comment structure to clarify intent.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph of size 2581, when an edge is inserted and the graph is printed,
   * then the number of vertices should remain equal to the initial size.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);
      grafo0.imprime();
      assertEquals(2581, grafo0.numVertices());
  }

  /**
   * Given a graph with a single inserted edge, when that edge is removed,
   * then retiraAresta should return the removed edge with correct endpoints and weight.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2585);
      grafo0.insereAresta(1315, 1960, 2585);

      // When
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1315, 1960);

      // Then
      assertNotNull("retiraAresta should return a non-null Aresta for an existing edge", grafo_Aresta0);
      assertEquals("Removed edge should have weight as inserted", 2585, grafo_Aresta0.peso());
      assertEquals("Graph vertex count should remain unchanged after removing an edge", 2585, grafo0.numVertices());
      assertEquals("Removed edge v2 should match the target vertex", 1960, grafo_Aresta0.v2());
      assertEquals("Removed edge v1 should match the source vertex", 1315, grafo_Aresta0.v1());
  }

  /**
   * Given a graph with two inserted edges (including a self-loop), when the transpose graph is constructed,
   * then the transposed graph should have the same number of vertices and be a distinct object.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2585);
      grafo0.insereAresta(1315, 1315, 1947);
      grafo0.insereAresta(1315, 1947, 2585);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(2585, grafo1.numVertices());
      assertNotSame(grafo1, grafo0);
  }

  /**
   * Given a graph with a single vertex, when primeiroListaAdj is called for vertex 0,
   * then the number of vertices should be 1 and the call should not throw.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1);

      // When
      grafo0.primeiroListaAdj(0);

      // Then
      assertEquals("Graph constructed with one vertex must report numVertices == 1", 1, grafo0.numVertices());
  }

  /**
   * Given a large graph with no inserted edges, when checking for a non-existing edge,
   * then existeAresta should return false and the vertex count remains the same.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2585);

      // When
      boolean boolean0 = grafo0.existeAresta(1947, 2006);

      // Then
      assertEquals("Graph vertex count must equal the constructed size", 2585, grafo0.numVertices());
      assertFalse("existeAresta should return false for an edge that was never inserted", boolean0);
  }

  /**
   * Given a graph where an edge is inserted, when attempting to remove a different non-existing edge,
   * then retiraAresta should return null and the vertex count should remain unchanged.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);

      // When
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1315, 1315);

      // Then
      assertNull("retiraAresta should return null when attempting to remove a non-existing distinct edge", grafo_Aresta0);
      assertEquals("Graph vertex count should remain as originally constructed", 2581, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with N vertices, when querying numVertices,
   * then it should return the value N.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1745);

      // When
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("numVertices should return the size used in the constructor", 1745, int0);
  }

  /**
   * Given a graph with an inserted directed edge, when the transpose is taken,
   * then the transposed graph should contain the reversed edge.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(1960, 1315);
      assertEquals(2581, grafo0.numVertices());
      assertEquals(2581, grafo1.numVertices());
      assertTrue(boolean0);
  }
}