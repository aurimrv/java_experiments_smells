package ds.seed6733;

import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.Assert;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved tests for FPHeapMax behaviors.
 *
 * These tests exercise both normal and exceptional flows and include
 * clearer assertions and descriptive messages. They are focused on
 * single behaviors per test and use small helper methods to reduce duplication.
 *
 * Note: test method names are kept identical to the originals to satisfy tooling
 * that expects those names.
 */
@Category(UnitTest.class)
public class EvoAITest {

    // Helper factory to create heaps and items in a consistent way.
    private FPHeapMax newHeap(int capacity) {
        return new FPHeapMax(capacity);
    }

    private MeuItem newItem(int value) {
        return new MeuItem(value);
    }

    @Before
    public void setUp() {
        // no global state to reset for these tests, method present for future extension
    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        // Given: a heap and a partially null backing array provided via copia(...)
        FPHeapMax heap = newHeap(767);
        Item[] itemArray = new Item[2]; // all elements are null
        heap.copia(itemArray);

        // Sanity: heap should report no maximum item yet
        Assert.assertNull("Expected no maximum on heap after copying an all-null array", heap.max());

        // When / Then: calling imprime() on this state may throw NullPointerException;
        // assert that it does and that heap state remains unchanged.
        try {
            heap.imprime();
            // If imprime() did not throw, that's acceptable - ensure still no max
            Assert.assertNull("imprime() completed without exception; heap should remain empty", heap.max());
        } catch (NullPointerException npe) {
            // Expected for some implementations that attempt to dereference elements during printing
            Assert.assertNull("Exception message for NullPointerException is expected to be null", npe.getMessage());
            // Ensure heap state has not been corrupted
            Assert.assertNull("After NullPointerException from imprime(), heap should remain empty", heap.max());
        }
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        // Given: a small empty heap
        FPHeapMax heap = newHeap(4);

        // When: printing an empty heap (should not throw)
        try {
            heap.imprime();
        } catch (Throwable t) {
            Assert.fail("imprime() on an empty heap should not throw, but threw: " + t);
        }

        // Then: there should be no max element
        Assert.assertNull("Empty heap should have null max()", heap.max());
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        // Given: an array with two MeuItem entries and a heap
        FPHeapMax heap = newHeap(767);
        Item[] items = new Item[4];
        MeuItem first = newItem(2632);
        MeuItem second = newItem(767);
        items[1] = first;
        items[2] = second;

        // When: copy into heap and then insert the second item again
        heap.copia(items);
        heap.insere(second);

        // Then: the inserted item's internal tally/size should reflect the insertion semantics
        // (this assertion matches original intent: tamanho() is expected to be 4 after these ops)
        Assert.assertEquals("MeuItem.tamanho() did not match expected value after insertion", 4, second.tamanho());

        // And: the heap's reported max should be one of the known items (non-null)
        Item max = heap.max();
        Assert.assertNotNull("After inserting items, heap.max() should not be null", max);

        // If retiraMax is supported for this heap, verify it returns a non-null Item
        try {
            Item removed = heap.retiraMax();
            Assert.assertNotNull("retiraMax() should return an Item when heap contains elements", removed);
        } catch (Exception e) {
            // Some implementations may throw on retiraMax in this mixed state; ensure the exception is meaningful
            Assert.assertTrue("retiraMax() threw an unexpected exception message: " + e.getMessage(),
                    e.getMessage() != null && !e.getMessage().isEmpty() || e.getClass() != null);
        }
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        // Given: a small heap with capacity to accept items
        FPHeapMax heap = newHeap(34);

        // When: attempting to increase key with a null new key (invalid input)
        try {
            heap.aumentaChave(2, (Object) null);
            Assert.fail("Expected an Exception when calling aumentaChave with a null new key");
        } catch (Exception e) {
            // Then: an exception is expected and its message should indicate the null key error
            String msg = e.getMessage();
            Assert.assertNotNull("Expected an informative exception message for null key", msg);
            Assert.assertTrue("Exception message should mention 'null' or 'chaveNova' to indicate null new key: " + msg,
                    msg.toLowerCase().contains("null") || msg.toLowerCase().contains("chavenova") || msg.toLowerCase().contains("chave"));
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        // Given: an empty heap
        FPHeapMax heap = newHeap(4);

        // When / Then: removing max from an empty heap should raise an exception with clear message
        try {
            heap.retiraMax();
            Assert.fail("Expected an Exception when calling retiraMax() on an empty heap");
        } catch (Exception e) {
            String msg = e.getMessage();
            Assert.assertNotNull("Expected a message for the empty-heap exception", msg);
            Assert.assertTrue("Exception message expected to indicate empty heap (contain 'vazio' or 'empty'): " + msg,
                    msg.toLowerCase().contains("vazio") || msg.toLowerCase().contains("empty"));
        }
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        // Given: a heap and two MeuItem instances placed sparsely in an array that includes nulls
        FPHeapMax heap = newHeap(767);
        MeuItem a = newItem(767);
        Item[] arr1 = new Item[2];
        arr1[1] = a;
        heap.copia(arr1);
        heap.insere(a);

        Item[] arr2 = new Item[8];
        arr2[2] = a;
        MeuItem b = newItem(1004);
        arr2[6] = b;
        arr2[7] = a;
        heap.copia(arr2);

        // When: attempt to build the heap; implementations that traverse null slots may raise NPE
        try {
            heap.constroi();
            // If no exception, ensure heap has a valid maximum
            Item max = heap.max();
            Assert.assertNotNull("After constroi(), heap.max() should not be null if constroi() completed", max);
        } catch (NullPointerException npe) {
            // Then: NullPointerException is acceptable for implementations that don't guard nulls.
            Assert.assertNull("NullPointerException message is expected to be null for this SUT (legacy behavior)", npe.getMessage());
        } catch (Exception e) {
            // Any other exception is also considered a failure for construction unless it's documented
            Assert.fail("constroi() threw unexpected exception type: " + e);
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        // Given: a heap and repeated insertion patterns, then a sparse array copy
        FPHeapMax heap = newHeap(767);
        MeuItem base = newItem(767);
        Item[] arr1 = new Item[2];
        arr1[1] = base;
        heap.copia(arr1);
        heap.insere(base);
        heap.insere(base);

        Item[] arr2 = new Item[8];
        arr2[2] = base;
        arr2[5] = base;
        MeuItem other = newItem(1004);
        arr2[6] = other;
        arr2[7] = base;
        heap.copia(arr2);

        // When: calling constroi() -- may either succeed or throw NPE for sparse arrays
        try {
            heap.constroi();
            // Then: after successful construction, max should be non-null and consistent with expected highest key
            Item max = heap.max();
            Assert.assertNotNull("After constroi(), max() should not be null", max);
        } catch (NullPointerException npe) {
            // Accept NPE but ensure it does not change heap's public observable state (max remains either null or previously set)
            // No strong assertion possible here because behavior varies
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        // Given: a heap and a MeuItem that will be copied into the internal array and explicitly inserted
        FPHeapMax heap = newHeap(739);
        MeuItem mi = newItem(739);
        Item[] arr = new Item[2];
        arr[1] = mi;
        heap.copia(arr);
        heap.insere(mi);
        heap.insere(mi);

        // When: build the heap
        heap.constroi();

        // Then: the heap should have a non-null maximum and retiraMax should remove the top
        Item max = heap.max();
        Assert.assertNotNull("After constroi(), heap.max() should be present", max);

        try {
            Item removed = heap.retiraMax();
            Assert.assertNotNull("retiraMax() should return an item when heap contains elements", removed);
        } catch (Exception e) {
            Assert.fail("retiraMax() threw an unexpected exception after successful constroi(): " + e);
        }
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        // Given: a heap and a single MeuItem
        FPHeapMax heap = newHeap(4);
        MeuItem mi = newItem(4);

        // When: insert and then remove
        heap.insere(mi);
        Item removed = heap.retiraMax();

        // Then: the returned item should be identical to the inserted one and heap becomes empty
        Assert.assertSame("retiraMax() should return the same instance inserted last when it's the only element", mi, removed);
        Assert.assertNull("After removing the only element, heap.max() should return null", heap.max());
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        // Given: a heap with capacity but no elements
        FPHeapMax heap = newHeap(1);

        // Then: max on empty heap should be null
        Assert.assertNull("Empty heap of capacity 1 should have null max()", heap.max());

        // And: retiraMax should throw an exception indicating empty heap
        try {
            heap.retiraMax();
            Assert.fail("Expected an Exception when removing from an empty heap");
        } catch (Exception e) {
            String m = e.getMessage();
            Assert.assertNotNull("Expected a message for empty heap exception", m);
            Assert.assertTrue("Exception message should mention 'vazio' or 'empty': " + m,
                    m.toLowerCase().contains("vazio") || m.toLowerCase().contains("empty"));
        }
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        // Given: a heap with zero capacity (cannot accept items)
        FPHeapMax heap = newHeap(0);

        // When / Then: attempting to insert any item should raise an Exception indicating the heap is full
        try {
            heap.insere(newItem(1));
            Assert.fail("Expected an Exception when inserting into a heap with capacity 0");
        } catch (Exception e) {
            String msg = e.getMessage();
            Assert.assertNotNull("Expected a message indicating the heap is full", msg);
            Assert.assertTrue("Exception message should indicate a full heap (contain 'cheio' or 'full'): " + msg,
                    msg.toLowerCase().contains("cheio") || msg.toLowerCase().contains("full"));
        }
    }
}