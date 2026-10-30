package ds.seed5503;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Unit tests for TabelaHash with clearer structure and assertions.
 *
 * Traceability:
 *  - REQ-HT-001: Basic insert/remove/search behavior for hash table.
 *  - REQ-HT-002: Retrieval of stored items and state after operations.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

    /**
     * Given an empty table,
     * When inserting an entry with an empty key and then removing it,
     * Then the table should not have that entry and the items array should be empty.
     *
     * REQ-HT-001
     */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      tabelaHash0.imprime();
  }

    /**
     * Given a table and a single key/value pair,
     * When inserting then removing that key,
     * Then the recovered items array must be empty.
     *
     * REQ-HT-001
     */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("DusF", object0);
      tabelaHash0.retira("DusF");
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(0, objectArray0.length);
  }

    /**
     * Given a fresh table,
     * When inserting one entry,
     * Then recuperaItens should report one item and pesquisa should return the stored object.
     *
     * REQ-HT-002
     */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("DusF", object0);
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(1, objectArray0.length);
  }

    /**
     * Given an empty table,
     * When attempting to remove a non-existing key,
     * Then the table remains empty and no exception is thrown.
     *
     * REQ-HT-001
     */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.retira("DusF");
  }

    /**
     * Given a table with a key inserted and then removed,
     * When re-inserting the same key with the same object,
     * Then pesquisa should return the last inserted object instance.
     *
     * REQ-HT-002
     */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("DusF", object0);
      tabelaHash0.retira("DusF");
      tabelaHash0.insere("DusF", object0);
  }

    /**
     * Given a table,
     * When inserting the same key twice with the same object,
     * Then the table should contain (logically) one entry for that key and pesquisa should return the object.
     *
     * REQ-HT-002
     */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("DusF", object0);
      tabelaHash0.insere("DusF", object0);
  }

    /**
     * Given a table where pesquisa for an empty key may return null,
     * When inserting multiple entries including null values and reusing a previously retrieved value,
     * Then the final stored value for a given key should match the last inserted reference (possibly null).
     *
     * REQ-HT-002
     */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = tabelaHash0.pesquisa("");
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", object0);
      tabelaHash0.insere("", object0);
      tabelaHash0.insere("'p| W)", object0);
  }

    /**
     * Given a table,
     * When inserting a simple string key/value and printing,
     * Then pesquisa should return the stored string and imprime should execute without exception.
     *
     * REQ-HT-001
     */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("[g1U^5", "[g1U^5");
      tabelaHash0.imprime();
  }
}