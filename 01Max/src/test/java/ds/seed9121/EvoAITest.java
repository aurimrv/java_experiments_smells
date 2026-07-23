package ds.seed9121;

import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Max utility.
 *
 * Requirement: REQ-MAX-001 - Determine the maximum Item from an array of Items
 *
 * These tests follow a Given-When-Then structure and include boundary checks
 * and basic happy-path verification. They are intentionally small, focused,
 * and include descriptive assertion messages for easier diagnosis.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    private static final int TIMEOUT = 4000;

    /* Helper factory to create an Item[] populated with MeuItem instances.
     * The order of values is preserved so tests can assert on reference identity.
     */
    private static Item[] createMeuItems(int... values) {
        Item[] items = new Item[values.length];
        for (int i = 0; i < values.length; i++) {
            items[i] = new MeuItem(values[i]);
        }
        return items;
    }

    /**
     * Given an array of MeuItem with distinct integer values,
     * when Max.max is invoked with a count equal to the number of elements,
     * then it should return the element with the largest value (by reference).
     */
    @Test(timeout = TIMEOUT)
    public void test0() throws Throwable {
        // Given
        Item[] items = createMeuItems(5, 10, 7);

        // When
        Item result = Max.max(items, items.length);

        // Then
        assertNotNull("Expected non-null result when requesting max from a non-empty array", result);
        // The 10 is at index 1, so expect the same reference back
        assertSame("Expected the MeuItem with value 10 to be returned as the maximum", items[1], result);

        // Additional sanity: ensure calling with a smaller count excludes later elements
        Item partial = Max.max(items, 2); // considers only indices 0 and 1
        assertSame("With count 2, the maximum should still be the item at index 1", items[1], partial);
    }

    /**
     * Given arrays with no available elements or invalid counts,
     * when Max.max is invoked with zero or negative count,
     * then it should return null.
     */
    @Test(timeout = TIMEOUT)
    public void test1() throws Throwable {
        // Given: an array with null entries (simulating uninitialized slots)
        Item[] nullSlots = new Item[2];

        // When: negative count
        Item resultNegative = Max.max(nullSlots, -2156);

        // Then
        assertNull("Expected null result when count is negative", resultNegative);

        // Boundary: zero count should also return null regardless of array capacity
        Item resultZero = Max.max(nullSlots, 0);
        assertNull("Expected null result when count is zero (no elements considered)", resultZero);
    }

    /**
     * Basic construction and behavior checks:
     * Max can be instantiated and behaves reasonably for empty arrays.
     */
    @Test(timeout = TIMEOUT)
    public void test2() throws Throwable {
        // Given / When: construct Max
        Max maxInstance = new Max();

        // Then: instance should be non-null (sanity)
        assertNotNull("Max instance should be constructible", maxInstance);

        // Given an empty array, requesting max over zero elements should return null
        Item[] empty = new Item[0];
        Item resultEmpty = Max.max(empty, 0);
        assertNull("Expected null when computing max of an empty array with count 0", resultEmpty);
    }
}