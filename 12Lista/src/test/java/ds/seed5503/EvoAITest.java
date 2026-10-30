package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Lista class.
 *
 * Traceability: REQ-Lista-001 (basic list operations)
 *
 * These tests follow a Given-When-Then structure and include descriptive assertion messages.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  private Lista sut;

  @Before
  public void setUp() {
    // Given: a fresh Lista instance for each test
    sut = new Lista();
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
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
      Object object0 = new Object();
      lista0.insere(object0);
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}