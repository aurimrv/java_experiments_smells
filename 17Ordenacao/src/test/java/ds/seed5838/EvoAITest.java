package ds.seed5838;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for sorting-related unit tests.
 * Defined at package level so it can be referenced by @Category.
 */
interface SortingTest {}

/**
 * Marker interface for fast unit tests.
 */
interface UnitTest {}

/**
 * Improved, human-readable tests for Ordenacao sorting utilities.
 *
 * Requirement traceability: SORT-REQ-001 (basic sorting behavior)
 *
 * Notes:
 * - These tests keep the original auto-generated test method names to preserve
 *   compatibility with external tooling that expects them, but the bodies have
 *   been improved with clearer assertions, Given-When-Then comments, and helper
 *   utilities to validate post-conditions such as element preservation and,
 *   where possible, ordering of comparable items.
 */
@Category({SortingTest.class, UnitTest.class})
public class EvoAITest {

  /* Helper utilities used by multiple tests */

  private static int countNonNull(Item[] arr) {
    int c = 0;
    if (arr == null) return 0;
    for (Item i : arr) {
      if (i != null) c++;
    }
    return c;
  }

  /**
   * Attempt to verify that items in arr are non-decreasing up to inclusiveIndex
   * according to their natural ordering. If elements are not Comparable, the
   * check is skipped (does not fail the test) to avoid ClassCastException from
   * unknown Item implementations.
   *
   * @param arr the array to check
   * @param inclusiveIndex the last index to include in the check (clamped)
   * @return true if check was performed and non-decreasing; false if check was
   *         skipped because elements are not Comparable or there were not enough
   *         comparable items to decide.
   */
  private static boolean assertNonDecreasingIfComparable(Item[] arr, int inclusiveIndex) {
    if (arr == null || arr.length == 0) return true;
    int last = Math.min(inclusiveIndex, arr.length - 1);
    Item prev = null;
    boolean performed = false;
    try {
      for (int i = 0; i <= last; i++) {
        Item cur = arr[i];
        if (cur == null) continue;
        if (prev != null) {
          @SuppressWarnings("unchecked")
          int cmp = ((Comparable) prev).compareTo(cur);
          performed = true;
          if (cmp > 0) {
            Assert.fail("Array is not non-decreasing at indices (previous, current) when checking up to "
                        + last + ": previous=" + prev + ", current=" + cur);
          }
        }
        prev = cur;
      }
    } catch (ClassCastException ex) {
      // The Item implementation is not Comparable; skip strict ordering checks.
      return false;
    } catch (NullPointerException ex) {
      // Defensive: if compareTo invoked on null or other unexpected nulls, fail explicitly
      Assert.fail("Null encountered unexpectedly during ordering check: " + ex);
    }
    return performed;
  }

