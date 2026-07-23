package ds.seed1448;

import ds.Grafo;
import ds.Grafo.Aresta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Unit tests for Grafo (REQ-GRAPH-1).
 *
 * These tests follow a Given-When-Then style, include descriptive assertion messages,
 * and are annotated so they can be selectively executed by category.
 */
interface GraphUnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(GraphUnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    private static final int NUM_VERTICES = 100;

    // Helper to create a fresh graph instance (Given)
    private Grafo newGraph() {
        return new Grafo();
    }

    // Helper to assert basic invariant about a fresh graph
    private void assertDefaultGraphInvariant(Grafo g) {
        assertNotNull("Graph instance should not be null", g);
        assertEquals("Graph should start with expected vertex count", NUM_VERTICES, g.numVertices());
    }

    /**
     * Given: a graph with one edge inserted (1 -> 0, weight 2990)
     * When: the graph is transposed
     * Then: the transposed graph keeps the same vertex count and has the inverted edge (0 -> 1)
     * @see REQ-GRAPH-1
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        g.insereAresta(1, 0, 2990); // setup

        // Pre-check that the original edge exists (sanity)
        assertTrue("Inserted edge (1->0) should exist in the original graph", g.existeAresta(1, 0));

        // When
        Grafo transposed = g.grafoTransposto();

        // Then
        assertNotNull("Transposed graph must not be null", transposed);
        assertEquals("Transposed graph must preserve number of vertices", NUM_VERTICES, transposed.numVertices());
        // The original edge 1->0 should appear in transposed as 0->1
        assertTrue("Transposed graph should contain inverted edge (0->1)", transposed.existeAresta(0, 1));
        // Original graph should still contain the original edge
        assertTrue("Original graph should still contain the original edge (1->0)", g.existeAresta(1, 0));
    }

    /**
     * Given: a graph with one edge inserted
     * When: printing the graph (imprime) is invoked
     * Then: it should not throw and the graph remains unchanged
     * @see REQ-GRAPH-PRINT
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        final int from = 0;
        final int to = 1748;
        final int weight = 1748;
        g.insereAresta(from, to, weight);

        // Sanity: edge exists before printing
        assertTrue("Edge should exist before printing", g.existeAresta(from, to));

        // When: capture output of imprime to ensure it runs without throwing
        PrintStream oldOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (PrintStream ps = new PrintStream(baos)) {
            System.setOut(ps);
            g.imprime();
        } finally {
            System.setOut(oldOut);
        }
        String printed = baos.toString("UTF-8");
        assertNotNull("Printed output should not be null", printed);
        assertFalse("Printed output should not be empty", printed.trim().isEmpty());

        // Then: graph remains unchanged after printing
        assertEquals("Number of vertices should remain unchanged after printing", NUM_VERTICES, g.numVertices());
        assertTrue("Edge should still exist after printing", g.existeAresta(from, to));
    }

    /**
     * Given: a graph with a self-loop (0 -> 0) of weight 0
     * When: the self-loop is removed
     * Then: the returned Aresta contains the expected values and the edge no longer exists
     * @see REQ-GRAPH-REMOVE-EDGE
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        g.insereAresta(0, 0, 0); // setup

        // Pre-check
        assertTrue("Inserted self-loop (0->0) should exist before removal", g.existeAresta(0, 0));

        // When: remove the edge (act)
        Aresta removed = g.retiraAresta(0, 0);

        // Then
        assertNotNull("retiraAresta should return an Aresta for an existing edge", removed);
        assertEquals("Removed edge v1 should be 0", 0, removed.v1());
        assertEquals("Removed edge v2 should be 0", 0, removed.v2());
        assertEquals("Removed edge weight should be 0", 0, removed.peso());
        assertEquals("Graph vertex count should remain constant after removal", NUM_VERTICES, g.numVertices());
        assertFalse("Edge should no longer exist after removal", g.existeAresta(0, 0));
    }

    /**
     * Given: an inserted edge
     * When: an attempt is made to remove a non-existing edge (negative index)
     * Then: null is returned and existing edges are unaffected
     * @see REQ-GRAPH-VALIDATION
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        g.insereAresta(0, 0, 3171); // setup

        // Sanity: inserted edge exists
        assertTrue("Inserted edge (0->0) should exist before attempted invalid removal", g.existeAresta(0, 0));

        // When: attempt to remove a clearly invalid edge (negative destination)
        Aresta result = g.retiraAresta(0, -262);

        // Then: the operation should return null and not affect the existing edge
        assertNull("Removing a non-existent/invalid edge should return null", result);
        assertTrue("Existing edge should remain after attempted invalid removal", g.existeAresta(0, 0));
        assertEquals("Vertex count remains unchanged after invalid removal attempt", NUM_VERTICES, g.numVertices());
    }

    /**
     * Given: a fresh graph
     * When: requesting the first adjacency for a vertex with no edges
     * Then: the operation should be safe (no exception) and graph invariants hold
     * @see REQ-GRAPH-ADJACENCY
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);

        // When: request first adjacency for an isolated vertex
        // (This is primarily a safety check: no exception should be thrown.)
        Aresta firstAdj = null;
        try {
            firstAdj = g.primeiroListaAdj(1);
        } catch (Exception e) {
            fail("primeiroListaAdj should not throw for isolated vertex: " + e.getMessage());
        }

        // Then
        // We cannot rely on implementation details whether it returns null or a sentinel,
        // but the graph should still be valid and vertex count unchanged.
        assertEquals("Vertex count unchanged after primeiroListaAdj", NUM_VERTICES, g.numVertices());
        // If there's an adjacency, it must reference vertex 1 as source
        if (firstAdj != null) {
            assertEquals("If an adjacency is returned, its source should be the requested vertex", 1, firstAdj.v1());
        }
    }

    /**
     * Given: a graph with a self-loop inserted
     * When: checking its existence and probing adjacency
     * Then: existence and adjacency methods reflect the inserted edge
     * @see REQ-GRAPH-EDGE-EXISTENCE
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        g.insereAresta(0, 0, 3171);

        // When: check existence
        boolean exists = g.existeAresta(0, 0);

        // Then
        assertTrue("Inserted self-loop (0->0) should be reported as existing", exists);
        assertEquals("Vertex count should remain constant after insertion", NUM_VERTICES, g.numVertices());

        // Additional check: proxAdj should return the inserted edge
        Aresta adj = g.proxAdj(0);
        assertNotNull("proxAdj should return an adjacency for vertex 0 after insertion", adj);
        assertEquals("proxAdj returned edge should have source 0", 0, adj.v1());
        assertEquals("proxAdj returned edge should have destination 0", 0, adj.v2());
        assertEquals("proxAdj returned edge should have correct weight", 3171, adj.peso());
    }

    /**
     * Given: a graph with an inserted edge to a high-index vertex
     * When: checking for an unrelated edge's existence
     * Then: only the inserted edge exists and unrelated lookups are false
     * @see REQ-GRAPH-BOUNDS
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        g.insereAresta(0, 1748, 1748);

        // When & Then
        assertTrue("Inserted edge (0->1748) should exist", g.existeAresta(0, 1748));
        assertFalse("Unrelated edge (0->1) should not exist", g.existeAresta(0, 1));
        assertEquals("Vertex count should remain constant", NUM_VERTICES, g.numVertices());
    }

    /**
     * Given: a fresh graph
     * When: querying the number of vertices
     * Then: it should match the expected default and basic invariants hold
     * @see REQ-GRAPH-SIZE
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given & When
        Grafo g = newGraph();

        // Then
        int count = g.numVertices();
        assertEquals("New graph should report the documented default number of vertices", NUM_VERTICES, count);
        assertTrue("Vertex count must be positive", count > 0);
        // Also verify an arbitrary edge does not exist by default
        assertFalse("No edges should exist by default (arbitrary check)", g.existeAresta(0, 1));
    }

    /**
     * Given: a self-loop inserted into the graph
     * When: probing proxAdj and then removing it
     * Then: proxAdj returns valid adjacency pre-removal and removal clears the edge
     * @see REQ-GRAPH-ADJ-PROX
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        Grafo g = newGraph();
        assertDefaultGraphInvariant(g);
        g.insereAresta(0, 0, 0);

        // When: probe adjacency
        Aresta adj = g.proxAdj(0);

        // Then: adjacency should reflect inserted self-loop
        assertNotNull("proxAdj should return the inserted self-loop", adj);
        assertEquals("Adjacency source must be 0", 0, adj.v1());
        assertEquals("Adjacency destination must be 0", 0, adj.v2());
        assertEquals("Adjacency weight must be 0", 0, adj.peso());
        assertEquals("Vertex count remain unchanged", NUM_VERTICES, g.numVertices());

        // And: removing the edge should clear it
        Aresta removed = g.retiraAresta(0, 0);
        assertNotNull("Removing existing self-loop should return the Aresta", removed);
        assertFalse("Edge should no longer exist after removal", g.existeAresta(0, 0));
    }
}