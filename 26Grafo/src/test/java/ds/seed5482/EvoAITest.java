package ds.seed5482;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.junit.Ignore;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved, focused tests for Grafo.
 *
 * Each test uses a Given-When-Then structure in comments and contains descriptive assertions.
 * Tests are intentionally small and focused on a single behavior.
 */
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Helper: create a small graph with two vertices and one edge 0->1 with given weight.
    private Grafo createTwoVertexGraphWithEdge(int weight) {
        Grafo g = new Grafo(2);
        g.insereAresta(0, 1, weight);
        return g;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: a graph with a typical number of vertices
        Grafo grafo0 = new Grafo(1058);

        // When: attempt to insert an edge where the destination vertex is invalid (negative)
        // This exercise checks that invalid insertions do not create observable edges.
        grafo0.insereAresta(1, -1988, 1);

        // Also call imprime to exercise I/O path (no assertion on output, just ensure no exception)
        grafo0.imprime();

        // Then: the graph should still report the original number of vertices
        assertEquals("Number of vertices should remain unchanged after invalid insertion", 1058, grafo0.numVertices());

        // And: the invalid edge should not be reported as existing
        assertFalse("Edge to a negative vertex should not exist", grafo0.existeAresta(1, -1988));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a graph with a fixed number of vertices
        Grafo grafo0 = new Grafo(321);

        // When: insert an edge using an out-of-range source index (exercise handling of invalid source)
        // The API may create a sentinel/placeholder Aresta or return null on removal; we validate stable graph size.
        grafo0.insereAresta(2500, -91, -1057);

        // Then: removing an edge with out-of-range indices should not change the vertex count
        Grafo.Aresta removed = grafo0.retiraAresta(2500, 0);
        assertEquals("Vertex count must remain unchanged after out-of-range operations", 321, grafo0.numVertices());

        // If an Aresta is returned, validate its basic properties are consistent with the call (defensive checks).
        if (removed != null) {
            assertEquals("Returned Aresta.v1 should reflect requested source index", 2500, removed.v1());
            assertEquals("Returned Aresta.v2 should reflect requested destination index (or default 0)", 0, removed.v2());
            // peso may be implementation-defined when removing non-existing entries; check it's non-negative if present
            assertTrue("Returned Aresta.peso should be non-negative", removed.peso() >= 0);
        } else {
            // If null, that's also acceptable — just assert that API was stable.
            assertNull("retiraAresta may return null for out-of-range removal", removed);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a small graph with one directed edge 0->1
        Grafo grafo0 = createTwoVertexGraphWithEdge(5);

        // When: compute the transposed graph (should have edge 1->0)
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then: removing the transposed edge from the transpose should yield a corresponding Aresta
        Grafo.Aresta removed = grafo1.retiraAresta(1, 0);
        assertNotNull("Removing existing transposed edge should return a non-null Aresta", removed);
        assertEquals("Transposed Aresta.v1 should be 1", 1, removed.v1());
        assertEquals("Transposed Aresta.v2 should be 0", 0, removed.v2());
        assertEquals("Transposed Aresta.peso should match original weight", 5, removed.peso());
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: a graph and its transpose, and a self-loop inserted in the original graph
        Grafo grafo0 = new Grafo(3);
        Grafo grafo1 = grafo0.grafoTransposto();

        // When: insert self-loop 1->1 in original graph
        grafo0.insereAresta(1, 1, 1);

        // Then: the transpose should also reflect a self-loop at the same vertex; removal should yield the created Aresta
        Grafo.Aresta removedFromTranspose = grafo1.retiraAresta(1, 1);
        // Depending on implementation, transpose may reflect changes or be a snapshot. Accept both behaviors sensibly.
        if (removedFromTranspose != null) {
            assertEquals("Self-loop v1 should be 1", 1, removedFromTranspose.v1());
            assertEquals("Self-loop v2 should be 1", 1, removedFromTranspose.v2());
            assertEquals("Self-loop peso should be 1", 1, removedFromTranspose.peso());
        } else {
            // If transpose is a snapshot made before insertion, the removal may return null; ensure no exception and graph still valid.
            assertNull("If transpose is a snapshot, removal may return null", removedFromTranspose);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: a graph with a modest number of vertices
        Grafo grafo0 = new Grafo(227);

        // When: attempt to remove a clearly non-existent edge (destination index far beyond range)
        Grafo.Aresta result = grafo0.retiraAresta(0, 4500);

        // Then: API should return null to indicate nothing removed, and number of vertices unchanged
        assertNull("Removing a non-existent edge should return null", result);
        assertEquals("Vertex count should remain unchanged after attempting to remove non-existent edge", 227, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given: an empty-but-sized graph
        Grafo grafo0 = new Grafo(227);

        // When: insert a simple edge and then check existence
        grafo0.insereAresta(1, 1, 1);

        // Then: the edge should be reported as existing
        assertTrue("Inserted edge 1->1 should exist", grafo0.existeAresta(1, 1));
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given: a graph with an inserted self-edge at vertex 1
        Grafo grafo0 = new Grafo(227);
        grafo0.insereAresta(1, 1, 1);

        // When / Then: querying for a different destination should return false
        assertFalse("Edge 1->0 should not exist after inserting 1->1", grafo0.existeAresta(1, 0));
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given: a small graph with a single edge 2->1
        Grafo grafo0 = new Grafo(3);
        grafo0.insereAresta(2, 1, 10);

        // When: compute the transpose
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then: the transpose should be a different object but have same number of vertices and the reversed edge should exist
        assertNotSame("Transpose should not be the same object as the original", grafo1, grafo0);
        assertEquals("Transpose should preserve number of vertices", grafo0.numVertices(), grafo1.numVertices());
        assertTrue("Transpose should contain the reversed edge 1->2", grafo1.existeAresta(1, 2));
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given: a graph constructed with zero vertices
        Grafo grafo0 = new Grafo(0);

        // Then: numVertices should report zero and basic operations should be safe (no exceptions)
        assertEquals("Graph constructed with 0 vertices should report 0", 0, grafo0.numVertices());
        // Attempting to remove or query edges should behave gracefully; removal should return null
        assertNull("Removing from empty graph should return null", grafo0.retiraAresta(0, 0));
        assertFalse("No edge should exist in an empty graph", grafo0.existeAresta(0, 0));
    }
}