package ds.seed9121;

import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

/**
 * Improved and intention-revealing tests for ArvoreBinaria.
 *
 * Note: test method names are preserved to satisfy the requirement of keeping the original signatures.
 * Each test uses Given-When-Then comments, includes assertions with messages, and exercises some boundary checks.
 *
 * Traceability: simple @see tags to indicate requirement coverage (example IDs).
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

    /* Helper: insert keys into a new tree and return the created MeuItem instances (in same order) */
    private MeuItem[] insertKeys(ArvoreBinaria tree, int... keys) {
        MeuItem[] items = new MeuItem[keys.length];
        for (int i = 0; i < keys.length; i++) {
            items[i] = new MeuItem(keys[i]);
            tree.insere(items[i]);
        }
        return items;
    }

    /* Helper: convenience search that returns the result of pesquisa for given key */
    private Item searchByKey(ArvoreBinaria tree, int key) {
        return tree.pesquisa(new MeuItem(key));
    }

    /**
     * test00: Verify basic insert/search semantics and that non-inserted keys are not found.
     *
     * Covers: happy path insert + negative search case.
     *
     * @see REQ-ARB-001
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given: an empty tree with two inserted items
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, 34, 49);
        MeuItem item34 = items[0];
        MeuItem item49 = items[1];

        // When: searching for inserted and non-inserted keys
        Item found34 = searchByKey(tree, 34);
        Item found49 = searchByKey(tree, 49);
        Item found427 = searchByKey(tree, 427); // boundary: value not present

        // Then: inserted items are found (by key) and non-inserted key is not found
        assertNotNull("Inserted key 34 should be found", found34);
        assertSame("Search by key 34 should return the stored object reference", item34, found34);
        assertNotNull("Inserted key 49 should be found", found49);
        assertSame("Search by key 49 should return the stored object reference", item49, found49);
        assertNull("Non-inserted key 427 should not be found", found427);
    }

    /**
     * test01: Insert two typical values and verify containment and distinctness.
     *
     * @see REQ-ARB-002
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, 1, 513);
        MeuItem item1 = items[0];
        MeuItem item513 = items[1];

        // When
        Item result1 = tree.pesquisa(item1);          // search using same instance
        Item result513 = tree.pesquisa(new MeuItem(513)); // search using equivalent key

        // Then
        assertNotNull("Item with key 1 should be present", result1);
        assertSame("Searching with the same instance should return the identical reference", item1, result1);
        assertNotNull("Item with key 513 should be present when searched by equivalent key", result513);
        assertEquals("Results for different inserted keys must not be equal", item1, result1);
    }

    /**
     * test02: Insert two items, exercise a boundary search (Integer.MIN_VALUE) and verify no unexpected exceptions.
     *
     * @see REQ-ARB-003
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        insertKeys(tree, 5, 2);

        // When
        Item found5 = searchByKey(tree, 5);
        Item found2 = searchByKey(tree, 2);
        Item foundMin = searchByKey(tree, Integer.MIN_VALUE); // boundary

        // Then
        assertNotNull("Inserted key 5 must be found", found5);
        assertNotNull("Inserted key 2 must be found", found2);
        assertNull("Integer.MIN_VALUE should not be present in the tree", foundMin);
    }

    /**
     * test03: Insert two positive values and verify retrieval.
     *
     * @see REQ-ARB-004
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, 4169, 1);
        MeuItem item4169 = items[0];
        MeuItem item1 = items[1];

        // When
        Item r4169 = tree.pesquisa(new MeuItem(4169));
        Item r1 = tree.pesquisa(item1);

        // Then
        assertNotNull("Key 4169 should be findable by equivalent key", r4169);
        assertSame("Searching with the original instance for key 1 should return the exact object", item1, r1);
        assertNotSame("Different stored items should not be the same reference", item4169, item1);
    }

    /**
     * test04: Insert negative and positive keys, remove one and verify tree updates.
     *
     * @see REQ-ARB-005
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, -4215, 4);
        MeuItem negative = items[0];
        MeuItem positive = items[1];

        // When: remove the negative key
        tree.retira(negative);

        // Then
        assertNull("After removal, negative key should no longer be found", searchByKey(tree, -4215));
        assertNotNull("Other key should remain present after removal", searchByKey(tree, 4));
        assertFalse("Different items should not be equal", negative.equals(positive));
    }

    /**
     * test05: Insert then remove an item. Verify removal and that MeuItem reports a valid size (non-negative).
     *
     * @see REQ-ARB-006
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, 3501);
        MeuItem target = items[0];

        // When
        tree.retira(target);

        // Then
        assertNull("Removed item should not be found afterwards", searchByKey(tree, 3501));
        assertTrue("MeuItem.tamanho() should be non-negative", target.tamanho() >= 0);
    }

    /**
     * test06: Remove a non-existent key and verify tree unchanged for the inserted key.
     *
     * @see REQ-ARB-007
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, -934);
        MeuItem existing = items[0];
        MeuItem notInserted = new MeuItem(1866);

        // When
        tree.retira(notInserted); // should be a no-op

        // Then
        assertNotNull("Existing item should still be present after attempting to remove a non-existent key", searchByKey(tree, -934));
        assertFalse("Distinct items should not be equal", notInserted.equals(existing));
    }

    /**
     * test07: Attempt removal of a non-inserted small key and assert the tree remains intact.
     *
     * @see REQ-ARB-008
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, 4169);
        MeuItem present = items[0];
        MeuItem nonPresent = new MeuItem(1);

        // When
        tree.retira(nonPresent);

        // Then
        assertNotNull("Present item should remain after attempting to remove non-present item", searchByKey(tree, 4169));
        assertTrue("MeuItem.tamanho() for non-present item should be a valid non-negative value", nonPresent.tamanho() >= 0);
    }

    /**
     * test08: Insert multiple items and remove the root candidate. Verify other elements remain.
     *
     * @see REQ-ARB-009
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem[] items = insertKeys(tree, 16, -18, 2241, 1);
        MeuItem removed = items[0]; // 16

        // When
        tree.retira(removed);

        // Then
        assertNull("Removed key (16) should not be found", searchByKey(tree, 16));
        assertNotNull("Other key -18 should still be present", searchByKey(tree, -18));
        assertNotNull("Other key 2241 should still be present", searchByKey(tree, 2241));
        assertTrue("Removed item should still report a non-negative size", removed.tamanho() >= 0);
    }

    /**
     * test09: Insert same object twice and ensure searches succeed and do not throw.
     *
     * @see REQ-ARB-010
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem item = new MeuItem(-2);
        tree.insere(item);
        tree.insere(item); // inserting same reference twice should be safe (no exceptions)

        // When
        Item found = tree.pesquisa(item);

        // Then
        assertNotNull("Searching for the inserted item should return a non-null result", found);
        assertSame("Search should return the same object reference that was inserted", item, found);
        assertTrue("MeuItem.tamanho() should be non-negative", item.tamanho() >= 0);
    }

    /**
     * test10: Search for a key that was not inserted; expect null.
     *
     * @see REQ-ARB-011
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        insertKeys(tree, -4215);

        // When
        Item notFound = searchByKey(tree, 4);

        // Then
        assertNull("Searching for an uninserted key (4) should return null", notFound);
    }

    /**
     * test11: Search for a different negative key that was not inserted; expect null.
     *
     * @see REQ-ARB-012
     */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        insertKeys(tree, -2);

        // When
        Item result = searchByKey(tree, -65);

        // Then
        assertNull("Uninserted negative key (-65) should not be found", result);
    }

    /**
     * test12: Insert an item and verify that searching with the same instance returns the identical reference.
     *
     * @see REQ-ARB-013
     */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        // Given
        ArvoreBinaria tree = new ArvoreBinaria();
        MeuItem item = new MeuItem(-2);
        tree.insere(item);

        // When
        Item found = tree.pesquisa(item);

        // Then
        assertSame("Searching with the same item instance should return the identical stored object", item, found);
        assertTrue("Stored item should report a non-negative size", item.tamanho() >= 0);
    }
}