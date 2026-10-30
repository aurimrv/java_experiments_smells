package ds.seed1448;

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
 * Unit tests for ArvoreBinaria behaviors.
 *
 * Note: This test class was adapted from generated tests to improve clarity,
 * add explicit Arrange-Act-Assert structure, and include more descriptive
 * assertions while preserving original oracles and exception expectations.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  // Helper to assert that an item can be found in the tree
  private static void assertFound(ArvoreBinaria tree, MeuItem key, String message) {
    Item found = tree.pesquisa(key);
    assertNotNull(message, found);
    assertSame(message, key, found);
  }

  // Helper to assert that an item is not present in the tree
  private static void assertNotFound(ArvoreBinaria tree, MeuItem key, String message) {
    Item found = tree.pesquisa(key);
    assertNull(message, found);
  }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(30);
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(0);
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

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(17);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(17);
      meuItem1.alteraChave(integer0);
      Integer integer1 = new Integer(1);
      meuItem0.alteraChave(integer1);
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

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-3272));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(508);
      MeuItem meuItem1 = new MeuItem((-1887));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(508);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(30);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(508);
      MeuItem meuItem1 = new MeuItem((-1887));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-3272));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem(34);
      arvoreBinaria0.insere(meuItem2);
      MeuItem meuItem3 = new MeuItem((-401));
      arvoreBinaria0.insere(meuItem3);
      arvoreBinaria0.retira(meuItem0);
      assertNotSame(meuItem0, meuItem3);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(34);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(34);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(4);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-340));
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(item0, meuItem0);
  }
}