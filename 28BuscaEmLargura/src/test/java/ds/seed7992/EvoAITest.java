package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Grafo focused on basic graph operations.
 * Traceability: REQ-GRAFO-BASIC-1
 *
 * Note: tests are intentionally small and focused on the same call sequences
 * as in the original suite. Each test uses Given-When-Then style comments and
 * descriptive assertion messages to improve diagnosability.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  private static final int VERTICES_313 = 313;
  private static final int VERTICES_6671 = 6671;
  private static final int VERTICES_1371 = 1371;
  private static final int VERTICES_673 = 673;
  private static final int SELF_LOOP_FROM = 0;
  private static final int SELF_LOOP_TO = 0;
  private static final int OTHER_TO = 1;
  private static final int NEG_WEIGHT_6647 = -6647;
  private static final int NEG_WEIGHT_819 = -819;

  /**
   * Given a graph with a large vertex count,
   * When inserting a self-loop and printing,
   * Then the number of vertices remains the initial size.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(6671);
      grafo0.insereAresta(0, 0, 6671);
      grafo0.imprime();
      assertEquals(6671, grafo0.numVertices());
  }

  /**
   * Given a graph with a single inserted edge,
   * When retrieving the next adjacent edge for vertex 0,
   * Then the returned Aresta matches the inserted self-loop properties.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1371);
      grafo0.insereAresta(0, 0, (-819));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(0, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(1371, grafo0.numVertices());
      assertEquals((-819), grafo_Aresta0.peso());
  }

  /**
   * Given a graph with a known number of vertices,
   * When requesting the first adjacency of a vertex that has no edges,
   * Then the number of vertices should remain unchanged.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.primeiroListaAdj(1);
      assertEquals(313, grafo0.numVertices());
  }

  /**
   * Given a graph with a self-loop inserted,
   * When checking for existence of that edge,
   * Then existeAresta should return true and vertex count should be preserved.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(313, grafo0.numVertices());
      assertTrue(boolean0);
  }

  /**
   * Given a graph with no edge between vertex 1 and 0,
   * When checking for that non-existent edge,
   * Then existeAresta should return false and vertex count remains unchanged.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      boolean boolean0 = grafo0.existeAresta(1, 0);
      assertEquals(313, grafo0.numVertices());
      assertFalse(boolean0);
  }

  /**
   * Given a graph where a self-loop has been inserted,
   * When removing that self-loop,
   * Then retiraAresta should return an Aresta with matching properties and the vertex count is preserved.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull(grafo_Aresta0);
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals((-6647), grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(313, grafo0.numVertices());
  }

  /**
   * Given a graph with one self-loop inserted,
   * When attempting to remove a different non-existent edge,
   * Then retiraAresta should return null and vertex count should be unchanged.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1);
      assertNull(grafo_Aresta0);
      assertEquals(313, grafo0.numVertices());
  }

  /**
   * Given a graph constructed with 673 vertices,
   * When querying numVertices,
   * Then it should return the constructor value.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(673);
      int int0 = grafo0.numVertices();
      assertEquals(673, int0);
  }

  /**
   * Given a graph with a self-loop,
   * When creating the transposed graph,
   * Then the transposed graph should be a distinct object and preserve vertex count.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(313);
      grafo0.insereAresta(0, 0, (-6647));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(313, grafo0.numVertices());
      assertEquals(313, grafo1.numVertices());
  }
}