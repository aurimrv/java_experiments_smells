package ds.seed5503;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface used to categorize unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class for TabelaHash.
 * Tests have been rewritten to follow Arrange-Act-Assert,
 * include assertions with messages, and provide simple traceability comments.
 */
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * REQ-INSERT-EMPTY: Verify that inserting an empty key stores and allows retrieval of the empty value.
   * Given a new table, when an empty key/value is inserted, then a subsequent search for that key returns the stored value.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();

      // Act
      tabelaHash0.insere("", "");

      // Assert
      Object result = tabelaHash0.pesquisa("");
      Assert.assertNotNull("After inserting empty key the value should be retrievable (not null).", result);
      Assert.assertEquals("Value stored for empty key should be the empty string.", "", result);
  }

  /**
   * REQ-REMOVE-NONEXISTENT: Ensure removing a non-existent key does not affect existing keys.
   * Given a table with one entry, when removing a different (non-existent) key, then the original entry remains present.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("existingKey", "existingValue");

      // Pre-assert (arrange verification)
      Assert.assertEquals("Precondition: existingKey must be present before removal attempt.", "existingValue", tabelaHash0.pesquisa("existingKey"));

      // Act: attempt to remove a key that was not inserted
      tabelaHash0.retira("2?yC1[");

      // Assert: existing key still present; non-existent key should still be absent
      Assert.assertEquals("Existing key should remain after attempting to remove a different key.", "existingValue", tabelaHash0.pesquisa("existingKey"));
      Assert.assertNull("Searching for a key that was never inserted should return null.", tabelaHash0.pesquisa("2?yC1["));
  }

  /**
   * REQ-REMOVE: Verify that removing an inserted key makes it no longer retrievable.
   * Given a table with a key, when that key is removed, then searches for it return null.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();
      final String key = "n/Pzv";
      final String value = "n/Pzv";

      // Act - insert then remove the same key
      tabelaHash0.insere(key, value);

      // Verify inserted
      Assert.assertEquals("Inserted key should be retrievable before removal.", value, tabelaHash0.pesquisa(key));

      tabelaHash0.retira(key);

      // Assert - after removal the key should not be found
      Assert.assertNull("After removal the key should no longer be retrievable.", tabelaHash0.pesquisa(key));
  }

  /**
   * REQ-UPDATE: Verify that inserting a value for an existing key replaces the previous value.
   * Given a table with a key/value, when a new value is inserted for the same key, then the latest value is returned by searches.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();
      final String key = "dupKey";
      final String firstValue = "first";
      final String secondValue = "second";

      // Act: insert initial value (Arrange)
      tabelaHash0.insere(key, firstValue);

      // Pre-assert to ensure initial state
      Assert.assertEquals("Initial insert must be retrievable.", firstValue, tabelaHash0.pesquisa(key));

      // Act: insert updated value for same key (this is the behavior under test)
      tabelaHash0.insere(key, secondValue);

      // Assert: the value should be updated to the second value
      Assert.assertEquals("Inserting a new value for an existing key should update the stored value.", secondValue, tabelaHash0.pesquisa(key));
  }

  /**
   * REQ-SEARCH-MISS: Verify that searching for a key that wasn't inserted returns null,
   * and that inserting a different key does not affect that result.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();
      final String insertedKey = "2?yC1[";
      final String insertedValue = "2?yC1[";

      // Act: insert a key different from the empty string
      tabelaHash0.insere(insertedKey, insertedValue);

      // Assert: searching for a non-inserted (empty) key returns null
      Assert.assertNull("Searching for an empty key that was not inserted should return null.", tabelaHash0.pesquisa(""));

      // Assert: the inserted key is retrievable and unaffected
      Assert.assertEquals("Inserted key should be retrievable and return the correct value.", insertedValue, tabelaHash0.pesquisa(insertedKey));
  }
}