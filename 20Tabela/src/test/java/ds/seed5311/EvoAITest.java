package ds.seed5311;

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
 * Improved and annotated test class for Tabela behaviors.
 *
 * Traceability:
 * - REQ-001: Insertion increments element count.
 * - REQ-002: Binary search (binaria) returns expected index or 0 when item not found / null.
 * - REQ-003: Inserting null into a constrained internal storage should raise an Exception when table is full.
 *
 * Note: This test class preserves EvoSuite runner settings (do not modify).
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: an empty Tabela and two distinct MeuItem values
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(656);

      // When: we insert both items and perform a binary search for the second item
      tabela0.insere(meuItem0);
      tabela0.insere(meuItem1);
      int int0 = tabela0.binaria(meuItem1);

      // Then: the table size must reflect both insertions and binary search returns expected index
      assertEquals("After inserting two items, tabela.n should be 2", 2, tabela0.n);
      assertEquals("binaria should return the expected index for the inserted item", 2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a tabela with a single negative-key item inserted
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(11);
      MeuItem meuItem1 = new MeuItem((-246));

      // When: we insert the negative-key item and run binary search for a different item
      tabela0.insere(meuItem1);
      int int0 = tabela0.binaria(meuItem0);

      // Then: insertion increased count to 1, but binaria for a non-inserted item returns 0
      assertEquals("Tabela should contain exactly one item after single insert", 1, tabela0.n);
      assertEquals("binaria should return 0 when the searched item is not present", 0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      int int0 = tabela0.binaria((Item) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a tabela with capacity 3 (will set internal array to length 3),
      // and a single MeuItem inserted twice to exercise duplicate handling
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(1);
      tabela0.insere(meuItem0);
      tabela0.insere(meuItem0);

      // Force the internal registros array to a bounded size to simulate fullness scenario
      Item[] itemArray0 = new Item[3];
      tabela0.registros = itemArray0;

      // When/Then: inserting a null Item when the internal storage is considered full should raise Exception
      try { 
        tabela0.insere((Item) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         // Preserve original verification of exception origin and message
         //
         // Erro: A tabela esta cheia
         //
         verifyException("ds.Tabela", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given: a tabela and two items with different keys
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(1307);
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);

      // When: we search for an item that was not inserted
      int int0 = tabela0.pesquisa(meuItem1);

      // Then: insertion count should be 1 and pesquisa should indicate not found (0)
      assertEquals("After inserting one item, tabela.n should be 1", 1, tabela0.n);
      assertEquals("pesquisa should return 0 when the item is not found", 0, int0);
  }
}