package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

    private int[] createArrayWithValue(int size, int index, int value) {
        int[] array = new int[size];
        array[index] = value;
        return array;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = createArrayWithValue(5, 0, 1918);
        try {
            Ordenacao.mergeSort(intArray0, 0, 2724);
            fail("Expected ArrayIndexOutOfBoundsException due to invalid index in mergeSort");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("Index 2724 out of bounds for length 5", e.getMessage());
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Ordenacao ordenacao0 = new Ordenacao();
        assertNotNull("Ordenacao instance should not be null", ordenacao0);
    }
}