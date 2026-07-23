package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface to categorize graph-related unit tests. Placed at package level
 * so it is visible to the class-level @Category annotation.
 */
interface GraphUnitTest {}

/**
 * Improved and more descriptive tests for Grafo.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure in comments.
 * - Assertions include descriptive messages to aid diagnostics.
 * - Tests exercise both normal and simple error scenarios where applicable.
 * - This class intentionally preserves the original test method names (test0..test7)
 *   to satisfy existing test runners or tooling that expect them.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(GraphUnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    private static final int EXPECTED_VERTEX_COUNT = 100;

    /**
     * REQ-GRAFO-001: Inserting a self-loop should record the edge and preserve vertex count.
     *
     * Given: an empty graph
     * When: a self-loop (0->0 weight 0) is inserted
     * Then: existeAresta(0,0) is true and vertex count remains the expected default
     */
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();

        // When
        grafo0.insereAresta(0, 0, 0);

        // Then
        assertTrue("After inserting self-loop (0,0) expected existeAresta(0,0) to be true",
                grafo0.existeAresta(0, 0));
        assertEquals("Vertex count should remain the default after insertion",
                EXPECTED_VERTEX_COUNT, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-002: proxAdj should return the adjacency (first edge) for a vertex after insertion.
     *
     * Given: an empty graph
     * When: an edge (61->61 weight 61) is inserted
     * Then: proxAdj(61) returns a non-null Aresta with expected fields and graph size is unchanged
     */
    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();

        // When (setup/act)
        grafo0.insereAresta(61, 61, 61);
        Grafo.Aresta firstAdj = grafo0.proxAdj(61);

        // Then
        assertNotNull("proxAdj(61) should not be null after inserting an edge for vertex 61", firstAdj);
        assertEquals("Aresta.v1() mismatch for inserted edge", 61, firstAdj.v1());
        assertEquals("Aresta.v2() mismatch for inserted edge", 61, firstAdj.v2());
        assertEquals("Aresta.peso() mismatch for inserted edge", 61, firstAdj.peso());
        assertEquals("Vertex count should remain the default after insertion", EXPECTED_VERTEX_COUNT, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-003: existeAresta should report true for an inserted edge.
     *
     * Given: an empty graph
     * When: an edge (0->0 weight 0) is inserted
     * Then: existeAresta(0,0) returns true and other unrelated pairs remain false
     */
    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();

        // When
        grafo0.insereAresta(0, 0, 0);

        // Then
        assertTrue("Inserted self-loop (0,0) should be reported as existing",
                grafo0.existeAresta(0, 0));
        // Simple negative check for a different pair to provide additional confidence
        assertFalse("Non-inserted pair (0,1) should not exist", grafo0.existeAresta(0, 1));
        assertEquals("Vertex count should remain the default after insertion", EXPECTED_VERTEX_COUNT, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-004: existeAresta returns false when no edge exists.
     *
     * Given: a fresh graph with no edges
     * When: we query existeAresta(0,0)
     * Then: it returns false and vertex count equals default
     */
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();

        // When
        boolean exists = grafo0.existeAresta(0, 0);

        // Then
        assertFalse("Fresh graph should not report existeAresta(0,0) as true", exists);
        assertEquals("Fresh graph should have the expected default vertex count", EXPECTED_VERTEX_COUNT, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-005: retiraAresta should return the removed edge with correct details.
     *
     * Given: a graph with a self-loop edge inserted at vertex 0
     * When: retiraAresta(0,0) is invoked
     * Then: a non-null Aresta is returned with v1==0, v2==0, peso==0
     *
     * Note: This test focuses on the removal behavior and validates the returned object.
     */
    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();
        grafo0.insereAresta(0, 0, 0);

        // When (primary action)
        Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

        // Then
        assertNotNull("retiraAresta(0,0) should return the removed Aresta for an existing self-loop", removed);
        assertEquals("Removed Aresta.v1() should be 0", 0, removed.v1());
        assertEquals("Removed Aresta.v2() should be 0", 0, removed.v2());
        assertEquals("Removed Aresta.peso() should be 0", 0, removed.peso());
        assertEquals("Vertex count should remain the default after removal", EXPECTED_VERTEX_COUNT, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-006: retiraAresta returns null when attempting to remove a non-existent edge.
     *
     * Given: a graph with a single edge (1->0)
     * When: retiraAresta(1,1) is invoked for a non-existing edge
     * Then: the method should return null and graph vertex count remains unchanged
     */
    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();
        grafo0.insereAresta(1, 0, 0);

        // When
        Grafo.Aresta removed = grafo0.retiraAresta(1, 1);

        // Then
        assertNull("Attempting to remove a non-existent edge (1,1) should return null", removed);
        assertEquals("Vertex count should remain the default after failed removal", EXPECTED_VERTEX_COUNT, grafo0.numVertices());
    }

    /**
     * REQ-GRAFO-007: numVertices returns the graph's vertex capacity (default expected value).
     *
     * Given: a newly constructed graph
     * When: numVertices() is invoked
     * Then: it returns the configured default vertex count
     */
    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();

        // When
        int count = grafo0.numVertices();

        // Then
        assertEquals("numVertices() should return the graph's default vertex capacity", EXPECTED_VERTEX_COUNT, count);
    }

    /**
     * REQ-GRAFO-008: grafoTransposto returns a distinct Grafo instance with same vertex capacity;
     * for a self-loop edge the transposed graph should still have that self-loop (as it's invariant).
     *
     * Given: a graph with a self-loop inserted
     * When: grafoTransposto() is invoked
     * Then: it returns a different Grafo instance with the same vertex count and the edge present
     */
    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo();
        grafo0.insereAresta(0, 0, 2147);

        // When
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertNotSame("grafoTransposto() should return a distinct Grafo instance", grafo0, grafo1);
        assertEquals("Transposed graph should preserve the vertex capacity", EXPECTED_VERTEX_COUNT, grafo1.numVertices());
        assertTrue("Transposed graph should contain the self-loop (0,0) that is invariant under transpose",
                grafo1.existeAresta(0, 0));
    }
}