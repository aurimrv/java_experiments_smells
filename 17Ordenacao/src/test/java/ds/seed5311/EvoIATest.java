package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

    private Item[] createItemArrayWithMeuItem(int size, int value) {
        Item[] array = new Item[size];
        MeuItem item = new MeuItem(value);
        for (int i = 1; i < size; i++) {
            array[i] = item;
        }
        return array;
    }

    private Item[] createItemArrayWithMeuItems() {
        Item[] array = new Item[7];
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(-997);
        array[1] = item1;
        array[2] = item1;
        array[3] = item2;
        array[5] = item1;
        return array;
    }

    private Item[] createItemArrayForInsercao() {
        Item[] array = new Item[4];
        array[1] = new MeuItem(3258);
        array[2] = new MeuItem(0);
        return array;
    }

    private Item[] createItemArrayForSelecao() {
        Item[] array = new Item[6];
        MeuItem item1 = new MeuItem(738);
        MeuItem item2 = new MeuItem(3);
        array[1] = item1;
        array[2] = item1;
        array[3] = item2;
        return array;
    }

    private Item[] createItemArrayForQuicksort() {
        Item[] array = new Item[6];
        MeuItem item0 = new MeuItem(0);
        MeuItem item1 = new MeuItem(4);
        array[1] = item0;
        array[2] = item1;
        array[3] = item0;
        array[4] = item1;
        return array;
    }

    private Item[] createItemArrayForQuicksortVariant() {
        Item[] array = new Item[6];
        MeuItem item0 = new MeuItem(0);
        MeuItem item1 = new MeuItem(29);
        array[1] = item0;
        array[2] = item0;
        array[3] = item1;
        array[4] = item0;
        return array;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(6, 0);
        try {
            Ordenacao.heapsort(itemArray0, 1481);
            fail("Expected ArrayIndexOutOfBoundsException due to invalid index parameter");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception should not be null", e);
            assertTrue("Exception message should contain index", e.getMessage().contains("1481"));
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = new Item[0];
        Ordenacao.heapsort(itemArray0, -1775);
        assertEquals("Array length should be zero after heapsort", 0, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItems();
        try {
            Ordenacao.shellsort(itemArray0, 5);
            fail("Expected NullPointerException due to null elements in array");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Item[] itemArray0 = new Item[0];
        Ordenacao.shellsort(itemArray0, -1775);
        assertEquals("Array length should be zero after shellsort", 0, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Item[] itemArray0 = createItemArrayForInsercao();
        try {
            Ordenacao.insercao(itemArray0, 4);
            fail("Expected NullPointerException due to null elements in array");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Item[] itemArray0 = new Item[1];
        Ordenacao.insercao(itemArray0, -289);
        assertEquals("Array length should be one after insercao", 1, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Item[] itemArray0 = createItemArrayForSelecao();
        Ordenacao.selecao(itemArray0, 3);
        assertEquals("Array length should be six after selecao", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Item[] itemArray0 = createItemArrayForQuicksort();
        Ordenacao.quicksort(itemArray0, 4);
        assertEquals("Array length should be six after quicksort", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Item[] itemArray0 = createItemArrayForQuicksortVariant();
        Ordenacao.quicksort(itemArray0, 4);
        assertEquals("Array length should be six after quicksort", 6, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        Ordenacao ordenacao0 = new Ordenacao();
        assertNotNull("Ordenacao instance should not be null", ordenacao0);
    }
}