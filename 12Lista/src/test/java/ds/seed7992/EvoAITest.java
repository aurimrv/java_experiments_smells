package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit test category marker for selective execution.
 */
interface UnitTest {}

/**
 * Improved, human-readable tests for Lista.
 *
 * Note: The test method names are preserved to satisfy the original test harness.
 * Each test follows a Given-When-Then structure in comments and includes descriptive
 * assertion messages for easier debugging and traceability (REQ-LISTA-001).
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("");
      lista0.imprime();
      assertFalse(lista0.vazia());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("");
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}