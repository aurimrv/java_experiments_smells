package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends FPHeapMin_ESTest_scaffolding {

    private Item[] createItemArrayWithMeuItems() {
        Item[] items = new Item[3];
        MeuItem meuItem = new MeuItem(-1478);
        items[1] = meuItem;
        items[2] = meuItem;
        return items;
    }

    private FPHeapMin createHeapWithCapacity(int capacity) {
        return new FPHeapMin(capacity);
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    private FPHeapMin createHeapFromItems(Item[] items) {
        return new FPHeapMin(items);
    }

    private Item[] createItemArrayWithMeuItems(MeuItem item) {
        Item[] items = new Item[6];
        items[2] = item;
        items[3] = item;
        items[5] = item;
        return items;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItems();
        FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
        fPHeapMin0.imprime();
        // TODO: Add assertions verifying expected output or state after imprime call
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(0);
        MeuItem meuItem0 = createMeuItem(0);
        try {
            fPHeapMin0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(20);
        MeuItem meuItem0 = createMeuItem(1);
        fPHeapMin0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(20);
        fPHeapMin0.insere(meuItem1);
        assertNotSame("Inserted items should be different objects", meuItem1, meuItem0);
        // TODO: Add assertions verifying heap size or state
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(20);
        MeuItem meuItem0 = createMeuItem(1);
        fPHeapMin0.insere(meuItem0);
        fPHeapMin0.insere(meuItem0);
        assertEquals("MeuItem size should be 4 after two insertions", 4, meuItem0.tamanho());
        // TODO: Add additional assertions verifying heap state
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(109);
        try {
            fPHeapMin0.diminuiChave(0, (Object) null);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(159);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        MeuItem meuItem0 = createMeuItem(1);
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(458);
        Item[] itemArray0 = createItemArrayWithMeuItems(meuItem0);
        fPHeapMin0.copia(itemArray0);
        Item item0 = fPHeapMin0.retiraMin();
        assertNull("retiraMin should return null when heap is empty or after copia", item0);
        // TODO: Add additional assertions verifying heap state
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Item[] itemArray0 = new Item[5];
        MeuItem meuItem0 = createMeuItem(0);
        MeuItem meuItem1 = createMeuItem(1);
        itemArray0[2] = meuItem1;
        itemArray0[3] = meuItem0;
        FPHeapMin fPHeapMin0 = createHeapFromItems(itemArray0);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Item[] itemArray0 = new Item[3];
        MeuItem meuItem0 = createMeuItem(-1478);
        MeuItem meuItem1 = createMeuItem(1731);
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem0;
        FPHeapMin fPHeapMin0 = createHeapFromItems(itemArray0);
        fPHeapMin0.constroi();
        // TODO: Add assertions verifying heap state after constroi
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        FPHeapMin fPHeapMin0 = createHeapWithCapacity(3323);
        Item item0 = fPHeapMin0.min();
        assertNull("min should return null when heap is empty", item0);
        // TODO: Add additional assertions verifying heap state
    }

}