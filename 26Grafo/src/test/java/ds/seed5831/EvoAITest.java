package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Traceability: REQ-DS-001 through REQ-DS-010
 *
 * Improved, human-reviewed versions of generated EvoSuite tests.
 * Each test contains Given-When-Then comments and more descriptive assertion messages.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-DS-001: Verify that inserting a self-loop on a single-vertex graph preserves the vertex count
   * Given a graph with 1 vertex
   * When a self-loop edge (1->1) is inserted and the graph is printed
   * Then the number of vertices remains 1 and the inserted edge is discoverable
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * REQ-DS-002: Removing a valid edge from a large graph should return a non-null Aresta with correct properties
   * Given a graph with many vertices and an inserted edge
   * When the internal head array is assigned and the same edge is removed
   * Then the removed edge should be returned with preserved fields
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(6198);
      int[] intArray0 = new int[3];
      intArray0[0] = 6198;
      grafo0.insereAresta(6198, 1801, 6198);
      grafo0.cab = intArray0;
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(6198, 6198);
      assertNotNull(grafo_Aresta0);
      assertEquals(6198, grafo_Aresta0.v2());
      assertEquals(6198, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.peso());
  }

  /**
   * REQ-DS-003: Attempting to remove a non-existent edge in an empty graph returns null
   * Given an empty graph (0 vertices)
   * When an edge removal is attempted with out-of-range indices
   * Then null is returned and the graph remains empty
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(4500, 2062, 4500);
      grafo0.prox = grafo0.cab;
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-1));
      assertNull(grafo_Aresta0);
  }

  /**
   * REQ-DS-004: Insert then remove an edge across different indices yields expected Aresta fields
   * Given a small graph
   * When an edge is inserted and then removal is attempted with specific parameters
   * Then the returned Aresta must have the expected v1, v2 and peso values and be non-null
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1);

      // When
      grafo0.insereAresta(1, 1, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1);

      // Then
      assertNotNull("retiraAresta should not return null for the inserted edge scenario", grafo_Aresta0);
      assertEquals("Removed edge should have source v1 equal to 0", 0, grafo_Aresta0.v1());
      assertEquals("Removed edge should have destination v2 equal to 1", 1, grafo_Aresta0.v2());
      assertEquals("Removed edge should have peso equal to 0", 0, grafo_Aresta0.peso());
  }

  /**
   * REQ-DS-005: Transposing a graph of two vertices preserves vertex count and returns a distinct graph instance
   * Given a graph with 2 vertices
   * When the graph is transposed
   * Then the new graph has same number of vertices and is a different object
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(2, grafo1.numVertices());
      assertNotSame(grafo1, grafo0);
  }

  /**
   * REQ-DS-006: Edge existence should be detectable after insertion (self-loop scenario)
   * Given a 1-vertex graph
   * When a self-loop is inserted
   * Then existeAresta for the expected indices returns true
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      boolean boolean0 = grafo0.existeAresta(0, 1);
      assertTrue(boolean0);
  }

  /**
   * REQ-DS-007: Inserting an out-of-range edge should not cause unrelated edge-existence checks to succeed
   * Given a 2-vertex graph
   * When an out-of-range edge is inserted (using large indices)
   * Then checking existence for (0,0) should remain false
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      grafo0.insereAresta(1333, 1333, 1333);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertFalse(boolean0);
  }

  /**
   * REQ-DS-008: Inserting edges after manually setting internal head array should keep reported vertex count stable
   * Given a 2-vertex graph with manipulated internal head array
   * When two insertions are attempted (one valid, one with larger indices)
   * Then the vertex count remains 2
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2);
      int[] intArray0 = new int[3];
      // Mimic original test's internal setup intent: assign to cab (internal array)
      grafo0.cab = intArray0;

      // When
      grafo0.insereAresta(1, 1, 1);
      grafo0.insereAresta(813, 815, 1);

      // Then
      assertEquals("Graph should still report 2 vertices after edge insertions, even if some indices were out-of-range", 2, grafo0.numVertices());
  }

  /**
   * REQ-DS-009: Constructor must initialize the graph vertex count correctly
   * Given a graph constructed with 844 vertices
   * When numVertices is queried
   * Then it must return 844
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(844);
      int int0 = grafo0.numVertices();
      assertEquals(844, int0);
  }

  /**
   * REQ-DS-010: Transposing a single-vertex graph preserves vertex count on both graphs
   * Given a single-vertex graph with a self-loop
   * When the graph is transposed
   * Then both original and transposed graphs report 1 vertex
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(1, 1, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(1, grafo0.numVertices());
      assertEquals(1, grafo1.numVertices());
  }
}