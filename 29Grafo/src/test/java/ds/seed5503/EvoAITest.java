package ds.seed5503;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of unit tests.
 */
interface UnitTest {}

/**
 * Improved and documented tests for ds.Grafo.
 *
 * Notes:
 * - Each test is focused on a small, clearly described behavior.
 * - Given-When-Then comments and assertion messages are provided for traceability.
 * - Magic numbers are replaced by named constants where appropriate.
 *
 * The original EvoSuite-generated runner and parameters were removed to avoid
 * coupling tests to the EvoSuite runtime. This class keeps the original test
 * method names (test0 .. test8) as required.
 */
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    // Reusable constants to avoid magic numbers in assertions
    private static final int DEFAULT_SIZE_A = 2450;
    private static final int DEFAULT_SIZE_B = 1957;
    private static final int SMALL_SIZE = 78;
    private static final int SAMPLE_VERTEX = 298;
    private static final int SELF_VERTEX = 0;
    private static final int NEGATIVE_WEIGHT = -1582;
    private static final int ZERO_WEIGHT = 0;

    /**
     * REQ-001: Verify inserting a self-edge and basic adjacency behavior.
     *
     * Given a graph with many vertices,
     * When a self-edge is inserted and the graph is printed,
     * Then the graph size is unchanged and the inserted edge is discoverable.
     */
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_A);

        // When: insert a self-edge at SAMPLE_VERTEX and request a human-readable print (side-effect)
        grafo0.insereAresta(SAMPLE_VERTEX, SAMPLE_VERTEX, SAMPLE_VERTEX);
        grafo0.imprime(); // side-effect: ensure this does not throw

        // Then: verify invariants and edge details
        assertEquals("Graph should preserve number of vertices after insertion",
                     DEFAULT_SIZE_A, grafo0.numVertices());

        assertTrue("Inserted self-edge should be reported as existing",
                   grafo0.existeAresta(SAMPLE_VERTEX, SAMPLE_VERTEX));

        Grafo.Aresta a = grafo0.proxAdj(SAMPLE_VERTEX);
        assertNotNull("proxAdj should return the self-edge that was just inserted", a);
        assertEquals("Self-edge source vertex mismatch", SAMPLE_VERTEX, a.v1());
        assertEquals("Self-edge target vertex mismatch", SAMPLE_VERTEX, a.v2());
        assertEquals("Self-edge weight mismatch", SAMPLE_VERTEX, a.peso());
    }

    /**
     * REQ-002: Verify insertion followed by removal returns the inserted edge and
     * that the graph state is updated accordingly.
     *
     * Given an empty graph,
     * When an edge is inserted and then removed,
     * Then the removed edge must match the inserted one and the edge must no longer exist.
     */
    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_B);

        // When: insert an edge from 0 to last index (boundary-like index)
        int target = DEFAULT_SIZE_B - 1; // use last valid index for better coverage
        grafo0.insereAresta(SELF_VERTEX, target, target);

        // Act: remove the edge
        Grafo.Aresta removed = grafo0.retiraAresta(SELF_VERTEX, target);

        // Then: removed edge must not be null and should match inserted properties
        assertNotNull("retiraAresta should return the removed edge when it exists", removed);
        assertEquals("Removed edge source mismatch", SELF_VERTEX, removed.v1());
        assertEquals("Removed edge target mismatch", target, removed.v2());
        assertEquals("Removed edge weight mismatch", target, removed.peso());

        // And: after removal the edge should no longer exist and vertex count unchanged
        assertFalse("Edge should no longer exist after removal",
                    grafo0.existeAresta(SELF_VERTEX, target));
        assertEquals("Number of vertices should remain unchanged after insert+remove",
                     DEFAULT_SIZE_B, grafo0.numVertices());
    }

    /**
     * REQ-003: Verify proxAdj returns the recently inserted adjacency and preserves weight.
     *
     * Given a fresh graph,
     * When a self-edge is inserted at vertex 0 with weight equal to graph size,
     * Then proxAdj(0) should yield an edge with correct v1, v2 and peso.
     */
    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_A);

        // When
        grafo0.insereAresta(SELF_VERTEX, SELF_VERTEX, DEFAULT_SIZE_A);

        // Then
        Grafo.Aresta a = grafo0.proxAdj(SELF_VERTEX);
        assertNotNull("proxAdj should return the inserted self-edge", a);
        assertEquals("Inserted edge v1 should be 0", SELF_VERTEX, a.v1());
        assertEquals("Inserted edge v2 should be 0", SELF_VERTEX, a.v2());
        assertEquals("Inserted edge weight should match the provided value",
                     DEFAULT_SIZE_A, a.peso());

        // Also verify the graph reports the edge exists
        assertTrue("Graph should report the newly inserted self-edge as existing",
                   grafo0.existeAresta(SELF_VERTEX, SELF_VERTEX));
        assertEquals("Graph size should remain as constructed", DEFAULT_SIZE_A, grafo0.numVertices());
    }

    /**
     * REQ-004: Verify that a newly-created graph has no adjacencies and reports correct size.
     *
     * Given a small graph with no edges,
     * When querying the first adjacency list and then the next adjacency,
     * Then proxAdj should return null and the number of vertices should match the constructor.
     */
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(SMALL_SIZE);

        // When: position iterator to first adjacency (if implemented) and get next adjacency
        grafo0.primeiroListaAdj(SELF_VERTEX);
        Grafo.Aresta a = grafo0.proxAdj(SELF_VERTEX);

        // Then: with no edges inserted, proxAdj should be null and number of vertices unchanged
        assertNull("No adjacency should exist for a fresh graph vertex", a);
        assertEquals("Graph size should match the constructor argument", SMALL_SIZE, grafo0.numVertices());
    }

    /**
     * REQ-005: Verify existeAresta correctly reports absence of an edge in a fresh graph,
     * and also for the last valid index to increase boundary coverage.
     */
    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_A);

        // When & Then: check for a non-existing self-edge at 0 and at last index
        assertFalse("Fresh graph should not report a self-edge at vertex 0",
                    grafo0.existeAresta(SELF_VERTEX, SELF_VERTEX));

        int last = DEFAULT_SIZE_A - 1;
        assertFalse("Fresh graph should not report a self-edge at the last vertex",
                    grafo0.existeAresta(last, last));

        // Verify that the graph size remains as constructed
        assertEquals("Graph size should remain unchanged for existence checks",
                     DEFAULT_SIZE_A, grafo0.numVertices());
    }

    /**
     * REQ-006: Verify inserting an edge with a negative weight is supported and discoverable.
     *
     * Given a graph,
     * When inserting a self-edge with a negative weight,
     * Then existeAresta must return true and proxAdj must expose the negative weight.
     */
    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_A);

        // When
        grafo0.insereAresta(SELF_VERTEX, SELF_VERTEX, NEGATIVE_WEIGHT);

        // Then
        assertTrue("Graph should report the negative-weight self-edge as existing",
                   grafo0.existeAresta(SELF_VERTEX, SELF_VERTEX));

        Grafo.Aresta a = grafo0.proxAdj(SELF_VERTEX);
        assertNotNull("proxAdj should return the edge that was just inserted", a);
        assertEquals("Edge weight should match the negative value inserted",
                     NEGATIVE_WEIGHT, a.peso());
        assertEquals("Graph size should be unchanged after insertion", DEFAULT_SIZE_A, grafo0.numVertices());
    }

    /**
     * REQ-007: Verify behavior when removing a non-existent edge and when removing an existing one.
     *
     * Given a graph with one self-edge inserted,
     * When attempting to remove a different non-existent edge, retiraAresta should return null,
     * and when removing the existing self-edge it should return the edge and update existence.
     */
    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_B);
        grafo0.insereAresta(SELF_VERTEX, SELF_VERTEX, ZERO_WEIGHT);

        // When: try to remove a non-existent edge (source exists but target is last index)
        Grafo.Aresta nonExistentRemoval = grafo0.retiraAresta(SELF_VERTEX, DEFAULT_SIZE_B - 1);

        // Then: removal of a non-existent edge should return null
        assertNull("retiraAresta should return null for a non-existent target", nonExistentRemoval);

        // And: the originally inserted self-edge should still exist
        assertTrue("Original self-edge should still exist after unsuccessful removal attempt",
                   grafo0.existeAresta(SELF_VERTEX, SELF_VERTEX));

        // Now remove the existing self-edge and verify it is returned and removed
        Grafo.Aresta removed = grafo0.retiraAresta(SELF_VERTEX, SELF_VERTEX);
        assertNotNull("retiraAresta should return the removed self-edge", removed);
        assertEquals("Removed self-edge should have weight 0", ZERO_WEIGHT, removed.peso());
        assertFalse("Self-edge should no longer exist after removal",
                    grafo0.existeAresta(SELF_VERTEX, SELF_VERTEX));

        // Graph size must remain invariant
        assertEquals("Number of vertices should remain unchanged after removals",
                     DEFAULT_SIZE_B, grafo0.numVertices());
    }

    /**
     * REQ-008: Verify that numVertices returns the constructor value and is stable.
     *
     * Given a graph created with a known size,
     * When asking for its number of vertices,
     * Then the reported value should equal the constructor argument and be unchanged by queries.
     */
    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        // Given
        final int declaredSize = DEFAULT_SIZE_A;
        Grafo grafo0 = new Grafo(declaredSize);

        // When: retrieve the number of vertices multiple times
        int first = grafo0.numVertices();
        int second = grafo0.numVertices();

        // Then: both calls should return the same value equal to the constructor argument
        assertEquals("numVertices should match the constructor argument on first call",
                     declaredSize, first);
        assertEquals("numVertices should be stable across calls", first, second);
    }

    /**
     * REQ-009: Verify that transposing a graph produces a distinct object and preserves edge weights.
     *
     * Given a graph with a self-edge having a negative weight,
     * When producing the transpose,
     * Then the transpose should be a different object, preserve the vertex count and have the corresponding edge.
     */
    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        // Given
        Grafo grafo0 = new Grafo(DEFAULT_SIZE_A);
        grafo0.insereAresta(SELF_VERTEX, SELF_VERTEX, NEGATIVE_WEIGHT);

        // When
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then: transpose should be a different instance but with identical vertex count
        assertNotSame("grafoTransposto should return a new Grafo instance, not the same reference",
                      grafo0, grafo1);
        assertEquals("Transpose should preserve the number of vertices",
                     grafo0.numVertices(), grafo1.numVertices());
        assertEquals("Transpose should preserve vertex count equals constructor",
                     DEFAULT_SIZE_A, grafo1.numVertices());

        // And: for a self-loop the transpose has the same self-loop with the same weight
        assertTrue("Transpose should contain the self-loop corresponding to original",
                   grafo1.existeAresta(SELF_VERTEX, SELF_VERTEX));

        Grafo.Aresta aOrig = grafo0.proxAdj(SELF_VERTEX);
        Grafo.Aresta aTrans = grafo1.proxAdj(SELF_VERTEX);
        assertNotNull("Original self-edge should be present", aOrig);
        assertNotNull("Transposed self-edge should be present", aTrans);
        assertEquals("Transposed edge should preserve weight", aOrig.peso(), aTrans.peso());
        assertEquals("Transposed edge v1 should be equal to original v1 for a self-loop",
                     aOrig.v1(), aTrans.v1());
        assertEquals("Transposed edge v2 should be equal to original v2 for a self-loop",
                     aOrig.v2(), aTrans.v2());
    }
}