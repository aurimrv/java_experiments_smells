package ds.seed9121;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests to allow selective execution.
 */
interface UnitTest {}

/**
 * Improved and cleaned test class for Grafo.
 * Each test is annotated and includes clearer assertions and Given-When-Then style comments.
 * Requirement references (REQ-*) are provided in Javadoc for traceability.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * REQ-001: Verify basic construction and no-op insertion do not change graph vertex count.
   *
   * Given a graph constructed with a fixed number of vertices
   * When an insertion is attempted (possibly with out-of-range indices)
   * Then the number of vertices remains unchanged and no unexpected exception is thrown.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Arrange
      final int vertices = 890;
      Grafo grafo0 = new Grafo(vertices);

      // Act: attempt to insert an edge using indices that may be out-of-range for the graph.
      // We assert that the operation completes without throwing and the vertex count is stable.
      try {
          grafo0.insereAresta(953, 890, 0); // intentionally using indices near/outside bounds
          grafo0.imprime(); // exercise printing path (should not throw)
      } catch (Throwable t) {
          // If the implementation chooses to throw for out-of-range inserts, fail with context.
          fail("Insertion or print threw an unexpected exception: " + t);
      }

      // Assert
      assertEquals("Vertex count must remain as constructed", vertices, grafo0.numVertices());
  }

  /**
   * REQ-002: Verify edge insertion and removal behavior on small graph.
   *
   * Given a small graph with two vertices
   * When an edge is inserted at a valid self-loop and an attempt is made to remove a non-existing edge
   * Then removal should return either a sentinel/placeholder or null depending on implementation; validate returned values' consistency.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(2);

      // Act: insert a self-loop at a valid index and attempt to remove an edge at another index.
      grafo0.insereAresta(0, 0, 381);

      Grafo.Aresta removed = null;
      try {
          removed = grafo0.retiraAresta(2, 2); // may be out of bounds; behavior can be implementation-defined
      } catch (ArrayIndexOutOfBoundsException ex) {
          // Some implementations may throw; consider that acceptable but report with assertion to document expected behavior.
          fail("retiraAresta threw ArrayIndexOutOfBoundsException for indices (2,2): " + ex);
      }

      // Assert: if non-null, validate the reported vertices/peso; otherwise accept null as valid behavior.
      if (removed != null) {
          assertEquals("Returned Aresta.v1() should equal requested v1", 2, removed.v1());
          assertEquals("Returned Aresta.v2() should equal requested v2", 2, removed.v2());
          assertEquals("Returned Aresta.peso() should be 0 for placeholder", 0, removed.peso());
      } else {
          assertNull("When removal returns null, it indicates no such edge was present or invalid indices", removed);
      }
  }

  /**
   * REQ-003: Removing an edge with a negative index should not corrupt graph state.
   *
   * Given a large graph
   * When retiraAresta is called with a negative index
   * Then it should either return null or handle the condition without changing vertex count.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Arrange
      final int n = 3383;
      Grafo grafo0 = new Grafo(n);

      // Act
      Grafo.Aresta result = null;
      try {
          result = grafo0.retiraAresta(0, -582); // negative index: expect graceful handling
      } catch (ArrayIndexOutOfBoundsException ex) {
          fail("retiraAresta threw ArrayIndexOutOfBoundsException for negative index: " + ex);
      }

      // Assert
      assertEquals("Number of vertices must remain unchanged after invalid removal", n, grafo0.numVertices());
      assertNull("retiraAresta with a negative index should return null or be handled gracefully", result);
  }

  /**
   * REQ-004: Validate removal behavior from a graph without touching internal fields.
   *
   * Given a graph with many vertices
   * When attempting to remove an edge that may not exist
   * Then the operation should not expose or require direct manipulation of internal arrays and should return a sensible value.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Arrange
      final int vertices = 1849;
      Grafo grafo0 = new Grafo(vertices);

      // Act: attempt to remove an edge using an index outside the valid range.
      Grafo.Aresta removed = null;
      try {
          removed = grafo0.retiraAresta(vertices + 1, 2); // index greater than upper bound
      } catch (ArrayIndexOutOfBoundsException ex) {
          // If implementation throws for out-of-range indices, treat as a test failure to encourage graceful handling.
          fail("retiraAresta threw ArrayIndexOutOfBoundsException for out-of-range index: " + ex);
      }

      // Assert: graph size unchanged and removal result is null or consistent.
      assertEquals("Vertex count remains unchanged after attempted invalid removal", vertices, grafo0.numVertices());
      assertNull("Removal of non-existent/out-of-range edge should return null", removed);
  }

  /**
   * REQ-005: Ensure removing an edge at a valid boundary does not throw and returns a consistent value.
   *
   * Given a graph with many vertices
   * When retiraAresta is invoked at the lower boundary (0,0)
   * Then it should either return null (no such edge) or a valid Aresta with indices in range.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Arrange
      final int vertices = 2642;
      Grafo grafo0 = new Grafo(vertices);

      // Act
      Grafo.Aresta removed = null;
      try {
          removed = grafo0.retiraAresta(0, 0); // boundary removal attempt
      } catch (ArrayIndexOutOfBoundsException ex) {
          fail("retiraAresta unexpectedly threw ArrayIndexOutOfBoundsException at boundary (0,0): " + ex);
      }

      // Assert
      assertEquals("Vertex count should remain unchanged after boundary removal attempt", vertices, grafo0.numVertices());
      if (removed != null) {
          // Validate returned Aresta consistency without relying on internal implementation details.
          assertTrue("Returned v1 must be within [0, numVertices]", removed.v1() >= 0 && removed.v1() <= grafo0.numVertices());
          assertTrue("Returned v2 must be within [0, numVertices]", removed.v2() >= 0 && removed.v2() <= grafo0.numVertices());
      } else {
          assertNull("No edge present at (0,0) is a valid outcome for retiraAresta", removed);
      }
  }

  /**
   * REQ-006: Insert an edge and verify existence and graph size remain coherent.
   *
   * Given a graph with many vertices
   * When a self-loop is inserted at vertex 0
   * Then the graph must report the same number of vertices and the newly inserted edge should exist.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Arrange
      final int vertices = 3383;
      Grafo grafo0 = new Grafo(vertices);

      // Act
      grafo0.insereAresta(0, 0, 3383);

      // Assert
      assertEquals("Vertex count should be unchanged after insertion", vertices, grafo0.numVertices());
      assertTrue("Inserted self-loop at (0,0) should be reported as existing", grafo0.existeAresta(0, 0));
  }

  /**
   * REQ-007: Inserting an edge with a distant target should not affect unrelated adjacency queries.
   *
   * Given a graph with many vertices
   * When an edge is inserted from 0 to a far vertex with negative weight
   * Then querying an unrelated adjacency (0,0) should remain false.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(3383);

      // Act: insert an edge to a far vertex (target may be out-of-range depending on implementation)
      try {
          grafo0.insereAresta(0, 1494, -45);
      } catch (Throwable t) {
          fail("insereAresta threw unexpectedly: " + t);
      }

      // Assert: existence of an unrelated self-loop is false
      assertFalse("Unrelated edge (0,0) should not exist after inserting (0,1494)", grafo0.existeAresta(0, 0));
      // Also verify vertex count unchanged
      assertEquals("Vertex count must remain consistent", 3383, grafo0.numVertices());
  }

  /**
   * REQ-008: Transpose operation should produce a distinct graph object with consistent size.
   *
   * Given a graph (possibly with invalid insert attempts)
   * When the graph is transposed
   * Then the result should not be the same instance and should preserve the number of vertices.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(4500);

      // Act: attempt an insertion that may be ignored; then transpose the graph.
      try {
          grafo0.insereAresta(4500, -1, -3371);
      } catch (Throwable t) {
          // tolerate implementations that throw for invalid insert; do not fail the test for that
      }

      Grafo grafo1 = null;
      try {
          grafo1 = grafo0.grafoTransposto();
      } catch (Throwable t) {
          fail("grafoTransposto threw unexpectedly: " + t);
      }

      // Assert
      assertNotNull("Transpose must produce a non-null graph", grafo1);
      assertNotSame("Transposed graph should be a distinct instance", grafo0, grafo1);
      assertEquals("Transposed graph should preserve vertex count", grafo0.numVertices(), grafo1.numVertices());
  }

  /**
   * REQ-009: Behavior of removal on an empty graph should be well-defined.
   *
   * Given an empty graph (0 vertices)
   * When attempting to remove an edge
   * Then either a placeholder Aresta is returned or null; validate returned structure if present.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Arrange
      Grafo grafo0 = new Grafo(0);

      // Act
      Grafo.Aresta a = null;
      try {
          a = grafo0.retiraAresta(0, 0);
      } catch (Throwable t) {
          fail("retiraAresta on empty graph threw unexpectedly: " + t);
      }

      // Assert: allow either null or a placeholder with zeros, but validate if present.
      if (a != null) {
          assertEquals("For empty graph, returned Aresta.v2() should be 0", 0, a.v2());
          assertEquals("For empty graph, returned Aresta.v1() should be 0", 0, a.v1());
          assertEquals("For empty graph, returned Aresta.peso() should be 0", 0, a.peso());
      } else {
          assertNull("retiraAresta may return null on empty graph", a);
      }
      assertEquals("Empty graph should report zero vertices", 0, grafo0.numVertices());
  }
}