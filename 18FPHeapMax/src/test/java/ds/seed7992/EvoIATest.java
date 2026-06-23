package ds.seed7992;

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

    private Item[] createItemArray(int size) {
        return new Item[size];
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(2021);
        Item[] itemArray0 = createItemArray(2);
        fPHeapMax0.copia(itemArray0);
        try {
            fPHeapMax0.imprime();
            fail("Expecting NullPointerException when calling imprime on uninitialized heap");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(2021);
        fPHeapMax0.imprime();
        // Add assertions to verify expected behavior after imprime call
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        MeuItem meuItem0 = createMeuItem(0);
        try {
            fPHeapMax0.insere(meuItem0);
            fail("Expecting Exception when inserting into full heap");
        } catch (Exception e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(4);
        MeuItem meuItem0 = createMeuItem(43);
        fPHeapMax0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(0);
        fPHeapMax0.insere(meuItem1);
        assertEquals("Item size should be 4", 4, meuItem1.tamanho());
        // Additional assertions could verify other properties of meuItem1 or heap state
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(1);
        try {
            fPHeapMax0.aumentaChave(1, (Object) null);
            fail("Expecting Exception when new key is null");
        } catch (Exception e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(2021);
        try {
            fPHeapMax0.retiraMax();
            fail("Expecting Exception when removing max from empty heap");
        } catch (Exception e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(2021);
        Item[] itemArray0 = createItemArray(2);
        fPHeapMax0.copia(itemArray0);
        Item item0 = fPHeapMax0.retiraMax();
        assertNull("retiraMax should return null when heap is empty or after copying empty array", item0);
        // Additional assertions could verify heap state
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(17);
        fPHeapMax0.constroi();
        // Add assertions to verify heap state after constroi call if possible
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(17);
        MeuItem meuItem0 = createMeuItem(17);
        fPHeapMax0.insere(meuItem0);
        Item[] itemArray0 = createItemArray(4);
        MeuItem meuItem1 = createMeuItem(1288);
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem0;
        fPHeapMax0.copia(itemArray0);
        try {
            fPHeapMax0.refaz(1, 17);
            fail("Expecting NullPointerException when calling refaz with invalid state");
        } catch (NullPointerException e) {
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(9);
        MeuItem meuItem0 = createMeuItem(-2189);
        MeuItem meuItem1 = createMeuItem(9);
        fPHeapMax0.insere(meuItem0);
        fPHeapMax0.insere(meuItem1);
        Item[] itemArray0 = createItemArray(6);
        itemArray0[1] = meuItem1;
        fPHeapMax0.copia(itemArray0);
        fPHeapMax0.refaz(1, 9);
        // Add assertions to verify heap state after refaz call
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(4862);
        Item[] itemArray0 = createItemArray(3);
        fPHeapMax0.copia(itemArray0);
        try {
            fPHeapMax0.constroi();
            fail("Expecting NullPointerException when calling constroi on invalid state");
        } catch (NullPointerException e) {
            verifyException("ds.FPHeapMax", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FPHeapMax fPHeapMax0 = createHeap(0);
        try {
            fPHeapMax0.max();
            fail("Expecting ArrayIndexOutOfBoundsException when calling max on empty heap");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.FPHeapMax", e);
        }
    }
}