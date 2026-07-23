package ds.seed5311;

import ds.Grafo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for Grafo core behaviors.
 * Requirement: GRAPH-1 - basic graph operations (insert, remove, query, transpose, iteration).
 *
 * These tests are unit tests that exercise common and boundary behaviours for the Grafo implementation.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    private Grafo grafo;

    @Before
    public void setUp() {
        // Given: a fresh graph instance for each test to ensure isolation
        grafo = new Grafo();
    }

    @After
    public void tearDown() {
        // Clean up references
        grafo = null;
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given a new graph
        // When inserting a self-loop on vertex 0 with weight 822 and preparing adjacency iteration
        grafo.insereAresta(0, 0, 822);
        grafo.primeiroListaAdj(0);
        Grafo.Aresta aresta = grafo.proxAdj(0);

        // Call imprime() as part of the observable behavior; should not throw
        grafo.imprime();

        // Then: the inserted self-loop must be visible and correct, and vertex count remains the default
        assertNotNull("Expected a self-loop adjacency after insertion", aresta);
        assertEquals("Self-loop v1 should be 0", 0, aresta.v1());
        assertEquals("Self-loop v2 should be 0", 0, aresta.v2());
        assertEquals("Self-loop weight should be preserved", 822, aresta.peso());
        assertEquals("Default number of vertices should be 100", 100, grafo.numVertices());
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given a fresh graph
        // When inserting an edge of weight 0 (verify zero-weight handling)
        grafo.insereAresta(0, 0, 0);
        grafo.primeiroListaAdj(0);
        Grafo.Aresta a = grafo.proxAdj(0);

        // Then: the adjacency for the inserted edge must be present and weight zero must be preserved
        assertNotNull("Expected adjacency after inserting zero-weight edge", a);
        assertEquals("v1 should be 0 for inserted edge", 0, a.v1());
        assertEquals("v2 should be 0 for inserted edge", 0, a.v2());
        assertEquals("Weight should be zero as inserted", 0, a.peso());
        assertEquals("Vertex count should remain the default value", 100, grafo.numVertices());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        // Given an empty graph
        // When preparing adjacency iteration on a vertex that has no edges
        grafo.primeiroListaAdj(0);
        Grafo.Aresta a = grafo.proxAdj(0);

        // Then: there should be no adjacency returned and the vertex count remains correct
        assertNull("Expect no adjacency for a fresh vertex with no edges", a);
        assertEquals("Vertex count should be the default 100", 100, grafo.numVertices());
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        // Given a fresh graph
        // When inserting an edge with a negative weight and then removing it
        grafo.insereAresta(0, 0, -745);

        // Then: the edge should exist, removal should return the edge and afterwards it should no longer exist
        assertTrue("Edge 0->0 should exist after insertion", grafo.existeAresta(0, 0));
        Grafo.Aresta removed = grafo.retiraAresta(0, 0);
        assertNotNull("Removing an existing edge should return the removed edge", removed);
        assertEquals("Removed edge should preserve negative weight", -745, removed.peso());
        assertFalse("Edge should not exist after removal", grafo.existeAresta(0, 0));
        assertEquals("Vertex count should remain unchanged", 100, grafo.numVertices());
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        // Given a fresh graph
        // When querying existence on boundary vertices (0 and 99) and attempting out-of-range indices
        boolean existsAt99 = grafo.existeAresta(99, 99);
        boolean existsAt0 = grafo.existeAresta(0, 0);

        // Then: no edges should exist by default on these valid boundary indices
        assertFalse("No edge should exist at upper boundary index 99 in a fresh graph", existsAt99);
        assertFalse("No edge should exist at lower boundary index 0 in a fresh graph", existsAt0);

        // For invalid indices ensure either a safe false is returned or a well-defined exception is thrown.
        try {
            boolean negativeQuery = grafo.existeAresta(-1, -1);
            assertFalse("Negative indices should not report an existing edge (or should throw)", negativeQuery);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            // Acceptable outcome: implementation may throw for invalid indices
        }

        try {
            boolean hugeQuery = grafo.existeAresta(Integer.MAX_VALUE, Integer.MAX_VALUE);
            assertFalse("Extremely large indices should not report an existing edge (or should throw)", hugeQuery);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            // Acceptable outcome
        }

        // Verify vertex count reference for traceability
        assertEquals("Vertex count should be the default 100", 100, grafo.numVertices());
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        // Given a graph with a known edge
        grafo.insereAresta(0, 0, -745);

        // When attempting to remove a non-existent edge (or invalid target index)
        Grafo.Aresta removed = null;
        try {
            removed = grafo.retiraAresta(0, -40); // likely non-existent or invalid
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
            // Implementation may throw for invalid indices; treat as acceptable
        }

        // Then: no edge should have been removed for the invalid/non-existent target and original edge must remain
        assertNull("Removing a non-existent or invalid edge should return null or throw; removed value", removed);
        assertTrue("Original edge 0->0 should still exist after attempting to remove a different/non-existent edge", grafo.existeAresta(0, 0));
        assertEquals("Vertex count should be unchanged after failed removal attempt", 100, grafo.numVertices());
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        // Given a fresh graph
        // When querying the number of vertices
        int count = grafo.numVertices();

        // Then: the graph reports 100 vertices by default and basic invariants hold
        assertEquals("Default vertex count must be 100", 100, count);
        assertTrue("Vertex count must be positive", count > 0);
        assertEquals("Maximum valid vertex index should be count-1", 99, count - 1);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        // Given a graph with a directed edge 1->2
        grafo.insereAresta(1, 2, 5);

        // When creating the transposed graph
        Grafo transposed = grafo.grafoTransposto();

        // Then: the transposed graph is a distinct object, has same vertex count,
        // and contains the reversed edge while the original still contains the original edge
        assertNotSame("Transposed graph should be a different instance", grafo, transposed);
        assertEquals("Transposed graph should have the same number of vertices", grafo.numVertices(), transposed.numVertices());
        assertTrue("Original graph must contain edge 1->2", grafo.existeAresta(1, 2));
        assertTrue("Transposed graph must contain reversed edge 2->1", transposed.existeAresta(2, 1));
    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        // Given: an inserted self-loop edge
        grafo.insereAresta(0, 0, 822);

        // When removing that edge
        Grafo.Aresta removed = grafo.retiraAresta(0, 0);

        // Then: the removed edge must contain the correct metadata and no longer exist in the graph
        assertNotNull("Removing an existing edge should return the removed edge object", removed);
        assertEquals("Removed edge must report the original weight", 822, removed.peso());
        assertEquals("Removed edge must report v1 correctly", 0, removed.v1());
        assertEquals("Removed edge must report v2 correctly", 0, removed.v2());
        assertFalse("Edge should no longer exist after removal", grafo.existeAresta(0, 0));

        // And printing the graph should not throw
        grafo.imprime();
        assertEquals("Vertex count should remain the default 100 after removal", 100, grafo.numVertices());
    }
}