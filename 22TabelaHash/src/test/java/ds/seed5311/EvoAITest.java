package ds.seed5311;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Unit tests for TabelaHash focusing on basic map semantics.
 *
 * Requirement traceability: REQ-1234 - Basic put/get/remove behavior for TabelaHash.
 *
 * Notes:
 * - Tests follow Given-When-Then style in comments.
 * - Category marker is declared at package level and applied to the class so tests can be filtered.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Given an empty table,
   * When inserting a key with a null value,
   * Then a subsequent pesquisa for that key returns null (value preserved as null or absent).
   *
   * REQ-1234
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert a key mapping to null
      tabelaHash0.insere("#[", (Object) null);

      // Then: pesquisa should return null for that key
      Object result = tabelaHash0.pesquisa("#[");
      assertNull("Expected pesquisa('#[') to return null after inserting a null value", result);

      // And: searching for an unrelated key remains null
      assertNull("Expected pesquisa('nonexistent') to return null on empty table", tabelaHash0.pesquisa("nonexistent"));
  }

  /**
   * Given a table with a single mapping,
   * When removing a different/non-existent key,
   * Then the original mapping remains unaffected.
   *
   * REQ-1234
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");

      // Sanity check: insertion succeeded
      Object before = tabelaHash0.pesquisa("");
      assertNotNull("Expected pesquisa('') to return a non-null value after insertion", before);
      assertEquals("Expected stored value to match the inserted empty string", "", before);

      // When: attempt to remove a different key that was not inserted
      tabelaHash0.retira("#[");

      // Then: the original key should still be present with the same value
      Object after = tabelaHash0.pesquisa("");
      assertEquals("Expected the mapping for '' to remain after removing a different key", before, after);
  }

  /**
   * Given a table with a single mapping,
   * When removing that key,
   * Then subsequent pesquisa should not find the mapping (returns null).
   *
   * REQ-1234
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");

      // Verify insertion
      Object stored = tabelaHash0.pesquisa("");
      assertEquals("Expected pesquisa('') to return the inserted empty string", "", stored);

      // When: remove the same key
      tabelaHash0.retira("");

      // Then: the key should no longer be present
      Object afterRemoval = tabelaHash0.pesquisa("");
      assertNull("Expected pesquisa('') to return null after removal of the key", afterRemoval);
  }

  /**
   * Given an empty table,
   * When inserting a non-null value and a null value for different keys,
   * Then pesquisa should return the correct values for each key.
   *
   * REQ-1234
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // Precondition: no mapping for empty key
      assertNull("Expected pesquisa('') to be null before any insertion", tabelaHash0.pesquisa(""));

      // When: insert a key with null and another key with a non-null value
      tabelaHash0.insere("#[", (Object) null);
      tabelaHash0.insere("", "nonEmptyValue");

      // Then: the empty key returns the non-null value
      Object valueEmptyKey = tabelaHash0.pesquisa("");
      assertEquals("Expected pesquisa('') to return the most recently inserted non-null value", "nonEmptyValue", valueEmptyKey);

      // And: the other key returns null (explicitly inserted null)
      Object valueNullKey = tabelaHash0.pesquisa("#[");
      assertNull("Expected pesquisa('#[') to return null for a key explicitly inserted with null", valueNullKey);
  }

  /**
   * Given an empty table,
   * When inserting the same mapping twice,
   * Then the mapping should remain and repeated puts with equal values should be idempotent.
   *
   * REQ-1234
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert a mapping twice
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");

      // Then: the mapping should still be present and equal to the inserted value
      Object value = tabelaHash0.pesquisa("");
      assertNotNull("Expected pesquisa('') to return a non-null value after insertion", value);
      assertEquals("Expected pesquisa('') to return the empty string after repeated insertions", "", value);
  }
}