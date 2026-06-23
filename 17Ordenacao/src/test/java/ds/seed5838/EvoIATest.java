package ds.seed5838;

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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = new Item[5];
        MeuItem meuItem0 = new MeuItem(3);
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        itemArray0[3] = (Item) meuItem0;
        itemArray0[4] = (Item) meuItem0;
        Ordenacao.heapsort(itemArray0, 3);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 5 after heapsort", 5, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = new Item[8];
        MeuItem meuItem0 = new MeuItem(0);
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        itemArray0[5] = (Item) meuItem0;
        itemArray0[6] = (Item) meuItem0;
        assertThrows(NullPointerException.class, () -> {
            Ordenacao.shellsort(itemArray0, 6);
        });
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Item[] itemArray0 = new Item[8];
        MeuItem meuItem0 = new MeuItem(0);
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        MeuItem meuItem1 = new MeuItem((-2354));
        itemArray0[3] = (Item) meuItem1;
        Ordenacao.shellsort(itemArray0, 3);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 8 after shellsort", 8, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Item[] itemArray0 = new Item[7];
        MeuItem meuItem0 = new MeuItem((-2565));
        MeuItem meuItem1 = new MeuItem(235);
        itemArray0[1] = (Item) meuItem1;
        itemArray0[2] = (Item) meuItem0;
        Ordenacao.insercao(itemArray0, 2);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 7 after insercao", 7, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Item[] itemArray0 = new Item[4];
        MeuItem meuItem0 = new MeuItem(3813);
        itemArray0[1] = (Item) meuItem0;
        MeuItem meuItem1 = new MeuItem(2);
        itemArray0[2] = (Item) meuItem1;
        Ordenacao.selecao(itemArray0, 2);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 4 after selecao", 4, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Item[] itemArray0 = new Item[4];
        MeuItem meuItem0 = new MeuItem(3813);
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        Ordenacao.selecao(itemArray0, 2);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 4 after selecao", 4, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Item[] itemArray0 = new Item[7];
        MeuItem meuItem0 = new MeuItem(3034);
        itemArray0[0] = (Item) meuItem0;
        itemArray0[1] = (Item) meuItem0;
        Ordenacao.quicksort(itemArray0, 0);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 7 after quicksort", 7, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        MeuItem meuItem0 = new MeuItem(1159);
        MeuItem meuItem1 = new MeuItem((-1309));
        Item[] itemArray0 = new Item[8];
        itemArray0[1] = (Item) meuItem0;
        itemArray0[2] = (Item) meuItem0;
        itemArray0[3] = (Item) meuItem1;
        itemArray0[4] = (Item) meuItem1;
        itemArray0[5] = (Item) meuItem0;
        itemArray0[6] = (Item) meuItem1;
        itemArray0[7] = (Item) meuItem1;
        Ordenacao.quicksort(itemArray0, 7);
        assertNotNull(itemArray0);
        assertEquals("Array length should be 8 after quicksort", 8, itemArray0.length);
        // Additional assertions verifying sorted order or item values should be added here.
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Ordenacao ordenacao0 = new Ordenacao();
        assertNotNull("Ordenacao instance should be created", ordenacao0);
        // Additional meaningful assertions should be added here
    }
}