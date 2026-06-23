package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Max_ESTest_scaffolding {

    private Item[] createItemArrayWithTwoItems(int val1, int val2) {
        Item[] items = new Item[6];
        items[0] = new MeuItem(val1);
        items[1] = new MeuItem(val2);
        return items;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = createItemArrayWithTwoItems(-2810, 0);
        try {
            Max.max(itemArray0, 692);
            fail("Expected NullPointerException due to null elements");
        } catch (NullPointerException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = createItemArrayWithTwoItems(-2810, -2810);
        try {
            Max.max(itemArray0, 692);
            fail("Expected NullPointerException due to null elements");
        } catch (NullPointerException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Item[] itemArray0 = new Item[6];
        Item item0 = Max.max(itemArray0, -2810);
        assertNull("Max.max should return null for array with only null elements", item0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Max max0 = new Max();
        assertNotNull("Max instance should be created", max0);
    }
}