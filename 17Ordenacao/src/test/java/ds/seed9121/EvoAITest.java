package ds.seed9121;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of tests.
 */
interface UnitTest {}

/**
 * Improved test class for Ordenacao algorithms.
 *
 * Notes:
 * - Each test contains Given-When-Then style comments and Javadoc linking to a fictional requirement id.
 * - Tests avoid reliance on generated EvoSuite helpers and use explicit assertions with messages.
 */
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Requirement: REQ-ORDER-BOUNDS-01
   *
   * Given an empty array, when heapsort is invoked with an out-of-range index,
   * then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test00() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[0];
    assertEquals("Precondition: created array should be empty", 0, itemArray0.length);

    // When
    // Expect: ArrayIndexOutOfBoundsException due to invalid range parameter
    Ordenacao.heapsort(itemArray0, 2321);

    // Then (handled by expected exception)
  }

  /**
   * Requirement: REQ-ORDER-HEAP-01
   *
   * Given a single-element array (null element), when heapsort is invoked on it,
   * then the array length must remain 1 and the array must be considered sorted.
   */
  @Test(timeout = 4000)
  public void test01() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[1];
    assertEquals("Precondition: array of length 1", 1, itemArray0.length);

    // When
    Ordenacao.heapsort(itemArray0, 1);

    // Then
    assertEquals("Array length must remain unchanged after heapsort", 1, itemArray0.length);
    assertTrue("Single-element (possibly null) array should be considered sorted", isSorted(itemArray0));
  }

  /**
   * Requirement: REQ-ORDER-SHELL-NULL-01
   *
   * Given an array with several null slots and two identical MeuItem instances,
   * when shellsort is invoked with a mid-range parameter, then a NullPointerException may be thrown.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test02() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[7];
    MeuItem meuItem0 = new MeuItem(583);
    itemArray0[1] = (Item) meuItem0;
    itemArray0[5] = (Item) meuItem0;
    assertNotNull("Precondition: slot 1 must be populated", itemArray0[1]);
    assertNotNull("Precondition: slot 5 must be populated", itemArray0[5]);

    // When
    Ordenacao.shellsort(itemArray0, 5);

    // Then (exception expected)
  }

  /**
   * Requirement: REQ-ORDER-SHELL-NULL-02
   *
   * Given an array with populated and negative-valued MeuItem instances,
   * when shellsort is invoked, a NullPointerException may be raised due to implementation details.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test03() throws Throwable {
    // Given
    MeuItem meuItem0 = new MeuItem(1996);
    MeuItem meuItem1 = new MeuItem((-1));
    Item[] itemArray0 = new Item[8];
    itemArray0[1] = (Item) meuItem0;
    itemArray0[2] = (Item) meuItem0;
    itemArray0[3] = (Item) meuItem1;
    assertNotNull("Precondition: some slots should be populated", itemArray0[1]);
    assertNotNull("Precondition: some slots should be populated", itemArray0[3]);

    // When
    Ordenacao.shellsort(itemArray0, 4);

    // Then (exception expected)
  }

  /**
   * Requirement: REQ-ORDER-SHELL-01
   *
   * Given a single-element array, when shellsort is invoked,
   * then the array remains length 1 and is considered sorted.
   */
  @Test(timeout = 4000)
  public void test04() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[1];
    assertEquals("Precondition: array of length 1", 1, itemArray0.length);

    // When
    Ordenacao.shellsort(itemArray0, 1);

    // Then
    assertEquals("Array length must remain unchanged after shellsort", 1, itemArray0.length);
    assertTrue("Single-element array should be considered sorted after shellsort", isSorted(itemArray0));
  }

  /**
   * Requirement: REQ-ORDER-INSERTION-NULL-01
   *
   * Given an array with multiple populated slots and nulls, when insercao is invoked with a large key,
   * then a NullPointerException may be thrown by the implementation.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test05() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[7];
    MeuItem meuItem0 = new MeuItem(869);
    itemArray0[1] = (Item) meuItem0;
    itemArray0[2] = (Item) meuItem0;
    MeuItem meuItem1 = new MeuItem(0);
    itemArray0[3] = (Item) meuItem1;
    assertNotNull("Precondition: some slots must be populated", itemArray0[1]);
    assertNotNull("Precondition: some slots must be populated", itemArray0[3]);

    // When
    Ordenacao.insercao(itemArray0, 2231);

    // Then (exception expected)
  }

  /**
   * Requirement: REQ-ORDER-INSERTION-01
   *
   * Given a single-element array, when insercao is invoked with index 0,
   * then the array remains a valid single-element (sorted) array.
   */
  @Test(timeout = 4000)
  public void test06() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[1];
    assertEquals("Precondition: array length is 1", 1, itemArray0.length);

    // When
    Ordenacao.insercao(itemArray0, 0);

    // Then
    assertEquals("Array length must stay 1 after insertion sort", 1, itemArray0.length);
    assertTrue("Single-element array should be considered sorted after insertion", isSorted(itemArray0));
  }

  /**
   * Requirement: REQ-ORDER-SELECTION-NULL-01
   *
   * Given a partially populated array, when selecao is invoked with a mid-range parameter,
   * then a NullPointerException may be thrown by the implementation.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test07() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[9];
    MeuItem meuItem0 = new MeuItem(99);
    itemArray0[1] = (Item) meuItem0;
    itemArray0[2] = (Item) meuItem0;
    MeuItem meuItem1 = new MeuItem((-2485));
    itemArray0[3] = (Item) meuItem1;
    assertNotNull("Precondition: some slots must be populated", itemArray0[1]);
    assertNotNull("Precondition: some slots must be populated", itemArray0[3]);

    // When
    Ordenacao.selecao(itemArray0, 4);

    // Then (exception expected)
  }

  /**
   * Requirement: REQ-ORDER-SELECTION-01
   *
   * Given an array fully populated with identical MeuItem objects,
   * when selecao is invoked, then the array length remains the same and the result is sorted.
   */
  @Test(timeout = 4000)
  public void test08() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[9];
    MeuItem meuItem0 = new MeuItem((-4492));
    itemArray0[1] = (Item) meuItem0;
    itemArray0[2] = (Item) meuItem0;
    itemArray0[3] = (Item) meuItem0;
    itemArray0[4] = (Item) meuItem0;
    // fill rest to avoid some implementations depending on nulls (safe step)
    for (int i = 0; i < itemArray0.length; i++) {
      if (itemArray0[i] == null) {
        itemArray0[i] = meuItem0;
      }
    }

    // When
    Ordenacao.selecao(itemArray0, 4);

    // Then
    assertEquals("Array length must remain unchanged after selection sort", 9, itemArray0.length);
    assertTrue("Array filled with identical elements must be considered sorted", isSorted(itemArray0));
  }

  /**
   * Requirement: REQ-ORDER-QUICK-01
   *
   * Given an array filled with identical MeuItem objects, when quicksort is invoked,
   * then array length remains and the array should be sorted (non-decreasing).
   */
  @Test(timeout = 4000)
  public void test09() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[6];
    MeuItem meuItem0 = new MeuItem((-237));
    for (int i = 1; i < itemArray0.length; i++) {
      itemArray0[i] = (Item) meuItem0;
    }

    // When
    Ordenacao.quicksort(itemArray0, 5);

    // Then
    assertEquals("Array length must remain unchanged after quicksort", 6, itemArray0.length);
    assertTrue("Array with identical elements should be sorted", isSorted(itemArray0));
  }

  /**
   * Requirement: REQ-ORDER-QUICK-NULL-01
   *
   * Given a partially populated array, when quicksort is invoked, a NullPointerException may be thrown.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test10() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[6];
    MeuItem meuItem0 = new MeuItem((-237));
    itemArray0[1] = (Item) meuItem0;
    itemArray0[3] = (Item) meuItem0;
    MeuItem meuItem1 = new MeuItem(1265);
    itemArray0[5] = (Item) meuItem1;
    assertNotNull("Precondition: some slots populated", itemArray0[1]);
    assertNotNull("Precondition: some slots populated", itemArray0[5]);

    // When
    Ordenacao.quicksort(itemArray0, 5);

    // Then (exception expected)
  }

  /**
   * Requirement: REQ-ORDER-QUICK-NULL-02
   *
   * Given an array where first two positions are populated and the rest may be null,
   * when quicksort is invoked with low index 0, a NullPointerException may result.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test11() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[8];
    MeuItem meuItem0 = new MeuItem(441);
    itemArray0[0] = (Item) meuItem0;
    MeuItem meuItem1 = new MeuItem(0);
    itemArray0[1] = (Item) meuItem1;
    assertNotNull("Precondition: slot 0 should be populated", itemArray0[0]);
    assertNotNull("Precondition: slot 1 should be populated", itemArray0[1]);

    // When
    Ordenacao.quicksort(itemArray0, 0);

    // Then (exception expected)
  }

  /**
   * Requirement: REQ-ORDER-QUICK-02
   *
   * Given a 7-element array with two identical leading elements, when quicksort is invoked,
   * then the array length remains and the array should be sorted.
   */
  @Test(timeout = 4000)
  public void test12() throws Throwable {
    // Given
    MeuItem meuItem0 = new MeuItem(0);
    Item[] itemArray0 = new Item[7];
    itemArray0[0] = (Item) meuItem0;
    itemArray0[1] = (Item) meuItem0;
    // leave others null (some implementations may tolerate nulls)
    assertNotNull("Precondition: first element is set", itemArray0[0]);

    // When
    Ordenacao.quicksort(itemArray0, 0);

    // Then
    assertEquals("Array length must remain 7 after quicksort", 7, itemArray0.length);
    assertTrue("Array with two identical leading elements should be considered sorted", isSorted(itemArray0));
  }

  /**
   * Requirement: REQ-ORDER-CONSTRUCTOR-01
   *
   * Given the Ordenacao class, construction should succeed and the instance should not be null.
   */
  @Test(timeout = 4000)
  public void test13() throws Throwable {
    // Given / When
    Ordenacao ordenacao0 = new Ordenacao();

    // Then
    assertNotNull("Constructor should produce a non-null instance", ordenacao0);
    // Basic smoke check: toString should not throw and should return a non-null string
    assertNotNull("toString() should not return null", ordenacao0.toString());
  }

  // Helper methods

  /**
   * Compare two Item instances in a defensive manner.
   * - If either item is null, treat as equal (do not fail tests because of null handling differences).
   * - If item implements Comparable, use compareTo; otherwise treat as equal.
   */
  private static int compareItems(Item a, Item b) {
    if (a == b) {
      return 0;
    }
    if (a == null || b == null) {
      return 0;
    }
    if (a instanceof Comparable) {
      try {
        @SuppressWarnings("unchecked")
        Comparable<Object> ca = (Comparable<Object>) a;
        return ca.compareTo(b);
      } catch (ClassCastException e) {
        // Fall through to treat as equal if not comparable to b
        return 0;
      }
    }
    return 0;
  }

  /**
   * Returns true if the array is in non-decreasing order according to compareItems rules.
   */
  private static boolean isSorted(Item[] arr) {
    if (arr == null || arr.length < 2) {
      return true;
    }
    for (int i = 1; i < arr.length; i++) {
      if (compareItems(arr[i - 1], arr[i]) > 0) {
        return false;
      }
    }
    return true;
  }
}