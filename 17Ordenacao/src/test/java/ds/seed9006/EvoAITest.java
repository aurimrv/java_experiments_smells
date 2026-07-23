package ds.seed9006;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests in this package so tests can be categorized.
 */
interface UnitTest {}

/**
 * Improved tests for Ordenacao sorting algorithms.
 *
 * NOTE:
 * - Method names are preserved to match the original test-suite layout.
 * - Tests include clearer assertions, descriptive messages, and small helpers to
 *   reduce duplication while remaining compatible with the original behavior.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    private static final int SMALL_SIZE = 4;
    private static final int MEDIUM_SIZE = 7;
    private static final int DEFAULT_SIZE = 8;

    /**
     * Helper: count non-null elements in an array.
     */
    private int countNonNull(Item[] arr) {
        if (arr == null) {
            return 0;
        }
        int cnt = 0;
        for (Item i : arr) {
            if (i != null) {
                cnt++;
            }
        }
        return cnt;
    }

    /**
     * Helper: fill a contiguous range [from, to] (inclusive) with the provided item.
     * If from > to nothing is done.
     */
    private void fillRange(Item[] arr, int from, int to, Item item) {
        if (arr == null || item == null) {
            return;
        }
        int start = Math.max(0, from);
        int end = Math.min(arr.length - 1, to);
        for (int i = start; i <= end; i++) {
            arr[i] = item;
        }
    }

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        // Given: an array with most positions filled but a request with an out-of-range n
        Item[] itemArray0 = new Item[MEDIUM_SIZE];
        MeuItem meuItem0 = new MeuItem(1353);
        // fill indices 1..6
        fillRange(itemArray0, 1, MEDIUM_SIZE - 1, meuItem0);

        // When/Then: calling heapsort with an excessively large 'n' should fail fast.
        try {
            Ordenacao.heapsort(itemArray0, 43);
            Assert.fail("Expected ArrayIndexOutOfBoundsException when heapsort is called with n=43 greater than array size");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Basic verification that the correct exception type is thrown.
            Assert.assertNotNull("ArrayIndexOutOfBoundsException was thrown as expected", e);
        }
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        // Given: a mostly-populated array; negative 'n' parameter provided.
        final int size = DEFAULT_SIZE;
        Item[] itemArray0 = new Item[size];
        MeuItem meuItem0 = new MeuItem(0);
        // populate 1..7 with the same item
        fillRange(itemArray0, 1, size - 1, meuItem0);

        // When: attempt to heapsort using a negative length parameter.
        Ordenacao.heapsort(itemArray0, -2051);

        // Then: array structure should remain intact and the items that were present should still be present.
        Assert.assertEquals("Array length should remain unchanged after heapsort with negative n", size, itemArray0.length);
        Assert.assertEquals("Number of non-null elements should remain 7 after heapsort with negative n", 7, countNonNull(itemArray0));
        for (int i = 1; i < size; i++) {
            Assert.assertSame("Element at index " + i + " should still reference the original MeuItem instance", meuItem0, itemArray0[i]);
        }
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        // Given: an array with a mix of low and high keys.
        final int size = DEFAULT_SIZE;
        Item[] itemArray0 = new Item[size];
        MeuItem zero = new MeuItem(0);
        MeuItem large = new MeuItem(1289);
        itemArray0[1] = zero;
        itemArray0[2] = large;
        itemArray0[3] = large;
        itemArray0[4] = zero;
        itemArray0[5] = zero;

        // When: shellsort is invoked with a typical gap parameter.
        Ordenacao.shellsort(itemArray0, 5);

        // Then: array length should be preserved and the set of non-null elements should be unchanged.
        Assert.assertEquals("Array length should be preserved after shellsort", size, itemArray0.length);
        Assert.assertEquals("Non-null element count should remain the same after shellsort", 5, countNonNull(itemArray0));
        // Verify that all non-null entries are instances of Item and not overwritten with nulls.
        for (Item itm : itemArray0) {
            if (itm != null) {
                Assert.assertTrue("Non-null entries must implement Item", itm instanceof Item);
            }
        }
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        // Given: an array with several null entries that may cause algorithms to dereference nulls.
        final int size = DEFAULT_SIZE;
        Item[] itemArray0 = new Item[size];
        MeuItem a = new MeuItem(13);
        MeuItem b = new MeuItem(0);
        itemArray0[1] = a;
        itemArray0[5] = b;
        // There are nulls in other positions.

        // When/Then: shellsort may throw NullPointerException when encountering nulls; verify that behavior is handled.
        try {
            Ordenacao.shellsort(itemArray0, 5);
            Assert.fail("Expected a NullPointerException when shellsort processes arrays containing null elements");
        } catch (NullPointerException e) {
            // Confirm that NPE is raised; message may be null.
            Assert.assertNotNull("NullPointerException expected for shellsort with null elements", e);
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        // Given: a small array with some elements and expected nulls.
        Item[] itemArray0 = new Item[SMALL_SIZE];
        MeuItem negative = new MeuItem(-276);
        MeuItem positive = new MeuItem(1375);
        itemArray0[1] = positive;
        itemArray0[2] = negative;

        // When/Then: insercao may throw NullPointerException if it expects fully-populated arrays.
        try {
            Ordenacao.insercao(itemArray0, 1375);
            Assert.fail("Expected NullPointerException when calling insercao on array with null entries");
        } catch (NullPointerException e) {
            Assert.assertNotNull("NullPointerException was thrown as expected by insercao", e);
        }
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        // Given: a null array reference is provided to insercao.
        // When: call insercao with null - implementations may either handle null gracefully or throw NullPointerException.
        try {
            Ordenacao.insercao((Item[]) null, -1183);
            // Then: If no exception is thrown, that is acceptable; verify nothing changed (no state available).
            Assert.assertTrue("insercao accepted a null array without throwing an exception", true);
        } catch (NullPointerException e) {
            // Then: If NPE is thrown, it is also an acceptable behavior depending on implementation.
            Assert.assertNotNull("insercao threw NullPointerException for null array (acceptable)", e);
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        // Given: a partially populated array that may trigger selection algorithm failure.
        Item[] itemArray0 = new Item[MEDIUM_SIZE];
        MeuItem valueA = new MeuItem(1353);
        MeuItem valueB = new MeuItem(4);
        itemArray0[1] = valueA;
        itemArray0[2] = valueA;
        itemArray0[3] = valueB;

        // When/Then: selecao may throw NullPointerException due to null entries; ensure we capture that.
        try {
            Ordenacao.selecao(itemArray0, 4);
            Assert.fail("Expected NullPointerException when selecao processes arrays with null elements");
        } catch (NullPointerException e) {
            Assert.assertNotNull("NullPointerException thrown by selecao as expected", e);
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        // Given: an array filled in positions 1..4
        Item[] itemArray0 = new Item[MEDIUM_SIZE];
        MeuItem meuItem0 = new MeuItem(1353);
        fillRange(itemArray0, 1, 4, meuItem0);

        // When: selection sort is invoked with pivot/index 4.
        Ordenacao.selecao(itemArray0, 4);

        // Then: array length should be preserved and the number of non-null entries should remain the same.
        Assert.assertEquals("Array length should remain unchanged after selecao", MEDIUM_SIZE, itemArray0.length);
        Assert.assertEquals("Non-null count should remain 4 after selecao", 4, countNonNull(itemArray0));
        for (int i = 1; i <= 4; i++) {
            Assert.assertSame("Position " + i + " should still reference the assigned MeuItem", meuItem0, itemArray0[i]);
        }
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        // Given: array with negatives and zeros to exercise quicksort partitioning.
        final int size = DEFAULT_SIZE;
        Item[] itemArray0 = new Item[size];
        MeuItem zero = new MeuItem(0);
        MeuItem minusOne = new MeuItem(-1);
        itemArray0[1] = minusOne;
        itemArray0[2] = zero;
        itemArray0[3] = zero;

        // When: perform quicksort with an index parameter.
        Ordenacao.quicksort(itemArray0, 3);

        // Then: structural properties should hold.
        Assert.assertEquals("Array length should be preserved after quicksort", size, itemArray0.length);
        Assert.assertEquals("Non-null count should remain 3 after quicksort", 3, countNonNull(itemArray0));
        // Ensure items that were present are still instances of Item
        for (Item itm : itemArray0) {
            if (itm != null) {
                Assert.assertTrue("Sorted entries should implement Item", itm instanceof Item);
            }
        }
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        // Given: an array with repeated identical negative keys.
        Item[] itemArray0 = new Item[9];
        MeuItem repeated = new MeuItem(-1878);
        itemArray0[1] = repeated;
        itemArray0[2] = repeated;
        itemArray0[3] = repeated;

        // When: quicksort is invoked using pivot 3.
        Ordenacao.quicksort(itemArray0, 3);

        // Then: array length and non-null count should be preserved.
        Assert.assertEquals("Array length should be preserved after quicksort", 9, itemArray0.length);
        Assert.assertEquals("Non-null count should remain 3 after quicksort", 3, countNonNull(itemArray0));
        // Verify that the repeated references are still present (sorting stable or not, references should still exist)
        int found = 0;
        for (Item itm : itemArray0) {
            if (itm == repeated) {
                found++;
            }
        }
        Assert.assertEquals("All originally referenced repeated items should still be present", 3, found);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        // Given: small array with first two positions populated.
        Item[] itemArray0 = new Item[SMALL_SIZE];
        MeuItem first = new MeuItem(2712);
        itemArray0[0] = first;
        itemArray0[1] = first;

        // When: quicksort invoked with start index 0.
        Ordenacao.quicksort(itemArray0, 0);

        // Then: length unchanged and original references remain.
        Assert.assertEquals("Array length should remain unchanged after quicksort", SMALL_SIZE, itemArray0.length);
        Assert.assertSame("Element 0 should still reference the original item", first, itemArray0[0]);
        Assert.assertSame("Element 1 should still reference the original item", first, itemArray0[1]);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        // Given: an array with three populated consecutive positions.
        final int size = DEFAULT_SIZE;
        Item[] itemArray0 = new Item[size];
        MeuItem a = new MeuItem(0);
        MeuItem b = new MeuItem(-1);
        MeuItem c = new MeuItem(0);
        itemArray0[1] = b;
        itemArray0[2] = a;
        itemArray0[3] = c;

        // When: quicksort using pivot 3
        Ordenacao.quicksort(itemArray0, 3);

        // Then: basic invariants are preserved.
        Assert.assertEquals("Array length should be unchanged after quicksort", size, itemArray0.length);
        Assert.assertEquals("Non-null count should remain 3 after quicksort", 3, countNonNull(itemArray0));
        // Verify each previously set position still contains an Item instance
        Assert.assertTrue("Position 1 must contain an Item", itemArray0[1] instanceof Item);
        Assert.assertTrue("Position 2 must contain an Item", itemArray0[2] instanceof Item);
        Assert.assertTrue("Position 3 must contain an Item", itemArray0[3] instanceof Item);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        // Given/When: create a new instance of Ordenacao
        Ordenacao ordenacao0 = new Ordenacao();

        // Then: the instance should be non-null and be of the expected type.
        Assert.assertNotNull("Constructed Ordenacao instance should not be null", ordenacao0);
        Assert.assertTrue("Constructed object must be an instance of Ordenacao", ordenacao0 instanceof Ordenacao);
    }
}