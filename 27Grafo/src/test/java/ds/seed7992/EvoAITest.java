package ds.seed7992;

import ds.Grafo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for categorizing graph-related unit tests.
 * Declared at package level so it can be applied to the test class.
 */
interface GraphTest {}

/**
 * Improved and hardening-focused version of the originally-generated tests.
 *
 * Notes:
 * - Each test documents its intent (requirement id placeholder) and follows
 *   a Given-When-Then structure in comments to increase readability.
 * - Assertions include descriptive failure messages.
 * - Magic numbers are declared as constants to improve maintainability.
 * - The class is categorized as GraphTest to allow selective execution.
 */
@Category(GraphTest.class)
public class EvoAITest {

    private static final int SIZE_LARGE = 6671;
    private static final int SIZE_MEDIUM = 1371;
    private static final int SIZE_SMALL = 313;
    private static final int SIZE_OTHER = 673;
    private static final int VERTEX_ZERO = 0;
    private static final int VERTEX_ONE = 1;

    /**
     * REQ-GRAPH-001
     *
     * Given a large graph, when a self-loop edge is inserted,
     * then the graph should report the configured number of vertices
     * and report the inserted edge as present.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_LARGE);

        // When - primary action: insert an edge (arrange + act)
        final int insertedWeight = SIZE_LARGE;
        grafo.insereAresta(VERTEX_ZERO, VERTEX_ZERO, insertedWeight);

        // Then - assert vertex count and that the edge exists with expected properties
        assertEquals("Vertex count should remain equal to the configured graph size after insertion",
                SIZE_LARGE, grafo.numVertices());
        assertTrue("Inserted self-loop should exist after insereAresta",
                grafo.existeAresta(VERTEX_ZERO, VERTEX_ZERO));

        Grafo.Aresta a = grafo.proxAdj(VERTEX_ZERO);
        assertNotNull("proxAdj must return the inserted self-loop edge", a);
        assertEquals("Edge v1 should match the source vertex", VERTEX_ZERO, a.v1());
        assertEquals("Edge v2 should match the destination vertex", VERTEX_ZERO, a.v2());
        assertEquals("Edge weight should match the inserted value", insertedWeight, a.peso());
    }

    /**
     * REQ-GRAPH-002
     *
     * Given a medium-sized graph, when inserting a negative-weight self-loop,
     * then proxAdj should return that edge with the correct fields.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_MEDIUM);
        final int negativeWeight = -819;

        // When - insert edge (act)
        grafo.insereAresta(VERTEX_ZERO, VERTEX_ZERO, negativeWeight);

        // Then - proxAdj should return the inserted edge and the graph size shouldn't change
        Grafo.Aresta retrieved = grafo.proxAdj(VERTEX_ZERO);
        assertNotNull("proxAdj should return the inserted edge for the vertex", retrieved);
        assertEquals("Retrieved edge source (v1) should be 0", VERTEX_ZERO, retrieved.v1());
        assertEquals("Retrieved edge destination (v2) should be 0", VERTEX_ZERO, retrieved.v2());
        assertEquals("Retrieved edge weight should match the inserted negative weight", negativeWeight, retrieved.peso());
        assertEquals("Graph size should remain equal to the configured size", SIZE_MEDIUM, grafo.numVertices());
        assertTrue("existeAresta should report true for the inserted self-loop", grafo.existeAresta(VERTEX_ZERO, VERTEX_ZERO));
    }

    /**
     * REQ-GRAPH-003
     *
     * Given a small graph with no edges, when primeiroListaAdj is called on a vertex
     * that has no adjacency, it should return null and the graph size should remain intact.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_SMALL);

        // When - query first adjacency for a vertex with no edges
        Grafo.Aresta firstAdj = grafo.primeiroListaAdj(VERTEX_ONE);

        // Then - expect no adjacency and unchanged size
        assertNull("primeiroListaAdj should return null when the vertex has no adjacent edges", firstAdj);
        assertEquals("Graph size should remain unchanged after querying adjacency", SIZE_SMALL, grafo.numVertices());
    }

    /**
     * REQ-GRAPH-004
     *
     * Given a small graph, when a self-loop is inserted, then existeAresta should return true.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_SMALL);
        final int weight = -6647;

        // When - insert the self-loop (primary behavior under test)
        grafo.insereAresta(VERTEX_ZERO, VERTEX_ZERO, weight);

        // Then - check existence and properties
        assertEquals("Graph size should match configured size after insertion", SIZE_SMALL, grafo.numVertices());
        assertTrue("existeAresta should return true for the inserted self-loop", grafo.existeAresta(VERTEX_ZERO, VERTEX_ZERO));

        Grafo.Aresta a = grafo.proxAdj(VERTEX_ZERO);
        assertNotNull("proxAdj should return the inserted self-loop", a);
        assertEquals("Inserted edge weight should match", weight, a.peso());
        assertEquals("Inserted edge source should be vertex 0", VERTEX_ZERO, a.v1());
        assertEquals("Inserted edge destination should be vertex 0", VERTEX_ZERO, a.v2());
    }

    /**
     * REQ-GRAPH-005
     *
     * Given a small graph with no edges between given vertices,
     * existeAresta should correctly report false.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_SMALL);

        // When - query for a non-existing edge
        boolean exists = grafo.existeAresta(VERTEX_ONE, VERTEX_ZERO);

        // Then - verify non-existence and graph size
        assertFalse("existeAresta should return false for an edge that was never inserted", exists);
        assertEquals("Graph size must remain equal to the configured size", SIZE_SMALL, grafo.numVertices());
    }

    /**
     * REQ-GRAPH-006
     *
     * Given a small graph, when an edge is inserted and then removed using the same endpoints,
     * the removed edge object should reflect the originally inserted values.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_SMALL);
        final int weight = -6647;

        // When - insert then remove the same edge (primary behavior: retiraAresta)
        grafo.insereAresta(VERTEX_ZERO, VERTEX_ZERO, weight);
        Grafo.Aresta removed = grafo.retiraAresta(VERTEX_ZERO, VERTEX_ZERO);

        // Then - removed edge must be non-null and match inserted values
        assertNotNull("retiraAresta should return the removed edge object when the edge existed", removed);
        assertEquals("Removed edge source should be the same as inserted", VERTEX_ZERO, removed.v1());
        assertEquals("Removed edge destination should be the same as inserted", VERTEX_ZERO, removed.v2());
        assertEquals("Removed edge weight should match the inserted weight", weight, removed.peso());
        assertEquals("Graph size should remain unchanged by edge removal", SIZE_SMALL, grafo.numVertices());
        assertFalse("After removal, existeAresta should report false for that edge", grafo.existeAresta(VERTEX_ZERO, VERTEX_ZERO));
    }

    /**
     * REQ-GRAPH-007
     *
     * Given a small graph with an edge inserted between (0,0),
     * attempting to remove a non-existing edge (0,1) should return null and
     * leave the existing edge intact.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        final Grafo grafo = new Grafo(SIZE_SMALL);
        final int weight = -6647;
        grafo.insereAresta(VERTEX_ZERO, VERTEX_ZERO, weight);

        // When - attempt to remove a different (non-existent) edge
        Grafo.Aresta removed = grafo.retiraAresta(VERTEX_ZERO, VERTEX_ONE);

        // Then - removal should return null and original edge should still exist
        assertNull("retiraAresta should return null when attempting to remove a non-existent edge", removed);
        assertTrue("Original inserted edge should still exist after failed removal attempt", grafo.existeAresta(VERTEX_ZERO, VERTEX_ZERO));
        assertEquals("Graph size should remain unchanged after failed removal", SIZE_SMALL, grafo.numVertices());
    }

    /**
     * REQ-GRAPH-008
     *
     * Given a graph constructed with a specific size, numVertices should return that size.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given & When
        final Grafo grafo = new Grafo(SIZE_OTHER);

        // Then
        assertEquals("numVertices should return the configured number of vertices", SIZE_OTHER, grafo.numVertices());
        // Also assert that no edges exist initially for a small spot-check
        assertFalse("No self-loop should exist initially for vertex 0", grafo.existeAresta(VERTEX_ZERO, VERTEX_ZERO));
    }

    /**
     * REQ-GRAPH-009
     *
     * Given a graph with a self-loop, grafoTransposto should produce a distinct graph
     * object with the same number of vertices and retaining the transposed edges.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        final Grafo original = new Grafo(SIZE_SMALL);
        final int weight = -6647;
        original.insereAresta(VERTEX_ZERO, VERTEX_ZERO, weight);

        // When - produce the transpose
        final Grafo transposed = original.grafoTransposto();

        // Then - basic invariants and semantics
        assertNotNull("grafoTransposto must not return null", transposed);
        assertEquals("Transposed graph should have the same vertex count as the original", original.numVertices(), transposed.numVertices());
        assertNotSame("grafoTransposto should return a distinct graph instance", original, transposed);

        // For a self-loop, the transposed edge should also exist at the same endpoints
        assertTrue("Transposed graph should contain the transposed version of the inserted self-loop", transposed.existeAresta(VERTEX_ZERO, VERTEX_ZERO));
        Grafo.Aresta a = transposed.proxAdj(VERTEX_ZERO);
        assertNotNull("proxAdj on transposed graph should return the self-loop edge", a);
        assertEquals("Transposed edge should preserve weight", weight, a.peso());
    }
}