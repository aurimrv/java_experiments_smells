package ds.seed5311;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for grouping tests in this file.
 */
interface GraphUnitTest {}

/**
 * Improved and annotated unit tests for ds.Grafo.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure in comments.
 * - Tests include richer assertions, messages, and some boundary checks
 *   while keeping the original test method names unchanged.
 * - Requirement tags (REQ-) are included in Javadoc for traceability.
 */
@Category(GraphUnitTest.class)
public class EvoAITest {

    private static final String REQ_BASE = "REQ-Graph-";

    /**
     * REQ-Graph-001
     * Given a newly created graph with V vertices and a self-loop inserted on vertex 0,
     * when printing the graph,
     * then the number of vertices remains unchanged and the inserted edge is present.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final int V = 652;
        Grafo g = new Grafo(V);

        // When (setup): insert a self-loop as test data (treated as setup for the print action)
        g.insereAresta(0, 0, 0);

        // When (action): print the graph representation (should be a no-op for structure)
        g.imprime();

        // Then: number of vertices unchanged, and the previously inserted edge exists
        assertEquals("Vertex count should remain equal to the value used at construction", V, g.numVertices());
        assertTrue("Inserted self-loop (0->0) must exist after insertion", g.existeAresta(0, 0));
        Grafo.Aresta a = g.retiraAresta(0, 0);
        assertNotNull("Retiring the previously inserted self-loop should return the edge object", a);
        assertEquals("Edge v1 should be the source vertex 0", 0, a.v1());
        assertEquals("Edge v2 should be the destination vertex 0", 0, a.v2());
        assertEquals("Edge weight should match the inserted value", 0, a.peso());
    }

    /**
     * REQ-Graph-002
     * Given a graph with a single self-loop on vertex 0,
     * when the self-loop is removed,
     * then the returned edge object reflects the removed edge and the graph no longer contains that edge.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        final int V = 652;
        Grafo g = new Grafo(V);
        g.insereAresta(0, 0, 0);

        // When: remove the inserted edge
        Grafo.Aresta removed = g.retiraAresta(0, 0);

        // Then: the removal returns the expected edge and the graph no longer has that edge
        assertNotNull("Removal should return the removed edge when it exists", removed);
        assertEquals("Removed edge source must be 0", 0, removed.v1());
        assertEquals("Removed edge target must be 0", 0, removed.v2());
        assertEquals("Removed edge weight must match inserted weight", 0, removed.peso());
        assertFalse("After removal, the edge must no longer exist", g.existeAresta(0, 0));
        assertEquals("Vertex count must remain unchanged by removal of edges", V, g.numVertices());

        // Additional negative check: removing the same edge again should return null
        Grafo.Aresta removedAgain = g.retiraAresta(0, 0);
        assertNull("Removing a non-existing edge should return null", removedAgain);
    }

    /**
     * REQ-Graph-003
     * Given a graph with one edge inserted at vertex 0,
     * when requesting the next adjacency for vertex 0,
     * then the returned adjacency matches the inserted edge.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        final int V = 652;
        Grafo g = new Grafo(V);
        g.insereAresta(0, 0, 0);

        // When: obtain the next adjacency for vertex 0 (after insertion)
        Grafo.Aresta adj = g.proxAdj(0);

        // Then: adjacency must be present and reflect the inserted edge
        assertNotNull("Adjacent edge for vertex 0 should be present after insertion", adj);
        assertEquals("Adjacent edge source must be 0", 0, adj.v1());
        assertEquals("Adjacent edge target must be 0", 0, adj.v2());
        assertEquals("Adjacent edge weight must match inserted value", 0, adj.peso());
        assertEquals("Graph vertex count must remain unchanged", V, g.numVertices());
    }

    /**
     * REQ-Graph-004
     * Given a graph with no edges,
     * when asking for the first adjacency list entry on a valid vertex index,
     * then no adjacency should be returned and the vertex count remains unchanged.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        final int V = 652;
        final int idx = V - 24; // use a valid index near the upper bound but within range
        Grafo g = new Grafo(V);

        // When: position iterator at first adjacency for a vertex that has no edges
        g.primeiroListaAdj(idx);
        Grafo.Aresta adj = g.proxAdj(idx);

        // Then: there should be no adjacency and vertex count unchanged
        assertNull("No adjacency expected for a freshly created graph vertex with no edges", adj);
        assertEquals("Vertex count must equal the constructor value", V, g.numVertices());
    }

    /**
     * REQ-Graph-005
     * Given a graph constructed with a declared vertex count,
     * when checking for an edge that was never inserted (including a request that uses the upper bound index),
     * then the method should report that the edge does not exist and vertex count is unchanged.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        final int V = 4663;
        Grafo g = new Grafo(V);

        // When: check for an edge that was never inserted (destination index equal to vertex count)
        boolean existsOutOfRange = g.existeAresta(189, V); // V is out-of-range if valid indices are 0..V-1
        boolean existsValidButMissing = g.existeAresta(0, V - 1); // in-range, but no edge inserted

        // Then: both checks should be false and vertex count unchanged
        assertFalse("Edge check with out-of-range destination should return false (no such edge)", existsOutOfRange);
        assertFalse("Edge check for existing vertex indices with no insertion should return false", existsValidButMissing);
        assertEquals("Vertex count must equal constructor value", V, g.numVertices());
    }

    /**
     * REQ-Graph-006
     * Given a graph with a self-loop inserted at (0,0),
     * when checking existence of that edge,
     * then existeAresta should return true for the inserted edge and false for other pairs.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        final int V = 652;
        Grafo g = new Grafo(V);
        g.insereAresta(0, 0, 0);

        // When/Then: assertions about existence
        assertTrue("Inserted self-loop (0->0) should be reported as existing", g.existeAresta(0, 0));
        assertFalse("Non-inserted edge (0->1) should not be reported as existing", g.existeAresta(0, 1));
        assertEquals("Vertex count should remain unchanged after insertion", V, g.numVertices());

        // Cleanup: remove and verify removal had effect
        Grafo.Aresta removed = g.retiraAresta(0, 0);
        assertNotNull("Retiring the existing edge should return the edge", removed);
        assertFalse("Edge should no longer exist after removal", g.existeAresta(0, 0));
    }

    /**
     * REQ-Graph-007
     * Given a graph with only one known edge inserted,
     * when attempting to remove a different (non-existing) edge,
     * then the removal should return null and the graph's vertex count remain unchanged.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        final int V = 652;
        Grafo g = new Grafo(V);
        g.insereAresta(0, 0, 0); // setup: one known edge

        // When: attempt to remove a non-existing edge
        Grafo.Aresta nonExistingRemoval = g.retiraAresta(0, 628);

        // Then: removal of the non-existing edge returns null; the existing edge is still removable
        assertNull("Removing a non-existing adjacency must return null", nonExistingRemoval);
        assertEquals("Vertex count must remain unchanged after failed removal", V, g.numVertices());

        // Ensure existing edge can be removed successfully afterwards
        Grafo.Aresta removed = g.retiraAresta(0, 0);
        assertNotNull("Existing edge should be removable and return an object", removed);
        assertFalse("After removal, the edge should no longer exist", g.existeAresta(0, 0));
    }

    /**
     * REQ-Graph-008
     * Given a graph is constructed with a specified number of vertices,
     * when querying numVertices,
     * then it should return the value used during construction.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        final int V = 4663;
        Grafo g = new Grafo(V);

        // When
        int count = g.numVertices();

        // Then
        assertEquals("numVertices() must return the construction parameter", V, count);

        // Additional sanity: adding an edge should not change the number of vertices
        g.insereAresta(0, 0, 1);
        assertEquals("Adding edges must not change the declared vertex count", V, g.numVertices());
    }

    /**
     * REQ-Graph-009
     * Given a graph with a single self-loop,
     * when computing the transpose graph,
     * then the returned graph has the same number of vertices, is a distinct instance,
     * and contains the transposed edge (for a self-loop it remains at the same pair).
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        final int V = 639;
        Grafo original = new Grafo(V);
        original.insereAresta(0, 0, 0);

        // When
        Grafo transposed = original.grafoTransposto();

        // Then: basic structural checks
        assertNotNull("Transpose graph must not be null", transposed);
        assertEquals("Transposed graph must preserve number of vertices", original.numVertices(), transposed.numVertices());
        assertNotSame("Transpose must be a different instance than the original", original, transposed);

        // For a self-loop, the transposed graph should also report the same adjacency
        assertTrue("Transposed graph should contain the transposed self-loop (0->0)", transposed.existeAresta(0, 0));

        // Original should still contain the original edge (transpose should not mutate original)
        assertTrue("Original graph should still contain its original edge", original.existeAresta(0, 0));
    }
}