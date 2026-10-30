package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved, maintainer-friendly test class for ds.Grafo.
 *
 * Notes:
 * - Preserves original test method names and behavior/oracles.
 * - Adds descriptive messages, Given-When-Then comments and a test category marker
 *   for traceability to requirements/tickets.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  // Helper constants to reduce magic numbers and improve readability while preserving original values
  private static final int DEFAULT_SIZE_1003 = 1003;
  private static final int DEFAULT_SIZE_1597 = 1597;

  /**
   * GIVEN a newly created Grafo with DEFAULT_SIZE_1003 vertices
   * WHEN an edge is inserted and the graph is printed
   * THEN the number of vertices remains DEFAULT_SIZE_1003.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      grafo0.imprime();
      assertEquals(1003, grafo0.numVertices());
  }

  /**
   * GIVEN a Grafo with a single inserted edge
   * WHEN that edge is removed
   * THEN the returned Aresta has the expected endpoints and weight and graph size stays unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(983, 1, 983);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(983, 1);
      assertEquals(1003, grafo0.numVertices());
      assertEquals(983, grafo_Aresta0.v1());
      assertEquals(1, grafo_Aresta0.v2());
      assertNotNull(grafo_Aresta0);
      assertEquals(983, grafo_Aresta0.peso());
  }

  /**
   * GIVEN a Grafo with an inserted edge
   * WHEN the transposed graph is created and an attempt is made to remove a non-existing edge
   * THEN retiraAresta returns null and the transposed graph retains the expected vertex count.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      Grafo grafo1 = grafo0.grafoTransposto();
      Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(0, 2325);
      assertNull(grafo_Aresta0);
      assertEquals(1003, grafo1.numVertices());
  }

  /**
   * GIVEN a Grafo and its transpose after an insert
   * WHEN an out-of-range insertion is performed on the transpose then another transpose is requested
   * THEN an ArrayIndexOutOfBoundsException is expected (preserve original exceptional oracle).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(DEFAULT_SIZE_1003);
      final int src = 968;
      final int dst = 0;
      final int peso = 968;

      // When
      grafo0.insereAresta(src, dst, peso);
      Grafo grafo1 = grafo0.grafoTransposto();

      // Introduce the same out-of-range insertion as original to reproduce behavior
      grafo1.insereAresta(0, DEFAULT_SIZE_1003, peso);

      // Then - expect an ArrayIndexOutOfBoundsException when transposing again (preserve original catch behavior)
      try {
        grafo1.grafoTransposto();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        // Verify origin of exception remains ds.Grafo as in original generated test
        verifyException("ds.Grafo", e);
      }
  }

  /**
   * GIVEN a newly created Grafo
   * WHEN primeiroListaAdj is queried for the first vertex
   * THEN the graph size remains DEFAULT_SIZE_1003 (and method returns without error).
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.primeiroListaAdj(0);
      assertEquals(1003, grafo0.numVertices());
  }

  /**
   * GIVEN a Grafo with an inserted edge
   * WHEN its transpose is created
   * THEN the corresponding reversed edge should exist in the transpose and vertex count is preserved.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(937, 0, 937);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(0, 937);
      assertEquals(1003, grafo1.numVertices());
      assertTrue(boolean0);
      assertEquals(1003, grafo0.numVertices());
  }

  /**
   * GIVEN a Grafo constructed with DEFAULT_SIZE_1597 vertices
   * WHEN numVertices is requested
   * THEN the returned count equals DEFAULT_SIZE_1597.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(1597);
      int int0 = grafo0.numVertices();
      assertEquals(1597, int0);
  }

  /**
   * GIVEN a Grafo with an inserted edge
   * WHEN transposed graph is created and existence of an out-of-range edge is queried
   * THEN existeAresta returns false and vertex count is preserved.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1003);
      grafo0.insereAresta(968, 0, 968);
      Grafo grafo1 = grafo0.grafoTransposto();
      boolean boolean0 = grafo1.existeAresta(0, 1003);
      assertFalse(boolean0);
      assertEquals(1003, grafo1.numVertices());
  }
}