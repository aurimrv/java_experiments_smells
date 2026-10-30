package ds.seed6733;

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

/**
 * Improved and refactored tests for Ordenacao.
 *
 * Notes:
 * - Tests keep original test method names and exceptional behavior for oracle preservation.
 * - Added lightweight verification, constants, and helper methods to improve readability and maintainability.
 * - Category marker is provided for selective execution.
 */
interface SortingTests {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(SortingTests.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    // Named constants for magic numbers in original tests to improve readability.
    private static final int OUT_OF_RANGE_INDEX = 3322;
    private static final int NEGATIVE_INDEX = -1096;

    // Helper: count non-null entries in an Item array.
    private static int countNonNull(Item[] arr) {
        int cnt = 0;
        if (arr == null) {
            return 0;
        }
        for (Item i : arr) {
            if (i != null) {
                cnt++;
            }
        }
        return cnt;
    }

    // Helper: assert that all non-null elements are instances of MeuItem.
    private static void assertAllMeuItemInstances(Item[] arr, String message) {
        for (Item i : arr) {
            if (i != null) {
                assertTrue(message, i instanceof MeuItem);
            }
        }
    }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 3322);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3322
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.heapsort(itemArray0, (-1096));
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(1);
      MeuItem meuItem1 = new MeuItem(5);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      Ordenacao.shellsort(itemArray0, 5);
      assertEquals(6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(1149);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.insercao(itemArray0, (-1096));
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(2);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-2328));
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.selecao(itemArray0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(2);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      Ordenacao.selecao(itemArray0, 3);
      assertEquals(8, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(3);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(3);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(4);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(3);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(4);
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
      Ordenacao ordenacao0 = new Ordenacao();
  }
}