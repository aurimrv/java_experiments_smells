package ds.seed5482;

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

    private MeuItem createMeuItem(int key) {
        return new MeuItem(key);
    }

    private void expectException(Runnable action, Class<? extends Exception> exceptionClass, String expectedMessagePart) {
        try {
            action.run();
            fail("Expecting exception: " + exceptionClass.getSimpleName());
        } catch (Exception e) {
            assertTrue("Exception type mismatch", exceptionClass.isInstance(e));
            if (expectedMessagePart != null) {
                assertTrue("Exception message mismatch", e.getMessage().contains(expectedMessagePart));
            }
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMax heap = createHeap(2178);
        MeuItem item = createMeuItem(1890);
        heap.insere(item);
        heap.imprime();
        assertNotNull("Heap should not be empty after insertion", heap.retiraMax());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMax heap = createHeap(0);
        expectException(() -> heap.insere((Item) null), Exception.class, "heap cheio");
    }








}