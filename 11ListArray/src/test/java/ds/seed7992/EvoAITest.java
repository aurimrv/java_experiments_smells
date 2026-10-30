package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: a fresh Lista and an element to insert
      Lista lista0 = new Lista();
      Object object0 = new Object();

      // When: inserting the element and requesting a print (side-effect)
      lista0.insere(object0);
      lista0.imprime();

      // Then: internal 'ultimo' counter should reflect one inserted element
      // Note: assertion message added for clarity; expected value preserved.
      assertEquals("Expected 'ultimo' to be 1 after inserting a single element", 1, lista0.ultimo);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a newly constructed list
      Lista lista0 = new Lista();

      // When: we query emptiness
      boolean boolean0 = lista0.vazia();

      // Then: list should be empty, and internal indices should reflect initial state
      assertTrue("Newly created list should report as empty", boolean0);
      assertEquals("Default 'primeiro' index should be 0", 0, lista0.primeiro);
      assertEquals("Default 'pos' should be -1 indicating no current position", (-1), lista0.pos);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a fresh Lista (verify initial internal state)
      Lista lista0 = new Lista();
      assertEquals("Initial 'primeiro' should be 0 for a new list", 0, lista0.primeiro);
      
      // When: manipulating the internal index to simulate non-empty configuration
      lista0.primeiro = 1585;

      // Then: vazia() should report false because 'primeiro' is no longer the default
      boolean boolean0 = lista0.vazia();
      assertFalse("List should not be considered empty after changing 'primeiro' to a non-default value", boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a Lista with its internal storage set to a fixed-size array
      Lista lista0 = new Lista();
      Object[] objectArray0 = new Object[7];
      lista0.item = objectArray0;

      // When: fill the list to its capacity via successive inserts
      lista0.insere(objectArray0[3]);
      lista0.insere(objectArray0[0]);
      lista0.insere("");
      lista0.insere(objectArray0[2]);
      lista0.insere(objectArray0[1]);
      lista0.insere(objectArray0[0]);
      lista0.insere(objectArray0[3]);

      // Then: inserting beyond capacity should raise the expected exception
      try { 
        lista0.insere(objectArray0[1]);
        fail("Expected Exception when inserting into a full list, but no exception was thrown.");
      
      } catch(Exception e) {
         // Verify that the thrown exception originates from ds.Lista (preserves original verification)
         verifyException("ds.Lista", e);
      }
  }
}