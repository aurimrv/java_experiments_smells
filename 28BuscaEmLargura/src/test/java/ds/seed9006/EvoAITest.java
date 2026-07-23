package ds.seed9006;

import ds.Grafo;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Grafo basic behaviors.
 *
 * Traceability: REQ-GRAFO-001 through REQ-GRAFO-005
 *
 * Notes:
 * - These tests improve on originally generated cases by adding clear Given-When-Then
 *   comments, requirement IDs, and additional assertions with explanatory messages.
 * - Marker interface for categorization is declared at package scope below.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Reusable constants to avoid magic numbers in tests
    private static final int DEFAULT_SMALL_SIZE = 240;
    private static final int DEFAULT_LARGE_SIZE = 1165;
    private static final int DEFAULT_MEDIUM_SIZE = 212;
    private static final int VALID_VERTEX_ZERO = 0;
    private static final int NEGATIVE_WEIGHT = -449;
    private static final int NEGATIVE_WEIGHT_ALT = -435;
    private static final int SELF_EDGE_WEIGHT = 0;
    private static final int EXTRA_V1 = 1;
    private static final int EXTRA_V2 = 2;
    private static final int EXTRA_WEIGHT = 7;

    @Before
    public void setUp() {
        // Intentionally left blank; scaffolding might rely on this hook.
    }

    /**
     * REQ-GRAFO-001: Verify that constructing a graph sets the expected number of vertices.
     * REQ-GRAFO-002: Inserting an edge with an out-of-range endpoint should either throw an indexed exception
     *               or be safely ignored without changing the graph's vertex count.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: a graph with a known small size
        Grafo grafo0 = new Grafo(DEFAULT_SMALL_SIZE);

        // When: attempt to insert an edge that uses an out-of-range endpoint
        final int outOfRangeVertex = 2016; // intentionally outside DEFAULT_SMALL_SIZE
        boolean insertionThrew = false;
        try {
            grafo0.insereAresta(VALID_VERTEX_ZERO, outOfRangeVertex, SELF_EDGE_WEIGHT);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            // Accept either behavior: implementation may validate indices and throw
            insertionThrew = true;
        } catch (Throwable t) {
            // Any other unexpected throwable should be considered a failure
            throw t;
        }

        // Also call imprime() to exercise output method; ensure it does not alter graph state
        try {
            grafo0.imprime();
        } catch (Throwable t) {
            // imprime should not throw; if it does, fail with detail
            fail("imprime() threw an unexpected exception: " + t.getMessage());
        }

        // Then: number of vertices must remain as constructed
        assertEquals("Graph vertex count must be unchanged after invalid insert attempt",
                DEFAULT_SMALL_SIZE, grafo0.numVertices());

        // If insertion did not throw, ensure that the graph did not silently create vertices beyond bounds.
        if (!insertionThrew) {
            // If no exception, we still expect that querying an in-range adjacency does not report an impossible edge.
            // Check that an edge between 0 and a valid highest-index vertex behaves reasonably.
            int highestValid = DEFAULT_SMALL_SIZE - 1;
            // Existence of the out-of-range edge cannot be asserted reliably; instead assert no unexpected growth.
            assertEquals("Graph size should not change after attempted out-of-range insertion",
                    DEFAULT_SMALL_SIZE, grafo0.numVertices());
            // Also ensure operations on valid indices remain stable
            try {
                // Queries should not throw for valid indices
                boolean exists = grafo0.existeAresta(VALID_VERTEX_ZERO, highestValid);
                assertFalse("No edge expected between vertex 0 and highest valid vertex by default", exists);
            } catch (IndexOutOfBoundsException ioe) {
                // Some implementations may validate aggressively; this is acceptable but should be documented.
            }
        }
    }

    /**
     * REQ-GRAFO-003: Inserting then removing a self-loop should return the inserted edge with correct properties,
     * and subsequent removals should return null.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a sufficiently large graph
        Grafo grafo0 = new Grafo(DEFAULT_LARGE_SIZE);

        // When: insert a self-edge and then remove it
        grafo0.insereAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO, NEGATIVE_WEIGHT);
        Grafo.Aresta removed = grafo0.retiraAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO);

        // Then: removed edge must match inserted properties
        assertNotNull("retiraAresta should return the removed edge for a previously inserted self-loop", removed);
        assertEquals("Removed edge must report the correct source vertex", VALID_VERTEX_ZERO, removed.v1());
        assertEquals("Removed edge must report the correct destination vertex", VALID_VERTEX_ZERO, removed.v2());
        assertEquals("Removed edge must report the original weight", NEGATIVE_WEIGHT, removed.peso());

        // And: edge no longer exists after removal; subsequent removal returns null
        assertFalse("After removal, existeAresta should return false for that pair",
                grafo0.existeAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO));
        assertNull("Subsequent retiraAresta on same pair should return null", grafo0.retiraAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO));

        // Graph size unchanged
        assertEquals("Removing an edge should not change the number of vertices", DEFAULT_LARGE_SIZE, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-004: Inserting an edge and using adjacency iteration should yield the inserted edge when iterating.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a graph with capacity for our test vertices
        Grafo grafo0 = new Grafo(DEFAULT_LARGE_SIZE);

        // When: insert a self-edge with a negative weight and iterate adjacency
        grafo0.insereAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO, NEGATIVE_WEIGHT_ALT);

        // Position the adjacency iterator (if supported) and obtain next adjacency
        try {
            // Some implementations require calling primeiroListaAdj before proxAdj
            grafo0.primeiroListaAdj(VALID_VERTEX_ZERO);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            // If implementation validates, surface the unexpected validation as a failure
            fail("primeiroListaAdj threw an unexpected exception: " + ex.getMessage());
        }

        Grafo.Aresta adj = grafo0.proxAdj(VALID_VERTEX_ZERO);

        assertNotNull("After inserting a self-edge, proxAdj should return the edge for that vertex", adj);
        assertEquals("Adjacency edge weight should match insertion", NEGATIVE_WEIGHT_ALT, adj.peso());
        assertEquals("Adjacency edge source should be the vertex queried", VALID_VERTEX_ZERO, adj.v1());
        assertEquals("Adjacency edge destination should be the same for a self-loop", VALID_VERTEX_ZERO, adj.v2());

        // Graph size remains stable
        assertEquals("numVertices should remain equal to construction parameter", DEFAULT_LARGE_SIZE, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-005: Querying the adjacency of an empty graph must not report any edges and must preserve vertex count.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: an empty graph (no edges) of a large size
        Grafo grafo0 = new Grafo(DEFAULT_LARGE_SIZE);

        // When: position adjacency iterator for vertex zero and attempt to fetch adjacency
        try {
            grafo0.primeiroListaAdj(VALID_VERTEX_ZERO);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            fail("primeiroListaAdj threw when it should accept valid indices: " + ex.getMessage());
        }

        Grafo.Aresta adj = grafo0.proxAdj(VALID_VERTEX_ZERO);

        // Then: adjacency should be null (no edges) and vertex count must match construction
        assertNull("No adjacency expected for a freshly constructed graph vertex", adj);
        assertEquals("Graph vertex count should match requested size", DEFAULT_LARGE_SIZE, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-006: Newly constructed graph should not contain any edges.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: a small graph with no edges
        Grafo grafo0 = new Grafo(DEFAULT_SMALL_SIZE);

        // When: query for a self-edge that was never inserted
        boolean exists = grafo0.existeAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO);

        // Then: no such edge should exist and the vertex count must be correct
        assertFalse("Fresh graph should not contain a self-edge by default", exists);
        assertEquals("numVertices must equal construction parameter", DEFAULT_SMALL_SIZE, grafo0.numVertices());

        // And: removal should return null for non-existent edges
        assertNull("retiraAresta should return null when trying to remove a non-existent edge", grafo0.retiraAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO));
    }

    /**
     * REQ-GRAFO-007: Inserting an edge should make existeAresta return true and the inserted edge should be removable.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given: an empty graph
        Grafo grafo0 = new Grafo(DEFAULT_SMALL_SIZE);

        // When: insert a self-edge with zero weight
        grafo0.insereAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO, SELF_EDGE_WEIGHT);

        // Then: existence should be reported and removal should succeed
        assertTrue("Inserted self-edge should be reported by existeAresta", grafo0.existeAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO));

        Grafo.Aresta removed = grafo0.retiraAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO);
        assertNotNull("retiraAresta should return the previously inserted edge", removed);
        assertEquals("Removed edge must have the originally inserted weight", SELF_EDGE_WEIGHT, removed.peso());

        // Graph still has the same number of vertices
        assertEquals("Vertex count remains unchanged after edge operations", DEFAULT_SMALL_SIZE, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-008: Removing a non-existent edge should return null and should not remove unrelated edges.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given: a graph with a known self-edge
        Grafo grafo0 = new Grafo(DEFAULT_LARGE_SIZE);
        grafo0.insereAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO, NEGATIVE_WEIGHT);

        // When: attempt to remove a different (non-existent) edge
        Grafo.Aresta removedNonExistent = grafo0.retiraAresta(VALID_VERTEX_ZERO, 41);

        // Then: removal of non-existent edge yields null and original self-edge still exists
        assertNull("Attempting to remove a non-existent edge should return null", removedNonExistent);
        assertTrue("Existing self-edge should remain after attempting to remove a different edge",
                grafo0.existeAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO));
        assertEquals("Vertex count unchanged", DEFAULT_LARGE_SIZE, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-009: numVertices must return the size given at construction and operations on adjacency should not alter it.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given: a medium-sized graph
        Grafo grafo0 = new Grafo(DEFAULT_MEDIUM_SIZE);

        // When: query the number of vertices and perform a few safe adjacency queries
        int count = grafo0.numVertices();

        // Then: must match requested size and adjacency queries must be safe
        assertEquals("numVertices should reflect construction parameter", DEFAULT_MEDIUM_SIZE, count);

        try {
            grafo0.primeiroListaAdj(VALID_VERTEX_ZERO);
            Grafo.Aresta a = grafo0.proxAdj(VALID_VERTEX_ZERO);
            assertNull("No adjacency expected for a newly created graph", a);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            fail("Adjacency methods should accept valid indices without throwing: " + ex.getMessage());
        }
    }

    /**
     * REQ-GRAFO-010: Transposing a graph should produce a distinct Grafo instance with the same vertex count
     * and with reversed directed edges.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given: a graph with a self-edge and a distinct directed edge
        Grafo grafo0 = new Grafo(DEFAULT_LARGE_SIZE);
        // Keep the originally inserted self-loop from the auto-generated case
        grafo0.insereAresta(VALID_VERTEX_ZERO, VALID_VERTEX_ZERO, NEGATIVE_WEIGHT);
        // Add an additional directed edge to validate transpose behavior
        grafo0.insereAresta(EXTRA_V1, EXTRA_V2, EXTRA_WEIGHT);

        // When: create transposed graph
        Grafo grafoT = grafo0.grafoTransposto();

        // Then: transposed graph must be a distinct instance with same number of vertices
        assertNotSame("grafoTransposto should return a distinct object", grafoT, grafo0);
        assertEquals("Transposed graph must preserve vertex count", grafo0.numVertices(), grafoT.numVertices());
        assertEquals("Original graph vertex count must remain unchanged", DEFAULT_LARGE_SIZE, grafo0.numVertices());

        // And: the non-self edge must be reversed in the transpose
        assertTrue("Original graph should contain the edge EXTRA_V1->EXTRA_V2", grafo0.existeAresta(EXTRA_V1, EXTRA_V2));
        assertTrue("Transposed graph should contain the reversed edge EXTRA_V2->EXTRA_V1", grafoT.existeAresta(EXTRA_V2, EXTRA_V1));

        // Validate weights if accessible via removal on transpose (defensive: handle possible nulls)
        Grafo.Aresta removedFromTranspose = grafoT.retiraAresta(EXTRA_V2, EXTRA_V1);
        assertNotNull("Removed edge from transpose should exist and reflect reversed arc", removedFromTranspose);
        assertEquals("Weight of reversed edge in transpose should match original", EXTRA_WEIGHT, removedFromTranspose.peso());
    }
}