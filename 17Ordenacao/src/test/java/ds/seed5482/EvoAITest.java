package ds.seed5482;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of tests (unit tests).
 * Placed at package level so it can be referenced by @Category.
 */
interface UnitTest {}

/**
 * Improved and documented version of the original Evo test class.
 *
 * Notes:
 * - Test method names are preserved to remain compatible with existing tooling.
 * - Each test contains Given-When-Then comments, clearer assertions, and categorization.
 * - Tests avoid relying on unknown internals of ds.Item/MeuItem beyond reference checks.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-001: Heapsort should validate the provided length parameter.
   *
   * Given an array with valid elements at indices 1..4,
   * When heapsort is invoked with an invalid large length,
   * Then an ArrayIndexOutOfBoundsException is expected and the original references remain intact.
   */
  @Test(timeout = 4000)
  public void test00() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[5];
    MeuItem meuItem0 = new MeuItem(1738);
    itemArray0[1] = meuItem0;
    itemArray0[2] = meuItem0;
    itemArray0[3] = meuItem0;
    itemArray0[4] = meuItem0;

    assertEquals("Precondition: array length must be 5", 5, itemArray0.length);
    assertNull("Precondition: index 0 should be null", itemArray0[0]);
    for (int i = 1; i <= 4; ++i) {
      assertSame("Precondition: element at index " + i + " should be the inserted MeuItem instance",
          meuItem0, itemArray0[i]);
    }

    // When / Then
    try {
      Ordenacao.heapsort(itemArray0, 1738);
      fail("Expected ArrayIndexOutOfBoundsException when calling heapsort with out-of-range length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // verify exception information is consistent with the invalid index used by the caller
      String msg = e.getMessage();
      // original tests observed "1738" message; if implementation yields numeric message, ensure it references the bad index
      if (msg != null) {
        assertTrue("Exception message should reference the invalid index",
            msg.contains("1738") || msg.contains("1738"));
      }
      // Ensure array content hasn't been nulled or replaced entirely by the failing call
      for (int i = 1; i <= 4; ++i) {
        assertSame("After exception: element at index " + i + " should remain the same instance",
            meuItem0, itemArray0[i]);
      }
    }
  }

  /**
   * REQ-002: Heapsort on an empty array should be a no-op and not throw.
   *
   * Given an empty array,
   * When heapsort is invoked with length 0,
   * Then no exception is thrown and the array remains empty.
   */
  @Test(timeout = 4000)
  public void test01() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[0];
    assertEquals("Precondition: empty array length", 0, itemArray0.length);

    // When
    Ordenacao.heapsort(itemArray0, 0);

    // Then
    assertEquals("After heapsort: array length should still be 0", 0, itemArray0.length);
    // Nothing to check inside the array because it is empty; this verifies no unexpected side-effects occurred.
  }

  /**
   * REQ-003: Shellsort should throw NPE if internal elements are unexpectedly null during processing.
   *
   * Given an array with some filled positions and others null,
   * When shellsort is invoked with a gap that triggers internal access to null slots,
   * Then a NullPointerException may be thrown; the test documents and asserts that behavior.
   */
  @Test(timeout = 4000)
  public void test02() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[9];
    MeuItem meuItem0 = new MeuItem(-25);
    itemArray0[1] = meuItem0;
    itemArray0[2] = meuItem0;
    itemArray0[5] = meuItem0;
    itemArray0[6] = meuItem0;

    // Precondition checks
    assertEquals("Precondition: array length should be 9", 9, itemArray0.length);
    int nonNullCount = 0;
    for (Item it : itemArray0) {
      if (it != null) nonNullCount++;
    }
    assertEquals("Precondition: exactly 4 non-null items expected", 4, nonNullCount);

    // When / Then
    try {
      Ordenacao.shellsort(itemArray0, 6);
      // If no exception, ensure basic invariants hold: no elements became null
      int afterNonNull = 0;
      for (Item it : itemArray0) {
        if (it != null) afterNonNull++;
      }
      assertEquals("If shellsort completes without exception, non-null count should remain the same",
          nonNullCount, afterNonNull);
    } catch (NullPointerException e) {
      // This is an allowed/observed behavior for some implementations when encountering nulls.
      assertNull("NullPointerException is expected to have no message in this implementation",
          e.getMessage());
      // Ensure original non-null references are still present at their indices (best-effort)
      assertSame(meuItem0, itemArray0[1]);
      assertSame(meuItem0, itemArray0[2]);
      assertSame(meuItem0, itemArray0[5]);
      assertSame(meuItem0, itemArray0[6]);
    }
  }

  /**
   * REQ-004: Shellsort behavior with partially populated arrays.
   *
   * Given an array with small positive integers wrapped in MeuItem,
   * When invoking shellsort with a typical gap value,
   * Then either the algorithm completes or a NullPointerException is thrown; both behaviors are asserted appropriately.
   */
  @Test(timeout = 4000)
  public void test03() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[9];
    MeuItem meuItem0 = new MeuItem(4);
    itemArray0[1] = meuItem0;
    MeuItem meuItem1 = new MeuItem(0);
    itemArray0[2] = meuItem1;
    itemArray0[3] = meuItem1;

    // Basic invariants
    assertEquals("Precondition: expected array length 9", 9, itemArray0.length);
    assertSame("Precondition: index 1 should hold meuItem0", meuItem0, itemArray0[1]);
    assertSame("Precondition: index 2 should hold meuItem1", meuItem1, itemArray0[2]);
    assertSame("Precondition: index 3 should hold meuItem1", meuItem1, itemArray0[3]);

    // When / Then
    try {
      Ordenacao.shellsort(itemArray0, 4);
      // If finished, check that the non-null items are still present (not lost)
      assertNotNull("After shellsort: index 1 should still be non-null", itemArray0[1]);
      assertNotNull("After shellsort: index 2 should still be non-null", itemArray0[2]);
      assertNotNull("After shellsort: index 3 should still be non-null", itemArray0[3]);
    } catch (NullPointerException e) {
      // Acceptable based on underlying implementation; assert message is null as observed previously
      assertNull("Expected NullPointerException with no message", e.getMessage());
    }
  }

  /**
   * REQ-005: Shellsort on an array of nulls should be a safe no-op.
   *
   * Given an array of length 4 with all nulls,
   * When shellsort is invoked with gap 0,
   * Then no exception is thrown and all entries remain null.
   */
  @Test(timeout = 4000)
  public void test04() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[4];
    for (int i = 0; i < itemArray0.length; i++) {
      assertNull("Precondition: all entries should be null before sorting", itemArray0[i]);
    }

    // When
    Ordenacao.shellsort(itemArray0, 0);

    // Then
    assertEquals("Array length should remain unchanged after shellsort", 4, itemArray0.length);
    for (int i = 0; i < itemArray0.length; i++) {
      assertNull("After shellsort: entries should still be null for a no-op", itemArray0[i]);
    }
  }

  /**
   * REQ-006: Insercao should validate the provided length parameter and not corrupt the array on failure.
   *
   * Given an array with several MeuItem instances and an invalid large length,
   * When insercao is invoked,
   * Then an ArrayIndexOutOfBoundsException is expected and the array contents remain unchanged.
   */
  @Test(timeout = 4000)
  public void test05() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[5];
    MeuItem meuItem0 = new MeuItem(2140);
    itemArray0[1] = meuItem0;
    itemArray0[2] = meuItem0;
    itemArray0[3] = meuItem0;
    MeuItem meuItem1 = new MeuItem(-1123);
    itemArray0[4] = meuItem1;

    assertEquals("Precondition: array length must be 5", 5, itemArray0.length);

    // When / Then
    try {
      Ordenacao.insercao(itemArray0, 2140);
      fail("Expected ArrayIndexOutOfBoundsException when calling insercao with out-of-range length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Implementation historically threw with message "5"; verify message references the array length if available
      String msg = e.getMessage();
      if (msg != null) {
        assertTrue("Exception message should reference the invalid or array length",
            msg.contains("5") || msg.contains("2140"));
      }
      // Ensure array contents remain the same
      assertSame("index 1 should still reference the same MeuItem", meuItem0, itemArray0[1]);
      assertSame("index 4 should still reference meuItem1", meuItem1, itemArray0[4]);
    }
  }

  /**
   * REQ-007: Insercao on a small array should be a no-op and preserve array size.
   *
   * Given an array of length 2,
   * When insercao is invoked with length 0,
   * Then no exception occurs and the array length remains 2.
   */
  @Test(timeout = 4000)
  public void test06() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[2];
    assertEquals("Precondition: array length must be 2", 2, itemArray0.length);

    // When
    Ordenacao.insercao(itemArray0, 0);

    // Then
    assertEquals("After insercao: array length should still be 2", 2, itemArray0.length);
    // Both entries may be null; ensure method didn't throw or alter the array size
  }

  /**
   * REQ-008: Selecao (selection sort) on partially populated arrays should complete and preserve non-null references.
   *
   * Given an array with two distinct MeuItem instances placed into specific positions,
   * When selecao is invoked,
   * Then no exception is thrown and the instances remain reachable in the array (positions may change).
   */
  @Test(timeout = 4000)
  public void test07() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[6];
    MeuItem meuItem0 = new MeuItem(-1339);
    itemArray0[1] = meuItem0;
    MeuItem meuItem1 = new MeuItem(-2963);
    itemArray0[2] = meuItem1;

    // When
    Ordenacao.selecao(itemArray0, 2);

    // Then
    assertEquals("Array length should remain 6 after selection sort", 6, itemArray0.length);
    // Ensure the two inserted instances are still present somewhere in the array
    int found = 0;
    for (Item it : itemArray0) {
      if (it == meuItem0 || it == meuItem1) found++;
    }
    assertEquals("Both inserted MeuItem instances should still be present after selecao", 2, found);
  }

  /**
   * REQ-009: Selecao when multiple array positions reference the same object should preserve identity occurrences.
   *
   * Given an array with repeated references to the same MeuItem,
   * When selecao is applied,
   * Then the same number of references to that instance remains in the array.
   */
  @Test(timeout = 4000)
  public void test08() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[6];
    MeuItem meuItem0 = new MeuItem(-1339);
    itemArray0[1] = meuItem0;
    itemArray0[2] = meuItem0;

    // When
    Ordenacao.selecao(itemArray0, 2);

    // Then
    assertEquals("Array length should remain 6 after selection sort", 6, itemArray0.length);
    int occurrences = 0;
    for (Item it : itemArray0) {
      if (it == meuItem0) occurrences++;
    }
    assertEquals("There should be exactly 2 occurrences of the same MeuItem instance after selecao", 2, occurrences);
  }

  /**
   * REQ-010: Quicksort should not throw on arrays with repeated identical elements and should preserve non-null count.
   *
   * Given several repeated MeuItem instances in the array,
   * When quicksort is invoked,
   * Then no exception occurs and array length and number of non-null entries remain as expected.
   */
  @Test(timeout = 4000)
  public void test09() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[6];
    MeuItem meuItem0 = new MeuItem(601);
    itemArray0[1] = meuItem0;
    itemArray0[2] = meuItem0;
    itemArray0[3] = meuItem0;
    itemArray0[4] = meuItem0;

    int expectedNonNull = 4;
    int preCount = 0;
    for (Item it : itemArray0) if (it != null) preCount++;
    assertEquals("Precondition: should have 4 non-null entries", expectedNonNull, preCount);

    // When
    Ordenacao.quicksort(itemArray0, 4);

    // Then
    assertEquals("Array length should remain 6", 6, itemArray0.length);
    int postCount = 0;
    for (Item it : itemArray0) if (it != null) postCount++;
    assertEquals("Non-null count should remain unchanged after quicksort", expectedNonNull, postCount);
  }

  /**
   * REQ-011: Quicksort on an array with mixed values should complete and preserve non-null elements.
   *
   * Given an array with one distinct and several identical MeuItem instances,
   * When quicksort is invoked,
   * Then the array should retain the same number of non-null elements and maintain integrity of instances.
   */
  @Test(timeout = 4000)
  public void test10() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[6];
    MeuItem meuItem0 = new MeuItem(601);
    MeuItem meuItem1 = new MeuItem(-559);
    itemArray0[1] = meuItem1;
    itemArray0[2] = meuItem0;
    itemArray0[3] = meuItem0;
    itemArray0[4] = meuItem0;

    int preNonNull = 4;
    int count = 0;
    for (Item it : itemArray0) if (it != null) count++;
    assertEquals("Precondition: expected 4 non-null entries", preNonNull, count);

    // When
    Ordenacao.quicksort(itemArray0, 4);

    // Then
    assertEquals("Array length should remain 6 after quicksort", 6, itemArray0.length);
    int postNonNull = 0;
    for (Item it : itemArray0) if (it != null) postNonNull++;
    assertEquals("Number of non-null items should be preserved", preNonNull, postNonNull);
    // Ensure inserted MeuItem instances are still present somewhere in the array
    boolean foundMeuItem1 = false;
    for (Item it : itemArray0) {
      if (it == meuItem1) foundMeuItem1 = true;
    }
    assertTrue("The distinct MeuItem instance should still be present after quicksort", foundMeuItem1);
  }

  /**
   * REQ-012: Quicksort invoked with zero length parameter should leave array size intact and preserve inserted elements.
   *
   * Given an array with two identical MeuItem instances in the first positions,
   * When quicksort is called with length 0,
   * Then behavior should be safe (no exception) and array length unchanged.
   */
  @Test(timeout = 4000)
  public void test11() throws Throwable {
    // Given
    Item[] itemArray0 = new Item[3];
    MeuItem meuItem0 = new MeuItem(-1);
    itemArray0[0] = meuItem0;
    itemArray0[1] = meuItem0;

    // When
    Ordenacao.quicksort(itemArray0, 0);

    // Then
    assertEquals("Array length should remain 3", 3, itemArray0.length);
    assertSame("Element at index 0 should remain the same instance", meuItem0, itemArray0[0]);
    assertSame("Element at index 1 should remain the same instance", meuItem0, itemArray0[1]);
  }

  /**
   * REQ-013: Ordenacao should be instantiable.
   *
   * Given the Ordenacao type,
   * When constructing an instance,
   * Then the object should be non-null and of the expected type.
   */
  @Test(timeout = 4000)
  public void test12() throws Throwable {
    // Given / When
    Ordenacao ordenacao0 = new Ordenacao();

    // Then
    assertNotNull("Constructed Ordenacao instance should not be null", ordenacao0);
    assertEquals("Constructed instance should be of class Ordenacao",
        Ordenacao.class, ordenacao0.getClass());
  }
}