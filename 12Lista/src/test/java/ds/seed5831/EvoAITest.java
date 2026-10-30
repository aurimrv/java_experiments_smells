package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Test: insert an element into an initially empty list and verify list state.
   *
   * Requirement: REQ-LIST-001 - A list must be empty on creation and non-empty after inserting an element.
   *
   * Given an empty list, when an element is inserted and the list is printed,
   * then the list should report non-empty.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("g_S");
      lista0.imprime();
      assertFalse(lista0.vazia());
  }

  /**
   * Test: a newly created list reports empty.
   *
   * Requirement: REQ-LIST-002 - Querying an empty list should report empty and remain consistent.
   *
   * Given a freshly instantiated list, when checking emptiness and printing,
   * then it should remain empty.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Test: inserting an element makes the list non-empty.
   *
   * Requirement: REQ-LIST-003 - After insertion the list is no longer empty and remains so across checks.
   *
   * Given an empty list, when inserting an element,
   * then vazia() should return false.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("g_S");
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}