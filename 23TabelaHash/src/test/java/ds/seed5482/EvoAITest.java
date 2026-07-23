package ds.seed5482;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Unit tests for TabelaHash focusing on common scenarios:
 * - insertions
 * - removals
 * - retrievals
 *
 * Requirement trace: REQ-001 (basic hash table semantics)
 *
 * Notes:
 * - These tests use the public API of TabelaHash as exercised by previous generated tests.
 * - Each test follows a Given-When-Then structure and contains explicit assertions with messages.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

    // Common test keys and values as named constants to avoid magic literals
    private static final String KEY_COLON_BRACKET = "]:";
    private static final String KEY_SPECIAL = "d5C#_c9$hu";
    private static final String KEY_SPACE = "  ";
    private static final String KEY_SEMICOLON = ";{jV";
    private static final String KEY_GARBLE = ".gs_y64%[";
    private static final String KEY_EMPTY = "";

    /**
     * test0
     * Given an empty table,
     * When a key is inserted with a null value and then removed,
     * Then the table should not contain the key and the item list should be empty.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();

        // When: insert a key with a null value, then remove it, and call imprime (should not throw)
        tabelaHash0.insere(KEY_COLON_BRACKET, (Object) null);
        tabelaHash0.retira(KEY_COLON_BRACKET);
        tabelaHash0.imprime(); // exercise printing path

        // Then: the removed key must not be found and the items array must be empty
        assertNull("After removing the key, pesquisa should return null", tabelaHash0.pesquisa(KEY_COLON_BRACKET));
        Object[] items = tabelaHash0.recuperaItens();
        assertEquals("Table should be empty after inserting null then removing the key", 0, items.length);
    }

    /**
     * test1
     * Given a table where a key is inserted and then removed,
     * When retrieving all items,
     * Then no items should remain and pesquisa for the removed key should be null.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();

        // When
        tabelaHash0.insere(KEY_COLON_BRACKET, (Object) null);
        tabelaHash0.retira(KEY_COLON_BRACKET);

        // Then
        Object[] objectArray0 = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null (should return an array)", objectArray0);
        assertEquals("No items should remain after insertion followed by removal", 0, objectArray0.length);
        assertNull("Removed key should not be found by pesquisa", tabelaHash0.pesquisa(KEY_COLON_BRACKET));
    }

    /**
     * test2
     * Given a table,
     * When inserting an object under a key,
     * Then pesquisa should return the same object and recuperarItens should reflect presence.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();

        // When
        tabelaHash0.insere(KEY_SPECIAL, object0);

        // Then
        Object retrieved = tabelaHash0.pesquisa(KEY_SPECIAL);
        assertSame("pesquisa should return the same object instance that was inserted", object0, retrieved);

        Object[] objectArray0 = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens must not be null", objectArray0);
        assertEquals("There should be exactly one stored item after single insertion", 1, objectArray0.length);
        // Verify that the single entry is the same object we inserted
        assertSame("recuperaItens should contain the inserted object", object0, objectArray0[0]);
    }

    /**
     * test3
     * Given an empty table,
     * When attempting to remove a non-existent key,
     * Then the table remains empty and pesquisa returns null for that key.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();

        // When: remove a non-existing key (should be a no-op, not throw)
        tabelaHash0.retira("Em@r<");

        // Then
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should return an array even for empty table", items);
        assertEquals("Table should remain empty after removing a non-existent key", 0, items.length);
        assertNull("pesquisa must return null for a key that was never inserted", tabelaHash0.pesquisa("Em@r<"));
    }

    /**
     * test4
     * Given a table with multiple inserts including overwrites and nulls,
     * When querying certain keys,
     * Then the most recent value for overwritten keys should be present and other keys should be retrievable.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();

        // When: perform a variety of inserts including overwrites
        tabelaHash0.insere(KEY_SPECIAL, object0);
        tabelaHash0.insere(KEY_COLON_BRACKET, (Object) null);
        tabelaHash0.insere(KEY_SPACE, KEY_SPACE);
        tabelaHash0.insere(KEY_SEMICOLON, KEY_SEMICOLON);
        tabelaHash0.insere(KEY_GARBLE, object0);
        tabelaHash0.insere(KEY_COLON_BRACKET, ""); // overwrite previous null with empty string
        tabelaHash0.insere(KEY_EMPTY, (Object) null);
        tabelaHash0.insere(KEY_EMPTY, (Object) null); // repeated insert with null

        // Then: verify a selection of keys for expected semantics
        assertSame("KEY_SPECIAL should return the originally inserted object", object0, tabelaHash0.pesquisa(KEY_SPECIAL));
        assertEquals("KEY_COLON_BRACKET should reflect the latest inserted value (empty string)", "", tabelaHash0.pesquisa(KEY_COLON_BRACKET));
        assertEquals("KEY_SEMICOLON should return its string value", KEY_SEMICOLON, tabelaHash0.pesquisa(KEY_SEMICOLON));
        assertNull("KEY_EMPTY was last inserted with null and should return null from pesquisa", tabelaHash0.pesquisa(KEY_EMPTY));
        // At least the keys we inserted should be discoverable (count may vary based on internal handling),
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens must not be null", items);
        assertTrue("There should be at least four distinct stored entries", items.length >= 4);
    }

    /**
     * test5
     * Given a table,
     * When inserting null under a key, removing it and reinserting an empty string,
     * Then pesquisa should reflect the reinsertion and earlier removal should have cleared value.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();

        // When
        tabelaHash0.insere(KEY_COLON_BRACKET, (Object) null);
        tabelaHash0.retira(KEY_COLON_BRACKET);

        // Then intermediate: removed
        assertNull("After removal, key should not be found", tabelaHash0.pesquisa(KEY_COLON_BRACKET));

        // When reinserting with empty string
        tabelaHash0.insere(KEY_COLON_BRACKET, "");

        // Then final
        Object valueAfterReinsert = tabelaHash0.pesquisa(KEY_COLON_BRACKET);
        assertNotNull("After reinsertion, pesquisa should not be null", valueAfterReinsert);
        assertEquals("After reinsertion, the value should be the empty string", "", valueAfterReinsert);
    }

    /**
     * test6
     * Given a table with several inserts,
     * When searching for a key that was never inserted,
     * Then pesquisa should return null.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();

        // When: populate table
        tabelaHash0.insere(KEY_SPECIAL, object0);
        tabelaHash0.insere(KEY_COLON_BRACKET, (Object) null);
        tabelaHash0.insere(KEY_SPACE, KEY_SPACE);
        tabelaHash0.insere(KEY_SEMICOLON, KEY_SEMICOLON);
        tabelaHash0.insere(KEY_GARBLE, object0);
        tabelaHash0.insere(KEY_COLON_BRACKET, "");
        tabelaHash0.insere(KEY_EMPTY, (Object) null);

        // Then: searching for a non-inserted key returns null
        Object object1 = tabelaHash0.pesquisa("Q;+R% N0^';");
        assertNull("pesquisa should return null for keys that were never inserted", object1);
    }

    /**
     * test7
     * Given a table,
     * When the same key is inserted twice with the same value,
     * Then the key should map to that value and only one entry should be present.
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();

        // When: insert same key twice
        tabelaHash0.insere(KEY_SPECIAL, object0);
        tabelaHash0.insere(KEY_SPECIAL, object0);

        // Then: pesquisa returns the object and there should be a single entry for that key
        assertSame("pesquisa must return the inserted object instance for duplicate inserts", object0, tabelaHash0.pesquisa(KEY_SPECIAL));
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not be null after inserts", items);
        assertEquals("Duplicate inserts of the same key should result in a single stored item", 1, items.length);
        assertSame("Stored item must be the object that was inserted", object0, items[0]);
    }

    /**
     * test8
     * Given a table,
     * When inserting a key and calling imprime,
     * Then imprime should not throw and pesquisa should return the inserted object.
     */
    @Test(timeout = 4000)
    public void test8() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();

        // When
        tabelaHash0.insere("Q.E7X~\"", object0);

        // Call imprime to exercise output path (should not throw)
        tabelaHash0.imprime();

        // Then
        assertSame("pesquisa should return the inserted object after imprime", object0, tabelaHash0.pesquisa("Q.E7X~\""));
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens must not be null", items);
        assertEquals("There should be exactly one stored item after single insertion", 1, items.length);
        assertSame("The single stored item should be the inserted object", object0, items[0]);
    }
}