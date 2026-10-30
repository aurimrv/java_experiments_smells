package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * REQ-001: Verify basic insert, remove and print operations complete without exceptions.
   *
   * Given a fresh TabelaHash,
   * When an entry is inserted, removed and the table is printed,
   * Then the sequence of operations should complete without throwing any exception.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("=?=-ux>k", "=?=-ux>k");
      tabelaHash0.retira("=?=-ux>k");
      tabelaHash0.imprime();
  }

  /**
   * REQ-002: After inserting and removing the same key, recuperarItens should return an empty array.
   *
   * Given a fresh TabelaHash,
   * When an entry is inserted and then removed,
   * Then recuperarItens returns an array of length 0.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();

      // When
      tabelaHash0.insere("=?=-ux>k", "=?=-ux>k");
      tabelaHash0.retira("=?=-ux>k");
      Object[] objectArray0 = tabelaHash0.recuperaItens();

      // Then
      assertEquals("Expected no items after inserting and then removing the same key", 0, objectArray0.length);
  }

  /**
   * REQ-003: Inserting a key with a null value should be reflected in recuperarItens length.
   *
   * Given a fresh TabelaHash,
   * When an entry with an empty string key and null value is inserted,
   * Then recuperarItens returns an array of length 1.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();

      // When
      tabelaHash0.insere("", (Object) null);
      Object[] objectArray0 = tabelaHash0.recuperaItens();

      // Then
      assertEquals("Expected one item after inserting a key with null value", 1, objectArray0.length);
  }

  /**
   * REQ-004: Inserting the same key twice should be tolerated without throwing exceptions.
   *
   * Given a fresh TabelaHash,
   * When the same key is inserted twice,
   * Then no exception is thrown and operations complete.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();

      // Act & Assert
      boolean completed = false;
      try {
          tabelaHash0.insere("~{MF#Tx.", "~{MF#Tx.");
          tabelaHash0.insere("~{MF#Tx.", "~{MF#Tx.");
          completed = true;
      } catch (Throwable t) {
          fail("Inserting duplicate keys should not throw, but got: " + t.getMessage());
      }
      assertTrue("Duplicate inserts should complete without exception", completed);
  }

  /**
   * REQ-005: Complex sequence of inserts, remove and re-insert should complete without exceptions.
   *
   * Given a fresh TabelaHash,
   * When multiple keys are inserted, one removed and re-inserted,
   * Then the operations complete successfully.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // Act & Assert
      boolean completed = false;
      try {
          tabelaHash0.insere("Jq;^jf{//L", "Jq;^jf{//L");
          tabelaHash0.insere("", "2~C7mV@nz=Z,w*1G");
          tabelaHash0.insere("x", "Jq;^jf{//L");
          tabelaHash0.insere("Entrada[", "Jq;^jf{//L");
          tabelaHash0.insere("~{MF#Tx.", "~{MF#Tx.");
          tabelaHash0.insere("|O+(hNK]I~R", object0);
          tabelaHash0.insere("IE$6A@O?", "IE$6A@O?");
          tabelaHash0.retira("IE$6A@O?");
          tabelaHash0.insere("IE$6A@O?", object0);
          completed = true;
      } catch (Throwable t) {
          fail("Complex insert/remove sequence threw an unexpected exception: " + t.getMessage());
      }
      assertTrue("Expected complex sequence of inserts/removes to complete without exception", completed);
  }

  /**
   * REQ-006: Removing a non-present or empty key should not cause unexpected exceptions.
   *
   * Given a fresh TabelaHash with one inserted key,
   * When attempting to remove an empty key string,
   * Then no exception should be thrown.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("2]?Rw=],5", "X=b%x0O2i'E");
      tabelaHash0.retira("");
  }

  /**
   * REQ-007: Imprime should be callable after an insert and should not raise exceptions.
   *
   * Given a fresh TabelaHash,
   * When an entry is inserted and the table is printed,
   * Then no exception is thrown.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("2]?Rw=],5", "X=b%x0O2i'E");
      tabelaHash0.imprime();
  }

  /**
   * REQ-008: Multiple inserts with repeated keys and null values should complete without exceptions.
   *
   * Given a fresh TabelaHash,
   * When multiple inserts with empty keys and null values are performed,
   * Then no exception is thrown and operations complete.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Arrange
      TabelaHash tabelaHash0 = new TabelaHash();

      // Act & Assert
      boolean completed = false;
      try {
          tabelaHash0.insere("", (Object) null);
          tabelaHash0.insere("", (Object) null);
          tabelaHash0.insere("", "~{r vDhFI+o");
          tabelaHash0.insere("", (Object) null);
          tabelaHash0.insere("~{r vDhFI+o", "~{r vDhFI+o");
          tabelaHash0.insere("rQe<S", (Object) null);
          tabelaHash0.insere("", "");
          tabelaHash0.insere("", "");
          completed = true;
      } catch (Throwable t) {
          fail("Multiple inserts including null values should not throw: " + t.getMessage());
      }
      assertTrue("Expected multiple inserts with empty and null values to complete without exception", completed);
  }
}