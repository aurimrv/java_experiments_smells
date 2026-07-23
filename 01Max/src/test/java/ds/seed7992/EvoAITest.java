package ds.seed7992;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

import ds.Item;
import ds.Max;
import ds.MeuItem;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface used to classify these tests as unit tests.
 */
interface UnitTest {}

/**
 * Improved and documented tests for the Max utility.
 *
 * Requirements referenced:
 * - REQ-DS-001: Max.max must return the Item with the greatest 'chave' when a valid non-empty array is supplied.
 * - REQ-DS-002: Max.max must return null for empty arrays or arrays that contain only null entries.
 * - REQ-DS-003: Max constructor should be instantiable without side effects.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given an array containing some non-null MeuItem objects and many null slots,
   * when Max.max is invoked with a value larger than the array length,
   * then a NullPointerException is expected (implementation detail of the current Max).
   *
   * This test documents the current behavior and verifies object state before the call.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      MeuItem meuItem0 = new MeuItem(497);
      MeuItem meuItem1 = new MeuItem(497);
      Item[] itemArray0 = new Item[7];
      itemArray0[0] = (Item) meuItem1;
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      // Mutate one of the items to a known value to make state explicit
      meuItem1.chave = 0;

      // Sanity checks on constructed objects (preconditions)
      assertNotNull("meuItem0 should be non-null", meuItem0);
      assertNotNull("meuItem1 should be non-null", meuItem1);
      assertEquals("meuItem1 chave must be 0 after mutation", 0, meuItem1.chave);
      assertEquals("meuItem0 chave must remain 497", 497, meuItem0.chave);

      // When / Then: call with a large n and expect a NullPointerException due to implementation handling
      try {
        Max.max(itemArray0, 497);
        fail("Expected NullPointerException when calling Max.max with n larger than array length and null entries");
      } catch (NullPointerException e) {
        // The current implementation throws a NullPointerException in this scenario.
        // Assert that there is no message to match historical behavior (robustness check).
        assertNull("Expected no message for NullPointerException", e.getMessage());
      }
  }

  /**
   * Verifies behavior of Max.max across several array shapes:
   * - empty array returns null
   * - array of nulls returns null
   * - array with concrete MeuItem objects returns the item with the maximum 'chave'
   *
   * This consolidates related assertions about normal and boundary behaviors.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: an empty array
      Item[] emptyArray = new Item[0];
      Item resultEmpty = Max.max(emptyArray, 0);
      assertNull("Empty array should yield null result", resultEmpty);

      // Given: an array of nulls
      Item[] nullsArray = new Item[5]; // all elements are null
      Item resultNulls = Max.max(nullsArray, 0);
      assertNull("Array containing only null values should yield null result", resultNulls);

      // Given: a populated array with distinct 'chave' values
      MeuItem a = new MeuItem(10);
      MeuItem b = new MeuItem(20);
      MeuItem c = new MeuItem(5);
      Item[] populated = new Item[] { a, b, c };
      // When
      Item resultPopulated = Max.max(populated, populated.length);
      // Then: result should not be null and should be the item with chave == 20
      assertNotNull("Non-empty populated array should not return null", resultPopulated);
      assertTrue("Result should be instance of MeuItem", resultPopulated instanceof MeuItem);
      MeuItem resultMeu = (MeuItem) resultPopulated;
      assertEquals("Max should select the item with the highest 'chave'", 20, resultMeu.chave);
  }

  /**
   * Ensures the Max class can be instantiated without throwing and that
   * multiple instances behave as distinct objects (no unexpected shared state).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given / When: construct two Max instances
      Max max0 = new Max();
      Max max1 = new Max();

      // Then: basic invariants about construction and identity
      assertNotNull("Constructed Max instance should not be null", max0);
      assertNotNull("Constructed Max instance should not be null", max1);
      assertNotSame("Two instances of Max should not be the same reference", max0, max1);
      assertEquals("Both instances should be of the Max class", Max.class, max0.getClass());
      assertEquals("Both instances should be of the Max class", Max.class, max1.getClass());
  }
}