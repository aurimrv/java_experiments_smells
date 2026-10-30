package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests to allow selective execution and classification.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Lista with clearer assertions, messages, and Given-When-Then structure.
 *
 * Traceability: REQ-Lista-001 - Basic list operations (construction, emptiness, insertion, printing).
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given: a new Lista instance
   * When: an empty string is inserted and the list is printed
   * Then: the list should no longer be empty
   *
   * Trace: REQ-Lista-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("");
      lista0.imprime();
      assertFalse(lista0.vazia());
  }

  /**
   * Given: a newly constructed Lista
   * When: checking whether it is empty
   * Then: vazia() should return true
   *
   * Trace: REQ-Lista-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Given: a new Lista
   * When: inserting an empty string
   * Then: vazia() should report the list as non-empty
   *
   * Trace: REQ-Lista-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("");
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}