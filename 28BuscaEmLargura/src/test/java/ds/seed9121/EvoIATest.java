package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private Grafo createGraphWithEdge(int v1, int v2, int peso, int vertices) {
        Grafo g = new Grafo(vertices);
        g.insereAresta(v1, v2, peso);
        return g;
    }

    private Grafo createGraph(int vertices) {
        return new Grafo(vertices);
    }









}