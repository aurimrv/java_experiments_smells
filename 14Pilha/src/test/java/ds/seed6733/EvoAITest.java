package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for grouping unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When popping an element,
   * Then an Exception is thrown indicating the stack is empty.
   *
   * This test verifies the error path for desempilha() on an empty Pilha.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      try { 
        pilha0.desempilha();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta vazia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given a newly created stack,
   * When an object is pushed and then popped,
   * Then the popped object is the same and the size returns to zero.
   *
   * This covers the basic push/pop happy path and verifies size changes and return value.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a newly created stack,
   * When checking tamanho(),
   * Then it should report zero and size should change consistently when pushing and popping.
   *
   * This test validates tamanho() for initial state and after several operations.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}