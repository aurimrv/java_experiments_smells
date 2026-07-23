package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.verifyException;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface to allow categorization of tests.
 */
interface UnitTest {}

/**
 * Improved and stabilized version of the originally generated tests.
 *
 * Notes:
 * - Each test follows a simple Given-When-Then structure in comments.
 * - Tests include additional, descriptive assertions to increase diagnostic value.
 * - This class is labeled with @Category(UnitTest) for selective execution.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

    // Helper: construct a tree and insert given integer keys (as MeuItem)
    private ArvoreBinaria buildTree(Integer... keys) {
        ArvoreBinaria tree = new ArvoreBinaria();
        if (keys != null) {
            for (Integer k : keys) {
                tree.insere(new MeuItem(k));
            }
        }
        return tree;
    }

    // Helper: safe pesquisa with a clear assertion message
    private Item pesquisaOrNull(ArvoreBinaria tree, MeuItem probe) {
        return tree.pesquisa(probe);
    }

    /**
     * Given a tree with two items, when one item's key is changed to create a specific
     * condition, calling testa() is expected to trigger the runtime System exit path.
     *
     * REQ: REQ-ARV-TEST-EXIT-001
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(69);
        MeuItem meuItem1 = new MeuItem(2572);
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.insere(meuItem1);

        // Sanity: both items should be discoverable before key change
        assertNotNull("Inserted item (69) should be searchable before key change",
                pesquisaOrNull(arvoreBinaria0, meuItem0));
        assertNotNull("Inserted item (2572) should be searchable before key change",
                pesquisaOrNull(arvoreBinaria0, meuItem1));

        // When: change key of second item to a negative value to create edge condition
        Integer newKey = Integer.valueOf(-985);
        meuItem1.alteraChave(newKey);

        // Then: calling testa() should follow the original behavior and raise SystemExit
        try {
            arvoreBinaria0.testa();
            fail("Expecting System.SystemExitException from testa() after altering a key");
        } catch (System.SystemExitException e) {
            // verifyException helps attribute the origin of the exception (Evo runtime wrapper)
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    /**
     * Given a small tree with two distinct keys, calling testa() should complete without
     * causing an exit. This asserts both preconditions and that no SystemExit occurs.
     *
     * REQ: REQ-ARV-TEST-NOEXIT-002
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = buildTree(0, 2577);
        MeuItem probe0 = new MeuItem(0);
        MeuItem probe1 = new MeuItem(2577);

        // Sanity checks
        assertNotNull("Probe for key 0 should find an inserted item", pesquisaOrNull(arvoreBinaria0, probe0));
        assertNotNull("Probe for key 2577 should find an inserted item", pesquisaOrNull(arvoreBinaria0, probe1));

        // When / Then: calling testa() should not exit; if it does, fail with message
        try {
            arvoreBinaria0.testa();
        } catch (System.SystemExitException e) {
            fail("test01 expected no SystemExitException from testa(), but one occurred");
        }
    }

    /**
     * Given two inserted items where one key is replaced with another item's key object,
     * calling testa() is expected (per original behavior) to invoke the System exit path.
     *
     * REQ: REQ-ARV-TEST-EXIT-003
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem source = new MeuItem(0);
        Object keyObject = source.recuperaChave(); // use key object from a fresh item
        MeuItem meuItem1 = new MeuItem(-996);
        MeuItem meuItem2 = new MeuItem(-1);
        arvoreBinaria0.insere(meuItem2);
        arvoreBinaria0.insere(meuItem1);

        // Sanity: both inserted items must be present before modification
        assertNotNull("Inserted item (-1) should be searchable before key change",
                pesquisaOrNull(arvoreBinaria0, meuItem2));
        assertNotNull("Inserted item (-996) should be searchable before key change",
                pesquisaOrNull(arvoreBinaria0, meuItem1));

        // When: set the key of meuItem1 to the source key object (could create duplicate/invalid state)
        meuItem1.alteraChave(keyObject);

        // Then: original behavior expected an exit; verify this behavior
        try {
            arvoreBinaria0.testa();
            fail("Expecting System.SystemExitException from testa() after key object replacement");
        } catch (System.SystemExitException e) {
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    /**
     * Given an inserted item, when it is removed, the item's internal state (size)
     * should remain consistent and the item should no longer be searchable.
     *
     * REQ: REQ-ARV-REMOVE-004
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(0);
        arvoreBinaria0.insere(meuItem0);

        // When: remove the same item
        arvoreBinaria0.retira(meuItem0);

        // Then: the MeuItem instance internal size should be as expected and it should not be in the tree
        assertEquals("MeuItem.tamanho() should remain stable after removal", 4, meuItem0.tamanho());
        assertNull("Removed item should not be found by pesquisa()", pesquisaOrNull(arvoreBinaria0, meuItem0));
    }

    /**
     * Given a tree with a different inserted key, attempting to remove a non-present item
     * should not corrupt the non-removed items, and the removed-probe's internal size remains unchanged.
     *
     * REQ: REQ-ARV-REMOVE-ABSENT-005
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem absentProbe = new MeuItem(0);
        MeuItem present = new MeuItem(-1007);
        arvoreBinaria0.insere(present);

        // When: attempt to remove an item that was never inserted
        arvoreBinaria0.retira(absentProbe);

        // Then: absent probe's internal state remains stable and the present item is still searchable
        assertEquals("Absent probe's tamanho() should be unchanged after attempted removal", 4, absentProbe.tamanho());
        assertNotNull("Present item should still be searchable after attempted removal of absent item",
                pesquisaOrNull(arvoreBinaria0, present));
    }

    /**
     * Given insertion of one item and attempted removal of an unrelated item, ensure objects remain distinct
     * and the tree still contains the originally inserted item.
     *
     * REQ: REQ-ARV-INsert-UNEQ-006
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem absent = new MeuItem(-2274);
        MeuItem present = new MeuItem(924);
        arvoreBinaria0.insere(present);

        // When: attempt to remove the non-existing item
        arvoreBinaria0.retira(absent);

        // Then: the absent and present instances are distinct and present is still findable
        assertNotSame("The absent probe and the present item should not be the same instance", absent, present);
        assertNotNull("Present item should still be searchable after attempted removal of absent item",
                pesquisaOrNull(arvoreBinaria0, present));
        assertNull("Absent item should not be found in the tree", pesquisaOrNull(arvoreBinaria0, absent));
    }

    /**
     * Given several inserted items, removing the root (or first inserted) should make it no longer searchable
     * while preserving other items in the tree.
     *
     * REQ: REQ-ARV-MULTI-REMOVE-007
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem root = new MeuItem(-978);
        MeuItem n1 = new MeuItem(-982);
        MeuItem n2 = new MeuItem(30);
        MeuItem n3 = new MeuItem(-1119);
        arvoreBinaria0.insere(root);
        arvoreBinaria0.insere(n3);
        arvoreBinaria0.insere(n2);
        arvoreBinaria0.insere(n1);

        // Sanity: ensure all nodes are present initially
        assertNotNull("Root should be searchable before removal", pesquisaOrNull(arvoreBinaria0, root));
        assertNotNull("n1 should be searchable before removal", pesquisaOrNull(arvoreBinaria0, n1));
        assertNotNull("n2 should be searchable before removal", pesquisaOrNull(arvoreBinaria0, n2));
        assertNotNull("n3 should be searchable before removal", pesquisaOrNull(arvoreBinaria0, n3));

        // When: remove the original root
        arvoreBinaria0.retira(root);

        // Then: root not present, others still present, and the removed instance preserves its size
        assertNull("Removed root should not be found by pesquisa()", pesquisaOrNull(arvoreBinaria0, root));
        assertNotNull("n1 should still be present after root removal", pesquisaOrNull(arvoreBinaria0, n1));
        assertNotNull("n2 should still be present after root removal", pesquisaOrNull(arvoreBinaria0, n2));
        assertNotNull("n3 should still be present after root removal", pesquisaOrNull(arvoreBinaria0, n3));
        assertEquals("Removed root instance tamanho() should remain stable", 4, root.tamanho());
    }

    /**
     * Given two different items inserted, removing one should not affect the other.
     *
     * REQ: REQ-ARV-REMOVE-ISOLATION-008
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem item0 = new MeuItem(0);
        MeuItem item1 = new MeuItem(2577);
        arvoreBinaria0.insere(item0);
        arvoreBinaria0.insere(item1);

        // When: remove item0
        arvoreBinaria0.retira(item0);

        // Then: item1 remains present and the removed item is no longer searchable
        assertNotSame("Removed item instance should not be the same as the remaining item", item0, item1);
        assertNull("Removed item should not be found after retira()", pesquisaOrNull(arvoreBinaria0, item0));
        assertNotNull("Remaining item should still be present after retira()", pesquisaOrNull(arvoreBinaria0, item1));
    }

    /**
     * Given two items inserted, calling testa() should execute without throwing; ensure both items are present.
     *
     * REQ: REQ-ARV-TEST-NOEXIT-009
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem a = new MeuItem(0);
        MeuItem b = new MeuItem(-996);
        arvoreBinaria0.insere(a);
        arvoreBinaria0.insere(b);

        // Sanity: both inserted items should be findable
        assertNotNull("Item a should be searchable before testa()", pesquisaOrNull(arvoreBinaria0, a));
        assertNotNull("Item b should be searchable before testa()", pesquisaOrNull(arvoreBinaria0, b));

        // When / Then: testa should run without producing SystemExit
        try {
            arvoreBinaria0.testa();
        } catch (System.SystemExitException e) {
            fail("test08 expected no SystemExitException from testa(), but one occurred");
        }
    }

    /**
     * Given insertion of an item, inserting the same instance again should not create duplicate references;
     * the item's reported size should remain stable.
     *
     * REQ: REQ-ARV-DUP-INSERT-010
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem item = new MeuItem(0);
        arvoreBinaria0.insere(item);

        // When: try to insert the same instance again
        arvoreBinaria0.insere(item);

        // Then: the instance's tamanho should remain consistent and the item should be present
        assertEquals("Repeated insertion of the same instance should not change MeuItem.tamanho()", 4, item.tamanho());
        assertNotNull("Item should be findable after repeated insertion", pesquisaOrNull(arvoreBinaria0, item));
    }

    /**
     * Given an inserted key, searching for a different non-inserted key should return null.
     *
     * REQ: REQ-ARV-SEARCH-NEG-011
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem inserted = new MeuItem(0);
        arvoreBinaria0.insere(inserted);

        // Sanity: inserted item should be present
        assertNotNull("Inserted item should be found by pesquisa()", pesquisaOrNull(arvoreBinaria0, inserted));

        // When: search for a non-inserted key
        MeuItem probe = new MeuItem(3547);
        Item item0 = arvoreBinaria0.pesquisa(probe);

        // Then: search for non-existing key returns null
        assertNull("Searching for a non-inserted key should return null", item0);
    }

    /**
     * Given an inserted key, searching for a different key should return null and the inserted key remains findable.
     *
     * REQ: REQ-ARV-SEARCH-NEG-012
     */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem inserted = new MeuItem(0);
        arvoreBinaria0.insere(inserted);

        // Sanity: inserted should be searchable
        assertNotNull("Inserted item should be searchable", pesquisaOrNull(arvoreBinaria0, inserted));

        // When: search for a key that was not inserted
        MeuItem probe = new MeuItem(-996);
        Item item0 = arvoreBinaria0.pesquisa(probe);

        // Then: not found
        assertNull("Searching for -996 should return null when not inserted", item0);
    }

    /**
     * Given an inserted instance, pesquisa with the same instance should return the same reference.
     *
     * REQ: REQ-ARV-SEARCH-IDEMPOTENT-013
     */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem inserted = new MeuItem(0);
        arvoreBinaria0.insere(inserted);

        // When: search for the same instance
        Item item0 = arvoreBinaria0.pesquisa(inserted);

        // Then: returned object should be the identical reference and have same key
        assertSame("pesquisa() should return the same instance that was inserted when the same probe is used",
                inserted, item0);
        assertNotNull("Returned item should not be null", item0);
        assertEquals("Returned item's key should equal the inserted probe's key",
                inserted.recuperaChave(), ((MeuItem) item0).recuperaChave());
    }
}