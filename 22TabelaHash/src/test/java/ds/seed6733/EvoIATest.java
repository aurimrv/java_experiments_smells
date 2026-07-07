/*
 * Improved version of EvoSuite-generated tests for TabelaHash.
 */

package ds.seed6733;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Test suite for TabelaHash covering insert, search, remove, and print operations.
 * Covers normal flows, edge cases, and boundary values.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends TabelaHash_ESTest_scaffolding {

    private static final String EMPTY_KEY = "";
    private static final String EMPTY_VALUE = "";
    private static final String EXISTING_KEY = "_j5";
    private static final String NON_EXISTING_KEY = "Zl9)";
    private static final String SEARCH_MISSING_KEY = "|vX\"i";

    private TabelaHash createTableWithEmptyEntry() {
        TabelaHash t = new TabelaHash();
        t.insere(EMPTY_KEY, EMPTY_VALUE);
        return t;
    }

    /**
     * Verifies that inserting an empty key/value and calling imprime does not throw.
     * Covers: insert with empty key, then print.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given a hash table with an empty key entry
        TabelaHash tabelaHash0 = createTableWithEmptyEntry();
        // When imprime is called
        tabelaHash0.imprime();
        // Then the inserted entry should still be retrievable
        Object result = tabelaHash0.pesquisa(EMPTY_KEY);
        assertNotNull("Inserted empty key entry should be retrievable after imprime", result);
    }

    /**
     * Verifies that retira removes an existing entry identified by empty key.
     * Covers: insert then remove with same key.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given a hash table with an empty key entry
        TabelaHash tabelaHash0 = createTableWithEmptyEntry();
        // When retira is called with the same key
        tabelaHash0.retira(EMPTY_KEY);
        // Then the entry should be removed
        Object result = tabelaHash0.pesquisa(EMPTY_KEY);
        assertNull("Entry should be null after retira with empty key", result);
    }

    /**
     * Verifies that inserting with a duplicate key overwrites the existing value.
     * Covers: duplicate key insert behavior.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given a hash table with an empty key entry
        TabelaHash tabelaHash0 = createTableWithEmptyEntry();
        // When insere is called again with the same key and a new value
        Object object0 = new Object();
        tabelaHash0.insere(EMPTY_KEY, object0);
        // Then the value should be overwritten
        Object result = tabelaHash0.pesquisa(EMPTY_KEY);
        assertEquals("Duplicate key insert should overwrite the existing value", object0, result);
    }

    /**
     * Verifies that pesquisa returns null when the key does not exist in the table.
     * Covers: search for non-existent key.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given a hash table with an empty key entry
        TabelaHash tabelaHash0 = createTableWithEmptyEntry();
        // When pesquisa is called with a non-existent key
        Object object0 = tabelaHash0.pesquisa(SEARCH_MISSING_KEY);
        // Then null should be returned
        assertNull("Searching for a non-existent key should return null", object0);
    }

    /**
     * Verifies that retira with a non-existent key does not remove existing entries.
     * Covers: remove non-existent key, existing entry unaffected.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given a hash table with an existing entry
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();
        tabelaHash0.insere(EXISTING_KEY, object0);
        // When retira is called with a non-existent key
        tabelaHash0.retira(NON_EXISTING_KEY);
        // Then the original entry should still exist
        Object result = tabelaHash0.pesquisa(EXISTING_KEY);
        assertNotNull("Original entry should still exist after removing a non-existent key", result);
        assertEquals("Original entry value should be unchanged", object0, result);
    }
}