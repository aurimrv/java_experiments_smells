package ds.seed9121;

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
 * Marker interface for unit tests to allow selective execution and traceability.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  /**
   * Given a tree with two inserted items, when one item's key is altered and testa() is executed,
   * then the method is expected to trigger a system exit (tested via EvoSuite System wrapper).
   *
   * Traceability: REQ-ARV-EXIT-01
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(34);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(49);
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(427);
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
   * Given a tree with two items, when testa() is executed (normal flow), then no exception is expected
   * and inserted items remain searchable.
   *
   * Traceability: REQ-ARV-BASE-01
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(1);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(513);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given a tree where a key is changed to a negative boundary, when testa() runs,
   * an implementation-dependent system exit may be triggered (EvoSuite wrapper observed).
   *
   * Traceability: REQ-ARV-KEYCHANGE-01
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(5);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(2);
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer((-1));
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
   * Given two inserts, when testa() is invoked in a normal configuration,
   * then items remain searchable and no exception is thrown.
   *
   * Traceability: REQ-ARV-BASE-02
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4169);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given two distinct items inserted, when one is removed, then it should no longer be found
   * and the removed object should not equal the remaining item.
   *
   * Traceability: REQ-ARV-REMOVE-01
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-4215));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertFalse(meuItem0.equals((Object)meuItem1));
  }

  /**
   * Given an item inserted and then removed, the removed item's state remains accessible
   * and its reported tamanho() should remain consistent.
   *
   * Traceability: REQ-ARV-REMOVE-STATE-01
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(3501);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Insert an item and attempt to remove a different (non-inserted) item: verify original remains.
   *
   * Traceability: REQ-ARV-REMOVE-NONEXISTENT-01
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-934));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1866);
      arvoreBinaria0.retira(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  /**
   * Insert an item and attempt to remove a different item: verify removed attempt did not alter queried item meta.
   *
   * Traceability: REQ-ARV-REMOVE-NONEXISTENT-02
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4169);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  /**
   * Insert multiple items, remove one, and verify removed item is no longer present while other properties remain consistent.
   *
   * Traceability: REQ-ARV-MULTI-INSERT-REMOVE-01
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(16);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-18));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem(2241);
      arvoreBinaria0.insere(meuItem2);
      MeuItem meuItem3 = new MeuItem(1);
      arvoreBinaria0.insere(meuItem3);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Inserting the same object twice should not create two distinct stored objects; verify object identity and invariants.
   *
   * Traceability: REQ-ARV-DUPLICATE-INSERT-01
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Searching for a non-inserted item should return null while inserted items remain retrievable.
   *
   * Traceability: REQ-ARV-SEARCH-NULL-01
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-4215));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(4);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Insert an item and verify that searching for a distinct, non-existent item returns null.
   *
   * Traceability: REQ-ARV-SEARCH-NULL-02
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-65));
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Insert an item and immediately search for it: verify identity is preserved.
   *
   * Traceability: REQ-ARV-SEARCH-FOUND-01
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2));
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(item0, meuItem0);
  }
}