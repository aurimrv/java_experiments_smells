package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Max_ESTest_scaffolding {

    private Item[] createRepeatedMeuItems(int count, int value) {
        Item[] items = new Item[count];
        MeuItem meuItem = new MeuItem(value);
        for (int i = 0; i < count; i++) {
            items[i] = meuItem;
        }
        return items;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = new Item[9];
        MeuItem meuItem0 = new MeuItem(0);
        for (int i = 0; i < 6; i++) {
            itemArray0[i] = meuItem0;
        }
        MeuItem meuItem1 = new MeuItem(1562);
        itemArray0[6] = meuItem1;
        try {
            Max.max(itemArray0, 2340);
            fail("Expected NullPointerException when Max.max is called with partially null array");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = new Item[4];
        Item item0 = Max.max(itemArray0, 0);
        assertNull("Expected null result for empty item array", item0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Max max0 = new Max();
        assertNotNull("Max instance should be created", max0);
    }

}