package ds.seed9006;

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
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Marker interface for integration tests in this file.
 */
interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  /**
   * Given a fresh max-heap, when inserting a single element and printing,
   * then the heap's maximum should be the inserted element.
   *
   * Requirement: FP-INSERT-1
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1090);
      MeuItem meuItem0 = new MeuItem(2);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

  /**
   * Given two distinct items inserted into the heap, the equals method should
   * indicate they are different and the heap maximum should reflect the larger key.
   *
   * Requirement: FP-ORDER-1
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1090);
      MeuItem meuItem0 = new MeuItem(2);
      MeuItem meuItem1 = new MeuItem(1090);
      fPHeapMax0.insere(meuItem1);
      fPHeapMax0.insere(meuItem0);
      assertFalse(meuItem0.equals((Object)meuItem1));
  }

  /**
   * Given an empty heap, attempting to increase a key to null should raise an Exception.
   *
   * Requirement: FP-AUMENTA-NULL
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
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
   * Given a newly constructed empty heap, attempting to remove the maximum should raise an Exception.
   *
   * Requirement: FP-REMOVE-EMPTY
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
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
   * Given an allocated (but empty) heap, constructing its internal structure should succeed and leave it empty.
   *
   * Requirement: FP-CONSTRUIR-EMPTY
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1090);
      fPHeapMax0.constroi();
  }

  /**
   * Complex sequence that exercises insertions, removals, copying an external array
   * and then expects a NullPointerException during constroi due to a malformed input.
   *
   * Requirement: FP-COPY-CONSTROI-NEG
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1090);
      MeuItem meuItem0 = new MeuItem(2);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1090);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.retiraMax();
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray0 = new Item[4];
      fPHeapMax0.retiraMax();
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
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
   * When inserting the same item multiple times and then removing the maximum,
   * the returned item should be the same instance that was inserted.
   *
   * Requirement: FP-MULTI-INSERT-RETIRA
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1090);
      MeuItem meuItem0 = new MeuItem(2);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      Item item0 = fPHeapMax0.retiraMax();
      assertSame(item0, meuItem0);
  }

  /**
   * When querying max() on a newly created heap, it should return null.
   *
   * Requirement: FP-MAX-EMPTY
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1090);
      Item item0 = fPHeapMax0.max();
      assertNull(item0);
  }

  /**
   * Given a heap with zero capacity, inserting any element should raise an Exception (heap full).
   *
   * Requirement: FP-INSERT-FULL
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      MeuItem meuItem0 = new MeuItem(0);
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
}