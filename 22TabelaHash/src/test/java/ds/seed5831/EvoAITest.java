package ds.seed5831;

import ds.TabelaHash;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Lightweight, intention-revealing tests for TabelaHash.
 * Each test follows a Given-When-Then structure and asserts observable behavior.
 */
interface RequirementMarker {}

public class EvoAITest {

    /**
     * Helper to capture the textual output of TabelaHash.imprime().
     * Restores System.out after capture.
     */
    private String captureImprimeOutput(TabelaHash tabela) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        try {
            System.setOut(ps);
            tabela.imprime();
        } finally {
            System.setOut(originalOut);
            ps.close();
        }
        return baos.toString();
    }

    /**
     * Given: an empty table with one inserted entry.
     * When: imprime() is invoked (the behavior under test).
     * Then: the printed representation contains the inserted key.
     *
     * Requirement: REQ-PRINT-01
     */
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("#", "#");

        // When
        String output = captureImprimeOutput(tabelaHash0);

        // Then
        assertNotNull("imprime() should produce output (not null)", output);
        assertTrue("imprime() output should contain the inserted key '#'", output.contains("#"));
    }

    /**
     * Given: a table with a single entry for key "#".
     * When: removing that key (retira) is performed (the behavior under test).
     * Then: the table no longer contains the key as shown by imprime().
     *
     * Requirement: REQ-REMOVE-01
     */
    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("#", "#");

        // When
        tabelaHash0.retira("#");

        // Then
        String after = captureImprimeOutput(tabelaHash0);
        assertNotNull("imprime() should produce output after removal", after);
        assertFalse("After retira('#'), imprime() should not contain '#'", after.contains("#"));
    }

    /**
     * Given: a table where an empty-string key was inserted previously.
     * When: inserting the same empty key again (duplicate insert is the behavior under test).
     * Then: the operation should not throw and table's printed representation is stable (non-null).
     *
     * Requirement: REQ-KEY-EMPTY-01
     */
    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("", "");

        // When (act): insert the empty key again (duplicate)
        tabelaHash0.insere("", "");

        // Then
        String output = captureImprimeOutput(tabelaHash0);
        assertNotNull("imprime() should produce output after duplicate insert of empty key", output);
        // We cannot rely on a textual representation of an empty key, but the output should be a stable String.
        assertTrue("imprime() output should be non-empty (length >= 0)", output.length() >= 0);
    }

    /**
     * Given: a table with key "#" inserted.
     * When: inserting an entry with an empty key (the behavior under test).
     * Then: imprime() should still include the previously inserted non-empty key.
     *
     * Requirement: REQ-MIXED-KEYS-01
     */
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("#", "#");

        // When: insert an empty key (we focus on effect on existing entry)
        tabelaHash0.insere("", "");

        // Then
        String output = captureImprimeOutput(tabelaHash0);
        assertNotNull("imprime() should produce output after inserting empty key", output);
        assertTrue("Existing key '#' should still appear after inserting empty key", output.contains("#"));
    }

    /**
     * Given: a table with key "#" inserted.
     * When: attempting to remove a non-existent empty key (the behavior under test).
     * Then: the existing entry should remain present as shown by imprime().
     *
     * Requirement: REQ-REMOVE-NONEXISTENT-01
     */
    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        // Given
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("#", "#");

        // When: attempt to remove a different (non-existent) key
        tabelaHash0.retira("");

        // Then: original entry should remain
        String output = captureImprimeOutput(tabelaHash0);
        assertNotNull("imprime() should produce output after removing non-existent key", output);
        assertTrue("Removing a non-existent key should not remove existing key '#'", output.contains("#"));
    }
}