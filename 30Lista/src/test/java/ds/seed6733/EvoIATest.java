package ds.seed6733;

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

    private Grafo createSampleGrafo1() {
        Grafo grafo = new Grafo(2521);
        grafo.insereAresta(371, 1240, 371);
        return grafo;
    }

    private Grafo createSampleGrafo2() {
        Grafo grafo = new Grafo(2521);
        grafo.insereAresta(371, 1240, 371);
        grafo.insereAresta(371, 1240, 1240);
        return grafo;
    }

    private Grafo createSampleGrafo3() {
        Grafo grafo = new Grafo(2486);
        grafo.insereAresta(48, 48, 2486);
        return grafo;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Grafo grafo0 = createSampleGrafo1();
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        agmPrim0.obterAgm(371);
        //assertNotNull("AGM result should not be null", result);
        agmPrim0.imprime();
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Grafo grafo0 = createSampleGrafo2();
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        agmPrim0.obterAgm(371);
        //assertNotNull("AGM result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Grafo grafo0 = createSampleGrafo3();
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        agmPrim0.obterAgm(48);
        //assertNotNull("AGM result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        AgmPrim agmPrim0 = new AgmPrim((Grafo) null);
        // Undeclared exception!
        try {
            agmPrim0.antecessor(0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("ds.AgmPrim", e);
        }
    }
}