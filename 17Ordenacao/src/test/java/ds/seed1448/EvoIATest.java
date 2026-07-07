package ds.seed1448;

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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = new Item[3];
        MeuItem meuItem0 = new MeuItem(1581);
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        try {
            Ordenacao.heapsort(itemArray0, 1581);
            fail("Expected ArrayIndexOutOfBoundsException when calling heapsort with index 1581");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("1581", e.getMessage());
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = new Item[1];
        Ordenacao.heapsort(itemArray0, 0);
        assertEquals("Array length should be 1 after heapsort", 1, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Item[] itemArray0 = new Item[8];
        MeuItem meuItem0 = new MeuItem(0);
        MeuItem meuItem1 = new MeuItem(Integer.MAX_VALUE);
        itemArray0[1] = (Item) meuItem1;
        itemArray0[2] = (Item) meuItem0;
        itemArray0[3] = (Item) meuItem1;
        itemArray0[4] = (Item) meuItem0;
        itemArray0[5] = (Item) meuItem1;
        itemArray0[6] = (Item) meuItem1;
        itemArray0[7] = (Item) meuItem0;
        Ordenacao.shellsort(itemArray0, 7);
        assertEquals("Array length should be 8 after shellsort", 8, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Item[] itemArray0 = new Item[4];
        MeuItem meuItem0 = new MeuItem(2341);
        itemArray0[1] = (Item) meuItem0;
        MeuItem meuItem1 = new MeuItem(1);
        itemArray0[2] = (Item) meuItem1;
        try {
            Ordenacao.insercao(itemArray0, 2341);
            fail("Expected NullPointerException when calling insercao with parameter 2341");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.Ordenacao", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Item[] itemArray0 = new Item[3];
        Ordenacao.insercao(itemArray0, 0);
        assertEquals("Array length should be 3 after insercao", 3, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Item[] itemArray0 = new Item[7];
        MeuItem meuItem0 = new MeuItem(2084);
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        MeuItem meuItem1 = new MeuItem(1497);
        itemArray0[3] = (Item) meuItem1;
        Ordenacao.selecao(itemArray0, 3);
        assertEquals("Array length should be 7 after selecao", 7, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Item[] itemArray0 = new Item[3];
        MeuItem meuItem0 = new MeuItem(0);
        itemArray0[0] = (Item) meuItem0;
        itemArray0[1] = (Item) meuItem0;
        Ordenacao.quicksort(itemArray0, 0);
        assertEquals("Array length should be 3 after quicksort", 3, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Item[] itemArray0 = new Item[5];
        MeuItem meuItem0 = new MeuItem(3469);
        MeuItem meuItem1 = new MeuItem(2);
        itemArray0[1] = (Item) meuItem1;
        itemArray0[2] = (Item) meuItem0;
        Ordenacao.quicksort(itemArray0, 2);
        assertEquals("Array length should be 5 after quicksort", 5, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Item[] itemArray0 = new Item[3];
        MeuItem meuItem0 = new MeuItem(0);
        itemArray0[0] = (Item) meuItem0;
        MeuItem meuItem1 = new MeuItem(-3783);
        itemArray0[1] = (Item) meuItem1;
        try {
            Ordenacao.quicksort(itemArray0, 0);
            fail("Expected NullPointerException when calling quicksort with parameter 0");
        } catch (NullPointerException e) {
            // Exception expected
        }
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        Item[] itemArray0 = new Item[1];
        Ordenacao ordenacao0 = new Ordenacao();
        ordenacao0.heapsort(itemArray0, 0);
        assertEquals("Array length should be 1 after heapsort", 1, itemArray0.length);
    }

}