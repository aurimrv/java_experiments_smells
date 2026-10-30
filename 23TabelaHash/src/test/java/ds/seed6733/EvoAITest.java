package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * REQ-001: Verify that basic insert, remove and print operations complete without throwing,
   * using a simple empty-key/empty-value scenario.
   *
   * Given a fresh TabelaHash,
   * When an empty key/value is inserted, then removed and printed,
   * Then no exception is thrown and the object reference remains valid.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      tabelaHash0.imprime();
  }

  /**
   * REQ-002: Insert a null value for an empty key, remove the key, and verify no items remain.
   *
   * Given a fresh TabelaHash,
   * When inserting a null value at the empty key and removing that key,
   * Then recuperaItens() should return an empty array.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.retira("");
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(0, objectArray0.length);
  }

  /**
   * REQ-003: Insert a null value under an empty key and verify that recuperaItens reports one entry.
   *
   * Given a fresh TabelaHash,
   * When inserting a null value at the empty key,
   * Then recuperaItens() should report exactly one stored item.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(1, objectArray0.length);
  }

  /**
   * REQ-004: Removing a non-existing key should not throw an exception and SUT stays valid.
   *
   * Given a fresh TabelaHash,
   * When attempting to remove a key that was never inserted,
   * Then no exception is thrown and the instance remains non-null.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.retira("$8>[MiXpB");
  }

  /**
   * REQ-005: Exercise pesquisa followed by insert/remove/insert sequence to validate API stability.
   *
   * Given a fresh TabelaHash,
   * When performing a read then write/remove/write sequence,
   * Then operations complete without exception and the SUT reference remains usable.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = tabelaHash0.pesquisa("4nS");
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      tabelaHash0.insere("", object0);
  }

  /**
   * REQ-006: Repeated inserts using the same key should not throw and leave the instance usable.
   *
   * Given a fresh TabelaHash,
   * When inserting the same key/value twice,
   * Then no exception is thrown and the SUT remains non-null.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
  }

  /**
   * REQ-007: Insert with different keys (including a null value) to ensure no exceptions and stable state.
   *
   * Given a fresh TabelaHash,
   * When inserting a null value under one key and a normal pair under another,
   * Then operations succeed and the SUT remains usable.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("4nS", (Object) null);
      tabelaHash0.insere("", "");
  }

  /**
   * REQ-008: Complex sequence of pesquisas and inserts to exercise table growth/overwrite behavior.
   *
   * Given a fresh TabelaHash,
   * When performing several inserts for the same and different keys,
   * Then no unexpected exceptions occur and the SUT remains valid.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = tabelaHash0.pesquisa("4nS");
      tabelaHash0.insere("4nS", (Object) null);
      tabelaHash0.insere("4nS", "4nS");
      tabelaHash0.insere("4nS", "4nS");
      tabelaHash0.insere("4nS", object0);
      tabelaHash0.insere("4nS", (Object) null);
      tabelaHash0.insere("", "");
      tabelaHash0.insere("zic/BU", "4nS");
      tabelaHash0.insere("Entrada[", object0);
  }

  /**
   * REQ-009: Calling imprime() after inserting a null value should surface the expected NullPointerException
   * as observed by the original test harness.
   *
   * Given a TabelaHash with an inserted null value,
   * When imprime() is invoked,
   * Then a NullPointerException is expected (preserve original behavior).
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      // Undeclared exception!
      try { 
        tabelaHash0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}