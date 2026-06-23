package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.imprime();
      assertEquals("ultimo should be 0", 0, lista0.ultimo);
      assertEquals("pos should be -1", -1, lista0.pos);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue("List should be empty", boolean0);
      assertEquals("pos should be -1", -1, lista0.pos);
      assertEquals("primeiro should be 0", 0, lista0.primeiro);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("7aCMFv6z.g!o)");
      boolean boolean0 = lista0.vazia();
      assertEquals("ultimo should be 1", 1, lista0.ultimo);
      assertFalse("List should not be empty", boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lista lista0 = new Lista();
      Object[] objectArray0 = new Object[1];
      lista0.item = objectArray0;
      lista0.insere("tVv!\"! i$6{(BRb_EA");
      try { 
        lista0.insere(objectArray0[0]);
        fail("Expecting exception: Exception when inserting into full list");
      
      } catch(Exception e) {
         assertEquals("Erro: A lista esta cheia", e.getMessage());
         verifyException("ds.Lista", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("tVv!\"! i$6{(BRb_EA");
      lista0.imprime();
      assertEquals("ultimo should be 1", 1, lista0.ultimo);
  }
}