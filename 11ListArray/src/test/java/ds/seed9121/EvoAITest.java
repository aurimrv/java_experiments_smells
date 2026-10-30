package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for ds.Lista focusing on basic behaviors: empty state, insertion, and full-list exception.
 * Requirement traceability: REQ-LISTA-001
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
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
    // Given: a newly constructed list
    Lista lista0 = new Lista();

    // When: querying initial properties (no actions performed)
    boolean boolean0 = lista0.vazia();

    // Then: initial indices and empty-state are as expected
    assertEquals("primeiro should start at index 0 for a new list", 0, lista0.primeiro);
    assertTrue("A newly created list should report as empty", boolean0);
    assertEquals("pos should be -1 for an empty list", (-1), lista0.pos);
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
      lista0.insere("@");
      Object[] objectArray0 = new Object[4];
      lista0.item = objectArray0;
      lista0.insere((Object) null);
      lista0.insere(objectArray0[1]);
      try { 
        lista0.insere((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A lista esta cheia
         //
         verifyException("ds.Lista", e);
      }
  }
}