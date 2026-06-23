package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

  private Item[] createEmptyItemArray() {
    return new Item[0];
  }

  private Item[] createSingleItemArray() {
    return new Item[1];
  }

  private Item[] createItemArrayWithMeuItems() {
    Item[] items = new Item[7];
    MeuItem meuItem = new MeuItem(583);
    items[1] = meuItem;
    items[5] = meuItem;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest03() {
    Item[] items = new Item[8];
    MeuItem meuItem0 = new MeuItem(1996);
    MeuItem meuItem1 = new MeuItem(-1);
    items[1] = meuItem0;
    items[2] = meuItem0;
    items[3] = meuItem1;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest05() {
    Item[] items = new Item[7];
    MeuItem meuItem0 = new MeuItem(869);
    MeuItem meuItem1 = new MeuItem(0);
    items[1] = meuItem0;
    items[2] = meuItem0;
    items[3] = meuItem1;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest07() {
    Item[] items = new Item[9];
    MeuItem meuItem0 = new MeuItem(99);
    MeuItem meuItem1 = new MeuItem(-2485);
    items[1] = meuItem0;
    items[2] = meuItem0;
    items[3] = meuItem1;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest08() {
    Item[] items = new Item[9];
    MeuItem meuItem0 = new MeuItem(-4492);
    items[1] = meuItem0;
    items[2] = meuItem0;
    items[3] = meuItem0;
    items[4] = meuItem0;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest09() {
    Item[] items = new Item[6];
    MeuItem meuItem0 = new MeuItem(-237);
    for (int i = 1; i <= 5; i++) {
      items[i] = meuItem0;
    }
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest10() {
    Item[] items = new Item[6];
    MeuItem meuItem0 = new MeuItem(-237);
    MeuItem meuItem1 = new MeuItem(1265);
    items[1] = meuItem0;
    items[3] = meuItem0;
    items[5] = meuItem1;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest11() {
    Item[] items = new Item[8];
    MeuItem meuItem0 = new MeuItem(441);
    MeuItem meuItem1 = new MeuItem(0);
    items[0] = meuItem0;
    items[1] = meuItem1;
    return items;
  }

  private Item[] createItemArrayWithMeuItemsForTest12() {
    MeuItem meuItem0 = new MeuItem(0);
    Item[] items = new Item[7];
    items[0] = meuItem0;
    items[1] = meuItem0;
    return items;
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    Item[] itemArray0 = createEmptyItemArray();
    try {
      Ordenacao.heapsort(itemArray0, 2321);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      verifyException("ds.Ordenacao", e);
    }
  }

  @Test(timeout = 4000)
  public void test01() throws Throwable {
    Item[] itemArray0 = createSingleItemArray();
    Ordenacao.heapsort(itemArray0, 1);
    assertEquals("Array length should be 1 after heapsort", 1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test02() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItems();
    try {
      Ordenacao.shellsort(itemArray0, 5);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test03() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest03();
    try {
      Ordenacao.shellsort(itemArray0, 4);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test04() throws Throwable {
    Item[] itemArray0 = createSingleItemArray();
    Ordenacao.shellsort(itemArray0, 1);
    assertEquals("Array length should be 1 after shellsort", 1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test05() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest05();
    try {
      Ordenacao.insercao(itemArray0, 2231);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      verifyException("ds.Ordenacao", e);
    }
  }

  @Test(timeout = 4000)
  public void test06() throws Throwable {
    Item[] itemArray0 = createSingleItemArray();
    Ordenacao.insercao(itemArray0, 0);
    assertEquals("Array length should be 1 after insercao", 1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test07() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest07();
    try {
      Ordenacao.selecao(itemArray0, 4);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test08() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest08();
    Ordenacao.selecao(itemArray0, 4);
    assertEquals("Array length should be 9 after selecao", 9, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test09() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest09();
    Ordenacao.quicksort(itemArray0, 5);
    assertEquals("Array length should be 6 after quicksort", 6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test10() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest10();
    try {
      Ordenacao.quicksort(itemArray0, 5);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test11() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest11();
    try {
      Ordenacao.quicksort(itemArray0, 0);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test12() throws Throwable {
    Item[] itemArray0 = createItemArrayWithMeuItemsForTest12();
    Ordenacao.quicksort(itemArray0, 0);
    assertEquals("Array length should be 7 after quicksort", 7, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test13() throws Throwable {
    Ordenacao ordenacao0 = new Ordenacao();
    assertNotNull(ordenacao0);
  }

}