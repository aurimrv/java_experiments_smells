package ds.seed1448;

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
 * Unit tests for TabelaHash focusing on common behaviors:
 * - insertion and retrieval
 * - handling of empty keys
 * - update semantics for duplicate keys
 * - robustness of removal of non-existent keys
 *
 * Traceability: REQ-001 (basic map operations)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given a fresh table,
   * When inserting a key-value pair and requesting a print,
   * Then the printed representation must contain the key or value and pesquisa must return the stored value.
   *
   * Traceability: REQ-001-PRINT
   */
  @Test(timeout = 4000)
  public void test0() throws Exception {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    final String key = "JT";
    final String value = "]`Ib";

    // When
    tabelaHash0.insere(key, value);

    // Then (1) pesquisa returns inserted value
    Object lookedUp = tabelaHash0.pesquisa(key);
    assertNotNull("After insertion, pesquisa should not return null for the inserted key.", lookedUp);
    assertEquals("pesquisa should return the exact value that was inserted.", value, lookedUp);

    // And Then (2) imprime produces output containing the key or value (non-destructive observation)
    PrintStream originalOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(baos));
      // Observation: imprime should not throw and should produce some representation
      tabelaHash0.imprime();
    } finally {
      System.setOut(originalOut);
    }
    String printed = baos.toString("UTF-8");
    assertTrue("imprime output should contain the key or value for the inserted entry.",
        printed.contains(key) || printed.contains(value));
  }

  /**
   * Given a fresh table,
   * When inserting an object value under a specific key,
   * Then pesquisa should return the exact same object reference.
   *
   * Traceability: REQ-001-INSERT-OBJ
   */
  @Test(timeout = 4000)
  public void test1() throws Exception {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    final String key = "|7";

    // When: insert the table instance itself as the value (allowed behavior)
    tabelaHash0.insere(key, tabelaHash0);

    // Then: retrieval yields the same object reference
    Object found = tabelaHash0.pesquisa(key);
    assertNotNull("Inserted object value must be retrievable.", found);
    assertTrue("Retrieved object should be the same instance that was inserted.", found == tabelaHash0);
  }

  /**
   * Given a table,
   * When inserting an empty string key,
   * Then searching for that empty key returns its value and searching for an unrelated key returns null.
   *
   * Traceability: REQ-001-EMPTY-KEY
   */
  @Test(timeout = 4000)
  public void test2() throws Exception {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    final String emptyKey = "";
    final String emptyValue = "";

    // When: insert empty key/value and lookup a missing key
    tabelaHash0.insere(emptyKey, emptyValue);
    Object foundEmpty = tabelaHash0.pesquisa(emptyKey);
    Object notFound = tabelaHash0.pesquisa("yF8!");

    // Then
    assertNotNull("pesquisa should return the stored value for an empty-string key.", foundEmpty);
    assertEquals("The value stored under an empty key must be exactly the inserted value.", emptyValue, foundEmpty);
    assertNull("pesquisa should return null for keys that were not inserted.", notFound);
  }

  /**
   * Given a table,
   * When inserting the same key twice with different values,
   * Then the latter value should replace the former (update semantics).
   *
   * Traceability: REQ-001-UPDATE
   */
  @Test(timeout = 4000)
  public void test3() throws Exception {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    final String key = "M2QJ,[=";
    final String firstValue = "first";
    final String secondValue = "second";

    // When: insert first value, then insert updated value for same key
    tabelaHash0.insere(key, firstValue);
    Object afterFirst = tabelaHash0.pesquisa(key);
    tabelaHash0.insere(key, secondValue);
    Object afterSecond = tabelaHash0.pesquisa(key);

    // Then
    assertEquals("After first insertion, pesquisa should return the first value.", firstValue, afterFirst);
    assertEquals("After updating the same key, pesquisa should return the most recent value.", secondValue, afterSecond);
  }

  /**
   * Given a table with an entry,
   * When attempting to remove a non-existent (empty) key,
   * Then the existing entry must remain unaffected.
   *
   * Traceability: REQ-001-REMOVE-ABSENCE
   */
  @Test(timeout = 4000)
  public void test4() throws Exception {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    final String presentKey = "8";
    final String presentValue = "8";

    tabelaHash0.insere(presentKey, presentValue);

    // When: attempt to remove a key that was never inserted (empty string)
    tabelaHash0.retira("");

    // Then: the originally inserted key should still be present
    Object stillThere = tabelaHash0.pesquisa(presentKey);
    assertNotNull("Removing a non-existent key should not remove other entries.", stillThere);
    assertEquals("The original mapping should remain unchanged after attempting to remove an unrelated key.",
        presentValue, stillThere);
  }
}