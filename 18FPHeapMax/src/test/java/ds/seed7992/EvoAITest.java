package ds.seed7992;

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
 * Marker interface used to classify tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  /**
   * REQ-001: When the internal structure used by imprime() is not initialized,
   * a NullPointerException is expected. Given a freshly created heap and a
   * partial external array copy, calling imprime should raise the NPE.
   *
   * Given-When-Then:
   *  - Given: a heap with capacity 2021 and a small Item array copied in
   *  - When: imprime() is invoked
   *  - Then: a NullPointerException is thrown
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2021);
      Item[] itemArray0 = new Item[2];
      fPHeapMax0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMax0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * REQ-002: Calling imprime() on a newly created heap should be a safe no-op
   * or at least not produce an unexpected runtime error in the common case.
   *
   * Given-When-Then:
   *  - Given: a heap with capacity 2021
   *  - When: imprime() is invoked
   *  - Then: no exception is thrown and the heap instance remains valid
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2021);
      fPHeapMax0.imprime();
  }

  /**
   * REQ-003: Inserting into a heap with zero capacity must raise an Exception.
   *
   * Given-When-Then:
   *  - Given: a heap with capacity 0 and a valid item
   *  - When: insere() is invoked
   *  - Then: an Exception indicating full heap is thrown
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
   * REQ-004: Inserting two items into a heap updates item state as expected.
   *
   * Given-When-Then:
   *  - Given: a heap of capacity 4 and two items
   *  - When: both items are inserted
   *  - Then: the tamanho() of the second item remains as expected (oracle preserved)
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      MeuItem meuItem0 = new MeuItem(43);
      fPHeapMax0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      fPHeapMax0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * REQ-005: aumentaChave should reject a null chaveNova with an Exception.
   *
   * Given-When-Then:
   *  - Given: a heap of capacity 1
   *  - When: aumentaChave is called with null new key
   *  - Then: Exception is thrown
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
   * REQ-006: retiraMax on an empty heap must throw an Exception indicating empty heap.
   *
   * Given-When-Then:
   *  - Given: a newly created heap with capacity 2021 and no elements
   *  - When: retiraMax() is invoked
   *  - Then: Exception for empty heap is thrown
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2021);
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
   * REQ-007: copia followed by retiraMax on an empty-ish structure returns null.
   *
   * Given-When-Then:
   *  - Given: a heap and an Item array copied into it with no actual items
   *  - When: retiraMax() is invoked
   *  - Then: null is returned
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(2021);
      Item[] itemArray0 = new Item[2];
      fPHeapMax0.copia(itemArray0);
      Item item0 = fPHeapMax0.retiraMax();
      assertNull(item0);
  }

  /**
   * REQ-008: constroi() should be callable on a freshly created heap (happy path).
   *
   * Given-When-Then:
   *  - Given: a heap of capacity 17
   *  - When: constroi() is invoked
   *  - Then: no exception is thrown and heap remains valid
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(17);
      fPHeapMax0.constroi();
  }

  /**
   * REQ-009: refaz should throw NullPointerException when internal structure
   * expected by refaz is incomplete after a custom copia.
   *
   * Given-When-Then:
   *  - Given: a heap with an inserted item and a copied array containing nulls
   *  - When: refaz() is invoked on a range covering missing entries
   *  - Then: NullPointerException is thrown
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given
      FPHeapMax fPHeapMax0 = new FPHeapMax(17);
      MeuItem meuItem0 = new MeuItem(17);
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem1 = new MeuItem(1288);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);

      // When / Then
      try {
        fPHeapMax0.refaz(1, 17);
        fail("Expected NullPointerException when calling refaz with incomplete internal array");
      } catch(NullPointerException e) {
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * REQ-010: refaz should operate correctly in a typical insertion scenario.
   *
   * Given-When-Then:
   *  - Given: a heap of capacity 9 and two inserted items
   *  - When: a partial array is copied and refaz is invoked for the range
   *  - Then: the method completes without throwing in this configuration
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(9);
      MeuItem meuItem0 = new MeuItem((-2189));
      fPHeapMax0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(9);
      fPHeapMax0.insere(meuItem1);
      Item[] itemArray0 = new Item[6];
      itemArray0[1] = (Item) meuItem1;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.refaz(1, 9);
  }

  /**
   * REQ-011: constroi should throw NullPointerException if internal state is incomplete after a copy.
   *
   * Given-When-Then:
   *  - Given: a heap and a copied array with missing entries
   *  - When: constroi() is invoked
   *  - Then: a NullPointerException is expected
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4862);
      Item[] itemArray0 = new Item[3];
      fPHeapMax0.copia(itemArray0);
      // Undeclared exception!
      try { 
        fPHeapMax0.constroi();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.FPHeapMax", e);
      }
  }

  /**
   * REQ-012: Calling max() on a zero-capacity heap should raise an ArrayIndexOutOfBoundsException.
   *
   * Given-When-Then:
   *  - Given: a heap with capacity 0
   *  - When: max() is invoked
   *  - Then: ArrayIndexOutOfBoundsException is thrown
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
}