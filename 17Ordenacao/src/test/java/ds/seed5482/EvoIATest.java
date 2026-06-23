package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

    private Item[] createItemArrayWithMeuItem(int size, int value, int... indices) {
        Item[] array = new Item[size];
        MeuItem item = new MeuItem(value);
        for (int index : indices) {
            array[index] = item;
        }
        return array;
    }

    private Item[] createItemArrayWithMeuItems(int size, MeuItem... items) {
        Item[] array = new Item[size];
        for (int i = 0; i < items.length; i++) {
            array[i + 1] = items[i];
        }
        return array;
    }

    private Item[] createEmptyItemArray() {
        return new Item[0];
    }

    private Item[] createItemArray(int size) {
        return new Item[size];
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(5, 1738, 1, 2, 3, 4);
        try {
            Ordenacao.heapsort(itemArray0, 1738);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("1738", e.getMessage());
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Item[] itemArray0 = createEmptyItemArray();
        Ordenacao.heapsort(itemArray0, 0);
        assertEquals("Array length should be zero", 0, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(9, -25, 1, 2, 5, 6);
        try {
            Ordenacao.shellsort(itemArray0, 6);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        MeuItem meuItem0 = new MeuItem(4);
        MeuItem meuItem1 = new MeuItem(0);
        Item[] itemArray0 = createItemArrayWithMeuItems(9, meuItem0, meuItem1, meuItem1);
        try {
            Ordenacao.shellsort(itemArray0, 4);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Item[] itemArray0 = createItemArray(4);
        Ordenacao.shellsort(itemArray0, 0);
        assertEquals("Array length should be 4", 4, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        MeuItem meuItem0 = new MeuItem(2140);
        MeuItem meuItem1 = new MeuItem(-1123);
        Item[] itemArray0 = createItemArrayWithMeuItems(5, meuItem0, meuItem0, meuItem0, meuItem1);
        try {
            Ordenacao.insercao(itemArray0, 2140);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("5", e.getMessage());
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Item[] itemArray0 = createItemArray(2);
        Ordenacao.insercao(itemArray0, 0);
        assertEquals("Array length should be 2", 2, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        MeuItem meuItem0 = new MeuItem(-1339);
        MeuItem meuItem1 = new MeuItem(-2963);
        Item[] itemArray0 = createItemArrayWithMeuItems(6, meuItem0, meuItem1);
        Ordenacao.selecao(itemArray0, 2);
        assertEquals("Array length should be 6", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(6, -1339, 1, 2);
        Ordenacao.selecao(itemArray0, 2);
        assertEquals("Array length should be 6", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(6, 601, 1, 2, 3, 4);
        Ordenacao.quicksort(itemArray0, 4);
        assertEquals("Array length should be 6", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        MeuItem meuItem0 = new MeuItem(601);
        MeuItem meuItem1 = new MeuItem(-559);
        Item[] itemArray0 = createItemArrayWithMeuItems(6, meuItem1, meuItem0, meuItem0, meuItem0);
        Ordenacao.quicksort(itemArray0, 4);
        assertEquals("Array length should be 6", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(3, -1, 0, 1);
        Ordenacao.quicksort(itemArray0, 0);
        assertEquals("Array length should be 3", 3, itemArray0.length);
    }

}