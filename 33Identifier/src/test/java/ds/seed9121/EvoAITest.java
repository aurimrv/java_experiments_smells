/*
 * Improved unit tests for ds.seed9121.Identifier
 * Reworked from an auto-generated baseline to include clearer structure,
 * descriptive assertions, and minimal test hygiene while preserving original oracles.
 */

package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing these tests as unit tests.
 * (Placed at package scope as required for usage with @Category.)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  /* Helper: centralize creation to remove duplication and make intent explicit. */
  private Identifier newIdentifier() {
    return new Identifier();
  }

  /**
   * Given a fresh Identifier instance,
   * When valid_f is invoked with '!' (a punctuation character),
   * Then the result is expected to be false (not a valid identifier character).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_f('!');
      assertFalse(boolean0);
  }

  /**
   * Given a fresh Identifier instance,
   * When valid_s is invoked with '{' (a brace character),
   * Then the result is expected to be false (not a valid start character).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('{');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('L');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("6S389:`G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("ggYLD*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("i");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("dc}=5XIyS");
      assertFalse(boolean0);
  }

  /**
   * Given a fresh Identifier instance,
   * When validateIdentifier is invoked with null,
   * Then the result is expected to be false (null is not a valid identifier).
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}