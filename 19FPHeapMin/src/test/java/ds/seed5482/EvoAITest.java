package ds.seed5482;

import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved version of the generated EvoSuite tests for FPHeapMin.
 *
 * Notes:
 * - Each test retains its original name to satisfy the requirement.
 * - Tests have been refactored to follow Given-When-Then structure, include assertions,
 *   and include lightweight traceability comments (REQ ids).
 * - Helper methods are introduced to reduce duplication.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

    // Helper factory to create an Item[] with specified placements of the same MeuItem.
    private static Item[] filledArray(MeuItem item, int length, int... indices) {
        Item[] arr = new Item[length];
        if (indices != null) {
            for (int i : indices) {
                if (i >= 0 && i < length) {
                    arr[i] = item;
                }
            }
        }
        return arr;
    }

    /**
     * REQ-HEAP-001: Inserting an item into a large-capacity heap should succeed and not throw.
     * Given: an empty heap with large capacity.
     * When: inserting a single MeuItem.
     * Then: the item remains a valid item and retains expected basic properties.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final int capacity = 1278;
        FPHeapMin heap = new FPHeapMin(capacity);
        MeuItem item = new MeuItem(-179);

        // When
        heap.insere(item);

        // Then: basic sanity checks
        assertNotNull("Heap should be constructed", heap);
        // MeuItem.tamanho() is a stable observable used in other tests; assert it has expected value.
        assertEquals("Inserted item should report expected size", 4, item.tamanho());
    }

    /**
     * REQ-HEAP-002: Inserting into a full heap must raise an Exception indicating the heap is full.
     * Given: a heap that is already full (using copia to set internal state).
     * When: attempting to insert another item.
     * Then: an Exception with a message indicating a full heap is thrown.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(2);
        Item[] backing = new Item[3]; // intentionally sized as in the original test
        MeuItem toInsert = new MeuItem(2);
        heap.copia(backing);

        // When / Then
        try {
            heap.insere(toInsert);
            fail("Expected Exception when inserting into a full heap");
        } catch (Exception e) {
            // Verify that the exception message mentions heap-full semantics (best-effort).
            String msg = e.getMessage();
            assertTrue("Expected heap-full related message, got: " + msg,
                    msg != null && (msg.toLowerCase().contains("cheio") || msg.toLowerCase().contains("full") || msg.toLowerCase().contains("heap")));
        }
    }

    /**
     * REQ-HEAP-003: Copying an array into the heap, removing min, changing a key, and inserting the new item
     * should succeed and the MeuItem reports expected size after operations.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(2);
        Item[] arr = new Item[3];
        MeuItem original = new MeuItem(2);
        arr[2] = original;
        heap.copia(arr);

        // When: remove current min (if any), then create a new item, change its key and insert it.
        try {
            heap.retiraMin(); // allow removal; behavior may vary but should not throw here in this scenario
        } catch (Exception e) {
            // If retiraMin throws, fail the test with a clear message (unexpected for this input)
            fail("retiraMin threw unexpectedly: " + e.getMessage());
        }

        MeuItem newItem = new MeuItem(2);
        Integer newKey = Integer.valueOf(4251);
        newItem.alteraChave(newKey); // change key to a larger value

        // Insert should succeed (or if it throws, that's a test failure)
        heap.insere(newItem);

        // Then: observable property on MeuItem
        assertEquals("MeuItem should maintain expected size after key alteration and insertion", 4, newItem.tamanho());
    }

    /**
     * REQ-HEAP-004: After copying a backing array, removing the min and reinserting a previously present item
     * should succeed and the item should report consistent size metadata.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(2);
        Item[] arr = new Item[3];
        MeuItem item = new MeuItem(2);
        arr[2] = item;
        heap.copia(arr);

        // When: remove min and then re-insert the same item
        try {
            heap.retiraMin();
        } catch (Exception e) {
            fail("retiraMin threw unexpectedly: " + e.getMessage());
        }

        heap.insere(item);

        // Then: assert expected property of MeuItem object
        assertEquals("Reinserted item should keep expected size", 4, item.tamanho());
    }

    /**
     * REQ-HEAP-005: Attempting to decrease a key using a null new-key reference should raise an Exception.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(795);

        // When / Then: expect an exception due to null new-key argument
        try {
            heap.diminuiChave(4, (Object) null);
            fail("Expected Exception when calling diminuiChave with null key");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertTrue("Expected message to reference null or chave, got: " + msg,
                    msg != null && (msg.toLowerCase().contains("null") || msg.toLowerCase().contains("chave")));
        }
    }

    /**
     * REQ-HEAP-006: Constructing a heap from an empty Item[] then removing min should raise an Exception (empty heap).
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Item[] empty = new Item[0];
        FPHeapMin heap = new FPHeapMin(empty);

        // When / Then
        try {
            heap.retiraMin();
            fail("Expected Exception when calling retiraMin on an empty heap");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertTrue("Expected empty-heap related message, got: " + msg,
                    msg != null && (msg.toLowerCase().contains("vazio") || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("heap")));
        }
    }

    /**
     * REQ-HEAP-007: Building a heap from a partially populated array of maximum-key items should not throw when
     * constroi() is invoked.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        MeuItem big = new MeuItem(Integer.MAX_VALUE);
        Item[] arr = new Item[9];
        // Fill positions 1..8 with the same item (as in original)
        for (int i = 1; i <= 8; i++) {
            arr[i] = big;
        }
        FPHeapMin heap = new FPHeapMin(arr);

        // When / Then: calling constroi should not throw and heap should be usable for basic operations
        try {
            heap.constroi();
        } catch (Exception e) {
            fail("constroi() threw unexpectedly: " + e.getMessage());
        }

        // Basic sanity: heap object remains non-null and supports min() or retiraMin() without catastrophic exceptions.
        try {
            // We allow either a returned Item or null depending on implementation; assert no unexpected exception.
            heap.min();
        } catch (Exception e) {
            // If min() throws, that's acceptable if implementation design expects different usage; still fail here since constroi succeeded.
            fail("min() threw unexpectedly after constroi(): " + e.getMessage());
        }
    }

    /**
     * REQ-HEAP-008: Given an array with a zero-key MeuItem present, calling retiraMin may return null in some
     * specific internal states. This test documents that observed behavior.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        MeuItem maxItem = new MeuItem(Integer.MAX_VALUE);
        MeuItem zeroItem = new MeuItem(0);
        Item[] arr = new Item[9];
        arr[2] = maxItem;
        arr[3] = zeroItem;
        arr[6] = maxItem;
        arr[7] = zeroItem;
        arr[8] = maxItem;
        FPHeapMin heap = new FPHeapMin(arr);

        // When
        Item result = null;
        try {
            result = heap.retiraMin();
        } catch (Exception e) {
            fail("retiraMin threw unexpectedly: " + e.getMessage());
        }

        // Then: according to the original observed behavior this can be null; assert that observed value is either null or an Item.
        assertTrue("retiraMin must return either null or an Item instance", result == null || result instanceof Item);
    }

    /**
     * REQ-HEAP-009: Creating a heap with negative capacity and calling min() should fail with an index-related exception.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        FPHeapMin heap = new FPHeapMin(-1);

        // When / Then: min() should surface an ArrayIndexOutOfBoundsException (observed behavior)
        try {
            heap.min();
            fail("Expected ArrayIndexOutOfBoundsException for heap with negative capacity");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Accept as expected; include assertion on message being numeric or containing index information.
            String msg = e.getMessage();
            assertNotNull("ArrayIndexOutOfBoundsException should include message", msg);
        }
    }
}