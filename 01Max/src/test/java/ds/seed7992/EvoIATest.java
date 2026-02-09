package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullItems() {
        Item[] items = new Item[5];
        Item result = Max.max(items, 0);
        assertNull("Expected null when max is called with null items", result);
    }

    @Test(expected = NullPointerException.class)
    public void testMaxWithInvalidItems() {
        MeuItem item1 = new MeuItem(497);
        MeuItem item2 = new MeuItem(497);
        item1.chave = 0;
        Item[] items = {item1, item2, new MeuItem(497)};
        Max.max(items, 497);
    }

    @Test
    public void testMaxInitialization() {
        Max max = new Max();
        assertNotNull("Max object should be initialized", max);
    }
}
