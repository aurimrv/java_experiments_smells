package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[2];
        Item result = Max.max(items, -2156);
        assertNull("Expected null when max is called with null items", result);
    }

    @Test(expected = NullPointerException.class)
    public void testMaxWithInvalidIndex() {
        Item[] items = new Item[9];
        items[0] = new MeuItem(-2556);
        items[1] = new MeuItem(-2556);
        items[2] = new MeuItem(1);
        Max.max(items, 2570);
    }

    @Test
    public void testMaxInitialization() {
        Max max = new Max();
        assertNotNull("Max object should not be null", max);
    }
}