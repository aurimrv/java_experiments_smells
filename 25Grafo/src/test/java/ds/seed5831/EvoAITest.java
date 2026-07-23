package ds.seed5831;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Grafo class (REQ-GRAFO-001).
 * Each test documents the intent (Given-When-Then) and includes descriptive assertion messages.
 *
 * Marker interface for categorizing unit tests.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given: a newly created graph and a self-loop inserted on vertex 0
   * When:  the graph is printed (imprime)
   * Then:  the graph must report the expected number of vertices and the inserted edge must exist
   *
   * Requirement: REQ-GRAFO-001 - basic graph mutation and reporting
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0); // prepare state: create a self-loop on vertex 0

      // When
      grafo0.imprime(); // act: ensure this action does not throw and is safe to call

      // Then
      assertEquals("Graph should contain the default number of vertices (100) after creation",
                   100, grafo0.numVertices());
      assertTrue("The self-loop (0->0) should exist after insertion", grafo0.existeAresta(0, 0));
  }

  /**
   * Given: a graph with a single inserted self-loop on vertex 0
   * When:  that edge is removed (retiraAresta)
   * Then:  the returned edge should match the inserted values and the edge should no longer exist
   *
   * Requirement: REQ-GRAFO-002 - edge removal returns the removed edge
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);

      // When
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

      // Then
      assertNotNull("retiraAresta should return the removed edge for an existing edge", removed);
      assertEquals("Removed edge v1 must be 0", 0, removed.v1());
      assertEquals("Removed edge v2 must be 0", 0, removed.v2());
      assertEquals("Removed edge weight must be 0", 0, removed.peso());
      assertFalse("After removal, edge (0->0) should not exist", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should remain constant at 100", 100, grafo0.numVertices());
  }

  /**
   * Given: a graph with an inserted self-loop on vertex 0
   * When:  the adjacency iterator is reset and proxAdj is queried
   * Then:  proxAdj should return the inserted Aresta and graph vertex count should be unchanged
   *
   * Requirement: REQ-GRAFO-003 - adjacency traversal via primeiroListaAdj/proxAdj
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);

      // When
      grafo0.primeiroListaAdj(0); // ensure adjacency pointer is at start for vertex 0
      Grafo.Aresta next = grafo0.proxAdj(0);

      // Then
      assertNotNull("proxAdj should return the adjacency for vertex 0 after insertion", next);
      assertEquals("proxAdj returned edge v1 should be 0", 0, next.v1());
      assertEquals("proxAdj returned edge v2 should be 0", 0, next.v2());
      assertEquals("proxAdj returned edge weight should be 0", 0, next.peso());
      assertEquals("Vertex count should remain constant at 100", 100, grafo0.numVertices());
  }

  /**
   * Given: an empty graph (no inserted edges)
   * When:  primeiroListaAdj is invoked for vertex 0 and proxAdj is then queried
   * Then:  proxAdj should return null (no adjacent edges) and vertex count remains the default
   *
   * Requirement: REQ-GRAFO-004 - adj-list iteration on empty adjacency list
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      grafo0.primeiroListaAdj(0); // position iterator for vertex 0
      Grafo.Aresta next = grafo0.proxAdj(0); // should be null when no edges are present

      // Then
      assertNull("proxAdj should be null for vertex 0 when no edges exist", next);
      assertEquals("Graph should still report 100 vertices after iterator initialization", 100, grafo0.numVertices());
  }

  /**
   * Given: a newly created graph
   * When:  checking existence for a non-inserted edge (0 -> 100)
   * Then:  the edge should not exist and vertex count should be default
   *
   * Requirement: REQ-GRAFO-005 - existeAresta returns false for absent edges
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      boolean exists = grafo0.existeAresta(0, 100);

      // Then
      assertFalse("No edge should exist between 0 and 100 in a new graph", exists);
      assertEquals("Graph should report the default number of vertices (100)", 100, grafo0.numVertices());
  }

  /**
   * Given: a graph where an edge (0->0) is inserted
   * When:  existeAresta is queried for that edge
   * Then:  the method should report true and the graph vertex count remains unchanged
   *
   * Requirement: REQ-GRAFO-006 - existeAresta detects inserted edges
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);

      // When
      boolean exists = grafo0.existeAresta(0, 0);

      // Then
      assertTrue("Edge (0->0) should be reported as existing after insertion", exists);
      assertEquals("Vertex count should remain unchanged at 100", 100, grafo0.numVertices());
  }

  /**
   * Given: a fresh graph
   * When:  numVertices is queried
   * Then:  it should return the default configured number of vertices (100)
   *
   * Requirement: REQ-GRAFO-007 - graph initialization sets default vertex count
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      int count = grafo0.numVertices();

      // Then
      assertEquals("numVertices should return the expected default value of 100", 100, count);
      assertTrue("numVertices should be a positive integer", count > 0);
  }

  /**
   * Given: a graph with a single self-loop on vertex 0
   * When:  the transpose of the graph is created
   * Then:  the transposed graph must have the corresponding reversed edges and same vertex count
   *
   * Requirement: REQ-GRAFO-008 - grafoTransposto should invert edge directions
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0); // insert an edge which is its own transpose

      // When
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then
      assertNotNull("grafoTransposto must return a non-null graph instance", grafo1);
      assertEquals("Transposed graph should have the same number of vertices as the original", 100, grafo1.numVertices());
      assertTrue("Transposed graph should contain the reversed edge (0->0) corresponding to the original",
                 grafo1.existeAresta(0, 0));
  }

  /**
   * Given: an attempt to insert an edge with an out-of-range destination index
   * When:  retiraAresta is called for a never-inserted (or invalid) edge
   * Then:  null should be returned indicating no such edge could be removed
   *
   * Requirement: REQ-GRAFO-009 - operations with out-of-range indices are handled gracefully
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      // Attempt to insert an edge with an out-of-range vertex index (likely ignored by implementation)
      grafo0.insereAresta(0, 2450, (-375));

      // When
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0); // try removing an edge that was not successfully inserted

      // Then
      assertNull("retiraAresta should return null when attempting to remove a non-existing or invalid edge", removed);
      assertEquals("Graph should still report the default vertex count after invalid insert attempt", 100, grafo0.numVertices());
  }
}