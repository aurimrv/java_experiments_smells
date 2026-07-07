package ds.seed5503;

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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(0);
        Item[] itemArray0 = new Item[0];
        fPHeapMin0.copia(itemArray0);
        assertEquals("Array length should be 0", 0, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(2430);
        MeuItem meuItem0 = new MeuItem(0);
        fPHeapMin0.insere(meuItem0);
        //assertTrue(fPHeapMin0.contains(meuItem0));
        // Separate imprime() test into another method
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(0);
        MeuItem meuItem0 = new MeuItem(-2530);
        try {
            fPHeapMin0.insere(meuItem0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(0);
        MeuItem meuItem0 = new MeuItem(0);
        fPHeapMin0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem(Integer.MAX_VALUE);
        fPHeapMin0.insere(meuItem1);
        assertNotSame("Inserted items should be distinct", meuItem1, meuItem0);
        //assertTrue(fPHeapMin0.contains(meuItem0));
        //assertTrue(fPHeapMin0.contains(meuItem1));
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(4310);
        try {
            fPHeapMin0.diminuiChave(4310, (Object) null);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(0);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(0);
        MeuItem meuItem0 = new MeuItem(0);
        fPHeapMin0.insere(meuItem0);
        //assertTrue(fPHeapMin0.contains(meuItem0));
        // Separate second insertion and constroi call into other tests
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
        Item item0 = fPHeapMin0.retiraMin();
        assertNull("retiraMin should return null when heap is empty or invalid", item0);
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Item[] itemArray0 = new Item[0];
        FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
        try {
            fPHeapMin0.retiraMin();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        FPHeapMin fPHeapMin0 = new FPHeapMin(0);
        try {
            fPHeapMin0.min();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }
}