package ds.seed9006;

import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for FPHeapMax focusing on clearer assertions, small helpers,
 * and traceability information (REQ tags). The original EvoSuite-generated
 * tests have been refactored to include descriptive assertions and categories.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

    private static final int CAPACITY_SMALL = 1;
    private static final int CAPACITY_DEFAULT = 1090;
    private static final int CAPACITY_ZERO = 0;

    /**
     * REQ-HEAP-1: Inserting a single element should make it the max; printing must not change heap contents.
     * Given: an empty heap with a reasonable capacity
     * When: insert one element and call imprime()
     * Then: max() returns the inserted element before and after imprime()
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_DEFAULT);
        MeuItem item = new MeuItem(2);

        // Given -> When
        heap.insere(item);

        // Then: the top of the heap should be the inserted item
        Item topBeforePrint = heap.max();
        assertSame("After inserting one item, max() should return the inserted item", item, topBeforePrint);

        // When: call imprime (side-effect: none expected on heap contents)
        heap.imprime();

        // Then: ensure imprime() did not modify the top element
        Item topAfterPrint = heap.max();
        assertSame("imprime() should not change the heap top", item, topAfterPrint);
    }

    /**
     * REQ-HEAP-2: Inserting two different items should preserve ordering: the larger key must be considered different and be the max.
     * Given: an empty heap
     * When: insert a larger item then a smaller item
     * Then: the two items are not equal and the max is the larger one
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_DEFAULT);
        final int SMALL_KEY = 2;
        final int LARGE_KEY = 1090;

        MeuItem smaller = new MeuItem(SMALL_KEY);
        MeuItem larger = new MeuItem(LARGE_KEY);

        // Insert larger first (as in original), then smaller
        heap.insere(larger);
        heap.insere(smaller);

        // Expect the two distinct objects to be unequal
        assertFalse("Two items with different keys should not be equal", smaller.equals((Object) larger));

        // The max should be the larger item
        Item top = heap.max();
        assertNotNull("max() should not be null after inserting items", top);
        // If the implementation preserves object identity at root, check reference; otherwise ensure keys differ by comparing to expected removal
        Item removed = heap.retiraMax();
        assertSame("retiraMax() should return the larger item that was inserted", larger, removed);
    }

    /**
     * REQ-HEAP-3: aumentaChave should validate new key parameter; passing null must produce a clear exception.
     * Given: a heap (capable of holding at least one element)
     * When: aumentaChave is called with a null new key
     * Then: an exception is thrown describing the null new key
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_SMALL);

        try {
            // Act
            heap.aumentaChave(0, (Object) null);
            fail("Expected an exception when calling aumentaChave with null new key (REQ-HEAP-3)");
        } catch (Exception e) {
            // Assert: message should indicate a null new key (Portuguese message expected in original impl)
            String msg = e.getMessage();
            assertNotNull("Exception message should be provided for null new key", msg);
            boolean containsHint = msg.contains("chaveNova") || msg.contains("null") || msg.toLowerCase().contains("nulo") || msg.toLowerCase().contains("null");
            assertTrue("Exception message should mention null/new key: " + msg, containsHint);
        }
    }

    /**
     * REQ-HEAP-4: Removing from an empty heap must produce a clear exception.
     * Given: a newly created heap with capacity 1 and no elements
     * When: retiraMax is invoked
     * Then: an exception indicating the heap is empty is thrown
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_SMALL);

        try {
            heap.retiraMax();
            fail("Expected exception when removing from an empty heap (REQ-HEAP-4)");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception removing from empty heap should include a message", msg);
            boolean containsHint = msg.toLowerCase().contains("vazio") || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("heap");
            assertTrue("Exception message should indicate empty heap: " + msg, containsHint);
        }
    }

    /**
     * REQ-HEAP-5: constroi() should be callable on an empty heap and leave it in a consistent state (max() remains null).
     * Given: an empty heap
     * When: constroi() is invoked
     * Then: heap remains empty (max() == null)
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_DEFAULT);

        // When: build the heap (no elements currently)
        heap.constroi();

        // Then: heap should remain empty and max should be null
        Item top = heap.max();
        assertNull("After constroi() on an empty heap, max() should be null (REQ-HEAP-5)", top);
    }

    /**
     * REQ-HEAP-6: Verify basic sequence of inserts and removals and use copia() to replace underlying array.
     * Given: a heap with small capacity for quicker checks
     * When: insertions and removals are performed and copia is used
     * Then: ordering behavior (max) is preserved and copia/constroi produce a consistent heap
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        FPHeapMax heap = new FPHeapMax(4);
        MeuItem a = new MeuItem(2);
        MeuItem b = new MeuItem(5);
        MeuItem c = new MeuItem(3);

        // Given / When: insert items
        heap.insere(a);
        heap.insere(b);
        heap.insere(c);

        // Then: max should be the item with key 5 (b)
        Item currentMax = heap.max();
        assertNotNull("max() should not be null after inserts", currentMax);
        // Remove max and verify it's b
        Item removed = heap.retiraMax();
        assertSame("First removed item should be the largest inserted (b)", b, removed);

        // Prepare an array with items in a specific layout and replace internal array
        Item[] items = new Item[4];
        items[0] = a;
        items[1] = c;
        items[2] = null; // include a null entry to ensure copia can handle gaps gracefully
        items[3] = null;
        heap.copia(items);

        // Rebuild heap from the copied array and check that max is the largest among present elements (a or c)
        heap.constroi();
        Item newMax = heap.max();
        assertNotNull("After copia() and constroi(), max() should reflect the largest present element", newMax);
        // The remaining items are a(key=2) and c(key=3) so c should be max
        assertSame("After rebuild, the max should be the element with key 3 (c)", c, newMax);
    }

    /**
     * REQ-HEAP-7: Repeatedly inserting the same object should still allow retiraMax to return that object.
     * Given: a heap and multiple identical inserts (same object)
     * When: multiple inserts followed by a single removal
     * Then: the removed object is the same instance inserted
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_DEFAULT);
        MeuItem single = new MeuItem(2);

        // Insert the same instance multiple times
        heap.insere(single);
        heap.insere(single);
        heap.insere(single);
        heap.insere(single);

        // Remove one max and ensure it's the same instance
        Item removed = heap.retiraMax();
        assertSame("retiraMax() should return the same instance that was inserted (by reference)", single, removed);

        // After removing one, the heap may still contain more references to the same object.
        // Remove all remaining and finally heap should be empty.
        heap.retiraMax();
        heap.retiraMax();
        heap.retiraMax();
        assertNull("After removing all inserted elements, max() should be null", heap.max());
    }

    /**
     * REQ-HEAP-8: max() on an empty heap returns null.
     * Given: a newly created heap
     * When: calling max() without prior inserts
     * Then: null is returned
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_DEFAULT);

        Item top = heap.max();
        assertNull("max() on a newly created empty heap should be null (REQ-HEAP-8)", top);
    }

    /**
     * REQ-HEAP-9: Inserting into a heap of capacity zero should raise an exception indicating the heap is full.
     * Given: a heap with zero capacity
     * When: attempting to insert an element
     * Then: an exception indicating 'heap cheio' or similar is thrown
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        FPHeapMax heap = new FPHeapMax(CAPACITY_ZERO);
        MeuItem item = new MeuItem(0);

        try {
            heap.insere(item);
            fail("Expected exception when inserting into a heap with zero capacity (REQ-HEAP-9)");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception inserting into full/zero-capacity heap should include a message", msg);
            boolean containsHint = msg.toLowerCase().contains("cheio") || msg.toLowerCase().contains("full") || msg.toLowerCase().contains("cheia");
            assertTrue("Exception message should indicate a full heap: " + msg, containsHint);
        }
    }
}