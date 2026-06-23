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

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Tabela_ESTest_scaffolding {

  private Tabela createTabela() {
      return new Tabela();
  }

  private Tabela createTabelaWithItem(int value) {
      Tabela tabela = new Tabela();
      tabela.insere(new MeuItem(value));
      return tabela;
  }

  private Tabela createTabelaWithCapacity(int capacity) {
      Tabela tabela = new Tabela();
      tabela.registros = new Item[capacity];
      return tabela;
  }

  private MeuItem createMeuItem(int value) {
      return new MeuItem(value);
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      Tabela tabela0 = createTabela();
      MeuItem meuItem0 = createMeuItem(0); // boundary zero
      tabela0.insere(meuItem0);
      tabela0.insere((Item) null);
      MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // boundary max
      try {
          tabela0.binaria(meuItem1);
          fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
          assertNull("Exception message should be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      Tabela tabela0 = createTabelaWithItem(0);
      MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // boundary max
      int int0 = tabela0.binaria(meuItem1);
      assertEquals("Tabela size should be 1", 1, tabela0.n);
      assertEquals("binaria should return 0 for item 1", 0, int0);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      Tabela tabela0 = createTabela();
      MeuItem meuItem0 = createMeuItem(0); // boundary zero
      int int0 = tabela0.binaria(meuItem0);
      assertEquals("binaria should return 0 for item 0", 0, int0);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      Tabela tabela0 = createTabela();
      MeuItem meuItem0 = createMeuItem(0); // boundary zero
      tabela0.insere(meuItem0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals("Tabela size should be 1", 1, tabela0.n);
      assertEquals("binaria should return 1 for inserted item", 1, int0);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
      Tabela tabela0 = createTabelaWithCapacity(1); // minimal boundary size
      MeuItem meuItem0 = createMeuItem(0);
      tabela0.insere(meuItem0);
      try {
          tabela0.insere(meuItem0);
          fail("Expecting exception: Exception");
      } catch (Exception e) {
          assertEquals("Erro: A tabela esta cheia", e.getMessage());
          verifyException("ds.Tabela", e);
      }
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
      Tabela tabela0 = createTabelaWithItem(0);
      MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // boundary max
      int int0 = tabela0.pesquisa(meuItem1);
      assertEquals("Tabela size should be 1", 1, tabela0.n);
      assertEquals("pesquisa should return 0 for item 1", 0, int0);
  }

}