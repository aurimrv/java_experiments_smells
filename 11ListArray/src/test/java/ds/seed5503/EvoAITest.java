package ds.seed5503;

import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.*;

/**
 * Requirement-linked tests for ds.Lista (REQ-LISTA-001).
 *
 * These tests exercise basic empty / insert / overflow behaviour.
 * Each test follows a Given-When-Then structure in comments and
 * provides descriptive assertion messages while preserving the
 * original oracle expectations.
 */
interface RequirementTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(RequirementTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      lista0.imprime();
      assertEquals(1, lista0.ultimo);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
      assertEquals((-1), lista0.pos);
      assertEquals(0, lista0.ultimo);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      boolean boolean0 = lista0.vazia();
      assertEquals(1, lista0.ultimo);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      Object[] objectArray0 = new Object[2];
      lista0.item = objectArray0;
      lista0.insere(object0);
      try { 
        lista0.insere(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A lista esta cheia
         //
         verifyException("ds.Lista", e);
      }
  }
}