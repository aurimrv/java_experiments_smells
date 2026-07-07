package ds.seed7992;

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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Grafo grafo0 = new Grafo(2717);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        grafo0.insereAresta(0, 0, 0);
        agmPrim0.obterAgm(0);
        //assertNotNull("AGM result should not be null", agm);
        // Additional assertions verifying properties of agm could be added here
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Grafo grafo0 = new Grafo(2630);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        grafo0.insereAresta(18, 42, 18);
        agmPrim0.obterAgm(18);
        //assertNotNull("AGM result should not be null", agm);
        // Separate test method should test imprime() separately.
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Grafo grafo0 = new Grafo(0);
        AgmPrim agmPrim0 = new AgmPrim(grafo0);
        try {
            agmPrim0.antecessor(0);
            fail("Expecting NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            // Additional assertions on exception message or stack trace could be added
        }
    }
}