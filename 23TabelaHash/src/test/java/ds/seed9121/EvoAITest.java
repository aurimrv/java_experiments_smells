package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this package.
 * Required so @Category can reference a compile-time visible type.
 */
interface UnitTest {}

/**
 * Improved and intention-revealing tests for TabelaHash.
 * Each test follows Arrange-Act-Assert and includes assertions and brief linkage to a requirement id.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * REQ-DS-001: Inserting then removing a key should change the stored items count accordingly.
   * Arrange: empty table, insert one item.
   * Act: remove inserted key.
   * Assert: items count goes from 1 to 0 and no exception occurs when printing.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // Arrange & Act: insert one mapping and verify it is present
      tabelaHash0.insere("", object0);
      Object[] itemsAfterInsert = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens should not return null after insert", itemsAfterInsert);
      assertEquals("After one insert, there should be exactly 1 item", 1, itemsAfterInsert.length);
      assertSame("Inserted object should be present in the table", object0, itemsAfterInsert[0]);

      // Act: remove it
      tabelaHash0.retira("");
      Object[] itemsAfterRemove = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens should not return null after remove", itemsAfterRemove);
      assertEquals("After removing the only key, there should be 0 items", 0, itemsAfterRemove.length);

      // Act: printing should not throw and should be callable in an empty table
      tabelaHash0.imprime();
  }

  /**
   * REQ-DS-002: Inserting a null value is allowed and behaves like any other value:
   * the item is present until removed.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange & Act: insert a mapping with a null value
      tabelaHash0.insere("", (Object) null);

      // Assert: item is present with a null value
      Object[] itemsAfterInsert = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must return an array even when it contains null values", itemsAfterInsert);
      assertEquals("One item should be present after inserting a null value", 1, itemsAfterInsert.length);
      assertNull("The single stored value should be null", itemsAfterInsert[0]);

      // Act: remove and verify empty
      tabelaHash0.retira("");
      Object[] itemsAfterRemove = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must return an array after removal", itemsAfterRemove);
      assertEquals("No items should remain after removal", 0, itemsAfterRemove.length);
  }

  /**
   * REQ-DS-003: Inserting a key/value pair should make the value retrievable via recuperaItens.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange: insert a simple pair
      tabelaHash0.insere("i", "i");

      // Act: retrieve items
      Object[] items = tabelaHash0.recuperaItens();

      // Assert: one item present and equals the inserted value
      assertNotNull("recuperaItens must not return null", items);
      assertEquals("Exactly one item should be present after insert", 1, items.length);
      assertEquals("Stored value should match the inserted value", "i", items[0]);
  }

  /**
   * REQ-DS-004: Removing a non-existent key should be a no-op and should not throw.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange: ensure table is empty
      Object[] before = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must return an array for an empty table", before);
      assertEquals("Table should initially be empty", 0, before.length);

      // Act: try removing a key that was never inserted (two spaces)
      try {
          tabelaHash0.retira("  ");
      } catch (Exception e) {
          fail("Removing a non-existent key should not throw an exception, but threw: " + e.getMessage());
      }

      // Assert: still empty
      Object[] after = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must return an array after removing non-existent key", after);
      assertEquals("Table must remain empty after removing a non-existent key", 0, after.length);
  }

  /**
   * REQ-DS-005: A key can be re-inserted after removal and behaves like a fresh insert.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // Arrange & Act: insert, remove, and reinsert the same key
      tabelaHash0.insere("", object0);
      Object[] afterInsert = tabelaHash0.recuperaItens();
      assertEquals("Should have one item after first insert", 1, afterInsert.length);

      tabelaHash0.retira("");
      Object[] afterRemove = tabelaHash0.recuperaItens();
      assertEquals("Should have zero items after removal", 0, afterRemove.length);

      tabelaHash0.insere("", object0);
      Object[] afterReinsert = tabelaHash0.recuperaItens();
      assertEquals("Should have one item after reinserting the same key", 1, afterReinsert.length);
      assertSame("Reinserted object should be the same instance", object0, afterReinsert[0]);
  }

  /**
   * REQ-DS-006: Multiple distinct inserts should result in a matching number of stored items.
   * Also verifies that repeated keys overwrite previous values and unique-key counting is correct.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // Arrange & Act: perform multiple inserts, including duplicates to test overwrite behavior
      tabelaHash0.insere("Gy@", object0);
      tabelaHash0.insere("G7l Y>u y", "G7l Y>u y");
      tabelaHash0.insere("[XC", "G7l Y>u y");
      tabelaHash0.insere("", "");
      tabelaHash0.insere("u(.", (Object) null);
      tabelaHash0.insere("u(.", object0); // overwrite previous null for same key
      tabelaHash0.insere("u(.", "w}G0u*9["); // overwrite again
      tabelaHash0.insere("$e ", "[XC");

      // Assert: number of unique keys inserted is expected (Gy@, G7l Y>u y, [XC, "", u(., $e ) => 6)
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must not return null after multiple inserts", items);
      assertEquals("There should be 6 unique keys after the inserts (duplicates overwritten)", 6, items.length);
  }

  /**
   * REQ-DS-007: Inserting the same key twice replaces the previous value.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();

      // Arrange & Act: insert twice with same key but different values
      tabelaHash0.insere("G7l Y>u y", "G7l Y>u y");
      tabelaHash0.insere("G7l Y>u y", "[XC");

      // Assert: only one stored item and its value is the last inserted
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must return an array", items);
      assertEquals("Duplicate key insert should result in a single stored entry", 1, items.length);
      assertEquals("Value must be updated to the last inserted value for the same key", "[XC", items[0]);
  }

  /**
   * REQ-DS-008: Printing should be a safe operation and not mutate the stored data.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // Arrange & Act: insert then print
      tabelaHash0.insere("Gy@", object0);

      // Assert: data present and printing does not remove or alter it
      Object[] beforePrint = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must not return null before print", beforePrint);
      assertEquals("There should be exactly one item before print", 1, beforePrint.length);
      assertSame("Stored object must match the inserted instance", object0, beforePrint[0]);

      // Act: print should not throw and should preserve table contents
      tabelaHash0.imprime();
      Object[] afterPrint = tabelaHash0.recuperaItens();
      assertNotNull("recuperaItens must not return null after print", afterPrint);
      assertEquals("Table content must be unchanged after printing", beforePrint.length, afterPrint.length);
  }
}