package ds.seed5838;

import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Test suite for ds.Max behavior.
 *
 * These tests exercise both exceptional and typical scenarios:
 * - test0 verifies that calling Max.max with a null array results in NullPointerException.
 * - test1 verifies behavior when the array contains null entries and when a single element is present.
 * - test2 verifies the Max class can be instantiated and that Max.max returns one of the provided items.
 *
 * Traceability: REQ-1234 (Max selection behavior).
 */
public class EvoAITest {

  /**
   * Scenario: Passing a null Item[] to Max.max
   * Expectation: NullPointerException is thrown.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test0() throws Throwable {
    // Given a null array reference
    Item[] items = null;

    // When / Then: calling Max.max should throw NullPointerException
    Max.max(items, 1);
  }

  /**
   * Scenario: Max.max with an array of null entries and with a single valid element.
   * Expectations:
   *  - When the first element is null, Max.max(..., 1) returns null.
   *  - When the first element is set to a MeuItem, Max.max(..., 1) returns that same element.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given an array with nine slots, all initially null
    Item[] itemArray = new Item[9];

    // When: requesting the max for the first element (which is null)
    Item resultWhenNull = Max.max(itemArray, 1);

    // Then: result should be null and include descriptive message
    assertNull("Expected null when the requested element(s) are all null", resultWhenNull);

    // Given: set the first element to a concrete MeuItem
    MeuItem single = new MeuItem(42);
    itemArray[0] = single;

    // When: requesting max among the first element
    Item resultSingle = Max.max(itemArray, 1);

    // Then: result should be the same instance we placed in the array
    assertSame("Expected Max.max to return the same single provided item", single, resultSingle);
  }

  /**
   * Scenario: Constructing Max and using it with a small non-empty array.
   * Expectations:
   *  - Max can be instantiated.
   *  - Max.max returns a non-null Item when provided with non-null items, and that item must be one of the inputs.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: instantiate Max (verifies default constructor exists)
    Max maxInstance = new Max();
    assertNotNull("Max instance should not be null after construction", maxInstance);

    // Given: two MeuItem instances with different values
    MeuItem lower = new MeuItem(5);
    MeuItem higher = new MeuItem(10);
    Item[] items = new Item[] { lower, higher };

    // When: asking for the maximum among both items
    Item result = Max.max(items, items.length);

    // Then: result should be non-null and must be one of the provided items
    assertNotNull("Expected a non-null result when items are provided", result);
    boolean isProvided = result == lower || result == higher;
    assertTrue("Result should be one of the provided items", isProvided);
  }
}