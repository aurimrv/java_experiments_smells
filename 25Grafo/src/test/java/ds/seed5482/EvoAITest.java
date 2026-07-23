package ds.seed5482;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo. Each test documents the requirement it addresses (REQ-IDs)
 * and follows a Given-When-Then structure. Assertions include descriptive messages to aid debugging.
 *
 * Note: This class retains the original test method names (test0..test7) to comply with the requirement.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Helper to create a fresh graph instance for clarity and reuse
    private static Grafo freshGraph() {
        return new Grafo();
    }

    /**
     * REQ-GRAPH-001
     * Given a new graph, when an edge is inserted and the graph is printed,
     * then the vertex count should remain stable and the inserted edge should be present.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo g = freshGraph();
        int beforeVertices = g.numVertices();
        assertEquals("Initial graph should contain 100 vertices as expected by the implementation", 100, beforeVertices);

        // When: insert an edge and call imprime (imprime should not mutate vertex set)
        g.insereAresta(0, 10, 483); // typical valid indices within 0..99
        g.imprime(); // exercise non-mutating output behavior

        // Then
        assertEquals("Vertex count must remain unchanged after printing", beforeVertices, g.numVertices());
        assertTrue("Inserted edge (0 -> 10) should exist after insertion", g.existeAresta(0, 10));
        Grafo.Aresta removed = g.retiraAresta(0, 10);
        assertNotNull("retiraAresta should return the previously inserted edge object", removed);
        assertEquals("Removed edge should have v1 == 0", 0, removed.v1());
        assertEquals("Removed edge should have v2 == 10", 10, removed.v2());
        assertEquals("Removed edge should preserve the inserted weight", 483, removed.peso());
    }

    /**
     * REQ-GRAPH-002
     * Given a graph with a single directed edge 1->2,
     * when the transpose is created, then it must contain the reversed edge 2->1 and be a distinct object.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo g = freshGraph();
        g.insereAresta(1, 2, 5);

        // When
        Grafo gt = g.grafoTransposto();

        // Then
        assertNotNull("Transpose graph should not be null", gt);
        assertEquals("Transpose should preserve the number of vertices", g.numVertices(), gt.numVertices());
        assertNotSame("Transpose must be a different instance than the original graph", gt, g);
        assertTrue("Original should contain the edge 1->2", g.existeAresta(1, 2));
        assertTrue("Transpose should contain the reversed edge 2->1", gt.existeAresta(2, 1));
    }

    /**
     * REQ-GRAPH-003
     * Given a fresh graph, calling primeiroListaAdj for a valid vertex index must not throw and should preserve vertex count.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo g = freshGraph();

        // When / Then (calling primeiroListaAdj is primarily an information query)
        // We don't assert a specific return contract here (implementation detail), but ensure it doesn't throw
        g.primeiroListaAdj(1);
        assertEquals("Calling primeiroListaAdj must not change the vertex count", 100, g.numVertices());
    }

    /**
     * REQ-GRAPH-004
     * Given insertion of an edge with a negative weight, the graph should still record the edge and preserve the weight.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo g = freshGraph();

        // When
        g.insereAresta(1, 1, -1646);

        // Then
        assertTrue("Edge 1->1 should exist after insertion with negative weight", g.existeAresta(1, 1));
        Grafo.Aresta a = g.retiraAresta(1, 1);
        assertNotNull("retiraAresta should return the inserted self-loop edge", a);
        assertEquals("Self-loop should have v1 == 1", 1, a.v1());
        assertEquals("Self-loop should have v2 == 1", 1, a.v2());
        assertEquals("Edge weight must be the negative value that was inserted", -1646, a.peso());
        assertEquals("Vertex count should remain as defined by the implementation", 100, g.numVertices());
    }

    /**
     * REQ-GRAPH-005
     * Given an inserted self-loop edge with weight 0, removing it should return its metadata.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo g = freshGraph();
        g.insereAresta(0, 0, 0);

        // When
        Grafo.Aresta removed = g.retiraAresta(0, 0);

        // Then
        assertNotNull("Removing an existing self-loop should not return null", removed);
        assertEquals("Removed edge v1 must match", 0, removed.v1());
        assertEquals("Removed edge v2 must match", 0, removed.v2());
        assertEquals("Removed edge weight must match inserted weight", 0, removed.peso());
        assertEquals("Vertex count should remain stable after removing an edge", 100, g.numVertices());
    }

    /**
     * REQ-GRAPH-006
     * Given an attempt to remove a non-existing edge, retiraAresta must return null and not affect other edges.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo g = freshGraph();
        g.insereAresta(1, 1, 1);

        // When
        Grafo.Aresta removedNonExistent = g.retiraAresta(1, 55);

        // Then
        assertNull("retiraAresta should return null when the specified edge does not exist", removedNonExistent);
        assertTrue("Previously inserted edge 1->1 must still exist after an attempt to remove a different edge", g.existeAresta(1, 1));
        assertEquals("Vertex count remains consistent", 100, g.numVertices());
    }

    /**
     * REQ-GRAPH-007
     * Given a new graph, numVertices should return the expected stable number of vertices and be idempotent.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo g = freshGraph();

        // When / Then
        int first = g.numVertices();
        int second = g.numVertices();
        assertEquals("numVertices must report the implementation's fixed vertex count", 100, first);
        assertEquals("Repeated calls to numVertices must be idempotent", first, second);
    }

    /**
     * REQ-GRAPH-008
     * Given a fresh graph with no edges, existeAresta should return false for arbitrary indices and must not alter vertex count.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Grafo g = freshGraph();

        // When
        boolean exists = g.existeAresta(0, 0);

        // Then
        assertFalse("New graph should not contain any edge from 0 to 0", exists);
        assertEquals("Vertex count must be preserved for a fresh graph", 100, g.numVertices());
    }
}