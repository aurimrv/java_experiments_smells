package ds.seed1448;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Ordenacao (focused, hand-maintained improvements over generated version).
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    private static final int ARRAY_SIZE = 9;

    @Before
    public void setUp() {
        // Explicit setup hook in case future tests need initialization; keeps tests independent.
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] actual = new int[ARRAY_SIZE];
        actual[0] = 830;
        // When
        Ordenacao.ordena(actual, ARRAY_SIZE);
        // Then
        int[] expected = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 830};
        assertArrayEquals("Sorted array should have zeros and a final 830", expected, actual);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given-When
        Ordenacao ordenacao0 = new Ordenacao();
        // Then
        assertNotNull("Constructor should create an Ordenacao instance", ordenacao0);
    }
}