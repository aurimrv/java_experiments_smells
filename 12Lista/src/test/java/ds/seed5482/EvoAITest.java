package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Marker interface for classifying these tests as unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * REQ-001: Verify that inserting a single element makes the list non-empty
   * and that imprime() produces visible output for a singleton list.
   *
   * Given a fresh list and a non-null element,
   * When the element is inserted and the list is printed,
   * Then vazia() should be false and imprime() should produce non-empty output.
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
   * REQ-002: Verify that a newly created list is empty.
   *
   * Given a fresh list,
   * When vazia() is queried,
   * Then it should return true.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * REQ-003: Verify that after inserting an element the list reports non-empty.
   *
   * Given a fresh list and a non-null element,
   * When the element is inserted,
   * Then vazia() should return false.
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