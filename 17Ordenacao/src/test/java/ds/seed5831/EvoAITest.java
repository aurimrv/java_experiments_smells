package ds.seed5831;

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
 * Unit tests for Ordenacao algorithms (heapsort, shellsort, insercao, selecao, quicksort).
 * Each test follows a Given-When-Then structure and includes descriptive assertions.
 *
 * Traceability: REQ-SORT-001..010 (example requirement IDs for sorting behaviors).
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Given: a small array and an out-of-range right bound
   * When:  heapsort is invoked with an index far beyond the array length
   * Then:  an ArrayIndexOutOfBoundsException is raised to indicate invalid bounds
   *
   * REQ-SORT-HEAP-OUTOFBOUNDS
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test00()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(1);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      assertEquals("Precondition: array length must be 4", 4, itemArray0.length);
      assertNotNull("Precondition: at least one element should be non-null", itemArray0[1]);

      // When / Then: expect ArrayIndexOutOfBoundsException for invalid bound (650)
      Ordenacao.heapsort(itemArray0, 650);
  }

  /**
   * Given: an empty array
   * When:  heapsort is invoked on the empty array
   * Then:  no exception is thrown and the array remains empty
   *
   * REQ-SORT-HEAP-EMPTY
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[0];

      // When
      Ordenacao.heapsort(itemArray0, 0);

      // Then
      assertEquals("Empty array should remain length 0 after heapsort", 0, itemArray0.length);
  }

  /**
   * Given: an array with some null entries
   * When:  shellsort is invoked with a valid bound
   * Then:  implementation may throw NullPointerException when encountering null items
   *
   * REQ-SORT-SHELL-NPE-ON-NULLS
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test02()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-1413));
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem1;

      // Precondition: confirm there are nulls present to provoke potential NPE in many implementations
      boolean hasNull = false;
      for (Item it : itemArray0) {
          if (it == null) {
              hasNull = true;
              break;
          }
      }
      assertTrue("Precondition: test requires at least one null entry in the input array", hasNull);

      // When / Then: expect NullPointerException due to null entries
      Ordenacao.shellsort(itemArray0, 6);
  }

  /**
   * Given: a null reference to array
   * When:  shellsort is invoked with a null array reference
   * Then:  the method should tolerate a null input and not throw (treated as no-op).
   *
   * REQ-SORT-SHELL-NULLSAFE
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Given
      Item[] input = null;

      // When / Then: treat null as a no-op; fail the test if an exception is thrown
      try {
          Ordenacao.shellsort(input, 0);
      } catch (Exception e) {
          fail("shellsort should handle null input without throwing, but threw: " + e);
      }
  }

  /**
   * Given: a partially populated array and an insertion call with a large index
   * When:  insercao is invoked with an index outside expected bounds
   * Then:  implementation is expected to throw NullPointerException when internal assumptions are violated
   *
   * REQ-SORT-INSERTION-BOUNDS
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test04()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      // Precondition: ensure array has null entries so the implementation may encounter them
      assertNull("Precondition: index 0 expected to be null", itemArray0[0]);
      assertNotNull("Precondition: index 1 expected to be non-null", itemArray0[1]);

      // When / Then: we expect a NullPointerException for this particular implementation and bound
      Ordenacao.insercao(itemArray0, 20);
  }

  /**
   * Given: a single-element array
   * When:  insercao is invoked with index 0
   * Then:  no exception should be thrown and array length should remain unchanged
   *
   * REQ-SORT-INSERTION-SINGLE
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[1];

      // When
      Ordenacao.insercao(itemArray0, 0);

      // Then
      assertEquals("Array length must remain 1 after insertion sort", 1, itemArray0.length);
      // The single slot was never assigned, should remain null for this setup
      assertNull("Single-element array slot should remain null when not initialized", itemArray0[0]);
  }

  /**
   * Given: an array with null entries and some populated items
   * When:  selecao is invoked with a large bound value
   * Then:  a NullPointerException is expected for this implementation when encountering nulls
   *
   * REQ-SORT-SELECAO-NPE
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test06()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(2928);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1062);
      itemArray0[2] = (Item) meuItem1;

      // Precondition: ensure there are nulls to provoke potential NPE
      int nullCount = 0;
      for (Item it : itemArray0) {
          if (it == null) nullCount++;
      }
      assertTrue("Precondition: expect at least one null entry", nullCount >= 1);

      // When / Then
      Ordenacao.selecao(itemArray0, 2928);
  }

  /**
   * Given: a 5-element array with two identical entries set
   * When:  selecao is invoked with a small bound
   * Then:  method should complete without exception and preserve array length
   *
   * REQ-SORT-SELECAO-BASIC
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(2);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;

      // When
      Ordenacao.selecao(itemArray0, 2);

      // Then
      assertEquals("Array length unchanged after selecao", 5, itemArray0.length);
      assertSame("Inserted items should remain the same instance at index 1", meuItem0, itemArray0[1]);
      assertSame("Inserted items should remain the same instance at index 2", meuItem0, itemArray0[2]);
  }

  /**
   * Given: a 5-element array with repeated elements
   * When:  quicksort is invoked on a subrange
   * Then:  it should complete without throwing and maintain array length
   *
   * REQ-SORT-QUICK-BASIC
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem((-2531));
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem1;

      // When
      Ordenacao.quicksort(itemArray0, 3);

      // Then
      assertEquals("Array length unchanged after quicksort", 5, itemArray0.length);
      assertSame("Index 2 should contain the same instance after quicksort", meuItem1, itemArray0[2]);
  }

  /**
   * Given: an array with non-contiguous populated indices
   * When:  quicksort is invoked on an interior index
   * Then:  this implementation may throw NullPointerException when encountering nulls
   *
   * REQ-SORT-QUICK-NPE
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test09()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(941);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;

      // Precondition: ensure nulls exist
      boolean hasNull = false;
      for (Item it : itemArray0) {
          if (it == null) {
              hasNull = true;
              break;
          }
      }
      assertTrue("Precondition: test requires null entries to exercise implementation behavior", hasNull);

      // When / Then
      Ordenacao.quicksort(itemArray0, 6);
  }

  /**
   * Given: a 5-element array with duplicated references
   * When:  quicksort is invoked
   * Then:  it should complete successfully and array length preserved
   *
   * REQ-SORT-QUICK-DUPLICATES
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem((-2531));
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;

      // When
      Ordenacao.quicksort(itemArray0, 3);

      // Then
      assertEquals("Array length unchanged after quicksort", 5, itemArray0.length);
      assertSame("Index 2 should still reference the same MeuItem instance", meuItem0, itemArray0[2]);
  }

  /**
   * Given: a two-element array with identical entries
   * When:  quicksort is invoked on it
   * Then:  method should complete without exception and preserve the duplicate references
   *
   * REQ-SORT-QUICK-TWO-EQUAL
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[2];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;

      // When
      Ordenacao.quicksort(itemArray0, 0);

      // Then
      assertEquals("Array length should remain 2", 2, itemArray0.length);
      assertSame("Both entries should still refer to the same instance after quicksort", meuItem0, itemArray0[0]);
      assertSame("Both entries should still refer to the same instance after quicksort", meuItem0, itemArray0[1]);
  }

  /**
   * Given: the Ordenacao class
   * When:  an instance is constructed
   * Then:  the constructor should produce a non-null object
   *
   * REQ-SORT-CTOR
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
      assertNotNull("Constructor should create a non-null Ordenacao instance", ordenacao0);
  }
}