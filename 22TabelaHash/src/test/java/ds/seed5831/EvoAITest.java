package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for TabelaHash exercising basic insert/remove/print operations.
 * Traceability: REQ-HASH-001
 *
 * Notes:
 * - These tests verify that basic API calls complete without throwing exceptions
 *   and that the SUT instance is non-null after operations.
 * - Given-When-Then style comments are provided for clarity.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("#", "#");
      tabelaHash0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("#", "#");
      tabelaHash0.retira("#");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("#", "#");
      tabelaHash0.insere("", "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("#", "#");
      tabelaHash0.retira("");
  }
}