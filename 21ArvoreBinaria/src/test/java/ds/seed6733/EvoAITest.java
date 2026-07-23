package ds.seed6733;

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
 * Marker interface for unit tests so these tests can be filtered if required.
 */
interface UnitTest {}

/**
 * Improved and clarified tests for ArvoreBinaria operations.
 *
 * Notes:
 * - Tests retain original method names to preserve test signatures.
 * - Each test follows a simple Given-When-Then structure with clearer assertions and messages.
 * - Tests avoid calling potentially disruptive methods (such as any system-exiting helpers) and
 *   instead assert observable, stable properties of the SUT and items.
 */
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

    /**
     * Helper to create a fresh tree instance for each test.
     */
    private ArvoreBinaria newTree() {
        return new ArvoreBinaria();
    }

    /**
     * REQ-001: Inserting items and mutating item keys should not throw and items should remain usable.
     *
     * Given: an empty tree and two items inserted.
     * When: both items have their keys changed (alteraChave).
     * Then: items remain non-null, their reported size remains stable, and newly inserted lookups are searchable.
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem itemA = new MeuItem(-875);
        MeuItem itemB = new MeuItem(-42);

        // When
        tree.insere(itemA);
        tree.insere(itemB);

        // Mutate keys (should not throw)
        itemA.alteraChave(Integer.valueOf(-42));
        itemB.alteraChave(Integer.valueOf(-875));

        // Insert a sentinel item and verify search behavior for a known inserted value.
        MeuItem sentinel = new MeuItem(12345);
        tree.insere(sentinel);

        // Then
        assertNotNull("Inserted item A must remain a valid reference", itemA);
        assertNotNull("Inserted item B must remain a valid reference", itemB);
        assertEquals("Item A size should remain stable after key change", 4, itemA.tamanho());
        assertEquals("Item B size should remain stable after key change", 4, itemB.tamanho());

        Item foundSentinel = tree.pesquisa(sentinel);
        assertSame("Sentinel item should be found by pesquisa and be the same instance", sentinel, foundSentinel);
    }

    /**
     * REQ-002: Updating item key after insertion should not corrupt the item instance (basic invariant checks).
     *
     * Given: tree with two items inserted.
     * When: one item's key is changed.
     * Then: the mutated item remains non-null and retains expected structural size.
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem originalZero = new MeuItem(0);
        MeuItem originalLarge = new MeuItem(2531);

        // When
        tree.insere(originalLarge);
        tree.insere(originalZero);

        // Mutate key of the zero item
        originalZero.alteraChave(Integer.valueOf(2915));

        // Then: basic invariants
        assertNotNull("Original item must still be a valid instance after key change", originalZero);
        assertEquals("MeuItem.tamanho() should remain stable (expected 4) after key mutation", 4, originalZero.tamanho());
        assertEquals("Other item should be unaffected in size", 4, originalLarge.tamanho());
    }

    /**
     * REQ-003: Simple insertion should not throw and basic invariants hold.
     *
     * Given: a tree and a single negative-key item.
     * When: the item is inserted.
     * Then: the item is retrievable via pesquisa by reference and is non-null.
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem single = new MeuItem(-858);

        // When
        tree.insere(single);

        // Then
        Item found = tree.pesquisa(single);
        assertNotNull("Inserted item should be found by pesquisa", found);
        assertSame("Pesquisa should return the same instance that was inserted", single, found);
        assertEquals("Inserted item's tamanho() should be as expected", 4, single.tamanho());
    }

    /**
     * REQ-004: Insert then remove should leave the item instance intact and tree operations should behave deterministically.
     *
     * Given: a tree with two distinct items inserted.
     * When: one item is removed.
     * Then: removed item should not equal the remaining item and sizes remain as expected.
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem first = new MeuItem(-874);
        MeuItem second = new MeuItem(0);

        // When
        tree.insere(first);
        tree.insere(second);
        tree.retira(first);

        // Then
        assertFalse("Removed item should not equal the still-present item", first.equals((Object) second));
        // Basic structural assertions on instances
        assertEquals("Removed item instance should still report consistent size", 4, first.tamanho());
        assertEquals("Remaining item should report consistent size", 4, second.tamanho());
    }

    /**
     * REQ-005: Insert and remove the same item should succeed and the item instance remains consistent.
     *
     * Given: a tree and a single item inserted.
     * When: same item is removed.
     * Then: the item's tamanho remains consistent after removal.
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem item = new MeuItem(1);

        // When
        tree.insere(item);
        tree.retira(item);

        // Then
        assertEquals("After inserting and removing the same item, tamanho() should still be consistent", 4, item.tamanho());
        assertNotNull("Item instance remains a valid reference even after removal", item);
    }

    /**
     * REQ-006: Removing a non-inserted item should not affect the removed-instance invariants.
     *
     * Given: a tree with one different item inserted.
     * When: an unrelated item is removed.
     * Then: the unrelated item instance retains expected size and no exceptions occur.
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem inserted = new MeuItem(-879);
        MeuItem notInserted = new MeuItem(0);

        // When
        tree.insere(inserted);
        tree.retira(notInserted); // removing item not present should be safe

        // Then
        assertEquals("Uninserted item should report consistent size after attempted removal", 4, notInserted.tamanho());
        assertEquals("Inserted item should remain unaffected in size", 4, inserted.tamanho());
    }

    /**
     * REQ-007: Removing a non-present item should not make it equal to a present one.
     *
     * Given: tree with one inserted item.
     * When: we attempt to remove a different item.
     * Then: the two items remain distinct.
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem present = new MeuItem(1);
        MeuItem absent = new MeuItem(-453);

        // When
        tree.insere(present);
        tree.retira(absent); // should be a no-op

        // Then
        assertFalse("An absent item should not be considered equal to a present item", absent.equals((Object) present));
        assertEquals("Present item's size remains stable", 4, present.tamanho());
        assertEquals("Absent item's size remains stable even if it was never inserted", 4, absent.tamanho());
    }

    /**
     * REQ-008: Insert multiple items and remove one; ensure removed instance remains distinct.
     *
     * Given: multiple items inserted.
     * When: one of them is removed.
     * Then: the removed item instance does not equal a different inserted instance.
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem a = new MeuItem(-956);
        MeuItem b = new MeuItem(-1231);
        MeuItem c = new MeuItem(1149);
        MeuItem d = new MeuItem(-1144);

        // When
        tree.insere(a);
        tree.insere(b);
        tree.insere(d);
        tree.insere(c);

        tree.retira(a);

        // Then
        assertFalse("Removed item 'a' should not equal item 'c' which remains in the tree", a.equals((Object) c));
        assertEquals("Removed item should remain a valid instance after removal", 4, a.tamanho());
        assertEquals("Remaining item should report consistent size", 4, c.tamanho());
    }

    /**
     * REQ-009: Inserting items with a mixture of negative and small positive keys is tolerated; basic search for a new key succeeds.
     *
     * Given: a tree with two items inserted.
     * When: a new small positive item is inserted.
     * Then: pesquisa finds that new item.
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem neg = new MeuItem(-858);
        MeuItem small = new MeuItem(18);

        // When
        tree.insere(neg);
        tree.insere(small);

        // Then: ensure the recently inserted small item is discoverable
        Item found = tree.pesquisa(small);
        assertSame("Pesquisa should return the same instance that was inserted for small item", small, found);
        assertEquals("Small item's tamanho() should be as expected", 4, small.tamanho());
    }

    /**
     * REQ-010: Insert two negative-key items and ensure inserting multiple items does not throw.
     *
     * Given: a fresh tree.
     * When: insert two negative-key items.
     * Then: both become discoverable (at least by searching their instances).
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem first = new MeuItem(-858);
        MeuItem second = new MeuItem(-1095);

        // When
        tree.insere(first);
        tree.insere(second);

        // Then
        assertSame("First inserted instance must be discoverable", first, tree.pesquisa(first));
        assertSame("Second inserted instance must be discoverable", second, tree.pesquisa(second));
        assertEquals("First item reports expected tamanho()", 4, first.tamanho());
        assertEquals("Second item reports expected tamanho()", 4, second.tamanho());
    }

    /**
     * REQ-011: Inserting the same instance twice should not alter the instance's reported size.
     *
     * Given: a tree and a single item.
     * When: the same item is inserted twice.
     * Then: the item's tamanho stays consistent.
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem item = new MeuItem(-858);

        // When
        tree.insere(item);
        tree.insere(item); // duplicate insert attempt

        // Then
        assertEquals("Duplicate insertion should not change the instance reported tamanho", 4, item.tamanho());
        assertSame("pesquisa should find the inserted instance", item, tree.pesquisa(item));
    }

    /**
     * REQ-012: Searching for a non-existing key returns null.
     *
     * Given: tree with one item inserted.
     * When: we search for a distinct item not present.
     * Then: pesquisa returns null for that distinct item.
     */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem present = new MeuItem(-858);
        MeuItem absent = new MeuItem(18);

        // When
        tree.insere(present);

        // Then
        Item itemFound = tree.pesquisa(absent);
        assertNull("Searching for an absent item should return null", itemFound);
        assertSame("Searching for the present item should return the same instance", present, tree.pesquisa(present));
    }

    /**
     * REQ-013: Searching for another absent key returns null even after other insertions.
     *
     * Given: tree with one inserted item.
     * When: we search for a different absent item.
     * Then: pesquisa returns null.
     */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem present = new MeuItem(1);
        MeuItem absent = new MeuItem(-453);

        // When
        tree.insere(present);

        // Then
        Item itemFound = tree.pesquisa(absent);
        assertNull("pesquisa should return null for a key that was not inserted", itemFound);
        assertSame("pesquisa should find the inserted item", present, tree.pesquisa(present));
    }

    /**
     * REQ-014: Inserting an item and then searching by that same instance should return the instance.
     *
     * Given: a tree and an item inserted.
     * When: we search for that same item.
     * Then: pesquisa returns the identical instance.
     */
    @Test(timeout = 4000)
    public void test13() throws Throwable {
        // Given
        ArvoreBinaria tree = newTree();
        MeuItem item = newMeuItem(-858);

        // When
        tree.insere(item);

        // Then
        Item found = tree.pesquisa(item);
        assertSame("pesquisa must return the same instance that was inserted", item, found);
        assertEquals("Inserted item has expected tamanho()", 4, item.tamanho());
    }

    /**
     * Factory method used in test13 to emphasize instance creation and to avoid accidental sharing.
     */
    private MeuItem newMeuItem(int chave) {
        return new MeuItem(chave);
    }
}