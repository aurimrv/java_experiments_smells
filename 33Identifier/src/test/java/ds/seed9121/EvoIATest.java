package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Identifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean result = isValidFirstChar('!');
      assertFalse("Expected '!' to be invalid as first character", result);
  }

  private boolean isValidFirstChar(char c) {
      Identifier identifier = new Identifier();
      return identifier.valid_f(c);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean result = isValidSubsequentChar('{');
      assertFalse("Expected '{' to be invalid as subsequent character", result);
  }

  private boolean isValidSubsequentChar(char c) {
      Identifier identifier = new Identifier();
      return identifier.valid_s(c);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean result = isValidSubsequentChar('L');
      assertTrue("Expected 'L' to be valid as subsequent character", result);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean result = isValidIdentifier("6S389:`G");
      assertFalse("Expected '6S389:`G' to be invalid identifier", result);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean result = isValidIdentifier("ggYLD*");
      assertFalse("Expected 'ggYLD*' to be invalid identifier", result);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean result = isValidIdentifier("i");
      assertTrue("Expected 'i' to be valid identifier", result);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean result = isValidIdentifier("dc}=5XIyS");
      assertFalse("Expected 'dc}=5XIyS' to be invalid identifier", result);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean result = isValidIdentifier(null);
      assertFalse("Expected null input to be invalid identifier", result);
  }

  private boolean isValidIdentifier(String s) {
      Identifier identifier = new Identifier();
      return identifier.validateIdentifier(s);
  }
}