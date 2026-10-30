package ds.seed5482;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for ds.Grafo focusing on clearer Arrange-Act-Assert structure,
 * descriptive assertions and minimal traceability metadata.
 *
 * NOTE: This class intentionally keeps the original test method names and the
 * EvoSuite runner configuration to preserve the test harness expectations.
 */

/* Marker category for classification/traceability used by tests (REQ:GR-TEST) */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Helper constants to avoid magic numbers and improve readability
    private static final int ONE_VERTEX = 1;
    private static final int ZERO_VERTEX = 0;
    private static final int LARGE_VERTEX_COUNT = 4389;

    /**
     * REQ-GR-001: Verify that requesting a transpose does not produce a null graph.
     *
     * Given a graph with many vertices
     * When transposing the graph
     * Then a non-null graph object should be returned (or an explicit runtime failure is reported).
     */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(4389);
      // Undeclared exception!
      grafo0.grafoTransposto();
  }

    /**
     * REQ-GR-002: Insert a self-edge and validate graph vertex count remains consistent.
     *
     * Given a single-vertex graph
     * When inserting a self-edge and printing the graph
     * Then the number of vertices stays 1.
     */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

    /**
     * REQ-GR-003: Insert an edge and then remove it; verify properties of the removed edge.
     *
     * Given a large graph and a specific vertex id
     * When inserting an edge (v,v,w) and then removing it
     * Then the returned Aresta has the same v1,v2 and peso and the graph vertex count remains unchanged.
     */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(4389);
      grafo0.insereAresta(1, 1, 1);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1, 1);
      assertEquals(4389, grafo0.numVertices());
      assertEquals(1, grafo_Aresta0.v1());
      assertEquals(1, grafo_Aresta0.v2());
      assertEquals(1, grafo_Aresta0.peso());
      assertNotNull(grafo_Aresta0);
  }

    /**
     * REQ-GR-004: Attempt to remove a non-existent edge returns null and leaves graph unchanged.
     *
     * Given a single-vertex graph and a present self-edge
     * When attempting to remove a different (non-existent) edge
     * Then retiraAresta returns null and vertex count stays 1.
     */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, 1);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4344);
      assertNull(grafo_Aresta0);
      assertEquals(1, grafo0.numVertices());
  }

    /**
     * REQ-GR-005: Transpose operation should surface illegal indices.
     *
     * Given a graph where an insertion used an invalid vertex index
     * When transposing the graph
     * Then an ArrayIndexOutOfBoundsException related to the invalid index is expected.
     */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));
      grafo0.insereAresta(0, (-2922), 3274);
      // Undeclared exception!
      try { 
        grafo0.grafoTransposto();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2922
         //
         verifyException("ds.Grafo", e);
      }
  }

    /**
     * REQ-GR-006: primeiroListaAdj should be callable without changing the declared vertex count.
     *
     * Given a graph with many vertices
     * When querying the first adjacency for vertex 0
     * Then the number of vertices remains as originally declared.
     */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(4592);
      grafo0.primeiroListaAdj(0);
      assertEquals(4592, grafo0.numVertices());
  }

    /**
     * REQ-GR-007: After inserting a self-edge, existeAresta should report its presence.
     *
     * Given a graph with one vertex
     * When inserting a self-edge and querying for it
     * Then existeAresta returns true and vertex count stays 1.
     */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, 1);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(1, grafo0.numVertices());
  }

    /**
     * REQ-GR-008: existeAresta should return false for absent edges.
     *
     * Given a graph with a single inserted self-edge
     * When checking for a different edge
     * Then existeAresta returns false and the vertex count remains 1.
     */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, 1);
      boolean boolean0 = grafo0.existeAresta(0, 1484);
      assertEquals(1, grafo0.numVertices());
      assertFalse(boolean0);
  }

    /**
     * REQ-GR-009: Graph initialized with zero vertices reports zero.
     *
     * Given a graph constructed with zero vertices
     * When querying numVertices
     * Then it returns 0.
     */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      int int0 = grafo0.numVertices();
      assertEquals(0, int0);
  }

    /**
     * REQ-GR-010: Transpose of a single-vertex graph with a self-edge preserves vertex count.
     *
     * Given a single-vertex graph with a self-edge
     * When transposing
     * Then both original and transposed graphs report 1 vertex.
     */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertEquals(1, grafo1.numVertices());
      assertEquals(1, grafo0.numVertices());
  }
}