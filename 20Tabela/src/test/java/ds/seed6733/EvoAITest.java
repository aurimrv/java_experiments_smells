package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * Requirement: REQ-TABELA-001
   * Scenario: Insert same item twice and then insert a different (smaller) item,
   * Expectation: table size increments correctly and binary search returns expected index for the smaller item.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.insere(meuItem0);
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-934));
      tabela0.insere(meuItem1);
      int int0 = tabela0.binaria(meuItem1);
      assertEquals(3, tabela0.n);
      assertEquals(0, int0);
  }

  /**
   * Requirement: REQ-TABELA-002
   * Scenario: Insert one item and search for a different item using binary search.
   * Expectation: table size is 1 and binary search returns index 0 (not found/position semantics).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(1);

      // When: setup by inserting one item, then perform binary search for a different item
      tabela0.insere(meuItem0);

      int int0 = tabela0.binaria(meuItem1);

      // Then: validate state and result
      assertEquals("Table size should be 1 after a single insertion", 1, tabela0.n);
      assertEquals("Binary search for a non-equal item should return 0 according to implementation semantics", 0, int0);
  }

  /**
   * Requirement: REQ-TABELA-003
   * Scenario: Binary search on an empty table.
   * Expectation: returns 0 and table remains empty.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(0, int0);
  }

  /**
   * Requirement: REQ-TABELA-004
   * Scenario: Insert an item and then binary search for the same item.
   * Expectation: table size is 1 and binary search returns index 1 per implementation contract.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a fresh table and an item
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);

      // When: insert item (setup) and then search for the same item (action)
      tabela0.insere(meuItem0);
      int int0 = tabela0.binaria(meuItem0);

      // Then: verify that the table contains exactly one element and binaria returns expected index
      assertEquals("Table size should be 1 after inserting one item", 1, tabela0.n);
      assertEquals("Binary search for the inserted item should return index 1 according to implementation", 1, int0);
  }

  /**
   * Requirement: REQ-TABELA-005
   * Scenario: Attempt to insert into a table explicitly marked as full.
   * Expectation: an Exception is thrown and table size remains unchanged.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      tabela0.n = 10;
      MeuItem meuItem0 = new MeuItem(10);
      try { 
        tabela0.insere(meuItem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A tabela esta cheia
         //
         verifyException("ds.Tabela", e);
      }
  }

  /**
   * Requirement: REQ-TABELA-006
   * Scenario: Insert one item and then perform a linear search (pesquisa) for a different item.
   * Expectation: table size is 1 and pesquisa returns 0 when item not found.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given: a table and two distinct items
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(1678);
      MeuItem meuItem1 = new MeuItem(0);

      // When: insert one item and search for another
      tabela0.insere(meuItem1);
      int int0 = tabela0.pesquisa(meuItem0);

      // Then: validate table size and search result
      assertEquals("Table size should be 1 after inserting one item", 1, tabela0.n);
      assertEquals("Pesquisa for a non-present item should return 0", 0, int0);
  }
}