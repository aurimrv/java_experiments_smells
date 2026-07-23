package ds.seed5838;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved unit tests for FPHeapMax.
 *
 * Traceability: REQ-HEAP-001 - basic heap operations (insert, max, remove, build).
 *
 * Notes:
 * - Tests follow Given-When-Then comments and assert useful properties.
 * - Magic numbers are replaced with named constants where practical.
 * - Each test focuses on a single behavior.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

    private static final int DEFAULT_CAPACITY = 463;
    private static final int ZERO_CAPACITY = 0;
    private static final int SMALL_CAPACITY = 5;

    // Helper to create a heap with given capacity.
    private FPHeapMax newHeap(int capacity) {
        return new FPHeapMax(capacity);
    }

    // Helper to create MeuItem with given key.
    private MeuItem mi(int key) {
        return new MeuItem(key);
    }

    /**
     * Given an empty heap, when inserting a single item, then max() should return that inserted item.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(DEFAULT_CAPACITY);
        MeuItem item = mi(463);

        // When
        heap.insere(item);

        // Then
        // The same object should be exposed as the maximum immediately after insertion.
        Item currentMax = heap.max();
        Assert.assertSame("After inserting a single item, max() should return the same instance", item, currentMax);

        // And calling imprime() must not throw and should be safe (side-effect only).
        heap.imprime();
    }

    /**
     * Given a heap with zero capacity, when attempting to insert, then an Exception should be thrown.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(ZERO_CAPACITY);
        MeuItem item = mi(0);

        // When / Then
        try {
            heap.insere(item);
            Assert.fail("Expected an exception when inserting into a heap with zero capacity");
        } catch (Exception e) {
            // Basic checks on the exception to ensure a meaningful error is produced.
            Assert.assertNotNull("Exception message should not be null", e.getMessage());
            Assert.assertTrue("Exception message should indicate an error", e.getMessage().length() > 0);
        }
    }

    /**
     * Given a heap and two inserted items (large and small), then the heap should report the large item as max.
     * Also verify a property of the inserted smaller item (tamanho) as a sanity check of the item API.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(2); // minimal capacity for two inserts
        MeuItem large = mi(1654);
        MeuItem small = mi(19);

        // When
        heap.insere(large);
        heap.insere(small);

        // Then
        Item currentMax = heap.max();
        Assert.assertSame("Largest inserted item should be reported as max", large, currentMax);

        // Also assert an observable property of the MeuItem instance (preserves original check).
        // This verifies that MeuItem.tamanho() returns the expected size-related value (regression check).
        Assert.assertEquals("MeuItem.tamanho() returned unexpected value", 4, small.tamanho());
    }

    /**
     * Given a heap, when aumentaChave is called with a null new key, then an Exception should be thrown.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(2447);
        // When / Then
        try {
            heap.aumentaChave(2447, (Object) null);
            Assert.fail("Expected an exception when calling aumentaChave with a null new key");
        } catch (Exception e) {
            // Validate the exception provides at least a non-empty message (avoid relying on exact text).
            Assert.assertNotNull("Exception message should not be null", e.getMessage());
            Assert.assertTrue("Exception message should contain some diagnostic text", e.getMessage().length() > 0);
        }
    }

    /**
     * Given an empty heap, when retiraMax is invoked, then an Exception should be thrown indicating the heap is empty.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(2552);

        // When / Then
        try {
            heap.retiraMax();
            Assert.fail("Expected an exception when removing max from an empty heap");
        } catch (Exception e) {
            Assert.assertNotNull("Exception message should not be null", e.getMessage());
            Assert.assertTrue("Exception message should contain some diagnostic text", e.getMessage().length() > 0);
        }
    }

    /**
     * Given a copied array representing heap elements, when constroi is invoked, then the heap should be built
     * and retiraMax should return the previously supplied maximum element.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(SMALL_CAPACITY);
        // Prepare an array for copia/constroi - assume 1-based indexing as original tests implied.
        Item[] items = new Item[SMALL_CAPACITY + 1];
        MeuItem i1 = mi(1);
        MeuItem i3 = mi(3); // expected max
        MeuItem i2 = mi(2);
        items[1] = i1;
        items[2] = i3;
        items[3] = i2;
        // When
        heap.copia(items);
        heap.constroi();

        // Then
        Item removed = heap.retiraMax();
        Assert.assertSame("After building from array, the returned max should be the same instance placed in the array", i3, removed);
    }

    /**
     * Given a partial array containing null entries, when constroi is invoked, then a NullPointerException is expected.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(3);
        MeuItem some = mi(1654);
        heap.insere(some);

        Item[] items = new Item[6];
        // Intentionally leave many entries null to simulate malformed input to constroi.
        items[4] = some;
        items[5] = some;

        // When / Then
        try {
            heap.copia(items);
            heap.constroi();
            Assert.fail("Expected NullPointerException when building from an array that includes null or missing elements");
        } catch (NullPointerException e) {
            // Expected: building with nulls should fail with NPE.
            Assert.assertNull("NullPointerException typically has no message", e.getMessage());
        }
    }

    /**
     * Given a copied array with some unset slots, when constroi is invoked, then a NullPointerException is expected.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(1654);
        MeuItem present = mi(1654);
        heap.insere(present);

        Item[] items = new Item[6];
        // Place a valid element and another with a potentially problematic value.
        items[2] = mi(-2);
        items[5] = present;

        // When / Then
        try {
            heap.copia(items);
            heap.constroi();
            Assert.fail("Expected NullPointerException when building heap from array with missing/null entries");
        } catch (NullPointerException e) {
            Assert.assertNull("NullPointerException typically has no message", e.getMessage());
        }
    }

    /**
     * Given a newly created empty heap, max() should return null.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        FPHeapMax heap = newHeap(1698);

        // When
        Item item0 = heap.max();

        // Then
        Assert.assertNull("An empty heap should report null for max()", item0);
    }
}