package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to categorize tests as unit tests.
 * Placed at package scope so it can be referenced by @Category on the test class and methods.
 */
interface UnitTest {}

/**
 * Improved version of the generated EvoSuite tests for Grafo.
 *
 * Notes:
 * - Preserves original  and EvoRunnerParameters as required.
 * - Keeps the same test method names and their original interactions with Grafo to preserve oracles.
 * - Adds descriptive Javadoc, Given-When-Then comments, @Category, and assertion messages to improve clarity.
 */
 
 
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-DS-001: Verify that inserting an edge and invoking imprime() does not change the number of vertices.
   *
   * Given a fresh Grafo,
   * When an edge (0->0) with weight 0 is inserted and the graph is printed,
   * Then the number of vertices remains 100.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      grafo0.imprime();
      assertEquals(100, grafo0.numVertices());
  }

  /**
   * REQ-DS-002: Verify inserting and then removing an inserted edge yields the expected Aresta instance.
   *
   * Given a fresh Grafo,
   * When an edge (0->0) with weight 0 is inserted and then removed,
   * Then the removed Aresta should contain the original endpoints and weight and the graph should retain 100 vertices.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertEquals(100, grafo0.numVertices());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v1());
  }

  /**
   * REQ-DS-003: Verify primeiroListaAdj can be invoked without changing vertex count.
   *
   * Given a fresh Grafo,
   * When primeiroListaAdj is called for vertex index 1,
   * Then the number of vertices remains 100.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.primeiroListaAdj(1);
      assertEquals(100, grafo0.numVertices());
  }

  /**
   * REQ-DS-004: Verify existeAresta returns false for a non-existent edge and vertex count is unchanged.
   *
   * Given a fresh Grafo,
   * When checking existence of an edge that was never inserted,
   * Then existeAresta should return false and the number of vertices should be 100.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      boolean boolean0 = grafo0.existeAresta(0, 239);
      assertEquals(100, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * REQ-DS-005: Verify existeAresta returns true after inserting the corresponding edge.
   *
   * Given a fresh Grafo,
   * When an edge (0->0) is inserted,
   * Then existeAresta(0,0) should return true and vertex count should be 100.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(100, grafo0.numVertices());
  }

  /**
   * REQ-DS-006: Verify retiraAresta returns null when asked to remove a non-existent edge.
   *
   * Given a fresh Grafo with one inserted edge (0->0),
   * When retiraAresta is called for a vertex pair that does not exist (0, -74),
   * Then the result should be null and the number of vertices should be unchanged.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-74));
      assertNull(grafo_Aresta0);
      assertEquals(100, grafo0.numVertices());
  }

  /**
   * REQ-DS-007: Verify numVertices reports the expected default value on a fresh graph.
   *
   * Given a fresh Grafo,
   * When numVertices is queried,
   * Then it should return 100.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      int int0 = grafo0.numVertices();
      assertEquals(100, int0);
  }

  /**
   * REQ-DS-008: Verify grafoTransposto returns a distinct Grafo instance representing the transpose.
   *
   * Given a fresh Grafo with an inserted self-edge (0->0),
   * When grafoTransposto is created,
   * Then the resulting Grafo should not be the same instance and should report 100 vertices.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(100, grafo1.numVertices());
  }

  /**
   * REQ-DS-009: Verify proxAdj returns the expected adjacent Aresta after inserting an edge with negative weight.
   *
   * Given a fresh Grafo,
   * When an edge (0->1) with weight -1 is inserted and proxAdj(0) is invoked,
   * Then the returned Aresta should reflect the inserted edge's endpoints and weight, and vertex count remains 100.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo();
      grafo0.insereAresta(0, 1, (-1));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(1, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(100, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals((-1), grafo_Aresta0.peso());
  }
}