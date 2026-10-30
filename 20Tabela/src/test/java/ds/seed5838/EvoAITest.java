package ds.seed5838;

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
 * Unit tests for Tabela behaviors.
 *
 * Traceability: REQ-TABELA-001 (basic insert/search behaviors)
 *
 * Tests follow a Given-When-Then structure in comments to improve readability and
 * to aid future maintenance. These tests preserve the original assertions/oracles
 * while adding explanatory messages and categorization metadata.
 */
interface UnitTest {}
interface Req_Tabela_001 {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category({UnitTest.class, Req_Tabela_001.class})
public class EvoAITest extends Tabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: an empty table and two items with keys 0 and 1
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(0);
    tabela0.insere(meuItem0); // setup
    MeuItem meuItem1 = new MeuItem(1);
    tabela0.insere(meuItem1); // setup

    // When: performing binary search for item with key 1
    int int0 = tabela0.binaria(meuItem1);

    // Then: the table should contain two entries and binaria should return 2
    assertEquals("After inserting two items, expected tabela.n == 2", 2, tabela0.n);
    assertEquals("Binary search should return insertion/search position 2 for key 1", 2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: a table with one inserted item (key 0)
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(0);
    tabela0.insere(meuItem0); // setup

    // When: performing binary search for a different key (key 1)
    MeuItem meuItem1 = new MeuItem(1);
    int int0 = tabela0.binaria(meuItem1);

    // Then: table size remains 1 and binary search returns position 0 (no match / position)
    assertEquals("Table should have a single entry after one insert", 1, tabela0.n);
    assertEquals("Binary search for non-existing key should return 0 in this scenario", 0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: a table manipulated to contain a null record and its internal array set directly
    Tabela tabela0 = new Tabela();
    Item[] itemArray0 = new Item[2];
    MeuItem meuItem0 = new MeuItem((-1767));
    tabela0.insere(itemArray0[1]); // inserting null reference as part of setup
    tabela0.registros = itemArray0; // direct internal state manipulation to build the scenario

    // When/Then: inserting another item should raise an Exception indicating the table is full
    try {
      tabela0.insere(meuItem0);
      fail("Expecting exception: Exception"); // preserved original oracle behavior
    } catch (Exception e) {
      // Preserve original verification while adding contextual comment
      // Expected: Erro: A tabela esta cheia
      verifyException("ds.Tabela", e);
    }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: a table with one item (key 1) inserted
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(0);
    MeuItem meuItem1 = new MeuItem(1);
    tabela0.insere(meuItem1); // setup

    // When: searching (pesquisa) for an item with key 0 that was not inserted
    int int0 = tabela0.pesquisa(meuItem0);

    // Then: table size should be 1 and pesquisa should indicate not found / position 0
    assertEquals("After inserting one item, expected tabela.n == 1", 1, tabela0.n);
    assertEquals("Pesquisa for non-existing key should return 0 in this scenario", 0, int0);
  }
}