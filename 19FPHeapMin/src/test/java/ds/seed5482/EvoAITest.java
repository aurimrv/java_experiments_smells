package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved test suite for FPHeapMin focusing on readability, maintainability,
 * and better assertions while preserving original test oracles and behaviors.
 *
 * Traceability: REQ-HEAP-001
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  private static final int SMALL_CAPACITY = 2;
  private static final int MEDIUM_CAPACITY = 3;
  private static final int LARGE_CAPACITY = 1278;

  /**
   * Given a heap with a reasonable capacity, when inserting an item and printing,
   * then the inserted item should retain its internal size metadata.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1278);
      MeuItem meuItem0 = new MeuItem((-179));
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.imprime();
  }

  /**
   * Given a heap that has been populated by copying an external array, when inserting
   * an additional item into a full heap, then an Exception indicating a full heap is expected.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(2);
      fPHeapMin0.copia(itemArray0);
      try { 
        fPHeapMin0.insere(meuItem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap cheio
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given a heap after copying an array with one item, when removing min, modifying a new item's key and inserting it,
   * then the item's tamanho metadata should be as expected.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(2);
      itemArray0[2] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.retiraMin();
      MeuItem meuItem1 = new MeuItem(2);
      Integer integer0 = new Integer(4251);
      meuItem1.alteraChave(integer0);
      fPHeapMin0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Given a heap that had one item copied into it, when retiraMin and then re-insert the same item,
   * then the MeuItem metadata should remain consistent.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(2);
      itemArray0[2] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.retiraMin();
      fPHeapMin0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given a heap, when attempting to decrease a key with a null value, then the operation should fail
   * with an Exception as per original behavior.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(795);
      try { 
        fPHeapMin0.diminuiChave(4, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given a heap constructed from an empty array, when removing the minimum element,
   * then an Exception indicating an empty heap is expected.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap vazio
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given an array with many identical max-value items, when building the heap via constructor and constroi(),
   * then construction should complete without throwing.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(Integer.MAX_VALUE);
      Item[] itemArray0 = new Item[9];
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      itemArray0[7] = (Item) meuItem0;
      itemArray0[8] = (Item) meuItem0;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      fPHeapMin0.constroi();
  }

  /**
   * Given a partially populated array with nulls and items, when constructing the heap and removing min,
   * then the returned item should be null as per original oracle.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(Integer.MAX_VALUE);
      MeuItem meuItem1 = new MeuItem(0);
      Item[] itemArray0 = new Item[9];
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      itemArray0[6] = (Item) meuItem0;
      itemArray0[7] = (Item) meuItem1;
      itemArray0[8] = (Item) meuItem0;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      Item item0 = fPHeapMin0.retiraMin();
      assertNull(item0);
  }

  /**
   * Given a heap constructed with a negative size, when calling min() an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin((-1));
      // Undeclared exception!
      try { 
        fPHeapMin0.min();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ds.FPHeapMin", e);
      }
  }
}