package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends AgmPrim_ESTest_scaffolding {

    private Grafo createTestGrafo() {
        Grafo grafo = new Grafo(2357);
        grafo.insereAresta(2351, 2328, 1);
        return grafo;
    }

    private Grafo createTestGrafoWithEdges() {
        Grafo grafo = new Grafo(2357);
        grafo.insereAresta(2351, 2328, 1);
        grafo.insereAresta(2351, 2328, 2357);
        return grafo;
    }

    private Grafo createTestGrafoWithEdge() {
        Grafo grafo = new Grafo(2357);
        grafo.insereAresta(1, 2328, 2357);
        return grafo;
    }

    private AgmPrim createAgmPrimWithNullGrafo() {
        return new AgmPrim((Grafo) null);
    }






    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Grafo grafo0 = createTestGrafoWithEdge();
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        agmPrim0.obterAgm(2351);
        //assertNotNull("AGM result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        AgmPrim agmPrim0 = createAgmPrimWithNullGrafo();
        try {
            agmPrim0.antecessor(-1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            verifyException("ds.AgmPrim", e);
        }
    }
}