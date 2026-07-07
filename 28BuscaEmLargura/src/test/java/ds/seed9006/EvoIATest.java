package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private static final int VERTICES_240 = 240;
    private static final int VERTICES_1165 = 1165;
    private static final int VERTICES_212 = 212;

    private Grafo createGraph240() {
        return new Grafo(VERTICES_240);
    }

    private Grafo createGraph1165() {
        return new Grafo(VERTICES_1165);
    }

    private Grafo createGraph212() {
        return new Grafo(VERTICES_212);
    }









}