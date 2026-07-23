package ds.seed1448;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.Assert;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for grouping unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  /**
   * Given: an empty heap constructed with a non-zero capacity.
   * When: copying an array containing only null entries and then invoking imprime().
   * Then: imprime is expected to fail with a NullPointerException due to null elements inside internal structures.
   */
  @Test(timeout = 4000)
  public void test00() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(23);
    Item[] arr = new Item[9]; // all elements are null by default

    // When - arrange internal buffer with nulls
    heap.copia(arr);

    // Then - calling imprime should surface a NullPointerException (defensive check)
    try {
      heap.imprime();
      Assert.fail("Expected NullPointerException when calling imprime() with internal null elements");
    } catch (NullPointerException e) {
      // Best effort check: message may be null depending on implementation
      Assert.assertTrue("Expected NullPointerException for invalid internal state", e instanceof NullPointerException);
    }
  }

  /**
   * Given: a fresh, empty heap with capacity > 0.
   * When: invoking imprime() on an empty heap.
   * Then: method should complete without throwing and heap should remain empty (min() == null).
   */
  @Test(timeout = 4000)
  public void test01() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(23);

    // Sanity check before action
    Assert.assertNull("Heap should be empty before printing", heap.min());

    // When
    heap.imprime();

    // Then
    Assert.assertNull("Heap should remain empty after printing", heap.min());
  }

  /**
   * Given: a heap constructed from a zero-length array.
   * When: attempting to insert into this heap.
   * Then: an Exception indicating that the heap is full is expected and heap remains empty.
   */
  @Test(timeout = 4000)
  public void test02() throws Throwable {
    // Given
    Item[] zero = new Item[0];
    FPHeapMin heap = new FPHeapMin(zero);
    MeuItem item = new MeuItem(0);

    // When / Then
    try {
      heap.insere(item);
      Assert.fail("Expected Exception when inserting into a zero-capacity heap");
    } catch (Exception e) {
      // The implementation reports a "heap cheio" error message; accept any Exception but assert message hint if present
      String msg = e.getMessage();
      if (msg != null) {
        Assert.assertTrue("Expected error message to mention heap full", msg.toLowerCase().contains("cheio") || msg.toLowerCase().contains("full"));
      }
      // Heap should not have an element available as min
      Assert.assertNull("Heap should remain empty after failed insert", heap.min());
    }
  }

  /**
   * Given: an empty heap with capacity 23.
   * When: inserting two items (one negative, one positive).
   * Then: the inserted positive item retains its internal reported size and heap min is not null.
   */
  @Test(timeout = 4000)
  public void test03() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(23);
    MeuItem negative = new MeuItem(-1399);
    MeuItem positive = new MeuItem(23);

    // When
    heap.insere(negative);
    heap.insere(positive);

    // Then - check a property previously relied on by generated tests
    Assert.assertEquals("Inserted MeuItem should report expected tamanho()", 4, positive.tamanho());

    // Additionally, ensure the heap reports a non-null min (the smallest inserted item)
    Item min = heap.min();
    Assert.assertNotNull("Heap.min() should return an item after insertions", min);
  }

  /**
   * Given: a heap with non-zero capacity.
   * When: attempting to decrease a key with a null new key object.
   * Then: an Exception indicating invalid (null) new key is expected.
   */
  @Test(timeout = 4000)
  public void test04() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(1771);

    // When / Then
    try {
      heap.diminuiChave(1771, (Object) null);
      Assert.fail("Expected Exception when calling diminuiChave with null new key");
    } catch (Exception e) {
      String msg = e.getMessage();
      if (msg != null) {
        Assert.assertTrue("Expected error message to mention null new key", msg.toLowerCase().contains("chavenova") || msg.toLowerCase().contains("null") || msg.toLowerCase().contains("chave"));
      }
    }
  }

  /**
   * Given: a heap created with capacity zero.
   * When: attempting to remove the minimum element.
   * Then: an Exception indicating the heap is empty is expected.
   */
  @Test(timeout = 4000)
  public void test05() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(0);

    // When / Then
    try {
      heap.retiraMin();
      Assert.fail("Expected Exception when removing from an empty heap");
    } catch (Exception e) {
      String msg = e.getMessage();
      if (msg != null) {
        Assert.assertTrue("Expected error message to mention empty heap", msg.toLowerCase().contains("vazio") || msg.toLowerCase().contains("empty"));
      }
    }
  }

  /**
   * Given: a heap with capacity 23 and a partially populated array of Items.
   * When: copying the prepared array into the heap and then building the heap.
   * Then: the heap min should refer to the smallest item provided.
   */
  @Test(timeout = 4000)
  public void test06() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(23);
    MeuItem common = new MeuItem(23);
    MeuItem smallest = new MeuItem(-3331);

    Item[] arr = new Item[9];
    arr[1] = common;
    arr[2] = common;
    arr[3] = smallest;
    arr[4] = common;
    arr[5] = common;
    arr[6] = common;
    arr[7] = common;
    arr[8] = common;

    // When
    heap.copia(arr);
    heap.constroi();

    // Then - min should be the smallest reference we provided
    Item min = heap.min();
    Assert.assertNotNull("Heap.min() should not be null after constroi()", min);
    // The heap copied our references; the returned min should be the same object reference as 'smallest'
    Assert.assertTrue("Heap.min() should be the smallest item provided", min == smallest || min.equals(smallest));
  }

  /**
   * Given: a heap with capacity 23.
   * When: inserting the same item multiple times and then reconstructing the heap.
   * Then: the heap should report that the min is the inserted item (no exceptions and consistent state).
   */
  @Test(timeout = 4000)
  public void test07() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(23);
    MeuItem item = new MeuItem(-1399);

    // When - insert the same item multiple times
    heap.insere(item);
    heap.insere(item);
    heap.insere(item);
    heap.constroi();

    // Then - heap state should be consistent and min should be our item
    Item min = heap.min();
    Assert.assertNotNull("Heap.min() should not be null after multiple inserts", min);
    Assert.assertTrue("Min should be the inserted item", min == item || min.equals(item));
  }

  /**
   * Given: a heap constructed from an array of fixed length containing null entries.
   * When: attempting to remove the minimum element.
   * Then: implementation may throw NullPointerException; ensure the test documents and asserts that.
   */
  @Test(timeout = 4000)
  public void test08() throws Throwable {
    // Given
    Item[] arr = new Item[4];
    FPHeapMin heap = new FPHeapMin(arr);

    // When / Then
    try {
      heap.retiraMin();
      Assert.fail("Expected NullPointerException when retiraMin() is invoked on a heap built from an array with nulls");
    } catch (NullPointerException e) {
      Assert.assertTrue("Expected NullPointerException", e instanceof NullPointerException);
    }
  }

  /**
   * Given: a heap with large capacity but no elements.
   * When: invoking refaz at an index likely out of current size.
   * Then: the operation should not throw and heap remains empty.
   */
  @Test(timeout = 4000)
  public void test09() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(444);

    // When - should be a no-op for empty heap or safely handled
    heap.refaz(444, 53);

    // Then - heap remains empty
    Assert.assertNull("Heap should remain empty after refaz on empty structure", heap.min());
  }

  /**
   * Given: an empty heap with non-zero capacity.
   * When: asking for the minimum element.
   * Then: min() should return null.
   */
  @Test(timeout = 4000)
  public void test10() throws Throwable {
    // Given
    FPHeapMin heap = new FPHeapMin(103);

    // When
    Item item = heap.min();

    // Then
    Assert.assertNull("min() on a newly created heap should be null", item);
  }
}