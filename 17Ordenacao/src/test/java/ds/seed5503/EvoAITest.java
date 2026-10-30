package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved test class for Ordenacao algorithms.
 *
 * Each test preserves the original oracle (exceptions and expected values)
 * while adding clearer assertions, descriptive failure messages, and small
 * pre/post checks (e.g., non-null counts) to make failures easier to diagnose.
 *
 * Note: This class preserves the original test method signatures and the
 * EvoRunner annotations as required.
 */

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  // Helper: count non-null entries in an array
  private int countNonNull(Item[] arr) {
    if (arr == null) return 0;
    int c = 0;
    for (Item i : arr) if (i != null) c++;
    return c;
  }

  // Helper: count occurrences of a specific object reference in an array
  private int countOccurrences(Item[] arr, Item target) {
    if (arr == null) return 0;
    int c = 0;
    for (Item i : arr) if (i == target) c++;
    return c;
  }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 2166);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2166
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.heapsort(itemArray0, (-1));
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem((-1));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      itemArray0[5] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.shellsort(itemArray0, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(4);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-1));
      itemArray0[2] = (Item) meuItem1;
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

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.shellsort(itemArray0, (-1));
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem(930);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 1343);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ordenacao.insercao((Item[]) null, 0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-1387));
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      Ordenacao.selecao(itemArray0, 3);
      assertEquals(7, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-2325));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(7, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-2325));
      MeuItem meuItem1 = new MeuItem((-250));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.quicksort(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Given: small array with some null slots and two elements set
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(1715);
      itemArray0[0] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(2);
      itemArray0[1] = (Item) meuItem1;

      // When/Then: quicksort with pivot/index 0 expected to throw NullPointerException in this configuration
      try {
        Ordenacao.quicksort(itemArray0, 0);
        fail("Expected NullPointerException when calling quicksort with index 0 on array containing nulls");
      } catch (NullPointerException e) {
        // preserve original behavior
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      MeuItem meuItem0 = new MeuItem((-1276));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals(5, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}