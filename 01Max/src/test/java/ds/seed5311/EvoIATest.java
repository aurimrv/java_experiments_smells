package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[6];
        Item result = Max.max(items, 0);
        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testMaxWithException() {
        Item[] items = new Item[7];
        MeuItem item1 = new MeuItem(1323);
        items[0] = item1;
        items[1] = item1;
        MeuItem item2 = new MeuItem(3780);
        items[2] = item2;
        Max.max(items, 1323);
    }

    @Test
    public void testMaxInstance() {
        Max max = new Max();
        assertNotNull(max);
    }
}