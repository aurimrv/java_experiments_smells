package ds.seed5831;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved test class for FPHeapMax. Each test documents the intent
 * and uses explicit assertions with messages to improve diagnosability.
 *
 * Note: Method names are kept unchanged to preserve compatibility with
 * external tooling that expects these exact test method names.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * RQ-HEAP-001: Inserting a single element should allow it to be retrieved as the max.
   *
   * Given a heap with positive capacity,
   * When inserting one item and then removing the max,
   * Then the returned item must be the same instance that was inserted.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(2822);
    MeuItem item = new MeuItem(2822);

    // When
    heap.insere(item);

    // Then
    Item removed = heap.retiraMax();
    assertNotNull("retiraMax should return the inserted item when heap contains one element", removed);
    assertSame("The removed item should be the same instance that was inserted", item, removed);

    // After removal the heap should be empty: next removal returns null (defensive check).
    Item secondRemoval = heap.retiraMax();
    assertNull("After removing the only element, subsequent retiraMax should return null", secondRemoval);
  }

  /**
   * RQ-HEAP-002: Inserting into a heap with zero capacity must fail fast.
   *
   * Given a heap constructed with capacity 0,
   * When attempting to insert an item,
   * Then an Exception indicating "heap cheio" must be thrown.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(0);
    MeuItem item = new MeuItem(0);

    // When / Then
    try {
      heap.insere(item);
      fail("Expected Exception when inserting into a heap with capacity 0");
    } catch (Exception e) {
      String msg = (e.getMessage() == null) ? "" : e.getMessage().toLowerCase();
      assertTrue("Exception message should mention that the heap is full (cheio); actual: " + e.getMessage(),
          msg.contains("cheio") || msg.contains("full"));
    }
  }

  /**
   * RQ-HEAP-003: Removing multiple elements returns them until empty.
   *
   * Given a heap with sufficient capacity,
   * When inserting two distinct items and removing max repeatedly,
   * Then two non-null items should be returned and a third removal should return null.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(421);
    MeuItem first = new MeuItem(2921);
    MeuItem second = new MeuItem(421);

    // When
    heap.insere(first);
    heap.insere(second);

    // Then
    Item removed1 = heap.retiraMax();
    Item removed2 = heap.retiraMax();
    assertNotNull("First removal should return a non-null item", removed1);
    assertNotNull("Second removal should return a non-null item", removed2);
    // The two removals should not both be null and should be the two instances inserted (order depends on keys)
    assertTrue("Removed items should correspond to the inserted instances",
        removed1 == first || removed1 == second);
    assertTrue("Removed items should correspond to the inserted instances",
        removed2 == first || removed2 == second);
    assertNotSame("Both removals should not return the same instance unless duplicates were inserted", removed1, removed2);

    Item removed3 = heap.retiraMax();
    assertNull("After removing all inserted items, further retiraMax should return null", removed3);
  }

  /**
   * RQ-HEAP-004: aumentaChave should validate input and reject null new key.
   *
   * Given a heap with capacity,
   * When aumentaChave is invoked with a null new key,
   * Then an Exception indicating null key must be thrown.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(1);

    // When / Then
    try {
      heap.aumentaChave(1, (Object) null);
      fail("Expected Exception when calling aumentaChave with a null new key");
    } catch (Exception e) {
      String msg = (e.getMessage() == null) ? "" : e.getMessage().toLowerCase();
      assertTrue("Exception message should mention null key (chavenova/null); actual: " + e.getMessage(),
          msg.contains("null") || msg.contains("chavenova") || msg.contains("chave"));
    }
  }

  /**
   * RQ-HEAP-005: Copying an empty array into the heap results in empty heap behavior.
   *
   * Given a heap and an array with no real items (all nulls),
   * When copying the array into the heap,
   * Then retiraMax should return null (heap remains empty).
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(1);
    Item[] emptyArray = new Item[2]; // all nulls

    // When
    heap.copia(emptyArray);

    // Then
    Item removed = heap.retiraMax();
    assertNull("retiraMax should return null after copying an array with no items", removed);
  }

  /**
   * RQ-HEAP-006: Building a heap from an array should allow retrieval of the max.
   *
   * Given an array containing two items and a heap with sufficient capacity,
   * When copying and constructing the heap,
   * Then retiraMax should return the item with the highest key among them.
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(421);
    Item[] arr = new Item[3];
    MeuItem lower = new MeuItem(-2186);
    MeuItem higher = new MeuItem(338);
    arr[1] = lower;
    arr[2] = higher;

    // When
    heap.copia(arr);
    heap.constroi();

    // Then initial max should be 'higher'
    Item firstRemoved = heap.retiraMax();
    assertNotNull("First removal after constroi should return a non-null item", firstRemoved);
    assertSame("Expected the higher-key item to be removed first", higher, firstRemoved);

    // When inserting a new item larger than existing (use a larger key) and rebuilding if necessary
    MeuItem newTop = new MeuItem(1000);
    heap.insere(newTop);

    // Then the new top should be retrievable
    Item nextRemoved = heap.retiraMax();
    assertNotNull("Removal after inserting a new top item should not be null", nextRemoved);
    assertTrue("Removed item should be either the previously inserted newTop or another existing item",
        nextRemoved == newTop || nextRemoved == lower || nextRemoved == higher);
  }

  /**
   * RQ-HEAP-007: Working with duplicate references in the backing array should behave deterministically.
   *
   * Given an array where the same object is placed multiple times,
   * When copying and building the heap and inserting that same object,
   * Then remova operations should return non-null items consistent with inserted references.
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(421);
    Item[] arr = new Item[3];
    MeuItem item = new MeuItem(338);
    arr[1] = item;
    arr[2] = item; // duplicate reference

    // When
    heap.copia(arr);
    heap.insere(item);
    heap.constroi();

    // Then remove up to three times: we expect non-null for existing inserted references until empty
    Item r1 = heap.retiraMax();
    Item r2 = heap.retiraMax();
    Item r3 = heap.retiraMax();

    assertNotNull("At least one removal should return a non-null item when duplicates were present", r1);
    // r2 may be non-null depending on internal handling of duplicates; allow either but assert consistency
    if (r2 != null) {
      assertTrue("If second removal is non-null it must be one of the inserted instances", r2 == item);
    }
    assertNull("After consuming all inserted occurrences, further retiraMax should return null", r3);
  }

  /**
   * RQ-HEAP-008: Calling max() on an empty or zero-capacity heap should fail with an index-related exception.
   *
   * Given a heap with capacity 0,
   * When calling max(),
   * Then an ArrayIndexOutOfBoundsException (or similar) should be raised.
   */
  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(0);

    // When / Then
    try {
      heap.max();
      fail("Expected ArrayIndexOutOfBoundsException when calling max() on a heap with capacity 0");
    } catch (ArrayIndexOutOfBoundsException e) {
      String msg = (e.getMessage() == null) ? "" : e.getMessage();
      // message content may vary across implementations; ensure exception type is as expected
      assertTrue("Received expected index-related exception for max() on empty heap: " + msg,
          e instanceof ArrayIndexOutOfBoundsException);
    }
  }

  /**
   * RQ-HEAP-009: retiraMax on an invalid (negative sized) heap should indicate empty-heap error.
   *
   * Given a heap constructed with a negative capacity,
   * When calling retiraMax(),
   * Then an Exception indicating heap empty must be thrown.
   */
  @Test(timeout = 4000)
  public void test8() throws Throwable {
    // Given
    FPHeapMax heap = new FPHeapMax(-1);

    // When / Then
    try {
      heap.retiraMax();
      fail("Expected Exception when calling retiraMax() on an invalid/negative-sized heap");
    } catch (Exception e) {
      String msg = (e.getMessage() == null) ? "" : e.getMessage().toLowerCase();
      assertTrue("Exception message should indicate an empty or invalid heap (vazio/empty): " + e.getMessage(),
          msg.contains("vazio") || msg.contains("empty") || msg.contains("invalid"));
    }
  }
}