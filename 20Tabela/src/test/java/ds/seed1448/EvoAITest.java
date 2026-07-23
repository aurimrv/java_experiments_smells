package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for Tabela behaviors.
 *
 * Requirement: REQ-001 - Basic storage and search semantics for Tabela
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * Given an empty table,
   * When inserting the same item twice,
   * Then the table size increases accordingly and a binary-style lookup for a different key returns the expected position (0).
   *
   * REQ: REQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(3);

      // Precondition
      assertEquals("Precondition: new table should be empty", 0, tabela0.n);

      // When: insert the same item twice (duplicates are allowed by this Tabela implementation)
      tabela0.insere(meuItem0);
      assertEquals("After first insert, table size should be 1", 1, tabela0.n);
      tabela0.insere(meuItem0);
      assertEquals("After second insert of same item, table size should be 2", 2, tabela0.n);

      // Then: internal records reflect insertions
      assertNotNull("First record should not be null", tabela0.registros[0]);
      assertNotNull("Second record should not be null", tabela0.registros[1]);
      assertTrue("Inserted records should be instances of MeuItem",
                 tabela0.registros[0] instanceof MeuItem && tabela0.registros[1] instanceof MeuItem);

      // And: binary-style search for a different key returns expected position (observed behavior)
      int int0 = tabela0.binaria(meuItem1);
      assertEquals("Binary search for key 3 should return 0 as per table's ordering/implementation", 0, int0);
  }

  /**
   * Given an empty table,
   * When inserting a single negative-key item,
   * Then the table size becomes 1 and binary-search for that exact item returns the index 1 (as per implementation).
   *
   * REQ: REQ-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(-1144);

      // When
      tabela0.insere(meuItem0);

      // Then
      assertEquals("Table size should be 1 after inserting one item", 1, tabela0.n);

      int int0 = tabela0.binaria(meuItem0);
      assertEquals("Binary search for the inserted item should return index 1 according to implementation", 1, int0);

      // Additional check: pesquisa should find the inserted item (consistency check between operations)
      int pesquisaIndex = tabela0.pesquisa(meuItem0);
      assertEquals("Pesquisa should return the same index as binaria for the inserted item", int0, pesquisaIndex);
  }

  /**
   * Given an empty table,
   * When performing a binary-style search for a key that is not present,
   * Then the method returns 0 and table remains empty.
   *
   * REQ: REQ-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(-1144);

      // Precondition: empty table
      assertEquals("Precondition: table should start empty", 0, tabela0.n);

      // When
      int int0 = tabela0.binaria(meuItem0);

      // Then
      assertEquals("Binary search on empty table should return 0", 0, int0);
      assertEquals("Table should remain empty after search", 0, tabela0.n);

      // And pesquisa should be consistent with binaria for missing key
      int pesquisaIndex = tabela0.pesquisa(meuItem0);
      assertEquals("Pesquisa on empty table should return 0", 0, pesquisaIndex);
  }

  /**
   * Given a table with capacity 3 and n set to 2,
   * When inserting another item so table becomes full and one more insert is attempted,
   * Then the Tabela.insere should throw an Exception indicating the table is full and the table state remains consistent.
   *
   * REQ: REQ-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      Item[] itemArray0 = new Item[3];
      tabela0.registros = itemArray0;
      tabela0.n = 2;

      // Sanity preconditions
      assertEquals("Precondition: tabela.n should be 2", 2, tabela0.n);
      assertEquals("Precondition: registros length should be 3", 3, tabela0.registros.length);

      // When: insert until full
      tabela0.insere(new MeuItem(1)); // should succeed and make n==3
      assertEquals("After filling table, n should be 3", 3, tabela0.n);

      // Attempt to insert into a full table and expect an Exception
      try {
          tabela0.insere(meuItem0);
          fail("Expected Exception when inserting into a full table");
      } catch (Exception e) {
          // Then: validate exception message and table state unchanged
          String expectedMsg = "Erro: A tabela esta cheia";
          assertEquals("Exception message should indicate full table", expectedMsg, e.getMessage());
          assertEquals("Tabela.n should remain at capacity after failed insert", 3, tabela0.n);
          assertEquals("registros array length should remain unchanged", 3, tabela0.registros.length);
      }
  }

  /**
   * Given a table with one inserted positive-key item,
   * When searching for a different (negative) key,
   * Then pesquisa returns 0 (not found) while the inserted item is discoverable by pesquisa for its key.
   *
   * REQ: REQ-001
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem inserted = new MeuItem(4);
      MeuItem missing = new MeuItem(-1579);

      // When
      tabela0.insere(inserted);

      // Then
      assertEquals("Table size should be 1 after one insert", 1, tabela0.n);

      int resultMissing = tabela0.pesquisa(missing);
      assertEquals("Pesquisa for a missing negative key should return 0", 0, resultMissing);

      int resultInserted = tabela0.pesquisa(inserted);
      assertEquals("Pesquisa should find the previously inserted item and return its index (1)", 1, resultInserted);

      // Additional consistency: binaria for missing returns 0 and for inserted returns same index as pesquisa
      int binMissing = tabela0.binaria(missing);
      assertEquals("Binary search for missing key should return 0", 0, binMissing);
      int binInserted = tabela0.binaria(inserted);
      assertEquals("Binary search for inserted key should match pesquisa result", resultInserted, binInserted);
  }
}