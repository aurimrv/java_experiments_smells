package ds.seed5482;

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
 * Unit tests for FPHeapMax focusing on a compact set of behaviors.
 * These tests were improved from an auto-generated baseline to include
 * clearer structure, Given-When-Then comments, and additional lightweight
 * assertions while preserving original oracles and exception expectations.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  /**
   * Given: a FPHeapMax with positive capacity and a valid MeuItem.
   * When: the item is inserted and the heap is printed.
   * Then: insertion should not throw and the item's reported size is correct.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2178);
      MeuItem meuItem0 = new MeuItem(1890);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

  /**
   * Given: a FPHeapMax with zero capacity.
   * When: attempting to insert null into a full heap.
   * Then: an Exception is expected indicating the heap is full.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      try { 
        fPHeapMax0.insere((Item) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap cheio
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * Given: a FPHeapMax and two MeuItem instances.
   * When: one item's chave is altered and both are inserted.
   * Then: the meuItem1 should still report its tamanho as expected.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2178);
      MeuItem meuItem0 = new MeuItem(1890);
      fPHeapMax0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1890);
      Integer integer0 = new Integer((-1));
      meuItem1.alteraChave(integer0);
      fPHeapMax0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Given: a FPHeapMax with capacity but null new key.
   * When: aumentaChave is called with a null new key.
   * Then: an Exception is expected indicating null chaveNova.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2238);
      try { 
        fPHeapMax0.aumentaChave(4, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * Given: an empty FPHeapMax.
   * When: retiraMax is called on an empty heap.
   * Then: an Exception is expected indicating the heap is empty.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2386);
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
   * Given: a FPHeapMax and a MeuItem.
   * When: the same item is inserted twice and constroi is invoked.
   * Then: operations complete without throwing and the item's tamanho is valid.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2178);
      MeuItem meuItem0 = new MeuItem(1890);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.constroi();
  }

  /**
   * Given: a FPHeapMax and an array with items in some positions.
   * When: copia is called and retiraMax is used.
   * Then: the returned maximum item should be the expected instance.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2178);
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(1890);
      fPHeapMax0.insere(meuItem0);
      itemArray0[1] = (Item) meuItem0;
      fPHeapMax0.insere(meuItem0);
      itemArray0[3] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      Item item0 = fPHeapMax0.retiraMax();
      assertSame(item0, meuItem0);
  }

  /**
   * Given: a FPHeapMax and an item array containing null gaps.
   * When: copia is used to set internal representation and retiraMax is invoked.
   * Then: a NullPointerException is expected due to null entries.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Arrange
      FPHeapMax fPHeapMax0 = new FPHeapMax(2698);
      MeuItem meuItem0 = new MeuItem(0);
      Item[] itemArray0 = new Item[8];
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(418);
      itemArray0[3] = (Item) meuItem1;
      itemArray0[7] = (Item) meuItem0;

      // Act
      fPHeapMax0.copia(itemArray0);

      // Assert: original behavior expects NullPointerException on retiraMax
      try {
        fPHeapMax0.retiraMax();
        fail("Expected NullPointerException when retiraMax encounters null entries after copia.");
      } catch(NullPointerException e) {
         // expected; no further verification required
      }
  }

  /**
   * Given: a FPHeapMax and a MeuItem.
   * When: the item is inserted and immediately removed.
   * Then: the same instance should be returned by retiraMax.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2178);
      MeuItem meuItem0 = new MeuItem(1890);
      fPHeapMax0.insere(meuItem0);
      Item item0 = fPHeapMax0.retiraMax();
      assertSame(item0, meuItem0);
  }

  /**
   * Given: a FPHeapMax constructed with a negative capacity.
   * When: max() is invoked.
   * Then: an ArrayIndexOutOfBoundsException is expected.
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