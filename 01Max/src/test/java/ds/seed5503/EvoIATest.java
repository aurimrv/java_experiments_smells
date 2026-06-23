package ds.seed5503;

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

    private Item[] createItemArrayWithMeuItems(int val1, int val2) {
        Item[] items = new Item[6];
        items[0] = new MeuItem(val1);
        items[1] = new MeuItem(val2);
        return items;
    }

    private Item[] createItemArrayWithRepeatedMeuItem(int val) {
        Item[] items = new Item[6];
        MeuItem meuItem = new MeuItem(val);
        items[0] = meuItem;
        items[1] = meuItem;
        return items;
    }

    /**
     * Test that Max.max throws NullPointerException when array contains null elements
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItems(-728, -333);
        try {
            Max.max(itemArray0, 390);
            fail("Expected NullPointerException due to null elements in array");
        } catch (NullPointerException e) {
            assertNotNull("Exception should have been thrown", e);
        }
    }

    /**
     * Verify NullPointerException is thrown when array contains duplicate MeuItem references
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = createItemArrayWithRepeatedMeuItem(-728);
        try {
            Max.max(itemArray0, 390);
            fail("Expected NullPointerException due to null elements in array");
        } catch (NullPointerException e) {
            assertNotNull("Exception should be thrown", e);
        }
    }

    /**
     * Test that Max.max returns null when input array contains only null elements
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Item[] itemArray0 = new Item[8];
        Item item0 = Max.max(itemArray0, 0);
        assertNull("Max.max should return null for array with null elements", item0);
    }

    /**
     * Test that Max object can be instantiated without error
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Max max0 = new Max();
        assertNotNull("Max instance should be created", max0);
    }
}