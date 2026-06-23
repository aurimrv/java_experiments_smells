package ds.seed5838;

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

    private FPHeapMin createFPHeapMinWithSize(int size) {
        return new FPHeapMin(size);
    }

    private FPHeapMin createFPHeapMinWithItems(Item[] items) {
        return new FPHeapMin(items);
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(0);
        Item[] itemArray0 = new Item[0];
        fPHeapMin0.copia(itemArray0);
        assertEquals("Array length should be 0 after copy", 0, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(0);
        try {
            fPHeapMin0.imprime();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(-1);
        fPHeapMin0.imprime();
        // Additional assertions could verify internal state or output if accessible.
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(449);
        try {
            fPHeapMin0.diminuiChave(1, (Object) null);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(-1);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }



    @Test(timeout = 4000)
    public void test06() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(14);
        MeuItem meuItem0 = createMeuItem(0);
        fPHeapMin0.insere(meuItem0);
        fPHeapMin0.insere(meuItem0);
        fPHeapMin0.insere(meuItem0);
        MeuItem meuItem1 = (MeuItem)fPHeapMin0.retiraMin();
        assertEquals(4, meuItem1.tamanho());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(14);
        MeuItem meuItem0 = createMeuItem(0);
        fPHeapMin0.insere(meuItem0);
        fPHeapMin0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE);
        fPHeapMin0.insere(meuItem1);
        Item item0 = fPHeapMin0.retiraMin();
        assertNotSame(item0, meuItem1);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = createFPHeapMinWithItems(itemArray0);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = createFPHeapMinWithItems(itemArray0);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = createFPHeapMinWithItems(itemArray0);
        try {
            fPHeapMin0.constroi();
            fail("Expecting exception: NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = createFPHeapMinWithItems(itemArray0);
        MeuItem meuItem0 = createMeuItem(3414);
        try {
            fPHeapMin0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        FPHeapMin fPHeapMin0 = createFPHeapMinWithSize(0);
        Item item0 = fPHeapMin0.min();
        assertNull("Expected min() to return null for empty heap", item0);
    }
}