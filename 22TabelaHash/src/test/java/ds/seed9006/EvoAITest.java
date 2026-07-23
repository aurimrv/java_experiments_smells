package ds.seed9006;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for TabelaHash focusing on basic insert/print/remove behaviors.
 *
 * Requirement: REQ-42 - Basic hash table insert/remove/print functionality
 *
 * These tests intentionally exercise observable behavior via the public
 * imprime() method so they do not rely on any particular return type
 * of retira(...) which may vary between implementations.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  private String captureImprime(TabelaHash tabela) {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    try {
      System.setOut(ps);
      tabela.imprime();
    } finally {
      System.setOut(originalOut);
    }
    return baos.toString();
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: an empty table and a key/value inserted
    TabelaHash tabelaHash0 = new TabelaHash();
    String key = ")7BW?";
    Object value = "val0";

    // When: inserting the key and printing the table
    tabelaHash0.insere(key, value);
    String outputAfterInsert = captureImprime(tabelaHash0);

    // Then: the printed representation must contain the key and the inserted value
    assertNotNull("imprime() output should not be null after insert", outputAfterInsert);
    assertTrue("Inserted key should appear in imprime() output",
        outputAfterInsert.contains(key));
    assertTrue("Inserted value should appear in imprime() output",
        outputAfterInsert.contains(value.toString()));

    // And: removing the key should make it disappear from imprime() output
    tabelaHash0.retira(key);
    String outputAfterRemove = captureImprime(tabelaHash0);
    assertFalse("Key should not appear after removal", outputAfterRemove.contains(key));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a table with one entry
    TabelaHash tabelaHash0 = new TabelaHash();
    String existingKey = ")7BW?";
    String value = "value1";
    tabelaHash0.insere(existingKey, value);

    // When: attempting to remove a non-existent key
    String missingKey = "<";
    tabelaHash0.retira(missingKey);

    // Then: the existing entry should still be present
    String output = captureImprime(tabelaHash0);
    assertTrue("Existing key should remain after attempting to remove a different key",
        output.contains(existingKey));
    assertTrue("Existing value should remain after attempting to remove a different key",
        output.contains(value));

    // And: removing the existing key should remove it
    tabelaHash0.retira(existingKey);
    String outputAfterRemove = captureImprime(tabelaHash0);
    assertFalse("Existing key should be removed", outputAfterRemove.contains(existingKey));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: a table and two different values for the same key
    TabelaHash tabelaHash0 = new TabelaHash();
    String key = "a<";
    String firstValue = "firstValue";
    String secondValue = "secondValue";

    // When: inserting the first value, then inserting a second value for same key (replace)
    tabelaHash0.insere(key, firstValue);
    tabelaHash0.insere(key, secondValue);

    // Then: the printed output should reflect the most recent value and not the first
    String output = captureImprime(tabelaHash0);
    assertTrue("Key should appear in imprime() output after inserts", output.contains(key));
    assertTrue("Second (latest) value should appear in imprime() output", output.contains(secondValue));
    assertFalse("First (replaced) value should not appear after replacement", output.contains(firstValue));

    // Clean up: removing the key should remove it
    tabelaHash0.retira(key);
    String outputAfterRemove = captureImprime(tabelaHash0);
    assertFalse("Key should not appear after removal", outputAfterRemove.contains(key));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: an empty table and two distinct entries
    TabelaHash tabelaHash0 = new TabelaHash();
    String key1 = ")7BW?";
    String key2 = "6r'LT55";
    String val1 = "v1";
    String val2 = "v2";

    // When: inserting both entries
    tabelaHash0.insere(key1, val1);
    tabelaHash0.insere(key2, val2);

    // Then: both keys and values should appear in the printed output
    String output = captureImprime(tabelaHash0);
    assertTrue("First key should appear after insert", output.contains(key1));
    assertTrue("Second key should appear after insert", output.contains(key2));
    assertTrue("First value should appear after insert", output.contains(val1));
    assertTrue("Second value should appear after insert", output.contains(val2));

    // When: remove the first key
    tabelaHash0.retira(key1);
    String afterRemoveFirst = captureImprime(tabelaHash0);

    // Then: first key should be gone and second should still be present
    assertFalse("First key should not appear after removal", afterRemoveFirst.contains(key1));
    assertTrue("Second key should still appear after removal of the first", afterRemoveFirst.contains(key2));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: an empty table and an entry with an empty-string key
    TabelaHash tabelaHash0 = new TabelaHash();
    String emptyKey = "";
    String value = "emptyValue";

    // When: inserting the empty key and printing
    tabelaHash0.insere(emptyKey, value);
    String outputAfterInsert = captureImprime(tabelaHash0);

    // Then: the printed output should include the empty key's associated value
    // Note: the empty key itself may be invisible in output; assert on the value presence
    assertTrue("Value associated with empty key should appear in imprime() output",
        outputAfterInsert.contains(value));

    // When: removing the empty key
    tabelaHash0.retira(emptyKey);

    // Then: the value should no longer appear
    String outputAfterRemove = captureImprime(tabelaHash0);
    assertFalse("Value associated with empty key should not appear after removal",
        outputAfterRemove.contains(value));
  }
}