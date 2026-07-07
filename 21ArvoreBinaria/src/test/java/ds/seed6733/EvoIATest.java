package ds.seed6733;

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

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends ArvoreBinaria_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-875));
      arvoreBinaria0.insere(meuItem0);
      // Act & Assert
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      // Act & Assert
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-858));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-874));
      arvoreBinaria0.insere(meuItem0);
      // Act
      arvoreBinaria0.retira(meuItem0);
      // Assert
      assertFalse(meuItem0.equals((Object) new MeuItem(0)));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(1);
      int size = meuItem0.tamanho();
      assertEquals(4, size);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MeuItem meuItem1 = new MeuItem(0);
      int size = meuItem1.tamanho();
      assertEquals(4, size);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MeuItem meuItem1 = new MeuItem((-453));
      MeuItem meuItem0 = new MeuItem(1);
      assertFalse(meuItem1.equals((Object)meuItem0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-956));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      MeuItem meuItem2 = new MeuItem(1149);
      assertFalse(meuItem0.equals((Object)meuItem2));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-858));
      arvoreBinaria0.insere(meuItem0);
      // Act
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-858));
      arvoreBinaria0.insere(meuItem0);
      // Act
      arvoreBinaria0.testa();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem((-858));
      int size = meuItem0.tamanho();
      assertEquals(4, size);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem1 = new MeuItem(18);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem1 = new MeuItem((-453));
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-858));
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(meuItem0, item0);
  }
}