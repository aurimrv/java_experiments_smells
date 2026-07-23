package ds.seed5838;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.TabelaHash;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of unit tests.
 */
interface UnitTest {}

/**
 * Improved and cleaned-up tests for TabelaHash.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure and focuses on one observable behavior.
 * - Tests include assertions with clear messages to make failures easier to diagnose.
 * - These tests avoid relying on internal implementation details and only exercise the public API.
 */
@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: an empty hash table
    TabelaHash tabelaHash0 = new TabelaHash();

    // When: a single entry is inserted (single Act)
    tabelaHash0.insere("keyA", "valueA");

    // Then: the table should report one item
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null", itens);
    assertEquals("After inserting one entry, the table should contain exactly one item", 1, itens.length);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: a table with one entry
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("toRemove", "v");

    // When: the entry is removed (single Act)
    tabelaHash0.retira("toRemove");

    // Then: the table should be empty
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null after removal", itens);
    assertEquals("After removing the only entry, the table should be empty", 0, itens.length);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: an empty table
    TabelaHash tabelaHash0 = new TabelaHash();

    // When: a key is inserted with a null value (single Act)
    tabelaHash0.insere("@V@SGl", (Object) null);

    // Then: the table should contain one item; the concrete content is implementation-specific,
    // but the presence of one item indicates the insert was recorded.
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null when null-values are inserted", itens);
    assertEquals("Inserting a key with a null value should still count as one stored item", 1, itens.length);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given: a table with an existing entry for the empty-string key
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("", "initial");

    // When: the same key is re-inserted with a null value (this is the single Act)
    tabelaHash0.insere("", (Object) null);

    // Then: the table should still contain a single entry for that key
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null after updating a key to null", itens);
    assertEquals("Re-inserting an existing key (even with null) should not create duplicate entries", 1, itens.length);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given: an empty table with one prior insert (arrange)
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("dupKey", "firstValue");

    // When: the same key is inserted again with a different value (single Act)
    tabelaHash0.insere("dupKey", "secondValue");

    // Then: the table should not contain duplicate entries; size remains 1
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null after duplicate-key insert", itens);
    assertEquals("Inserting the same key twice should not increase the number of stored items", 1, itens.length);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given: a table with a few pre-existing keys
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("k1", "v1");
    tabelaHash0.insere("k2", "v2");

    // When: a new distinct key is inserted (single Act)
    tabelaHash0.insere("uniqueKey", "uniqueValue");

    // Then: the number of stored items should increase by one
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null after multiple inserts", itens);
    assertEquals("After adding a new distinct key, total items should be three", 3, itens.length);
  }

  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given: a table with a single entry
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("existing", (Object) null);

    // When: attempting to remove a non-existent key (single Act)
    tabelaHash0.retira("N0rNmxV=*%_"); // should be a no-op

    // Then: the original entry should remain (count unchanged)
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null when removing non-existent key", itens);
    assertEquals("Removing a non-existent key should not change the number of items", 1, itens.length);
  }

  @Test(timeout = 4000)
  public void test7() throws Throwable {
    // Given: a table with a key that has a null value
    TabelaHash tabelaHash0 = new TabelaHash();
    tabelaHash0.insere("maybeNull", (Object) null);

    // When: calling imprime() to produce a textual representation (single Act).
    // Some implementations may print safely; others might throw a NullPointerException.
    try {
      tabelaHash0.imprime();
    } catch (NullPointerException npe) {
      // Then (alternative): if a NullPointerException is thrown, ensure it carries no unexpected information
      assertNull("If imprime() throws NullPointerException, its message should be null for this implementation", npe.getMessage());
    }

    // And finally, regardless of imprime() outcome, the stored items should still be present
    Object[] itens = tabelaHash0.recuperaItens();
    assertNotNull("recuperaItens() should not return null after imprime() call", itens);
    assertEquals("Table should still contain the previously inserted item after imprime()", 1, itens.length);
  }
}