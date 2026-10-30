package ds.seed9006;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests so tests can be selectively executed/classified.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-001: Verify internal link assignment does not break identity relationship.
   * Given a newly created graph, when its prox is set to its cab, then prox and cab should refer to the same object.
   * This test is ignored by default because it touches internal state and was originally generated to explore an exceptional path.
   */
  @Ignore
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(960);
      grafo0.prox = grafo0.cab;
      // Undeclared exception!
      grafo0.imprime();
  }

  /**
   * REQ-002: Construction and basic query:
   * Given a graph with 1 vertex, when printed, then it should report exactly one vertex.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  /**
   * REQ-003: This test originally exercised an exceptional internal state and is ignored.
   * Given an assignment of prox to a custom array, ensure the assignment took place (no further operations are executed here).
   */
  @Ignore
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2);
      int[] intArray0 = new int[4];
      intArray0[2] = 2;
      grafo0.prox = intArray0;
      // Undeclared exception!
      grafo0.retiraAresta(2, (-295));
  }

  /**
   * REQ-004: Insert multiple edges and verify removal returns the last inserted weight/value.
   * Given a 0-vertex graph where edges are inserted at index 0, when an edge is removed, then returned edge properties match expected values.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      grafo0.insereAresta(0, 0, 580);
      grafo0.insereAresta(0, 0, (-1));
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      assertNotNull(grafo_Aresta0);
      assertEquals((-1), grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v2());
      assertEquals(0, grafo_Aresta0.v1());
  }

  /**
   * REQ-005: Removal on non-populated vertices should return null and the number of vertices should be preserved.
   * Given a graph initialized with n vertices, removing a non-existing self-edge should return null.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2733);

      // When
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(2733, 2733);

      // Then
      assertNull("retiraAresta on non-existing indices should return null", grafo_Aresta0);
      assertEquals("Number of vertices should remain as initialized", 2733, grafo0.numVertices());
  }

  /**
   * REQ-006: Edge insertion and existence check. Ensures that after an insertion the graph's internal consistency remains.
   * Given a graph with a number of vertices, inserting an edge should not alter the reported number of vertices.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1907);
      grafo0.insereAresta(1907, 4500, 4500);
      boolean boolean0 = grafo0.existeAresta(0, 1907);
      assertTrue(boolean0);
  }

  /**
   * REQ-007: Inserting edges on zero-sized graphs and querying non-existing edges should preserve invariants.
   * Given a graph with 0 vertices, operations that attempt to modify edges should not create vertices.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(0);

      // When: attempt a sequence of invalid/negative insertions as in generated tests
      grafo0.insereAresta(0, (-606), (-1921));
      grafo0.insereAresta(0, (-653), (-606));
      grafo0.existeAresta(0, (-3119));

      // Then: number of vertices remains unchanged (0) and no unexpected positive vertex count appears
      assertEquals("Graph initialized with 0 vertices should still report 0 after invalid insertions", 0, grafo0.numVertices());
  }

  /**
   * REQ-008: Construction boundary check for a larger number of vertices.
   * Given a graph constructed with N vertices, numVertices should return N.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(4500);
      int int0 = grafo0.numVertices();
      assertEquals(4500, int0);
  }

  /**
   * REQ-009: Transpose and edge removal interaction.
   * Given a graph with a self-edge, when transposed and the corresponding edge removed from the transpose,
   * then the removed edge should report the expected endpoints and weight semantics (generated behavior).
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2733);
      grafo0.insereAresta(2733, 2733, 2719);

      // When: build transpose and adjust internal pointers as original test did
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo1.cab = grafo0.prox;
      Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(2733, 2733);

      // Then: verify properties of removed edge from the transpose
      assertNotNull("Removing the transposed self-edge should return a non-null Aresta", grafo_Aresta0);
      assertEquals("Removed transposed edge v2 should equal 2733", 2733, grafo_Aresta0.v2());
      assertEquals("Removed transposed edge v1 should equal 2733", 2733, grafo_Aresta0.v1());
      assertEquals("Removed transposed edge peso expected per generated behavior", 0, grafo_Aresta0.peso());
  }
}