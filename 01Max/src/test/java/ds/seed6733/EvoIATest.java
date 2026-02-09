package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullArray() {
        assertNull("Expected null when array is empty", Max.max(null, 0));
    }

    @Test
    public void testMaxWithEmptyArray() {
        assertNull("Expected null when array is empty", Max.max(new Item[0], 0));
    }

    @Test
    public void testMaxWithValidArray() {
        Item[] items = {new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        assertEquals("Expected max to be the last item", items[2], Max.max(items, 2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMaxWithInvalidIndex() {
        Item[] items = {new MeuItem(1)};
        Max.max(items, -1);
    }

    @Test
    public void testMaxBoundary() {
        Item[] items = {new MeuItem(Integer.MIN_VALUE), new MeuItem(Integer.MAX_VALUE)};
        assertEquals("Expected max to be Integer.MAX_VALUE", items[1], Max.max(items, 1));
    }
}