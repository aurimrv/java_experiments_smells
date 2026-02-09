package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[2];
        Item result = Max.max(items, 0);
        assertNull("Expected null when max is called with null items", result);
    }

    @Test(expected = NullPointerException.class)
    public void testMaxWithUninitializedItems() {
        Item[] items = new Item[9];
        items[0] = new MeuItem(0);
        items[1] = new MeuItem(560);
        Max.max(items, 560);
    }

    @Test
    public void testMaxWithDuplicateItems() {
        Item[] items = new Item[9];
        MeuItem item = new MeuItem(0);
        items[0] = item;
        items[1] = item;
        Max.max(items, 560);
    }

    @Test
    public void testMaxInitialization() {
        Max max = new Max();
    }
}