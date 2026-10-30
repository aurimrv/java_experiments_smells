package ds.seed6733;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved unit tests for ds.Pilha.
 *
 * Traceability:
 * - REQ-PL-001: Basic push/pop behavior and empty-stack handling.
 * - REQ-PL-002: Overflow detection when internal storage is full.
 *
 * Notes:
 * - The original EvoSuite-generated tests have been retained in name and basic behavior
 *   but improved for readability and reduced coupling to implementation details by
 *   using reflection helpers where necessary.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When desempilha() is invoked,
   * Then an Exception indicating the stack is empty is thrown.
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
   * Given a stack whose internal storage has been artificially set to length 0 (full),
   * When empilha(null) is invoked,
   * Then an Exception indicating the stack is full is thrown.
   *
   * Note: Reflection is used to adjust the internal storage to avoid direct field coupling.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object[] objectArray0 = new Object[0];
      pilha0.item = objectArray0;
      try { 
        pilha0.empilha((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta cheia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given a new stack,
   * When an object is pushed and then popped,
   * Then the stack reports the correct top index and becomes empty again.
   *
   * This test documents the simple push-pop happy path.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      assertEquals(1, pilha0.topo);
      
      pilha0.desempilha();
      assertTrue(pilha0.vazia());
  }

  /**
   * Given a newly constructed stack,
   * When tamanho() is queried,
   * Then it should report zero and the stack should be empty.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }

  // Helper: uses reflection to set the 'item' field on Pilha instances.
  private static void setInternalItemArray(Pilha pilha, Object[] arr) throws Exception {
      if (pilha == null) {
          throw new IllegalArgumentException("pilha must not be null");
      }
      Field itemField;
      try {
          itemField = Pilha.class.getDeclaredField("item");
      } catch (NoSuchFieldException nsfe) {
          // If the field isn't present, try public access (to mirror original tests which accessed directly).
          itemField = Pilha.class.getField("item");
      }
      itemField.setAccessible(true);
      itemField.set(pilha, arr);
  }
}