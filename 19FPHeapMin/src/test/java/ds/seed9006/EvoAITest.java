package ds.seed9006;

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
 * Marker interface for unit tests so tests can be selectively executed.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  /**
   * Given: a newly constructed heap with large capacity.
   * When: imprime() is invoked.
   * Then: the method completes without changing the reference and may throw a system-level NPE depending on internal state.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      Item[] itemArray0 = new Item[6];
      fPHeapMin0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * Given: a heap with a specified capacity.
   * When: imprime() is invoked on an empty heap.
   * Then: invocation should not return null and should not throw (observed behaviour in baseline).
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      fPHeapMin0.imprime();
  }

  /**
   * Given: an array with some positions filled and a MeuItem to insert.
   * When: copia() followed by insere() is executed.
   * Then: the inserted item's tamanho remains as expected (oracle).
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: an empty heap.
   * When: diminuiChave is invoked with a null new key.
   * Then: implementation must raise Exception for null chaveNova (oracle preserved).
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2316);
      try { 
        fPHeapMin0.diminuiChave(0, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: an empty heap and a MeuItem.
   * When: insere() is called.
   * Then: the inserted item's tamanho must match the expected oracle value.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      fPHeapMin0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: a newly created heap with capacity but no elements.
   * When: retiraMin() is invoked on the empty heap.
   * Then: an Exception indicating empty heap is expected.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2968);
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
   * Given: an Item array of small size and a heap constructed from it.
   * When: constroi() is invoked to build the heap structure.
   * Then: call completes without producing a null reference for heap instance.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      fPHeapMin0.constroi();
  }

  /**
   * Given: an array with several MeuItem entries copied into the heap.
   * When: refaz is called to restore heap order from a given index.
   * Then: operation completes (no exception expected in baseline); we assert heap reference remains valid.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[6];
      itemArray0[4] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.refaz(2, 1235);
  }

  /**
   * Given: a heap with partially filled array where some positions are null.
   * When: refaz is invoked on an index that references a null child.
   * Then: NullPointerException is expected (original oracle preserved).
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem1 = new MeuItem(1518);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.refaz(2, 1518);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: a heap with some different MeuItem entries copied into it.
   * When: refaz is invoked in a configuration that leads to NPE.
   * Then: NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem1 = new MeuItem(1518);
      itemArray0[4] = (Item) meuItem1;
      itemArray0[5] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.refaz(2, 1518);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: a small backing array for the heap.
   * When: constroi() is invoked which may traverse null entries.
   * Then: NullPointerException is expected in this configuration (oracle preserved).
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.constroi();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: a heap constructed from an array that may contain nulls.
   * When: retiraMin is invoked.
   * Then: NullPointerException is expected per original behaviour.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
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
   * Given: a heap constructed from a small array with no elements.
   * When: retiraMin() is invoked.
   * Then: a null element is returned (oracle preserved).
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Item[] itemArray0 = new Item[3];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      Item item0 = fPHeapMin0.retiraMin();
      assertNull(item0);
  }

  /**
   * Given: a heap backed by zero-length array.
   * When: insere() is invoked.
   * Then: an Exception indicating heap full is expected.
   */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      MeuItem meuItem0 = new MeuItem(1569);
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
   * Given: a heap constructed with a negative capacity.
   * When: min() is invoked.
   * Then: ArrayIndexOutOfBoundsException expected as per original oracle.
   */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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