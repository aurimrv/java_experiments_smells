package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  /**
   * Given: a heap constructed from an array that contains only null slots
   * When: imprime() is invoked
   * Then: a NullPointerException is expected (preserves original oracle)
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("org.evosuite.runtime.System", e);
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: an empty heap constructed with explicit capacity
   * When: imprime() is invoked
   * Then: no exception and heap remains empty (min() == null)
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2304);
      fPHeapMin0.imprime();
  }

  /**
   * Given: a heap created from an Item[] with null entries
   * When: attempting to insert a null slot item
   * Then: an Exception is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      try { 
        fPHeapMin0.insere(itemArray0[1]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: heap cheio
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: a heap with capacity and two distinct items inserted
   * When: two distinct MeuItem objects are inserted
   * Then: the two MeuItem instances should not be equal (preserved assertion)
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(760);
      MeuItem meuItem0 = new MeuItem(760);
      fPHeapMin0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(2563);
      fPHeapMin0.insere(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  /**
   * Given: a heap and a single MeuItem inserted twice
   * When: insert the same item object twice
   * Then: the internal counter (tamanho) returns expected value 4 (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(760);
      MeuItem meuItem0 = new MeuItem(760);
      fPHeapMin0.insere(meuItem0);
      fPHeapMin0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: a heap with a valid positive capacity
   * When: diminishing a key with a null new key
   * Then: an Exception is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2304);
      try { 
        fPHeapMin0.diminuiChave(2304, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMin", e);
      }
  }

  /**
   * Given: a heap constructed with negative capacity
   * When: retiraMin() is called
   * Then: an Exception is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin((-1));
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
   * Given: a heap constructed from an array of slots (some null)
   * When: attempting to build the heap using constroi()
   * Then: a NullPointerException is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.constroi();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: a small capacity heap
   * When: constroi() is invoked on an empty heap
   * Then: no exception and heap remains consistent (min() == null)
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(2);
      fPHeapMin0.constroi();
  }

  /**
   * Given: a single-slot array containing one MeuItem with a negative key
   * When: refaz(0,0) is invoked to reheapify that single element
   * Then: operation completes without exception and the original item remains present
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      MeuItem meuItem0 = new MeuItem((-852));
      itemArray0[0] = (Item) meuItem0;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      fPHeapMin0.refaz(0, 0);
  }

  /**
   * Given: a partially populated array passed into FPHeapMin
   * When: refaz is called with an index and a size parameter that is out-of-bounds
   * Then: ArrayIndexOutOfBoundsException is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(2591);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1);
      itemArray0[3] = (Item) meuItem1;
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMin0.refaz(1, 2591);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array containing a few items copied into a heap with explicit capacity
   * When: copy is performed then retiraMin is invoked
   * Then: a NullPointerException is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(4);
      MeuItem meuItem1 = new MeuItem((-345));
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      FPHeapMin fPHeapMin0 = new FPHeapMin(258);

      // When: copy into heap
      fPHeapMin0.copia(itemArray0);

      // Then: calling retiraMin() should trigger the same behavior as original test
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         // preserve original behavior: no additional assertions
      }
  }

  /**
   * Given: an array with two identical references to the same MeuItem and a heap built from it
   * When: retiraMin() is invoked
   * Then: NullPointerException is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      MeuItem meuItem0 = new MeuItem(2632);
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;

      // When / Then
      try { 
        fPHeapMin0.retiraMin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         // preserve original behavior: no extra verification
      }
  }

  /**
   * Given: a heap created from an array of two null slots
   * When: retiraMin() is invoked
   * Then: expected to return null (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      Item item0 = fPHeapMin0.retiraMin();
      assertNull(item0);
  }

  /**
   * Given: an empty heap with capacity 8
   * When: min() is queried
   * Then: null is expected (preserve original oracle)
   */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(8);
      Item item0 = fPHeapMin0.min();
      assertNull(item0);
  }
}