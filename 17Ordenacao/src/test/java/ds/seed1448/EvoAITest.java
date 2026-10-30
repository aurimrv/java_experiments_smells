package ds.seed1448;

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
import java.util.Objects;

/**
 * Marker interface for unit tests so tests can be categorized.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /* Helper utilities used across tests to improve readability and avoid repetition. */
  private static final int LARGE_INDEX = 1581;

  private int countNonNull(Item[] arr) {
    int c = 0;
    if (arr == null) return 0;
    for (Item it : arr) if (it != null) c++;
    return c;
  }

  /**
   * Requirement: REQ-ORDERING-NEG-INDEX
   * Given an array with two identical items in consecutive positions,
   * when heapsort is invoked with a large out-of-range index,
   * then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(1581);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 1581);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1581
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * Requirement: REQ-ORDERING-HEAP_SINGLE
   * Given a single-element array, heapsort should preserve array structure.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.heapsort(itemArray0, 0);
      assertEquals(1, itemArray0.length);
  }

  /**
   * Requirement: REQ-ORDERING-SHELL_MULTI
   * Given a partially populated array, shellsort should preserve number of elements.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem((-354));
      MeuItem meuItem1 = new MeuItem((-1962));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem1;
      itemArray0[6] = (Item) meuItem1;
      itemArray0[7] = (Item) meuItem0;
      Ordenacao.shellsort(itemArray0, 7);
      assertEquals(8, itemArray0.length);
  }

  /**
   * Requirement: REQ-ORDERING-INSERTION_NULL_BEHAVIOR
   * Given an array with a null at index 0 and valid items elsewhere,
   * when insercao is invoked with a large key, a NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(2341);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1);
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 2341);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * Requirement: REQ-ORDERING-INSERTION_NEG_INDEX
   * Given an array and a negative index parameter for insercao,
   * the method should complete without throwing and preserve array length.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      Ordenacao.insercao(itemArray0, (-188));
      assertEquals(3, itemArray0.length);
  }

  /**
   * Requirement: REQ-ORDERING-SELECTION
   * Given some populated positions, selecao should preserve counts and array structure.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(2084);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1497);
      itemArray0[3] = (Item) meuItem1;
      Ordenacao.selecao(itemArray0, 3);
      assertEquals(7, itemArray0.length);
  }

  /**
   * Requirement: REQ-ORDERING-QUICK_IDENTICAL
   * Given an array with two identical elements, quicksort should preserve both occurrences.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals(3, itemArray0.length);
  }

  /**
   * Requirement: REQ-ORDERING-QUICK_MIDDLE
   * Given a small partially populated array, quicksort should preserve element count.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(3469);
      MeuItem meuItem1 = new MeuItem(2);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 2);
      assertEquals(5, itemArray0.length);
  }

  /**
   * Requirement: REQ-ORDERING-QUICK_NULL_BEHAVIOR
   * Given an array with some nulls, quicksort may throw NullPointerException; test expects it.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-3783));
      itemArray0[1] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.quicksort(itemArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Requirement: REQ-ORDERING-CONSTRUCTOR
   * Construction of Ordenacao should succeed.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}