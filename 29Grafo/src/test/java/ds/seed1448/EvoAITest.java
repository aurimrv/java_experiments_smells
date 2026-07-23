package ds.seed1448;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to categorize tests as unit tests for selective execution.
 * Must be package-level and declared before the test class to be usable with @Category.
 */
interface UnitTest {}

/**
 * Improved and documented tests for Grafo.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure in comments.
 * - Descriptive assertion messages are provided to aid debugging.
 * - Common numeric values are defined as constants to avoid magic numbers.
 * - Tests remain focused on the original behaviors but include additional sanity checks where safe.
 *
 * Requirement traceability: REQ-GRAFO-BASIC-OPS
 */
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Common constants replacing magic numbers used in multiple tests
    private static final int SIZE_A = 2581;
    private static final int SIZE_B = 2585;
    private static final int SIZE_C = 1745;

    private static final int V1 = 1315;
    private static final int V2 = 1960;
    private static final int V3 = 1947;
    private static final int V4 = 2006;

    /**
     * Given an empty graph of size SIZE_A,
     * When an edge (V1->V2) is inserted and the graph is printed,
     * Then the graph retains the configured number of vertices and the edge exists.
     *
     * REQ: REQ-GRAFO-IMPRIME-AND-COUNT
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_A);

        // Precondition: graph has expected capacity
        assertEquals("Precondition: graph should start with configured number of vertices", SIZE_A, grafo0.numVertices());

        // When
        grafo0.insereAresta(V1, V2, SIZE_A);
        // imprime() is a side-effect operation (no return); ensure it does not throw.
        grafo0.imprime();

        // Then
        assertEquals("Vertex count should remain unchanged after inserting an edge", SIZE_A, grafo0.numVertices());
        assertTrue(String.format("Inserted edge %d->%d should exist", V1, V2), grafo0.existeAresta(V1, V2));
    }

    /**
     * Given an empty graph of size SIZE_B,
     * When an edge is inserted and then removed,
     * Then the removed edge should have correct endpoints and weight, and the graph's vertex count is unchanged.
     *
     * REQ: REQ-GRAFO-INSERT-AND-REMOVE
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_B);
        assertFalse("Precondition: edge should not exist before insertion", grafo0.existeAresta(V1, V2));

        // When: insert an edge and then remove it
        grafo0.insereAresta(V1, V2, SIZE_B);
        assertTrue("Edge should exist immediately after insertion", grafo0.existeAresta(V1, V2));

        Grafo.Aresta removed = grafo0.retiraAresta(V1, V2);

        // Then: verify removal result and graph invariants
        assertNotNull("Removing an existing edge should return a non-null Aresta", removed);
        assertEquals("Removed edge v1 must match inserted source", V1, removed.v1());
        assertEquals("Removed edge v2 must match inserted target", V2, removed.v2());
        assertEquals("Removed edge weight must match inserted weight", SIZE_B, removed.peso());
        assertEquals("Vertex count remains unchanged after removal", SIZE_B, grafo0.numVertices());
        assertFalse("Edge should no longer exist after removal", grafo0.existeAresta(V1, V2));
    }

    /**
     * Given a graph where two edges are inserted (including a self-loop),
     * When the graph is transposed,
     * Then the transposed graph is a distinct object, has the same number of vertices, and edges are reversed.
     *
     * REQ: REQ-GRAFO-TRANSPOSE
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_B);
        grafo0.insereAresta(V1, V1, V3); // self-loop
        grafo0.insereAresta(V1, V3, SIZE_B); // edge V1->V3

        // Pre-assertions
        assertTrue("Precondition: original edge V1->V3 should exist", grafo0.existeAresta(V1, V3));
        assertTrue("Precondition: self-loop V1->V1 should exist", grafo0.existeAresta(V1, V1));

        // When
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
        assertEquals("Transposed graph should have same number of vertices", SIZE_B, grafo1.numVertices());

        // After transpose, original edge V1->V3 should appear as V3->V1
        assertTrue(String.format("Transposed graph should contain reversed edge %d->%d", V3, V1), grafo1.existeAresta(V3, V1));
        // Self-loop remains a self-loop when transposed
        assertTrue("Transposed graph should preserve self-loops", grafo1.existeAresta(V1, V1));
    }

    /**
     * Given a minimal graph with one vertex,
     * When querying the first adjacency list and vertex count,
     * Then the graph reports a single vertex and does not throw.
     *
     * REQ: REQ-GRAFO-ADJACENCY-BOUNDARY
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(1);

        // When: request first adjacency list (should not throw for valid index 0)
        grafo0.primeiroListaAdj(0);

        // Then
        assertEquals("Graph with one vertex should report numVertices()==1", 1, grafo0.numVertices());
        // No edges expected in a newly created single-vertex graph
        assertFalse("No self-edge should exist by default in a fresh graph of size 1", grafo0.existeAresta(0, 0));
    }

    /**
     * Given a graph of size SIZE_B,
     * When checking a non-inserted edge,
     * Then existeAresta returns false and vertex count remains correct.
     *
     * REQ: REQ-GRAFO-EDGE-EXISTENCE
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_B);

        // When
        boolean exists = grafo0.existeAresta(V3, V4);

        // Then
        assertEquals("Vertex count should match configured size", SIZE_B, grafo0.numVertices());
        assertFalse(String.format("Edge %d->%d should not exist in a fresh graph", V3, V4), exists);
    }

    /**
     * Given a graph where an edge is inserted,
     * When attempting to remove a different non-existent edge,
     * Then null is returned and the originally inserted edge remains present.
     *
     * REQ: REQ-GRAFO-REMOVE-NULL
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_A);
        grafo0.insereAresta(V1, V2, SIZE_A);

        // When: remove a non-existent edge (different target)
        Grafo.Aresta removed = grafo0.retiraAresta(V1, V1);

        // Then
        assertNull("Removing a non-existent edge should return null", removed);
        assertEquals("Vertex count should remain unchanged after failed removal", SIZE_A, grafo0.numVertices());
        assertTrue("Originally inserted edge should still exist after failed removal attempt", grafo0.existeAresta(V1, V2));
    }

    /**
     * Given a graph configured with SIZE_C vertices,
     * When querying its vertex count,
     * Then the returned count equals the configured size and no edges exist by default.
     *
     * REQ: REQ-GRAFO-CONSTRUCTOR
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_C);

        // When
        int count = grafo0.numVertices();

        // Then
        assertEquals("numVertices() must return the configured size", SIZE_C, count);
        // Additional sanity check: fresh graph should not have arbitrary edges (0,0 may be out of interest but is a safe check)
        assertFalse("Fresh graph should not contain an edge 0->0 by default", grafo0.existeAresta(0, 0));
    }

    /**
     * Given a graph with a single inserted directed edge,
     * When the graph is transposed,
     * Then the transposed graph contains the reversed edge and both graphs preserve their vertex counts.
     *
     * REQ: REQ-GRAFO-TRANSPOSE-BASIC
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(SIZE_A);
        grafo0.insereAresta(V1, V2, SIZE_A);

        // Precondition
        assertTrue("Inserted edge should exist in original graph before transpose", grafo0.existeAresta(V1, V2));

        // When
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertEquals("Transposed graph must have same number of vertices as original", SIZE_A, grafo1.numVertices());
        assertEquals("Original graph must retain its vertex count", SIZE_A, grafo0.numVertices());
        assertTrue(String.format("Transposed graph should contain reversed edge %d->%d", V2, V1), grafo1.existeAresta(V2, V1));
    }
}