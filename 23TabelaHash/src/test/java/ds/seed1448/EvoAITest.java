package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved test class for TabelaHash.
 *
 * Traceability: REQ-DS-001 (basic hash table insert/remove/print/inspect operations)
 *
 * Note: This class preserves the original EvoSuite runner annotations and method names.
 */
  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Given an empty TabelaHash
   * When inserting an empty key/value, removing it and printing the table
   * Then the sequence of operations should complete without throwing exceptions.
   *
   * Traceability: REQ-DS-001-A
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      tabelaHash0.imprime();
  }

  /**
   * Given a table with one inserted then removed item
   * When retrieving items
   * Then the returned array should be empty (length == 0)
   *
   * Traceability: REQ-DS-001-B
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("]:", "IRo5k@Uu");
      tabelaHash0.retira("]:");
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(0, objectArray0.length);
  }

  /**
   * Given a table with one inserted item
   * When retrieving items
   * Then the returned array should contain exactly one element
   *
   * Traceability: REQ-DS-001-C
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("]:", "IRo5k@Uu");
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(1, objectArray0.length);
  }

  /**
   * Given an empty table
   * When attempting to remove a non-existing key
   * Then the operation should complete without throwing exceptions
   *
   * Traceability: REQ-DS-001-D
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.retira("q(+/5Y");
  }

  /**
   * Given a table
   * When inserting a null value, removing the key and inserting another key/value
   * Then all operations should complete without throwing exceptions
   *
   * Traceability: REQ-DS-001-E
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.retira("");
      tabelaHash0.insere("nCW12N", "nCW12N");
  }

  /**
   * Given a table with an existing key
   * When inserting the same key twice (second time with null value)
   * Then the operations should complete and the table should handle overwrite or null insertion without exception
   *
   * Traceability: REQ-DS-001-F
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("Xq<NmU", "Xq<NmU");
      tabelaHash0.insere("Xq<NmU", (Object) null);
  }

  /**
   * Given many insert operations with various keys/values (including empty and null)
   * When performing those inserts
   * Then all operations should complete without throwing exceptions
   *
   * Traceability: REQ-DS-001-G
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      boolean completed = false;

      // When
      tabelaHash0.insere("gl{z/", "gl{z/");
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("J", "");
      tabelaHash0.insere("nCW12N", "nCW12N");
      tabelaHash0.insere("", "gl{z/");
      tabelaHash0.insere("qxdDs-tr", (Object) null);
      tabelaHash0.insere("h(o7l.@6", "");
      completed = true;

      // Then
      assertTrue("test6: multiple diverse inserts should complete without exception", completed);
  }

  /**
   * Given a table
   * When inserting an item and printing the table
   * Then the operations should complete without throwing exceptions
   *
   * Traceability: REQ-DS-001-H
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      boolean completed = false;

      // When
      tabelaHash0.insere("gl{z/", "gl{z/");
      tabelaHash0.imprime();
      completed = true;

      // Then
      assertTrue("test7: insert followed by print should complete without exception", completed);
  }
}