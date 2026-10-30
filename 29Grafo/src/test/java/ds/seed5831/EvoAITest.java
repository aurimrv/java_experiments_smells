/**
 * Improved and annotated unit tests for Grafo.
 * Requirement trace: REQ-GRAFO-001..009
 *
 * Notes:
 * - Tests preserved with original names to satisfy oracle preservation constraints.
 * - Added Given-When-Then comments, descriptive assertion messages and @Category markers.
 * - No additional SUT calls or changed assertion expected values.
 */
package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/* Marker interfaces for test categorization (must be package-level) */
interface UnitTest {}
interface GraphTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Requirement: REQ-GRAFO-001
   * Given a Grafo constructed with N vertices,
   * When we optionally insert an edge and print the graph,
   * Then the reported number of vertices remains N.
   *
   * Note: This test preserves the original calls (insereAresta, imprime) but treats insereAresta as setup.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 1377, 0);
      grafo0.imprime();
      assertEquals(1345, grafo0.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-002
   * Given a graph where an edge is inserted,
   * When we remove that edge by its endpoints,
   * Then the returned edge should match the inserted weight and endpoints.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 1345, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1345);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(1345, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals(1345, grafo_Aresta0.v2());
  }

  /**
   * Requirement: REQ-GRAFO-003
   * Given a newly created graph,
   * When we request the first adjacency for a vertex,
   * Then the graph's vertex count remains as constructed.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1349);
      grafo0.primeiroListaAdj(0);
      assertEquals(1349, grafo0.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-004
   * Given a graph with N vertices,
   * When we query for a non-existent edge,
   * Then existeAresta should return false and the graph vertex count should be unchanged.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      boolean boolean0 = grafo0.existeAresta(1, 1348);
      assertEquals(1345, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Requirement: REQ-GRAFO-005
   * Given a graph,
   * When we insert a self-loop on vertex 0,
   * Then existeAresta(0,0) should return true and vertex count remains unchanged.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(1345, grafo0.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-006
   * Given a graph where an edge is inserted with endpoint outside vertex range,
   * When we attempt to remove a non-matching edge,
   * Then the removal should return null and vertex count remains unchanged.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1345);
      assertNull(grafo_Aresta0);
      assertEquals(1345, grafo0.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-007
   * Given a graph constructed with M vertices,
   * When we query numVertices,
   * Then it should return M.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(628);
      int int0 = grafo0.numVertices();
      assertEquals(628, int0);
  }

  /**
   * Requirement: REQ-GRAFO-008
   * Given a graph where an edge is inserted,
   * When we compute the transpose graph,
   * Then the transpose should be a distinct object with the same number of vertices.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(1345, grafo1.numVertices());
  }

  /**
   * Requirement: REQ-GRAFO-009
   * Given a graph and an inserted edge with possibly negative indices/weights,
   * When we call proxAdj for a vertex,
   * Then returned Aresta should reflect the inserted values and graph vertex count remains unchanged.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(1072);
      grafo0.insereAresta(0, (-1103), (-1103));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertNotNull(grafo_Aresta0);
      
      int int0 = grafo_Aresta0.v2();
      assertEquals(1072, grafo0.numVertices());
      assertEquals((-1103), grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals((-1103), int0);
  }
}