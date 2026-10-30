package ds.seed9121;

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
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      MeuItem meuItem0 = new MeuItem(456);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(1297);
      itemArray0[1] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      MeuItem meuItem1 = new MeuItem(456);
      fPHeapMax0.insere(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a heap with capacity 1
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);

      // When/Then: attempting to increase a key to null should raise the documented Exception
      try {
        fPHeapMax0.aumentaChave(1, (Object) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         // Expected: Erro: chaveNova com valor null
         verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: an empty heap
      FPHeapMax fPHeapMax0 = new FPHeapMax(1159);

      // When/Then: removing the max from an empty heap should throw an Exception
      try {
        fPHeapMax0.retiraMax();
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         // Expected: Erro: heap vazio
         verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given: a heap and an array with some slots populated (including duplicates)
      FPHeapMax fPHeapMax0 = new FPHeapMax(1609);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(1609);
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[5] = (Item) meuItem1;

      // When: copying the array into the heap
      fPHeapMax0.copia(itemArray0);

      // Then: attempting to remove the maximum may trigger a NullPointerException in some internal states
      try {
        fPHeapMax0.retiraMax();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         // Expected: a NullPointerException may be thrown due to incomplete internal initialization
         // No message is required; presence of the exception is the verification
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given: a heap and an array with two distinct items placed in specific indices
      FPHeapMax fPHeapMax0 = new FPHeapMax(1609);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(1609);
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;

      // When: copying the array into the heap
      fPHeapMax0.copia(itemArray0);

      // Then: retiraMax may throw a NullPointerException depending on internal handling; verify that behavior
      try {
        fPHeapMax0.retiraMax();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      MeuItem meuItem0 = new MeuItem(456);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.constroi();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1159);
      fPHeapMax0.refaz(1159, (-1));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1159);
      Item item0 = fPHeapMax0.max();
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Given: a heap with zero capacity
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
      MeuItem meuItem0 = new MeuItem(1137);

      // When/Then: inserting into a full (zero-capacity) heap should raise the documented Exception
      try {
        fPHeapMax0.insere(meuItem0);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         // Expected: Erro: heap cheio
         verifyException("ds.FPHeapMax", e);
      }
  }
}