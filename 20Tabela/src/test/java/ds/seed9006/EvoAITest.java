package ds.seed9006;

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
 * Marker interface for unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * REQ-001: Verify that binary search throws NullPointerException when table contains a null record.
   *
   * Given a table with one valid item and an explicit null record,
   * when a binary search is invoked on another item,
   * then a NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem((-387));
      tabela0.insere(meuItem0);
      tabela0.insere((Item) null);
      MeuItem meuItem1 = new MeuItem(2);
      // Undeclared exception!
      try { 
        tabela0.binaria(meuItem1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * REQ-002: Binary search on a table containing a different item should return index 0.
   *
   * Given a table with a single item (0),
   * when searching for item (1),
   * then binaria should return 0 and table size remains 1.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      int int0 = tabela0.binaria(meuItem1);
      assertEquals(1, tabela0.n);
      assertEquals(0, int0);
  }

  /**
   * REQ-003: Binary search on an empty table should return 0 and leave the table unchanged.
   *
   * Given an empty table,
   * when a binary search is performed,
   * then it should return 0 and not modify table size.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(0, int0);
  }

  /**
   * REQ-004: Binary search for an identical item present in the table should indicate presence (return 1).
   *
   * Given a table with one item,
   * when the same item is searched for,
   * then binaria should return 1 and the table size remains 1.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.insere(meuItem0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(1, tabela0.n);
      assertEquals(1, int0);
  }

  /**
   * REQ-005: Inserting into a full table should raise an Exception with the expected message.
   *
   * Given a table with a small fixed capacity,
   * when inserts exceed capacity,
   * then an Exception indicating the table is full is thrown.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      Item[] itemArray0 = new Item[2];
      tabela0.registros = itemArray0;
      tabela0.insere(meuItem0);
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
   * REQ-006: Pesquisa (linear search) should return 0 when the searched item is not present.
   *
   * Given a table with one item (0),
   * when searching for item (1) via pesquisa,
   * then pesquisa returns 0 and table size remains 1.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      int int0 = tabela0.pesquisa(meuItem1);
      assertEquals(1, tabela0.n);
      assertEquals(0, int0);
  }
}