package ds.seed7992;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Marker interface to allow categorization of tests.
 */
interface UnitTest {}

/**
 * Improved test class for Grafo.
 *
 * Notes:
 * - Each test includes Given-When-Then comments and descriptive assertion messages.
 * - Tests include basic happy-path checks and additional verifications where safe.
 * - Requirement traceability identifiers (REQ-001 .. REQ-009) are included in method Javadoc.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

    /**
     * REQ-001
     * Given a graph with many vertices,
     * When inserting a self-loop and printing,
     * Then the vertex count remains unchanged and the inserted edge is present with the correct weight.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(6671);

        // When: insert a self-loop and invoke imprime (should not change structure)
        grafo0.insereAresta(0, 0, 6671);
        grafo0.imprime();

        // Then: verify vertex count and that the edge exists with expected weight
        assertEquals("Vertex count should remain as initialized after inserting an edge", 6671, grafo0.numVertices());
        assertTrue("Inserted self-loop (0->0) should exist", grafo0.existeAresta(0, 0));
        Grafo.Aresta removed = grafo0.retiraAresta(0, 0);
        assertNotNull("Removed edge should not be null after insertion", removed);
        assertEquals("Removed edge v1 should be 0", 0, removed.v1());
        assertEquals("Removed edge v2 should be 0", 0, removed.v2());
        assertEquals("Removed edge weight should match inserted weight", 6671, removed.peso());
    }

    /**
     * REQ-002
     * Given an empty adjacency list at vertex 0,
     * When inserting a single edge (0->0) with negative weight,
     * Then proxAdj(0) should return an edge with correct endpoints and weight.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(1371);

        // When
        grafo0.insereAresta(0, 0, (-819));
        Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);

        // Then
        assertNotNull("proxAdj(0) should return the inserted edge", grafo_Aresta0);
        assertEquals("Edge source should be 0", 0, grafo_Aresta0.v1());
        assertEquals("Edge destination should be 0", 0, grafo_Aresta0.v2());
        assertEquals("Edge weight should match the inserted negative weight", (-819), grafo_Aresta0.peso());
        assertTrue("Edge (0->0) should be reported as existing", grafo0.existeAresta(0, 0));
        assertEquals("Graph should preserve initial vertex count", 1371, grafo0.numVertices());
    }

    /**
     * REQ-003
     * Given a graph with N vertices and no edges,
     * When primeiroListaAdj is invoked for a vertex with no adjacencies,
     * Then null should be returned and vertex count remains unchanged.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(313);

        // When
        Grafo.Aresta a = grafo0.primeiroListaAdj(1);

        // Then
        assertNull("primeiroListaAdj(1) should be null when there are no adjacencies", a);
        assertEquals("Vertex count should remain unchanged", 313, grafo0.numVertices());
    }

    /**
     * REQ-004
     * Given a graph,
     * When inserting an edge (0->0) with a negative weight,
     * Then existeAresta(0,0) should report true and proxAdj should expose the inserted edge.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(313);

        // When
        grafo0.insereAresta(0, 0, (-6647));

        // Then
        assertEquals("Graph should preserve initial vertex count", 313, grafo0.numVertices());
        assertTrue("Edge (0->0) should exist after insertion", grafo0.existeAresta(0, 0));
        Grafo.Aresta a = grafo0.proxAdj(0);
        assertNotNull("proxAdj(0) should return the inserted self-loop", a);
        assertEquals("Inserted edge weight should match", (-6647), a.peso());
    }

    /**
     * REQ-005
     * Given an empty graph with N vertices,
     * When checking for a non-inserted edge,
     * Then existeAresta should return false and vertex count remains unchanged.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(313);

        // When
        boolean exists = grafo0.existeAresta(1, 0);

        // Then
        assertFalse("No edge (1->0) should exist in a freshly created graph", exists);
        assertEquals("Vertex count should remain as initialized", 313, grafo0.numVertices());
        // Additional sanity: primeiroListaAdj for the vertex should be null
        Grafo.Aresta first = grafo0.primeiroListaAdj(1);
        assertNull("primeiroListaAdj(1) should be null when no adjacencies exist", first);
    }

    /**
     * REQ-006
     * Given a graph where an edge is inserted,
     * When retiraAresta is called for that edge,
     * Then the returned Aresta should reflect the inserted values.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(313);

        // When
        grafo0.insereAresta(0, 0, (-6647));
        Grafo.Aresta removed = grafo0.retiraAresta(0, 0);

        // Then
        assertNotNull("retiraAresta should return the removed edge when it exists", removed);
        assertEquals("Removed edge source should be 0", 0, removed.v1());
        assertEquals("Removed edge destination should be 0", 0, removed.v2());
        assertEquals("Removed edge weight should match inserted value", (-6647), removed.peso());
        assertEquals("Vertex count should remain unchanged after edge removal", 313, grafo0.numVertices());
    }

    /**
     * REQ-007
     * Given a graph with a single inserted edge,
     * When attempting to remove a different (non-existing) edge,
     * Then retiraAresta should return null and the vertex count remains unchanged.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(313);

        // When
        grafo0.insereAresta(0, 0, (-6647));
        Grafo.Aresta removed = grafo0.retiraAresta(0, 1);

        // Then
        assertNull("retiraAresta for a non-existing edge should return null", removed);
        assertEquals("Vertex count should remain unchanged after attempted removal of non-existing edge", 313, grafo0.numVertices());
        // Verify original edge still exists
        assertTrue("Original edge (0->0) should still exist after failed removal attempt", grafo0.existeAresta(0, 0));
    }

    /**
     * REQ-008
     * Given a graph constructed with a specified positive vertex count,
     * When querying numVertices,
     * Then it should return the supplied count and no adjacencies should exist initially.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(673);

        // When
        int count = grafo0.numVertices();

        // Then
        assertEquals("numVertices should return the initialized vertex count", 673, count);
        // Sanity: no adjacency lists initially
        assertNull("No adjacencies should exist for vertex 0 in a fresh graph", grafo0.primeiroListaAdj(0));
    }

    /**
     * REQ-009
     * Given a graph with a directed edge u->v,
     * When constructing the transposed graph,
     * Then the transposed graph should contain the reversed edge v->u and be a distinct object instance.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(313);
        grafo0.insereAresta(0, 1, (-6647));

        // When
        Grafo grafo1 = grafo0.grafoTransposto();

        // Then
        assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
        assertEquals("Transposed graph should keep the same number of vertices", grafo0.numVertices(), grafo1.numVertices());
        assertTrue("Original graph should contain edge 0->1", grafo0.existeAresta(0, 1));
        assertTrue("Transposed graph should contain edge 1->0", grafo1.existeAresta(1, 0));
        // Verify weights if accessible by removing the edge from transposed graph
        Grafo.Aresta removedFromTransposed = grafo1.retiraAresta(1, 0);
        assertNotNull("Removed edge from transposed graph should not be null", removedFromTransposed);
        assertEquals("Removed transposed edge weight should match original", (-6647), removedFromTransposed.peso());
    }
}