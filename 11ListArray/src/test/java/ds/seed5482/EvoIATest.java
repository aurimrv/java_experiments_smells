package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      Lista lista0 = new Lista();
      lista0.primeiro = (-411);
      try {
        lista0.imprime();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertEquals("-411", e.getMessage());
         verifyException("ds.Lista", e);
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      Lista lista0 = new Lista();
      lista0.imprime();
      assertEquals("ultimo should be 0", 0, lista0.ultimo);
      assertEquals("pos should be -1", -1, lista0.pos);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue("List should be empty", boolean0);
      assertEquals("ultimo should be 0", 0, lista0.ultimo);
      assertEquals("pos should be -1", -1, lista0.pos);
  }



  @Test(timeout = 4000)
  public void test4() throws Throwable {
      Lista lista0 = new Lista();
      lista0.ultimo = 1;
      lista0.ultimo = 1603;
      try {
        lista0.insere((Object) null);
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         assertEquals("Erro: A lista esta cheia", e.getMessage());
         verifyException("ds.Lista", e);
      }
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
      Lista lista0 = new Lista();
      lista0.insere((Object) null);
      assertEquals("ultimo should be 1 after insertion", 1, lista0.ultimo);
  }

}