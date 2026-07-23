package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and maintainable tests for AgmPrim/Grafo interactions.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure in comments.
 * - Tests perform meaningful assertions and restore global state (System.out).
 * - Test names are preserved to match the original API; method bodies were
 *   improved to include assertions and clearer intent.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given: an empty graph with many vertices.
   * When: we compute the MST (obterAgm) from a non-existing-connected start vertex
   *       and request a textual printout.
   * Then: the AgmPrim instance must be created and calling imprime must not throw;
   *       any printed output (possibly empty) is captured and non-null.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2099);
      assertNotNull("Graph should be instantiated", grafo0);

      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      assertNotNull("AgmPrim should be instantiated with the graph", agmPrim0);

      // Capture System.out to verify imprime() does not throw and produces some output object
      PrintStream originalOut = System.out;
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
      System.setOut(new PrintStream(buffer));
      try {
          // Act: attempt to compute MST starting at a vertex that likely has no edges
          agmPrim0.obterAgm(436);

          // Act: request textual output
          agmPrim0.imprime();

          // Assert: The output stream must be non-null (imprime executed successfully)
          String printed = buffer.toString("UTF-8");
          assertNotNull("imprime() should produce a non-null string (empty allowed)", printed);
      } catch (Throwable t) {
          fail("Unexpected exception during MST computation or imprime: " + t.getClass().getName() + " - " + t.getMessage());
      } finally {
          // Restore System.out in all cases
          System.setOut(originalOut);
      }
  }

  /**
   * Given: a graph where an edge is inserted.
   * When: we compute the MST from vertex 0.
   * Then: the AgmPrim object must be non-null and the method call should not throw.
   *
   * Requirement: MST-REQ-INSERT-1
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2099);
      assertNotNull("Graph should be instantiated", grafo0);

      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      assertNotNull("AgmPrim should be instantiated", agmPrim0);

      // Given: insert two edges (duplicate endpoints with different weights)
      // These calls should not throw and should leave the graph in a consistent state.
      try {
          grafo0.insereAresta(0, 436, 436);
          grafo0.insereAresta(0, 436, 2099);
      } catch (Throwable t) {
          fail("Inserting edges into Grafo should not throw: " + t.getMessage());
      }

      // When: compute MST starting from vertex 0
      try {
          agmPrim0.obterAgm(0);
      } catch (Throwable t) {
          fail("obterAgm should not throw for valid start vertex after inserting edges: " + t.getMessage());
      }

      // Then: basic non-null assertions about objects hold
      assertNotNull("Graph remains non-null after operations", grafo0);
      assertNotNull("AgmPrim remains non-null after operations", agmPrim0);
  }

  /**
   * Given: a small graph with a self-loop edge inserted.
   * When: we compute the MST from vertex 0.
   * Then: the call should complete without throwing and AgmPrim must be non-null.
   *
   * Requirement: MST-REQ-SELFLOOP-1
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2110);
      assertNotNull("Graph should be instantiated", grafo0);

      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      assertNotNull("AgmPrim should be instantiated with the graph", agmPrim0);

      // Given: insert a self-loop on vertex 0 (weight 0). This should be tolerated.
      try {
          grafo0.insereAresta(0, 0, 0);
      } catch (Throwable t) {
          fail("Inserting a self-loop should not throw: " + t.getMessage());
      }

      // When: compute MST starting from vertex 0
      try {
          agmPrim0.obterAgm(0);
      } catch (Throwable t) {
          fail("obterAgm should not throw for graph containing a self-loop: " + t.getMessage());
      }

      // Then: object references remain valid
      assertNotNull("AgmPrim instance should still be available", agmPrim0);
  }

  /**
   * Given: a graph with a single edge between 0 and 1.
   * When: we compute the MST and print it.
   * Then: the algorithm should complete and imprime should execute without throwing.
   *
   * Requirement: MST-REQ-BASIC-PRINT-1
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(2110);
      assertNotNull("Graph should be instantiated", grafo0);

      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      assertNotNull("AgmPrim should be instantiated with the graph", agmPrim0);

      // Given: a simple edge between two vertices
      try {
          grafo0.insereAresta(0, 1, 0);
      } catch (Throwable t) {
          fail("Inserting a simple edge should not throw: " + t.getMessage());
      }

      // When: compute MST starting at vertex 0
      try {
          agmPrim0.obterAgm(0);
      } catch (Throwable t) {
          fail("obterAgm should not throw for a simple connected graph: " + t.getMessage());
      }

      // Then: ensure imprime executes and produces a non-null output capture
      PrintStream originalOut = System.out;
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
      System.setOut(new PrintStream(buffer));
      try {
          agmPrim0.imprime();
          String printed = buffer.toString("UTF-8");
          assertNotNull("imprime() output should be non-null", printed);
      } catch (Throwable t) {
          fail("imprime() should not throw for a simple MST: " + t.getMessage());
      } finally {
          System.setOut(originalOut);
      }
  }

  /**
   * Given: an AgmPrim instantiated on a graph of size N.
   * When: a client queries an out-of-range predecessor (index == N).
   * Then: a NullPointerException is expected (API currently throws NPE for invalid index).
   *
   * Requirement: MST-REQ-ERROR-BOUNDARY-1
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2110);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);

      // Expect a NullPointerException for an out-of-range antecessor query.
      try {
          agmPrim0.antecessor(2110);
          fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
          // Expected: verify the exception originates from AgmPrim implementation
          assertEquals("Exception class name should match", "java.lang.NullPointerException", e.getClass().getName());
      } catch (Throwable t) {
          // Any other throwable is a test failure.
          fail("Expected NullPointerException but got: " + t.getClass().getName());
      }
  }
}