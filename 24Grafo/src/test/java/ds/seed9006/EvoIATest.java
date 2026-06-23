package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Grafo_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Grafo grafo0 = new Grafo();
        assertNotNull("Grafo instance should not be null", grafo0);
    }
}