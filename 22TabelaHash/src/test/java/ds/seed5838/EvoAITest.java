package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to categorize unit tests in this file.
 * Placed at package level so it can be referenced by @Category.
 */
interface UnitTest {}

/**
 * Improved and focused tests for TabelaHash.
 *
 * Notes:
 * - Each test follows Arrange-Act-Assert: setup (arrange), single action (act), and clear assertions (assert).
 * - Tests include descriptive messages and small, focused scenarios.
 * - Javadoc comments include simple requirement identifiers for traceability.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Requirement: HASH-NULL-001
   * Verify that inserting a null value under an empty key does not throw and that pesquisa returns null.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      // Arrange: insert an explicit null value for the empty key
      tabelaHash0.insere("", (Object) null);

      // Act: query the empty key
      Object result = tabelaHash0.pesquisa("");

      // Assert: the stored value is null (explicitly inserted), and imprime can be called without error
      assertNull("Expected pesquisa(\"\") to return null after inserting a null value", result);
      tabelaHash0.imprime();
  }

  /**
   * Requirement: HASH-DEL-001
   * Verify that removing an existing key makes it no longer retrievable.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange: insert a value for the key "*zH"
      tabelaHash0.insere("*zH", "*zH");

      // Act: remove the previously inserted key
      tabelaHash0.retira("*zH");

      // Assert: lookup now returns null for the removed key
      Object afterRemoval = tabelaHash0.pesquisa("*zH");
      assertNull("Expected key '*zH' to be absent after retira", afterRemoval);
  }

  /**
   * Requirement: HASH-REPLACE-001
   * Verify that inserting a null value for an existing key replaces the previous value.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange: insert an initial non-null value under the empty key
      tabelaHash0.insere("", "initial");

      // Act: replace the value with null for the same key
      tabelaHash0.insere("", (Object) null);

      // Assert: the value for the key is now null (replacement succeeded)
      Object current = tabelaHash0.pesquisa("");
      assertNull("Expected pesquisa(\"\") to return null after replacing the value with null", current);
  }

  /**
   * Requirement: HASH-PESQ-001
   * Verify that pesquisa returns the inserted value for an existing key and null for a missing key.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange: insert an empty string value for a specific key
      tabelaHash0.insere("D{^rr", "");

      // Act & Assert: existing key returns the inserted empty string
      Object found = tabelaHash0.pesquisa("D{^rr");
      assertEquals("Expected to find the inserted empty string for key 'D{^rr'", "", found);

      // Act & Assert: querying a different, non-existent key returns null
      Object missing = tabelaHash0.pesquisa(",/^c&3");
      assertNull("Expected pesquisa for unknown key ',/^c&3' to return null", missing);
  }

  /**
   * Requirement: HASH-DEL-NE-001
   * Verify that attempting to remove a non-existent key does not remove other entries.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange: insert a value under the empty key
      tabelaHash0.insere("", "");

      // Act: attempt to remove a different, non-existent key
      tabelaHash0.retira("`,~0(5L");

      // Assert: the original entry should remain retrievable
      Object value = tabelaHash0.pesquisa("");
      assertEquals("Expected existing key '' to remain after trying to remove a different non-existent key", "", value);
  }
}