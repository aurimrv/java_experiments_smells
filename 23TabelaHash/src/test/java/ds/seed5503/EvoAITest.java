package ds.seed5503;

import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit tests for TabelaHash covering basic insert, remove, retrieve and print operations.
 * Requirement traceability: REQ-1001 (basic hash table operations)
 *
 * Notes:
 * - Tests follow Given-When-Then structure in implementation and include descriptive assertions.
 * - Categorized as UnitTest for selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  /**
   * Given an empty table, when inserting and then removing an entry with an empty-string key,
   * then the entry should be retrievable after insert and absent after removal.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert an entry with empty-string key and value
      tabelaHash0.insere("", "");

      // Then: it should be retrievable
      Object retrieved = tabelaHash0.pesquisa("");
      assertNotNull("Expected inserted empty-string key to be retrievable (non-null).", retrieved);
      assertEquals("Expected the stored value for empty-string key to be the empty string.", "", retrieved);

      // When: remove the entry
      tabelaHash0.retira("");

      // Then: lookup should return null and no items remain
      assertNull("Expected no value after removal of empty-string key.", tabelaHash0.pesquisa(""));
      Object[] remaining = tabelaHash0.recuperaItens();
      assertTrue("Expected zero items after removal, but found: " + remaining.length, remaining.length == 0);

      // Ensure imprime() executes without exception (side-effect: printing)
      tabelaHash0.imprime();
  }

  /**
   * Given a new table, when inserting a single entry and removing it,
   * then the table should be empty and retrieval should return null.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // When: insert and verify presence
      tabelaHash0.insere("DusF", object0);
      Object found = tabelaHash0.pesquisa("DusF");
      assertSame("Inserted object should be returned by pesquisa for key 'DusF'.", object0, found);

      // When: remove the key
      tabelaHash0.retira("DusF");

      // Then: retrieval returns null and no items remain
      assertNull("After removal, pesquisa should return null for key 'DusF'.", tabelaHash0.pesquisa("DusF"));
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals("Expected no items in table after removal of the single inserted element.", 0, objectArray0.length);
  }

  /**
   * Given a table, when inserting a single key-value pair, then recuperaItens should reflect one item
   * and pesquisa should return the stored object.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // When
      tabelaHash0.insere("DusF", object0);

      // Then: one item should be present and pesquisa should return the same object
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals("Expected exactly one item after single insertion.", 1, objectArray0.length);
      Object found = tabelaHash0.pesquisa("DusF");
      assertSame("pesquisa should return the exact object that was inserted for key 'DusF'.", object0, found);
  }

  /**
   * Given an empty table, removing a non-existent key should be a no-op and not throw an exception.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: remove a key that was never inserted
      tabelaHash0.retira("DusF");

      // Then: no items present and pesquisa returns null
      Object[] items = tabelaHash0.recuperaItens();
      assertEquals("Removing a non-existent key should leave table empty.", 0, items.length);
      assertNull("pesquisa should return null for a never-inserted key.", tabelaHash0.pesquisa("DusF"));
  }

  /**
   * Given a table, when inserting, removing, and inserting again the same key,
   * the final state should contain the most recently inserted value.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // When: insert, remove, and insert again
      tabelaHash0.insere("DusF", object0);
      tabelaHash0.retira("DusF");
      tabelaHash0.insere("DusF", object0);

      // Then: the key should be present and pesquisa should return the re-inserted object
      Object found = tabelaHash0.pesquisa("DusF");
      assertSame("After re-insertion, pesquisa should return the newly inserted object for 'DusF'.", object0, found);
      Object[] items = tabelaHash0.recuperaItens();
      assertEquals("Table should contain exactly one item after re-insertion of the same key.", 1, items.length);
  }

  /**
   * Given a table, when inserting the same key twice with the same value,
   * the table should contain a single entry for that key and pesquisa should return the value.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();

      // When: insert same key twice
      tabelaHash0.insere("DusF", object0);
      tabelaHash0.insere("DusF", object0);

      // Then: only one logical entry should exist for the key and pesquisa returns the object
      Object found = tabelaHash0.pesquisa("DusF");
      assertSame("pesquisa should return the original object after duplicate inserts.", object0, found);
      Object[] items = tabelaHash0.recuperaItens();
      assertEquals("Duplicate inserts for the same key should not create multiple entries.", 1, items.length);
  }

  /**
   * Given various inserts (including empty and special-character keys), verify retrieval and contents.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert a variety of entries, including empty key and a special-character key
      tabelaHash0.insere("", null);
      tabelaHash0.insere("", null); // duplicate null insert should be tolerated
      tabelaHash0.insere("", "");   // overwrite empty key with empty-string value
      tabelaHash0.insere("kA", "valA");
      tabelaHash0.insere("'p| W)", "valB");

      // Then: special-character key should retrieve its value
      Object valB = tabelaHash0.pesquisa("'p| W)");
      assertEquals("Expected stored value for special-character key to be 'valB'.", "valB", valB);

      // Then: kA should retrieve valA
      Object valA = tabelaHash0.pesquisa("kA");
      assertEquals("Expected stored value for key 'kA' to be 'valA'.", "valA", valA);

      // Then: empty key should retrieve the last inserted value (empty string)
      Object emptyVal = tabelaHash0.pesquisa("");
      assertNotNull("Empty key should exist after explicit insertion (possibly with empty-string value).", emptyVal);
      assertEquals("Expected empty key to have empty-string value after overwrite.", "", emptyVal);

      // And: recuperaItens should contain at least the two inserted non-empty values
      Object[] items = tabelaHash0.recuperaItens();
      assertTrue("Expected at least two items after several inserts, found: " + items.length, items.length >= 2);
      assertTrue("recuperaItens should contain 'valA'.", Arrays.asList(items).contains("valA"));
      assertTrue("recuperaItens should contain 'valB'.", Arrays.asList(items).contains("valB"));
  }

  /**
   * Given insertion of a key with bracketed/special characters, imprime should be callable and
   * the inserted value should be retrievable.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert an entry using a special string key
      tabelaHash0.insere("[g1U^5", "[g1U^5");

      // Then: pesquisa returns the stored value and recuperaItens contains it
      Object found = tabelaHash0.pesquisa("[g1U^5");
      assertEquals("Expected retrieval of value inserted with key '[g1U^5'.", "[g1U^5", found);
      Object[] items = tabelaHash0.recuperaItens();
      assertTrue("recuperaItens should contain the inserted value for key '[g1U^5'.", Arrays.asList(items).contains("[g1U^5"));

      // And: imprime() should run without throwing an exception
      tabelaHash0.imprime();
  }
}