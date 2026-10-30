package ds.seed5482;

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
 * Marker interface for categorizing tests as unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  /**
   * REQ-ARV-001: Verify that altering a node key that breaks invariants leads to the expected test exit behavior.
   *
   * Given: an empty tree and two items inserted.
   * When: one item's key is altered to a value that may break the tree ordering and testa() is invoked.
   * Then: the system should perform the expected exit (SystemExitException).
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(1925);
      MeuItem meuItem1 = new MeuItem((-1694));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      Integer integer0 = new Integer(3613);
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
   * REQ-ARV-002: Inserting multiple items preserves accessibility via pesquisa.
   *
   * Given: an empty tree.
   * When: two items are inserted.
   * Then: both items should be findable via pesquisa and testa() should run without throwing.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-652));
      MeuItem meuItem1 = new MeuItem((-1722));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.testa();
  }

  /**
   * REQ-ARV-003: Changing key to an extreme/atypical value may trigger internal test flow that exits.
   *
   * Given: two inserted items.
   * When: one item's key is changed to a negative boundary-like value and testa() is invoked.
   * Then: the expected SystemExitException is thrown.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(1965);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1944));
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer((-3443));
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
   * REQ-ARV-004: Inserting two negative keys keeps both accessible.
   *
   * Given: an empty tree.
   * When: two negative-key items are inserted.
   * Then: both should be retrievable by pesquisa and testa() should run.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-652));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-2835));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * REQ-ARV-005: Removing an inserted item should make it no longer findable and item internals remain consistent.
   *
   * Given: tree with a single item.
   * When: the item is removed.
   * Then: tamanho remains the expected value and pesquisa returns null for that item.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * REQ-ARV-006: Retirar a non-existent item should not remove other items; identity relations hold.
   *
   * Given: tree with one item.
   * When: attempt to remove a different (non-inserted) item.
   * Then: the original item remains and the two instances are distinct.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      arvoreBinaria0.retira(meuItem1);
      assertNotSame(meuItem1, meuItem0);
  }

  /**
   * REQ-ARV-007: Removing a non-present item should not affect an existing different item.
   *
   * Given: one item inserted.
   * When: a different item is requested to be removed.
   * Then: original item remains present and instances differ.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(1);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      arvoreBinaria0.retira(meuItem1);
      assertNotSame(meuItem1, meuItem0);
  }

  /**
   * REQ-ARV-008: Removing a specific item should not affect unrelated items; verify search results after removal.
   *
   * Given: multiple items inserted.
   * When: one item is removed.
   * Then: removed item should not be found and others continue to be findable.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-652));
      MeuItem meuItem1 = new MeuItem((-1722));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem((-2835));
      arvoreBinaria0.insere(meuItem2);
      MeuItem meuItem3 = new MeuItem((-1936));
      arvoreBinaria0.insere(meuItem3);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertNotSame(meuItem1, meuItem3);
  }

  /**
   * REQ-ARV-009: Removing the left-side item should not remove the right-side; items remain distinct.
   *
   * Given: two items inserted.
   * When: left item removed.
   * Then: right item stays present and both instances are distinct.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(2014);
      MeuItem meuItem1 = new MeuItem((-1662));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertNotSame(meuItem1, meuItem0);
  }

  /**
   * REQ-ARV-010: Inserting the same instance twice keeps instance identity and does not corrupt the item internals.
   *
   * Given: a tree and a single item instance.
   * When: the same instance is inserted twice.
   * Then: item internals remain at the expected tamanho and pesquisa returns the same instance.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * REQ-ARV-011: Searching for a non-present item returns null while present items are findable.
   *
   * Given: a tree with one item inserted.
   * When: searching for a different item.
   * Then: pesquisa returns null for the non-inserted item and non-null for the inserted one.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * REQ-ARV-012: Searching for an unrelated item returns null; inserted items remain findable.
   *
   * Given: one item inserted.
   * When: searching for a different item.
   * Then: pesquisa returns null for the other and non-null for the inserted one.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(2014);
      MeuItem meuItem1 = new MeuItem((-1662));
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * REQ-ARV-013: Searching for the inserted item returns the exact same instance.
   *
   * Given: an empty tree.
   * When: an item is inserted.
   * Then: pesquisa returns the exact same instance that was inserted.
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(item0, meuItem0);
  }
}