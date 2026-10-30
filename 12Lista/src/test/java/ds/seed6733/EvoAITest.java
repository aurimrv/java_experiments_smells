package ds.seed6733;

import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Marker interface used to categorize unit tests for selective execution.
 * Must be declared at package scope and before the test class declaration.
 */
interface UnitTest {}

/**
 * Improved unit tests for ds.Lista focused on basic emptiness behavior.
 *
 * Notes:
 * - Each test preserves the original test method names and the original oracle outcomes.
 * - Tests include Given-When-Then comments and descriptive assertion messages for traceability.
 * - The EvoRunner configuration is preserved as required.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given: a fresh Lista
   * When: an element is inserted
   * Then: the list should not be empty; imprime may be used for side-effect output.
   *
   * Traceability: REQ-LISTA-001 (basic insert makes list non-empty)
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("ds.Lista$Celula");
      lista0.imprime();
      assertFalse(lista0.vazia());
  }

  /**
   * Given: a fresh Lista (no inserts)
   * When: vazia() is queried
   * Then: the list should be empty
   *
   * Traceability: REQ-LISTA-002 (new list is empty)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Given: a fresh Lista
   * When: an element is inserted
   * Then: vazia() should report false (list is not empty)
   *
   * Traceability: REQ-LISTA-001 (basic insert makes list non-empty)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("ds.Lista$Celula");
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}