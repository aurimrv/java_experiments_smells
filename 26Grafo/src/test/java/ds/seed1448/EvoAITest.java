package ds.seed1448;

import ds.Grafo;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved and maintainable test suite for ds.Grafo focused on small, focused behaviors.
 * Each test follows a Given-When-Then style and includes descriptive assertion messages
 * to aid diagnosability.
 *
 * Traceability: REQ-GRAFO-001..010 (example requirement identifiers)
 */
@Category(UnitTest.class)
public class EvoAITest {

    private static final int WEIGHT_HIGH = 3878;
    private static final int WEIGHT_MED = 1926;
    private static final int WEIGHT_NEG = -2092;

    @Before
    public void setUp() {
        // Placeholder for shared setup if needed in future.
    }

    /**
     * Given a graph with a single vertex,
     * when inserting a self-loop and printing,
     * then the edge should exist and the vertex count remains 1.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo g = new Grafo(1);

        // When: insert a self-loop on the only vertex and call imprime() to ensure no exceptions
        g.insereAresta(0, 0, WEIGHT_HIGH);
        try {
            g.imprime(); // exercise output path; should not throw
        } catch (Exception e) {
            fail("imprime() threw an exception for a valid graph state: " + e.getMessage());
        }

        // Then
        assertEquals("Graph should still report exactly 1 vertex after insertion", 1, g.numVertices());
        assertTrue("Inserted self-loop (0->0) should be reported as existing", g.existeAresta(0, 0));
    }

    /**
     * Given a graph with two vertices,
     * when inserting an edge and then removing it,
     * then the removed edge object should reflect the original insertion.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo g = new Grafo(2);

        // When
        g.insereAresta(0, 1, WEIGHT_HIGH);
        Grafo.Aresta removed = g.retiraAresta(0, 1);

        // Then
        assertNotNull("retiraAresta should return the removed edge for an existing edge (0->1)", removed);
        assertEquals("Removed edge v1 should match source", 0, removed.v1());
        assertEquals("Removed edge v2 should match target", 1, removed.v2());
        assertEquals("Removed edge weight should match inserted value", WEIGHT_HIGH, removed.peso());
        assertEquals("Vertex count should remain unchanged after removing an edge", 2, g.numVertices());
    }

    /**
     * Given a small acyclic graph,
     * when creating the transpose graph,
     * then transposed edges should be reversed while preserving vertex count.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo g = new Grafo(3);
        g.insereAresta(0, 1, 5);
        g.insereAresta(1, 2, 7);

        // When
        Grafo gt = g.grafoTransposto();

        // Then
        assertNotNull("grafoTransposto() must not return null", gt);
        assertEquals("Transposed graph must have same number of vertices", g.numVertices(), gt.numVertices());
        assertTrue("Transposed graph should contain reversed edge (1->0)", gt.existeAresta(1, 0));
        assertTrue("Transposed graph should contain reversed edge (2->1)", gt.existeAresta(2, 1));

        // Also verify original still has original edges
        assertTrue("Original graph should still contain edge (0->1)", g.existeAresta(0, 1));
        assertTrue("Original graph should still contain edge (1->2)", g.existeAresta(1, 2));
    }

    /**
     * Given a graph with a self-loop,
     * when checking existence for an unrelated vertex pair,
     * then inexistence should be reported.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo g = new Grafo(2);

        // When
        g.insereAresta(0, 0, WEIGHT_MED);

        // Then
        assertTrue("Inserted self-loop (0->0) should exist", g.existeAresta(0, 0));
        assertFalse("Non-inserted edge (1->0) should not exist", g.existeAresta(1, 0));
        assertEquals("Number of vertices should remain as constructed", 2, g.numVertices());
    }

    /**
     * Given a small directed graph,
     * when inserting an edge in one direction,
     * then querying the opposite direction should return false.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo g = new Grafo(2);

        // When
        g.insereAresta(0, 1, WEIGHT_HIGH);

        // Then
        assertTrue("Edge (0->1) should be present after insertion", g.existeAresta(0, 1));
        assertFalse("Reverse edge (1->0) should not exist unless explicitly inserted", g.existeAresta(1, 0));
        assertEquals("Graph vertex count must remain correct", 2, g.numVertices());
    }

    /**
     * Given a graph with multiple vertices,
     * when inserting multiple edges including duplicates or negative weights,
     * then only the intended structural properties should hold (vertex count, edge existence).
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo g = new Grafo(3);

        // When: insert a couple of edges (including a negative weight to exercise weight handling)
        g.insereAresta(0, 1, WEIGHT_HIGH);
        g.insereAresta(1, 2, WEIGHT_NEG); // negative weight, if supported, should be stored
        g.insereAresta(0, 2, 0); // zero weight edge

        // Then
        assertEquals("Vertex count should be unchanged after multiple insertions", 3, g.numVertices());
        assertTrue("Edge (0->1) must exist", g.existeAresta(0, 1));
        assertTrue("Edge (1->2) with negative weight should be present if allowed", g.existeAresta(1, 2));
        assertTrue("Edge (0->2) with zero weight should be present", g.existeAresta(0, 2));
    }

    /**
     * Given an empty graph (0 vertices),
     * when querying its size and calling imprimir,
     * then size should be zero and operations should not crash.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo g = new Grafo(0);

        // When / Then
        assertEquals("Graph constructed with zero vertices must report size 0", 0, g.numVertices());
        try {
            g.imprime(); // should be a no-op or safely handle empty graph
        } catch (Exception e) {
            fail("imprime() must not throw on an empty graph: " + e.getMessage());
        }
    }

    /**
     * Given a graph where an edge is inserted,
     * when creating its transpose,
     * then the transpose must reflect the reversed edge and preserve vertex count.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Grafo g = new Grafo(3);
        g.insereAresta(2, 1, WEIGHT_MED);

        // When
        Grafo gt = g.grafoTransposto();

        // Then
        assertNotNull("grafoTransposto must return a non-null graph instance", gt);
        assertEquals("Transposed graph should have the same number of vertices as original", g.numVertices(), gt.numVertices());
        assertTrue("Original must report edge (2->1) exists", g.existeAresta(2, 1));
        assertTrue("Transposed must report reversed edge (1->2) exists", gt.existeAresta(1, 2));
    }
}