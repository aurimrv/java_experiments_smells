package ds.seed6733;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Grafo (improved and documented).
 *
 * These tests exercise basic graph operations (insert, remove, query, transpose)
 * and include lightweight boundary/behavior checks. Each test follows a simple
 * Given-When-Then structure in comments and includes descriptive assertion messages
 * to aid debugging and traceability.
 *
 * Requirement trace: GRAFO-CORE-001 (basic adjacency operations)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Given a fresh Grafo, when inserting a self-loop edge and printing,
     * then the graph should report the expected number of vertices and the
     * inserted edge should be discoverable via adjacency queries.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();

        // When: insert a self-loop edge and call imprime (should not throw)
        grafo0.insereAresta(0, 0, 0);
        try {
            grafo0.imprime();
        } catch (Exception e) {
            fail("imprime() should not throw for a graph with a single self-loop: " + e.getMessage());
        }

        // Then: verify number of vertices and that the inserted edge is present
        assertEquals("Graph should initialize with 100 vertices", 100, grafo0.numVertices());
        assertTrue("Inserted edge (0->0) should exist after insereAresta", grafo0.existeAresta(0, 0));

        Grafo.Aresta a = grafo0.proxAdj(0);
        assertNotNull("proxAdj(0) should return the inserted adjacency (not null)", a);
        assertEquals("Inserted edge v1 should be 0", 0, a.v1());
        assertEquals("Inserted edge v2 should be 0", 0, a.v2());
        assertEquals("Inserted edge peso should be 0", 0, a.peso());
    }

    /**
     * Given a fresh Grafo with a single inserted edge, when removing that edge,
     * then the returned Aresta should match the inserted values and the edge
     * should no longer exist in the graph.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();
        grafo0.insereAresta(0, 0, 0);

        // When: remove the previously inserted edge
        Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

        // Then: removed edge should match expectations and graph should not contain it anymore
        assertNotNull("retiraAresta(0,0) should return the removed edge, not null", removed);
        assertEquals("Removed edge v1 mismatch", 0, removed.v1());
        assertEquals("Removed edge v2 mismatch", 0, removed.v2());
        assertEquals("Removed edge peso mismatch", 0, removed.peso());
        assertFalse("Edge (0->0) should no longer exist after removal", grafo0.existeAresta(0, 0));
        assertEquals("Number of vertices should remain unchanged after removal", 100, grafo0.numVertices());
    }

    /**
     * Given a fresh Grafo, when querying the first adjacency for a vertex index,
     * then the method should either return null (no adjacency) or an Aresta whose
     * source matches the requested vertex. The graph should still report the
     * canonical number of vertices.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();

        // When: request the first adjacency for vertex 1
        Grafo.Aresta firstAdj = null;
        try {
            firstAdj = grafo0.primeiroListaAdj(1);
        } catch (IndexOutOfBoundsException e) {
            // Acceptable behavior in some implementations for out-of-range indices;
            // rethrowing would fail the test environment, so convert to a clear failure.
            fail("primeiroListaAdj(1) threw IndexOutOfBoundsException unexpectedly: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            fail("primeiroListaAdj(1) threw IllegalArgumentException unexpectedly: " + e.getMessage());
        }

        // Then: either no adjacency or adjacency corresponds to vertex 1
        if (firstAdj != null) {
            assertEquals("If primeiroListaAdj(1) returns an edge, its source v1 must be 1", 1, firstAdj.v1());
        }
        assertEquals("Graph should report the expected number of vertices", 100, grafo0.numVertices());
    }

    /**
     * Given a fresh Grafo, when checking for a non-inserted edge (0->239),
     * then existeAresta should return false and vertex count should be correct.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();

        // When
        boolean exists = false;
        try {
            exists = grafo0.existeAresta(0, 239);
        } catch (Exception e) {
            // Defensive: if implementation throws for out-of-range check, surface that
            fail("existeAresta(0,239) should not throw, but threw: " + e.getMessage());
        }

        // Then
        assertFalse("No edge (0->239) should exist in a fresh graph", exists);
        assertEquals("Graph must have the expected number of vertices", 100, grafo0.numVertices());
    }

    /**
     * Given a fresh Grafo, when inserting an edge (0->0), then queries should
     * indicate the edge exists and adjacency access should return the correct Aresta.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();

        // When
        grafo0.insereAresta(0, 0, 0);

        // Then: multiple checks to validate insertion behavior
        assertTrue("After insereAresta(0,0,0), existeAresta(0,0) must be true", grafo0.existeAresta(0, 0));
        Grafo.Aresta adj = grafo0.proxAdj(0);
        assertNotNull("proxAdj(0) should return the adjacency for vertex 0 after insertion", adj);
        assertEquals("Adjacency v1 must be 0", 0, adj.v1());
        assertEquals("Adjacency v2 must be 0", 0, adj.v2());
        assertEquals("Adjacency peso must be 0", 0, adj.peso());
        assertEquals("Graph vertex count should remain standard after insertion", 100, grafo0.numVertices());
    }

    /**
     * Given a fresh Grafo with one inserted edge, when attempting to remove an edge
     * with an invalid target index, retiraAresta should return null and not remove the valid edge.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();
        grafo0.insereAresta(0, 0, 0);

        // When: attempt removal with an invalid destination index
        Grafo.Aresta removedInvalid = grafo0.retiraAresta(0, -74);

        // Then: invalid removal returns null and original edge remains
        assertNull("retiraAresta with invalid v2 should return null", removedInvalid);
        assertTrue("Original edge (0->0) should remain after invalid removal attempt", grafo0.existeAresta(0, 0));

        // Also validate that removing the valid edge works
        Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
        assertNotNull("retiraAresta(0,0) should remove and return the edge", removed);
        assertFalse("Edge (0->0) should no longer exist after successful removal", grafo0.existeAresta(0, 0));
        assertEquals("Number of vertices should remain unchanged after removals", 100, grafo0.numVertices());
    }

    /**
     * Given a newly constructed Grafo, numVertices should return the expected baseline.
     * Also verify that inserting edges does not change the vertex count.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();

        // When & Then: initial vertex count
        int initial = grafo0.numVertices();
        assertEquals("Initial number of vertices must be 100", 100, initial);

        // When: insert an edge and ensure vertex count remains stable
        grafo0.insereAresta(0, 1, 5);
        assertEquals("Inserting edges should not change the number of vertices", 100, grafo0.numVertices());
        assertTrue("Inserted edge (0->1) should exist", grafo0.existeAresta(0, 1));
    }

    /**
     * Given a graph with a self-loop, the transpose graph should be a distinct instance
     * and should reflect the transposed adjacency relationships.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();
        grafo0.insereAresta(0, 0, 0);

        // When: obtain transpose
        Grafo transposed = grafo0.grafoTransposto();

        // Then: sanity checks
        assertNotSame("grafoTransposto() should return a distinct Grafo instance", grafo0, transposed);
        assertEquals("Transposed graph should have the expected number of vertices", 100, transposed.numVertices());

        // For a self-loop, the transposed graph should also contain (0->0)
        assertTrue("Transposed graph should contain the transposed self-loop (0->0)", transposed.existeAresta(0, 0));
        // Original should still contain its edge
        assertTrue("Original graph should still contain the original edge (0->0)", grafo0.existeAresta(0, 0));
    }

    /**
     * Given a fresh Grafo, when inserting an edge with negative weight, proxAdj should
     * return an Aresta reflecting that negative weight and correct endpoints.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo();

        // When: insert an edge with negative weight
        grafo0.insereAresta(0, 1, -1);

        // Then: adjacency returned must match the inserted values
        Grafo.Aresta adj = grafo0.proxAdj(0);
        assertNotNull("proxAdj(0) should return the adjacency after inserting (0->1,-1)", adj);
        assertEquals("Adjacency source v1 must be 0", 0, adj.v1());
        assertEquals("Adjacency destination v2 must be 1", 1, adj.v2());
        assertEquals("Adjacency peso must reflect the negative weight", -1, adj.peso());
        assertEquals("Graph should preserve baseline vertex count", 100, grafo0.numVertices());
    }
}