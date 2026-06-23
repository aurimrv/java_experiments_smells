package ds.seed5831;

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

    private MeuItem createItem(int value) {
        return new MeuItem(value);
    }

    private Item[] createItemArray(int size) {
        return new Item[size];
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        MeuItem meuItem0 = createItem(0);
        fPHeapMax0.insere(meuItem0);
        fPHeapMax0.imprime();
        assertNotNull(fPHeapMax0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        MeuItem meuItem0 = createItem(0);
        try {
            fPHeapMax0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertEquals("Erro: heap cheio", e.getMessage());
            verifyException("ds.FPHeapMax", e);
        }
    }



    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(1);
        try {
            fPHeapMax0.aumentaChave(1, (Object) null);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertEquals("Erro: chaveNova com valor null", e.getMessage());
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(1);
        Item[] itemArray0 = createItemArray(0);
        fPHeapMax0.copia(itemArray0);
        Item item0 = fPHeapMax0.retiraMax();
        assertNull(item0); // Expected null because heap is empty or array copied is empty
    }






    @Test(timeout = 4000)
    public void test7() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        try {
            fPHeapMax0.max();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("1", e.getMessage());
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(-1);
        try {
            fPHeapMax0.retiraMax();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertEquals("Erro: heap vazio", e.getMessage());
            verifyException("ds.FPHeapMax", e);
        }
    }
}