package ds.seed5831;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.AgmPrim;
import ds.Grafo;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for AgmPrim and Grafo functionality.
 *
 * Traceability: REQ-AGM-1 - Minimum Spanning Tree construction should
 * produce a valid predecessor array for all vertices in the graph.
 *
 * These tests exercise typical and boundary inputs and validate basic
 * invariants (no exceptions on valid input, predecessors in valid range,
 * exceptional behavior when AgmPrim is constructed with a null graph).
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given a small connected graph,
   * When obtaining the AGM from a valid start vertex,
   * Then each predecessor reported must be a valid index (-1..n-1)
   * and at least one vertex (other than the root) should have a concrete predecessor.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    final int n = 3;
    Grafo grafo = new Grafo(n);
    // Create a simple triangle with distinct weights
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 2);
    grafo.insereAresta(0, 2, 3);

    AgmPrim agm = new AgmPrim(grafo);

    // When
    // choose a boundary-valid start vertex (0)
    agm.obterAgm(0);
    // imprime() is expected to be side-effecting (e.g., print to stdout); ensure it does not throw
    agm.imprime();

    // Then
    // All predecessors must be within [-1, n-1]
    int concretePredecessors = 0;
    for (int i = 0; i < n; i++) {
      int pred = agm.antecessor(i);
      assertTrue("Predecessor for vertex " + i + " must be >= -1, but was " + pred, pred >= -1);
      assertTrue("Predecessor for vertex " + i + " must be < " + n + ", but was " + pred, pred < n);
      if (pred >= 0) {
        concretePredecessors++;
      }
    }
    assertTrue("Expected at least one concrete predecessor in MST (besides possible root)", concretePredecessors >= 1);
  }

  /**
   * Given a graph with duplicate edges between the same vertices,
   * When obtaining the AGM,
   * Then the algorithm should run without error and produce valid predecessor indices.
   * This test also ensures that multiple insertions (including duplicates) are tolerated.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    final int n = 3;
    Grafo grafo = new Grafo(n);
    // Duplicate edges between 0 and 1 with different weights
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 1, 5);
    grafo.insereAresta(1, 2, 1);

    AgmPrim agm = new AgmPrim(grafo);

    // When
    agm.obterAgm(0);

    // Then
    // Validate predecessor invariants
    int concretePredecessors = 0;
    for (int i = 0; i < n; i++) {
      int pred = agm.antecessor(i);
      assertTrue("Predecessor for vertex " + i + " must be >= -1, but was " + pred, pred >= -1);
      assertTrue("Predecessor for vertex " + i + " must be < " + n + ", but was " + pred, pred < n);
      if (pred >= 0) {
        concretePredecessors++;
      }
    }
    // Expect at least two vertices to be connected via predecessors in this small connected graph
    assertTrue("Expected the MST to connect vertices; found only " + concretePredecessors + " predecessors", concretePredecessors >= 2);

    // Additionally assert that node 1 is connected to either 0 or 2 (sanity for this small graph)
    int p1 = agm.antecessor(1);
    assertTrue("Predecessor of vertex 1 should be one of the other vertices", p1 == 0 || p1 == 2 || p1 == -1);
  }

  /**
   * Given a graph and requesting the AGM using a boundary start vertex (last index),
   * When obtaining the AGM,
   * Then the method should complete and return valid predecessor indices for all vertices.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    final int n = 4;
    Grafo grafo = new Grafo(n);
    // Build a small connected-ish graph (leave one vertex optionally less connected)
    grafo.insereAresta(0, 1, 2);
    grafo.insereAresta(1, 2, 2);
    // vertex 3 can be connected to test various scenarios
    grafo.insereAresta(2, 3, 3);

    AgmPrim agm = new AgmPrim(grafo);

    // When: choose the last valid index as start (boundary)
    agm.obterAgm(n - 1);

    // Then: all predecessors within valid bounds
    int concretePredecessors = 0;
    for (int i = 0; i < n; i++) {
      int pred = agm.antecessor(i);
      assertTrue("Predecessor for vertex " + i + " must be >= -1, but was " + pred, pred >= -1);
      assertTrue("Predecessor for vertex " + i + " must be < " + n + ", but was " + pred, pred < n);
      if (pred >= 0) {
        concretePredecessors++;
      }
    }
    assertTrue("Expected at least one connected edge in MST (concrete predecessor count)", concretePredecessors >= 1);
  }

  /**
   * Given an AgmPrim constructed with a null Grafo,
   * When calling antecessor with an arbitrary index,
   * Then a NullPointerException is expected (fail-fast behavior).
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    AgmPrim agm = new AgmPrim((Grafo) null);
    try {
      // Use an out-of-band index to invoke internal logic; the important part is that NPE is thrown
      agm.antecessor(-1);
      fail("Expected NullPointerException when AgmPrim is constructed with null graph and antecessor() is called");
    } catch (NullPointerException npe) {
      // Expected outcome; provide an assertion for clarity
      assertNull("NullPointerException should not carry a non-null message in this implementation", npe.getMessage());
    }
  }
}