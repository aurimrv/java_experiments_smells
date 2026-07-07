package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.List;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends AgmPrim_ESTest_scaffolding {

    private Grafo createTestGrafo() {
        return new Grafo(2537);
    }

    private AgmPrim createTestAgmPrim(Grafo grafo) {
        return new AgmPrim(grafo);
    }

    private AgmPrim createAgmPrimWithNullGraph() {
        return new AgmPrim((Grafo) null);
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        AgmPrim agmPrim0 = createTestAgmPrim(grafo0);
        grafo0.insereAresta(0, 586, 586);
        agmPrim0.obterAgm(0);
        //assertNotNull("AGM result should not be null", agm);
        //assertFalse("AGM should not be empty", agm.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        AgmPrim agmPrim0 = createTestAgmPrim(grafo0);
        grafo0.insereAresta(0, 0, 0);
        agmPrim0.obterAgm(0);
        //assertNotNull("AGM result should not be null", agm);
        //assertFalse("AGM should not be empty", agm.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Grafo grafo0 = createTestGrafo();
        AgmPrim agmPrim0 = createTestAgmPrim(grafo0);
        grafo0.insereAresta(0, 586, 586);
        agmPrim0.obterAgm(0);
        //assertNotNull("AGM result should not be null", agm);
        //assertFalse("AGM should not be empty", agm.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        AgmPrim agmPrim0 = createAgmPrimWithNullGraph();
        try { 
            agmPrim0.antecessor(3327);
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.AgmPrim", e);
        }
    }
}