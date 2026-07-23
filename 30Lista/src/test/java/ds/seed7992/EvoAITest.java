package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests in this package.
 */
interface UnitTest {}

/**
 * Improved tests for AgmPrim and Grafo. These tests focus on clear
 * Given-When-Then structure, include assertions, and document expected behavior.
 *
 * Note: This class intentionally keeps the original test method names
 * (test0, test1, test2) to preserve compatibility with the existing test suite.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * REQ-AGM-001
   * Given a large graph and a self-loop inserted on vertex 0,
   * when the minimum spanning tree is requested from vertex 0,
   * then the algorithm should complete without throwing and the objects should be non-null.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2717);
      assertNotNull("Grafo instance should be created", grafo0);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      assertNotNull("AgmPrim instance should be created", agmPrim0);

      // When: insert a trivial self-loop edge and compute MST from vertex 0
      grafo0.insereAresta(0, 0, 0);

      // Then: obterAgm should complete without throwing an exception
      try {
        agmPrim0.obterAgm(0);
      } catch (Exception e) {
        fail("obterAgm should not throw for a graph with a self-loop: " + e);
      }

      // And: antecessor accessor should be callable after computation (should not throw)
      try {
        agmPrim0.antecessor(0);
      } catch (NullPointerException npe) {
        fail("antecessor(0) threw NullPointerException after obterAgm: " + npe);
      } catch (Exception e) {
        // If another exception type is thrown, fail the test with details
        fail("Unexpected exception from antecessor(0): " + e);
      }
  }

  /**
   * REQ-AGM-002
   * Given a medium-sized graph with a single edge between two vertices,
   * when the minimum spanning tree is computed from the source vertex,
   * then the algorithm should complete and printing the result should not throw.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Grafo grafo0 = new Grafo(2630);
      assertNotNull("Grafo instance should be created for test1", grafo0);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      assertNotNull("AgmPrim instance should be created for test1", agmPrim0);

      // When: insert an edge between vertex 18 and 42 and compute MST from 18
      grafo0.insereAresta(18, 42, 18);

      try {
        agmPrim0.obterAgm(18);
      } catch (Exception e) {
        fail("obterAgm should not throw for a graph with a single edge: " + e);
      }

      // Then: imprime should be safe to call (no exception)
      try {
        agmPrim0.imprime();
      } catch (Exception e) {
        fail("imprime() should not throw after obterAgm: " + e);
      }

      // And: antecessor for involved vertex should be callable (no unexpected exceptions)
      try {
        agmPrim0.antecessor(42);
      } catch (Exception e) {
        fail("antecessor(42) should not throw after obterAgm: " + e);
      }
  }

  /**
   * REQ-AGM-003
   * Given an empty graph (zero vertices),
   * when antecessor is requested without computing an MST,
   * then a NullPointerException is expected due to missing internal state.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test2()  throws Throwable  {
      // Given an empty graph
      Grafo grafo0 = new Grafo(0);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);

      // When: requesting antecessor without prior obterAgm on an empty graph
      // Then: a NullPointerException is expected (documented behavior)
      agmPrim0.antecessor(0);
  }
}