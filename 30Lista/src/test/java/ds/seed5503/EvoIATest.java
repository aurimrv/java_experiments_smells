package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AgmPrim;
import ds.Grafo;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import java.util.Set;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends AgmPrim_ESTest_scaffolding {

    private Grafo createGraph(int size) {
        return new Grafo(size);
    }

    private AgmPrim createAgmPrim(Grafo grafo) {
        return new AgmPrim(grafo);
    }



}