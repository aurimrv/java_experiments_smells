package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing these tests.
 */
interface UnitTest {}

/**
 * Improved and documented version of the original EvoSuite-generated tests.
 *
 * Notes:
 * - Each test follows a Given-When-Then comment structure to aid readability.
 * - Assertion messages were added to make failures easier to diagnose.
 * - Class is categorized as UnitTest for selective execution.
 *
 * Traceability: REQ-GRAFO-001..010 (example mapping for test maintenance).
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: a graph with a fixed number of vertices
      Grafo grafo0 = new Grafo(890);
      // When: attempt to insert an edge that is out of the declared vertex range and print graph
      grafo0.insereAresta(953, 890, 0);
      grafo0.imprime();
      // Then: the number of vertices remains as constructed
      assertEquals("Expected number of vertices to remain 890 after operations", 890, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a minimal graph with 2 vertices
      Grafo grafo0 = new Grafo(2);
      // When: insert an edge (used as setup) and then attempt to remove an edge at indices (2,2)
      grafo0.insereAresta(0, 0, 381);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(2, 2);
      // Then: validate returned Aresta properties remain as expected
      assertEquals("v1 of returned edge should be 2", 2, grafo_Aresta0.v1());
      assertEquals("v2 of returned edge should be 2", 2, grafo_Aresta0.v2());
      assertNotNull("Returned Aresta should not be null", grafo_Aresta0);
      assertEquals("Peso of returned edge should be 0", 0, grafo_Aresta0.peso());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Requirement: REQ-GRAFO-002
      // Given: a large graph instance
      Grafo grafo0 = new Grafo(3383);
      // When: attempt to remove an edge with an invalid negative second index
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-582));
      // Then: number of vertices remains unchanged and no edge is returned
      assertEquals("Number of vertices should remain 3383 after invalid removal", 3383, grafo0.numVertices());
      assertNull("retiraAresta should return null for invalid indices", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a graph with a custom prox array such that an out-of-bounds access will occur
      Grafo grafo0 = new Grafo(1849);
      int[] intArray0 = new int[3];
      intArray0[0] = 1849;
      grafo0.prox = intArray0;
      // When / Then: calling retiraAresta with indices that trigger ArrayIndexOutOfBoundsException
      try {
        // Act
        grafo0.retiraAresta(0, 2);
        // If no exception, fail the test explicitly
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        // Verify the exception originates from ds.Grafo (keeps original oracle)
        verifyException("ds.Grafo", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given: a graph whose internal prox array is smaller than expected to force an exception
      Grafo grafo0 = new Grafo(2642);
      int[] intArray0 = new int[9];
      intArray0[0] = 2642;
      grafo0.prox = intArray0;
      // When / Then: calling retiraAresta on indices that will raise ArrayIndexOutOfBoundsException
      try {
        grafo0.retiraAresta(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        // Preserve original exception verification behavior
        verifyException("ds.Grafo", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(3383);
      grafo0.insereAresta(0, 0, 3383);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertEquals(3383, grafo0.numVertices());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(3383);
      grafo0.insereAresta(0, 1494, (-45));
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given: a graph created with 2 vertices
      Grafo grafo0 = new Grafo(2);
      // When: querying number of vertices
      int int0 = grafo0.numVertices();
      // Then: expect exactly 2 vertices
      assertEquals("Graph constructed with 2 vertices should report 2", 2, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(4500);
      grafo0.insereAresta(4500, (-1), (-3371));
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo0, grafo1);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Given: an empty graph (0 vertices)
      Grafo grafo0 = new Grafo(0);
      // When: attempting to remove an edge in the empty graph
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
      // Then: verify the returned Aresta details and graph size remain 0
      assertNotNull("retiraAresta on empty graph should return a placeholder Aresta, not null", grafo_Aresta0);
      int int0 = grafo_Aresta0.v2();
      assertEquals("Graph should report 0 vertices", 0, grafo0.numVertices());
      assertEquals("v2 of returned Aresta should be 0", 0, int0);
      assertEquals("v1 of returned Aresta should be 0", 0, grafo_Aresta0.v1());
  }
}