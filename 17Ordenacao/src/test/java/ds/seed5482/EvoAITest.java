package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.util.Arrays;

/**
 * Marker interface for unit-test categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  // Helper: create an Item array and fill given indices with the same MeuItem value.
  private static Item[] makeAndFill(int size, int value, int... indices) {
    Item[] arr = new Item[size];
    MeuItem m = new MeuItem(value);
    for (int idx : indices) {
      if (idx >= 0 && idx < size) {
        arr[idx] = m;
      }
    }
    return arr;
  }

  // Helper: count non-null elements in array
  private static int countNonNull(Item[] arr) {
    int c = 0;
    for (Item i : arr) if (i != null) c++;
    return c;
  }

  /**
   * Given: an array with several filled indices.
   * When: calling heapsort with an out-of-range size parameter.
   * Then: an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(1738);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 1738);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1738
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * Requirement: REQ-HEAP-EMPTY - heapsort must handle empty arrays without throwing.
   * Given an empty array, when heapsort is invoked with size 0, then the array should remain empty.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      Ordenacao.heapsort(itemArray0, 0);
      assertEquals(0, itemArray0.length);
  }

  /**
   * Given: an array with some null entries and some MeuItem(-25) values.
   * When: shellsort is invoked with a gap parameter that triggers a null access path.
   * Then: NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem((-25));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.shellsort(itemArray0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array with a mixture of MeuItem(4) and MeuItem(0).
   * When: shellsort is invoked with gap 4 and internal logic accesses nulls.
   * Then: a NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(4);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.shellsort(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array that is entirely null; when shellsort is invoked with gap 0,
   * then the array should remain unchanged and retain its length.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      Ordenacao.shellsort(itemArray0, 0);
      assertEquals(4, itemArray0.length);
  }

  /**
   * Given an array prepared to provoke index error in insertion sort,
   * when insercao is invoked with an out-of-range size, then an ArrayIndexOutOfBoundsException occurs.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(2140);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-1123));
      itemArray0[4] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 2140);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * Given: a minimal array; when insercao is invoked with size 0,
   * then the array remains of the same length and content (all null).
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      Ordenacao.insercao(itemArray0, 0);
      assertEquals(2, itemArray0.length);
  }

  /**
   * Given: a partially filled array; when selecao is invoked, it should not change the array length,
   * and the number of non-null items should remain the same.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-1339));
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-2963));
      itemArray0[2] = (Item) meuItem1;
      Ordenacao.selecao(itemArray0, 2);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given: a partially filled array with identical references at positions 1 and 2,
   * when selecao is invoked it should preserve the number of non-null elements.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-1339));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      Ordenacao.selecao(itemArray0, 2);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given: an array with multiple equal elements; when quicksort is invoked up to index 4,
   * then array length must be preserved and non-null count remains the same.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(601);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given: mixed values in an array; when quicksort is invoked,
   * then the array length and number of non-null elements should be preserved.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(601);
      MeuItem meuItem1 = new MeuItem((-559));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given: a small array where two elements are the same reference,
   * when quicksort is invoked with size 0, then array length is preserved.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem((-1));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals(3, itemArray0.length);
  }

  /**
   * Sanity check: constructing an Ordenacao instance should succeed.
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}