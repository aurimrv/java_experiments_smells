package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Ordenacao utilities.
 *
 * These tests use explicit Given-When-Then comments, richer assertions and
 * category metadata to improve diagnosability while preserving original
 * oracles and exception expectations from the generated suite.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 2321);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.heapsort(itemArray0, 1);
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(583);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.shellsort(itemArray0, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(1996);
      MeuItem meuItem1 = new MeuItem((-1));
      Item[] itemArray0 = new Item[8];
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.shellsort(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.shellsort(itemArray0, 1);
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(869);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[3] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 2231);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.insercao(itemArray0, 0);
      assertEquals(1, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(99);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-2485));
      itemArray0[3] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.selecao(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem((-4492));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.selecao(itemArray0, 4);
      assertEquals(9, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-237));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 5);
      assertEquals(6, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-237));
      itemArray0[1] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1265);
      itemArray0[5] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.quicksort(itemArray0, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem0 = new MeuItem(441);
      itemArray0[0] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.quicksort(itemArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(0);
      Item[] itemArray0 = new Item[7];
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 0);
      assertEquals(7, itemArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }

  // Helper: count non-null entries in an Item[] array.
  private static int countNonNull(Item[] arr) {
      if (arr == null) return 0;
      int c = 0;
      for (Item it : arr) {
          if (it != null) c++;
      }
      return c;
  }
}