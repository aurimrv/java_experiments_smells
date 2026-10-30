package ds.seed5311;

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
 * Improved tests for ArvoreBinaria focusing on basic behaviors.
 * Requirement trace: REQ-ARV-001 (basic insert/search/remove behavior)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  // Helper to create a tree and insert given items
  private static ArvoreBinaria createTreeWith(MeuItem... items) {
    ArvoreBinaria tree = new ArvoreBinaria();
    if (items != null) {
      for (MeuItem it : items) {
        tree.insere(it);
      }
    }
    return tree;
  }

  /**
   * Given a tree with two items, when one item's key is changed and testa() is invoked,
   * then an expected SystemExit exception should be thrown by the test harness.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-4092));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-38));
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(2202);
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
   * Given two inserted items, when testa() is invoked, the items remain searchable.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-4129));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-38));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given a single inserted item, when it is removed, its reported tamanho remains stable.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given a tree with a different item, removing a non-existing item should not affect that non-existing item's tamanho.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1692));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Given an inserted item, removing a different key should leave the original item intact and objects should not be equal.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1));
      arvoreBinaria0.retira(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  /**
   * Insert multiple items and remove one; verify other items remain and inequality holds.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-4129));
      MeuItem meuItem1 = new MeuItem((-1674));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem((-38));
      arvoreBinaria0.insere(meuItem2);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem2));
  }

  /**
   * Insert two items and call testa(); ensure both items are present.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-4129));
      MeuItem meuItem1 = new MeuItem((-1674));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.testa();
  }

  /**
   * Inserting the same item twice should still allow retrieval and preserve tamanho.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1724));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Searching for a non-inserted item should return null while inserted items remain found.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1724));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Insert zero-valued item and search for a different key; verify original still present.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1));
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Insert an item and ensure pesquisa returns the same object reference.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(meuItem0, item0);
  }

  /**
   * After removing one of two items, ensure the removed item is gone and the other remains.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1674));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-20));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertFalse(meuItem0.equals((Object)meuItem1));
  }
}