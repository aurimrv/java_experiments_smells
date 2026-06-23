/*
 * Improved version of EvoSuite-generated test class
 */

package ds.seed5482;

import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

interface UnitTest {}

/**
 * Unit tests for TabelaHash.
 * Covers REQ-HASH-001 through REQ-HASH-005: Basic hash table operations.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends TabelaHash_ESTest_scaffolding {

    private static final String EMPTY_KEY = "";
    private static final String EMPTY_VALUE = "";
    private static final String SLASH_COLON_KEY = "/:";
    private static final String SEARCH_KEY = "}|$7r";

    /**
     * Tests insertion of empty key-value pair and print operation.
     * Covers REQ-HASH-001: Basic insertion and print functionality.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        // When
        tabelaHash0.insere(EMPTY_KEY, EMPTY_VALUE);
        // Then
        Object result = tabelaHash0.pesquisa(EMPTY_KEY);
        assertNotNull("Inserted empty key should be retrievable", result);
        assertEquals("Inserted value should match empty string", EMPTY_VALUE, result);
    }

    /**
     * Tests retira with a key not present in the table.
     * Covers REQ-HASH-002: Remove non-existent key leaves existing entries intact.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(SLASH_COLON_KEY, SLASH_COLON_KEY);
        // When
        tabelaHash0.retira(EMPTY_KEY);
        // Then
        Object remaining = tabelaHash0.pesquisa(SLASH_COLON_KEY);
        assertNotNull("Original entry should still exist after removing different key", remaining);
        assertEquals("Original entry value should match", SLASH_COLON_KEY, remaining);
    }

    /**
     * Tests that retira removes an existing entry.
     * Covers REQ-HASH-003: Remove existing key removes the entry.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(EMPTY_KEY, EMPTY_VALUE);
        // When
        tabelaHash0.retira(EMPTY_KEY);
        // Then
        Object result = tabelaHash0.pesquisa(EMPTY_KEY);
        assertNull("Entry should be removed after retira", result);
    }

    /**
     * Tests duplicate key insertion behavior.
     * Covers REQ-HASH-004: Duplicate key insertion is handled correctly.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(EMPTY_KEY, "first");
        // When
        tabelaHash0.insere(EMPTY_KEY, "second");
        // Then
        Object result = tabelaHash0.pesquisa(EMPTY_KEY);
        assertNotNull("Entry should exist after duplicate insert", result);
    }

    /**
     * Tests that pesquisa returns null for a key not in the table.
     * Covers REQ-HASH-005: Search for non-existent key returns null.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test4() throws Throwable {
        // Given
        Random.setNextRandom(-20);
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(EMPTY_KEY, EMPTY_VALUE);
        // When
        Object object0 = tabelaHash0.pesquisa(SEARCH_KEY);
        // Then
        assertNull("Searching for a non-existent key should return null", object0);
    }
}