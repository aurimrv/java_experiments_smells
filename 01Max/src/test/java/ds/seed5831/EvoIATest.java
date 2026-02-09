package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

    @Test
    public void testMaxWithNullArray() {
        assertNull("Max should return null for empty array", Max.max(new Item[0], 0));
    }

    @Test
    public void testMaxWithValidArray() {
        Item[] items = {new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        Item expected = items[2];
        assertEquals("Max should return the highest item", expected, Max.max(items, 2));
    }

    @Test(expected = NullPointerException.class)
    public void testMaxWithNullItem() {
        Item[] items = new Item[3];
        Max.max(items, 2);
    }

    @Test
    public void testMaxBoundary() {
        Item[] items = {new MeuItem(-1), new MeuItem(0), new MeuItem(1)};
        Item expected = items[2];
        assertEquals("Max should handle boundary values correctly", expected, Max.max(items, 2));
    }
}