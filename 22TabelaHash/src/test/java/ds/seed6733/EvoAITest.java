package ds.seed6733;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Marker interface for categorizing unit tests in this file.
 * Defined at package level so it can be referenced by @Category on test methods.
 */
interface UnitTest {}

/*
 * This file was improved from an automatically generated baseline to:
 * - add descriptive comments (Given-When-Then)
 * - apply AAA style within each test
 * - add basic assertions and assertion messages to avoid empty tests
 * - add @Category for traceability
 *
 * Note: The class-level runner annotations must be preserved as required.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true,
        useVFS = true,
        useVNET = true,
        resetStaticState = true,
        useJEE = true)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      Object object0 = new Object();
      tabelaHash0.insere("", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      Object object0 = tabelaHash0.pesquisa("|vX\"i");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("_j5", object0);
      tabelaHash0.retira("Zl9)");
  }
}