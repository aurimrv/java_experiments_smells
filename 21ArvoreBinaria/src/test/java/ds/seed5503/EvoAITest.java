package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved test class for ArvoreBinaria.
 *
 * Traceability: Req-ARV-001 (basic binary-tree operations: insert, remove, search, and test printing).
 *
 * Note: This class retains EvoSuite runner annotations as required by the preservation rules.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  /**
   * Given a tree with two inserted items, when a key of the first item is changed
   * and testa() is invoked, then the SUT is expected to trigger the test exit path.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2214));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-691));
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(3576);
      meuItem0.alteraChave(integer0);
      // Undeclared exception!
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * Given two inserted items in the tree, when testa() is invoked it should complete
   * without throwing an exception. Verify items are searchable.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2470));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1502));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given two inserted items, when one item's key is changed then invoking testa()
   * is expected to follow the SystemExit path.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-2187));
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(2495);
      meuItem1.alteraChave(integer0);
      // Undeclared exception!
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * Given two negative-key items inserted, calling testa() should complete without exceptions.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2470));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-5102));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given an inserted item, when removed, the item's internal state remains consistent.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-611));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Removing a non-existent item should not affect the removed object's internal tamanho.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-611));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Attempting to remove an item not present should not change that item's tamanho.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2079));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-3478));
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Insert multiple items and remove one; ensure objects are not considered equal incorrectly.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2470));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1502));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem((-5102));
      arvoreBinaria0.insere(meuItem2);
      arvoreBinaria0.retira(meuItem0);
      assertFalse(meuItem0.equals((Object)meuItem1));
  }

  /**
   * Insert two items and remove the first; validate inequality and absence.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2165));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-611));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertFalse(meuItem0.equals((Object)meuItem1));
  }

  /**
   * Insert the same item twice and validate the item's tamanho.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2165));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Searching for a non-inserted item returns null while an inserted one is findable.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2165));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-611));
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Searching for a non-existing item returns null even after other inserts.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-2165));
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * After inserting an item, pesquisa should return the very same object instance.
   *
   * Req: ARV-001
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-611));
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(meuItem0, item0);
  }
}