package ds.seed7992;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Grafo basic behaviors.
 *
 * Requirement traceability: REQ-GRAFO-001 - basic graph operations (insert, remove, query, transpose).
 *
 * Notes:
 * - Tests follow Given-When-Then structure in comments.
 * - These are unit tests and are annotated with the UnitTest marker to allow selective execution.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Given a graph with a large number of vertices,
   * When an edge is inserted and the graph is queried,
   * Then the graph keeps the declared number of vertices and the edge can be observed.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      final int expectedVertices = 6671;
      Grafo grafo0 = new Grafo(expectedVertices);

      // When
      grafo0.insereAresta(0, 0, 6671); // arrange + act: insert a self-loop on vertex 0

      // Then
      assertEquals("Graph should report the original number of vertices after insertion",
              expectedVertices, grafo0.numVertices());
      // Verify existence of the inserted edge
      assertTrue("Inserted self-loop should be reported as existing", grafo0.existeAresta(0, 0));

      // Also verify that retiraAresta can remove it and returns an Aresta with expected properties
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
      assertNotNull("retiraAresta should return the removed edge object", removed);
      assertEquals("Removed edge should have v1 == 0", 0, removed.v1());
      assertEquals("Removed edge should have v2 == 0", 0, removed.v2());
      assertEquals("Removed edge should have the inserted weight", 6671, removed.peso());
      // After removal, the edge should no longer exist
      assertFalse("After removal the edge should no longer exist", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a newly created graph,
   * When an edge with a negative weight is inserted and adjacency retrieval is requested,
   * Then the adjacency returned describes the inserted edge and invalid adjacent removals return null.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1371);

      // When
      grafo0.insereAresta(0, 0, (-819)); // insert self-loop with negative weight

      // Then
      Grafo.Aresta a = grafo0.proxAdj(0);
      assertNotNull("proxAdj should return the inserted adjacency for vertex 0", a);
      assertEquals("v1 should be source vertex", 0, a.v1());
      assertEquals("v2 should be destination vertex", 0, a.v2());
      assertEquals("peso should match inserted negative weight", (-819), a.peso());
      assertEquals("Graph should still report the original number of vertices", 1371, grafo0.numVertices());

      // Error/edge flow: trying to remove a non-existent adjacent edge returns null
      Grafo.Aresta nonExistentRemoval = grafo0.retiraAresta(0, 1);
      assertNull("retiraAresta should return null when attempting to remove a non-existent edge", nonExistentRemoval);
  }

  /**
   * Given a graph with no edges,
   * When primeiroListaAdj is invoked for a vertex with no adjacencies,
   * Then subsequent proxAdj calls should return null and the number of vertices remains unchanged.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(313);

      // When
      grafo0.primeiroListaAdj(1); // attempt to initialize adjacency iteration for vertex 1

      // Then
      // If there are no adjacencies for vertex 1, proxAdj should return null
      Grafo.Aresta next = grafo0.proxAdj(1);
      assertNull("proxAdj should return null for a vertex with no adjacencies", next);
      assertEquals("Number of vertices should be unchanged after adjacency operations", 313, grafo0.numVertices());
  }

  /**
   * Given a graph,
   * When an edge is inserted, existeAresta should report its presence.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(313);

      // When
      grafo0.insereAresta(0, 0, (-6647));

      // Then
      assertTrue("Edge inserted on (0,0) should exist", grafo0.existeAresta(0, 0));
      // Check a negative case to ensure non-inserted edges are reported absent
      assertFalse("Non-inserted edge (1,0) should not exist", grafo0.existeAresta(1, 0));

      // And verify removal works as expected
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
      assertNotNull("retiraAresta should remove the previously inserted edge", removed);
      assertEquals("Removed edge should have the expected weight", (-6647), removed.peso());
      assertFalse("After removal, the edge should no longer exist", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should remain constant", 313, grafo0.numVertices());
  }

  /**
   * Given a graph without any edges,
   * When we query for an edge that was never added,
   * Then existeAresta should return false.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(313);

      // When
      boolean exists = grafo0.existeAresta(1, 0);

      // Then
      assertFalse("existeAresta should be false for a non-existent edge (1,0)", exists);
      assertEquals("Number of vertices should be unchanged", 313, grafo0.numVertices());
  }

  /**
   * Given a graph with an inserted edge,
   * When retiraAresta is invoked for that edge,
   * Then it should return the removed Aresta with correct fields and subsequent removals should return null.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));

      // When
      Grafo.Aresta a = grafo0.retiraAresta(0, 0);

      // Then
      assertNotNull("retiraAresta should return the removed edge when it exists", a);
      assertEquals("v2 should match", 0, a.v2());
      assertEquals("peso should match inserted weight", (-6647), a.peso());
      assertEquals("v1 should match", 0, a.v1());
      assertEquals("Number of vertices should remain unchanged", 313, grafo0.numVertices());

      // Verify idempotence: removing again yields null
      Grafo.Aresta secondRemoval = grafo0.retiraAresta(0, 0);
      assertNull("Subsequent retiraAresta on same edge should return null", secondRemoval);
  }

  /**
   * Given a graph with an edge,
   * When attempting to remove a different (non-existent) adjacent edge,
   * Then retiraAresta should return null and the originally inserted edge should still be present.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));

      // When
      Grafo.Aresta result = grafo0.retiraAresta(0, 1); // attempt to remove an edge that doesn't exist

      // Then
      assertNull("retiraAresta should return null for a non-existent adjacent edge", result);
      // The original edge should remain present
      assertTrue("Original edge (0,0) should still exist after failed removal attempt", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should remain unchanged", 313, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with a specific number of vertices,
   * When queried for its size and for an arbitrary non-inserted edge,
   * Then the size must match and the edge must be absent.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(673);

      // When
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("Graph should report the number of vertices provided at construction", 673, int0);
      // Verify that with no edges inserted, a query returns false
      assertFalse("No edges have been added; any specific edge should not exist", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a graph with an inserted edge,
   * When its transpose is requested,
   * Then the transposed graph is a distinct object with the same size and independent edge storage.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));

      // When
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then
      assertNotSame("grafoTransposto should produce a new Grafo instance, not the same reference", grafo1, grafo0);
      assertEquals("Both graphs should report the same number of vertices", grafo0.numVertices(), grafo1.numVertices());
      // For a self-loop, transpose should still show the edge
      assertTrue("Transposed graph should contain the corresponding transposed edge", grafo1.existeAresta(0, 0));
      // Ensure independence: removing in original does not remove in transpose
      Grafo.Aresta removedFromOriginal = grafo0.retiraAresta(0, 0);
      assertNotNull("Removal from original should succeed", removedFromOriginal);
      assertFalse("After removal from original, original should no longer report the edge", grafo0.existeAresta(0, 0));
      assertTrue("Transposed graph should still report the edge after removal from original (independence)", grafo1.existeAresta(0, 0));
  }
}