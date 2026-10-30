package ds.seed9006;

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
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Test: insert a single element and then print the list.
   * Requirement trace: REQ-Lista-001
   *
   * Given an empty Lista
   * When an object is inserted and imprime() is invoked
   * Then the list should not be empty
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
   * Test: a newly constructed list is empty.
   * Requirement trace: REQ-Lista-002
   *
   * Given a new Lista
   * When vazia() is invoked
   * Then it should return true
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Test: inserting an element makes the list non-empty.
   * Requirement trace: REQ-Lista-003
   *
   * Given an empty Lista
   * When an object is inserted
   * Then vazia() should return false
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