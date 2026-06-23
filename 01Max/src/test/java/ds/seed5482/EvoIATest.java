package ds.seed5482;

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
        Item[] items = new Item[9];
        items[0] = new MeuItem(val1);
        items[1] = new MeuItem(val2);
        return items;
    }

    private Item[] createItemArrayWithTwoSameItems(int val) {
        Item[] items = new Item[9];
        MeuItem item = new MeuItem(val);
        items[0] = item;
        items[1] = item;
        return items;
    }

    /**
     * Tests that Max.max throws NullPointerException when array contains null elements.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = createItemArrayWithTwoItems(0, 560);
        try {
            Max.max(itemArray0, 560);
            fail("Expected NullPointerException when calling Max.max with partially null array");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    /**
     * Tests that Max.max throws NullPointerException when array contains duplicate items.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = createItemArrayWithTwoSameItems(0);
        try {
            Max.max(itemArray0, 560);
            fail("Expected NullPointerException when calling Max.max with duplicate items");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    /**
     * Tests that Max.max returns null when input array is empty or uninitialized.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Item[] itemArray0 = new Item[2];
        Item item0 = Max.max(itemArray0, 0);
        assertNull("Expected null result for empty or uninitialized item array", item0);
    }

    /**
     * Tests that Max class can be instantiated without error.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Max max0 = new Max();
        assertNotNull("Max instance should be created", max0);
    }
}