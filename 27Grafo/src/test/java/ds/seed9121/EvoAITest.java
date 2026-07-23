package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Marker interface for categorizing graph-related tests.
 * Placed at package level so @Category annotations can reference it.
 */
interface GraphTest {}

/**
 * Improved and more descriptive unit tests for Grafo.
 *
 * Notes:
 * - Each test follows a simple Given-When-Then structure in comments.
 * - Assertions include descriptive messages to aid debugging.
 * - Side effects from imprime() are captured and verified to not raise exceptions.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(GraphTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: a graph with a small, valid number of vertices
    Grafo grafo0 = new Grafo(291);
    assertEquals("Graph should report the number of vertices given at construction.", 291, grafo0.numVertices());

    // When: insert a simple edge between two valid vertices and capture printed representation
    grafo0.insereAresta(0, 1, 105);
    Grafo.Aresta adj = grafo0.proxAdj(0);

    // Then: adjacency and edge properties should reflect the insertion
    assertNotNull("After inserting an edge, proxAdj(0) should return a non-null Aresta.", adj);
    assertEquals("Inserted edge should have source v1 == 0.", 0, adj.v1());
    assertEquals("Inserted edge should have destination v2 == 1.", 1, adj.v2());
    assertEquals("Inserted edge should preserve the provided weight.", 105, adj.peso());

    // And: calling imprime() should not throw and should produce some output
    PrintStream originalOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    try {
      System.setOut(ps);
      grafo0.imprime();
      ps.flush();
      String printed = baos.toString("UTF-8");
      assertNotNull("imprime() should produce a string representation (possibly empty).", printed);
      // We don't assert exact content since formatting is unspecified, but ensure the call succeeded.
    } finally {
      System.setOut(originalOut);
    }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a small graph and one inserted edge
    Grafo grafo0 = new Grafo(5);
    grafo0.insereAresta(0, 4, 1);

    // When: attempt to remove a non-existent edge (0 -> 0)
    Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

    // Then: removal of a non-existent edge should return null and vertex count should remain
    assertNull("Removing a non-existing edge should return null.", removed);
    assertEquals("Number of vertices should be unchanged after failed removal.", 5, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a graph and a specific edge to insert (exercise mid-range indices within graph bounds)
    Grafo grafo0 = new Grafo(6);
    grafo0.insereAresta(2, 5, 9);

    // When: request the next adjacency for the source vertex
    Grafo.Aresta a = grafo0.proxAdj(2);

    // Then: the adjacency should match the inserted edge properties
    assertNotNull("proxAdj should return the inserted adjacency for vertex 2.", a);
    assertEquals("Source of adjacency should be 2.", 2, a.v1());
    assertEquals("Destination of adjacency should be 5.", 5, a.v2());
    assertEquals("Weight of adjacency should be preserved.", 9, a.peso());
    assertEquals("Number of vertices should remain as constructed.", 6, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a graph with no edges for vertex 2
    Grafo grafo0 = new Grafo(6);

    // When: ask for the first adjacency in an empty adjacency list
    Grafo.Aresta first = grafo0.primeiroListaAdj(2);

    // Then: expect null (no adjacencies) and the vertex count unchanged
    assertNull("primeiroListaAdj on a vertex with no edges should return null.", first);
    assertEquals("Graph should report its constructed number of vertices.", 6, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: a graph and a newly inserted edge
    Grafo grafo0 = new Grafo(5);
    grafo0.insereAresta(1, 3, 7);

    // When: check existence for the inserted edge and for the reverse (which wasn't inserted)
    boolean existsInserted = grafo0.existeAresta(1, 3);
    boolean existsReverse = grafo0.existeAresta(3, 1);

    // Then: existence should reflect the inserted direction only
    assertTrue("existeAresta should return true for the inserted edge (1->3).", existsInserted);
    assertFalse("existeAresta should return false for the non-inserted reverse edge (3->1).", existsReverse);
    assertEquals("Vertex count should remain as constructed.", 5, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: a graph and an inserted edge to be removed
    Grafo grafo0 = new Grafo(5);
    grafo0.insereAresta(1, 3, 10);

    // When: remove the inserted edge
    Grafo.Aresta removed = grafo0.retiraAresta(1, 3);

    // Then: removed edge should reflect the insertion and graph size unchanged
    assertNotNull("retiraAresta should return the removed edge when it exists.", removed);
    assertEquals("Removed edge should have source 1.", 1, removed.v1());
    assertEquals("Removed edge should have destination 3.", 3, removed.v2());
    assertEquals("Removed edge should preserve the original weight.", 10, removed.peso());
    assertEquals("Vertex count should remain as constructed after removal.", 5, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given: a small graph with one inserted edge
    Grafo grafo0 = new Grafo(4);
    grafo0.insereAresta(0, 2, 5);

    // When: test existence for an unrelated self-edge and the known edge
    boolean selfEdgeExists = grafo0.existeAresta(0, 0);
    boolean knownEdgeExists = grafo0.existeAresta(0, 2);

    // Then: self-edge should not exist while the inserted edge should
    assertFalse("No self-edge (0->0) should exist for this graph.", selfEdgeExists);
    assertTrue("Inserted edge (0->2) should be reported as existing.", knownEdgeExists);
    assertEquals("Vertex count should remain as constructed.", 4, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Given: a graph constructed with a larger vertex count to validate sizing
    Grafo grafo0 = new Grafo(473);

    // When: retrieve the reported number of vertices
    int vertices = grafo0.numVertices();

    // Then: ensure the graph reports the configured size and that no edges exist by default
    assertEquals("Graph should report the number of vertices passed to the constructor.", 473, vertices);
    // A basic sanity check: ensure that primoListaAdj for a mid-range vertex returns null (no edges added)
    assertNull("No edges should exist initially; primeiroListaAdj should return null for a vertex.", grafo0.primeiroListaAdj(10));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Given: a graph with a self-loop inserted
    Grafo grafo0 = new Grafo(5);
    grafo0.insereAresta(1, 1, 0);

    // When: obtain the transposed graph
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then: transposed graph should have the same number of vertices and be a different instance.
    assertEquals("Transposed graph should have the same number of vertices as the original.", grafo0.numVertices(), grafo1.numVertices());
    assertNotSame("grafoTransposto should return a distinct Grafo instance, not the original.", grafo1, grafo0);

    // And: a self-loop should be preserved by transpose
    assertTrue("A self-loop (1->1) should exist in the transposed graph as well.", grafo1.existeAresta(1, 1));
  }
}