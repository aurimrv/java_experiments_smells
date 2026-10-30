package ds.seed6733;

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
 * Improved test class for FPHeapMax behaviors.
 *
 * Note: This class preserves the original test method names and their exceptional
 * oracles while improving readability, adding Given-When-Then comments, and
 * strengthening assertions that do not introduce new SUT calls beyond the original.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(767);
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

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      fPHeapMax0.imprime();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(767);
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(2632);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(767);
      itemArray0[2] = (Item) meuItem1;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.insere(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Given: a heap instance
      FPHeapMax fPHeapMax0 = new FPHeapMax(34);

      // When / Then: increasing a key with a null value should raise a checked/declared Exception
      try {
        fPHeapMax0.aumentaChave(2, (Object) null);
        fail("Expecting exception: Exception");
      } catch (Exception e) {
        // preserve original oracle (error message originates from FPHeapMax)
        verifyException("ds.FPHeapMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(767);
      MeuItem meuItem0 = new MeuItem(767);
      Item[] itemArray0 = new Item[2];
      itemArray0[1] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray1 = new Item[8];
      itemArray1[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1004);
      itemArray1[6] = (Item) meuItem1;
      itemArray1[7] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray1);
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

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(767);
      MeuItem meuItem0 = new MeuItem(767);
      Item[] itemArray0 = new Item[2];
      itemArray0[1] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      Item[] itemArray1 = new Item[8];
      itemArray1[2] = (Item) meuItem0;
      itemArray1[5] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1004);
      itemArray1[6] = (Item) meuItem1;
      itemArray1[7] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray1);
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

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(739);
      MeuItem meuItem0 = new MeuItem(739);
      Item[] itemArray0 = new Item[2];
      itemArray0[1] = (Item) meuItem0;
      fPHeapMax0.copia(itemArray0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.insere(meuItem0);
      fPHeapMax0.constroi();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given: a small heap and one item to insert
      FPHeapMax fPHeapMax0 = new FPHeapMax(4);
      MeuItem meuItem0 = new MeuItem(4);

      // When: insert then remove the maximum
      fPHeapMax0.insere(meuItem0);
      Item item0 = fPHeapMax0.retiraMax();

      // Then: the removed item must be the same object inserted
      assertSame("retiraMax should return the exact inserted item", item0, meuItem0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FPHeapMax fPHeapMax0 = new FPHeapMax(1);
      Item item0 = fPHeapMax0.max();
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
}