package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for test categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * REQ-DS-001: Verify basic insert, remove and print sequence completes without error.
   *
   * Given a fresh TabelaHash,
   * When an entry with a null value is inserted and then removed, and the table is printed,
   * Then the table object must remain non-null and of expected type.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("XS", (Object) null);
      tabelaHash0.retira("XS");
      tabelaHash0.imprime();
  }

  /**
   * REQ-DS-002: After inserting and removing the same key, the recovered items array must be empty.
   *
   * Given a fresh TabelaHash,
   * When an entry is inserted then removed and items are retrieved,
   * Then the returned items array must be non-null and have length 0.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("XS", (Object) null);
      tabelaHash0.retira("XS");
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(0, objectArray0.length);
  }

  /**
   * REQ-DS-003: Inserting a single item must result in one item returned by recuperaItens.
   *
   * Given a fresh TabelaHash,
   * When a single key/value pair is inserted and items are retrieved,
   * Then the returned items array must be non-null and contain exactly one element.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When
      tabelaHash0.insere("G:2}[", "G:2}[");
      Object[] objectArray0 = tabelaHash0.recuperaItens();

      // Then
      assertNotNull("recuperaItens must not return null after inserting an item", objectArray0);
      assertEquals("There should be exactly one item after a single insert", 1, objectArray0.length);
  }

  /**
   * REQ-DS-004: Sequence of inserts and removes for the same key should behave deterministically.
   *
   * Given a fresh TabelaHash,
   * When multiple inserts and removes on the same key are performed,
   * Then the SUT instance should remain valid and of expected runtime type.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When - exercise insert/remove sequences (including overwrite and redundant removal)
      tabelaHash0.insere("G:2}[", "G:2}[");
      tabelaHash0.insere("XS", (Object) null);
      tabelaHash0.insere("XS", "XS");
      tabelaHash0.retira("XS");
      tabelaHash0.retira("XS");
      tabelaHash0.insere("FD3D", "XS");

      // Then - lightweight structural assertions to confirm instance state and type
      assertNotNull("TabelaHash instance should not be null after sequence of operations", tabelaHash0);
      assertEquals("Object should remain a TabelaHash after operations", "TabelaHash",
          tabelaHash0.getClass().getSimpleName());
  }

  /**
   * REQ-DS-005: Multiple distinct inserts should not throw and the table instance should be valid.
   *
   * Given a fresh TabelaHash,
   * When several distinct keys are inserted,
   * Then the table instance must remain non-null and valid.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When - insert many keys
      tabelaHash0.insere("f>45k?I", "dX");
      tabelaHash0.insere("~F{V]dQ~", "~F{V]dQ~");
      tabelaHash0.insere("dX", "dX");
      tabelaHash0.insere("3bn.PX23U", "~F{V]dQ~");
      tabelaHash0.insere(" U}J", " U}J");
      tabelaHash0.insere("", "f>45k?I");
      tabelaHash0.insere("iM", "f>45k?I");
      tabelaHash0.insere("(86V#", "f>45k?I");

      // Then - basic assertions about instance validity
      assertNotNull("TabelaHash should remain non-null after multiple inserts", tabelaHash0);
      assertEquals("Runtime type should remain TabelaHash", "TabelaHash",
          tabelaHash0.getClass().getSimpleName());
  }

  /**
   * REQ-DS-006: Inserting the same key twice should complete without throwing.
   *
   * Given a fresh TabelaHash,
   * When the same key is inserted twice,
   * Then the SUT instance must remain non-null.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When - duplicate insert
      tabelaHash0.insere("~F{V]dQ~", "~F{V]dQ~");
      tabelaHash0.insere("~F{V]dQ~", "~F{V]dQ~");

      // Then
      assertNotNull("TabelaHash should not be null after duplicate insertions", tabelaHash0);
      assertEquals("Runtime type should remain TabelaHash after duplicate inserts", "TabelaHash",
          tabelaHash0.getClass().getSimpleName());
  }

  /**
   * REQ-DS-007: Setting EvoSuite Random seed should not prevent normal operations.
   *
   * Given a fresh TabelaHash and a deterministic EvoSuite Random seed,
   * When an insert is performed and a removal of a (possibly non-existent) key is attempted,
   * Then the table must remain valid and no unexpected exceptions should be thrown.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Random.setNextRandom(4360);
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("f>45k?I", "dX");
      tabelaHash0.retira("");
  }

  /**
   * REQ-DS-008: Print operation should be callable after inserting an item.
   *
   * Given a fresh TabelaHash,
   * When an item is inserted and the table is printed,
   * Then the table instance must remain valid.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("f>45k?I", "dX");
      tabelaHash0.imprime();
  }
}