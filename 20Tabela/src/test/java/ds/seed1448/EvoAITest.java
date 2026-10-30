package ds.seed1448;

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
 * Unit tests for ds.Tabela (traceability: REQ-42).
 *
 * The tests follow Given-When-Then style in comments and include
 * descriptive assertion messages to aid debugging.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: an empty table and an item with key 0
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);

      // When: insert the same item twice (duplicate insert should still count as an entry)
      tabela0.insere(meuItem0);
      tabela0.insere(meuItem0);

      // And: perform a binary search for an item with key 3 (which is not present)
      MeuItem meuItem1 = new MeuItem(3);
      int int0 = tabela0.binaria(meuItem1);

      // Then: table should report size 2 and binaria should indicate 'not found' via returned 0
      assertEquals("Expected tabela.n to be 2 after two insertions", 2, tabela0.n);
      assertEquals("Expected binaria to return 0 for a non-existent key", 0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem((-1144));
      tabela0.insere(meuItem0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(1, tabela0.n);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem((-1144));
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      Item[] itemArray0 = new Item[3];
      tabela0.registros = itemArray0;
      tabela0.n = 2;
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

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(4);
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1579));
      int int0 = tabela0.pesquisa(meuItem1);
      assertEquals(1, tabela0.n);
      assertEquals(0, int0);
  }
}