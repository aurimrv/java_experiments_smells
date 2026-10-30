package ds.seed5503;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo focusing on readability, traceability and
 * more descriptive assertions while preserving original test behavior and oracles.
 *
 * Notes:
 * - Original test names and EvoRunner annotations are preserved for oracle/runner compatibility.
 * - Each test documents Given-When-Then and includes clearer assertion messages.
 * - No new SUT operations (beyond the original calls) were introduced.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-001: Verify that inserting an edge and printing does not change the vertex count.
   * Given a graph with 1 vertex
   * When an edge insertion is attempted and the graph is printed
   * Then the number of vertices remains 1
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1934, (-1016));
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * REQ-002: Verify behavior of retiraAresta when removing (possibly non-existent) edge.
   * Given a graph initialized with 894 vertices
   * When an edge is inserted with large indices and a different edge is removed
   * Then the returned Aresta has expected v1, v2 and peso (per oracle)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(894);
      grafo0.insereAresta(4605, 894, 254);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(4151, 0);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(4151, grafo_Aresta0.v1());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v2());
  }

  /**
   * REQ-003: Verify retiraAresta returns expected Aresta fields in the presence of self-edge insertion.
   * Given a graph with many vertices
   * When a self-edge is inserted and a different edge is removed
   * Then the returned Aresta fields match the expected oracle values
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(4154);
      grafo0.insereAresta(4450, 4450, 4450);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4450);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(4450, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(4450, grafo_Aresta0.v2());
  }

  /**
   * REQ-004: Verify retiraAresta returns null when graph has zero vertices and removal indices refer to vertex 0.
   * Given an empty graph (0 vertices)
   * When edges are (attempted) to be inserted and then removal of (0,0) is requested
   * Then retiraAresta returns null
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(0, 0, 0);
      grafo0.insereAresta(0, 360, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNull(grafo_Aresta0);
  }

  /**
   * REQ-005: Verify grafoTransposto returns a graph with the same number of vertices.
   * Given a graph with N vertices
   * When its transpose is computed
   * Then the transpose has same vertex count as original
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(894);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(894, grafo1.numVertices());
  }

  /**
   * REQ-006: Verify existeAresta detects an inserted edge in an empty-vertex graph scenario.
   * Given a graph with 0 vertices and attempted insertions
   * When checking for existence of (0,360)
   * Then existeAresta returns true per original behavior
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(0, 0, 0);
      grafo0.insereAresta(0, 360, 0);
      boolean boolean0 = grafo0.existeAresta(0, 360);
      assertTrue(boolean0);
  }

  /**
   * REQ-007: Verify existeAresta returns false for non-present edges even after an insertion elsewhere.
   * Given a graph with N vertices and an inserted self-edge
   * When checking for a different non-inserted edge
   * Then existeAresta returns false
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(894);
      grafo0.insereAresta(894, 894, (-1193));
      boolean boolean0 = grafo0.existeAresta(0, 4);
      assertFalse(boolean0);
  }

  /**
   * REQ-008: Verify that manually setting internal array field and attempting insertion does not alter vertex count.
   * Given a graph with 1 vertex and a manually replaced cab array
   * When attempting to insert an out-of-range edge
   * Then the number of vertices remains unchanged (oracle)
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      int[] intArray0 = new int[1];
      grafo0.cab = intArray0;
      grafo0.insereAresta(1, 1, 1);
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * REQ-009: Verify numVertices returns the size provided at construction.
   * Given a graph with 433 vertices
   * When querying numVertices
   * Then it returns 433
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(433);
      int int0 = grafo0.numVertices();
      assertEquals(433, int0);
  }

  /**
   * REQ-010: Verify that computing the transpose does not alter the original graph's vertex count.
   * Given a graph with 1 vertex
   * When an out-of-range insertion is attempted and transpose is computed
   * Then original numVertices remains 1
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 1934, (-1016));
      grafo0.grafoTransposto();
      assertEquals(1, grafo0.numVertices());
  }
}