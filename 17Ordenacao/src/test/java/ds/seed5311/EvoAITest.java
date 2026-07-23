package ds.seed5311;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of unit tests.
 */
interface UnitTest {}

/**
 * Improved test suite for Ordenacao.
 *
 * Each test contains descriptive Given-When-Then comments, links to a hypothetical
 * requirement ID (REQ-ORD-001..REQ-ORD-009) for traceability, and more comprehensive
 * assertions than the initial auto-generated variants.
 *
 * NOTE: This class retains the original test method names (test0 .. test9) to satisfy
 * the requirement that method names must remain unchanged.
 */
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  // Helper: count non-null elements in array
  private static int countNonNull(Item[] arr) {
    int c = 0;
    if (arr == null) return 0;
    for (Item i : arr) if (i != null) c++;
    return c;
  }

  // Helper: check that non-null elements that are Comparable are in non-decreasing order
  private static boolean nonNullComparableNonDecreasing(Item[] arr) {
    Item prev = null;
    for (Item cur : arr) {
      if (cur == null) continue;
      if (prev != null) {
        if (prev instanceof Comparable && cur instanceof Comparable) {
          @SuppressWarnings("unchecked")
          Comparable<Object> cp = (Comparable<Object>) prev;
          try {
            int cmp = cp.compareTo(cur);
            if (cmp > 0) return false;
          } catch (ClassCastException ex) {
            // different comparable types; cannot compare — treat as unknown order, so skip
          }
        }
      }
      prev = cur;
    }
    return true;
  }

  /**
   * REQ-ORD-001: heapsort should handle zero-length arrays and throw for invalid n.
   *
   * Given: an array with some nulls and repeated references.
   * When: calling heapsort with a safe size (0) and an out-of-range size (1481).
   * Then: the safe call completes without exception and the out-of-range call throws ArrayIndexOutOfBoundsException;
   *       the number of non-null elements is preserved after each operation.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      // Populate: indices 1..5 share the same object instance (intentional test of stability/robustness)
      for (int i = 1; i < itemArray0.length; i++) {
        itemArray0[i] = meuItem0;
      }
      int beforeNonNull = countNonNull(itemArray0);

      // Safe call: n = 0 should be accepted and must not throw; array should keep the same number of non-null entries.
      try {
        Ordenacao.heapsort(itemArray0, 0);
      } catch (Throwable t) {
        fail("Heapsort with n=0 must not throw, but threw: " + t);
      }
      assertEquals("Heapsort with n=0 must not change number of non-null elements",
                   beforeNonNull, countNonNull(itemArray0));

      // Error case: n is far out of bounds -> expecting ArrayIndexOutOfBoundsException
      try {
        Ordenacao.heapsort(itemArray0, 1481);
        fail("Expected ArrayIndexOutOfBoundsException when calling heapsort with n far larger than array length");
      } catch (ArrayIndexOutOfBoundsException e) {
        // Expected; ensure array content was not silently corrupted (non-null count preserved)
        assertEquals("After out-of-range heapsort call, number of non-null elements should remain the same",
                     beforeNonNull, countNonNull(itemArray0));
      }
  }

  /**
   * REQ-ORD-002: heapsort must handle empty arrays gracefully even when n is negative.
   *
   * Given: an empty array.
   * When: calling heapsort with a negative n.
   * Then: no exception is thrown and array length remains zero.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[0];

      // Call with negative n must not throw and must leave array intact.
      try {
        Ordenacao.heapsort(itemArray0, -1775);
      } catch (Throwable t) {
        fail("Heapsort on empty array with negative n must not throw, but threw: " + t);
      }

      assertEquals("Empty array must remain of length 0 after heapsort call", 0, itemArray0.length);
      assertEquals("Empty array must contain zero non-null elements after heapsort call", 0, countNonNull(itemArray0));
  }

  /**
   * REQ-ORD-003: shellsort should surface problems when internal nulls exist.
   *
   * Given: a partially-initialized array containing nulls.
   * When: calling shellsort with n=5.
   * Then: implementation may throw NullPointerException; ensure the array is not partially lost on exception.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      MeuItem meuItem1 = new MeuItem(-997);
      itemArray0[3] = meuItem1;
      itemArray0[5] = meuItem0;

      int beforeNonNull = countNonNull(itemArray0);

      try {
        Ordenacao.shellsort(itemArray0, 5);
        // Shellsort might succeed; if so, validate ordering for comparable elements
        assertTrue("After shellsort, comparable non-null elements should be in non-decreasing order",
                   nonNullComparableNonDecreasing(itemArray0));
      } catch (NullPointerException e) {
        // This is an acceptable failure mode if implementation assumes contiguous data.
        assertEquals("Non-null element count must not change after NullPointerException during shellsort",
                     beforeNonNull, countNonNull(itemArray0));
      }
  }

  /**
   * REQ-ORD-004: shellsort must handle empty arrays and negative n gracefully.
   *
   * Given: an empty array.
   * When: shellsort is invoked with a negative n.
   * Then: no exception and array remains empty.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Item[] itemArray0 = new Item[0];

      try {
        Ordenacao.shellsort(itemArray0, -1775);
      } catch (Throwable t) {
        fail("Shellsort on empty array with negative n must not throw, but threw: " + t);
      }

      assertEquals("Array length must remain zero after shellsort", 0, itemArray0.length);
      assertEquals("Empty array must contain zero non-null elements after shellsort", 0, countNonNull(itemArray0));
  }

  /**
   * REQ-ORD-005: insercao (insertion sort) should throw on malformed arrays with internal nulls, or else complete correctly.
   *
   * Given: an array with some null entries.
   * When: insercao is invoked for n equal to the array length.
   * Then: either insertion sort completes with a valid ordering or it throws NullPointerException; in the latter case
   *       the number of non-null elements must be preserved.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(3258);
      itemArray0[1] = meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[2] = meuItem1;

      int beforeNonNull = countNonNull(itemArray0);

      try {
        Ordenacao.insercao(itemArray0, 4);
        // If completed, comparable items should be in non-decreasing order
        assertTrue("After insercao, comparable non-null elements should be non-decreasing",
                   nonNullComparableNonDecreasing(itemArray0));
      } catch (NullPointerException e) {
        // Acceptable: ensure we didn't lose elements
        assertEquals("Number of non-null elements must remain after NullPointerException in insercao",
                     beforeNonNull, countNonNull(itemArray0));
      }
  }

  /**
   * REQ-ORD-006: insercao should be tolerant to negative n values (treat as no-op).
   *
   * Given: an array with length 1 (initially null element).
   * When: insercao is called with a negative n.
   * Then: method should not throw and array length must remain 1 with contents unchanged.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      int beforeNonNull = countNonNull(itemArray0);

      try {
        Ordenacao.insercao(itemArray0, -289);
      } catch (Throwable t) {
        fail("insercao with negative n should not throw on a single-element array, but threw: " + t);
      }

      assertEquals("Array length must remain 1 after insercao with negative n", 1, itemArray0.length);
      assertEquals("Non-null count must remain unchanged after insercao with negative n",
                   beforeNonNull, countNonNull(itemArray0));
  }

  /**
   * REQ-ORD-007: selecao (selection sort) should correctly process arrays with repeated references.
   *
   * Given: an array with repeated item references.
   * When: selecao is run with n smaller than the array length.
   * Then: method must not throw and array must still contain the same number of non-null elements,
   *       and comparable elements should be in non-decreasing order if comparable.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(738);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[3] = meuItem1;

      int beforeNonNull = countNonNull(itemArray0);

      try {
        Ordenacao.selecao(itemArray0, 3);
      } catch (Throwable t) {
        fail("selecao should not throw for this input, but threw: " + t);
      }

      assertEquals("selecao must preserve array length", 6, itemArray0.length);
      assertEquals("selecao must preserve count of non-null elements", beforeNonNull, countNonNull(itemArray0));
      assertTrue("After selecao, comparable non-null elements should be non-decreasing",
                 nonNullComparableNonDecreasing(itemArray0));
  }

  /**
   * REQ-ORD-008: quicksort should operate without throwing on arrays with mixed repeated references.
   *
   * Given: an array containing repeated references.
   * When: quicksort is invoked with n smaller than array length.
   * Then: quicksort must not throw and comparable elements should be in non-decreasing order.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = meuItem0;
      MeuItem meuItem1 = new MeuItem(4);
      itemArray0[2] = meuItem1;
      itemArray0[3] = meuItem0;
      itemArray0[4] = meuItem1;

      int beforeNonNull = countNonNull(itemArray0);

      try {
        Ordenacao.quicksort(itemArray0, 4);
      } catch (Throwable t) {
        fail("quicksort must not throw for this configuration, but threw: " + t);
      }

      assertEquals("quicksort must preserve array length", 6, itemArray0.length);
      assertEquals("quicksort must preserve non-null count", beforeNonNull, countNonNull(itemArray0));
      assertTrue("After quicksort, comparable non-null elements should be non-decreasing",
                 nonNullComparableNonDecreasing(itemArray0));
  }

  /**
   * REQ-ORD-009: quicksort must be tolerant of mixed values and should finish without exception.
   *
   * Given: an array with some repeated references and a distinct element.
   * When: quicksort is invoked.
   * Then: method completes and comparable non-null elements are in non-decreasing order.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      MeuItem meuItem1 = new MeuItem(29);
      itemArray0[3] = meuItem1;
      itemArray0[4] = meuItem0;

      int beforeNonNull = countNonNull(itemArray0);

      try {
        Ordenacao.quicksort(itemArray0, 4);
      } catch (Throwable t) {
        fail("quicksort must not throw for this input, but threw: " + t);
      }

      assertEquals("quicksort must preserve array length", 6, itemArray0.length);
      assertEquals("quicksort must preserve non-null count", beforeNonNull, countNonNull(itemArray0));
      assertTrue("After quicksort, comparable non-null elements should be non-decreasing",
                 nonNullComparableNonDecreasing(itemArray0));
  }

  /**
   * Basic construction test to ensure Ordenacao class can be instantiated.
   *
   * Given: no preconditions.
   * When: constructing an Ordenacao instance.
   * Then: the resulting object must not be null.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
      assertNotNull("Construction of Ordenacao must produce a non-null instance", ordenacao0);
  }
}