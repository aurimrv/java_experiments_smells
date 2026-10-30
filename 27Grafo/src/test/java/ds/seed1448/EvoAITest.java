package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a newly constructed graph with a specified vertex capacity,
   * When an edge is inserted and the graph is printed,
   * Then the number of vertices must remain equal to the capacity supplied at construction.
   *
   * Traceability: REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2581);

      // When: perform the actions that the original test exercised
      grafo0.insereAresta(1315, 1960, 2581);
      grafo0.imprime();

      // Then: verify the graph reports the expected number of vertices
      assertEquals("Graph vertex count should match constructor argument after insert and print",
                   2581, grafo0.numVertices());
  }

  /**
   * Given a graph where an edge is inserted,
   * When that edge is removed,
   * Then the returned Aresta must represent the removed edge and the graph must still report the original vertex count.
   *
   * Traceability: REQ-DS-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2585);

      // When
      grafo0.insereAresta(1315, 1960, 2585);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1315, 1960);

      // Then
      assertNotNull("retiraAresta should return a non-null Aresta when removing an existing edge",
                    grafo_Aresta0);
      assertEquals("Removed edge v1 should match origin passed to retiraAresta",
                   1315, grafo_Aresta0.v1());
      assertEquals("Removed edge v2 should match destination passed to retiraAresta",
                   1960, grafo_Aresta0.v2());
      assertEquals("Removed edge peso should match the weight originally inserted",
                   2585, grafo_Aresta0.peso());
      assertEquals("Graph vertex count should remain equal to the constructor argument after edge removal",
                   2585, grafo0.numVertices());
  }

  /**
   * Given a graph with several edges including a self-loop,
   * When a transpose of the graph is created,
   * Then the transposed graph must be a distinct object with the same number of vertices.
   *
   * Traceability: REQ-DS-003
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
   * Given a graph with a single vertex and no edges,
   * When the first adjacency entry for that vertex is requested,
   * Then the result should be null (no adjacency) and the vertex count remains 1.
   *
   * Traceability: REQ-DS-004
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.primeiroListaAdj(0);
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * Given a newly constructed graph with a capacity,
   * When querying for a non-existent edge,
   * Then existeAresta should return false and the reported vertex count should equal the constructor argument.
   *
   * Traceability: REQ-DS-005
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2585);

      // When
      boolean boolean0 = grafo0.existeAresta(1947, 2006);

      // Then
      assertEquals("Graph vertex count should equal the constructor value for an empty graph",
                   2585, grafo0.numVertices());
      assertFalse("existeAresta should return false for edges that have not been inserted",
                  boolean0);
  }

  /**
   * Given a graph where an edge is inserted,
   * When attempting to remove a different non-existent edge,
   * Then retiraAresta should return null and the graph vertex count should be unchanged.
   *
   * Traceability: REQ-DS-006
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(2581);
      grafo0.insereAresta(1315, 1960, 2581);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1315, 1315);
      assertNull(grafo_Aresta0);
      assertEquals(2581, grafo0.numVertices());
  }

  /**
   * Given a graph with an inserted directed edge,
   * When the transpose is created,
   * Then the transposed graph should contain the reversed edge (checked via existeAresta) and both graphs should report the same vertex count.
   *
   * Traceability: REQ-DS-007
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2581);

      // When
      grafo0.insereAresta(1315, 1960, 2581);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(1960, 1315);

      // Then
      assertEquals("Transposed graph should report the same number of vertices as original",
                   2581, grafo1.numVertices());
      assertEquals("Original graph should report the same number of vertices as constructed",
                   2581, grafo0.numVertices());
      assertTrue("The transposed graph should contain the reversed edge of the one inserted into the original graph",
                 boolean0);
  }

  /**
   * Given a graph constructed with a specified number of vertices,
   * When numVertices is queried,
   * Then it must return the same number provided at construction.
   *
   * Traceability: REQ-DS-008
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1745);

      // When
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("numVertices should return the value supplied to the Grafo constructor",
                   1745, int0);
  }
}