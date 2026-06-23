package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private Grafo createTestGrafo() {
        return new Grafo();
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.insereAresta(0, 0, 822);
        grafo0.imprime();
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.insereAresta(0, 0, 0);
        Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
        assertEquals("Edge weight should be 0", 0, grafo_Aresta0.peso());
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
        assertNotNull("Edge should not be null", grafo_Aresta0);
        assertEquals("Edge source vertex should be 0", 0, grafo_Aresta0.v1());
        assertEquals("Edge destination vertex should be 0", 0, grafo_Aresta0.v2());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.primeiroListaAdj(0);
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.insereAresta(0, 0, (-745));
        boolean boolean0 = grafo0.existeAresta(0, 0);
        assertTrue("Edge should exist", boolean0);
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        boolean boolean0 = grafo0.existeAresta(99, 99);
        assertFalse("Edge should not exist", boolean0);
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.insereAresta(0, 0, (-745));
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, (-40));
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
        assertNull("Removed edge should be null", grafo_Aresta0);
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        int int0 = grafo0.numVertices();
        assertEquals("Number of vertices should be 100", 100, int0);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.insereAresta(0, 0, 0);
        Grafo grafo1 = grafo0.grafoTransposto();
        assertEquals("Number of vertices in transposed graph should be 100", 100, grafo1.numVertices());
        assertNotSame("Transposed graph should be a different instance", grafo1, grafo0);
    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        grafo0.insereAresta(0, 0, 822);
        Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 0);
        assertNotNull("Removed edge should not be null", grafo_Aresta0);
        int int0 = grafo_Aresta0.v2();
        assertEquals("Edge weight should be 822", 822, grafo_Aresta0.peso());
        assertEquals("Edge destination vertex should be 0", 0, int0);
        assertEquals("Edge source vertex should be 0", 0, grafo_Aresta0.v1());
        assertEquals("Number of vertices should be 100", 100, grafo0.numVertices());
    }
}