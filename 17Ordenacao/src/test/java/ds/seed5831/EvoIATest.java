package ds.seed5831;

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

    private Item[] createItemArrayWithMeuItem(int size, int value) {
        Item[] items = new Item[size];
        MeuItem meuItem = new MeuItem(value);
        for (int i = 0; i < size; i++) {
            items[i] = meuItem;
        }
        return items;
    }

    private Item[] createItemArrayWithValues(int size, int[] values) {
        Item[] items = new Item[size];
        for (int i = 0; i < values.length; i++) {
            items[i] = new MeuItem(values[i]);
        }
        return items;
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItem(4, 1);
        try {
            Ordenacao.heapsort(itemArray0, 0); // test lower boundary
            Ordenacao.heapsort(itemArray0, 3); // test upper boundary
            fail("Expecting exception: ArrayIndexOutOfBoundsException thrown by heapsort with invalid index");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("650", e.getMessage());
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Item[] itemArray0 = new Item[0];
        Ordenacao.heapsort(itemArray0, 0);
        assertEquals("Array length should be zero", 0, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(7, new int[]{0, 0, -1413, -1413, 0, 0, 0});
        try {
            Ordenacao.shellsort(itemArray0, 6);
            fail("Expecting exception: NullPointerException thrown by shellsort with invalid input");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        try {
            Ordenacao.shellsort((Item[]) null, 0);
        } catch (Exception e) {
            fail("Method should handle null input without exception");
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(7, new int[]{3, 0, 0, 0, 0, 0, 0});
        try {
            Ordenacao.insercao(itemArray0, 20);
            fail("Expecting exception: NullPointerException thrown by insercao with invalid input");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Item[] itemArray0 = new Item[1];
        Ordenacao.insercao(itemArray0, 0);
        assertEquals("Array length should be one", 1, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(6, new int[]{2928, 1062, 0, 0, 0, 0});
        try {
            Ordenacao.selecao(itemArray0, 2928);
            fail("Expecting exception: NullPointerException thrown by selecao with invalid input");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(5, new int[]{2, 2, 0, 0, 0});
        Ordenacao.selecao(itemArray0, 2);
        assertEquals("Array length should be five", 5, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(5, new int[]{0, 3, 3, 0, 0});
        Ordenacao.quicksort(itemArray0, 3);
        assertEquals("Array length should be five", 5, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(9, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
        try {
            Ordenacao.quicksort(itemArray0, 6);
            fail("Expecting exception: NullPointerException thrown by quicksort with invalid input");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(5, new int[]{-2531, -2531, 3, 3, 0});
        Ordenacao.quicksort(itemArray0, 3);
        assertEquals("Array length should be five", 5, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Item[] itemArray0 = createItemArrayWithValues(2, new int[]{0, 0});
        Ordenacao.quicksort(itemArray0, 0);
        assertEquals("Array length should be two", 2, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Ordenacao ordenacao0 = new Ordenacao();
        assertNotNull("Ordenacao instance should be created", ordenacao0);
    }
}