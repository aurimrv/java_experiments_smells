package ds.seed9121;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface used to categorize tests as unit tests.
 * Must be defined at package level so it can be referenced by @Category.
 */
interface UnitTest {}

/**
 * Improved and more descriptive tests for FPHeapMax.
 *
 * Note: Method names from the original generated suite are preserved (test0..test9)
 * as required by the automated transformation task. Each test has been enhanced with
 * clear Given/When/Then structure, assertions, and small documentation linking to
 * a hypothetical requirement id for traceability.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

    // Helper to create items consistently
    private MeuItem item(int chave) {
        return new MeuItem(chave);
    }

    /**
     * REQ-HEAP-001: Inserting a single item should make it visible as the heap maximum,
     * and retiraMax should return that same item and leave the heap empty.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: an empty heap with capacity 4
        FPHeapMax heap = new FPHeapMax(4);
        MeuItem element = item(456);

        // When: inserting the element and printing the heap (imprime should not modify structure)
        heap.insere(element);
        heap.imprime(); // exercise printing; should not throw

        // Then: max() should return the inserted element (same reference),
        // retiraMax() should return it and subsequent max() should be null.
        Item peek = heap.max();
        assertSame("After single insert, max() should return the inserted item", element, peek);

        Item removed = heap.retiraMax();
        assertSame("retiraMax() should return the same item that was inserted", element, removed);

        assertNull("Heap should be empty after removing the only element", heap.max());
    }

    /**
     * REQ-HEAP-002: copia should initialize internal heap from a provided array of Items.
     * After copying a larger element and inserting a smaller one, the larger should remain as max.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a heap and an array with a single high-value element
        FPHeapMax heap = new FPHeapMax(4);
        Item[] items = new Item[3];
        MeuItem large = item(1297);
        items[1] = large;

        // When: copying the array into the heap
        heap.copia(items);

        // Then: the max should be the large item
        Item currentMax = heap.max();
        assertSame("After copia, the provided non-null element should be the heap max", large, currentMax);

        // When: inserting a smaller element
        MeuItem smaller = item(456);
        heap.insere(smaller);

        // Then: max should still be the large element and the two items should not be equal
        assertSame("Inserting a smaller element should not change the max", large, heap.max());
        assertFalse("Two distinct items with different keys should not be equal", smaller.equals((Object) large));
    }

    /**
     * REQ-HEAP-003: aumentaChave should validate its inputs and throw a descriptive Exception
     * if the new key is null.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a heap with capacity 1
        FPHeapMax heap = new FPHeapMax(1);

        // When/Then: calling aumentaChave with a null new key should raise an Exception
        try {
            heap.aumentaChave(1, (Object) null);
            fail("Expected exception when calling aumentaChave with null chaveNova");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception for null chaveNova should include a message", msg);
            assertTrue("Exception message should indicate null chaveNova", msg.toLowerCase().contains("null") || msg.toLowerCase().contains("chavenova"));
        }
    }

    /**
     * REQ-HEAP-004: retiraMax on an empty heap should throw an Exception indicating the heap is empty.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: a freshly created heap with capacity 1159 that is empty
        FPHeapMax heap = new FPHeapMax(1159);

        // When/Then: retiraMax should throw an Exception complaining that the heap is empty
        try {
            heap.retiraMax();
            fail("Expected Exception when removing max from an empty heap");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception message for empty-heap removal should be provided", msg);
            assertTrue("Exception message should mention that the heap is empty", msg.toLowerCase().contains("heap") && msg.toLowerCase().contains("vazio"));
        }
    }

    /**
     * REQ-HEAP-005: If internal array contains null entries in unexpected places, retiraMax may raise NPE.
     * This test documents that behavior and asserts the exception type and that it has no message.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: a heap and an array with some nulls and some non-null items
        FPHeapMax heap = new FPHeapMax(1609);
        Item[] items = new Item[6];
        MeuItem a = item(1609);
        items[2] = a;
        items[3] = a;
        MeuItem b = item(0);
        items[5] = b;

        // When: copying the array into the heap
        heap.copia(items);

        // Then: retiraMax currently triggers a NullPointerException in this implementation.
        try {
            heap.retiraMax();
            fail("Expected NullPointerException when internal state contains unexpected nulls");
        } catch (NullPointerException npe) {
            // the implementation observed returns an NPE with no message
            assertNull("NullPointerException thrown by retiraMax is expected to have no message", npe.getMessage());
        }
    }

    /**
     * REQ-HEAP-006: Similar to test4, ensure that retiraMax signals the implementation problem (NPE).
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given: a heap and an array with non-contiguous elements
        FPHeapMax heap = new FPHeapMax(1609);
        Item[] items = new Item[6];
        MeuItem a = item(1609);
        MeuItem b = item(0);
        items[2] = b;
        items[3] = a;

        heap.copia(items);

        // When/Then: retiraMax throws NullPointerException; assert exception type and origin
        try {
            heap.retiraMax();
            fail("Expected NullPointerException due to internal inconsistent state after copia");
        } catch (NullPointerException npe) {
            assertNull("Expected no message on the observed NullPointerException", npe.getMessage());
        }
    }

    /**
     * REQ-HEAP-007: Multiple inserts followed by constroi should preserve the maximum element.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given: a heap with capacity 4 and a repeated element
        FPHeapMax heap = new FPHeapMax(4);
        MeuItem repeated = item(456);

        // When: inserting the same element multiple times and building internal structure
        heap.insere(repeated);
        heap.insere(repeated);
        heap.insere(repeated);
        heap.insere(repeated);
        heap.constroi(); // rebuild/heapify

        // Then: max should be the repeated element (same reference)
        Item max = heap.max();
        assertSame("After multiple inserts and constroi, max() should return the repeated item", repeated, max);
    }

    /**
     * REQ-HEAP-008: refaz should be safe for out-of-range parameters and not throw unexpected exceptions.
     * Here we call refaz with the top index and a negative bound to exercise robustness.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given: an empty heap with a large capacity
        FPHeapMax heap = new FPHeapMax(1159);

        // When: calling refaz with an index equal to capacity and a negative limit
        // Then: method should not throw and heap remains empty
        heap.refaz(1159, -1);
        assertNull("Heap remains empty after a benign refaz call", heap.max());
    }

    /**
     * REQ-HEAP-009: max on a newly created heap should return null.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given: a new heap with capacity 1159
        FPHeapMax heap = new FPHeapMax(1159);

        // When: querying max on an empty heap
        Item result = heap.max();

        // Then: should be null
        assertNull("max() on a new/empty heap should return null", result);
    }

    /**
     * REQ-HEAP-010: Inserting into a zero-capacity heap should produce an Exception indicating the heap is full.
     */
    @Test(timeout = 4000)
    public void test9() throws Throwable {
        // Given: a heap with zero capacity and an item to insert
        FPHeapMax heap = new FPHeapMax(0);
        MeuItem el = item(1137);

        // When/Then: attempting to insert should throw an Exception indicating the heap is full
        try {
            heap.insere(el);
            fail("Expected Exception when inserting into a zero-capacity heap");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception inserting into full heap should include a message", msg);
            assertTrue("Exception message should indicate the heap is full", msg.toLowerCase().contains("cheio") || msg.toLowerCase().contains("full"));
        }
    }
}