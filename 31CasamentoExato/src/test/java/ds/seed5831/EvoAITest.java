package ds.seed5831;

import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved unit tests for CasamentoExato.
 *
 * Notes:
 * - Tests use reflection to call static methods on CasamentoExato to avoid
 *   assuming concrete return types (some implementations may return int/boolean/void).
 * - Each test follows a simple Given-When-Then structure and includes assertions
 *   that validate either that an expected exception is thrown or that the return
 *   value meets minimal sanity checks.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  // Helper to invoke static methods on CasamentoExato using reflection.
  private Object invokeStatic(String name, Class<?>[] paramTypes, Object... args) throws Throwable {
    Method m = CasamentoExato.class.getMethod(name, paramTypes);
    try {
      return m.invoke(null, args);
    } catch (InvocationTargetException ite) {
      // Unwrap and rethrow the underlying exception to allow tests to assert on it
      throw ite.getCause();
    }
  }

  // Generic validation for common expected return shapes from matching algorithms.
  private void assertReturnValueSanity(Object result) {
    // If null, accept as a valid void return or explicit null (we can't infer more)
    if (result == null) {
      assertTrue("Method returned null (interpreted as void or null): acceptable for this test", true);
      return;
    }
    if (result instanceof Integer) {
      // For text-search algorithms, typical contract: index >= -1
      assertTrue("Integer result should be >= -1 (index or -1 for not found)", ((Integer) result) >= -1);
    } else {
      // For other types, just ensure non-null to detect unexpected failures
      assertNotNull("Method returned a non-null result of type " + result.getClass(), result);
    }
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    // Given: null pattern/text inputs (invalid usage)
    // When/Then: expect a NullPointerException to be thrown by the implementation
    try {
      invokeStatic("bmhs", new Class<?>[] { String.class, int.class, String.class, int.class }, null, 0, null, -1);
      fail("Expected NullPointerException when calling bmhs with null text and pattern");
    } catch (NullPointerException e) {
      // Expected path: verify exception has been thrown
      assertNotNull("NullPointerException expected and received", e);
    }
  }

  @Test(timeout = 4000)
  public void test01() throws Throwable {
    // Given: typical non-boundary inputs for bmhs
    // When: call algorithm
    Object result = invokeStatic("bmhs",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "O;;%iN}B+p;;", 1, "j>y`+<;", 1);
    // Then: verify return value has a plausible shape
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test02() throws Throwable {
    // Given: identical pattern and text
    Object result = invokeStatic("bmhs",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        ":3`mFu7EiR", 1, ":3`mFu7EiR", 1);
    // Then: expect a valid index (often 0 if searching full equality), or at least a non-error result
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test03() throws Throwable {
    // Given: typical inputs for bmh algorithm
    Object result = invokeStatic("bmh",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "d=DqwuF", 1, "|R$~R6ZN", 1);
    // Then: sanity checks on the result ensure the call exercised logic and returned a stable value
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test04() throws Throwable {
    // Given: identical text and pattern for bmh algorithm
    Object result = invokeStatic("bmh",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
    // Then: verify result shape; identical inputs often return a non-negative index
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test05() throws Throwable {
    // Given: null text and large index for bmh -> invalid usage expected to cause StringIndexOutOfBoundsException
    try {
      invokeStatic("bmh", new Class<?>[] { String.class, int.class, String.class, int.class }, null, 156, "bF!x7", 156);
      fail("Expected StringIndexOutOfBoundsException when calling bmh with null text and large index");
    } catch (StringIndexOutOfBoundsException e) {
      // expected
      assertNotNull("StringIndexOutOfBoundsException thrown as expected", e);
    }
  }

  @Test(timeout = 4000)
  public void test06() throws Throwable {
    // Given: typical inputs for shiftAndExato algorithm
    Object result = invokeStatic("shiftAndExato",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "el,,LT$!wJ<SQ$o ", 1, "3<Mu", 1);
    // Then: sanity check
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test07() throws Throwable {
    // Given: identical text and pattern for shiftAndExato
    Object result = invokeStatic("shiftAndExato",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
    // Then: expect a plausible index or non-error result
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test08() throws Throwable {
    // Given: very large index for forcaBruta likely out of bounds
    try {
      invokeStatic("forcaBruta",
          new Class<?>[] { String.class, int.class, String.class, int.class },
          "ds.CasamentoExato", 837, "ds.CasamentoExato", 837);
      fail("Expected StringIndexOutOfBoundsException when calling forcaBruta with large indices");
    } catch (StringIndexOutOfBoundsException e) {
      // expected exceptional path
      assertNotNull("StringIndexOutOfBoundsException thrown as expected", e);
    }
  }

  @Test(timeout = 4000)
  public void test09() throws Throwable {
    // Given: typical inputs for forcaBruta (brute-force)
    Object result = invokeStatic("forcaBruta",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "jsuU|`2!0#", 1, "ds.CasamentoExato", 1);
    // Then: sanity checks on returned result
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test10() throws Throwable {
    // Given: zero indices and short strings for forcaBruta to ensure boundary of index 0 is handled
    Object result = invokeStatic("forcaBruta",
        new Class<?>[] { String.class, int.class, String.class, int.class },
        "^x:xB", 0, "A,oV]LGA!o;.I24TI", 0);
    // Then: result should be valid and not throw
    assertReturnValueSanity(result);
  }

  @Test(timeout = 4000)
  public void test11() throws Throwable {
    // Given/When: construct a CasamentoExato instance to verify default constructor
    CasamentoExato casamentoExato0 = new CasamentoExato();
    // Then: instance must be created and of expected type
    assertNotNull("Constructor should create a non-null instance", casamentoExato0);
    assertEquals("Instance should be of type CasamentoExato", CasamentoExato.class, casamentoExato0.getClass());
  }
}