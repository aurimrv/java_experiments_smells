package ds.seed9006;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests so that tests can be filtered by category.
 */
interface UnitTest {}

/**
 * Improved and documented tests for Grafo.
 *
 * Notes:
 * - Each test uses Given-When-Then style comments and descriptive assertion messages.
 * - Tests are annotated with @Category(UnitTest.class) for selective execution.
 * - Method names are preserved to comply with the original test suite; bodies have
 *   been enhanced to include better assertions, messages, and minimal setup verification.
 *
 * Requirement traceability (example): REQ-GRAPH-001
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given a fresh graph,
   * When inserting a self-loop edge (0->0) and printing the graph,
   * Then the graph should still report the expected vertex count and the inserted edge should be observable.
   *
   * @see REQ-GRAPH-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When: insert a self-loop and call imprime (side-effect; ensure no exception)
      grafo0.insereAresta(0, 0, 0);
      grafo0.imprime(); // no return value; ensure call does not throw

      // Then: verify structural properties
      assertEquals("Graph should report 100 vertices after construction and insert.", 100, grafo0.numVertices());

      // The inserted self-loop should be discoverable
      boolean exists = grafo0.existeAresta(0, 0);
      assertTrue("Inserted self-loop (0->0) should exist.", exists);

      Grafo.Aresta a = grafo0.proxAdj(0);
      assertNotNull("proxAdj(0) should return the inserted adjacency/edge for vertex 0.", a);
      assertEquals("Edge v1 should be 0.", 0, a.v1());
      assertEquals("Edge v2 should be 0.", 0, a.v2());
      assertEquals("Edge weight should be 0 as inserted.", 0, a.peso());
  }

  /**
   * Given a fresh graph,
   * When attempting to insert an edge with an out-of-range vertex index,
   * Then removing a different (non-inserted) edge should return null and the vertex count remains unchanged.
   *
   * @see REQ-GRAPH-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When: attempt to insert with an invalid destination index (negative)
      grafo0.insereAresta(0, (-709), 0);

      // Then: removing a different edge (0,0) should not succeed (likely null)
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
      assertNull("Removing a non-existent edge (0->0) should return null.", removed);

      // Vertex count invariant
      assertEquals("Vertex count should remain 100 after invalid insertion attempt.", 100, grafo0.numVertices());
  }

  /**
   * Given a fresh graph,
   * When inserting an edge (0->0) and querying adjacency,
   * Then proxAdj should return the edge and its attributes should match the inserted values.
   *
   * @see REQ-GRAPH-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta adj = grafo0.proxAdj(0);

      // Then
      assertNotNull("After inserting a self-loop, proxAdj(0) must not be null.", adj);
      assertEquals("Adjacency v1 must be the source vertex 0.", 0, adj.v1());
      assertEquals("Adjacency v2 must be the destination vertex 0.", 0, adj.v2());
      assertEquals("Adjacency weight must equal inserted weight 0.", 0, adj.peso());
      assertTrue("Graph should report the existence of the inserted self-loop.", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should remain 100 after insertion.", 100, grafo0.numVertices());
  }

  /**
   * Given a fresh graph,
   * When requesting the first adjacency in the list for vertex 1,
   * Then the operation should not affect the number of vertices.
   *
   * @see REQ-GRAPH-004
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When: trigger primeiroListaAdj for a vertex that likely has no edges
      grafo0.primeiroListaAdj(1);

      // Then: verify invariants
      assertEquals("Calling primeiroListaAdj(1) should not change the graph's vertex count.", 100, grafo0.numVertices());
  }

  /**
   * Given a fresh graph,
   * When inserting an edge (0->0),
   * Then existeAresta reports the edge exists and the vertex count remains unchanged.
   *
   * @see REQ-GRAPH-005
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      grafo0.insereAresta(0, 0, 0);

      // Then
      assertTrue("After insertion, existeAresta(0,0) should return true.", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should still be 100 after inserting an edge.", 100, grafo0.numVertices());
  }

  /**
   * Given a fresh graph,
   * When inserting then removing a self-loop edge (0->0),
   * Then the removed edge should match the inserted attributes and the edge should no longer exist.
   *
   * @see REQ-GRAPH-006
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

      // Then: the removed edge must be the one we inserted
      assertNotNull("retiraAresta(0,0) should return the removed edge after insertion.", removed);
      assertEquals("Removed edge v1 should be 0.", 0, removed.v1());
      assertEquals("Removed edge v2 should be 0.", 0, removed.v2());
      assertEquals("Removed edge weight should be 0.", 0, removed.peso());

      // And the edge should no longer be reported by existeAresta
      assertFalse("After removal, existeAresta(0,0) should be false.", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should remain 100 after removal.", 100, grafo0.numVertices());
  }

  /**
   * Given a fresh graph,
   * When inserting an edge with a negative weight,
   * Then querying a distant non-existent adjacency should return false and the vertex count remains the same.
   *
   * @see REQ-GRAPH-007
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();

      // When: insert with negative weight (allowed by implementation under test)
      grafo0.insereAresta(0, 0, (-1));

      // Then: querying a non-related adjacency should be false
      boolean existsFar = grafo0.existeAresta(0, 4732);
      assertFalse("There should be no edge from 0 to 4732.", existsFar);

      // Vertex count invariant
      assertEquals("Vertex count should be 100 after insertion with negative weight.", 100, grafo0.numVertices());
  }

  /**
   * Given a fresh graph,
   * When querying the number of vertices,
   * Then the default number of vertices should be 100 and no edges exist initially for (0->0).
   *
   * @see REQ-GRAPH-008
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given & When
      Grafo grafo0 = new Grafo();
      int nv = grafo0.numVertices();

      // Then
      assertEquals("New graph should have 100 vertices by default.", 100, nv);
      assertFalse("No edges should exist in a fresh graph for (0->0).", grafo0.existeAresta(0, 0));
  }

  /**
   * Given a graph with a self-loop of negative weight,
   * When creating the transposed graph,
   * Then the transposed graph should preserve the number of vertices and be a distinct instance.
   *
   * @see REQ-GRAPH-009
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, (-1));

      // When: compute transpose
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then
      assertNotNull("Transposed graph should not be null.", grafo1);
      assertNotSame("Transposed graph should be a distinct instance from the original.", grafo0, grafo1);
      assertEquals("Transposed graph must have the same number of vertices as the original.", grafo0.numVertices(), grafo1.numVertices());
      assertEquals("Expected 100 vertices in the transposed graph.", 100, grafo1.numVertices());
  }
}