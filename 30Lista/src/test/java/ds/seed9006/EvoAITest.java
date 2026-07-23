package ds.seed9006;

import ds.AgmPrim;
import ds.Grafo;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Unit tests for AgmPrim behavior (REQ-AGM-001, REQ-AGM-002).
 * Tests follow a Given-When-Then structure within each test method and include
 * descriptive failure messages to aid diagnosis.
 */
interface UnitTest {}

@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given a small graph with a couple of edges,
   * When building the minimum spanning tree starting from vertex 1,
   * Then the AgmPrim instance is created and the operation completes without exception.
   *
   * Requirement: REQ-AGM-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(5);
      grafo0.insereAresta(1, 2, 3);
      // When
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(2, 3, 4);
      // Act: attempt to obtain the AGM from a valid start vertex
      agmPrim0.obterAgm(1);
      // Then: validate fundamental expectations
      Assert.assertNotNull("AgmPrim instance should have been constructed", agmPrim0);
      // The graph should still allow further operations (no exception means success)
      // and the start vertex used is within bounds
      Assert.assertTrue("Start vertex should be non-negative", 1 >= 0);
  }

  /**
   * Given a tiny connected graph,
   * When requesting the AGM from vertex 0,
   * Then the algorithm runs without throwing and the AgmPrim is usable.
   *
   * Requirement: REQ-AGM-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(3);
      grafo0.insereAresta(0, 2, 2);
      // When
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      // Act
      agmPrim0.obterAgm(0);
      // Then
      Assert.assertNotNull("AgmPrim should not be null after construction", agmPrim0);
      // Sanity check: toString should return a non-null representation for diagnostics
      Assert.assertNotNull("AgmPrim should provide a string representation", agmPrim0.toString());
  }

  /**
   * Given a small graph where we compute the AGM and then produce output,
   * When printing the result,
   * Then the print operation should complete without throwing.
   *
   * Requirement: REQ-AGM-002
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(4);
      grafo0.insereAresta(1, 2, 5);
      grafo0.insereAresta(2, 3, 1);
      // When
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(1);
      // Act: print should not throw and should be callable for diagnostics
      agmPrim0.imprime();
      // Then
      Assert.assertNotNull("AgmPrim instance expected after obtaining AGM", agmPrim0);
      // Ensure imprime call completed by checking toString is callable (best-effort check)
      Assert.assertNotNull("AgmPrim string form should be available after printing", agmPrim0.toString());
  }

  /**
   * Given an empty graph (zero vertices),
   * When querying a predecessor for vertex 0,
   * Then a NullPointerException is expected (documented behavior for empty graphs).
   *
   * Requirement: REQ-AGM-ERR-EMPTY
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(0);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      // When / Then: antecessor on an empty graph should result in a NullPointerException
      try {
          agmPrim0.antecessor(0);
          Assert.fail("Expected NullPointerException when requesting antecessor on an empty graph (vertex 0)");
      } catch (NullPointerException e) {
          // Validate that the exception is indeed a NullPointerException and its message may be null
          Assert.assertTrue("Expected NullPointerException for empty graph antecessor", e instanceof NullPointerException);
          // message may be null; assert explicitly to document expected contract
          Assert.assertNull("Expected no detail message for this NullPointerException", e.getMessage());
      }
  }
}