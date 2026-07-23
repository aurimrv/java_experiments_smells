package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.testdata.EvoSuiteFile;

/**
 * Marker interface for categorizing tests as unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  /**
   * REQ-HEAP-001: Verify behavior when printing an under-initialized heap.
   * Given an array-based heap initialized with null elements,
   * when imprime() is invoked, a NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Given: an array-based heap with explicit null elements
      Item[] itemArray0 = new Item[2];
      assertEquals("Array length should be 2", 2, itemArray0.length);
      assertNull("Elements should be null initially", itemArray0[0]);
      assertNull("Elements should be null initially", itemArray0[1]);

      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When / Then: printing such a heap should result in a NullPointerException
      try {
          fPHeapMin0.imprime();
          fail("Expected NullPointerException when printing heap with null elements");
      } catch (NullPointerException e) {
          // Expected: assert exception was thrown
          assertNull("Expected no message on NullPointerException", e.getMessage());
      }
  }

  /**
   * REQ-HEAP-002: Constructing a large empty heap should report no minimum element.
   * Given a heap created with an explicit capacity,
   * when inspected, min() should be null and imprime() should complete.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Given: an empty heap with a large capacity
      final int capacity = 2304;
      FPHeapMin fPHeapMin0 = new FPHeapMin(capacity);

      // Then: min should be null for an empty heap
      assertNull("Empty heap should report null minimum", fPHeapMin0.min());

      // When: request a textual representation (should not throw)
      fPHeapMin0.imprime();

      // And: after calling constroi on an empty, capacity-based heap, still empty
      fPHeapMin0.constroi();
      assertNull("After constroi, empty heap should still have null minimum", fPHeapMin0.min());
  }

  /**
   * REQ-HEAP-003: Inserting a null item into a heap constructed from an array should raise an error.
   * Given a heap backed by an array with a null slot,
   * when attempting to insert the null element, an Exception is expected.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Given: an array-based heap with one null entry
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // Sanity: the slot is null
      assertNull("Precondition: array slot is null", itemArray0[1]);

      // When / Then: attempting to insert the null element should raise an Exception
      try {
          fPHeapMin0.insere(itemArray0[1]);
          fail("Expected Exception when inserting a null item into the heap");
      } catch (Exception e) {
          // Expected: ensure heap remains in a consistent empty state
          assertNull("Heap min should remain null after failed insert", fPHeapMin0.min());
      }
  }

  /**
   * REQ-HEAP-004: Inserting two distinct items should maintain heap order and distinct identities.
   * Given two different items inserted into a min-heap,
   * when queried, the smaller item should be the minimum and the two items remain unequal.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Given: a capacity-based heap and two distinct MeuItem instances
      FPHeapMin fPHeapMin0 = new FPHeapMin(760);
      MeuItem meuItem0 = new MeuItem(760);
      MeuItem meuItem1 = new MeuItem(2563);

      // When: insert the first (smaller) item
      fPHeapMin0.insere(meuItem0);

      // Then: min should be the first item
      Item currentMin = fPHeapMin0.min();
      assertSame("Minimum should be the first inserted item", meuItem0, currentMin);

      // When: insert the second (larger) item
      fPHeapMin0.insere(meuItem1);

      // Then: items should not be considered equal and min should remain the smaller
      assertFalse("Inserted items should not be equal", meuItem1.equals((Object)meuItem0));
      assertSame("Minimum should still be the smaller item after second insert", meuItem0, fPHeapMin0.min());

      // And: retiraMin should remove and return the smallest item
      Item removed = fPHeapMin0.retiraMin();
      assertSame("retiraMin should return the previously smallest item", meuItem0, removed);
  }

  /**
   * REQ-HEAP-005: Inserting the same reference twice should be allowed and internal counters update.
   * Given a heap and the same MeuItem inserted twice,
   * when inspected the item should reflect its internal state change (tamanho).
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Given: a heap and a single MeuItem reference
      FPHeapMin fPHeapMin0 = new FPHeapMin(760);
      MeuItem meuItem0 = new MeuItem(760);

      // When: insert the same instance twice
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.insere(meuItem0);

      // Then: tamanho should reflect expected internal behavior (as observed previously)
      assertEquals("MeuItem.tamanho() should match expected value after two inserts", 4, meuItem0.tamanho());

      // And: min should be the same instance reference
      assertSame("Minimum should be the inserted instance", meuItem0, fPHeapMin0.min());
  }

  /**
   * REQ-HEAP-006: Decreasing a key with a null new value must be rejected.
   * Given an empty capacity-based heap,
   * when diminuiChave is invoked with a null new key, an Exception is expected.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Given: a capacity-based heap
      FPHeapMin fPHeapMin0 = new FPHeapMin(2304);

      // When / Then: diminish key with null must raise an Exception
      try {
          fPHeapMin0.diminuiChave(2304, (Object) null);
          fail("Expected Exception when calling diminuiChave with null new key");
      } catch (Exception e) {
          // Expected: heap remains unchanged (still empty)
          assertNull("Heap min should remain null after failed diminuiChave", fPHeapMin0.min());
      }
  }

  /**
   * REQ-HEAP-007: Removing minimum from an improperly sized heap should raise an error.
   * Given a heap constructed with negative capacity,
   * when retiraMin is invoked, an Exception is expected.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Given: a heap constructed with a negative size (edge case)
      FPHeapMin fPHeapMin0 = new FPHeapMin((-1));

      // When / Then: retiraMin should throw an Exception (heap invalid or empty)
      try {
          fPHeapMin0.retiraMin();
          fail("Expected Exception when calling retiraMin on a negatively-sized heap");
      } catch (Exception e) {
          // Expected: ensure min() is safely handled (may be null)
          assertNull("After exception, heap min should be null or undefined", fPHeapMin0.min());
      }
  }

  /**
   * REQ-HEAP-008: Building a heap from an array containing nulls can trigger NullPointerException.
   * Given an array-based heap with null entries,
   * when constroi() is invoked, a NullPointerException may occur.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Given: an array with nulls used to construct a heap
      Item[] itemArray0 = new Item[6];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // Precondition checks
      assertEquals("Array length should be 6", 6, itemArray0.length);
      for (int i = 0; i < itemArray0.length; i++) {
          assertNull("Array slot should be null at start", itemArray0[i]);
      }

      // When / Then: constructing may throw NullPointerException
      try {
          fPHeapMin0.constroi();
          fail("Expected NullPointerException when constroi on array with null elements");
      } catch (NullPointerException e) {
          // Expected
          assertNull("Expected no message on NullPointerException", e.getMessage());
      }
  }

  /**
   * REQ-HEAP-009: constroi on a capacity-based small heap should succeed and allow insert/remove.
   * Given a small capacity heap,
   * when constroi is invoked and items are inserted, min and retiraMin behave as expected.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given: a small capacity heap
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);

      // When: build internal structures
      fPHeapMin0.constroi();

      // Then: heap should be empty
      assertNull("Empty heap should have no minimum after constroi", fPHeapMin0.min());

      // When: insert an item and check behavior
      MeuItem m = new MeuItem(1);
      fPHeapMin0.insere(m);
      assertSame("min() should return the inserted item", m, fPHeapMin0.min());

      // And: retiraMin should return the same item
      Item removed = fPHeapMin0.retiraMin();
      assertSame("retiraMin should return the inserted item", m, removed);
  }

  /**
   * REQ-HEAP-010: refaz on a trivial single-element array should not crash and should maintain the minimum.
   * Given a single-element array heap,
   * when refaz is invoked for index 0, the heap should remain consistent.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Given: a single-element array with a negative-key item
      Item[] itemArray0 = new Item[1];
      MeuItem meuItem0 = new MeuItem((-852));
      itemArray0[0] = (Item) meuItem0;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When: reheapify the only element
      fPHeapMin0.refaz(0, 0);

      // Then: the heap's min should be that same item
      assertSame("After refaz, the min should be the single array element", meuItem0, fPHeapMin0.min());
  }

  /**
   * REQ-HEAP-011: refaz called with an out-of-range second parameter should raise ArrayIndexOutOfBoundsException.
   * Given an array-backed heap with a few initialized slots,
   * when refaz is invoked with an excessively large index, an AIOOBE is expected.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Given: an array with some initialized items
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(2591);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1);
      itemArray0[3] = (Item) meuItem1;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // Sanity: ensure at least one non-null element exists
      assertNotNull("Precondition: slot 1 should be initialized", itemArray0[1]);

      // When / Then: calling refaz with a very large second index should throw ArrayIndexOutOfBoundsException
      try {
          fPHeapMin0.refaz(1, 2591);
          fail("Expected ArrayIndexOutOfBoundsException due to out-of-range index");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Expected
          assertNull("Expected no message on ArrayIndexOutOfBoundsException", e.getMessage());
      }
  }

  /**
   * REQ-HEAP-012: copia followed by retiraMin on a partially populated array-backed heap may raise NullPointerException.
   * Given an array with some null elements copied into a heap,
   * when retiraMin is invoked, a NullPointerException might occur.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Given: an array with two positions filled and the rest null
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(4);
      MeuItem meuItem1 = new MeuItem((-345));
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      FPHeapMin fPHeapMin0 = new FPHeapMin(258);

      // When: copy the partially populated array into the heap
      fPHeapMin0.copia(itemArray0);

      // Then: attempting to remove the minimum may throw NullPointerException due to null slots
      try {
          fPHeapMin0.retiraMin();
          fail("Expected NullPointerException when removing min from partially populated copied heap");
      } catch (NullPointerException e) {
          // Expected
          assertNull("Expected no message on NullPointerException", e.getMessage());
      }
  }

  /**
   * REQ-HEAP-013: A partially filled array-backed heap with two identical references may produce a NullPointerException on remove.
   * This test documents the previously observed behavior.
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Given: an array-backed heap with two identical elements at positions 2 and 3
      Item[] itemArray0 = new Item[6];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      MeuItem meuItem0 = new MeuItem(2632);
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;

      // When / Then: retiraMin may trigger a NullPointerException due to internal assumptions
      try {
          fPHeapMin0.retiraMin();
          fail("Expected NullPointerException when retiraMin is called on partially populated array-based heap");
      } catch (NullPointerException e) {
          // Expected
          assertNull("Expected no message on NullPointerException", e.getMessage());
      }
  }

  /**
   * REQ-HEAP-014: retiraMin on a heap constructed from an empty array should return null.
   * Given an array-backed heap that has no elements,
   * when retiraMin is invoked, null should be returned.
   */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Given: an empty array-backed heap of length 2 (all nulls)
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When: remove minimum from an empty-initialized heap
      Item item0 = fPHeapMin0.retiraMin();

      // Then: result should be null
      assertNull("retiraMin should return null for an empty-initialized array-backed heap", item0);

      // And: min() should also be null
      assertNull("min() should be null for an empty-initialized array-backed heap", fPHeapMin0.min());
  }

  /**
   * REQ-HEAP-015: min() on an empty capacity-based heap should return null.
   * Given an empty heap with a small capacity,
   * when min() is invoked, it should return null.
   */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Given: an empty heap with capacity 8
      FPHeapMin fPHeapMin0 = new FPHeapMin(8);

      // When / Then: min should be null and no exceptions should be thrown
      Item item0 = fPHeapMin0.min();
      assertNull("min() must return null for an empty capacity-based heap", item0);

      // Additional check: retiraMin should throw or return null depending on implementation - we check only min here
      assertNull("min() remains null on subsequent call", fPHeapMin0.min());
  }
}