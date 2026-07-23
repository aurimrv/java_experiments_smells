package ds.seed5311;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow test categorization.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo.
 *
 * Traceability: REQ-GRAPH-001..REQ-GRAPH-010
 *
 * Notes:
 * - Each test follows a simple Given-When-Then structure in comments.
 * - Assertions include descriptive messages to aid diagnosis on failure.
 *
 * The original auto-generated header has been removed and tests were
 * adjusted to be more descriptive while keeping the original test
 * method signatures.
 */
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Common constants used across tests to avoid magic numbers.
    private static final int VERTICES_A = 652;
    private static final int VERTICES_B = 4663;
    private static final int VERTICES_C = 639;
    private static final int INDEX_ZERO = 0;
    private static final int INDEX_MID = 628;
    private static final int INDEX_OTHER = 189;

    /**
     * Helper to assert properties of a Grafo.Aresta instance.
     */
    private void assertAresta(Grafo.Aresta a, int expectedV1, int expectedV2, int expectedPeso, String context) {
        assertNotNull(context + " - expected a non-null Aresta", a);
        assertEquals(context + " - v1 mismatch", expectedV1, a.v1());
        assertEquals(context + " - v2 mismatch", expectedV2, a.v2());
        assertEquals(context + " - peso mismatch", expectedPeso, a.peso());
    }

    /**
     * Given a graph with VERTICES_A vertices,
     * When inserting a self-loop at vertex 0 and printing the graph,
     * Then the number of vertices remains VERTICES_A and the adjacency is visible.
     *
     * Requirement: REQ-GRAPH-001
     */
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_A);

        // When
        grafo0.insereAresta(INDEX_ZERO, INDEX_ZERO, 0);
        // call imprime to ensure no exception during a simple print (side-effect)
        grafo0.imprime();

        // Then
        assertEquals("Graph should report the correct number of vertices after construction",
                VERTICES_A, grafo0.numVertices());

        // Additional checks to make the test more robust: the inserted self-loop should exist
        assertTrue("Inserted self-loop (0->0) should exist", grafo0.existeAresta(INDEX_ZERO, INDEX_ZERO));

        Grafo.Aresta adj = grafo0.proxAdj(INDEX_ZERO);
        assertAresta(adj, INDEX_ZERO, INDEX_ZERO, 0, "After inserting self-loop, proxAdj should return the edge");
    }

    /**
     * Given a graph and an inserted edge,
     * When removing that edge using retiraAresta,
     * Then the removed edge should match the inserted edge and subsequent existence check should be false.
     *
     * Requirement: REQ-GRAPH-002
     */
    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_A);
        grafo0.insereAresta(INDEX_ZERO, INDEX_ZERO, 0);

        // When
        Grafo.Aresta removed = grafo0.retiraAresta(INDEX_ZERO, INDEX_ZERO);

        // Then
        assertAresta(removed, INDEX_ZERO, INDEX_ZERO, 0, "retiraAresta should return the previously inserted self-loop");
        assertFalse("After removal, existeAresta should report false for that edge",
                grafo0.existeAresta(INDEX_ZERO, INDEX_ZERO));
        assertEquals("Removing an edge should not change the declared number of vertices",
                VERTICES_A, grafo0.numVertices());
    }

    /**
     * Given a graph with one inserted adjacency,
     * When requesting the next adjacency with proxAdj,
     * Then the returned Aresta should reflect the inserted edge.
     *
     * Requirement: REQ-GRAPH-003
     */
    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_A);
        grafo0.insereAresta(INDEX_ZERO, INDEX_ZERO, 0);

        // When
        Grafo.Aresta next = grafo0.proxAdj(INDEX_ZERO);

        // Then
        assertAresta(next, INDEX_ZERO, INDEX_ZERO, 0, "proxAdj should return the inserted self-loop");
        assertEquals("Number of vertices should remain unchanged after inspecting adjacency",
                VERTICES_A, grafo0.numVertices());
    }

    /**
     * Given a graph with VERTICES_A vertices,
     * When requesting the first adjacency list for a valid index near the upper range,
     * Then the call should not alter the number of vertices (sanity check).
     *
     * Requirement: REQ-GRAPH-004
     */
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_A);

        // When: call primeiroListaAdj for an index within the expected range
        // (this invocation is primarily to ensure no exception is thrown for a valid index)
        grafo0.primeiroListaAdj(INDEX_MID);

        // Then
        assertEquals("primeiroListaAdj should not change the number of graph vertices",
                VERTICES_A, grafo0.numVertices());
    }

    /**
     * Given a newly created graph with many vertices,
     * When querying for a non-inserted edge (including an out-of-range second vertex index),
     * Then existeAresta should return false and the number of vertices should be as constructed.
     *
     * Requirement: REQ-GRAPH-005
     */
    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_B);

        // When
        boolean exists = grafo0.existeAresta(INDEX_OTHER, VERTICES_B); // VERTICES_B is an out-of-range index

        // Then
        assertFalse("existeAresta should return false for a non-inserted or out-of-range edge", exists);
        assertEquals("Graph should report the originally specified number of vertices",
                VERTICES_B, grafo0.numVertices());
    }

    /**
     * Given a graph and an inserted edge,
     * When checking existence with existeAresta,
     * Then the inserted edge should be reported as present.
     *
     * Requirement: REQ-GRAPH-006
     */
    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_A);

        // When
        grafo0.insereAresta(INDEX_ZERO, INDEX_ZERO, 0);

        // Then
        assertTrue("Inserted self-loop should be reported by existeAresta", grafo0.existeAresta(INDEX_ZERO, INDEX_ZERO));
        assertEquals("Vertex count should remain as constructed", VERTICES_A, grafo0.numVertices());

        // Additional sanity: proxAdj should return the inserted edge
        Grafo.Aresta a = grafo0.proxAdj(INDEX_ZERO);
        assertAresta(a, INDEX_ZERO, INDEX_ZERO, 0, "proxAdj must reflect the inserted edge");
    }

    /**
     * Given an inserted edge and an attempt to remove a non-existent/out-of-range adjacency,
     * When using retiraAresta with an out-of-range second vertex,
     * Then null should be returned and the original valid edge should still exist.
     *
     * Requirement: REQ-GRAPH-007
     */
    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_A);
        grafo0.insereAresta(INDEX_ZERO, INDEX_ZERO, 0);

        // When: attempt to remove a non-existent adjacency (v2 out-of-range for our simple graph)
        Grafo.Aresta removed = grafo0.retiraAresta(INDEX_ZERO, INDEX_MID);

        // Then
        assertNull("retiraAresta should return null when removing a non-existent or out-of-range adjacency", removed);
        // Original inserted edge must still exist
        assertTrue("Previously inserted self-loop should still exist after failed retiraAresta",
                grafo0.existeAresta(INDEX_ZERO, INDEX_ZERO));
        assertEquals("Number of vertices must remain unchanged", VERTICES_A, grafo0.numVertices());
    }

    /**
     * Given a freshly created graph,
     * When querying the number of vertices,
     * Then it must be equal to the requested size and basic operations should behave sanely.
     *
     * Requirement: REQ-GRAPH-008
     */
    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_B);

        // When
        int count = grafo0.numVertices();

        // Then
        assertEquals("numVertices should return the size passed to the constructor", VERTICES_B, count);

        // Additional sanity checks
        assertFalse("No edge should exist initially (0->0) unless inserted", grafo0.existeAresta(INDEX_ZERO, INDEX_ZERO));
        assertNull("retiraAresta should return null when trying to remove a non-existent edge",
                grafo0.retiraAresta(INDEX_ZERO, INDEX_ZERO));
    }

    /**
     * Given a graph with a self-loop,
     * When creating the transpose graph,
     * Then the transposed graph is a distinct instance with the same number of vertices and equivalent self-loop presence.
     *
     * Requirement: REQ-GRAPH-009
     */
    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        // Given
        final Grafo grafo0 = new Grafo(VERTICES_C);
        grafo0.insereAresta(INDEX_ZERO, INDEX_ZERO, 0);

        // When
        final Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertNotSame("grafoTransposto should return a different Grafo instance", grafo0, grafo1);
        assertEquals("Transposed graph should have the same number of vertices",
                VERTICES_C, grafo1.numVertices());

        // For a self-loop (0->0) the transpose should still reflect the edge at (0,0)
        assertTrue("Original graph should report the self-loop exists", grafo0.existeAresta(INDEX_ZERO, INDEX_ZERO));
        assertTrue("Transposed graph should also report the self-loop exists", grafo1.existeAresta(INDEX_ZERO, INDEX_ZERO));
    }
}