package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends FPHeapMax_ESTest_scaffolding {

    private FPHeapMax createHeap(int size) {
        return new FPHeapMax(size);
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(463);
        MeuItem meuItem0 = createMeuItem(463);
        fPHeapMax0.insere(meuItem0);
        assertEquals(meuItem0, fPHeapMax0.max());
        fPHeapMax0.imprime();
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        MeuItem meuItem0 = createMeuItem(0);
        try {
            fPHeapMax0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMax", e);
        }
    }



    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(2447);
        try {
            fPHeapMax0.aumentaChave(2447, (Object) null);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(2552);
        try {
            fPHeapMax0.retiraMax();
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMax", e);
        }
    }







    @Test(timeout = 4000)
    public void test8() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(1698);
        Item item0 = fPHeapMax0.max();
        assertNull(item0);
    }
}