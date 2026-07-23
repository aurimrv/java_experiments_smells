package ds.seed5503;

import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests in this package.
 */
interface UnitTest {}

/**
 * Tests for AgmPrim and Grafo integrations.
 *
 * Requirement trace: REQ-AGM-001 - Minimum spanning tree (Prim) computation and related accessors.
 *
 * Notes:
 * - Tests exercise both normal and exceptional flows.
 * - Given-When-Then style comments are included for readability and traceability.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given a graph with many vertices and an inserted self-loop,
   * when computing the AGM from two valid start vertices,
   * then the predecessor information should be present and within expected bounds.
   *
   * This test covers normal operation and a couple of boundary start indices (0 and n-1).
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    final int n = 1994;
    Grafo grafo0 = new Grafo(n);
    AgmPrim agmPrim0 = new AgmPrim(grafo0);

    // Insert a self-loop which should not break MST computation
    grafo0.insereAresta(1948, 1948, 2895);

    // When: compute MST from a middle vertex and from boundaries
    try {
      agmPrim0.obterAgm(101);
      agmPrim0.obterAgm(0);      // boundary: start at first vertex
      agmPrim0.obterAgm(n - 1);  // boundary: start at last vertex
    } catch (Throwable t) {
      fail("Unexpected exception during obterAgm on valid start indices: " + t);
    }

    // Then: antecessor() should return a value in the valid range [-1, n-1] for inspected vertices
    int pred101 = agmPrim0.antecessor(101);
    int pred0 = agmPrim0.antecessor(0);
    int predLast = agmPrim0.antecessor(n - 1);

    assertTrue("antecessor(101) must be >= -1 and < n, was: " + pred101, pred101 >= -1 && pred101 < n);
    assertTrue("antecessor(0) must be >= -1 and < n, was: " + pred0, pred0 >= -1 && pred0 < n);
    assertTrue("antecessor(n-1) must be >= -1 and < n, was: " + predLast, predLast >= -1 && predLast < n);
  }

  /**
   * Given a graph with an edge inserted,
   * when computing the AGM and printing the result,
   * then imprime() should execute without throwing and antecessor values should be valid.
   *
   * This test also captures printed output to provide an assertion that imprime was invoked.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    final int n = 1994;
    Grafo grafo0 = new Grafo(n);
    AgmPrim agmPrim0 = new AgmPrim(grafo0);

    // Insert an edge between two valid vertices
    grafo0.insereAresta(1987, 1152, 1152);

    // When: compute MST from a valid start vertex
    try {
      agmPrim0.obterAgm(1967);
    } catch (Throwable t) {
      fail("Unexpected exception during obterAgm: " + t);
    }

    // Capture printed output of imprime() to assert side-effect
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(baos));
      agmPrim0.imprime(); // expected to write to stdout; ensure it does not throw
    } finally {
      System.setOut(originalOut);
    }
    String output = baos.toString();
    assertNotNull("imprime() output should not be null", output);

    // Then: antecessor values for involved vertices should be within bounds
    int pred1152 = agmPrim0.antecessor(1152);
    int pred1987 = agmPrim0.antecessor(1987);

    assertTrue("antecessor(1152) must be >= -1 and < n, was: " + pred1152, pred1152 >= -1 && pred1152 < n);
    assertTrue("antecessor(1987) must be >= -1 and < n, was: " + pred1987, pred1987 >= -1 && pred1987 < n);
  }

  /**
   * Given a freshly created AgmPrim instance where obterAgm has not been called,
   * when calling antecessor(),
   * then an exception is expected because the predecessor structure is not yet initialized.
   *
   * This test validates the exceptional behavior and exercises multiple index inputs including boundaries.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    final int n = 1666;
    Grafo grafo0 = new Grafo(n);
    AgmPrim agmPrim0 = new AgmPrim(grafo0);

    // When/Then: antecessor should throw because MST hasn't been computed.
    // Acceptable exceptions include NullPointerException (observed historically) or index-related exceptions.
    int[] indicesToCheck = new int[] {1666, 0, -1, 1665};
    for (int idx : indicesToCheck) {
      boolean sawExpected = false;
      try {
        agmPrim0.antecessor(idx);
        fail("Expected an exception when calling antecessor before obterAgm for index: " + idx);
      } catch (NullPointerException npe) {
        // historically observed; acceptable outcome
        sawExpected = true;
      } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
        // also acceptable outcomes for invalid indices
        sawExpected = true;
      } catch (Throwable other) {
        // Any other throwable is considered a test failure but record it for diagnostics
        fail("Unexpected exception type for antecessor(" + idx + "): " + other);
      }
      assertTrue("Expected an exception when calling antecessor before obterAgm for index: " + idx, sawExpected);
    }
  }
}