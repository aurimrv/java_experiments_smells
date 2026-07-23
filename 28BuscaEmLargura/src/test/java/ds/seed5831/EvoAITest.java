package ds.seed5831;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

/**
 * Marker interface used to categorize tests as unit tests.
 * Placed at package level so it can be referenced by @Category.
 */
interface UnitTest {}

/**
 * Improved and stabilized tests for Grafo.
 *
 * Notes:
 * - Each test follows a simple Given-When-Then structure in comments.
 * - Tests include clearer assertions with messages and exercise some boundary-like cases
 *   while avoiding assumptions about implementation details that may vary.
 * - These methods keep the original test method names (test0..test8) per instructions.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    /**
     * Given a graph with many vertices,
     * When inserting an edge using the highest valid vertex index,
     * Then the edge should exist and the vertex count should remain unchanged.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final int n = 1345;
        Grafo grafo0 = new Grafo(n);

        // When: insert an edge to the highest valid vertex index (boundary)
        int v1 = 0;
        int v2 = n - 1; // boundary value
        grafo0.insereAresta(v1, v2, 0);

        // Then
        assertEquals("Number of vertices should remain the same after inserting an edge", n, grafo0.numVertices());
        assertTrue("Inserted edge (0 -> n-1) should exist", grafo0.existeAresta(v1, v2));

        // Also ensure printing does not throw and leaves graph unchanged
        grafo0.imprime();
        assertEquals("Printing graph should not modify vertex count", n, grafo0.numVertices());
    }

    /**
     * Given a graph with many vertices,
     * When inserting and then removing an edge within valid indices,
     * Then the removed edge should be returned and further removals should yield null.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        final int n = 1345;
        Grafo grafo0 = new Grafo(n);

        // When: insert an edge at a valid boundary index and remove it
        int v1 = 0;
        int v2 = n - 1;
        int peso = 0;
        grafo0.insereAresta(v1, v2, peso);

        Grafo.Aresta removed = grafo0.retiraAresta(v1, v2);

        // Then: removal should return the previously inserted edge with correct properties
        assertNotNull("retiraAresta should return the removed edge when it exists", removed);
        assertEquals("Removed edge v1 should match", v1, removed.v1());
        assertEquals("Removed edge v2 should match", v2, removed.v2());
        assertEquals("Removed edge weight should match", peso, removed.peso());
        assertFalse("Edge should no longer exist after removal", grafo0.existeAresta(v1, v2));
        assertEquals("Number of vertices should remain unchanged", n, grafo0.numVertices());
    }

    /**
     * Given a graph with many vertices and no edges,
     * When asking for the first adjacency of a given vertex,
     * Then a result may be null (no adjacency) or an Aresta whose source equals the requested vertex.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        final int n = 1349;
        Grafo grafo0 = new Grafo(n);

        // When: request first adjacency on a vertex that currently has no edges
        Grafo.Aresta firstAdj = grafo0.primeiroListaAdj(0);

        // Then: vertex count unchanged and, if an adjacency exists, it should originate from vertex 0
        assertEquals("Vertex count should be unchanged after primeiroListaAdj", n, grafo0.numVertices());
        if (firstAdj != null) {
            assertEquals("If primeiroListaAdj returns an edge, its v1 must be the requested vertex", 0, firstAdj.v1());
        }

        // Additional check: request from last valid index to exercise boundary index access
        Grafo.Aresta lastAdj = grafo0.primeiroListaAdj(n - 1);
        if (lastAdj != null) {
            assertEquals("If primeiroListaAdj returns an edge for last vertex, its v1 must equal last vertex index", n - 1, lastAdj.v1());
        }
    }

    /**
     * Given a graph with many vertices and no edges,
     * When querying existences of several non-inserted edges including a boundary index,
     * Then all should be reported as absent and the vertex count unchanged.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        final int n = 1345;
        Grafo grafo0 = new Grafo(n);

        // When: check existence for a couple of pairs that were never inserted
        boolean exists1 = grafo0.existeAresta(1, n - 1); // boundary-like query
        boolean exists2 = grafo0.existeAresta(0, 0);     // self-loop not inserted yet

        // Then: both should be false and vertex count unchanged
        assertFalse("Non-inserted edge (1, n-1) should not exist", exists1);
        assertFalse("Non-inserted self-loop (0,0) should not exist", exists2);
        assertEquals("Vertex count should remain unchanged after existence queries", n, grafo0.numVertices());
    }

    /**
     * Given an empty graph,
     * When inserting a self-loop at vertex zero,
     * Then the edge should be reported as existing and other unrelated pairs should remain absent.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        final int n = 1345;
        Grafo grafo0 = new Grafo(n);

        // When: insert a self-loop
        grafo0.insereAresta(0, 0, 0);

        // Then
        assertTrue("Inserted self-loop (0,0) should exist", grafo0.existeAresta(0, 0));
        assertFalse("Unrelated edge (0,1) should not exist", grafo0.existeAresta(0, 1));
        assertEquals("Vertex count should remain unchanged", n, grafo0.numVertices());
    }

    /**
     * Given a graph with one inserted edge,
     * When removing it and attempting removal again,
     * Then the first removal returns the Aresta and the second returns null.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        final int n = 1345;
        Grafo grafo0 = new Grafo(n);
        grafo0.insereAresta(0, 0, 0);

        // When: remove existing edge, then remove again
        Grafo.Aresta firstRemoval = grafo0.retiraAresta(0, 0);
        Grafo.Aresta secondRemoval = grafo0.retiraAresta(0, 0);

        // Then
        assertNotNull("First removal should return the previously inserted edge", firstRemoval);
        assertEquals("First removal's v1 should be 0", 0, firstRemoval.v1());
        assertEquals("First removal's v2 should be 0", 0, firstRemoval.v2());
        assertNull("Second removal should return null as the edge no longer exists", secondRemoval);
        assertEquals("Vertex count should remain unchanged after removals", n, grafo0.numVertices());
    }

    /**
     * Given graphs constructed with different sizes,
     * When querying numVertices,
     * Then the values returned should match the constructor argument.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given / When / Then for first graph
        Grafo grafo0 = new Grafo(628);
        assertEquals("numVertices should return the constructor value for 628", 628, grafo0.numVertices());

        // Also validate a small graph constructor to exercise another reasonable value
        Grafo grafo1 = new Grafo(1);
        assertEquals("numVertices should return the constructor value for 1", 1, grafo1.numVertices());
    }

    /**
     * Given a graph with a self-loop,
     * When creating its transpose,
     * Then the transposed graph should preserve vertex count and reflect the same self-loop,
     * and should be a distinct object instance.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        final int n = 1345;
        Grafo grafo0 = new Grafo(n);
        grafo0.insereAresta(0, 0, 0); // self-loop

        // When: compute transpose
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertEquals("Transposed graph should have same number of vertices", grafo0.numVertices(), grafo1.numVertices());
        assertNotSame("Transposed graph should be a distinct instance", grafo0, grafo1);
        assertTrue("Transpose should preserve the self-loop", grafo1.existeAresta(0, 0));
    }

    /**
     * Given a graph and an inserted edge using the last valid index and a negative weight,
     * When requesting the next adjacency for the source vertex,
     * Then the returned Aresta should reflect the inserted values.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        final int n = 1072;
        Grafo grafo0 = new Grafo(n);

        // Use last valid v2 index and a negative weight to exercise weight handling
        int v1 = 0;
        int v2 = n - 1;
        int peso = -1103;
        grafo0.insereAresta(v1, v2, peso);

        // When
        Grafo.Aresta adj = grafo0.proxAdj(v1);

        // Then
        assertNotNull("proxAdj should return the adjacency that was just inserted", adj);
        assertEquals("proxAdj returned v1 should be the source vertex", v1, adj.v1());
        assertEquals("proxAdj returned v2 should match inserted target", v2, adj.v2());
        assertEquals("proxAdj returned weight should match the inserted negative weight", peso, adj.peso());
        assertEquals("Vertex count should remain unchanged", n, grafo0.numVertices());
    }
}