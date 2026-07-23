package ds.seed5503;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Unit tests for Ordenacao algorithms (heapsort, shellsort, insercao, selecao, quicksort).
 *
 * These tests improve on automatically-generated cases by:
 * - adding clear assertions about post-conditions where possible,
 * - grouping validation of exceptional behavior via a small helper,
 * - documenting intent for each test case (kept original method names for traceability).
 *
 * Note: The original EvoSuite-generated runner/annotations were replaced with the standard JUnit4 runner.
 */
interface UnitTest {}

@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    // Helper constants to avoid magic numbers in multiple tests
    private static final int LARGE_INDEX = 2166;
    private static final int UNUSED = -1;

    @Before
    public void setUp() {
        // no global setup required at the moment; method present for clarity / future use
    }

    /**
     * Helper to assert that the supplied action throws the expected exception type.
     * If expectedMessageSubstring is non-null, also assert that the thrown exception's message contains it.
     */
    private static <T extends Throwable> void expectException(Class<T> expected, Runnable action, String expectedMessageSubstring) {
        try {
            action.run();
            fail("Expected exception of type " + expected.getName() + " but none was thrown");
        } catch (Throwable t) {
            if (!expected.isInstance(t)) {
                String msg = "Expected exception of type " + expected.getName() + " but got " + t.getClass().getName();
                fail(msg);
            }
            if (expectedMessageSubstring != null) {
                String actualMessage = t.getMessage();
                assertNotNull("Expected exception message to be non-null", actualMessage);
                assertTrue("Expected exception message to contain \"" + expectedMessageSubstring + "\" but was \"" + actualMessage + "\"",
                        actualMessage.contains(expectedMessageSubstring));
            }
            // success if we reach here
        }
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given: a small array where some trailing indexes will be out-of-range for the provided 'k' argument
        Item[] itemArray0 = new Item[3];
        MeuItem meuItem0 = new MeuItem(0);
        itemArray0[1] = meuItem0;
        itemArray0[2] = meuItem0;

        // When / Then: calling heapsort with an excessively large index should throw an ArrayIndexOutOfBoundsException
        expectException(ArrayIndexOutOfBoundsException.class, () -> Ordenacao.heapsort(itemArray0, LARGE_INDEX), String.valueOf(LARGE_INDEX));

        // Ensure array contents were not unexpectedly replaced (sanity check)
        assertSame("Element at index 1 should remain the same reference after failed call", meuItem0, itemArray0[1]);
        assertSame("Element at index 2 should remain the same reference after failed call", meuItem0, itemArray0[2]);
        assertEquals("Array length should remain unchanged", 3, itemArray0.length);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given: minimal array (length 1) and an out-of-range negative parameter
        Item[] itemArray0 = new Item[1];

        // When: calling heapsort with -1 should not throw for this implementation (treat as no-op)
        try {
            Ordenacao.heapsort(itemArray0, UNUSED);
        } catch (Throwable t) {
            fail("heapsort should not throw for a single-element array and k=" + UNUSED + ", but threw: " + t);
        }

        // Then: array length must remain 1 and contents remain unchanged (null)
        assertEquals("Array length must remain 1", 1, itemArray0.length);
        assertNull("Single element should remain null after no-op heapsort", itemArray0[0]);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given: an array with sparse MeuItem values and nulls
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(0);
        MeuItem meuItem1 = new MeuItem(-1);
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem0;
        itemArray0[3] = meuItem1;
        itemArray0[5] = meuItem1;

        // When / Then: calling shellsort with a k value that triggers internal access to null positions should throw NPE
        expectException(NullPointerException.class, () -> Ordenacao.shellsort(itemArray0, 5), null);

        // Confirm that null positions remain null and populated positions are unchanged references
        assertSame(meuItem1, itemArray0[1]);
        assertSame(meuItem0, itemArray0[2]);
        assertSame(meuItem1, itemArray0[3]);
        assertSame(meuItem1, itemArray0[5]);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given: array with some elements set and others null (boundary-like configuration)
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(4);
        itemArray0[1] = meuItem0;
        MeuItem meuItem1 = new MeuItem(-1);
        itemArray0[2] = meuItem1;

        // When / Then: shellsort with the supplied k is expected to encounter a null and throw NullPointerException.
        // This test documents that behavior and verifies the array is otherwise unchanged.
        expectException(NullPointerException.class, () -> Ordenacao.shellsort(itemArray0, 4), null);

        // Verify elements set before call remain the same references
        assertSame("Element at index 1 should remain unchanged", meuItem0, itemArray0[1]);
        assertSame("Element at index 2 should remain unchanged", meuItem1, itemArray0[2]);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given: trivial array with one element and negative k
        Item[] itemArray0 = new Item[1];

        // When: shellsort with negative k should be a no-op; ensure no exception and the array is unchanged
        try {
            Ordenacao.shellsort(itemArray0, UNUSED);
        } catch (Throwable t) {
            fail("shellsort should not throw for a 1-element array and k=" + UNUSED + ", but threw: " + t);
        }

        // Then: length unchanged and element remains null
        assertEquals("Array length must remain 1", 1, itemArray0.length);
        assertNull("Single element should remain null after no-op shellsort", itemArray0[0]);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given: an array with some items and nulls
        Item[] itemArray0 = new Item[5];
        MeuItem meuItem0 = new MeuItem(930);
        itemArray0[1] = meuItem0;
        MeuItem meuItem1 = new MeuItem(0);
        itemArray0[2] = meuItem1;

        // When / Then: insercao with a large index is expected to trigger a NullPointerException in this implementation
        expectException(NullPointerException.class, () -> Ordenacao.insercao(itemArray0, 1343), null);

        // Verify that elements explicitly set remain intact
        assertSame("Element at index 1 should remain same reference after failed insertion", meuItem0, itemArray0[1]);
        assertSame("Element at index 2 should remain same reference after failed insertion", meuItem1, itemArray0[2]);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given: a null array reference

        // When / Then: most implementations will throw NullPointerException; assert that behavior explicitly
        expectException(NullPointerException.class, () -> Ordenacao.insercao((Item[]) null, 0), null);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given: an array where a few contiguous positions are populated
        Item[] itemArray0 = new Item[7];
        MeuItem meuItem0 = new MeuItem(-1387);
        MeuItem meuItem1 = new MeuItem(3);
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem1;
        itemArray0[3] = meuItem0;

        // Keep original references to assert they are preserved by selection sort
        Item original1 = itemArray0[1];
        Item original2 = itemArray0[2];
        Item original3 = itemArray0[3];

        // When: perform selection sort with a valid small k
        try {
            Ordenacao.selecao(itemArray0, 3);
        } catch (Throwable t) {
            fail("selecao should not throw for provided configuration, but threw: " + t);
        }

        // Then: length unchanged and previously populated slots still contain the same object references (no loss)
        assertEquals("Array length must remain 7", 7, itemArray0.length);
        assertNotNull("Index 1 should be non-null after selecao", itemArray0[1]);
        assertNotNull("Index 2 should be non-null after selecao", itemArray0[2]);
        assertNotNull("Index 3 should be non-null after selecao", itemArray0[3]);
        assertTrue("Original reference must still be present in the array", containsReference(itemArray0, original1));
        assertTrue("Original reference must still be present in the array", containsReference(itemArray0, original2));
        assertTrue("Original reference must still be present in the array", containsReference(itemArray0, original3));
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given: an array with repeated same-values to exercise quicksort stability/handling
        Item[] itemArray0 = new Item[7];
        MeuItem meuItem0 = new MeuItem(-2325);
        itemArray0[1] = meuItem0;
        itemArray0[2] = meuItem0;
        itemArray0[3] = meuItem0;
        itemArray0[4] = meuItem0;

        // When: call quicksort with a reasonable k
        try {
            Ordenacao.quicksort(itemArray0, 4);
        } catch (Throwable t) {
            fail("quicksort should not throw for this input, but threw: " + t);
        }

        // Then: length unchanged and populated slots remain populated with the same reference
        assertEquals("Array length must remain 7", 7, itemArray0.length);
        assertSame(meuItem0, itemArray0[1]);
        assertSame(meuItem0, itemArray0[2]);
        assertSame(meuItem0, itemArray0[3]);
        assertSame(meuItem0, itemArray0[4]);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given: array with mixed nulls and populated entries that may trigger a NullPointerException during quicksort
        Item[] itemArray0 = new Item[7];
        MeuItem meuItem0 = new MeuItem(-2325);
        MeuItem meuItem1 = new MeuItem(-250);
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem0;
        itemArray0[4] = meuItem1;

        // When / Then: quicksort is expected to encounter nulls and throw NullPointerException
        expectException(NullPointerException.class, () -> Ordenacao.quicksort(itemArray0, 4), null);

        // Ensure set elements are still present after the failed call
        assertSame(meuItem1, itemArray0[1]);
        assertSame(meuItem0, itemArray0[2]);
        assertSame(meuItem1, itemArray0[4]);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given: partially populated small array
        Item[] itemArray0 = new Item[4];
        MeuItem meuItem0 = new MeuItem(1715);
        itemArray0[0] = meuItem0;
        MeuItem meuItem1 = new MeuItem(2);
        itemArray0[1] = meuItem1;

        // When / Then: quicksort with k=0 is expected to throw NullPointerException due to null entries in this implementation
        expectException(NullPointerException.class, () -> Ordenacao.quicksort(itemArray0, 0), null);

        // Validate original references preserved
        assertSame(meuItem0, itemArray0[0]);
        assertSame(meuItem1, itemArray0[1]);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Given: an array with duplicate objects in first two positions
        Item[] itemArray0 = new Item[5];
        MeuItem meuItem0 = new MeuItem(-1276);
        itemArray0[0] = meuItem0;
        itemArray0[1] = meuItem0;

        // When: quicksort is invoked with k=0; this implementation is expected to handle it without throwing for this setup
        try {
            Ordenacao.quicksort(itemArray0, 0);
        } catch (Throwable t) {
            fail("quicksort should not throw for two-equal-items case, but threw: " + t);
        }

        // Then: array length unchanged and duplicate reference preserved
        assertEquals("Array length must remain 5", 5, itemArray0.length);
        assertSame("Element 0 and 1 should still reference the same object", itemArray0[0], itemArray0[1]);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        // Given / When: creating an instance of Ordenacao
        Ordenacao ordenacao0 = new Ordenacao();

        // Then: instance should be non-null and of expected type
        assertNotNull("Ordenacao constructor should produce a non-null instance", ordenacao0);
        assertTrue("Created object should be instance of Ordenacao", ordenacao0 instanceof Ordenacao);
    }

    /**
     * Utility to check whether the provided array contains the given reference (using reference equality).
     */
    private static boolean containsReference(Item[] array, Item ref) {
        if (array == null) return false;
        for (Item it : array) {
            if (it == ref) return true;
        }
        return false;
    }
}