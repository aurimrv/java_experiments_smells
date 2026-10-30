package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for ds.Fila (improved from generated baseline).
 * Requirement: Fila-REQ-001 - basic enqueue/dequeue and error handling.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  private static final int FRONT_VALUE = 588;
  private static final int NEGATIVE_TRAS = -1;
  private static final String FULL_MESSAGE = "Erro: A fila esta cheia";
  private static final String EMPTY_MESSAGE = "Erro: A fila esta vazia";

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.frente = 588;
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
      fila0.tras = (-1);
      try { 
        fila0.enfileira("Erro: A fila esta vazia");
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
      fila0.enfileira((Object) null);
      fila0.desenfileira();
      assertEquals(1, fila0.tras);
  }
}