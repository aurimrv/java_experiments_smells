package ds.seed5503;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Grafo core behaviors.
 * Requirement traceability: REQ-GR-001 (basic graph operations: insert, remove, query, transpose).
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-GR-001
   * Given a large graph, inserting a self-loop should not change the vertex count
   * and the inserted edge should be discoverable via existeAresta.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2450);

      // When
      grafo0.insereAresta(298, 298, 298);
      // imprime() is exercised to ensure it does not throw for a populated graph
      grafo0.imprime();

      // Then
      assertEquals("Vertex count must remain as constructed after inserting an edge", 2450, grafo0.numVertices());
      assertTrue("Inserted self-loop (298->298) should exist", grafo0.existeAresta(298, 298));
  }

  /**
   * REQ-GR-001
   * Given a graph, inserting an edge from 0 to 1957 should be retrievable by retiraAresta
   * and the edge properties should match what was inserted.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1957);

      // When
      grafo0.insereAresta(0, 1957, 1957);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1957);

      // Then
      assertNotNull("retiraAresta should return the previously inserted edge (0->1957)", grafo_Aresta0);
      assertEquals("Returned edge v1 should be the source vertex", 0, grafo_Aresta0.v1());
      assertEquals("Returned edge v2 should be the destination vertex", 1957, grafo_Aresta0.v2());
      assertEquals("Returned edge peso should match the inserted weight", 1957, grafo_Aresta0.peso());
      assertEquals("Vertex count must remain unchanged after retiraAresta", 1957, grafo0.numVertices());
      // After removal, the edge should no longer exist
      assertFalse("Edge (0->1957) should no longer exist after removal", grafo0.existeAresta(0, 1957));
  }

  /**
   * REQ-GR-001
   * Inserting a self-loop and querying the next adjacency from the vertex should yield that edge.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2450);
      grafo0.insereAresta(0, 0, 2450);

      // When
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);

      // Then
      assertNotNull("proxAdj(0) should return the inserted self-loop for vertex 0", grafo_Aresta0);
      assertEquals("proxAdj returned edge should have source 0", 0, grafo_Aresta0.v1());
      assertEquals("proxAdj returned edge should have destination 0", 0, grafo_Aresta0.v2());
      assertEquals("proxAdj returned edge should have the inserted weight", 2450, grafo_Aresta0.peso());
      assertTrue("existeAresta should report the self-loop exists", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count should remain as constructed", 2450, grafo0.numVertices());
  }

  /**
   * REQ-GR-001
   * Calling primeiroListaAdj on an empty adjacency list should be safe and vertex count should match construction.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(78);

      // When
      Grafo.Aresta firstAdj = grafo0.primeiroListaAdj(0);

      // Then
      // For a freshly constructed graph with no edges, primeiroListaAdj is expected to return null.
      assertTrue("For a new graph without edges, primeiroListaAdj should return null or no adjacency present",
                 firstAdj == null);
      assertEquals("Vertex count must reflect the constructor parameter", 78, grafo0.numVertices());
  }

  /**
   * REQ-GR-001
   * Verifies existeAresta on an empty graph returns false and vertex count is correct.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2450);

      // When
      boolean boolean0 = grafo0.existeAresta(0, 0);

      // Then
      assertFalse("No edge should exist in a freshly constructed graph", boolean0);
      assertEquals("Vertex count should be as constructed", 2450, grafo0.numVertices());
  }

  /**
   * REQ-GR-001
   * Inserting an edge with a negative weight should be supported and retrievable.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2450);

      // When
      grafo0.insereAresta(0, 0, (-1582));

      // Then
      assertTrue("Inserted self-loop with negative weight should exist", grafo0.existeAresta(0, 0));
      Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
      assertNotNull("retiraAresta should return the negative-weight self-loop", removed);
      assertEquals("Removed edge should have the negative weight that was inserted", -1582, removed.peso());
      assertEquals("Vertex count should remain unchanged", 2450, grafo0.numVertices());
  }

  /**
   * REQ-GR-001
   * Removing a non-existent edge should return null while existing unrelated edges remain.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(1957);
      grafo0.insereAresta(0, 0, 0);

      // When
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1957);

      // Then
      assertNull("Attempting to remove a non-existent edge should return null", grafo_Aresta0);
      // The originally inserted self-loop should still exist
      assertTrue("Existing self-loop (0->0) should remain present", grafo0.existeAresta(0, 0));
      assertEquals("Vertex count must remain unchanged", 1957, grafo0.numVertices());
  }

  /**
   * REQ-GR-001
   * Verifies that numVertices returns the value provided to the constructor.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given & When
      Grafo grafo0 = new Grafo(2450);
      int int0 = grafo0.numVertices();

      // Then
      assertEquals("numVertices() should return the constructor value", 2450, int0);
      // Additional sanity: no edges present initially
      assertFalse("No edges should exist initially", grafo0.existeAresta(0, 0));
  }

  /**
   * REQ-GR-001
   * Transposing a graph should produce a distinct Grafo instance with the same vertex count,
   * and self-loops should be preserved as they are their own transpose.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2450);
      grafo0.insereAresta(0, 0, (-1582));

      // When
      Grafo grafo1 = grafo0.grafoTransposto();

      // Then
      assertNotSame("grafoTransposto must return a different Grafo instance", grafo1, grafo0);
      assertEquals("Transposed graph must have the same number of vertices", grafo0.numVertices(), grafo1.numVertices());
      // Self-loop should remain in transposed graph
      assertTrue("Self-loop should be present in original graph", grafo0.existeAresta(0, 0));
      assertTrue("Self-loop should be present in transposed graph", grafo1.existeAresta(0, 0));
  }
}