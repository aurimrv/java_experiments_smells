package ds.seed1448;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of tests in this file.
 */
interface UnitTest {}

/**
 * Improved, maintainable tests for Ordenacao class.
 *
 * Each test follows a simple Given-When-Then structure in comments and
 * contains additional assertions to validate observable state beyond
 * simply invoking the method under test.
 *
 * Requirement links (example): @requirement REQ-SORT-001, REQ-SORT-EXC
 */
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  // Helper: count non-null entries in an Item array
  private static int countNonNull(Item[] arr) {
    if (arr == null) return 0;
    int c = 0;
    for (Item it : arr) {
      if (it != null) c++;
    }
    return c;
  }

  // Helper: count occurrences of a reference in the array
  private static int countOccurrences(Item[] arr, Item ref) {
    if (arr == null || ref == null) return 0;
    int c = 0;
    for (Item it : arr) {
      if (it == ref) c++;
    }
    return c;
  }

  /**
   * Given an array with valid items in positions 1 and 2,
   * When heapsort is invoked with an out-of-range index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * @requirement REQ-SORT-EXC
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(1581);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      Assert.assertEquals("Precondition: array length must be 3", 3, itemArray0.length);
      Assert.assertEquals("Precondition: two non-null elements expected", 2, countNonNull(itemArray0));

      // When: call that should raise ArrayIndexOutOfBoundsException
      Ordenacao.heapsort(itemArray0, 1581);

      // Then: exception is declared in the @Test annotation; no further assertions here.
  }

  /**
   * Given a single-element array (all nulls),
   * When heapsort is invoked with index 0,
   * Then the array remains length 1 and still contains no non-null elements.
   *
   * @requirement REQ-SORT-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[1];
      Assert.assertEquals("Initial length", 1, itemArray0.length);
      Assert.assertEquals("Initial non-null count", 0, countNonNull(itemArray0));

      // When
      Ordenacao.heapsort(itemArray0, 0);

      // Then
      Assert.assertEquals("Length must remain unchanged after heapsort", 1, itemArray0.length);
      Assert.assertEquals("No items should have been added", 0, countNonNull(itemArray0));
      Assert.assertNull("Element 0 should remain null", itemArray0[0]);
  }

  /**
   * Given an array populated with two distinct MeuItem instances across most indices,
   * When shellsort is executed,
   * Then the array size remains and the occurrences of the original references are preserved.
   *
   * @requirement REQ-SHELL-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem((-354));
      MeuItem meuItem1 = new MeuItem((-1962));
      itemArray0[1] = meuItem1;
      itemArray0[2] = meuItem0;
      itemArray0[3] = meuItem1;
      itemArray0[4] = meuItem0;
      itemArray0[5] = meuItem1;
      itemArray0[6] = meuItem1;
      itemArray0[7] = meuItem0;
      int expectedNonNull = 7;
      Assert.assertEquals("Precondition: length", 8, itemArray0.length);
      Assert.assertEquals("Precondition: non-null count", expectedNonNull, countNonNull(itemArray0));

      // When
      Ordenacao.shellsort(itemArray0, 7);

      // Then
      Assert.assertEquals("Length unchanged after shellsort", 8, itemArray0.length);
      Assert.assertEquals("Non-null count preserved after shellsort", expectedNonNull, countNonNull(itemArray0));
      // Validate that the same object references are still present in the array
      int occurrences0 = countOccurrences(itemArray0, meuItem0);
      int occurrences1 = countOccurrences(itemArray0, meuItem1);
      Assert.assertEquals("Occurrences of meuItem0 should be 3", 3, occurrences0);
      Assert.assertEquals("Occurrences of meuItem1 should be 4", 4, occurrences1);
  }

  /**
   * Given an array with nulls and two populated positions,
   * When insercao is invoked with a very large index,
   * Then a NullPointerException is expected (documented exceptional behavior).
   *
   * @requirement REQ-INSERT-EXC
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test3()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(2341);
      itemArray0[1] = meuItem0;
      MeuItem meuItem1 = new MeuItem(1);
      itemArray0[2] = meuItem1;
      Assert.assertEquals("Precondition non-null count", 2, countNonNull(itemArray0));

      // When: call expected to throw NullPointerException due to implementation details
      Ordenacao.insercao(itemArray0, 2341);

      // Then: exception declared in annotation
  }

  /**
   * Given a small array all null,
   * When insercao is invoked with a negative index,
   * Then the array remains unchanged and no exception is thrown.
   *
   * @requirement REQ-INSERT-002
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[3];
      Assert.assertEquals("Initial length", 3, itemArray0.length);
      Assert.assertEquals("Initial non-null count", 0, countNonNull(itemArray0));

      // When
      Ordenacao.insercao(itemArray0, (-188));

      // Then
      Assert.assertEquals("Length must remain 3", 3, itemArray0.length);
      Assert.assertEquals("Non-null count should remain 0", 0, countNonNull(itemArray0));
      for (int i = 0; i < itemArray0.length; i++) {
        Assert.assertNull("Element " + i + " should remain null after insercao", itemArray0[i]);
      }
  }

  /**
   * Given an array with some positions populated,
   * When selecao is executed targeting a valid index,
   * Then array size and references count remain consistent.
   *
   * @requirement REQ-SELECT-001
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(2084);
      itemArray0[1] = meuItem0;
      itemArray0[2] = meuItem0;
      MeuItem meuItem1 = new MeuItem(1497);
      itemArray0[3] = meuItem1;
      Assert.assertEquals("Precondition: length", 7, itemArray0.length);
      Assert.assertEquals("Precondition: non-null count", 3, countNonNull(itemArray0));

      // When
      Ordenacao.selecao(itemArray0, 3);

      // Then
      Assert.assertEquals("Length unchanged after selecao", 7, itemArray0.length);
      Assert.assertEquals("Non-null count preserved after selecao", 3, countNonNull(itemArray0));
      Assert.assertEquals("Occurrences of meuItem0 should be 2", 2, countOccurrences(itemArray0, meuItem0));
      Assert.assertEquals("Occurrences of meuItem1 should be 1", 1, countOccurrences(itemArray0, meuItem1));
  }

  /**
   * Given a small array where two positions share the same object,
   * When quicksort is invoked,
   * Then the array remains sized correctly and non-null count preserved.
   *
   * @requirement REQ-QUICK-001
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = meuItem0;
      itemArray0[1] = meuItem0;
      Assert.assertEquals("Precondition non-null count", 2, countNonNull(itemArray0));

      // When
      Ordenacao.quicksort(itemArray0, 0);

      // Then
      Assert.assertEquals("Length unchanged after quicksort", 3, itemArray0.length);
      Assert.assertEquals("Non-null count preserved after quicksort", 2, countNonNull(itemArray0));
      Assert.assertEquals("Both occurrences should still reference the original object", 2, countOccurrences(itemArray0, meuItem0));
  }

  /**
   * Given an array with two different MeuItem values,
   * When quicksort is invoked targeting a mid index,
   * Then the array remains valid and non-null counts preserved.
   *
   * @requirement REQ-QUICK-002
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(3469);
      MeuItem meuItem1 = new MeuItem(2);
      itemArray0[1] = meuItem1;
      itemArray0[2] = meuItem0;
      Assert.assertEquals("Precondition length", 5, itemArray0.length);
      Assert.assertEquals("Precondition non-null count", 2, countNonNull(itemArray0));

      // When
      Ordenacao.quicksort(itemArray0, 2);

      // Then
      Assert.assertEquals("Length unchanged after quicksort", 5, itemArray0.length);
      Assert.assertEquals("Non-null count preserved after quicksort", 2, countNonNull(itemArray0));
      Assert.assertEquals("Occurrences of meuItem0 should be 1", 1, countOccurrences(itemArray0, meuItem0));
      Assert.assertEquals("Occurrences of meuItem1 should be 1", 1, countOccurrences(itemArray0, meuItem1));
  }

  /**
   * Given an array that provokes a NullPointerException in quicksort implementation,
   * When quicksort is invoked with a parameter that triggers the condition,
   * Then a NullPointerException is expected.
   *
   * @requirement REQ-QUICK-EXC
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test8()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = meuItem0;
      MeuItem meuItem1 = new MeuItem((-3783));
      itemArray0[1] = meuItem1;
      Assert.assertEquals("Precondition non-null count", 2, countNonNull(itemArray0));

      // When: expecting NullPointerException due to implementation-specific behavior
      Ordenacao.quicksort(itemArray0, 0);

      // Then: exception declared in the @Test annotation
  }

  /**
   * Given no special setup,
   * When constructing Ordenacao,
   * Then the instance must be non-null and of the expected type.
   *
   * @requirement REQ-CTOR-001
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Given / When
      Ordenacao ordenacao0 = new Ordenacao();

      // Then
      Assert.assertNotNull("Constructor should produce a non-null instance", ordenacao0);
      Assert.assertEquals("Instance should be of type Ordenacao", Ordenacao.class, ordenacao0.getClass());
      Assert.assertTrue("toString() should not return null", ordenacao0.toString() != null);
  }
}