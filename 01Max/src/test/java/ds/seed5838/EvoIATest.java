package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithMixedItems() {
        MeuItem highValueItem = new MeuItem(2207);
        MeuItem lowValueItem = new MeuItem(-1454);
        Item[] items = {lowValueItem, lowValueItem, highValueItem};
        try {
            Max.max(items, 2269);
            fail("Expected NullPointerException due to uninitialized items in array");
        } catch (NullPointerException expected) {
            // Expected exception
        }
    }

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[9];
        Item result = Max.max(items, 1);
        assertNull("Expected null result for empty item array", result);
    }

    @Test
    public void testMaxInitialization() {
        Max max = new Max();
        assertNotNull("Max should be initialized", max);
    }
}