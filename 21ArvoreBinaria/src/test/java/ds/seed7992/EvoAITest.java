package ds.seed7992;

import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

/**
 * Unit tests for ArvoreBinaria (binary tree) behavior.
 *
 * Requirement traceability:
 * - REQ-ARV-001: Basic insert/search/remove operations work and preserve item integrity.
 *
 * Notes:
 * - Tests follow a Given-When-Then pattern in comments.
 * - These tests are categorized as UnitTest to allow selective execution.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

    private ArvoreBinaria arvore;

    @Before
    public void setUp() {
        arvore = new ArvoreBinaria();
    }

    private MeuItem makeItem(int chave) {
        return new MeuItem(chave);
    }

    /**
     * test00: Verify that changing an item's key does not lose the stored item and
     * that it remains searchable by the same instance.
     *
     * Given: a tree with two items inserted.
     * When: the first item's key is altered.
     * Then: searching for the same instance returns the stored item and its internal
     *       state (tamanho) is unchanged.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given
        MeuItem itemA = makeItem(-2351);
        MeuItem itemB = makeItem(0);
        arvore.insere(itemA);
        arvore.insere(itemB);

        // When
        Integer newKey = Integer.valueOf(165);
        itemA.alteraChave(newKey);

        // Then
        Item found = arvore.pesquisa(itemA);
        assertNotNull("After altering key, the same item instance should still be found in the tree", found);
        assertEquals("Found item should be equal to the original instance", itemA, found);
        // verify internal consistency of the item
        assertEquals("Item's tamanho should remain stable after key change", 4, ((MeuItem) found).tamanho());
    }

    /**
     * test01: Insert two distinct items and verify both are findable.
     *
     * Given: an empty tree.
     * When: two items are inserted.
     * Then: both items can be searched (non-null result) and are distinct.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given
        MeuItem item0 = makeItem(165);
        MeuItem item1 = makeItem(-2351);

        // When
        arvore.insere(item1);
        arvore.insere(item0);

        // Then
        Item found0 = arvore.pesquisa(item0);
        Item found1 = arvore.pesquisa(item1);
        assertNotNull("Inserted item0 should be found", found0);
        assertNotNull("Inserted item1 should be found", found1);
        assertFalse("The two different inserted items should not be equal", item0.equals(item1));
        // verify that search returns equivalent items
        assertEquals("Search result for item0 should be equal to the original", item0, found0);
        assertEquals("Search result for item1 should be equal to the original", item1, found1);
    }

    /**
     * test02: Alter key of the second inserted item and verify that it remains searchable.
     *
     * Given: two items inserted.
     * When: the second item's key is altered.
     * Then: searching for the same instance yields the item and its tamanho is stable.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given
        MeuItem first = makeItem(0);
        MeuItem second = makeItem(-2351);
        arvore.insere(first);
        arvore.insere(second);

        // When
        Integer newKey = Integer.valueOf(165);
        second.alteraChave(newKey);

        // Then
        Item found = arvore.pesquisa(second);
        assertNotNull("Item should still be findable after key alteration", found);
        assertEquals("Found item should match the altered instance", second, found);
        assertEquals("tamanho should remain consistent for altered item", 4, ((MeuItem) found).tamanho());
    }

    /**
     * test03: Insert two items and assert both can be located.
     *
     * Given: an empty tree.
     * When: two items are inserted.
     * Then: both are searchable and distinct.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given
        MeuItem positive = makeItem(165);
        MeuItem negative = makeItem(-2351);

        // When
        arvore.insere(positive);
        arvore.insere(negative);

        // Then
        Item fPos = arvore.pesquisa(positive);
        Item fNeg = arvore.pesquisa(negative);
        assertNotNull("Positive item should be found after insertion", fPos);
        assertNotNull("Negative item should be found after insertion", fNeg);
        assertFalse("Inserted items should not be equal to each other", positive.equals(negative));
    }

    /**
     * test04: Remove an inserted item and verify it is no longer searchable and
     * the item object remains in a consistent internal state.
     *
     * Given: two items inserted.
     * When: one item is removed.
     * Then: searching for the removed item returns null and the removed item's tamanho is as expected.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given
        MeuItem low = makeItem(-2351);
        MeuItem high = makeItem(165);
        arvore.insere(low);
        arvore.insere(high);

        // When
        arvore.retira(low);

        // Then
        Item after = arvore.pesquisa(low);
        assertNull("Removed item should no longer be present in tree", after);
        assertEquals("Removed item's internal tamanho should be stable", 4, low.tamanho());
    }

    /**
     * test05: Insert and then remove the same item; verify it is removed and the object remains consistent.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given
        MeuItem single = makeItem(165);
        arvore.insere(single);

        // When
        arvore.retira(single);

        // Then
        Item result = arvore.pesquisa(single);
        assertNull("Item should not be found after removal", result);
        assertEquals("Item's tamanho should be unchanged by remove operation", 4, single.tamanho());
    }

    /**
     * test06: Removing a non-inserted item should not affect existing items.
     *
     * Given: one item inserted.
     * When: an unrelated item is removed.
     * Then: the inserted item remains searchable; the removed (non-inserted) item is not found.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given
        MeuItem present = makeItem(-2351);
        MeuItem absent = makeItem(165);
        arvore.insere(present);

        // When (attempt to remove an item that was not inserted)
        arvore.retira(absent);

        // Then
        assertNotNull("Originally inserted item should remain present", arvore.pesquisa(present));
        assertNull("Non-inserted item should not be present", arvore.pesquisa(absent));
        assertEquals("Absent item's tamanho should remain its default even if remove was called", 4, absent.tamanho());
    }

    /**
     * test07: Removing a different item than the one inserted should leave original intact and objects compare correctly.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given
        MeuItem a = makeItem(165);
        MeuItem b = makeItem(-2351);
        arvore.insere(a);

        // When
        arvore.retira(b);

        // Then
        assertFalse("Different items should not be equal", b.equals(a));
        assertNotNull("Inserted item should still be findable after removing unrelated item", arvore.pesquisa(a));
    }

    /**
     * test08: Complex scenario with duplicates and key alteration.
     *
     * Given: multiple items including duplicates.
     * When: alter key of one, insert duplicate, then remove the altered item.
     * Then: the removed item should no longer be found while other duplicates remain.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given
        MeuItem one = makeItem(1);
        MeuItem neg1307a = makeItem(-1307);
        MeuItem neg1307b = makeItem(-1307);
        MeuItem neg1486 = makeItem(-1486);

        // When
        arvore.insere(neg1307a);
        arvore.insere(one);
        arvore.insere(neg1486);
        // change key of first negative item to collide with "one"
        neg1307a.alteraChave(Integer.valueOf(1));
        // insert duplicate of original -1307
        arvore.insere(neg1307b);
        // remove the altered item instance
        arvore.retira(neg1307a);

        // Then
        assertNull("Altered-and-removed item should not be found", arvore.pesquisa(neg1307a));
        assertNotNull("Duplicate item should still be present after removing the altered instance", arvore.pesquisa(neg1307b));
        assertFalse("Two distinct instances with different lifecycles should not be equal", neg1307a.equals(neg1307b));
    }

    /**
     * test09: Inserting the same instance twice should still allow it to be found and keep stable internal state.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given
        MeuItem repeated = makeItem(165);

        // When
        arvore.insere(repeated);
        arvore.insere(repeated);

        // Then
        Item found = arvore.pesquisa(repeated);
        assertNotNull("Item inserted (even twice) should be findable", found);
        assertEquals("Item's tamanho should be consistent after duplicate inserts", 4, ((MeuItem) found).tamanho());
    }

    /**
     * test10: Searching for a non-existing item returns null while existing items remain findable.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given
        MeuItem stored = makeItem(-2351);
        MeuItem queried = makeItem(165);
        arvore.insere(stored);

        // When
        Item resultQueried = arvore.pesquisa(queried);
        Item resultStored = arvore.pesquisa(stored);

        // Then
        assertNull("Querying a non-inserted item should return null", resultQueried);
        assertNotNull("Stored item should still be found", resultStored);
    }

    /**
     * test11: Insert an item and assert that searching for a different key returns null and the inserted item is findable.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Given
        MeuItem inserted = makeItem(205);
        MeuItem other = makeItem(0);
        arvore.insere(inserted);

        // When
        Item searchOther = arvore.pesquisa(other);
        Item searchInserted = arvore.pesquisa(inserted);

        // Then
        assertNull("Searching for different key should yield null", searchOther);
        assertNotNull("Inserted item should be findable", searchInserted);
        assertEquals("Inserted item returned by search should equal original", inserted, searchInserted);
    }

    /**
     * test12: Insert an item and then search for that exact item; ensure returned object is consistent.
     *
     * Requirement: REQ-ARV-001
     */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        // Given
        MeuItem inserted = makeItem(-1);
        arvore.insere(inserted);

        // When
        Item found = arvore.pesquisa(inserted);

        // Then
        assertNotNull("Inserted item should be found", found);
        assertEquals("Returned item should have expected tamanho", 4, ((MeuItem) found).tamanho());
        assertEquals("Returned item should be equal to the inserted instance", inserted, found);
    }
}