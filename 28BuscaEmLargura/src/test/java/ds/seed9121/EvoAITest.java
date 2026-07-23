package ds.seed9121;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Lightweight, improved unit tests for Grafo.
 *
 * Requirement traceability:
 * - REQ-GRAPH-001: Graph construction and vertex count.
 * - REQ-GRAPH-002: Insert and detect edges.
 * - REQ-GRAPH-003: Remove edges and adjacency access.
 * - REQ-GRAPH-004: Transpose graph semantics.
 *
 * Tests follow a Given-When-Then structure in comments and include
 * explanatory assertion messages to aid diagnosis.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Common helper to create a graph and assert basic invariants.
    private Grafo createGraph(int vertices) {
        Grafo g = new Grafo(vertices);
        assertNotNull("Graph instance should not be null after construction", g);
        assertEquals("Graph should report the configured number of vertices", vertices, g.numVertices());
        return g;
    }

    /**
     * Given a fresh graph
     * When an edge is inserted between two valid vertices
     * Then the edge should exist and query methods should reflect the change.
     *
     * Requirement: REQ-GRAPH-002, REQ-GRAPH-001
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final int N = 291;
        final int v1 = 0;
        final int v2 = 1;
        final int peso = 105;
        Grafo grafo0 = createGraph(N);

        // Precondition: edge should not exist yet
        assertFalse("Precondition: no edge should exist from v1 to v2", grafo0.existeAresta(v1, v2));

        // When
        grafo0.insereAresta(v1, v2, peso);

        // Exercise print method to ensure no exceptions and coverage
        grafo0.imprime();

        // Then: edge exists and graph size unchanged
        assertTrue("After insertion, existeAresta should return true for the inserted edge", grafo0.existeAresta(v1, v2));
        assertEquals("numVertices should remain unchanged after edge insertion", N, grafo0.numVertices());

        // And: removing the inserted edge should yield an Aresta with expected properties
        Grafo.Aresta removed = grafo0.retiraAresta(v1, v2);
        assertNotNull("Removing an existing edge should return the edge object", removed);
        assertEquals("Removed edge should report correct origin v1", v1, removed.v1());
        assertEquals("Removed edge should report correct destination v2", v2, removed.v2());
        assertEquals("Removed edge should report correct weight/peso", peso, removed.peso());
    }

    /**
     * Given a graph with one known edge
     * When removing a non-existent edge
     * Then retiraAresta should return null and vertex count remains stable.
     *
     * Requirement: REQ-GRAPH-003
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        final int N = 10;
        final int existingFrom = 0;
        final int existingTo = 5;
        final int existingPeso = 3;
        Grafo grafo0 = createGraph(N);

        // When: insert one edge
        grafo0.insereAresta(existingFrom, existingTo, existingPeso);

        // Then: removing a different, non-inserted edge should return null
        Grafo.Aresta missing = grafo0.retiraAresta(0, 0);
        assertNull("retiraAresta should return null for an edge that does not exist", missing);

        // And: ensure the previously inserted edge still exists
        assertTrue("Previously inserted edge should still exist", grafo0.existeAresta(existingFrom, existingTo));
        assertEquals("Vertex count should remain unchanged", N, grafo0.numVertices());
    }

    /**
     * Given a graph
     * When inserting an adjacency and retrieving it via primeiroListaAdj/proxAdj
     * Then the adjacency object should reflect the inserted values.
     *
     * Requirement: REQ-GRAPH-003
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        final int N = 20;
        final int v1 = 2;
        final int v2 = 3;
        final int peso = 7;
        Grafo grafo0 = createGraph(N);

        // Precondition: no adjacency for v1 initially
        assertNull("No adjacency should exist initially for v1", grafo0.primeiroListaAdj(v1));

        // When
        grafo0.insereAresta(v1, v2, peso);

        // Then: accessing adjacency list returns an edge with expected properties
        Grafo.Aresta first = grafo0.primeiroListaAdj(v1);
        assertNotNull("primeiroListaAdj should return the inserted adjacency", first);
        assertEquals("Adjacency origin should match v1", v1, first.v1());
        assertEquals("Adjacency destination should match v2", v2, first.v2());
        assertEquals("Adjacency weight should match inserted peso", peso, first.peso());

        // proxAdj may return the same or next adjacency depending on iteration semantics;
        // validate that proxAdj does not violate basic invariants when called.
        Grafo.Aresta next = grafo0.proxAdj(v1);
        if (next != null) {
            assertEquals("proxAdj should provide an adjacency with origin v1", v1, next.v1());
        }

        assertEquals("numVertices should remain unchanged", N, grafo0.numVertices());
    }

    /**
     * Given a vertex with no adjacencies and one with adjacencies
     * When primeiroListaAdj is called
     * Then null is returned for empty adjacency list and a non-null Aresta for populated one.
     *
     * Requirement: REQ-GRAPH-003, boundary check for last vertex index
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        final int N = 5;
        Grafo grafo0 = createGraph(N);

        // Boundary: request adjacency for last valid index (N-1) when empty
        int last = N - 1;
        // When/Then: no adjacency exists yet
        Grafo.Aresta before = grafo0.primeiroListaAdj(last);
        assertNull("primeiroListaAdj should return null for a vertex with no adjacencies (boundary index)", before);

        // When: insert an edge from the last vertex to vertex 0 (valid boundary insertion)
        grafo0.insereAresta(last, 0, 1);

        // Then: primeiroListaAdj should now return a non-null adjacency for the last vertex
        Grafo.Aresta after = grafo0.primeiroListaAdj(last);
        assertNotNull("After insertion, primeiroListaAdj should return the new adjacency", after);
        assertEquals("Inserted adjacency must have origin equal to the queried vertex", last, after.v1());
        assertEquals("numVertices should remain unchanged", N, grafo0.numVertices());
    }

    /**
     * Given an empty graph
     * When inserting an edge
     * Then existeAresta should reflect the change.
     *
     * Requirement: REQ-GRAPH-002
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        final int N = 50;
        final int v1 = 10;
        final int v2 = 20;
        final int peso = 13;
        Grafo grafo0 = createGraph(N);

        // Precondition
        assertFalse("Edge should not exist before insertion", grafo0.existeAresta(v1, v2));

        // When
        grafo0.insereAresta(v1, v2, peso);

        // Then
        assertTrue("existeAresta should return true after insertion", grafo0.existeAresta(v1, v2));
        assertEquals("Vertex count should remain stable after insertion", N, grafo0.numVertices());
    }

    /**
     * Given a graph with an inserted edge
     * When removing that edge
     * Then the returned Aresta should have the same properties as inserted.
     *
     * Requirement: REQ-GRAPH-003
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        final int N = 100;
        final int v1 = 7;
        final int v2 = 8;
        final int peso = 42;
        Grafo grafo0 = createGraph(N);

        // When: insert and then remove the edge
        grafo0.insereAresta(v1, v2, peso);
        Grafo.Aresta removed = grafo0.retiraAresta(v1, v2);

        // Then: removed adjacency matches inserted values and graph size unchanged
        assertNotNull("retiraAresta should return an object when removing an existing edge", removed);
        assertEquals("Removed edge should report correct origin", v1, removed.v1());
        assertEquals("Removed edge should report correct destination", v2, removed.v2());
        assertEquals("Removed edge should report correct weight", peso, removed.peso());
        assertEquals("Vertex count should remain unchanged after removal", N, grafo0.numVertices());

        // And: subsequent retiraAresta should return null (edge no longer exists)
        Grafo.Aresta again = grafo0.retiraAresta(v1, v2);
        assertNull("After removal, the same edge should no longer be retrievable", again);
    }

    /**
     * Given a graph with a known edge
     * When querying for a different non-inserted edge
     * Then existeAresta should be false and inserted edge remains present.
     *
     * Requirement: REQ-GRAPH-002
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        final int N = 5;
        Grafo grafo0 = createGraph(N);
        final int insertedFrom = 0;
        final int insertedTo = 4;
        final int insertedPeso = 9;

        // When
        grafo0.insereAresta(insertedFrom, insertedTo, insertedPeso);

        // Then: querying a different pair should be false
        assertFalse("existeAresta should be false for a non-inserted self-edge (0->0)", grafo0.existeAresta(0, 0));
        // And: the actual inserted edge must exist
        assertTrue("Inserted edge should exist", grafo0.existeAresta(insertedFrom, insertedTo));
        assertEquals("Vertex count must remain unchanged", N, grafo0.numVertices());
    }

    /**
     * Given a graph constructor
     * When requesting numVertices
     * Then it should equal the constructor argument (also test a small typical value).
     *
     * Requirement: REQ-GRAPH-001
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        final int N = 473;
        Grafo grafo0 = createGraph(N);

        // When
        int reported = grafo0.numVertices();

        // Then
        assertEquals("numVertices should match the constructor argument", N, reported);

        // Additional small-boundary check: ensure a graph with 1 vertex reports correctly
        Grafo single = createGraph(1);
        assertEquals("Single-vertex graph should report 1", 1, single.numVertices());
    }

    /**
     * Given a graph with a self-loop
     * When taking the transpose
     * Then the transpose should be a distinct object with same number of vertices
     * and the self-loop should be preserved.
     *
     * Requirement: REQ-GRAPH-004
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        final int N = 473;
        final int v = 1;
        Grafo grafo0 = createGraph(N);

        // When: insert a self-loop
        grafo0.insereAresta(v, v, 0);

        // And: compute transpose
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then: transpose is a different instance but has same vertex count
        assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
        assertEquals("Transposed graph should preserve vertex count", grafo0.numVertices(), grafo1.numVertices());
        assertEquals("Original graph should still report the self-loop", true, grafo0.existeAresta(v, v));
        assertEquals("Transposed graph should also report the self-loop", true, grafo1.existeAresta(v, v));
    }
}