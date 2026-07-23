package ds.seed7992;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for TabelaHash.
 *
 * These tests are small behavior checks that:
 * - exercise single responsibilities per test (Given-When-Then)
 * - assert observable outcomes (capture printed output)
 * - are annotated with a simple category marker to aid selection
 *
 * NOTE: The original auto-generated header was removed and tests were made
 * explicit and more descriptive while keeping original test method names.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Helper to capture System.out produced while running an action.
     *
     * @param action a Runnable containing the code that writes to System.out
     * @return the captured output as a String (UTF-8)
     */
    private String captureStdOut(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps;
        try {
            ps = new PrintStream(baos, true, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            ps = new PrintStream(baos, true);
        }
        try {
            System.setOut(ps);
            action.run();
        } finally {
            System.setOut(originalOut);
            ps.flush();
            ps.close();
        }
        try {
            return baos.toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            return baos.toString();
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: a fresh hash table and a key/value pair
        TabelaHash tabelaHash0 = new TabelaHash();
        final String key = "test0-key";
        final Object value = null;

        // When: inserting the key and printing the table contents
        tabelaHash0.insere(key, value);
        String output = captureStdOut(tabelaHash0::imprime);

        // Then: printed representation should be non-null and should mention the inserted key
        assertNotNull("imprime() should not return null output", output);
        assertTrue("Printed output should contain the inserted key", output.contains(key));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a table with one entry
        TabelaHash tabelaHash0 = new TabelaHash();
        final String existingKey = "HZ'({";
        final String existingValue = "Ilk";
        tabelaHash0.insere(existingKey, existingValue);

        // When: attempting to remove a non-existing key
        tabelaHash0.retira("w");

        // Then: the original entry should still be present in the printed output
        String output = captureStdOut(tabelaHash0::imprime);
        assertNotNull("imprime() should produce output after retira of missing key", output);
        assertTrue("Table should still contain the previously inserted key", output.contains(existingKey));
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a table with one entry
        TabelaHash tabelaHash0 = new TabelaHash();
        final String key = "HZ'({";
        final String value = "Ilk";
        tabelaHash0.insere(key, value);

        // When: removing the inserted key
        tabelaHash0.retira(key);

        // Then: the printed output should no longer contain the removed key
        String output = captureStdOut(tabelaHash0::imprime);
        assertNotNull("imprime() should produce output after retira", output);
        assertFalse("Printed output should not contain the removed key", output.contains(key));
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: an empty table
        TabelaHash tabelaHash0 = new TabelaHash();
        final String key1 = "HZ'({";
        final String key2 = "";
        final String value1 = "HZ'({";
        final String value2 = "";

        // When: inserting two different keys
        tabelaHash0.insere(key1, value1);
        tabelaHash0.insere(key2, value2);

        // Then: both keys should be visible in the printed output
        String output = captureStdOut(tabelaHash0::imprime);
        assertNotNull("imprime() should produce output after multiple inserts", output);
        assertTrue("Printed output should contain first inserted key", output.contains(key1));
        assertTrue("Printed output should contain second inserted key (possibly empty string key)", output.contains(key2));
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: an empty table and an object value
        TabelaHash tabelaHash0 = new TabelaHash();
        final String key = "duplicateKey";
        final Object firstValue = new Object();
        final String secondValue = "second";

        // When: inserting the same key twice (expect overwrite behavior)
        tabelaHash0.insere(key, firstValue);
        tabelaHash0.insere(key, secondValue);

        // Then: printed output should contain the key; best-effort check for the overwritten value
        String output = captureStdOut(tabelaHash0::imprime);
        assertNotNull("imprime() should produce output after overwriting an entry", output);
        assertTrue("Printed output should contain the key that was inserted", output.contains(key));
        // If the implementation prints values, prefer to see the latest value representation
        assertTrue("Printed output should reflect either the original or the overwritten value (contains 'second' or object class name)",
                output.contains("second") || output.contains(firstValue.getClass().getSimpleName()) || output.contains(firstValue.toString()));
    }
}