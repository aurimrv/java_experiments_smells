package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for ArvoreBinaria (improved & annotated).
 * Requirement: ARV-001 Basic binary-tree insert/search/remove behavior.
 *
 * Note: This test class was adapted from generated scaffolding to provide clearer
 * assertions, messages, and small helper methods to avoid duplicated literals.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

    // Common constants to remove magic numbers and document intent
    private static final int KEY_NEG_A = -3435;
    private static final int KEY_NEG_B = -1472;
    private static final int KEY_NEG_C = -1456;
    private static final int KEY_NEG_D = -222;
    private static final int KEY_NEG_E = -1;
    private static final int KEY_POS_A = 3209;
    private static final int KEY_POS_B = 3204;
    private static final int KEY_POS_C = 1;
    private static final int KEY_OTHER = 4;
    private static final int EXPECTED_TAMANHO = 4;

    // Helper to create MeuItem, centralizing construction
    private static MeuItem newItem(int chave) {
        return new MeuItem(chave);
    }

    // Helper assertions to reduce duplication and provide descriptive messages
    private static void assertItemPresent(ArvoreBinaria arvore, MeuItem item, String msg) {
        Item found = arvore.pesquisa(item);
        assertNotNull(msg + " - expected item to be present but pesquisa returned null.", found);
        assertSame(msg + " - pesquisa did not return the expected item instance.", item, found);
    }

    private static void assertItemNotPresent(ArvoreBinaria arvore, MeuItem item, String msg) {
        Item found = arvore.pesquisa(item);
        assertNull(msg + " - expected item NOT to be present but pesquisa returned a non-null value.", found);
    }

    /**
     * test00: Insert two items and call testa().
     * Verifies that inserted items are searchable and that calling testa() does not trigger an unexpected SystemExit.
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = newItem(KEY_NEG_A);
        MeuItem meuItem1 = newItem(KEY_NEG_B);

        // When
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.insere(meuItem1);

        // Then - basic presence checks before invoking teste routine
        assertItemPresent(arvoreBinaria0, meuItem0, "After insert: meuItem0 should be present");
        assertItemPresent(arvoreBinaria0, meuItem1, "After insert: meuItem1 should be present");

        // Act - safe call to testa(); if a SystemExit simulation occurs, fail the test with a descriptive message
        try {
            arvoreBinaria0.testa();
        } catch (System.SystemExitException e) {
            fail("test00: Unexpected SystemExitException while calling testa(): " + e);
        }
    }

    /**
     * test01: Insert two items, alter one key and call testa() which in some environments triggers a simulated System.exit.
     * This test asserts that the code path triggers the expected simulated SystemExit exception.
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem original0 = newItem(KEY_NEG_A + 2); // -3433 approx as original
        MeuItem original1 = newItem(KEY_NEG_C - 33); // -1485 approx as original

        // When
        arvoreBinaria0.insere(original1);
        arvoreBinaria0.insere(original0);

        // Mutate: change the key of original0 to a positive value to exercise different code paths
        Integer newKey = new Integer(KEY_POS_B);
        original0.alteraChave(newKey);

        // Then: calling testa() in the test environment is expected to trigger System.SystemExitException.
        try {
            arvoreBinaria0.testa();
            fail("test01: Expected a System.SystemExitException to be thrown by testa() after chave alteration.");
        } catch (System.SystemExitException e) {
            // verifyException comes from EvoAssertions to ensure consistent exception provenance
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    /**
     * test02: Insert two items and call testa(). Verifies that both items remain searchable after insertion.
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem a = newItem(KEY_NEG_A);
        MeuItem b = newItem(KEY_NEG_C);

        // When
        arvoreBinaria0.insere(b);
        arvoreBinaria0.insere(a);

        // Then - ensure both are present
        assertItemPresent(arvoreBinaria0, a, "test02: item 'a' should be present after insertions");
        assertItemPresent(arvoreBinaria0, b, "test02: item 'b' should be present after insertions");

        // Act - call testa(); tolerant to simulated SystemExit for robustness
        try {
            arvoreBinaria0.testa();
        } catch (System.SystemExitException e) {
            fail("test02: Unexpected SystemExitException while calling testa(): " + e);
        }
    }

    /**
     * test03: Insert and then remove the same item.
     * Verifies that removal yields the expected item size and that the item is no longer searchable.
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem item = newItem(KEY_NEG_A);

        // When
        arvoreBinaria0.insere(item);
        arvoreBinaria0.retira(item);

        // Then
        assertEquals("test03: After removing the item, its tamanho() should remain the expected value.", EXPECTED_TAMANHO, item.tamanho());
        assertItemNotPresent(arvoreBinaria0, item, "test03: Item should not be present after retira()");
    }

    /**
     * test04: Attempt to remove an item that was not inserted and verify no unintended side-effects.
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem inserted = newItem(KEY_NEG_A);
        MeuItem notInserted = newItem(KEY_POS_A);

        // When
        arvoreBinaria0.insere(inserted);
        arvoreBinaria0.retira(notInserted); // removing a non-present item should be a no-op

        // Then
        assertEquals("test04: Size of not-inserted item should be the expected constant.", EXPECTED_TAMANHO, notInserted.tamanho());
        // Verify that the inserted item remains present after a no-op removal attempt
        assertItemPresent(arvoreBinaria0, inserted, "test04: Inserted item must remain present after attempting to remove a different item");
        // And the notInserted item is not present in the tree
        assertItemNotPresent(arvoreBinaria0, notInserted, "test04: notInserted should not be present since it was never added");
    }

    /**
     * test05: Remove an item that was not previously inserted; ensure equality semantics and no side-effects on inserted items.
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem missing = newItem(KEY_NEG_A);
        MeuItem present = newItem(KEY_NEG_C);

        // When
        arvoreBinaria0.insere(present);
        arvoreBinaria0.retira(missing); // should not remove 'present'

        // Then
        assertFalse("test05: Different items must not be equal.", missing.equals((Object) present));
        assertItemPresent(arvoreBinaria0, present, "test05: Present item should remain after attempting to remove a different item");
        assertItemNotPresent(arvoreBinaria0, missing, "test05: Missing item should not be found in the tree");
    }

    /**
     * test06: Insert two distinct items then remove one; verify the removal and that the remaining item is intact.
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem first = newItem(KEY_NEG_A);
        MeuItem second = newItem(KEY_POS_A);

        // When
        arvoreBinaria0.insere(first);
        arvoreBinaria0.insere(second);
        arvoreBinaria0.retira(first);

        // Then
        assertFalse("test06: first and second should not be equal after operations.", first.equals((Object) second));
        assertItemNotPresent(arvoreBinaria0, first, "test06: 'first' should not be present after removal");
        assertItemPresent(arvoreBinaria0, second, "test06: 'second' should still be present after removing 'first'");
    }

    /**
     * test07: Insert three items, remove one of them, and ensure correct membership for all.
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem a = newItem(KEY_NEG_C);
        MeuItem b = newItem(KEY_NEG_A);
        MeuItem c = newItem(KEY_POS_A);

        // When
        arvoreBinaria0.insere(a);
        arvoreBinaria0.insere(b);
        arvoreBinaria0.insere(c);
        arvoreBinaria0.retira(a);

        // Then
        assertFalse("test07: removed item 'a' should not equal remaining item 'b'.", a.equals((Object) b));
        assertItemNotPresent(arvoreBinaria0, a, "test07: 'a' should not be present after removal");
        assertItemPresent(arvoreBinaria0, b, "test07: 'b' should remain present after removing 'a'");
        assertItemPresent(arvoreBinaria0, c, "test07: 'c' should remain present after removing 'a'");
    }

    /**
     * test08: Insert the same item twice and validate its properties.
     * Some tree implementations ignore duplicate inserts; the important part is that the item remains searchable.
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem repeated = newItem(-222);

        // When - insert the same instance twice
        arvoreBinaria0.insere(repeated);
        arvoreBinaria0.insere(repeated);

        // Then - tamanho is an intrinsic property of the item and should be stable
        assertEquals("test08: Item tamanho() should remain stable after duplicate inserts.", EXPECTED_TAMANHO, repeated.tamanho());
        // And the item should be searchable
        assertItemPresent(arvoreBinaria0, repeated, "test08: Repeated item should be searchable after duplicate inserts");
    }

    /**
     * test09: Insert one item and search for a different key; expect null for missing key and presence for the inserted one.
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem present = newItem(KEY_NEG_E);
        MeuItem absent = newItem(KEY_OTHER);

        // When
        arvoreBinaria0.insere(present);

        // Then
        assertItemPresent(arvoreBinaria0, present, "test09: inserted item should be present");
        Item item0 = arvoreBinaria0.pesquisa(absent);
        assertNull("test09: pesquisa for absent item should return null.", item0);
    }

    /**
     * test10: Insert a positive key and search for a different negative key; verify search behavior for missing key.
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem missing = newItem(KEY_NEG_A - 3333); // -3768 approx as original
        MeuItem present = newItem(KEY_POS_C);

        // When
        arvoreBinaria0.insere(present);

        // Then
        Item item0 = arvoreBinaria0.pesquisa(missing);
        assertNull("test10: pesquisa should return null for keys not present in the tree.", item0);
        assertItemPresent(arvoreBinaria0, present, "test10: inserted 'present' item should be searchable");
    }

    /**
     * test11: Insert an item and immediately search for it; verify reference equality and stable tamanho().
     */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Given
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem item = newItem(KEY_NEG_D);

        // When
        arvoreBinaria0.insere(item);

        // Then
        Item item0 = arvoreBinaria0.pesquisa(item);
        assertSame("test11: pesquisa should return the same instance that was inserted.", item, item0);
        assertEquals("test11: inserted item's tamanho() should match the expected constant.", EXPECTED_TAMANHO, item.tamanho());
    }
}