package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private Grafo createSampleGrafo() {
        Grafo grafo = new Grafo(2581);
        grafo.insereAresta(1315, 1960, 2581);
        return grafo;
    }

    private Grafo createSampleGrafoWithEdges() {
        Grafo grafo = new Grafo(2585);
        grafo.insereAresta(1315, 1315, 1947);
        grafo.insereAresta(1315, 1947, 2585);
        return grafo;
    }

    private Grafo createGrafoWithSize(int size) {
        return new Grafo(size);
    }








}