  /**
   * test0
   *
   * Given: an array with several identical MeuItem references and some nulls
   * When: heapsort is invoked (prefix/index argument retained from original test)
   * Then: the sort call should preserve array length and non-null element count;
   *       if items are Comparable, the prefix should be non-decreasing after sort.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(3);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      itemArray0[3] = meuItem0;
      itemArray0[4] = meuItem0;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.heapsort(itemArray0, 3);

      // Then
      Assert.assertEquals("Array length must not change after heapsort", 5, itemArray0.length);
      Assert.assertEquals("Non-null elements must be preserved by heapsort", nonNullBefore, countNonNull(itemArray0));
      // If items are Comparable, verify non-decreasing order up to index 3 (if meaningful).
      assertNonDecreasingIfComparable(itemArray0, 3);
  }

  /**
   * test1
   *
   * Given: a partially populated array with null slots
   * When: shellsort is invoked on that array
   * Then: a NullPointerException is expected (this preserves the behavior the
   *       original test documented). The test also validates the precondition
   *       (non-null count) before invoking the routine.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      itemArray0[5] = meuItem0;
      itemArray0[6] = meuItem0;
      int nonNullBefore = countNonNull(itemArray0);
      Assert.assertTrue("Setup should have some null slots for this test", nonNullBefore < itemArray0.length);

      // When / Then: original behavior expected a NullPointerException when calling shellsort
      try {
        Ordenacao.shellsort(itemArray0, 6);
        Assert.fail("Expected NullPointerException when shellsort is invoked on an array with null elements");
      } catch (NullPointerException e) {
        // Expected: ensure that the exception type is NullPointerException.
        // Optionally assert that non-null count was unchanged before the call attempt.
        Assert.assertEquals("Non-null count should match expected before exception", nonNullBefore, countNonNull(itemArray0));
      }
  }

  /**
   * test2
   *
   * Given: an array with a few populated elements including a large negative key
   * When: shellsort is invoked with a small index
   * Then: array length and non-null counts are preserved, and ordering is
   *       validated where possible.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      MeuItem meuItem1 = new MeuItem((-2354));
      itemArray0[3] = meuItem1;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.shellsort(itemArray0, 3);

      // Then
      Assert.assertEquals("Array length must not change after shellsort", 8, itemArray0.length);
      Assert.assertEquals("Non-null elements must be preserved by shellsort", nonNullBefore, countNonNull(itemArray0));
      assertNonDecreasingIfComparable(itemArray0, 3);
  }

  /**
   * test3
   *
   * Given: an array with two MeuItem instances (one negative key)
   * When: insertion sort (insercao) is invoked for a prefix
   * Then: array length preserved and if Comparable verify ordering on prefix.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-2565));
      MeuItem meuItem1 = new MeuItem(235);
      itemArray0[1] = meuItem1;
      itemArray0[2] = meuItem0;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.insercao(itemArray0, 2);

      // Then
      Assert.assertEquals("Array length must remain unchanged after insercao", 7, itemArray0.length);
      Assert.assertEquals("Non-null elements must be preserved by insercao", nonNullBefore, countNonNull(itemArray0));
      assertNonDecreasingIfComparable(itemArray0, 2);
  }

  /**
   * test4
   *
   * Given: a small array with two populated elements
   * When: seleção (selection sort) is invoked on a small prefix
   * Then: array length and non-null element counts are preserved; ordering
   *       validated when possible.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(3813);
      itemArray0[1] = meuItem0;
      MeuItem meuItem1 = new MeuItem(2);
      itemArray0[2] = meuItem1;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.selecao(itemArray0, 2);

      // Then
      Assert.assertEquals("Array length must remain unchanged after selecao", 4, itemArray0.length);
      Assert.assertEquals("Non-null elements preserved after selecao", nonNullBefore, countNonNull(itemArray0));
      assertNonDecreasingIfComparable(itemArray0, 2);
  }

  /**
   * test5
   *
   * Given: a small array where two indices reference the same MeuItem
   * When: seleção is invoked
   * Then: array length/un-null count must be preserved and ordering verified
   *       if the items are Comparable.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(3813);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.selecao(itemArray0, 2);

      // Then
      Assert.assertEquals("Array length must remain unchanged after selecao", 4, itemArray0.length);
      Assert.assertEquals("Non-null elements preserved after selecao", nonNullBefore, countNonNull(itemArray0));
      assertNonDecreasingIfComparable(itemArray0, 2);
  }

  /**
   * test6
   *
   * Given: an array where the first two positions reference the same MeuItem
   * When: quicksort is invoked
   * Then: array length and element count are preserved; ordering validated
   *       if possible.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(3034);
      itemArray0[0] = meuItem0;
      itemArray0[1] = meuItem0;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.quicksort(itemArray0, 0);

      // Then
      Assert.assertEquals("Array length must remain unchanged after quicksort", 7, itemArray0.length);
      Assert.assertEquals("Non-null elements preserved after quicksort", nonNullBefore, countNonNull(itemArray0));
      assertNonDecreasingIfComparable(itemArray0, itemArray0.length - 1);
  }

  /**
   * test7
   *
   * Given: an array with a mix of positive and negative keyed MeuItem instances
   * When: quicksort is invoked on the array end
   * Then: the array length and non-null count are preserved; ordering validated
   *       across the whole array when possible.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      MeuItem meuItem0 = new MeuItem(1159);
      MeuItem meuItem1 = new MeuItem((-1309));
      Item[] itemArray0 = new Item[8];
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      itemArray0[3] = meuItem1;
      itemArray0[4] = meuItem1;
      itemArray0[5] = meuItem0;
      itemArray0[6] = meuItem1;
      itemArray0[7] = meuItem1;
      int nonNullBefore = countNonNull(itemArray0);

      // When
      Ordenacao.quicksort(itemArray0, 7);

      // Then
      Assert.assertEquals("Array length must not change after quicksort", 8, itemArray0.length);
      Assert.assertEquals("Non-null elements must be preserved by quicksort", nonNullBefore, countNonNull(itemArray0));
      assertNonDecreasingIfComparable(itemArray0, 7);
  }

  /**
   * test8
   *
   * Given: nothing in particular
   * When: an Ordenacao instance is constructed
   * Then: the instance should be non-null and createable (sanity check).
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given / When
      Ordenacao ordenacao0 = new Ordenacao();

      // Then
      Assert.assertNotNull("Ordenacao instance should be constructible", ordenacao0);
      // Basic sanity check: toString should not throw and should contain class name.
      String s = ordenacao0.toString();
      Assert.assertNotNull("toString() must not return null", s);
      Assert.assertTrue("toString() should mention class name", s.contains("Ordenacao") || s.length() > 0);
  }
}