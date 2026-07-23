package ds.seed9121;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

/**
 * Marker interface for categorizing unit tests.
 */
interface UnitTest {}

/**
 * Improved and documented tests for Grafo.
 *
 * Notes:
 * - Each test follows a simple Given-When-Then structure in comments.
 * - Assertions include descriptive messages for easier diagnostics.
 * - Basic invariants (vertex count unchanged) and edge properties are validated.
 *
 * Traceability: REQ-GRAFO-001 (basic graph operations)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a graph with 291 vertices
    Grafo grafo0 = new Grafo(291);

    // When: insert an edge and print the graph (printing is a no-op for state verification)
    grafo0.insereAresta(0, 1, 105);
    grafo0.imprime();

    // Then: number of vertices remains as constructed and the inserted edge should exist
    assertEquals("Vertex count should remain 291 after insertion and print", 291, grafo0.numVertices());
    // Validate that the edge we just inserted is reported as existing (if the implementation supports 0 index)
    try {
      assertTrue("Inserted edge (0->1) should exist after insereAresta", grafo0.existeAresta(0, 1));
    } catch (Throwable t) {
      // If the implementation does not accept index 0, ensure no unexpected exception escapes the test,
      // and at minimum the vertex count invariant holds.
      fail("Exception while checking existence of edge (0->1): " + t.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a large graph
    Grafo grafo0 = new Grafo(2784);

    // When: insert an edge with high indices and then attempt to remove a non-existent edge
    grafo0.insereAresta(0, 2784, 2784);
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);

    // Then: retiraAresta for a non-inserted pair returns null and vertex count is unchanged
    assertNull("retiraAresta should return null for non-existent edge (0->0)", grafo_Aresta0);
    assertEquals("Vertex count should remain 2784 after operations", 2784, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a large graph and a specific edge to insert
    Grafo grafo0 = new Grafo(2784);

    // When: insert and then retrieve the first adjacent edge for vertex 1224
    grafo0.insereAresta(1224, 2784, 2784);
    Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(1224);

    // Then: the adjacency should reflect the inserted edge and basic properties should match
    assertNotNull("proxAdj should not return null after inserting an edge for vertex 1224", grafo_Aresta0);
    assertEquals("Aresta v1 should match insertion source", 1224, grafo_Aresta0.v1());
    assertEquals("Aresta v2 should match insertion target", 2784, grafo_Aresta0.v2());
    assertEquals("Aresta peso should match insertion weight", 2784, grafo_Aresta0.peso());
    assertTrue("existeAresta should report true for the inserted (1224->2784) edge", grafo0.existeAresta(1224, 2784));
    assertEquals("Vertex count should remain 2784 after insertion", 2784, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a graph with many vertices
    Grafo grafo0 = new Grafo(2784);

    // When: request the first adjacency for a vertex (operation should not mutate vertex count)
    try {
      grafo0.primeiroListaAdj(1224);
    } catch (Throwable t) {
      // If implementation throws for out-of-range index, fail with context
      fail("primeiroListaAdj threw an unexpected exception for index 1224: " + t.getMessage());
    }

    // Then: vertex count invariant holds
    assertEquals("Vertex count should be 2784 after primeiroListaAdj call", 2784, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: a graph and a newly inserted edge
    Grafo grafo0 = new Grafo(2784);
    grafo0.insereAresta(1224, 2784, 2784);

    // When: check for existence of that edge
    boolean boolean0 = grafo0.existeAresta(1224, 2784);

    // Then: the edge should be present and vertex count unchanged
    assertTrue("After insertion, existeAresta should return true for (1224->2784)", boolean0);
    assertEquals("Vertex count should remain 2784 after inserting an edge", 2784, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a graph and an inserted edge that we will remove
    Grafo grafo0 = new Grafo(2784);
    grafo0.insereAresta(1224, 2784, 2784);

    // When: remove the previously inserted edge
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1224, 2784);

    // Then: the returned Aresta should reflect the removed edge, and the graph no longer contains it
    assertNotNull("retiraAresta should return the removed Aresta for (1224->2784)", grafo_Aresta0);
    assertEquals("Removed Aresta source vertex v1 should be 1224", 1224, grafo_Aresta0.v1());
    assertEquals("Removed Aresta target vertex v2 should be 2784", 2784, grafo_Aresta0.v2());
    assertEquals("Removed Aresta weight should be 2784", 2784, grafo_Aresta0.peso());
    assertFalse("After removal, existeAresta should return false for previously removed (1224->2784)", grafo0.existeAresta(1224, 2784));
    assertEquals("Vertex count should remain 2784 after removal", 2784, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a graph and an insertion that may involve index 0
    Grafo grafo0 = new Grafo(2784);
    grafo0.insereAresta(0, 2784, 2784);

    // When: check for a trivial non-existing self-edge and the inserted edge
    boolean selfExists = grafo0.existeAresta(0, 0);
    boolean insertedExists;
    try {
      insertedExists = grafo0.existeAresta(0, 2784);
    } catch (Throwable t) {
      // If existeAresta throws for certain indices, record and fail with message
      fail("existeAresta threw unexpected exception when checking (0->2784): " + t.getMessage());
      return;
    }

    // Then: self-edge shouldn't exist, but inserted edge should (if index 0 is accepted)
    assertFalse("Self-edge (0->0) should not exist by default", selfExists);
    assertTrue("Inserted edge (0->2784) should exist after insereAresta", insertedExists);
    assertEquals("Vertex count should remain 2784 after operations", 2784, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: a graph constructed with 473 vertices
    Grafo grafo0 = new Grafo(473);

    // When: query the number of vertices
    int int0 = grafo0.numVertices();

    // Then: the returned number must match construction parameter
    assertEquals("numVertices should report the value given at construction (473)", 473, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Given: a graph with one self-loop inserted
    Grafo grafo0 = new Grafo(473);
    grafo0.insereAresta(1, 1, 0);

    // When: create the transposed graph
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then: transposed graph should be a distinct instance, maintain vertex count,
    // and self-loop should remain present in the transpose.
    assertNotSame("grafoTransposto should return a distinct object, not the original", grafo1, grafo0);
    assertEquals("Transposed graph should have same number of vertices as original", grafo0.numVertices(), grafo1.numVertices());
    assertTrue("Original graph should report the inserted self-loop (1->1)", grafo0.existeAresta(1, 1));
    assertTrue("Transposed graph should also report the self-loop (1->1)", grafo1.existeAresta(1, 1));
  }
}