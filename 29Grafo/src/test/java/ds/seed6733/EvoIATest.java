package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private static final int VERTICES_1003 = 1003;
    private static final int VERTICES_1597 = 1597;
    private static final int EDGE_937 = 937;
    private static final int EDGE_983 = 983;
    private static final int EDGE_968 = 968;

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.insereAresta(EDGE_937, 0, EDGE_937);
        grafo0.imprime();
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo0.numVertices());
        assertTrue("Edge should exist", grafo0.existeAresta(EDGE_937, 0));
        assertEquals("Edge weight should be 937", EDGE_937, grafo0.pesoAresta(EDGE_937, 0));
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.insereAresta(EDGE_983, 1, EDGE_983);
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(EDGE_983, 1);
        assertNotNull("Removed edge should not be null", grafo_Aresta0);
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo0.numVertices());
        assertEquals("v1 of edge should be 983", EDGE_983, grafo_Aresta0.v1());
        assertEquals("weight of edge should be 983", EDGE_983, grafo_Aresta0.peso());
        assertEquals("v2 of edge should be 1", 1, grafo_Aresta0.v2());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.insereAresta(EDGE_937, 0, EDGE_937);
        Grafo grafo1 = grafo0.grafoTransposto();
        Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(0, 2325);
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo1.numVertices());
        assertNull("Expected no edge between 0 and 2325", grafo_Aresta0);
        assertFalse("Edge should not exist", grafo1.existeAresta(0, 2325));
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.insereAresta(EDGE_968, 0, EDGE_968);
        Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta(0, VERTICES_1003, EDGE_968);
        try { 
            grafo1.grafoTransposto();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch(ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
            verifyException("ds.Grafo", e);
        }
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.primeiroListaAdj(0);
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo0.numVertices());
        assertNotNull("First adjacency list element should not be null", grafo0.primeiroListaAdj(0));
        assertFalse("Edge should not exist", grafo0.existeAresta(0, 0));
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.insereAresta(EDGE_937, 0, EDGE_937);
        Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean0 = grafo1.existeAresta(0, EDGE_937);
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo0.numVertices());
        assertTrue("Edge should exist in transposed graph", boolean0);
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo1.numVertices());
        assertNotNull("Edge should be removable", grafo1.retiraAresta(0, EDGE_937));
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1597);
        int int0 = grafo0.numVertices();
        assertEquals("Number of vertices should be 1597", VERTICES_1597, int0);
        assertNotNull(grafo0);
        assertTrue(grafo0.numVertices() > 0);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        Grafo grafo0 = new Grafo(VERTICES_1003);
        grafo0.insereAresta(EDGE_968, 0, EDGE_968);
        Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean0 = grafo1.existeAresta(0, VERTICES_1003);
        assertEquals("Number of vertices should be 1003", VERTICES_1003, grafo1.numVertices());
        assertFalse("Edge should not exist", boolean0);
        assertNull(grafo1.retiraAresta(0, VERTICES_1003));
    }
}