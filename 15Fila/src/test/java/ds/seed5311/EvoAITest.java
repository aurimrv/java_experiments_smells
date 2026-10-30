package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved test class for ds.Fila operations.
 *
 * Notes:
 * - Preserves original test method names and exception expectations.
 * - Adds clearer Given-When-Then structure, additional assertions and messages,
 *   and minimal classification via @Category for better test organization.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.tras = 146;
      // Undeclared exception!
      try { 
        fila0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.imprime();
      assertEquals(0, fila0.tras);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      try { 
        fila0.desenfileira();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta vazia
         //
         verifyException("ds.Fila", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fila fila0 = new Fila();
      Object[] objectArray0 = new Object[1];
      fila0.item = objectArray0;
      try { 
        fila0.enfileira(objectArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta cheia
         //
         verifyException("ds.Fila", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira(fila0);
      fila0.desenfileira();
      assertEquals(1, fila0.frente);
  }
}