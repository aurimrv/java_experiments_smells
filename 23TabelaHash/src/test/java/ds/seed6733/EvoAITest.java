package ds.seed6733;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for ds.TabelaHash.
 *
 * Requirement traceability:
 * - REQ-TH-001: Basic insert, remove, and lookup semantics
 * - REQ-TH-002: Handling of null values as stored values
 *
 * These tests follow Given-When-Then and include descriptive assertions to
 * improve diagnosability compared to the original auto-generated tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true,
        resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Given a fresh table, when inserting then removing the same key,
   * then the table should no longer contain that key.
   *
   * REQ-TH-001
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();

    // When: insert a value and then remove it
    tabelaHash0.insere("key0", "value0");
    tabelaHash0.retira("key0");

    // Then: lookup returns null and items array does not contain the removed entry
    Object found = tabelaHash0.pesquisa("key0");
    assertNull("After removing 'key0' pesquisa should return null", found);

    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should never return null", items);
    // Ensure that no item equals the removed value
    for (Object item : items) {
      assertNotEquals("Removed value should not be present in items", "value0", item);
    }
  }

  /**
   * Given a table, when inserting a key with a null value then removing the key,
   * then the table should not contain that key and recuperaItens should reflect removal.
   *
   * REQ-TH-002
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();

    // When
    tabelaHash0.insere("nullableKey", (Object) null);
    tabelaHash0.retira("nullableKey");

    // Then
    Object lookup = tabelaHash0.pesquisa("nullableKey");
    assertNull("Removed nullableKey should not be found", lookup);

    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens should not be null", items);
    // The table should not contain any element equal to the removed (null) entry
    for (Object it : items) {
      assertNotEquals("No item should represent the removed nullableKey", null, it);
    }
  }

  /**
   * Given a table, when inserting a key with a null value,
   * then recuperaItens should include that stored (possibly-null) value and pesquisa should return null value.
   *
   * REQ-TH-002
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();

    // When
    tabelaHash0.insere("kNull", (Object) null);

    // Then
    Object found = tabelaHash0.pesquisa("kNull");
    // We expect the stored value to be null (distinct from missing key, but API returns null for both cases).
    assertNull("Stored value for 'kNull' should be null", found);

    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens should not be null", items);
    assertTrue("recuperaItens should contain at least one element after inserting one key",
            items.length >= 1);
  }

  /**
   * Given an empty table, removing a non-existent key should be a no-op: pesquisa remains null.
   *
   * REQ-TH-001
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    String missing = "$8>[MiXpB";

    // Pre-condition
    assertNull("Key should not exist initially", tabelaHash0.pesquisa(missing));

    // When: attempt to remove non-existent key
    tabelaHash0.retira(missing);

    // Then: still not present
    assertNull("Key should still not exist after retira", tabelaHash0.pesquisa(missing));
  }

  /**
   * Given a value retrieved from a lookup (possibly null), inserting that value under another key
   * should make it visible under the new key.
   *
   * REQ-TH-001
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    Object object0 = tabelaHash0.pesquisa("4nS"); // likely null for fresh table

    // When: insert the retrieved object (may be null) under a different key
    tabelaHash0.insere("newKey", object0);

    // Then: pesquisa on newKey should reflect the stored object (null or not)
    Object lookedUp = tabelaHash0.pesquisa("newKey");
    assertEquals("Stored object under 'newKey' should match the inserted object", object0, lookedUp);

    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens should not be null after insertion", items);
    assertTrue("recuperaItens should contain at least one entry after insertion", items.length >= 1);
  }

  /**
   * Given repeated inserts under the same key, the last inserted value should be returned by pesquisa.
   *
   * REQ-TH-001
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();

    // When: insert twice under same key with different values
    tabelaHash0.insere("dupKey", "first");
    tabelaHash0.insere("dupKey", "second");

    // Then: pesquisa should return the last value
    Object result = tabelaHash0.pesquisa("dupKey");
    assertEquals("Last inserted value should be returned for duplicate key", "second", result);
  }

  /**
   * Given inserts under multiple keys including null values,
   * pesquisa should reflect stored values per key.
   *
   * REQ-TH-001, REQ-TH-002
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();

    // When
    tabelaHash0.insere("4nS", (Object) null);
    tabelaHash0.insere("emptyKey", "nonEmptyValue");

    // Then
    assertNull("Value for '4nS' should be null after insertion", tabelaHash0.pesquisa("4nS"));
    assertEquals("Value for 'emptyKey' should match inserted value", "nonEmptyValue", tabelaHash0.pesquisa("emptyKey"));

    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens should not be null", items);
    assertTrue("recuperaItens should contain at least two entries after two inserts", items.length >= 2);
  }

  /**
   * Given multiple inserts across keys, lookups should return the most recent insert per key.
   *
   * REQ-TH-001
   */
  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();

    // When: perform several inserts
    tabelaHash0.insere("4nS", (Object) null);
    tabelaHash0.insere("4nS", "4nS");
    tabelaHash0.insere("", "");
    tabelaHash0.insere("zic/BU", "4nS");
    tabelaHash0.insere("Entrada[", "entryValue");

    // Then: verify lookups reflect last inserts
    assertEquals("Key '4nS' should return last non-null inserted value", "4nS", tabelaHash0.pesquisa("4nS"));
    assertEquals("Empty key should return the stored empty string value", "", tabelaHash0.pesquisa(""));
    assertEquals("Key 'zic/BU' should return '4nS'", "4nS", tabelaHash0.pesquisa("zic/BU"));
    assertEquals("Key 'Entrada[' should return 'entryValue'", "entryValue", tabelaHash0.pesquisa("Entrada["));

    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens should not be null", items);
    assertTrue("recuperaItens should contain at least four entries after inserts", items.length >= 4);
  }

  /**
   * Given a table with non-null values, imprime should execute without throwing,
   * and the internal state (recuperaItens) should be consistent.
   *
   * REQ-TH-001
   */
  @Test(timeout = 4000)
  public void test8() throws Throwable {
    // Given
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("printKey", "printValue");

    // When / Then: calling imprime should not throw an exception for typical non-null content
    try {
      tabelaHash0.imprime();
    } catch (Exception e) {
      fail("imprime() should not throw for non-null content, but threw: " + e);
    }

    // And: internal items reflect the inserted key
    Object[] items = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens should not be null after imprime", items);
    boolean contains = false;
    for (Object it : items) {
      if ("printValue".equals(it)) {
        contains = true;
        break;
      }
    }
    assertTrue("recuperaItens should contain the inserted 'printValue' entry", contains);
  }
}