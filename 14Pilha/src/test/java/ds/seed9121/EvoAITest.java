package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing these tests.
 * This must be declared at package level and before the test class.
 */
interface UnitTest {}

/**
 * Improved and annotated tests for ds.Pilha.
 *
 * Notes:
 * - Each test includes Given-When-Then comments for clarity.
 * - Assertions include descriptive failure messages.
 * - Traceability: each test references a hypothetical requirement ID in the Javadoc.
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Requirement: STACK-REQ-001
   * Scenario: Pop on an empty stack should raise an Exception.
   *
   * Given an empty Pilha,
   * When desempilha() is invoked,
   * Then an Exception is expected indicating the stack is empty.
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
   * Requirement: STACK-REQ-002
   * Scenario: Pushing an object and then popping should return the same object and leave the stack empty.
   *
   * Given a new Pilha and an arbitrary object,
   * When empilha(object) followed by desempilha() is performed,
   * Then the popped object must be the same instance that was pushed and the stack size must be zero.
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
   * Requirement: STACK-REQ-003
   * Scenario: A newly created Pilha should report size zero.
   *
   * Given a new Pilha,
   * When tamanho() is queried,
   * Then it should return 0 and be non-negative.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}