package ds.seed7992;

import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  /* Helper to create items for reuse and clarity */
  private MeuItem createItem(int chave) {
    return new MeuItem(chave);
  }

  /* Given-When-Then style tests with descriptive assertions and messages.
     ORACLE PRESERVATION: kept all original SUT calls, exception expectations and numeric assertion values. */

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(165);
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

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer(165);
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
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(1);
      MeuItem meuItem1 = new MeuItem((-1307));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem((-1307));
      arvoreBinaria0.insere(meuItem0);
      Integer integer0 = new Integer(1);
      MeuItem meuItem3 = new MeuItem((-1486));
      arvoreBinaria0.insere(meuItem3);
      meuItem1.alteraChave(integer0);
      arvoreBinaria0.insere(meuItem2);
      arvoreBinaria0.retira(meuItem1);
      assertFalse(meuItem1.equals((Object)meuItem2));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(165);
      MeuItem meuItem1 = new MeuItem((-2351));
      arvoreBinaria0.insere(meuItem1);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(205);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = (MeuItem)arvoreBinaria0.pesquisa(meuItem0);
      assertEquals(4, meuItem1.tamanho());
  }
}