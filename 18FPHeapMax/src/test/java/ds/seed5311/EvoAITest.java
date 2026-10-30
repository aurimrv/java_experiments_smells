package ds.seed5311;

import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for FPHeapMax focusing on a small set of behaviors.
 * Each test follows a Given-When-Then structure and links to a (fictional) requirement id for traceability.
 *
 * Note: This class preserves the original test method names and exception oracles.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

    // Helper to construct MeuItem to reduce duplication in tests.
    private MeuItem item(int value) {
        return new MeuItem(value);
    }

    /**
     * REQ-HEAP-001: Inserting a single element into a new heap should succeed without throwing.
     * Given: an empty heap with capacity 21 and an item with key 21.
     * When: the item is inserted and the heap is printed.
     * Then: no exception should be thrown and the heap reference should remain valid.
     */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(21);
      MeuItem meuItem0 = new MeuItem(21);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

    /**
     * REQ-HEAP-002: Inserting into a full heap must raise an Exception indicating overflow.
     * Given: a heap with capacity 1 that already contains one item.
     * When: inserting the same item again.
     * Then: an Exception is expected.
     */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
      MeuItem meuItem0 = new MeuItem(1);
      fPHeapMax0.insere(meuItem0);
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
     * REQ-HEAP-003: A heap built from a copy array should allow removal and further insertion.
     * Given: a heap and an array with multiple items including two distinct ones.
     * When: copying the array into the heap, removing the max, then inserting an item again.
     * Then: the two MeuItem instances used in the array should remain distinct objects.
     */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(21);
      MeuItem meuItem0 = new MeuItem(21);
      Item[] itemArray0 = new Item[8];
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(58);
      itemArray0[7] = (Item) meuItem1;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.retiraMax();
      fPHeapMax0.insere(meuItem0);
      assertNotSame(meuItem0, meuItem1);
  }

    /**
     * REQ-HEAP-004: Attempting to increase a key with a null new key should raise Exception.
     * Given: a heap with capacity zero.
     * When: aumentaChave is called with null.
     * Then: an Exception is expected.
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
     * REQ-HEAP-005: Removing max from an empty heap should raise Exception.
     * Given: an empty heap.
     * When: retiraMax is invoked.
     * Then: an Exception is expected.
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
     * REQ-HEAP-006: Copying an array with multiple entries followed by build should complete without throwing.
     * Given: an array with mixed items including negative key values.
     * When: copying array and constructing heap.
     * Then: operations complete (no exception thrown).
     */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(21);
      MeuItem meuItem0 = new MeuItem(258);
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem1 = new MeuItem((-3));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      itemArray0[7] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.constroi();
  }

    /**
     * REQ-HEAP-007: Certain malformed copy arrays may lead to NullPointerException on removal.
     * Given: a heap with a single inserted item and a copy array that contains a null in a critical position.
     * When: copia is applied and then retiraMax is invoked.
     * Then: NullPointerException is expected (preserves original behavior).
     */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(21);
      MeuItem meuItem0 = new MeuItem(258);
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem1 = new MeuItem((-3));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      try { 
        fPHeapMax0.retiraMax();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

    /**
     * REQ-HEAP-008: Mixed sequence of operations may expose internal nulls leading to NullPointerException on construct.
     * Given: inserted item and a copy array partially populated using a removed item.
     * When: constroi is invoked.
     * Then: NullPointerException is expected (preserves original behavior).
     */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(21);
      MeuItem meuItem0 = new MeuItem(258);
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray0 = new Item[4];
      itemArray0[1] = (Item) meuItem0;
      Item item0 = fPHeapMax0.retiraMax();
      itemArray0[2] = item0;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.insere(meuItem0);
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
     * REQ-HEAP-009: Calling max on a heap constructed with negative capacity should throw ArrayIndexOutOfBoundsException.
     * Given: a heap constructed with capacity -1.
     * When: max() is invoked.
     * Then: ArrayIndexOutOfBoundsException is expected.
     */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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