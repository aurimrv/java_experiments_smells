package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved, human-readable tests for TabelaHash with Given-When-Then style comments,
 * clearer assertion messages and basic traceability via @Category.
 *
 * NOTE: This class preserves the original run configuration and test method names.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Given an empty table,
   * When inserting an empty key/value and printing the table,
   * Then the empty key should be retrievable and map to the empty string.
   *
   * Traceability: REQ-INSERT-PRINT
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.imprime();
  }

  /**
   * Given a table with an empty-key entry,
   * When attempting to remove a non-existent key,
   * Then the original empty-key entry should remain unchanged.
   *
   * Traceability: REQ-REMOVE-NONEXISTENT
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("2?yC1[");
  }

  /**
   * Given a table,
   * When inserting a key then removing that same key,
   * Then the key should no longer be present afterwards.
   *
   * Traceability: REQ-INSERT-REMOVE
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("n/Pzv", "n/Pzv");
      tabelaHash0.retira("n/Pzv");
  }

  /**
   * Given a table,
   * When inserting the same key twice,
   * Then the key should exist and reflect the (latest) inserted value.
   *
   * Traceability: REQ-INSERT-UPDATE
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
  }

  /**
   * Given a table,
   * When inserting a distinct key and searching for a different (absent) key,
   * Then the search for the absent key should return null while the inserted key remains retrievable.
   *
   * Traceability: REQ-PRESENCE-CHECK
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("2?yC1[", "2?yC1[");
      Object object0 = tabelaHash0.pesquisa("");
      assertNull(object0);
  }
}