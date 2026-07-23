package ds.seed7992;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved and focused tests for TabelaHash.
 *
 * Traceability: REQ-1234 - Basic hash table behavior (insert, remove, enumerate)
 *
 * Notes:
 * - Each test targets a single behavior (Given-When-Then style in comments).
 * - Assertions include descriptive messages to aid diagnosis.
 */
interface UnitTest {}

public class EvoAITest {

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given: an empty table and a single entry to add
        TabelaHash tabelaHash0 = new TabelaHash();
        String key = "=?=-ux>k";
        tabelaHash0.insere(key, "value");

        // When: the entry is removed and the table is printed
        tabelaHash0.retira(key);
        // imprime() is an observable action; assert it does not throw
        tabelaHash0.imprime();

        // Then: the table should be empty (no items returned)
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null", items);
        assertEquals("After inserting then removing the single entry, table should be empty", 0, items.length);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given: a table with a single entry
        TabelaHash tabelaHash0 = new TabelaHash();
        String key = "=?=-ux>k";
        String value = "someValue";
        tabelaHash0.insere(key, value);

        // Sanity check (pre-condition)
        Object[] beforeRemoval = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after insertion", beforeRemoval);
        assertEquals("Expected exactly one item after insertion", 1, beforeRemoval.length);

        // When: the entry is removed
        tabelaHash0.retira(key);

        // Then: the table should be empty
        Object[] afterRemoval = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after removal", afterRemoval);
        assertEquals("Expected zero items after removing the only entry", 0, afterRemoval.length);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given: an empty table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When: insert using an empty string key and a null value
        tabelaHash0.insere("", (Object) null);

        // Then: there should be one stored item (empty-key entry)
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after inserting empty-key", items);
        assertEquals("Insertion with empty string key should result in one item", 1, items.length);

        // And imprime should be safe to call (no exception)
        tabelaHash0.imprime();
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given: an empty table
        TabelaHash tabelaHash0 = new TabelaHash();
        String key = "~{MF#Tx.";
        String value = "~{MF#Tx.";

        // When: insert the same key twice (idempotent or replace behavior)
        tabelaHash0.insere(key, value);
        Object[] afterFirst = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after first insert", afterFirst);
        assertEquals("Expected one item after first insert", 1, afterFirst.length);

        tabelaHash0.insere(key, value); // insert same key again

        // Then: number of unique keys should remain one (duplicate insert should not create extra entries)
        Object[] afterSecond = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after second insert", afterSecond);
        assertEquals("Inserting same key again should not increase unique key count", 1, afterSecond.length);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test4() throws Throwable {
        // Given: a table and multiple distinct keys
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("Jq;^jf{//L", "Jq;^jf{//L");
        tabelaHash0.insere("", "2~C7mV@nz=Z,w*1G");
        tabelaHash0.insere("x", "Jq;^jf{//L");
        tabelaHash0.insere("Entrada[", "Jq;^jf{//L");
        tabelaHash0.insere("~{MF#Tx.", "~{MF#Tx.");
        Object object0 = new Object();
        tabelaHash0.insere("|O+(hNK]I~R", object0);
        tabelaHash0.insere("IE$6A@O?", "IE$6A@O?");

        // Sanity: expect 7 unique keys
        Object[] afterInserts = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after multiple inserts", afterInserts);
        assertEquals("Expected seven unique items after initial inserts", 7, afterInserts.length);

        // When: remove one key and re-insert it with the same object
        tabelaHash0.retira("IE$6A@O?");
        Object[] afterRemoval = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after removal", afterRemoval);
        assertEquals("Expected six items after removing one key", 6, afterRemoval.length);

        tabelaHash0.insere("IE$6A@O?", object0);
        Object[] afterReinsert = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after reinserting", afterReinsert);
        assertEquals("Expected seven items after reinserting the removed key", 7, afterReinsert.length);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test5() throws Throwable {
        // Given: a table with one entry under key "2]?Rw=],5"
        TabelaHash tabelaHash0 = new TabelaHash();
        String presentKey = "2]?Rw=],5";
        tabelaHash0.insere(presentKey, "X=b%x0O2i'E");

        // When: attempt to remove a non-existent (empty) key
        tabelaHash0.retira("");

        // Then: the original entry should remain
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after attempting to remove non-existent key", items);
        assertEquals("Removing a non-existent key should not remove existing entries", 1, items.length);

        // And removal of the existing key should succeed (table becomes empty)
        tabelaHash0.retira(presentKey);
        Object[] afterRemoval = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after removing the present key", afterRemoval);
        assertEquals("Expected zero items after removing the present key", 0, afterRemoval.length);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test6() throws Throwable {
        // Given: an empty table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When: insert one entry and call imprime
        tabelaHash0.insere("2]?Rw=],5", "X=b%x0O2i'E");

        // Then: the table should report one stored item and imprime should not throw
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after insert", items);
        assertEquals("Expected exactly one item after single insertion", 1, items.length);

        // Calling imprime to ensure no exceptions and visual verification in logs if needed
        tabelaHash0.imprime();

        // And the item should still remain after printing
        Object[] afterPrint = tabelaHash0.recuperaItens();
        assertEquals("Printing should not modify table contents", items.length, afterPrint.length);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test7() throws Throwable {
        // Given: multiple insert operations including repeated inserts for the same key
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", (Object) null);
        tabelaHash0.insere("", (Object) null);
        tabelaHash0.insere("", "~{r vDhFI+o"); // replace value for empty key
        tabelaHash0.insere("", (Object) null); // replace again with null
        tabelaHash0.insere("~{r vDhFI+o", "~{r vDhFI+o"); // distinct key (same string as previous value)
        tabelaHash0.insere("rQe<S", (Object) null);
        tabelaHash0.insere("", ""); // replace empty key with empty string value
        tabelaHash0.insere("", ""); // idempotent

        // Then: unique keys should be three: "", "~{r vDhFI+o", "rQe<S"
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after many inserts", items);
        assertEquals("Expected exactly three unique keys after repeated inserts and replacements", 3, items.length);
    }
}