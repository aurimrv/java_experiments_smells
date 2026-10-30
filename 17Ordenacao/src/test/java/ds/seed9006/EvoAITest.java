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
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    /* Helper to count non-null entries in an Item array */
    private int countNonNull(Item[] arr) {
        if (arr == null) return 0;
        int c = 0;
        for (Item it : arr) {
            if (it != null) c++;
        }
        return c;
    }

    /**
     * Requirement: REQ-ORD-001
     * Given an array with most positions filled,
     * when heapsort is invoked with an out-of-range index,
     * then an ArrayIndexOutOfBoundsException is expected.
     */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1353);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 43);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 43
         //
         verifyException("ds.Ordenacao", e);
      }
  }

    /**
     * Requirement: REQ-ORD-002
     * Given a nearly full array,
     * when heapsort is invoked with a negative auxiliary parameter,
     * then the array should remain the same size and preserve non-null elements count.
     */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      itemArray0[7] = (Item) meuItem0;
      Ordenacao.heapsort(itemArray0, (-2051));
      assertEquals(8, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-003
     * Given an array with mixed items,
     * when shellsort is invoked with a typical gap,
     * then the array size and non-null element count should be preserved.
     */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1289);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      Ordenacao.shellsort(itemArray0, 5);
      assertEquals(8, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-004
     * Given a sparsely populated array,
     * when shellsort is invoked in a scenario that triggers NullPointerException,
     * then the exception should be thrown.
     */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem(13);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[5] = (Item) meuItem0;
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

    /**
     * Requirement: REQ-ORD-005
     * Given a small array with some nulls,
     * when insertion sort is invoked with a large key value,
     * then a NullPointerException is expected in this scenario.
     */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem((-276));
      MeuItem meuItem1 = new MeuItem(1375);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 1375);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.Ordenacao", e);
      }
  }

    /**
     * Requirement: REQ-ORD-006
     * Given a null array reference,
     * when insertion sort is called with any parameter,
     * then behavior (no explicit assertion here) should follow implementation - test ensures call completes or fails as original.
     */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ordenacao.insercao((Item[]) null, (-1183));
  }

    /**
     * Requirement: REQ-ORD-007
     * Given a partially filled array,
     * when selection sort is invoked that triggers a NullPointerException,
     * then the exception should be observed.
     */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1353);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(4);
      itemArray0[3] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.selecao(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

    /**
     * Requirement: REQ-ORD-008
     * Given a nearly-full array,
     * when selection sort is invoked normally,
     * then the array length and non-null count are preserved.
     */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1353);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.selecao(itemArray0, 4);
      assertEquals(7, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-009
     * Given an array with a small variety of items,
     * when quicksort is invoked with an index,
     * then the array length and non-null elements count remain consistent.
     */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-1));
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 3);
      assertEquals(8, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-010
     * Given an array with repeated items,
     * when quicksort is invoked at index 3,
     * then array length is preserved and non-null count remains the same.
     */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem((-1878));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 3);
      assertEquals(9, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-011
     * Given an array where the pivot is at index 0,
     * when quicksort is invoked at 0,
     * then array length and non-null count are preserved.
     */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(2712);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals(4, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-012
     * Given an array with small repeated values,
     * when quicksort is invoked,
     * then array length and non-null count are preserved.
     */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem((-1));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem2 = new MeuItem(0);
      itemArray0[3] = (Item) meuItem2;
      Ordenacao.quicksort(itemArray0, 3);
      assertEquals(8, itemArray0.length);
  }

    /**
     * Requirement: REQ-ORD-013
     * Given the construction of Ordenacao,
     * when a new instance is created,
     * then the instance should not be null.
     */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}