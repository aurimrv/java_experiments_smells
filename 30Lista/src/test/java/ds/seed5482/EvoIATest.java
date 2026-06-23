package ds.seed5482;

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

    private Grafo createGrafo(int size) {
        return new Grafo(size);
    }

    private AgmPrim createAgmPrim(Grafo grafo) {
        return new AgmPrim(grafo);
    }






}