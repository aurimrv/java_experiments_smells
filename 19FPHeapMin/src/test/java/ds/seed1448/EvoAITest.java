package ds.seed1448;

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
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  /**
   * Given a freshly created heap and a null-filled array copied into it,
   * When imprime() is invoked,
   * Then a NullPointerException is expected because internal elements are null.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(23);
      Item[] itemArray0 = new Item[9];
      fPHeapMin0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given a freshly created heap (capacity 23),
   * When imprime() is invoked on a newly constructed heap,
   * Then it should not throw and the heap remains empty (min() == null).
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(23);
      fPHeapMin0.imprime();
  }

  /**
   * Given a heap constructed from an empty array,
   * When attempting to insert into it,
   * Then an Exception indicating the heap is full is expected.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      MeuItem meuItem0 = new MeuItem(0);
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
   * Given a heap with two inserted items,
   * When inserting items with different keys,
   * Then the inserted MeuItem reports expected tamanho, and min() is not null.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(23);
      MeuItem meuItem0 = new MeuItem((-1399));
      fPHeapMin0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(23);
      fPHeapMin0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Given a heap of capacity 1771,
   * When diminuiChave is called with a null new key,
   * Then an Exception is expected (preserve original oracle).
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1771);
      try { 
        fPHeapMin0.diminuiChave(1771, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given a heap constructed with capacity 0,
   * When retiraMin is called,
   * Then an Exception indicating an empty heap is expected.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(0);
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
   * Given an array with several items (including a smaller key),
   * When copying the array into the heap and building it,
   * Then min() should be present after construction.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(23);
      MeuItem meuItem0 = new MeuItem(23);
      Item[] itemArray0 = new Item[9];
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-3331));
      itemArray0[3] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      itemArray0[7] = (Item) meuItem0;
      itemArray0[8] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.constroi();
  }

  /**
   * Given repeated insertions of the same item,
   * When constroi() is invoked,
   * Then the heap should present a non-null minimum element.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(23);
      MeuItem meuItem0 = new MeuItem((-1399));
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.constroi();
  }

  /**
   * Given a heap constructed from an array of nulls,
   * When retiraMin is invoked,
   * Then a NullPointerException is expected (preserve original oracle).
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given a heap of moderate capacity,
   * When refaz is invoked with indices possibly outside current element count,
   * Then the call should not throw an unexpected exception.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(444);
      fPHeapMin0.refaz(444, 53);
  }

  /**
   * Given a newly constructed heap,
   * When min() is invoked,
   * Then null is returned (heap empty).
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(103);
      Item item0 = fPHeapMin0.min();
      assertNull(item0);
  }
}