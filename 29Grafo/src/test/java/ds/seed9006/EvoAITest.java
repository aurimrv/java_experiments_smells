package ds.seed9006;

import ds.Grafo;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Unit tests for Grafo focusing on basic graph operations.
 *
 * Requirement traceability: REQ-GRAFO-API
 *
 * These tests were hand-improved from auto-generated origins to include:
 * - clearer Arrange-Act-Assert (Given-When-Then) structure,
 * - descriptive assertion messages,
 * - basic negative/error-path checks where behavior is well-defined (null return for absent edges),
 * - category annotation for selective execution.
 *
 * Note: Method names are kept as originally generated (test0..test8) per constraints.
 */
interface UnitTest {}

@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  private static final int TIMEOUT = 4000;

  /**
   * REQ-GRAFO-API: Constructing a graph should set the vertex count and not mutate it by printing.
   *
   * Given a graph with N vertices,
   * When I print the graph and perform trivial queries,
   * Then the number of vertices should remain N and the graph object should be non-null.
   */
  @Test(timeout = TIMEOUT)
  public void test0()  throws Throwable  {
    // Given
    final int V = 240;
    Grafo grafo0 = new Grafo(V);
    Assert.assertNotNull("Graph instance should be created", grafo0);

    // When
    // Insert an edge with an endpoint outside current vertex range to exercise robustness of insereAresta.
    // The original behavior tolerated this; we assert only on stable invariants.
    grafo0.insereAresta(0, 2016, 0);
    // printing should be a side-effect that does not change number of vertices
    grafo0.imprime();

    // Then
    Assert.assertEquals("Vertex count should remain unchanged after operations", V, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-API: Insert and then remove an edge; removing a non-existent edge should return null.
   *
   * Given a graph,
   * When I insert a self-loop and then remove it,
   * Then the removed edge should match inserted values and subsequent removal of absent edges returns null.
   */
  @Test(timeout = TIMEOUT)
  public void test1()  throws Throwable  {
    // Given
    final int V = 1165;
    final int from = 0;
    final int to = 0;
    final int peso = -449;
    Grafo grafo0 = new Grafo(V);

    // When - insert and remove the same edge
    grafo0.insereAresta(from, to, peso);
    Grafo.Aresta removed = grafo0.retiraAresta(from, to);

    // Then - validate removed edge and invariants
    Assert.assertNotNull("Removed edge should not be null after insertion", removed);
    Assert.assertEquals("Removed edge source should match inserted", from, removed.v1());
    Assert.assertEquals("Removed edge target should match inserted", to, removed.v2());
    Assert.assertEquals("Removed edge weight should match inserted", peso, removed.peso());
    Assert.assertEquals("Vertex count should be unchanged after removal", V, grafo0.numVertices());

    // Negative path: removing a non-existing edge should return null
    Grafo.Aresta absent = grafo0.retiraAresta(1, 1);
    Assert.assertNull("Removing a non-existent edge should return null", absent);
  }

  /**
   * REQ-GRAFO-API: Retrieving the next adjacent edge should reflect the inserted adjacency.
   *
   * Given a graph with an inserted adjacency,
   * When proxAdj is invoked for that vertex,
   * Then it should return the edge previously inserted and existence query should be true.
   */
  @Test(timeout = TIMEOUT)
  public void test2()  throws Throwable  {
    // Given
    final int V = 1165;
    final int u = 0;
    final int v = 0;
    final int peso = -435;
    Grafo grafo0 = new Grafo(V);

    // When
    grafo0.insereAresta(u, v, peso);
    Grafo.Aresta a = grafo0.proxAdj(u);

    // Then
    Assert.assertNotNull("proxAdj should return the adjacency just inserted", a);
    Assert.assertEquals("proxAdj should report correct source vertex", u, a.v1());
    Assert.assertEquals("proxAdj should report correct target vertex", v, a.v2());
    Assert.assertEquals("proxAdj should report correct weight", peso, a.peso());
    Assert.assertEquals("Vertex count remains as constructed", V, grafo0.numVertices());
    Assert.assertTrue("Inserted edge should be reported as existing", grafo0.existeAresta(u, v));
  }

  /**
   * REQ-GRAFO-API: primeiroListaAdj should be callable without throwing and should not change vertex count.
   *
   * Given a freshly constructed graph,
   * When primeiroListaAdj is invoked for a valid vertex,
   * Then it should not alter the graph's vertex count.
   */
  @Test(timeout = TIMEOUT)
  public void test3()  throws Throwable  {
    // Given
    final int V = 1165;
    final int vertex = 0;
    Grafo grafo0 = new Grafo(V);

    // When - call primeiroListaAdj (behavior: prepare adjacency iteration; should not throw)
    grafo0.primeiroListaAdj(vertex);

    // Then - basic invariant
    Assert.assertEquals("primeiroListaAdj should not change the number of vertices", V, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-API: existeAresta should return false when no edge was inserted.
   *
   * Given a new graph,
   * When querying an adjacency that was not created,
   * Then existeAresta should be false.
   */
  @Test(timeout = TIMEOUT)
  public void test4()  throws Throwable  {
    // Given
    final int V = 240;
    Grafo grafo0 = new Grafo(V);

    // When
    boolean exists = grafo0.existeAresta(0, 0);

    // Then
    Assert.assertFalse("No edges created yet; existeAresta(0,0) should be false", exists);
    Assert.assertEquals("Vertex count should match constructor", V, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-API: After inserting an edge, existeAresta should return true and removal should return the edge.
   *
   * Given a graph,
   * When a zero-weight self-loop is inserted,
   * Then the edge should exist and be removable with the original weight.
   */
  @Test(timeout = TIMEOUT)
  public void test5()  throws Throwable  {
    // Given
    final int V = 240;
    final int u = 0;
    final int v = 0;
    final int peso = 0;
    Grafo grafo0 = new Grafo(V);

    // When - insert
    grafo0.insereAresta(u, v, peso);

    // Then - existence and removal checks
    Assert.assertTrue("Edge should exist after insertion", grafo0.existeAresta(u, v));
    Grafo.Aresta removed = grafo0.retiraAresta(u, v);
    Assert.assertNotNull("retiraAresta should return the previously inserted edge", removed);
    Assert.assertEquals("Removed edge weight should be as inserted", peso, removed.peso());
    Assert.assertFalse("Edge should no longer exist after removal", grafo0.existeAresta(u, v));
    Assert.assertEquals("Vertex count should remain stable", V, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-API: Attempting to remove a non-existent adjacency should return null while existing adjacencies remain.
   *
   * Given a graph with one inserted edge,
   * When attempting to remove an unrelated edge,
   * Then the call returns null and the original edge remains present.
   */
  @Test(timeout = TIMEOUT)
  public void test6()  throws Throwable  {
    // Given
    final int V = 1165;
    Grafo grafo0 = new Grafo(V);
    grafo0.insereAresta(0, 0, -449);

    // When - try to remove an edge that wasn't added
    Grafo.Aresta removed = grafo0.retiraAresta(0, 41);

    // Then
    Assert.assertNull("Removing a non-existent edge should return null", removed);
    Assert.assertEquals("Graph vertex count remains unchanged", V, grafo0.numVertices());
    Assert.assertTrue("Previously inserted edge should still exist", grafo0.existeAresta(0, 0));
  }

  /**
   * REQ-GRAFO-API: Constructor should set the number of vertices as provided.
   *
   * Given a desired vertex count,
   * When constructing the graph,
   * Then numVertices should return that count.
   */
  @Test(timeout = TIMEOUT)
  public void test7()  throws Throwable  {
    // Given
    final int V = 212;

    // When
    Grafo grafo0 = new Grafo(V);

    // Then
    Assert.assertEquals("Constructor should set the number of vertices", V, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-API: Transposing a graph produces a distinct Grafo object with the same vertex count and corresponding edges.
   *
   * Given a graph with a self-loop,
   * When producing the graph transpose,
   * Then a different graph object is returned with equal vertex count and the self-loop preserved.
   */
  @Test(timeout = TIMEOUT)
  public void test8()  throws Throwable  {
    // Given
    final int V = 1165;
    Grafo g = new Grafo(V);
    g.insereAresta(0, 0, -449);

    // When
    Grafo transposed = g.grafoTransposto();

    // Then
    Assert.assertNotNull("Transposed graph should not be null", transposed);
    Assert.assertNotSame("Transposed graph should be a different instance", transposed, g);
    Assert.assertEquals("Transposed graph should have same number of vertices", g.numVertices(), transposed.numVertices());
    // For a self-loop, the transpose should also contain the same self-loop
    Assert.assertTrue("Self-loop should be preserved in the transposed graph", transposed.existeAresta(0, 0));
  }
}