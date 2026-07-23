package ds.seed9006;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import ds.Grafo;

import static org.junit.Assert.*;

/**
 * Unit tests for Grafo class (REQ-GRAFO-001: basic graph operations).
 *
 * Note: Tests exercise insert/remove/existence/transpose behaviors and basic boundary index usage.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with a valid size,
   * When inserting a simple edge and printing,
   * Then the vertex count remains unchanged and the edge can be observed and removed.
   *
   * Requirement: REQ-GRAFO-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      final int size = 240;
      Grafo grafo0 = new Grafo(size);

      // When: insert a valid edge between two existing vertices
      grafo0.insereAresta(0, 1, 0);
      grafo0.imprime(); // exercise printing to ensure no exceptions

      // Then: basic invariants and edge presence
      assertEquals("Graph should report the configured number of vertices", size, grafo0.numVertices());
      assertTrue("Inserted edge (0->1) should be reported as existing", grafo0.existeAresta(0, 1));

      // And: removing the edge should return the inserted edge and then it should no longer exist
      Grafo.Aresta removed = grafo0.retiraAresta(0, 1);
      assertNotNull("Removing existing edge should return the edge instance", removed);
      assertEquals("Removed edge v1 should match", 0, removed.v1());
      assertEquals("Removed edge v2 should match", 1, removed.v2());
      assertEquals("After removal the edge should no longer exist", false, grafo0.existeAresta(0, 1));
  }

  /**
   * Given a graph,
   * When inserting a self-loop with a negative weight and then removing it,
   * Then the returned Aresta should have expected endpoints and weight.
   *
   * Requirement: REQ-GRAFO-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);

      // Insert a self-loop with negative weight
      grafo0.insereAresta(0, 0, -449);

      // Act: remove the edge
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);

      // Assert: removed edge matches insertion
      assertNotNull("Expected to remove the previously inserted self-loop", grafo_Aresta0);
      assertEquals("v1 of removed edge should be 0", 0, grafo_Aresta0.v1());
      assertEquals("v2 of removed edge should be 0", 0, grafo_Aresta0.v2());
      assertEquals("weight of removed edge should match inserted value", -449, grafo_Aresta0.peso());

      // Graph invariants
      assertEquals("Number of vertices should remain unchanged", 1165, grafo0.numVertices());
      assertFalse("Self-loop should no longer exist after removal", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a graph with an inserted edge,
   * When requesting the next adjacency from the source vertex,
   * Then an edge representing that adjacency should be returned and reported as existing.
   *
   * Requirement: REQ-GRAFO-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);

      // Arrange: insert a single self-loop adjacency
      grafo0.insereAresta(0, 0, -435);

      // Act: obtain an adjacency from vertex 0
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);

      // Assert basic expectations about the adjacency and graph
      assertNotNull("Expected proxAdj(0) to return the inserted adjacency", grafo_Aresta0);
      assertEquals("Graph size should remain unchanged", 1165, grafo0.numVertices());
      assertEquals("Adjacency v2 should be 0 (self-loop)", 0, grafo_Aresta0.v2());
      assertEquals("Adjacency weight should match inserted value", -435, grafo_Aresta0.peso());
      assertEquals("Adjacency v1 should be 0", 0, grafo_Aresta0.v1());

      // Additional check: existeAresta should reflect presence
      assertTrue("existeAresta should report the self-loop exists", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a freshly created graph,
   * When asking for the first adjacency list of a vertex,
   * Then the operation should complete without changing the vertex count.
   *
   * Requirement: REQ-GRAFO-004
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);

      // When: prepare to iterate adjacency of vertex 0
      grafo0.primeiroListaAdj(0);

      // Then: constructor invariant holds
      assertEquals("Graph should report the configured number of vertices after primeiroListaAdj", 1165, grafo0.numVertices());
  }

  /**
   * Given a new graph with no edges,
   * When checking for the existence of an edge that was never inserted,
   * Then existeAresta should return false.
   *
   * Requirement: REQ-GRAFO-005
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);

      // Initially there should be no edge between 0 and 0
      boolean existsBefore = grafo0.existeAresta(0, 0);
      assertFalse("No edges should exist in a freshly created graph", existsBefore);

      // Insert and verify
      grafo0.insereAresta(0, 0, 7);
      assertTrue("Edge (0,0) should exist after insertion", grafo0.existeAresta(0, 0));

      // Remove and verify non-existence
      grafo0.retiraAresta(0, 0);
      assertFalse("Edge (0,0) should not exist after removal", grafo0.existeAresta(0, 0));

      // Graph invariant
      assertEquals("Graph size should remain as constructed", 240, grafo0.numVertices());
  }

  /**
   * Given a graph,
   * When inserting a zero-weight edge,
   * Then the edge should be reported as existing and have the correct weight.
   *
   * Requirement: REQ-GRAFO-006
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);

      // Insert an edge with zero weight
      grafo0.insereAresta(0, 0, 0);

      // Assert existence and weight correctness
      assertTrue("Inserted zero-weight self-loop should exist", grafo0.existeAresta(0, 0));

      Grafo.Aresta a = grafo0.retiraAresta(0, 0);
      assertNotNull("Removing the zero-weight self-loop should return the edge", a);
      assertEquals("Removed edge should have weight zero", 0, a.peso());

      // Ensure graph remains same size
      assertEquals("Graph size remains unchanged", 240, grafo0.numVertices());
  }

  /**
   * Given a graph with a particular edge inserted,
   * When attempting to remove a non-existing edge,
   * Then null should be returned and the existing edge should remain.
   *
   * Requirement: REQ-GRAFO-007
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);

      // Insert an existing edge
      grafo0.insereAresta(0, 0, -449);

      // Attempt to remove a different (non-existing) edge
      Grafo.Aresta nonExistent = grafo0.retiraAresta(0, 41);
      assertNull("Removing a non-existing edge should return null", nonExistent);

      // The originally inserted self-loop should still exist
      assertTrue("Previously inserted self-loop should still exist after failed removal", grafo0.existeAresta(0, 0));

      // Now remove the real edge and assert it is returned
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
      assertNotNull("Expected to remove the existing self-loop", removed);
      assertEquals("Removed self-loop weight should match", -449, removed.peso());
      assertEquals("Graph size should remain constant", 1165, grafo0.numVertices());
  }

  /**
   * Given a graph size boundary,
   * When querying the number of vertices and inserting an edge at the last index,
   * Then the graph should accept the boundary index and maintain invariants.
   *
   * Requirement: REQ-GRAFO-008
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      final int size = 212;
      Grafo grafo0 = new Grafo(size);

      // Basic size assertion with descriptive message
      int int0 = grafo0.numVertices();
      assertEquals("Graph should report the configured number of vertices", size, int0);

      // Boundary insertion: last valid index should be size-1
      int last = size - 1;
      grafo0.insereAresta(last, last, 1);
      assertTrue("Edge at the maximum valid index should be insertable", grafo0.existeAresta(last, last));

      // Cleanup and invariant
      Grafo.Aresta removed = grafo0.retiraAresta(last, last);
      assertNotNull("Removed boundary edge should not be null", removed);
      assertEquals("Removed boundary edge should have expected endpoints", last, removed.v1());
  }

  /**
   * Given a graph with a self-loop,
   * When obtaining the transposed graph,
   * Then the transpose should be a distinct instance with the same number of vertices
   * and should reflect transpose semantics (for self-loop this is identical).
   *
   * Requirement: REQ-GRAFO-009
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);

      // Insert a self-loop so transpose semantics are simple to assert
      grafo0.insereAresta(0, 0, -449);

      // Act: compute transpose
      Grafo grafo1 = grafo0.grafoTransposto();

      // Assert: transpose is a different instance with same size
      assertNotSame("Transpose should produce a different graph instance", grafo1, grafo0);
      assertEquals("Transpose should preserve the number of vertices", grafo0.numVertices(), grafo1.numVertices());

      // For a self-loop at (0,0), the transpose should also have the self-loop
      assertTrue("Transpose should contain the self-loop at (0,0)", grafo1.existeAresta(0, 0));

      // Original graph should still report its edge as well
      assertTrue("Original graph should still contain its self-loop", grafo0.existeAresta(0, 0));
  }
}