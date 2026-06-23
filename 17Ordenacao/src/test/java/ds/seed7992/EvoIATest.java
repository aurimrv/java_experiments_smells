package ds.seed7992;

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

  private static final int INVALID_INDEX = 4;
  private static final int NEGATIVE_INDEX = -1118;
  private static final int ARRAY_SIZE_1 = 1;
  private static final int ARRAY_SIZE_5 = 5;
  private static final int ARRAY_SIZE_6 = 6;
  private static final int ARRAY_SIZE_4 = 4;
  private static final MeuItem ITEM_FOUR = new MeuItem(4);
  private static final MeuItem ITEM_ZERO = new MeuItem(0);
  private static final MeuItem ITEM_NEG_1118 = new MeuItem(-1118);
  private static final MeuItem ITEM_NEG_3080 = new MeuItem(-3080);
  private static final MeuItem ITEM_2780 = new MeuItem(2780);
  private static final MeuItem ITEM_NEG_ONE = new MeuItem(-1);
  private static final MeuItem ITEM_TWO = new MeuItem(2);
  private static final MeuItem ITEM_229 = new MeuItem(229);
  private static final MeuItem ITEM_NEG_1530 = new MeuItem(-1530);

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      try {
        Ordenacao.heapsort(itemArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         verifyException("ds.Ordenacao", e);
      }
      itemArray0 = new Item[ARRAY_SIZE_1];
      Ordenacao.heapsort(itemArray0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[ARRAY_SIZE_1];
      Ordenacao.heapsort(itemArray0, NEGATIVE_INDEX);
      assertEquals(ARRAY_SIZE_1, itemArray0.length);
  }

  private Item[] createTestArrayForShellsort() {
    Item[] array = new Item[ARRAY_SIZE_5];
    array[1] = ITEM_FOUR;
    array[2] = ITEM_FOUR;
    array[3] = ITEM_FOUR;
    array[4] = ITEM_ZERO;
    return array;
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForShellsort();
      Ordenacao.shellsort(itemArray0, 4);
      assertEquals(ARRAY_SIZE_5, itemArray0.length);
  }

  private Item[] createArrayWithNegativeItems() {
    Item[] array = new Item[8];
    array[1] = ITEM_NEG_1118;
    array[5] = ITEM_NEG_1118;
    return array;
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = createArrayWithNegativeItems();
      try {
        Ordenacao.shellsort(itemArray0, 5);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         // expected
      }
  }

  private Item[] createTestArrayForInsercao() {
    Item[] array = new Item[ARRAY_SIZE_4];
    array[1] = ITEM_ZERO;
    array[2] = ITEM_NEG_3080;
    return array;
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForInsercao();
      try {
        Ordenacao.insercao(itemArray0, 599);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item[] itemArray0 = new Item[ARRAY_SIZE_6];
      Ordenacao.insercao(itemArray0, NEGATIVE_INDEX);
      assertEquals(ARRAY_SIZE_6, itemArray0.length);
  }

  private Item[] createTestArrayForSelecao() {
    Item[] array = new Item[ARRAY_SIZE_6];
    array[1] = ITEM_2780;
    array[2] = ITEM_ZERO;
    return array;
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForSelecao();
      try {
        Ordenacao.selecao(itemArray0, 2331);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         verifyException("ds.Ordenacao", e);
      }
  }

  private Item[] createTestArrayForSelecaoNormal() {
    Item[] array = new Item[ARRAY_SIZE_6];
    array[1] = ITEM_NEG_ONE;
    array[2] = ITEM_NEG_ONE;
    return array;
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForSelecaoNormal();
      Ordenacao.selecao(itemArray0, 2);
      assertEquals(ARRAY_SIZE_6, itemArray0.length);
  }

  private Item[] createTestArrayForQuicksort() {
    Item[] array = new Item[ARRAY_SIZE_6];
    array[1] = ITEM_NEG_ONE;
    array[2] = ITEM_NEG_ONE;
    array[3] = ITEM_NEG_ONE;
    array[4] = ITEM_NEG_ONE;
    return array;
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForQuicksort();
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(ARRAY_SIZE_6, itemArray0.length);
  }

  private Item[] createTestArrayForQuicksortZero() {
    Item[] array = new Item[ARRAY_SIZE_6];
    array[0] = ITEM_NEG_ONE;
    array[1] = ITEM_NEG_ONE;
    return array;
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForQuicksortZero();
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals(ARRAY_SIZE_6, itemArray0.length);
  }

  private Item[] createTestArrayForQuicksortException() {
    Item[] array = new Item[ARRAY_SIZE_6];
    array[1] = ITEM_NEG_ONE;
    array[2] = ITEM_NEG_ONE;
    array[4] = ITEM_TWO;
    return array;
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForQuicksortException();
      try {
        Ordenacao.quicksort(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         // expected
      }
  }

  private Item[] createTestArrayForQuicksortException2() {
    Item[] array = new Item[ARRAY_SIZE_4];
    array[0] = ITEM_229;
    array[1] = ITEM_NEG_1530;
    return array;
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = createTestArrayForQuicksortException2();
      try {
        Ordenacao.quicksort(itemArray0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         // expected
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }

}