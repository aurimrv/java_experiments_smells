package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Requirement: LIST-REQ-001
   * Scenario: Attempting to print a list with an invalid 'primeiro' index should raise ArrayIndexOutOfBoundsException.
   *
   * Given an empty Lista instance with an invalid primeiro index,
   * When imprime() is invoked,
   * Then an ArrayIndexOutOfBoundsException is thrown and the internal indices remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.primeiro = (-1);
      // Undeclared exception!
      try { 
        lista0.imprime();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("ds.Lista", e);
      }
  }

  /**
   * Requirement: LIST-REQ-002
   * Scenario: Newly constructed Lista should have expected default positions.
   *
   * Given a new Lista,
   * When no operations have been performed,
   * Then pos is -1 and ultimo is 0.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.imprime();
      assertEquals((-1), lista0.pos);
      assertEquals(0, lista0.ultimo);
  }

  /**
   * Requirement: LIST-REQ-003
   * Scenario: Mutating indices and verifying vazia() behavior.
   *
   * Given a Lista where indices are set to specific values,
   * When vazia() is invoked,
   * Then it reports true if logical conditions represent an empty list.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      assertEquals(0, lista0.primeiro);
      
      lista0.primeiro = (-1);
      lista0.ultimo = 0;
      lista0.ultimo = 179;
      lista0.primeiro = 179;
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Requirement: LIST-REQ-004
   * Scenario: Inserting into a full underlying array should raise an Exception indicating the list is full.
   *
   * Given a Lista with a small backing array and ultimo set to indicate fullness,
   * When insere() is invoked,
   * Then an Exception is thrown with the expected origin.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lista lista0 = new Lista();
      Object[] objectArray0 = new Object[2];
      lista0.item = objectArray0;
      lista0.ultimo = 0;
      lista0.ultimo = 179;
      try { 
        lista0.insere(lista0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A lista esta cheia
         //
         verifyException("ds.Lista", e);
      }
  }

  /**
   * Requirement: LIST-REQ-005
   * Scenario: Inserting a single element into an empty list updates ultimo and vazia().
   *
   * Given an empty Lista,
   * When insere() is called with the list itself as an element,
   * Then ultimo increments to 1 and vazia() becomes false.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere(lista0);
      boolean boolean0 = lista0.vazia();
      assertEquals(1, lista0.ultimo);
      assertFalse(boolean0);
  }
}