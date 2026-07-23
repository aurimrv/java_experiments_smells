package ds.seed6733;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests so tests can be filtered by category.
 */
interface UnitTest {}

/**
 * Improved tests for TabelaHash focusing each test on a single behavior,
 * adding assertions with descriptive messages and linking to a requirement id.
 *
 * Note: method names are preserved from the original generated suite.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-001: Inserting a key should allow it to be found by pesquisa(...)
   *
   * Given an empty table,
   * when a key/value pair is inserted,
   * then pesquisa(key) returns the inserted value.
   */
  @Test(timeout = 4000)
  public void test0() throws Exception {
    // Arrange
    TabelaHash tabelaHash0 = new TabelaHash();

    // Act (insert)
    String key = "";
    String value = "value";
    tabelaHash0.insere(key, value);

    // Assert: the inserted value can be retrieved
    Object found = tabelaHash0.pesquisa(key);
    assertNotNull("Expected pesquisa to return the inserted value, but it returned null", found);
    assertEquals("Retrieved value does not match the inserted value", value, found);
  }

  /**
   * REQ-002: Removing an existing key should make it no longer discoverable.
   *
   * Given a table with a single entry,
   * when that key is removed,
   * then pesquisa(key) returns null.
   */
  @Test(timeout = 4000)
  public void test1() throws Exception {
    // Arrange: insert a key that we will remove
    TabelaHash tabelaHash0 = new TabelaHash();
    final String key = "k";
    final String value = "v";
    tabelaHash0.insere(key, value);

    // Precondition check
    Object beforeRemove = tabelaHash0.pesquisa(key);
    assertEquals("Precondition failed: inserted value should be retrievable", value, beforeRemove);

    // Act: remove the key
    tabelaHash0.retira(key);

    // Assert: the key should no longer be found
    Object afterRemove = tabelaHash0.pesquisa(key);
    assertNull("Expected pesquisa to return null after removal of the key", afterRemove);
  }

  /**
   * REQ-003: Inserting a value for an existing key should update/replace the previous value.
   *
   * Given a key that already exists,
   * when a new value is inserted for the same key,
   * then pesquisa(key) returns the new value (by identity when appropriate).
   */
  @Test(timeout = 4000)
  public void test2() throws Exception {
    // Arrange
    TabelaHash tabelaHash0 = new TabelaHash();
    final String key = "";
    final String initialValue = "initial";
    tabelaHash0.insere(key, initialValue);

    // Act: insert again with a different object instance as value
    Object newValue = new Object();
    tabelaHash0.insere(key, newValue);

    // Assert: pesquisa should return the most recently inserted value (the same instance)
    Object found = tabelaHash0.pesquisa(key);
    assertNotNull("Expected pesquisa to return the updated value, but it returned null", found);
    assertSame("Expected pesquisa to return the new value instance after update", newValue, found);
  }

  /**
   * REQ-004: Searching for a non-existent key should return null and should not interfere
   * with existing entries.
   *
   * Given a table with a single entry,
   * when searching for a different key,
   * then pesquisa returns null for the missing key and the existing key remains retrievable.
   */
  @Test(timeout = 4000)
  public void test3() throws Exception {
    // Arrange
    TabelaHash tabelaHash0 = new TabelaHash();
    final String presentKey = "";
    final String presentValue = "present";
    tabelaHash0.insere(presentKey, presentValue);

    // Act: search for a key that was not inserted
    final String missingKey = "|vX\"i";
    Object missingResult = tabelaHash0.pesquisa(missingKey);

    // Assert: missing key returns null
    assertNull("Expected pesquisa to return null for a non-existent key", missingResult);

    // And assert the originally inserted key is still present
    Object presentResult = tabelaHash0.pesquisa(presentKey);
    assertNotNull("Expected the previously inserted key to still be present", presentResult);
    assertEquals("The value for the present key does not match the expected value", presentValue, presentResult);
  }

  /**
   * REQ-005: Removing a non-existent key should not affect other entries.
   *
   * Given a table with one entry,
   * when attempting to remove a different (non-existent) key,
   * then the original entry remains present and the non-existent key is not found.
   */
  @Test(timeout = 4000)
  public void test4() throws Exception {
    // Arrange
    TabelaHash tabelaHash0 = new TabelaHash();
    final String existingKey = "_j5";
    Object existingValue = new Object();
    tabelaHash0.insere(existingKey, existingValue);

    // Act: attempt to remove a key that does not exist
    final String nonExistentKey = "Zl9)";
    tabelaHash0.retira(nonExistentKey);

    // Assert: existing entry remains and non-existent key is still absent
    Object stillThere = tabelaHash0.pesquisa(existingKey);
    assertSame("Expected existing key to remain unchanged after attempting to remove a different key",
        existingValue, stillThere);

    Object absent = tabelaHash0.pesquisa(nonExistentKey);
    assertNull("Expected pesquisa to return null for a key that was never inserted", absent);
  }
}