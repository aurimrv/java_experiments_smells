package ds.seed7992;

import ds.Grafo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for Grafo.
 *
 * Requirement traceability:
 * - REQ-GRAFO-001: Basic graph operations (insert, remove, query)
 * - REQ-GRAFO-002: Graph transposition preserves adjacency semantics
 *
 * Notes:
 * - Tests follow a Given-When-Then structure in comments.
 * - Assertion messages added for clearer failure diagnostics.
 */
public class EvoAITest {

    // Expected default number of vertices for a newly constructed Grafo
    private static final int DEFAULT_VERTICES = 100;

    // Helper factory to reduce duplication
    private Grafo createGrafo() {
        return new Grafo();
    }

    // Common postcondition assertion
    private void assertDefaultVertexCount(Grafo g) {
        assertEquals("Graph should initialize with the expected default number of vertices",
                DEFAULT_VERTICES, g.numVertices());
    }

    /**
     * Given a fresh graph,
     * When inserting an edge 0->1 with weight 0 and printing the graph,
     * Then the edge should exist and the vertex count remains the default.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When
        grafo0.insereAresta(0, 1, 0);
        // imprime may be a diagnostic operation; call to ensure no exceptions
        grafo0.imprime();

        // Then
        assertTrue("Inserted edge 0->1 should be reported as existing", grafo0.existeAresta(0, 1));
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph,
     * When inserting a self-edge 0->0 with a negative weight and then removing it,
     * Then the removed edge object should reflect the inserted values and the graph should no longer report that edge.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When: insert then remove
        grafo0.insereAresta(0, 0, -3016);
        assertTrue("Edge 0->0 should exist immediately after insertion", grafo0.existeAresta(0, 0));

        Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

        // Then: removed edge should reflect insertion and graph should no longer have the edge
        assertNotNull("retiraAresta should return the removed edge object for 0->0", removed);
        assertEquals("Removed edge should have v1 == 0", 0, removed.v1());
        assertEquals("Removed edge should have v2 == 0", 0, removed.v2());
        assertEquals("Removed edge should preserve the inserted weight", -3016, removed.peso());
        assertFalse("Edge 0->0 should no longer exist after removal", grafo0.existeAresta(0, 0));
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph,
     * When inserting a self-edge 0->0 and querying the next adjacency for vertex 0,
     * Then the returned adjacency should reflect the insertion.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When
        grafo0.insereAresta(0, 0, -3016);
        Grafo.Aresta adj = grafo0.proxAdj(0);

        // Then
        assertNotNull("proxAdj(0) should return the inserted adjacency for vertex 0", adj);
        assertEquals("Adjacency v1 should be 0", 0, adj.v1());
        assertEquals("Adjacency v2 should be 0", 0, adj.v2());
        assertEquals("Adjacency weight should match inserted value", -3016, adj.peso());
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph with no edges,
     * When requesting the first adjacency list for vertex 0,
     * Then the result should be null (no adjacency) and the graph should have the default vertex count.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When
        Grafo.Aresta first = grafo0.primeiroListaAdj(0);

        // Then
        assertNull("primeiroListaAdj(0) should be null for a fresh graph with no edges", first);
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph,
     * When checking existence of a non-inserted edge 0->1,
     * Then existeAresta should return false and the graph vertex count remains default.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When
        boolean exists = grafo0.existeAresta(0, 1);

        // Then
        assertFalse("Non-inserted edge 0->1 should not exist in a fresh graph", exists);
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph,
     * When inserting a self-edge 0->0 and querying existence,
     * Then existeAresta should return true and the vertex count remains default.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When
        grafo0.insereAresta(0, 0, -3016);
        boolean exists = grafo0.existeAresta(0, 0);

        // Then
        assertTrue("Inserted self-edge 0->0 should be reported as existing", exists);
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph with one inserted self-edge 0->0,
     * When attempting to remove a non-existing edge 0->826,
     * Then retiraAresta should return null and the originally inserted edge should still exist.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();
        grafo0.insereAresta(0, 0, -3016);
        assertTrue("Sanity: self-edge 0->0 should exist before attempting another removal", grafo0.existeAresta(0, 0));

        // When
        Grafo.Aresta removed = grafo0.retiraAresta(0, 826);

        // Then
        assertNull("retiraAresta should return null when attempting to remove a non-existent edge", removed);
        assertTrue("Previously inserted edge 0->0 should still exist after failed removal attempt", grafo0.existeAresta(0, 0));
        assertDefaultVertexCount(grafo0);
    }

    /**
     * Given a fresh graph,
     * When querying the number of vertices,
     * Then it should return the known default count.
     *
     * Requirement: REQ-GRAFO-001
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();

        // When
        int count = grafo0.numVertices();

        // Then
        assertEquals("numVertices should report the expected default size", DEFAULT_VERTICES, count);
        // Additional sanity: graph should not report arbitrary edges by default
        assertFalse("No edges should exist by default between arbitrary distinct vertices",
                grafo0.existeAresta(0, 1));
    }

    /**
     * Given a graph with a self-edge,
     * When creating the transposed graph,
     * Then the transposed graph should be a distinct instance and preserve the self-edge adjacency.
     *
     * Requirement: REQ-GRAFO-002
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        Grafo grafo0 = createGrafo();
        grafo0.insereAresta(0, 0, 0);

        // When
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertNotSame("grafoTransposto should return a distinct Grafo instance", grafo0, grafo1);
        // For self-edge, transpose should preserve the self-edge
        assertTrue("Transposed graph should contain the self-edge 0->0", grafo1.existeAresta(0, 0));
        // Original should still contain the edge
        assertTrue("Original graph should still contain the self-edge 0->0 after transposition", grafo0.existeAresta(0, 0));
        assertDefaultVertexCount(grafo0);
    }
}