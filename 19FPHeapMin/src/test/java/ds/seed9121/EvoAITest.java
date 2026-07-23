package ds.seed9121;

import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Test suite for FPHeapMin behaviors.
 *
 * Requirement traceability:
 * - REQ-HEAP-001: Basic construction and query operations (min, retiraMin)
 * - REQ-HEAP-002: Insertion behavior and duplicate handling
 * - REQ-HEAP-003: Error handling for full/empty heap and null inputs
 *
 * These tests are written with Given-When-Then comments to clarify intent.
 */
@RunWith(JUnit4.class)
public class EvoAITest {

    /* Helper: create a MeuItem for readability */
    private MeuItem mi(int v) {
        return new MeuItem(v);
    }

    /* Helper: assert that an exception message contains an expected fragment */
    private void assertExceptionContains(Exception e, String fragment) {
        String msg = e.getMessage();
        assertTrue("Expected exception message to contain \"" + fragment + "\" but was: " + msg,
                msg != null && msg.contains(fragment));
    }

    /**
     * Given: an item array with two identical MeuItem instances in positions 1 and 2
     * When: constructing a FPHeapMin from that array and building the heap
     * Then: min() should return a non-null Item and original array references remain unchanged
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Item[] itemArray0 = new Item[3];
        MeuItem meuItem0 = mi(-1478);
        itemArray0[1] = meuItem0;
        itemArray0[2] = meuItem0;

        // When
        FPHeapMin heap = new FPHeapMin(itemArray0);
        heap.constroi();      // ensure heap structure is built
        heap.imprime();       // exercise printing path (side-effect)

        // Then
        Item min = heap.min();
        assertNotNull("min() should not be null after constructing from array with elements", min);
        assertTrue("min() should return an Item instance", min instanceof Item);
        // the input array references should still refer to the same MeuItem instance
        assertSame("array positions should still refer to the same object",
                itemArray0[1], itemArray0[2]);
        assertSame("array position retained the original instance",
                meuItem0, itemArray0[1]);
    }

    /**
     * Given: a heap with capacity zero
     * When: attempting to insert any item
     * Then: an Exception indicating a full heap is thrown
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(0);
        MeuItem item = mi(0);

        // When / Then
        try {
            heap.insere(item);
            fail("Expected Exception due to heap full, but insere completed without exception");
        } catch (Exception e) {
            // Verify informative message about heap full
            assertExceptionContains(e, "cheio");
        }
    }

    /**
     * Given: an empty heap with sufficient capacity and two distinct items
     * When: both items are inserted
     * Then: min() should reflect the smaller-key item and retiraMin() should remove it, exposing the next
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(20);
        MeuItem small = mi(1);
        MeuItem large = mi(20);

        // When
        heap.insere(small);
        heap.insere(large);

        // Then
        assertNotSame("Inserted items should be distinct instances", large, small);
        Item currentMin = heap.min();
        assertNotNull("min() should not be null after inserting items", currentMin);
        // The min should be the 'small' item instance
        assertSame("min() should return the smaller-key item", small, currentMin);

        // Remove min and ensure next min is the other item
        Item removed = heap.retiraMin();
        assertSame("retiraMin() should remove and return the smallest item", small, removed);
        Item nextMin = heap.min();
        assertSame("After removing smallest, next min should be the remaining item", large, nextMin);
    }

    /**
     * Given: a heap with capacity > 0 and a single MeuItem
     * When: the same MeuItem instance is inserted twice
     * Then: the MeuItem internal counter (tamanho) reflects the expected aggregated state and min() agrees
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(20);
        MeuItem item = mi(1);

        // When: insert the same logical item twice to exercise duplicate handling
        heap.insere(item);
        heap.insere(item);

        // Then
        // Verify that the heap reports this item as minimal
        Item min = heap.min();
        assertSame("Inserted duplicate should be the current min", item, min);

        // Verify internal 'tamanho' changed as expected (regression from original test)
        // This documents the observed behavior: after two insertions the meuItem tamanho() is 4
        assertEquals("MeuItem.tamanho() should reflect two insertions (regression expectation)", 4, item.tamanho());
    }

    /**
     * Given: a heap
     * When: calling diminuiChave with a null key argument
     * Then: an Exception is thrown indicating the null input is invalid
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(109);

        // When / Then
        try {
            heap.diminuiChave(0, (Object) null);
            fail("Expected Exception due to null chaveNova, but call completed without exception");
        } catch (Exception e) {
            // Verify message mentions null to help diagnosing the problem
            assertExceptionContains(e, "null");
        }
    }

    /**
     * Given: an empty heap
     * When: attempting to remove the minimum element
     * Then: an Exception indicating the heap is empty is thrown
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(159);

        // When / Then
        try {
            heap.retiraMin();
            fail("Expected Exception due to empty heap, but retiraMin completed without exception");
        } catch (Exception e) {
            assertExceptionContains(e, "vazio");
        }
    }

    /**
     * Given: a large-capacity heap and an array with several placements of the same MeuItem
     * When: copying the array into the heap and then removing the min
     * Then: min and retiraMin behave consistently and return the expected item instance
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        MeuItem repeated = mi(1);
        FPHeapMin heap = new FPHeapMin(458);
        Item[] items = new Item[6];
        items[2] = repeated;
        items[3] = repeated;
        items[5] = repeated;

        // When
        heap.copia(items);

        // Then
        Item min = heap.min();
        assertNotNull("min() should not be null after copying an array containing items", min);
        // retiraMin should return a non-null item (the repeated one)
        Item removed = heap.retiraMin();
        assertNotNull("retiraMin() should return the item that was present", removed);
        assertTrue("Returned item should be an instance of Item", removed instanceof Item);
    }

    /**
     * Given: an array with some null slots and some MeuItem instances
     * When: constructing a heap from that array and calling retiraMin()
     * Then: the implementation may throw a NullPointerException for malformed input; we assert that it fails fast
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        Item[] itemArray0 = new Item[5];
        MeuItem zero = mi(0);
        MeuItem one = mi(1);
        itemArray0[2] = one;
        itemArray0[3] = zero;

        FPHeapMin heap = new FPHeapMin(itemArray0);

        // When / Then: original behavior threw NullPointerException; preserve that expectation and assert occurrence
        try {
            heap.retiraMin();
            fail("Expected NullPointerException due to incomplete/invalid internal state after construction");
        } catch (NullPointerException e) {
            // no message expected; assert exception class only
            assertTrue("Expected a NullPointerException for malformed heap input", e instanceof NullPointerException);
        }
    }

    /**
     * Given: a small array with mixed positive and negative MeuItem values
     * When: constructing a heap and building it via constroi()
     * Then: the heap min should be non-null and retiraMin should successfully remove an element
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        Item[] items = new Item[3];
        MeuItem negative = mi(-1478);
        MeuItem positive = mi(1731);
        items[1] = positive;
        items[2] = negative;

        FPHeapMin heap = new FPHeapMin(items);

        // When
        heap.constroi();

        // Then
        Item min = heap.min();
        assertNotNull("min() should not be null after building heap from non-empty array", min);
        assertTrue("min() should be an Item", min instanceof Item);
        Item removed = heap.retiraMin();
        assertNotNull("retiraMin() should remove and return an item", removed);
    }

    /**
     * Given: an empty heap with large capacity
     * When: querying min()
     * Then: min() returns null and retiraMin() raises an exception for empty heap
     */
    @Test(timeout = 4000)
    public void test9() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(3323);

        // When
        Item minBefore = heap.min();

        // Then
        assertNull("min() should return null for an empty heap", minBefore);

        // And when attempting to remove, expect an informative exception
        try {
            heap.retiraMin();
            fail("Expected Exception when removing from empty heap");
        } catch (Exception e) {
            assertExceptionContains(e, "vazio");
        }
    }
}