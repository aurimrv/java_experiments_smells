package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

    private static final int TEST_VERTEX_COUNT_1 = 1;
    private static final int TEST_VERTEX_COUNT_239 = 239;
    private static final int TEST_VERTEX_COUNT_4052 = 4052;
    private static final int TEST_VERTEX_COUNT_1688 = 1688;
    private static final int TEST_VERTEX_COUNT_2084 = 2084;

    private Grafo createTestGrafo(int vertexCount) {
        return new Grafo(vertexCount);
    }









}