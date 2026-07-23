package ds.seed6733;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.util.IdentityHashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for sorting routines in ds.Ordenacao.
 *
 * Traceability:
 * - REQ-ORDER-1: Sorting algorithms must not create or lose elements (they must permute inputs).
 * - REQ-ORDER-2: Algorithms must throw appropriate exceptions for invalid internal indexing.
 *
 * Tests follow Given-When-Then commentary and include richer assertions and classification metadata.
 */
interface UnitTest {}
interface SortingTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    /* Helper: verify that two arrays are permutations of each other w.r.t. identity of non-null elements.
       This checks that the algorithm did not create fresh element instances or lose existing ones (REQ-ORDER-1). */
    private void assertPermutationByIdentity(Item[] before, Item[] after, String message) {
        assertNotNull("Before-array should not be null", before);
        assertNotNull("After-array should not be null", after);
        assertEquals("Array lengths should remain equal. " + message, before.length, after.length);

        Map<Item, Integer> counts = new IdentityHashMap<Item, Integer>();
        for (Item it : before) {
            if (it != null) {
                counts.put(it, counts.getOrDefault(it, 0) + 1);
            }
        }
        for (Item it : after) {
            if (it != null) {
                Integer c = counts.get(it);
                if (c == null) {
                    fail("After-array contains an unknown element instance (not present before). " + message);
                } else if (c == 1) {
                    counts.remove(it);
                } else {
                    counts.put(it, c - 1);
                }
            }
        }
        if (!counts.isEmpty()) {
            fail("After-array is missing some element instances that were present before. " + message);
        }
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test00() throws Throwable {
        // Given: a small array with only null entries (simulating uninitialized slots)
        Item[] itemArray0 = new Item[2];
        Item[] before = itemArray0.clone();

        // When / Then: calling heapsort with an out-of-range large index should throw ArrayIndexOutOfBoundsException.
        try {
            Ordenacao.heapsort(itemArray0, 3322);
            fail("Expected ArrayIndexOutOfBoundsException when calling heapsort with an out-of-range index (3322).");
        } catch (ArrayIndexOutOfBoundsException e) {
            // verify exception thrown as expected (REQ-ORDER-2)
            assertTrue("Expected exception message to contain the index or be non-null.",
                    e.getMessage() == null || e.getMessage().contains("3322"));
        }

        // And: algorithm must not have created or destroyed element instances (array length and permutation preserved).
        assertEquals("Array length must remain 2 after failed heapsort.", 2, itemArray0.length);
        assertPermutationByIdentity(before, itemArray0, "test00 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test01() throws Throwable {
        // Given: an array of length 1 with a single null slot
        Item[] itemArray0 = new Item[1];
        Item[] before = itemArray0.clone();

        // When: calling heapsort with a negative gap/index should be handled gracefully (treated as no-op).
        Ordenacao.heapsort(itemArray0, -1096);

        // Then: no exception, length unchanged, and contents are a permutation of the original (i.e., still null).
        assertEquals("Heapsort should not change the array length for a single-element array.", 1, itemArray0.length);
        assertNull("Single slot should remain null after heapsort with negative index.", itemArray0[0]);
        assertPermutationByIdentity(before, itemArray0, "test01 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test02() throws Throwable {
        // Given: an array with several MeuItem instances placed in some positions
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(1);
        MeuItem meuItem1 = new MeuItem(5);
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem0;
        itemArray0[3] = meuItem1;
        itemArray0[4] = meuItem0;
        itemArray0[5] = meuItem0;
        Item[] before = itemArray0.clone();

        // When: perform shellsort with a valid gap parameter
        Ordenacao.shellsort(itemArray0, 5);

        // Then: array length preserved and elements are a permutation of the input instances (no creations/losses).
        assertEquals("Array length must remain 6 after shellsort.", 6, itemArray0.length);
        assertPermutationByIdentity(before, itemArray0, "test02 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test03() throws Throwable {
        // Given: partially-initialized array (some nulls) that may trigger NPE in insertion sort implementation
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(1149);
        itemArray0[1] = meuItem0;
        MeuItem meuItem1 = new MeuItem(3);
        itemArray0[2] = meuItem1;
        Item[] before = itemArray0.clone();

        // When / Then: insercao may throw NullPointerException due to null slots; assert that behavior and maintain invariants.
        try {
            Ordenacao.insercao(itemArray0, 3);
            // If no exception, we still verify permutation property.
            assertPermutationByIdentity(before, itemArray0, "test03 permutation check when insercao succeeds");
        } catch (NullPointerException e) {
            // Expected exceptional behavior in some implementations when encountering nulls.
            assertNull("NullPointerException should not carry an unexpected message (may be null).", e.getMessage());
            // Even on exception, ensure array length unchanged and no new instances were introduced.
            assertEquals("Array length must remain 6 after failed insercao.", 6, itemArray0.length);
            assertPermutationByIdentity(before, itemArray0, "test03 permutation check after NPE");
        }
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test04() throws Throwable {
        // Given: a single-slot array
        Item[] itemArray0 = new Item[1];
        Item[] before = itemArray0.clone();

        // When: call insertion sort with a negative parameter; expect no exception and no mutation.
        Ordenacao.insercao(itemArray0, -1096);

        // Then: validate post-conditions with descriptive messages.
        assertEquals("Single-element array must retain its length after insercao with negative index.", 1, itemArray0.length);
        assertNull("Slot should remain null after insercao with negative index.", itemArray0[0]);
        assertPermutationByIdentity(before, itemArray0, "test04 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test05() throws Throwable {
        // Given: an array with some MeuItem instances and null slots that may provoke NullPointerException in selection sort
        Item[] itemArray0 = new Item[8];
        MeuItem meuItem0 = new MeuItem(2);
        itemArray0[1] = meuItem0;
        MeuItem meuItem1 = new MeuItem(-2328);
        itemArray0[2] = meuItem1;
        Item[] before = itemArray0.clone();

        // When / Then: expect NullPointerException in some implementations; ensure invariants either way.
        try {
            Ordenacao.selecao(itemArray0, 3);
            // If no exception, verify that permutation property holds.
            assertPermutationByIdentity(before, itemArray0, "test05 permutation check when selecao succeeds");
        } catch (NullPointerException e) {
            // Expected in some defensive implementations when encountering null entries.
            assertNull("NullPointerException message expected to be null in this context.", e.getMessage());
            assertPermutationByIdentity(before, itemArray0, "test05 permutation check after NPE");
        }
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test06() throws Throwable {
        // Given: an array filled with the same MeuItem instance in multiple positions
        Item[] itemArray0 = new Item[8];
        MeuItem meuItem0 = new MeuItem(2);
        itemArray0[1] = meuItem0;
        itemArray0[2] = meuItem0;
        itemArray0[3] = meuItem0;
        Item[] before = itemArray0.clone();

        // When: selection sort should complete normally
        Ordenacao.selecao(itemArray0, 3);

        // Then: length preserved and permutation by identity (same repeated instances).
        assertEquals("Array length must remain 8 after selecao.", 8, itemArray0.length);
        assertPermutationByIdentity(before, itemArray0, "test06 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test07() throws Throwable {
        // Given: several identical MeuItem instances inserted; quicksort may reorder but should not create/destroy instances.
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(3);
        itemArray0[1] = meuItem0;
        itemArray0[2] = meuItem0;
        itemArray0[3] = meuItem0;
        itemArray0[4] = meuItem0;
        Item[] before = itemArray0.clone();

        // When: execute quicksort
        Ordenacao.quicksort(itemArray0, 4);

        // Then: verify invariants
        assertEquals("Array length must remain 6 after quicksort.", 6, itemArray0.length);
        assertPermutationByIdentity(before, itemArray0, "test07 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test08() throws Throwable {
        // Given: a mix of MeuItem instances with different keys
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(3);
        itemArray0[1] = meuItem0;
        MeuItem meuItem1 = new MeuItem(4);
        itemArray0[2] = meuItem1;
        itemArray0[3] = meuItem0;
        itemArray0[4] = meuItem0;
        Item[] before = itemArray0.clone();

        // When: quicksort runs
        Ordenacao.quicksort(itemArray0, 4);

        // Then: ensure the algorithm did not alter the multiset of instances and preserved length.
        assertEquals("Array length must remain 6 after quicksort.", 6, itemArray0.length);
        assertPermutationByIdentity(before, itemArray0, "test08 permutation check");
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test09() throws Throwable {
        // Given: array with null slots and mixed instances that may cause quicksort to throw NullPointerException
        Item[] itemArray0 = new Item[6];
        MeuItem meuItem0 = new MeuItem(3);
        itemArray0[1] = meuItem0;
        itemArray0[2] = meuItem0;
        MeuItem meuItem1 = new MeuItem(4);
        itemArray0[4] = meuItem1;
        Item[] before = itemArray0.clone();

        // When / Then: some implementations may throw NPE; assert that behavior and invariants.
        try {
            Ordenacao.quicksort(itemArray0, 4);
            // If no exception, ensure permutation property
            assertPermutationByIdentity(before, itemArray0, "test09 permutation check when quicksort succeeds");
        } catch (NullPointerException e) {
            assertNull("NullPointerException message expected to be null in this scenario.", e.getMessage());
            assertPermutationByIdentity(before, itemArray0, "test09 permutation check after NPE");
        }
    }

    @Test(timeout = 4000)
    @Category({UnitTest.class, SortingTest.class})
    public void test10() throws Throwable {
        // Given / When: construct an Ordenacao instance
        Ordenacao ordenacao0 = new Ordenacao();

        // Then: basic sanity checks on the constructed object
        assertNotNull("Ordenacao constructor should produce a non-null instance.", ordenacao0);
        assertEquals("Constructed object should be of class Ordenacao.", Ordenacao.class, ordenacao0.getClass());
        // toString should be non-null to aid debugging; no strict contract but verify it doesn't return null
        assertNotNull("Ordenacao.toString() should not return null.", ordenacao0.toString());
    }
}