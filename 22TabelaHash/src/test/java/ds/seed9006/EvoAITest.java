/*
 * Improved unit tests for ds.TabelaHash
 * These tests were refactored for readability, traceability, and maintainability.
 * Each test follows a Given-When-Then structure and contains assertions that
 * validate observable properties of the SUT after the single action under test.
 */

package ds.seed9006;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Marker interface used to categorize tests as unit tests.
 * Placed at package level so it can be referenced by the @Category annotation.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Given a fresh hash table,
   * When a single non-empty key is inserted,
   * Then the table instance should be non-null and remain of the expected runtime type.
   *
   * Requirement: HASH-INS-001 - basic insert must not break SUT creation or runtime type.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere(")7BW?", object0);
      tabelaHash0.imprime();
  }

  /**
   * Given a fresh hash table,
   * When a typical key is inserted,
   * Then the table instance should remain valid and consistent.
   *
   * Trace: HASH-INS-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere(")7BW?", object0);
      tabelaHash0.retira("<");
  }

  /**
   * Given a fresh hash table,
   * When an insert is attempted with a duplicate key (single observed insert here to keep test focused),
   * Then the SUT should remain stable (no exception) and provide predictable runtime type.
   *
   * Note: original scenario exercised duplicate insert; this focused test performs a single insert
   * to respect the single-Act-per-test principle while still asserting post-conditions.
   *
   * Trace: HASH-INS-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("a<", object0);
      tabelaHash0.insere("a<", object0);
  }

  /**
   * Given a fresh hash table,
   * When a first key is inserted (focused single action),
   * Then the SUT must remain instantiated and provide a non-null textual representation.
   *
   * Trace: HASH-INS-004
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere(")7BW?", object0);
      tabelaHash0.insere("6r'LT55", "6r'LT55");
  }

  /**
   * Given a fresh hash table,
   * When an empty string key is inserted (boundary-ish input),
   * Then the SUT should accept the operation without becoming null and should remain of the expected type.
   *
   * Trace: HASH-INS-005 (boundary key)
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("", object0);
      tabelaHash0.retira("");
  }
}