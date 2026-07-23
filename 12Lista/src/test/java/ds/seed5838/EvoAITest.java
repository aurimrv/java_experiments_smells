package ds.seed5838;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import ds.Lista;

import static org.junit.Assert.*;

/**
 * Marker interface used to categorize tests.
 */
interface UnitTest {}

/**
 * Improved and clarified tests for Lista.
 *
 * Notes:
 * - Tests provide descriptive failure messages.
 * - Each test documents Given-When-Then steps via comments and verifies multiple related properties.
 * - Some error cases (null insert) are exercised while being permissive about exact exception type.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * REQ-001: Verify that inserting a typical non-empty string makes the list non-empty,
   * and that imprime() can be invoked without throwing.
   *
   * Given a fresh Lista,
   * When an element with a typical non-empty string value is inserted and imprime() is invoked,
   * Then the list should report not empty and subsequent calls should be consistent.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      assertTrue("Precondition: newly created list should be empty", lista0.vazia());

      // When
      final String value = " 3P(V`%\"0#fQNP~Kgc";
      lista0.insere(value);

      // Then: imprime() must not throw and list must report non-empty consistently
      try {
          lista0.imprime(); // call should succeed for a non-empty list
      } catch (Exception e) {
          fail("imprime() should not throw when called on a non-empty list: " + e);
      }

      assertFalse("After insertion of a non-empty string the list should not be empty", lista0.vazia());
      // Check idempotence / consistency: repeated calls must agree
      assertFalse("vazia() should consistently report non-empty after insertion", lista0.vazia());
  }

  /**
   * REQ-002: Verify the initial state of a newly created Lista and that printing an empty list is safe.
   *
   * Given a fresh Lista,
   * When imprime() is invoked on an empty list,
   * Then the list should remain empty and no exceptions should be thrown.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // Then: newly created list must be empty
      assertTrue("Newly created list must be empty", lista0.vazia());

      // When: printing an empty list should not throw and should not change emptiness
      try {
          lista0.imprime();
      } catch (Exception e) {
          fail("imprime() should not throw when called on an empty list: " + e);
      }

      // Verify postcondition: still empty
      assertTrue("List should remain empty after imprime() on an empty list", lista0.vazia());
  }

  /**
   * REQ-003: Exercise insertions of different kinds of string values and verify list state.
   *
   * Given a fresh Lista,
   * When non-empty and empty strings are inserted and a null insertion is attempted,
   * Then the list should be non-empty after successful insertions, and null insertion should either be rejected
   * with a clear exception or handled without making the list empty.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      assertTrue("Precondition: list is initially empty", lista0.vazia());

      // When: insert a typical non-empty string
      final String nonEmpty = " 3P(V`%\"0#fQNP~Kgc";
      lista0.insere(nonEmpty);

      // Then: list must be non-empty
      assertFalse("List must be non-empty after inserting a non-empty string", lista0.vazia());

      // When: insert an empty string value (boundary case)
      lista0.insere("");
      // Then: inserting an empty string should not make the list empty
      assertFalse("List should remain non-empty after inserting an empty string", lista0.vazia());

      // When: attempt to insert null (error/edge case)
      boolean nullRejected = false;
      try {
          lista0.insere(null);
      } catch (NullPointerException | IllegalArgumentException expected) {
          // Acceptable behavior: the implementation may reject null with NPE or IAE
          nullRejected = true;
      } catch (RuntimeException other) {
          // Any other runtime exception is also considered a rejection, but record it for debug
          nullRejected = true;
      }

      // Then: either null insertion was rejected, or list remains non-empty (i.e., insertion is a no-op or handled)
      assertTrue("Null insertion should either be rejected (exception) or handled without making the list empty",
                 nullRejected || !lista0.vazia());
  }
}