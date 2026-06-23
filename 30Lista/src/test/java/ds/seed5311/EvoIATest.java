package ds.seed5311;

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

    private static final int GRAPH_SIZE = 2330;
    private static final int NODE1 = 2074;
    private static final int NODE2 = 305;

    private Grafo createGraph() {
        return new Grafo(GRAPH_SIZE);
    }

    private Grafo createGraphWithEdge() {
        Grafo g = new Grafo(GRAPH_SIZE);
        g.insereAresta(NODE1, NODE2, NODE1);
        return g;
    }






}