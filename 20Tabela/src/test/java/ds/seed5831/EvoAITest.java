package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved and refactored tests for Tabela behavior.
 * Traceability: RQ-001 (basic table operations), RQ-002 (bounds and error handling).
 *
 * These tests retain the original oracles and expected values but add
 * clearer Given-When-Then structure, descriptive assertion messages,
 * and classification via JUnit Category for easier test management.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: a fresh table and an item with a negative key
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem((-399));

      // When: inserting the same item twice (duplicate insertion scenario)
      tabela0.insere(meuItem0);
      tabela0.insere(meuItem0);

      // And: performing a binary search for a different negative key
      MeuItem meuItem1 = new MeuItem((-10));
      int int0 = tabela0.binaria(meuItem1);

      // Then: the table should reflect two insertions and the search should indicate not-found (0)
      assertEquals("After inserting the same item twice, tabela.n should be 2", 2, tabela0.n);
      assertEquals("Binary search should return 0 when the key is not present", 0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a fresh table and an item
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem((-399));

      // When: inserting the item once and searching for that same item
      tabela0.insere(meuItem0);
      int int0 = tabela0.binaria(meuItem0);

      // Then: table size should be 1 and binary search should return 1 (found at position 1)
      assertEquals("After inserting one item, tabela.n should be 1", 1, tabela0.n);
      assertEquals("Binary search should return 1 when the inserted item is searched", 1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a table with its registros array forcibly set to size 1 to simulate capacity constraints
      Tabela tabela0 = new Tabela();
      Item[] itemArray0 = new Item[1];
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.registros = itemArray0;

      // When / Then: inserting should raise an Exception indicating the table is full
      try { 
        tabela0.insere(meuItem0);
        fail("Expecting Exception when inserting into a table whose registros array is full");
      
      } catch(Exception e) {
         // Verify that the exception originates from ds.Tabela (preserve original verification)
         verifyException("ds.Tabela", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given: a fresh table and two items with distinct keys (negative and positive)
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem((-1869));

      // When: inserting one item and then searching for a different, non-present key
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1614);
      int int0 = tabela0.pesquisa(meuItem1);

      // Then: the insert should have increased the size to 1 and the pesquisa should return 0 (not found)
      assertEquals("After inserting one item, tabela.n should equal 1", 1, tabela0.n);
      assertEquals("Pesquisa should return 0 when searching for a key that was not inserted", 0, int0);
  }
}