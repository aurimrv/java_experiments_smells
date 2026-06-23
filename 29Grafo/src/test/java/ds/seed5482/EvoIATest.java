package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private Grafo createGrafo(int vertices) {
        return new Grafo(vertices);
    }

    private Grafo createGrafoWithOneVertex() {
        return new Grafo(1);
    }

    private Grafo createGrafoWithVertices(int vertices) {
        return new Grafo(vertices);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Grafo grafo0 = createGrafo(4389);
        try {
            grafo0.grafoTransposto();
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertNotNull("Exception should not be null", e);
            // Additional assertions on exception type or message can be added here
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Grafo grafo0 = createGrafoWithOneVertex();
        grafo0.insereAresta(0, 0, -93);
        grafo0.imprime();
        assertEquals("Number of vertices should be 1", 1, grafo0.numVertices());
    }



    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Grafo grafo0 = createGrafoWithOneVertex();
        grafo0.insereAresta(0, 0, 1);
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4344);
        assertNull(grafo_Aresta0);
        assertEquals(1, grafo0.numVertices());
    }



    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Grafo grafo0 = createGrafo(4592);
        grafo0.primeiroListaAdj(0);
        assertEquals("Number of vertices should be 4592", 4592, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Grafo grafo0 = createGrafoWithOneVertex();
        grafo0.insereAresta(0, 0, 1);
        boolean boolean0 = grafo0.existeAresta(0, 0);
        assertEquals("Number of vertices should be 1", 1, grafo0.numVertices());
        assertTrue("Edge should exist between 0 and 0", boolean0);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Grafo grafo0 = createGrafoWithOneVertex();
        grafo0.insereAresta(0, 0, 1);
        boolean boolean0 = grafo0.existeAresta(0, 1484);
        assertEquals("Number of vertices should be 1", 1, grafo0.numVertices());
        assertFalse("Edge should not exist between 0 and 1484", boolean0);
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Grafo grafo0 = createGrafo(0);
        int int0 = grafo0.numVertices();
        assertEquals("Number of vertices should be 0", 0, int0);
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        Grafo grafo0 = createGrafoWithOneVertex();
        grafo0.insereAresta(0, 0, -93);
        Grafo grafo1 = grafo0.grafoTransposto();
        assertEquals("Number of vertices should be 1", 1, grafo0.numVertices());
        assertEquals("Number of vertices in transposed graph should be 1", 1, grafo1.numVertices());
        // Additional assertions could verify edges in both graphs
    }
}