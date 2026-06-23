package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

  private Item[] createItemArrayWithMeuItem(int size, int value) {
      Item[] items = new Item[size];
      MeuItem meuItem = new MeuItem(value);
      for (int i = 0; i < size; i++) {
          items[i] = meuItem;
      }
      return items;
  }

  private Item[] createItemArrayWithMeuItems(int size, int val1, int val2) {
      Item[] items = new Item[size];
      MeuItem meuItem1 = new MeuItem(val1);
      MeuItem meuItem2 = new MeuItem(val2);
      for (int i = 0; i < size; i++) {
          items[i] = (i % 2 == 0) ? meuItem1 : meuItem2;
      }
      return items;
  }

  private Item[] createItemArrayWithMeuItemsForException() {
      Item[] items = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(13);
      items[1] = meuItem1;
      items[5] = meuItem0;
      return items;
  }

  private Item[] createItemArrayForInsercaoException() {
      Item[] items = new Item[4];
      MeuItem meuItem0 = new MeuItem(-276);
      MeuItem meuItem1 = new MeuItem(1375);
      items[1] = meuItem1;
      items[2] = meuItem0;
      return items;
  }

  private Item[] createItemArrayForSelecaoException() {
      Item[] items = new Item[7];
      MeuItem meuItem0 = new MeuItem(1353);
      MeuItem meuItem1 = new MeuItem(4);
      items[1] = meuItem0;
      items[2] = meuItem0;
      items[3] = meuItem1;
      return items;
  }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(7, 1353);
      try {
          Ordenacao.heapsort(itemArray0, itemArray0.length);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
          verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(8, 0);
      Ordenacao.heapsort(itemArray0, 0);
      assertEquals("Array length should remain 8", 8, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[1]);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItems(8, 0, 1289);
      Ordenacao.shellsort(itemArray0, 5);
      assertEquals("Array length should be 8 after shellsort", 8, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[1]);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItemsForException();
      try {
          Ordenacao.shellsort(itemArray0, 5);
          fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
          assertNull("Exception message should be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = createItemArrayForInsercaoException();
      try {
          Ordenacao.insercao(itemArray0, 0);
          fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
          verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try {
          Ordenacao.insercao((Item[]) null, -1183);
          fail("Expecting NullPointerException");
      } catch (NullPointerException e) {
          // expected
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = createItemArrayForSelecaoException();
      try {
          Ordenacao.selecao(itemArray0, 4);
          fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
          assertNull("Exception message should be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(7, 1353);
      Ordenacao.selecao(itemArray0, 4);
      assertEquals("Array length should be 7 after selecao", 7, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[1]);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(8, 0);
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals("Array length should be 8 after quicksort", 8, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[1]);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(9, -1878);
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals("Array length should be 9 after quicksort", 9, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[1]);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(4, 2712);
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals("Array length should be 4 after quicksort", 4, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[0]);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = createItemArrayWithMeuItem(8, 0);
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals("Array length should be 8 after quicksort", 8, itemArray0.length);
      assertNotNull("Array elements should not be null", itemArray0[1]);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }

}