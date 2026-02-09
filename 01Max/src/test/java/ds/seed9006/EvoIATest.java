package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[7];
        assertNull("Expected null when all items are null", Max.max(items, -1));
    }

    @Test
    public void testMaxWithMixedItems() {
        Item[] items = new Item[7];
        items[0] = new MeuItem(-1);
        items[1] = new MeuItem(-1);
        items[2] = new MeuItem(-1);
        items[3] = new MeuItem(2867);
        try {
            Max.max(items, 3649);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // Expected exception
        }
    }

    @Test
    public void testMaxConstructor() {
        Max max = new Max();
        assertNotNull("Max constructor should create a non-null object", max);
    }
}
