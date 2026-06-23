package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends AgmPrim_ESTest_scaffolding {

    private void insertEdge(Grafo grafo, int from, int to, int weight) {
        grafo.insereAresta(from, to, weight);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Grafo grafo0 = new Grafo(32);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        insertEdge(grafo0, 2, 21, 2);
        Object result = agmPrim0.obterAgm(2);
        assertNotNull("AGM result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Grafo grafo0 = new Grafo(57);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        grafo0.insereAresta(18, 18, 18);
        Object result = agmPrim0.obterAgm(18);
        assertNotNull("AGM result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Grafo grafo0 = new Grafo(32);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        insertEdge(grafo0, 2, 21, 2);
        Object result = agmPrim0.obterAgm(2);
        assertNotNull("AGM result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Grafo grafo0 = new Grafo(1053);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        // Undeclared exception!
        try {
            agmPrim0.antecessor(-1093);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // no message in exception (getMessage() returned null)
            verifyException("ds.AgmPrim", e);
        }
    }
}