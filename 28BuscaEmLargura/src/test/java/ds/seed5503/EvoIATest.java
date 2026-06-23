/*
 * Improved version of EvoSuite-generated test class
 * Original: Evo (Grafo_ESTest)
 */

package ds.seed5503;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private static final int VERTICES_2450 = 2450;
    private static final int VERTICES_1957 = 1957;
    private static final int VERTICES_78 = 78;
    private static final int EDGE_298 = 298;
    private static final int NEGATIVE_WEIGHT = -1582;

    /**
     * Tests imprime executes after inserting an edge and numVertices returns correct count.
     * Requirement: REQ-GRAPH-01
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_2450);
        grafo0.insereAresta(EDGE_298, EDGE_298, EDGE_298);
        // When
        grafo0.imprime();
        // Then
        assertEquals("Graph should have 2450 vertices after construction", VERTICES_2450, grafo0.numVertices());
        assertTrue("Edge should exist after insertion", grafo0.existeAresta(EDGE_298, EDGE_298));
    }

    /**
     * Tests retiraAresta returns correct edge properties after insertion.
     * Requirement: REQ-GRAPH-02
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_1957);
        grafo0.insereAresta(0, VERTICES_1957, VERTICES_1957);
        // When
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, VERTICES_1957);
        // Then
        assertNotNull("Aresta should not be null", grafo_Aresta0);
        assertEquals("Edge v1 should be 0", 0, grafo_Aresta0.v1());
        assertEquals("Edge v2 should be 1957", VERTICES_1957, grafo_Aresta0.v2());
        assertEquals("Edge weight should be 1957", VERTICES_1957, grafo_Aresta0.peso());
        assertEquals("Graph should have 1957 vertices", VERTICES_1957, grafo0.numVertices());
    }

    /**
     * Tests proxAdj returns correct adjacent edge after insertion.
     * Requirement: REQ-GRAPH-03
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_2450);
        grafo0.insereAresta(0, 0, VERTICES_2450);
        // When
        Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
        // Then
        assertNotNull("Aresta should not be null", grafo_Aresta0);
        assertEquals("Edge v1 should be 0", 0, grafo_Aresta0.v1());
        assertEquals("Edge v2 should be 0", 0, grafo_Aresta0.v2());
        assertEquals("Edge weight should be 2450", VERTICES_2450, grafo_Aresta0.peso());
        assertEquals("Graph should have 2450 vertices", VERTICES_2450, grafo0.numVertices());
    }

    /**
     * Tests primeiroListaAdj executes without error and vertex count is preserved.
     * Requirement: REQ-GRAPH-04
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_78);
        // When
        grafo0.primeiroListaAdj(0);
        // Then
        assertEquals("Graph should have 78 vertices after primeiroListaAdj", VERTICES_78, grafo0.numVertices());
        assertNull("proxAdj should return null for empty adjacency list", grafo0.proxAdj(0));
    }

    /**
     * Tests existeAresta returns false when no edge has been inserted.
     * Requirement: REQ-GRAPH-05
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test4() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_2450);
        // When
        boolean boolean0 = grafo0.existeAresta(0, 0);
        // Then
        assertFalse("Edge should not exist in empty graph", boolean0);
        assertEquals("Graph should have 2450 vertices", VERTICES_2450, grafo0.numVertices());
    }

    /**
     * Tests existeAresta returns true after inserting an edge with negative weight.
     * Requirement: REQ-GRAPH-05
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test5() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_2450);
        grafo0.insereAresta(0, 0, NEGATIVE_WEIGHT);
        // When
        boolean boolean0 = grafo0.existeAresta(0, 0);
        // Then
        assertTrue("Edge should exist after insertion", boolean0);
        assertEquals("Graph should have 2450 vertices", VERTICES_2450, grafo0.numVertices());
        Grafo.Aresta aresta = grafo0.proxAdj(0);
        assertNotNull("Adjacent edge should not be null", aresta);
        assertEquals("Edge weight should be -1582", NEGATIVE_WEIGHT, aresta.peso());
    }

    /**
     * Tests retiraAresta returns null when the specified edge does not exist.
     * Requirement: REQ-GRAPH-02
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test6() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_1957);
        grafo0.insereAresta(0, 0, 0);
        // When
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, VERTICES_1957);
        // Then
        assertNull("retiraAresta should return null for non-existent edge", grafo_Aresta0);
        assertEquals("Graph should have 1957 vertices", VERTICES_1957, grafo0.numVertices());
        assertTrue("Original edge should still exist", grafo0.existeAresta(0, 0));
    }

    /**
     * Tests numVertices returns the correct count after construction.
     * Requirement: REQ-GRAPH-01
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test7() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_2450);
        // When
        int int0 = grafo0.numVertices();
        // Then
        assertEquals("numVertices should return the value passed to constructor", VERTICES_2450, int0);
        assertFalse("No edge should exist in new graph", grafo0.existeAresta(0, 0));
    }

    /**
     * Tests grafoTransposto returns a new distinct graph with the same vertex count.
     * Requirement: REQ-GRAPH-06
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test8() throws Throwable {
        // Given
        Grafo grafo0 = new Grafo(VERTICES_2450);
        grafo0.insereAresta(0, 0, NEGATIVE_WEIGHT);
        // When
        Grafo grafo1 = grafo0.grafoTransposto();
        // Then
        assertNotSame("Transposed graph should be a different object", grafo1, grafo0);
        assertEquals("Transposed graph should have 2450 vertices", VERTICES_2450, grafo1.numVertices());
        assertEquals("Original graph should still have 2450 vertices", VERTICES_2450, grafo0.numVertices());
        assertTrue("Transposed graph should contain the transposed edge", grafo1.existeAresta(0, 0));
    }
}