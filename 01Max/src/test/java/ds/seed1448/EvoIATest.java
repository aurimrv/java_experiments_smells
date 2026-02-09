package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class EvoIATest {

  @Test
  public void testMaxWithNullItems() {
    Item[] items = new Item[6];
    assertNull("Expected null when all items are null", Max.max(items, -2810));
  }

  @Test(expected = NullPointerException.class)
  public void testMaxWithSomeNullItems() {
    Item[] items = new Item[6];
    items[0] = new MeuItem(-2810);
    items[1] = new MeuItem(0);
    Max.max(items, 692);
  }

  @Test
  public void testMaxWithIdenticalItems() {
    Item[] items = new Item[6];
    MeuItem item = new MeuItem(-2810);
    items[0] = item;
    items[1] = item;
    assertNull("Expected null when max cannot be determined", Max.max(items, 692));
  }

  @Test
  public void testMaxInitialization() {
    Max max = new Max();
    assertNotNull("Max object should not be null", max);
  }
}
