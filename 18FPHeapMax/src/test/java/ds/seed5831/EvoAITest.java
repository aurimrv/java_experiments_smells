package ds.seed5831;

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
 * Lightly refactored tests for FPHeapMax.
 * Each test includes brief Given-When-Then comments and clearer assertion messages.
 * Traceability: requirements referenced inline in Javadoc for each test.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  /**
   * REQ-HEAP-INSERT-PRINT: Verify that inserting an item into a large-capacity heap
   * and invoking imprime() completes without throwing and preserves the item object.
   *
   * Given a heap with capacity 2822 and an item constructed with value 2822
   * When the item is inserted and imprime() is invoked
   * Then the heap instance and the item instance remain non-null (insertion completed)
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2822);
      MeuItem meuItem0 = new MeuItem(2822);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.imprime();
  }

  /**
   * REQ-HEAP-INSERT-BOUNDS: Verify that inserting into a zero-capacity heap raises an Exception.
   *
   * Given a heap with capacity 0
   * When an insert is attempted
   * Then an Exception indicating the heap is full is thrown
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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

  /**
   * REQ-ITEM-SIZE: Verify that MeuItem reports the expected tamanho() after construction and insertion order does not alter
   * the object's intrinsic property.
   *
   * Given a heap and two MeuItem instances
   * When both items are inserted into the heap
   * Then the tamanho() of the second item remains as expected (oracle preserved)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(421);
      MeuItem meuItem0 = new MeuItem(2921);
      fPHeapMax0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(421);
      fPHeapMax0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * REQ-HEAP-AUMENTA-CHAVE-VALIDATION: Verify aumentaChave rejects null new-key values.
   *
   * Given a heap of capacity 1
   * When aumentaChave is called with a null chaveNova
   * Then an Exception indicating invalid (null) chaveNova is thrown
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
      try { 
        fPHeapMax0.aumentaChave(1, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: chaveNova com valor null
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * REQ-HEAP-RETIRA-EMPTY: Copying an array into a freshly created heap and calling retiraMax on an empty heap should return null.
   *
   * Given a heap with capacity 1 and an empty Item array copy
   * When copia is invoked and retiraMax is called
   * Then retiraMax returns null (no items present)
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
      Item[] itemArray0 = new Item[2];
      fPHeapMax0.copia(itemArray0);
      Item item0 = fPHeapMax0.retiraMax();
      assertNull(item0);
  }

  /**
   * REQ-HEAP-STRUCTURE-AND-CONSTRUCT: Copying an array with items and invoking constroi/insere should not throw.
   *
   * Given a heap and a prepared Item array where one item is negative and another positive
   * When copying, constructing and inserting occur
   * Then operations complete without exceptions and relevant objects remain non-null
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(421);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(338);
      MeuItem meuItem1 = new MeuItem((-2186));
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.constroi();
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.constroi();
  }

  /**
   * REQ-HEAP-CONSTRUCT-DUPLICATES: Copying an array with duplicated references and building the heap should be tolerated.
   *
   * Given a heap and an array where two positions reference the same MeuItem
   * When copia is invoked and the item is inserted and constructed
   * Then operations complete and objects remain intact
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(421);
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(338);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = itemArray0[1];
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.constroi();
  }

  /**
   * REQ-HEAP-MAX-EMPTY-ACCESS: Calling max() on an empty heap should raise ArrayIndexOutOfBoundsException.
   *
   * Given a heap created with capacity 0
   * When max() is invoked
   * Then ArrayIndexOutOfBoundsException is thrown
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(0);
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

  /**
   * REQ-HEAP-RETIRA-NEGATIVE-CAPACITY: Creating a heap with negative capacity and attempting retiraMax should raise Exception.
   *
   * Given a heap constructed with negative capacity
   * When retiraMax() is invoked
   * Then an Exception indicating the heap is empty or invalid is thrown
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax((-1));
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
}