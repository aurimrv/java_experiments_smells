package ds.seed5503;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Grafo core behaviors.
 *
 * Requirement traceability:
 * - REQ:DS-GRAPH-001 - Graph construction preserves vertex count.
 * - REQ:DS-GRAPH-002 - Edge insertion/retreatment maintain expected properties.
 *
 * These tests follow a Given-When-Then style and include descriptive assertion messages
 * to aid diagnostics when failures occur.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a reasonably large graph and a chosen vertex index for insertion
    final int vertexCount = 2450;
    final int v = 298;
    final int w = 298;
    final int weight = 298;

    Grafo grafo0 = new Grafo(vertexCount);

    // When: inserting a self-loop at vertex 298 and calling imprime (should not throw)
    grafo0.insereAresta(v, w, weight);
    grafo0.imprime(); // side effect: printing; ensure it does not throw

    // Then: the number of vertices remains as constructed and the inserted edge exists
    assertEquals("Graph should report the same number of vertices that it was constructed with",
                 vertexCount, grafo0.numVertices());
    assertTrue("Inserted self-loop edge should be reported as existing", grafo0.existeAresta(v, w));

    Grafo.Aresta a = grafo0.proxAdj(v);
    assertNotNull("proxAdj should return the inserted edge for vertex " + v, a);
    assertEquals("Returned edge should have correct source vertex", v, a.v1());
    assertEquals("Returned edge should have correct destination vertex", w, a.v2());
    assertEquals("Returned edge should have correct weight", weight, a.peso());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a graph and an edge to insert that targets the highest index (boundary)
    final int size = 1957;
    final int src = 0;
    final int dst = 1957;
    final int weight = 1957;

    Grafo grafo0 = new Grafo(size);

    // When: insert then remove that exact edge
    grafo0.insereAresta(src, dst, weight);
    Grafo.Aresta removed = grafo0.retiraAresta(src, dst);

    // Then: removal should return a non-null edge with correct properties and the graph size is unchanged
    assertNotNull("retiraAresta should return the removed edge when it exists", removed);
    assertEquals("Removed edge should have original source", src, removed.v1());
    assertEquals("Removed edge should have original destination", dst, removed.v2());
    assertEquals("Removed edge should have original weight", weight, removed.peso());
    assertEquals("Number of vertices must remain unchanged after edge removal", size, grafo0.numVertices());

    // And: the edge should no longer exist in the graph after removal
    assertFalse("Edge should no longer exist after being removed", grafo0.existeAresta(src, dst));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a graph and a self-loop insertion at a boundary index 0
    final int size = 2450;
    final int v = 0;
    final int w = 0;
    final int weight = 2450;

    Grafo grafo0 = new Grafo(size);

    // When: insert a self-loop and query the first adjacent edge
    grafo0.insereAresta(v, w, weight);
    Grafo.Aresta a = grafo0.proxAdj(v);

    // Then: proxAdj should return the inserted self-loop with expected properties
    assertNotNull("proxAdj should return the self-loop that was inserted", a);
    assertEquals("Self-loop source must be 0", v, a.v1());
    assertEquals("Self-loop destination must be 0", w, a.v2());
    assertEquals("Self-loop weight must match insertion", weight, a.peso());
    assertEquals("Vertex count should be unchanged", size, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a newly constructed graph with no edges
    final int size = 78;
    final int vertex = 0;
    Grafo grafo0 = new Grafo(size);

    // When: request the first adjacent edge for a vertex with no edges
    Grafo.Aresta first = grafo0.primeiroListaAdj(vertex);

    // Then: there should be no adjacent edge and vertex count is preserved
    assertNull("primeiroListaAdj should return null for a vertex with no outgoing edges", first);
    assertEquals("Graph must report the number of vertices as constructed", size, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: a graph with no edges created
    final int size = 2450;
    final int src = 0;
    final int dst = 0;
    Grafo grafo0 = new Grafo(size);

    // When: check existence of an edge that was never inserted
    boolean exists = grafo0.existeAresta(src, dst);

    // Then: the edge must not exist and the number of vertices remains correct
    assertFalse("Non-inserted edge should not be reported as existing", exists);
    assertEquals("Vertex count should remain equal to the constructor parameter", size, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a graph and insertion of an edge with a negative weight
    final int size = 2450;
    final int src = 0;
    final int dst = 0;
    final int negativeWeight = -1582;
    Grafo grafo0 = new Grafo(size);

    // When: insert the negative-weight self-loop and query existence and properties
    grafo0.insereAresta(src, dst, negativeWeight);
    boolean exists = grafo0.existeAresta(src, dst);

    // Then: edge must exist and weight should be preserved
    assertTrue("Edge with negative weight should be allowed and reported as existing", exists);
    Grafo.Aresta a = grafo0.retiraAresta(src, dst);
    assertNotNull("retiraAresta should return the negative-weight edge when removing it", a);
    assertEquals("Removed edge must retain negative weight", negativeWeight, a.peso());
    assertEquals("Graph vertex count must remain unchanged after removal", size, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a graph with one known edge
    final int size = 1957;
    final int srcPresent = 0;
    final int dstPresent = 0;
    final int srcAbsent = 0;
    final int dstAbsent = 1957;
    Grafo grafo0 = new Grafo(size);

    // When: insert an edge then attempt to remove a different non-existent edge
    grafo0.insereAresta(srcPresent, dstPresent, 0);
    Grafo.Aresta removedAbsent = grafo0.retiraAresta(srcAbsent, dstAbsent);

    // Then: trying to remove an absent edge should return null and present edge remains
    assertNull("retiraAresta should return null when removing a non-existent edge", removedAbsent);
    assertTrue("Originally inserted edge should still exist after failed removal of a different edge",
               grafo0.existeAresta(srcPresent, dstPresent));

    // Cleanup: remove the originally inserted edge and verify removal works
    Grafo.Aresta removedPresent = grafo0.retiraAresta(srcPresent, dstPresent);
    assertNotNull("retiraAresta should remove and return the existing edge", removedPresent);
    assertEquals("Removed edge should have destination 0", dstPresent, removedPresent.v2());
    assertEquals("Graph vertex count must remain unchanged", size, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: graphs constructed with several sizes including edge cases
    final int midSize = 2450;
    final int zeroSize = 0;
    final int oneSize = 1;

    Grafo grafoMid = new Grafo(midSize);
    Grafo grafoZero = new Grafo(zeroSize);
    Grafo grafoOne = new Grafo(oneSize);

    // Then: each graph must report its configured number of vertices
    assertEquals("Graph constructed with midSize should report that many vertices", midSize, grafoMid.numVertices());
    assertEquals("Graph constructed with zero vertices should report zero", zeroSize, grafoZero.numVertices());
    assertEquals("Graph constructed with one vertex should report one", oneSize, grafoOne.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Given: a graph with a self-loop so transposition should preserve self-loop
    final int size = 2450;
    final int v = 0;
    final int w = 0;
    final int weight = -1582;

    Grafo grafo0 = new Grafo(size);
    grafo0.insereAresta(v, w, weight);

    // When: create the transpose of the graph
    Grafo transposed = grafo0.grafoTransposto();

    // Then: transposed graph must be a distinct instance with the same number of vertices
    assertNotSame("grafoTransposto must return a different object instance", grafo0, transposed);
    assertEquals("Transposed graph must have the same number of vertices as original", size, transposed.numVertices());

    // And: the self-loop should still exist in the transposed graph and preserve weight
    assertTrue("Self-loop should exist in the transposed graph", transposed.existeAresta(v, w));
    Grafo.Aresta a = transposed.proxAdj(v);
    assertNotNull("proxAdj on transposed graph should return the self-loop edge", a);
    assertEquals("Transposed self-loop must preserve source", v, a.v1());
    assertEquals("Transposed self-loop must preserve destination", w, a.v2());
    assertEquals("Transposed self-loop must preserve weight", weight, a.peso());
  }
}