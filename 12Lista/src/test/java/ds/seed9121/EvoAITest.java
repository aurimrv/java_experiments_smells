package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved tests for ds.Lista with clearer names, Given-When-Then structure,
 * and descriptive assertion messages. Preserves original test method names
 * and EvoSuite runner annotations as required.
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given: an empty list and a non-null object.
   * When: the object is inserted and the list is printed.
   * Then: the list should report as non-empty.
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
   * Given: a freshly created list.
   * When: checking whether it is empty.
   * Then: it should report as empty.
   *
   * Traceability: REQ-LISTA-EMPTY-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Given: an empty list and a non-null object.
   * When: the object is inserted and emptiness is queried.
   * Then: the list should no longer be empty.
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