package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[6];
        items[0] = new MeuItem(-728);
        items[1] = new MeuItem(-333);
        assertThrows(NullPointerException.class, () -> Max.max(items, 390));
    }

    @Test
    public void testMaxWithSameItems() {
        Item[] items = new Item[6];
        MeuItem item = new MeuItem(-728);
        items[0] = item;
        items[1] = item;
        assertThrows(NullPointerException.class, () -> Max.max(items, 390));
    }

    @Test
    public void testMaxWithEmptyArray() {
        Item[] items = new Item[8];
        Item result = Max.max(items, 0);
        assertNull(result);
    }

    @Test
    public void testMaxConstructor() {
        Max max = new Max();
        assertNotNull(max);
    }
}