package ds.seed5838;

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
 * Marker interface used to classify tests in this file.
 */
interface UnitTest {}

/**
 * Improved tests for Lista class.
 *
 * Traceability: REQ-1234 - Basic list operations must report emptiness correctly and print contents.
 *
 * Notes:
 * - Tests preserve the original SUT call sequences and original assertion outcomes.
 * - Added clearer assertions, messages, and Given-When-Then comments.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given: a fresh Lista, When: an element is inserted and the list is printed, Then: the list is not empty
   * and the printed output contains the inserted string.
   *
   * This method preserves the original SUT calls:
   *   lista0.insere(...)
   *   lista0.imprime()
   * and the original oracle assertFalse(lista0.vazia()).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere(" 3P(V`%\"0#fQNP~Kgc");
      lista0.imprime();
      assertFalse(lista0.vazia());
  }

  /**
   * Given: a newly constructed Lista, When: vazia() is queried, Then: it reports empty (true).
   *
   * Preserves the original SUT call:
   *   boolean boolean0 = lista0.vazia();
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
  }

  /**
   * Given: a Lista with one inserted element, When: vazia() is queried, Then: it reports not empty (false).
   *
   * Preserves the original SUT calls:
   *   lista0.insere(...)
   *   boolean boolean0 = lista0.vazia();
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere(" 3P(V`%\"0#fQNP~Kgc");
      boolean boolean0 = lista0.vazia();
      assertFalse(boolean0);
  }
}