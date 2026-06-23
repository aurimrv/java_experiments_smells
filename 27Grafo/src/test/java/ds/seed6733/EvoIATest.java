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

    private Grafo createGraphWithEdge(int vertices, int v1, int v2, int peso) {
        Grafo grafo = new Grafo(vertices);
        grafo.insereAresta(v1, v2, peso);
        return grafo;
    }

    private Grafo createGraph(int vertices) {
        return new Grafo(vertices);
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Grafo grafo0 = createGraphWithEdge(1003, 937, 0, 937);
        grafo0.imprime();
        assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
        assertTrue("Edge should exist between 937 and 0", grafo0.existeAresta(937, 0));
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Grafo grafo0 = createGraphWithEdge(1003, 983, 1, 983);
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(983, 1);
        assertEquals("v2 should be 1", 1, grafo_Aresta0.v2());
        assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
        assertEquals("v1 should be 983", 983, grafo_Aresta0.v1());
        assertNotNull("Returned edge should not be null", grafo_Aresta0);
        assertEquals("Peso should be 983", 983, grafo_Aresta0.peso());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Grafo grafo0 = createGraphWithEdge(1003, 937, 0, 937);
        Grafo grafo1 = grafo0.grafoTransposto();
        Grafo.Aresta grafo_Aresta0 = grafo1.retiraAresta(0, 2325);
        assertNull("Expected no edge to be returned", grafo_Aresta0);
        assertEquals("Number of vertices should be 1003", 1003, grafo1.numVertices());
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Grafo grafo0 = createGraphWithEdge(1003, 968, 0, 968);
        Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta(0, 1003, 968);
        try { 
            grafo1.grafoTransposto();
            fail("Expected ArrayIndexOutOfBoundsException when calling grafoTransposto with invalid edge");
        } catch(ArrayIndexOutOfBoundsException e) {
            assertEquals("1003", e.getMessage());
            verifyException("ds.Grafo", e);
        }
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        Grafo grafo0 = createGraph(1003);
        grafo0.primeiroListaAdj(0);
        assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        Grafo grafo0 = createGraphWithEdge(1003, 937, 0, 937);
        Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean0 = grafo1.existeAresta(0, 937);
        assertEquals("Number of vertices should be 1003", 1003, grafo1.numVertices());
        assertEquals("Number of vertices should be 1003", 1003, grafo0.numVertices());
        assertTrue("Edge should exist between 0 and 937", boolean0);
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        Grafo grafo0 = createGraph(1597);
        int int0 = grafo0.numVertices();
        assertEquals("Number of vertices should be 1597", 1597, int0);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        Grafo grafo0 = createGraphWithEdge(1003, 968, 0, 968);
        Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean0 = grafo1.existeAresta(0, 1003);
        assertFalse("Edge should not exist between 0 and 1003", boolean0);
        assertEquals("Number of vertices should be 1003", 1003, grafo1.numVertices());
    }
}