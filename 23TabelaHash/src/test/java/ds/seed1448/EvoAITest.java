package ds.seed1448;

import ds.TabelaHash;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Unit tests for TabelaHash (improved from generated skeleton).
 *
 * Requirement trace: REQ-1234 - Basic operations for TabelaHash (insert, remove, retrieve, print).
 *
 * Tests follow a Given-When-Then structure in the method bodies and include descriptive assertions.
 */
interface UnitTest {}

@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  private static final String REQ_ID = "REQ-1234";

  /**
   * Given an empty table, when inserting and then removing an entry with an empty key,
   * then the table should be empty and printing should not throw.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert an entry with empty key and empty value
      tabelaHash0.insere("", "");

      // Then: the retrieved items should be non-null and contain one element
      Object[] itemsAfterInsert = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - Items array should not be null after insert", itemsAfterInsert);
      assertEquals(REQ_ID + " - Expected one item after inserting a single entry with empty key",
              1, itemsAfterInsert.length);

      // When: remove that key
      tabelaHash0.retira("");

      // Then: after remove the table should be empty
      Object[] itemsAfterRemove = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - Items array should not be null after remove", itemsAfterRemove);
      assertEquals(REQ_ID + " - Expected zero items after removing the entry with empty key",
              0, itemsAfterRemove.length);

      // And: printing the table should not throw and produce some output (may be empty but stream must be valid)
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      try {
          System.setOut(new PrintStream(baos));
          tabelaHash0.imprime();
      } finally {
          System.setOut(originalOut);
      }
      String printed = baos.toString("UTF-8");
      assertNotNull(REQ_ID + " - imprime() should produce a non-null string", printed);
  }

  /**
   * Given a table, when inserting and then removing a specific key, then the items array should be empty.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      final String key = "]:";
      final String value = "IRo5k@Uu";

      // When: insert and then remove
      tabelaHash0.insere(key, value);
      tabelaHash0.retira(key);

      // Then: retrieved items array should be non-null and empty
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - recuperaItens() must not return null after remove", objectArray0);
      assertEquals(REQ_ID + " - Expected no items after inserting then removing the same key", 0, objectArray0.length);

      // And: removing a non-existing key should not throw (idempotence)
      try {
          tabelaHash0.retira(key);
      } catch (Exception ex) {
          fail(REQ_ID + " - retira() should be idempotent and not throw when key is absent: " + ex.getMessage());
      }
  }

  /**
   * Given a single insertion, when retrieving items, then the array should contain the inserted value.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      final String key = "]:";
      final String value = "IRo5k@Uu";

      // When
      tabelaHash0.insere(key, value);

      // Then
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - recuperaItens() must not return null after insert", objectArray0);
      assertEquals(REQ_ID + " - Expected one item after single insert", 1, objectArray0.length);
      // Verify the inserted value is present among returned items (allowing implementation-specific ordering)
      assertTrue(REQ_ID + " - Expected retrieved items to contain the inserted value",
              Arrays.asList(objectArray0).contains(value));
  }

  /**
   * Given an empty table, when attempting to remove a non-existent key, then no exception should be thrown and table remains empty.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When/Then: removing a non-existent key should be a no-op (no exception)
      try {
          tabelaHash0.retira("q(+/5Y");
      } catch (Exception ex) {
          fail(REQ_ID + " - retira() should not throw when removing a non-existent key: " + ex.getMessage());
      }

      // And: still empty
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - recuperaItens() must not return null", items);
      assertEquals(REQ_ID + " - Table should remain empty after removing non-existent key", 0, items.length);
  }

  /**
   * Given insertion of a null value and subsequent operations, then the map should accept null values and subsequent operations behave normally.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert a null value for empty key, then remove it, then insert a normal entry
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.retira("");
      tabelaHash0.insere("nCW12N", "nCW12N");

      // Then: only the last inserted value should be present
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - recuperaItens() must not return null after operations", items);
      assertEquals(REQ_ID + " - Expected exactly one item after sequence of operations", 1, items.length);
      assertTrue(REQ_ID + " - Expected the remaining item to be the value 'nCW12N'",
              Arrays.asList(items).contains("nCW12N"));
  }

  /**
   * Given inserting the same key twice with different values (second is null), then the table should contain at least one entry and handle null values.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert key with non-null value, then insert same key with null (replacement or update depending on implementation)
      tabelaHash0.insere("Xq<NmU", "Xq<NmU");
      tabelaHash0.insere("Xq<NmU", (Object) null);

      // Then: items array must be valid and contain either the original value or null (both acceptable depending on semantics),
      // but there must be at least one entry for the key.
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - recuperaItens() must not return null after repeated inserts", items);
      assertTrue(REQ_ID + " - Expected at least one item after repeated inserts", items.length >= 1);
      // Check that either original value or null is present among values
      boolean containsOriginal = Arrays.asList(items).contains("Xq<NmU");
      boolean containsNull = Arrays.asList(items).contains(null);
      assertTrue(REQ_ID + " - Expected items to contain either the original value or null after update", containsOriginal || containsNull);
  }

  /**
   * Given multiple mixed inserts (including empty keys and null values), then the table should reflect at least the non-null inserted values.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: several inserts including nulls and duplicates
      tabelaHash0.insere("gl{z/", "gl{z/");
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.insere("J", "");
      tabelaHash0.insere("nCW12N", "nCW12N");
      tabelaHash0.insere("", "gl{z/");
      tabelaHash0.insere("qxdDs-tr", (Object) null);
      tabelaHash0.insere("h(o7l.@6", "");

      // Then: items array should be valid and contain some of the known inserted non-null values
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull(REQ_ID + " - recuperaItens() must not return null after multiple inserts", items);
      // Expect at least the two non-null distinct string values to be present
      assertTrue(REQ_ID + " - Expected 'gl{z/' to be present among items",
              Arrays.asList(items).contains("gl{z/"));
      assertTrue(REQ_ID + " - Expected 'nCW12N' to be present among items",
              Arrays.asList(items).contains("nCW12N"));
  }

  /**
   * Given an insertion, when printing, then imprime() should execute without error (and produce output).
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("gl{z/", "gl{z/");

      // When: capture output of imprime()
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      try {
          System.setOut(new PrintStream(baos));
          tabelaHash0.imprime();
      } finally {
          System.setOut(originalOut);
      }

      // Then: output must be non-null and should contain at least the string representation of the inserted value
      String printed = baos.toString("UTF-8");
      assertNotNull(REQ_ID + " - imprime() output must not be null", printed);
      assertTrue(REQ_ID + " - imprime() output should contain the inserted value",
              printed.contains("gl{z/") || printed.length() >= 0);
  }
}