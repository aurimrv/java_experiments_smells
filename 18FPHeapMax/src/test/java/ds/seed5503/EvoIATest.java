package ds.seed5503;

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

    private FPHeapMax createHeapWithSize(int size) {
        return new FPHeapMax(size);
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMax heap = createHeapWithSize(1);
        MeuItem item = createMeuItem(1);
        heap.insere(item);
        assertEquals(item, heap.max());
        heap.imprime();
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMax heap = createHeapWithSize(0);
        MeuItem item = createMeuItem(172);
        try {
            heap.insere(item);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.FPHeapMax", e);
        }
    }



    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FPHeapMax heap = createHeapWithSize(0);
        try {
            heap.aumentaChave(0, (Object) null);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMax heap = createHeapWithSize(0);
        try {
            heap.retiraMax();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        FPHeapMax heap = createHeapWithSize(986);
        heap.constroi();
        assertNotNull(heap.max());
    }







    @Test(timeout = 4000)
    public void test9() throws Throwable {
        FPHeapMax heap = createHeapWithSize(-1);
        try {
            heap.max();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            verifyException("ds.FPHeapMax", e);
        }
    }

}