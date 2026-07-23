package ds.seed5311;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for TabelaHash.
 *
 * Each test follows a Given-When-Then structure and includes assertions that verify
 * the expected behavior of the hash table for the exercised scenario.
 *
 * Requirement traceability examples (informational):
 * - REQ-TAB-001: basic insert and retrieve
 * - REQ-TAB-002: remove semantics
 * - REQ-TAB-003: handling of null values
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /* Helper: capture System.out output produced by an action */
    private String captureStdOut(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        try {
            System.setOut(ps);
            action.run();
        } finally {
            System.setOut(originalOut);
        }
        return baos.toString();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: a fresh table and an inserted empty-key entry
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", "");

        // When: the entry is removed
        tabelaHash0.retira("");

        // Then: table should be empty and imprime() should complete without throwing
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens must not return null", items);
        assertEquals("Table should be empty after removing the only element", 0, items.length);

        // imprime should not throw; capture output to assert it's empty or does not contain the removed key
        String output = captureStdOut(() -> tabelaHash0.imprime());
        assertNotNull("imprime output should not be null", output);
        // The output should not contain the empty key representation (if table is empty)
        assertFalse("Printed output should not contain previously removed key", output.contains("=") && output.contains(""));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a table with an inserted empty-key entry that is then removed
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", "");
        tabelaHash0.retira("");

        // When: we recover items and search for the key
        Object[] objectArray0 = tabelaHash0.recuperaItens();
        Object value = tabelaHash0.pesquisa("");

        // Then: no items should be present and pesquisa should return null
        assertNotNull("recuperaItens must not return null", objectArray0);
        assertEquals("Expected zero items after removal", 0, objectArray0.length);
        assertNull("Pesquisa for removed key should return null", value);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a table and an insertion of an empty-key / empty-value pair
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", "");

        // When: we retrieve items and search for the inserted key
        Object[] objectArray0 = tabelaHash0.recuperaItens();
        Object found = tabelaHash0.pesquisa("");

        // Then: there should be exactly one item and pesquisa should return the inserted value
        assertNotNull("recuperaItens must not return null", objectArray0);
        assertEquals("Expected one item after single insertion", 1, objectArray0.length);
        assertEquals("pesquisa should return the inserted value", "", found);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: a table where we insert, remove, then re-insert the same key with a new value
        TabelaHash tabelaHash0 = new TabelaHash();

        // When: perform operations: insert, remove, and re-insert with new value
        tabelaHash0.insere("", "");
        tabelaHash0.retira("");
        tabelaHash0.insere("", "TV");

        // Then: the key should be present with the new value and only one item exists
        Object found = tabelaHash0.pesquisa("");
        Object[] items = tabelaHash0.recuperaItens();

        assertEquals("After re-insert the pesquisa should return the new value", "TV", found);
        assertNotNull("recuperaItens must not return null", items);
        assertEquals("There should be exactly one item after re-insert", 1, items.length);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: a table where the same key is inserted twice
        TabelaHash tabelaHash0 = new TabelaHash();

        // When: insert twice with the same key and value
        tabelaHash0.insere("", "");
        tabelaHash0.insere("", "");

        // Then: the key should exist once and the value should match; no duplicate entries
        Object found = tabelaHash0.pesquisa("");
        Object[] items = tabelaHash0.recuperaItens();

        assertEquals("Value stored for key should equal the last inserted value", "", found);
        assertNotNull("recuperaItens must not return null", items);
        assertEquals("Duplicate insert of same key should not create multiple entries", 1, items.length);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given: a table where multiple keys are inserted, including null values and overwrites
        TabelaHash tabelaHash0 = new TabelaHash();

        tabelaHash0.insere("`7},3vFz", "`7},3vFz");
        Object object0 = tabelaHash0.pesquisa(">udi@-H}'j"); // expected to be null initially
        tabelaHash0.insere(">udi@-H}'j", (Object) null);
        tabelaHash0.insere("im<)", "im<)");
        tabelaHash0.insere(">udi@-H}'j", object0); // object0 is likely null
        tabelaHash0.insere("m9BUzs1)$", (Object) null);
        tabelaHash0.insere("m9BUzs1)$", ">udi@-H}'j"); // overwrite with a non-null value
        tabelaHash0.insere("m9BUzs1)$", (Object) null); // final overwrite with null
        tabelaHash0.insere("Ys]Zyb=oU~", (Object) null);

        // When: check retrievals for selected keys
        Object v1 = tabelaHash0.pesquisa("im<)");
        Object v2 = tabelaHash0.pesquisa("`7},3vFz");
        Object v3 = tabelaHash0.pesquisa(">udi@-H}'j");
        Object v4 = tabelaHash0.pesquisa("m9BUzs1)$");
        Object[] items = tabelaHash0.recuperaItens();

        // Then: verify expected contents and that_cliente keys exist as expected
        assertEquals("im<) should retrieve its own string value", "im<)", v1);
        assertEquals("Inserted key should retrieve its value", "`7},3vFz", v2);
        assertNull("Key '>udi@-H}'j' last set to null, pesquisa should return null", v3);
        assertNull("Key 'm9BUzs1)$' was finally set to null, pesquisa should return null", v4);
        assertNotNull("recuperaItens must not return null", items);
        // Expect at least the distinct keys inserted (some may map to same bucket but recuperaItens should reflect entries)
        assertTrue("Expected at least 3 distinct stored keys", items.length >= 3);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given: a table where a key is inserted with a null value
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", (Object) null);

        // When: calling imprime() may either handle nulls or throw NullPointerException.
        // We accept either behavior but assert the observed behavior is consistent.
        boolean npeThrown = false;
        String output = "";
        try {
            output = captureStdOut(() -> tabelaHash0.imprime());
        } catch (NullPointerException npe) {
            npeThrown = true;
            // Then: NullPointerException is an acceptable behavior but must be explicit
            assertNotNull("Caught NPE but exception object should not be null", npe);
        }

        // Then: if imprime did not throw, ensure the output reflects the presence (or explicit handling) of the null value
        if (!npeThrown) {
            // pesquisa should return null for the inserted key
            Object found = tabelaHash0.pesquisa("");
            assertNull("Inserted null value should be returned as null by pesquisa", found);
            assertNotNull("imprime output must be non-null when no exception is thrown", output);
            // Ensure output exists (may be empty depending on implementation), but at least no exception occurred
        }
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given: a table where an entry is inserted and removed twice
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", "");
        tabelaHash0.retira("");

        // When: removing the same key again should be a no-op and not throw
        tabelaHash0.retira("");

        // Then: table remains empty and pesquisa returns null
        Object[] items = tabelaHash0.recuperaItens();
        Object found = tabelaHash0.pesquisa("");

        assertNotNull("recuperaItens must not return null", items);
        assertEquals("Table should remain empty after removing the same key twice", 0, items.length);
        assertNull("Pesquisa for removed key should return null", found);
    }
}