package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends FPHeapMin_ESTest_scaffolding {

    private FPHeapMin createHeap(int size) {
        return new FPHeapMin(size);
    }

    private FPHeapMin createHeap(Item[] items) {
        return new FPHeapMin(items);
    }

    private MeuItem createMeuItem(int key) {
        return new MeuItem(key);
    }

    private Item[] createItemArray(int size, MeuItem item) {
        Item[] array = new Item[size];
        for (int i = 1; i < size; i++) {
            array[i] = item;
        }
        return array;
    }

    private Item[] createItemArrayWithItems(int size, MeuItem item0, MeuItem item1) {
        Item[] array = new Item[size];
        array[2] = item0;
        array[3] = item1;
        array[6] = item0;
        array[7] = item1;
        array[8] = item0;
        return array;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeap(0);
        MeuItem meuItem0 = createMeuItem(Integer.MIN_VALUE);
        fPHeapMin0.insere(meuItem0);
        fPHeapMin0.imprime();
        assertNotNull(fPHeapMin0);
        //assertEquals(1, fPHeapMin0.size());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeap(0);
        Item[] itemArray0 = new Item[0];
        MeuItem meuItem0 = createMeuItem(Integer.MAX_VALUE);
        fPHeapMin0.copia(itemArray0);
        try {
            fPHeapMin0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("heap cheio"));
            verifyException("ds.FPHeapMin", e);
        }
    }



    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeap(795);
        try {
            fPHeapMin0.diminuiChave(4, null);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("chaveNova com valor null"));
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = createHeap(itemArray0);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("heap vazio"));
            verifyException("ds.FPHeapMin", e);
        }
    }



    @Test(timeout = 4000)
    public void test8() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeap(-1);
        try {
            fPHeapMin0.min();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull(e.getMessage());
            verifyException("ds.FPHeapMin", e);
        }
    }
}