package ds.seed5831;

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

    private Item[] createItemArrayWithMeuItems() {
        Item[] items = new Item[9];
        MeuItem meuItem0 = new MeuItem(1499);
        for (int i = 0; i < 7; i++) {
            items[i] = meuItem0;
        }
        items[7] = new MeuItem(3084);
        return items;
    }

    /**
     * Test that Max.max throws NullPointerException when array contains null elements
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Item[] itemArray0 = createItemArrayWithMeuItems();
        try {
            Max.max(itemArray0, 2170);
            fail("Expected NullPointerException when calling Max.max with partially null array");
        } catch (NullPointerException e) {
            assertNotNull("Exception should have been thrown", e);
        }
    }

    /**
     * Test that Max.max returns null when called with an empty array and negative integer
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = new Item[5];
        Item item0 = Max.max(itemArray0, (-1559));
        assertNull("Max.max should return null for empty array input", item0);
    }

    /**
     * Test that a Max instance can be created successfully
     */
}