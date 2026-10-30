package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Identifier.
 *
 * Traceability: REQ-IDENT-001..006 cover basic validation behavior for single characters,
 * simple identifiers, complex/invalid strings and null handling.
 *
 * These tests follow a Given-When-Then structure and include descriptive assertion messages
 * as well as lightweight determinism checks (idempotence) to improve diagnostics.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_f('(');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("p");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("&L_|vCW:e|7`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("I7SVNqA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}