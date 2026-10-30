package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for ds.Lista.
 *
 * These tests exercise basic empty/non-empty behavior (construction and single insertion)
 * and include descriptive failure messages, minimal Given-When-Then comments and a test category.
 *
 * Traceability: REQ-DS-1448 (basic list behavior)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given a newly created list and a single element,
   * When the element is inserted and the list is printed,
   * Then the list should report as non-empty.
   *
   * Traceability: REQ-DS-1448-A
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      lista0.imprime();
      assertFalse(lista0.vazia());
  }

  /**
   * Given a newly created list,
   * When its emptiness is queried,
   * Then it should be empty.
   *
   * Traceability: REQ-DS-1448-B
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Given a newly created list and a single element,
   * When the element is inserted,
   * Then the list should report as non-empty.
   *
   * Traceability: REQ-DS-1448-C
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}