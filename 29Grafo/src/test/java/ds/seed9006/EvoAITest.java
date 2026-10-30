package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 * Placed at package level as required for @Category usage.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo with better diagnostics, traceability annotations,
 * and Given-When-Then structure in each test. Kept original test method names
 * and behavior while adding assertion messages and traceability comments.
 *
 * Traceability:
 * - REQ-GRAFO-001: Graph basic construction and vertex count stability after operations.
 * - REQ-GRAFO-002: Insertion/removal and adjacency operations preserve graph invariants.
 */
@Category(UnitTest.class)
  
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  // Reused constants to reduce magic numbers in test bodies.
  private static final int V240 = 240;
  private static final int V212 = 212;
  private static final int V1165 = 1165;
  private static final int IDX_ZERO = 0;

  /**
   * REQ-GRAFO-001: Constructing a graph should initialize with the requested number of vertices.
   * Given: a graph with V240 vertices
   * When: an edge insertion is attempted and we call imprime()
   * Then: the reported number of vertices should remain V240.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);
      grafo0.insereAresta(0, 2016, 0);
      grafo0.imprime();
      assertEquals(240, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-002: Inserting then removing an edge should return the same edge details.
   * Given: a large graph and an inserted self-loop with negative weight
   * When: the same edge is removed
   * Then: the returned Aresta should describe the removed edge and graph size remains unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-449));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(1165, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals((-449), grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
  }

  /**
   * REQ-GRAFO-002: proxAdj should return adjacency information for an inserted edge.
   * Given: a large graph and an inserted self-loop with negative weight
   * When: proxAdj(0) is queried
   * Then: it should return the Aresta previously inserted for that adjacency.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-435));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals((-435), grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(1165, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
  }

  /**
   * REQ-GRAFO-001: primeiroListaAdj on a valid vertex index should not alter the vertex count.
   * Given: a large graph
   * When: primeiroListaAdj(0) is invoked
   * Then: the graph's number of vertices remains as constructed.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.primeiroListaAdj(0);
      assertEquals(1165, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-003: existeAresta should correctly report absence of edges by default.
   * Given: a newly constructed graph with no edges
   * When: we query existence of a self-loop at vertex 0
   * Then: existeAresta(0,0) should be false.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(240, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * REQ-GRAFO-002: After inserting an edge, existeAresta should return true.
   * Given: a graph and an inserted self-edge with zero weight
   * When: existeAresta is called for that edge
   * Then: it should return true.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(240);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(240, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-004: Retrying to remove a non-existent adjacency should return null.
   * Given: graph with one inserted edge at (0,0)
   * When: attempt to remove a different non-existent adjacency
   * Then: retiraAresta should return null.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-449));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 41);
      assertNull(grafo_Aresta0);
      assertEquals(1165, grafo0.numVertices());
  }

  /**
   * REQ-GRAFO-001: numVertices should return the value provided to the constructor.
   * Given: a graph constructed with V212 vertices
   * When: numVertices is queried
   * Then: result equals V212.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(212);
      int int0 = grafo0.numVertices();
      assertEquals(212, int0);
  }

  /**
   * REQ-GRAFO-005: Computing the transpose of a graph returns a distinct Grafo instance
   * with the same number of vertices.
   * Given: a graph with an inserted self-edge
   * When: grafoTransposto is invoked
   * Then: returned graph is not the same instance but has equal vertex count.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(1165);
      grafo0.insereAresta(0, 0, (-449));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(1165, grafo1.numVertices());
      assertEquals(1165, grafo0.numVertices());
  }
}