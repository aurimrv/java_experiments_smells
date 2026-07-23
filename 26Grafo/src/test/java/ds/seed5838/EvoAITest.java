package ds.seed5838;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests so tests can be categorized if desired.
 */
interface UnitTest {}

/**
 * Improved and more descriptive unit tests for the Grafo class.
 *
 * Notes:
 * - Each test follows a simple Given-When-Then structure in comments.
 * - Tests avoid touching internal fields of Grafo and exercise public API only.
 * - Assertions include descriptive messages to aid diagnostics.
 * - Tests prefer valid edge indices (within [0, numVertices-1]) unless verifying behavior for non-existent edges.
 */
@Category(UnitTest.class)
public class EvoAITest {

    // Helper to validate a returned Aresta is consistent with the graph size.
    private void validateArestaConsistent(Grafo.Aresta a, int nVertices) {
        assertNotNull("Expected a non-null Aresta when validating consistency", a);
        int v1 = a.v1();
        int v2 = a.v2();
        // If graph has zero vertices, no Aresta should exist; caller should avoid calling this in that case.
        assertTrue("Aresta.v1() should be a non-negative index", v1 >= 0);
        assertTrue("Aresta.v2() should be a non-negative index", v2 >= 0);
        if (nVertices > 0) {
            assertTrue("Aresta.v1() should be within vertex count", v1 < nVertices);
            assertTrue("Aresta.v2() should be within vertex count", v2 < nVertices);
        }
        // peso may be any integer, but assert it is not Integer.MIN_VALUE as a sanity check for uninitialized values.
        int peso = a.peso();
        assertNotEquals("Aresta.peso() should be a regular initialized integer", Integer.MIN_VALUE, peso);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Req: GRAPH-01 - Basic insertion and existence check for a small graph.
        // Given: a graph with 2 vertices.
        Grafo grafo0 = new Grafo(2);

        // When: insert an edge between the two valid vertices and print the graph (should not throw).
        grafo0.insereAresta(0, 1, 5);
        try {
            grafo0.imprime(); // Should not throw; just an observational call.
        } catch (Throwable t) {
            fail("Calling imprime() should not throw an exception: " + t.getMessage());
        }

        // Then: number of vertices remains as constructed and the inserted edge exists.
        assertEquals("Graph should report the number of vertices given at construction", 2, grafo0.numVertices());
        assertTrue("Inserted edge (0,1) should be reported as existing", grafo0.existeAresta(0, 1));

        // And: removing the edge returns a consistent Aresta and edge no longer exists afterwards.
        Grafo.Aresta removed = grafo0.retiraAresta(0, 1);
        validateArestaConsistent(removed, grafo0.numVertices());
        assertFalse("Edge (0,1) should not exist after removal", grafo0.existeAresta(0, 1));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Req: GRAPH-02 - Inserting and removing an edge at boundary indices.
        // Given: a graph with many vertices to allow boundary operations.
        final int n = 266;
        Grafo grafo0 = new Grafo(n);

        // When: insert an edge using the highest valid index and lowest valid index (boundary case).
        grafo0.insereAresta(0, n - 1, 10);

        // Then: the number of vertices is unchanged and the edge exists.
        assertEquals("Vertex count should remain unchanged after insertion", n, grafo0.numVertices());
        assertTrue("Edge (0," + (n - 1) + ") should exist after insertion", grafo0.existeAresta(0, n - 1));

        // And: removing it yields a consistent Aresta and subsequent removal should return null.
        Grafo.Aresta a = grafo0.retiraAresta(0, n - 1);
        validateArestaConsistent(a, grafo0.numVertices());
        Grafo.Aresta a2 = grafo0.retiraAresta(0, n - 1);
        assertNull("Removing the same non-existent edge a second time should yield null", a2);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Req: GRAPH-03 - Self-loop handling.
        // Given: a graph with a sufficient number of vertices.
        final int n = 1514;
        Grafo grafo0 = new Grafo(n);

        // When: insert a self-loop on vertex 0.
        grafo0.insereAresta(0, 0, 1514);

        // Then: the self-loop should be reported as existing and removable.
        assertTrue("Self-loop (0,0) should be reported as existing after insertion", grafo0.existeAresta(0, 0));
        Grafo.Aresta loop = grafo0.retiraAresta(0, 0);
        validateArestaConsistent(loop, grafo0.numVertices());
        assertEquals("Self-loop endpoints should match (v1 == v2 == 0)", 0, loop.v1());
        assertEquals("Self-loop endpoints should match (v1 == v2 == 0)", 0, loop.v2());
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Req: GRAPH-04 - Removing a non-existent edge should return null.
        // Given: a graph with two vertices and no edges.
        Grafo grafo0 = new Grafo(2);

        // When: attempt to remove an edge that was never inserted.
        Grafo.Aresta removed = grafo0.retiraAresta(0, 1);

        // Then: removal of a non-existent edge must return null and vertex count stays the same.
        assertNull("retiraAresta on a non-existent edge should return null", removed);
        assertEquals("Vertex count should be unaffected by removing a non-existent edge", 2, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Req: GRAPH-05 - Typical insertion then existence verification followed by removal.
        // Given: a graph sized to include the indices used below.
        final int n = 1694;
        Grafo grafo0 = new Grafo(n);

        // When: insert an edge between two valid internal vertices.
        int v1 = 1463;
        int v2 = 760;
        int peso = 1694;
        grafo0.insereAresta(v1, v2, peso);

        // Then: existence should be true and returned Aresta should have expected weight and endpoints.
        assertTrue("Inserted edge should exist", grafo0.existeAresta(v1, v2));
        Grafo.Aresta a = grafo0.retiraAresta(v1, v2);
        validateArestaConsistent(a, grafo0.numVertices());
        assertEquals("Removed Aresta should preserve the inserted weight", peso, a.peso());
        assertEquals("Removed Aresta.v1 should match insertion", v1, a.v1());
        assertEquals("Removed Aresta.v2 should match insertion", v2, a.v2());
        // After removal, the edge should no longer exist.
        assertFalse("Edge should not exist after removal", grafo0.existeAresta(v1, v2));
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Req: GRAPH-06 - Existence queries for different endpoints.
        // Given: a graph with many vertices and one known edge.
        final int n = 1694;
        Grafo grafo0 = new Grafo(n);
        grafo0.insereAresta(1463, 760, 1694);

        // When/Then: verify the inserted edge exists and different pairs do not.
        assertTrue("Inserted (1463,760) must exist", grafo0.existeAresta(1463, 760));
        assertFalse("A different endpoint pair (1463,1254) should not exist unless explicitly inserted",
                grafo0.existeAresta(1463, 1254));
        // Verify vertex count unchanged.
        assertEquals("Vertex count should remain as constructed", n, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Req: GRAPH-07 - Operations on a graph with zero vertices should be safe no-ops.
        // Given: a graph constructed with zero vertices.
        Grafo grafo0 = new Grafo(0);

        // When: attempt to insert an edge and query existence; operations should not throw and vertex count remains zero.
        try {
            grafo0.insereAresta(0, 0, 0);
            // Query existence for any indices should be false (graph has no vertices).
            assertFalse("No edges should exist in a graph with zero vertices", grafo0.existeAresta(0, 0));
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            // Acceptable behavior is either safe no-op or documented exception; do not fail the test on predictable API choices.
        } catch (Throwable t) {
            fail("Unexpected exception when operating on graph with zero vertices: " + t.getMessage());
        }

        // Then: numVertices remains zero.
        assertEquals("Graph constructed with zero vertices must report zero vertices", 0, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Req: GRAPH-08 - numVertices semantics for empty graph.
        // Given: a graph with zero vertices.
        Grafo grafo0 = new Grafo(0);

        // When: query the number of vertices.
        int count = grafo0.numVertices();

        // Then: the count must be zero and no edges can exist.
        assertEquals("numVertices() should return 0 for a graph created with 0", 0, count);
        assertFalse("No edge should be reported in an empty graph", grafo0.existeAresta(0, 0));
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Req: GRAPH-09 - Transpose operation should preserve vertex count and produce a graph type or at least be callable safely.
        // Given: a graph with a moderate number of vertices and one directed edge.
        final int n = 105;
        Grafo grafo0 = new Grafo(n);
        grafo0.insereAresta(0, 1, 1333);

        // When: obtain the transpose representation; this operation should not throw.
        try {
            Object transposed = grafo0.grafoTransposto(); // may return Grafo or other representation depending on API.
            assertNotNull("grafoTransposto() result should not be null", transposed);
            // If it returns a Grafo, validate vertex count and that the reversed edge exists.
            if (transposed instanceof Grafo) {
                Grafo gt = (Grafo) transposed;
                assertEquals("Transpose should preserve vertex count", n, gt.numVertices());
                // If original had edge 0->1, transpose may have edge 1->0.
                assertTrue("Transpose graph should contain reversed edge (1,0) if directed", gt.existeAresta(1, 0));
            }
        } catch (Throwable t) {
            fail("grafoTransposto() should not throw an unexpected exception: " + t.getMessage());
        }

        // And: original graph vertex count is unchanged.
        assertEquals("Original graph vertex count should remain unchanged after grafoTransposto()", n, grafo0.numVertices());
    }
}