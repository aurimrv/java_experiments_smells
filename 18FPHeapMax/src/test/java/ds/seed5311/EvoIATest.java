package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends FPHeapMax_ESTest_scaffolding {

    private FPHeapMax createHeap(int size) {
        return new FPHeapMax(size);
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        MeuItem meuItem0 = createMeuItem(0);
        fPHeapMax0.insere(meuItem0);
        fPHeapMax0.imprime();
        assertEquals(meuItem0, fPHeapMax0.retiraMax());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(1);
        MeuItem meuItem0 = createMeuItem(1);
        fPHeapMax0.insere(meuItem0);
        try {
            fPHeapMax0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertEquals("Erro: heap cheio", e.getMessage());
            verifyException("ds.FPHeapMax", e);
        }
    }












}