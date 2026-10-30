package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 * Placed at package level so it can be referenced by @Category.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  /**
   * Given a newly created heap with capacity 1,
   * When an item is inserted,
   * Then max() should return a non-null item equal to the inserted item
   * and retiraMax should remove and return that same instance.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
      MeuItem meuItem0 = new MeuItem(1);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

  /**
   * Given a heap with zero capacity,
   * When inserting any item,
   * Then the implementation must throw an Exception indicating the heap is full.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      MeuItem meuItem0 = new MeuItem(172);
      try { 
        fPHeapMax0.insere(meuItem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap cheio
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * Given a heap with sufficient capacity,
   * When inserting two items,
   * Then the second item's tamanho() should be as expected and max() must be non-null.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1006);
      MeuItem meuItem0 = new MeuItem(1581);
      fPHeapMax0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1006);
      fPHeapMax0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Given an empty heap,
   * When aumentaChave is called with a null new key,
   * Then the implementation must throw an Exception indicating invalid null chaveNova.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      try { 
        fPHeapMax0.aumentaChave(0, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * Given an empty heap,
   * When retiraMax is invoked,
   * Then the implementation must throw an Exception indicating the heap is empty.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      try { 
        fPHeapMax0.retiraMax();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap vazio
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * Given a newly created heap,
   * When constroi is invoked,
   * Then the operation should complete without throwing an unexpected exception.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(986);
      fPHeapMax0.constroi();
  }

  /**
   * Given a heap with several identical items and a prepared array with some null holes,
   * When copia is invoked and then constroi is called,
   * Then a NullPointerException is expected during constroi due to null entries in the copied array.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(986);
      MeuItem meuItem0 = new MeuItem(986);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray0 = new Item[7];
      itemArray0[1] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(2445);
      itemArray0[4] = (Item) meuItem1;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMax0.constroi();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array with several partially populated entries,
   * When copying into the heap and calling constroi,
   * Then a NullPointerException is expected due to null array entries.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1006);
      MeuItem meuItem0 = new MeuItem(1006);
      Item[] itemArray0 = new Item[9];
      itemArray0[4] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      itemArray0[7] = (Item) meuItem0;
      itemArray0[8] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMax0.constroi();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given a heap and an array of null entries copied into it,
   * When retiraMax is invoked,
   * Then a NullPointerException is expected because the heap has no valid elements.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(394);
      Item[] itemArray0 = new Item[4];
      fPHeapMax0.copia(itemArray0);
      try { 
        fPHeapMax0.retiraMax();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an invalid negative capacity,
   * When max() is invoked,
   * Then an ArrayIndexOutOfBoundsException is expected (preserve original oracle).
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax((-1));
      // Undeclared exception!
      try { 
        fPHeapMax0.max();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ds.FPHeapMax", e);
      }
  }
}