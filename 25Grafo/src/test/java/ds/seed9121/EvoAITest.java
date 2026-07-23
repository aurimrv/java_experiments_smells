package ds.seed9121;

import ds.Grafo;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Grafo behaviors.
 *
 * Requirement traceability: REQ-GRAFO-001 (basic graph operations: insert, remove, adjacency, transpose).
 *
 * Each test follows a Given-When-Then structure and includes descriptive assertion messages.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  // No shared mutable state between tests; create graphs inside each test when needed.
  @Before
  public void setUp() {
    // Intentionally left blank: tests construct their own Grafo instances to ensure isolation.
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert a self-loop with a negative weight, then call imprime() to exercise printing path
    grafo0.insereAresta(0, 0, -6204);
    // exercising imprime() should not change the graph state or throw
    grafo0.imprime();

    // Then: the self-loop should exist and its properties should be correct
    assertTrue("Expected the self-loop (0->0) to exist after insertion.", grafo0.existeAresta(0, 0));
    Grafo.Aresta a = grafo0.proxAdj(0);
    assertNotNull("Expected proxAdj(0) to return the inserted edge.", a);
    assertEquals("v1 of returned edge must be 0.", 0, a.v1());
    assertEquals("v2 of returned edge must be 0.", 0, a.v2());
    assertEquals("peso of returned edge must match inserted value.", -6204, a.peso());
    // Also assert the graph reports the expected number of vertices (sanity check)
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert an edge with zero weight and retrieve the first adjacency for vertex 0
    grafo0.insereAresta(0, 0, 0);
    Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);

    // Then: the adjacency should be present and reflect the inserted values
    assertNotNull("proxAdj(0) should not be null after inserting an edge.", grafo_Aresta0);
    assertEquals("Inserted edge should have v1 = 0.", 0, grafo_Aresta0.v1());
    assertEquals("Inserted edge should have v2 = 0.", 0, grafo_Aresta0.v2());
    assertEquals("Inserted edge should have peso = 0.", 0, grafo_Aresta0.peso());
    assertTrue("existeAresta should report true for the inserted edge.", grafo0.existeAresta(0, 0));
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
    // Given: a fresh graph with no edges
    Grafo grafo0 = new Grafo();

    // When: request the first adjacency for a vertex that has no edges
    // (This should be safe and not throw; behavior is to move internal iterator/position.)
    grafo0.primeiroListaAdj(0);

    // Then: there should be no adjacency available for vertex 0 and numVertices remains default
    Grafo.Aresta a = grafo0.proxAdj(0);
    assertNull("Expected no adjacency for vertex 0 in an empty graph.", a);
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3()  throws Throwable  {
    // Given: a fresh graph
    Grafo grafo0 = new Grafo();

    // When: insert a zero-weight self-loop and check existence
    grafo0.insereAresta(0, 0, 0);
    boolean exists = grafo0.existeAresta(0, 0);

    // Then: the edge must exist and proxAdj should return the same values
    assertTrue("existeAresta should return true after inserting the self-loop.", exists);
    Grafo.Aresta a = grafo0.proxAdj(0);
    assertNotNull("proxAdj should return the inserted adjacency.", a);
    assertEquals("Inserted adjacency should have peso 0.", 0, a.peso());
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test4()  throws Throwable  {
    // Given: a fresh graph with no edges
    Grafo grafo0 = new Grafo();

    // When: query for a non-existing edge
    boolean exists = grafo0.existeAresta(0, 0);

    // Then: existence check should be false and proxAdj returns null
    assertFalse("No edge should exist in a fresh graph between 0 and 0.", exists);
    Grafo.Aresta a = grafo0.proxAdj(0);
    assertNull("proxAdj should return null when no adjacency exists for vertex 0.", a);
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test5()  throws Throwable  {
    // Given: a fresh graph and an inserted edge with a negative weight
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, -621);

    // When: remove that edge
    Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

    // Then: the removed edge should reflect the inserted values and the edge should no longer exist
    assertNotNull("retiraAresta should return the removed edge for an existing edge.", removed);
    assertEquals("Removed edge v1 should be 0.", 0, removed.v1());
    assertEquals("Removed edge v2 should be 0.", 0, removed.v2());
    assertEquals("Removed edge peso should match inserted value -621.", -621, removed.peso());
    assertFalse("After removal, existeAresta should return false for that edge.", grafo0.existeAresta(0, 0));
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test6()  throws Throwable  {
    // Given: a graph with one inserted self-loop
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, 0);

    // When: attempt to remove a non-existent edge to a different vertex
    Grafo.Aresta removed = grafo0.retiraAresta(0, 100);

    // Then: removal should return null and original edge should still exist
    assertNull("retiraAresta should return null when attempting to remove a non-existent edge.", removed);
    assertTrue("Original self-loop should remain after failed removal attempt.", grafo0.existeAresta(0, 0));
    assertEquals("Number of vertices should remain the default of 100.", 100, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test7()  throws Throwable  {
    // Given: a fresh graph

    // When: query number of vertices
    Grafo grafo0 = new Grafo();
    int n = grafo0.numVertices();

    // Then: it should report the expected default count and not modify state
    assertEquals("numVertices should return the default configured vertex count (100).", 100, n);
    // Additional sanity: there should be no adjacency on an arbitrary vertex in a fresh graph
    assertNull("proxAdj(0) should be null in a fresh graph.", grafo0.proxAdj(0));
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test8()  throws Throwable  {
    // Given: a graph with a self-loop
    Grafo grafo0 = new Grafo();
    grafo0.insereAresta(0, 0, -621);

    // When: compute the transposed graph
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then: the transposed graph should be a distinct instance but contain the corresponding edge
    assertNotSame("grafoTransposto should produce a distinct Grafo instance.", grafo1, grafo0);
    assertEquals("Original graph should still report the same number of vertices.", 100, grafo0.numVertices());
    // For a self-loop, the transposed graph should also have the same self-loop
    assertTrue("Transposed graph should contain the self-loop (0->0).", grafo1.existeAresta(0, 0));
    // Ensure original still contains the edge (transpose should not mutate the original)
    assertTrue("Original graph should still contain the self-loop after transposition.", grafo0.existeAresta(0, 0));
  }
}