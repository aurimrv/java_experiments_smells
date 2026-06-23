package ds.seed5311;

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
      Identifier identifier0 = new Identifier();
      // Boundary test: empty string
      boolean resultEmpty = identifier0.validateIdentifier("");
      assertFalse("Empty string should be invalid", resultEmpty);
      
      // Boundary test: max length string (assuming max length 255)
      String maxLengthString = new String(new char[255]).replace('\0', 'a');
      boolean resultMax = identifier0.validateIdentifier(maxLengthString);
      // Assuming max length is valid
      assertTrue("Max length string should be valid", resultMax);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      // Boundary tests for valid_s method
      boolean resultNullChar = identifier0.valid_s('\0');
      assertFalse("Null char should be invalid", resultNullChar);
      boolean resultDigit = identifier0.valid_s('0');
      assertTrue("Digit '0' should be valid", resultDigit);
      
      boolean boolean0 = identifier0.valid_s('~');
      assertFalse("valid_s should return false for invalid character '~'", boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      // Boundary tests for validateIdentifier
      boolean resultEmpty = identifier0.validateIdentifier("");
      assertFalse("Empty string should be invalid", resultEmpty);
      String maxLength = new String(new char[255]).replace('\0', 'a');
      boolean resultMax = identifier0.validateIdentifier(maxLength);
      assertTrue("Max length string should be valid", resultMax);
      
      boolean boolean0 = identifier0.validateIdentifier("sluUOAEo2iL");
      assertFalse("validateIdentifier should return false for invalid input string", boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      // Boundary tests for validateIdentifier
      boolean resultEmpty = identifier0.validateIdentifier("");
      assertFalse("Empty string should be invalid", resultEmpty);
      String maxLength = new String(new char[255]).replace('\0', 'a');
      boolean resultMax = identifier0.validateIdentifier(maxLength);
      assertTrue("Max length string should be valid", resultMax);
      
      boolean boolean0 = identifier0.validateIdentifier("8(9>3");
      assertFalse("validateIdentifier should return false for invalid input string", boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      // Boundary tests for validateIdentifier
      boolean resultEmpty = identifier0.validateIdentifier("");
      assertFalse("Empty string should be invalid", resultEmpty);
      String maxLength = new String(new char[255]).replace('\0', 'a');
      boolean resultMax = identifier0.validateIdentifier(maxLength);
      assertTrue("Max length string should be valid", resultMax);
      
      boolean boolean0 = identifier0.validateIdentifier("Z");
      assertTrue("validateIdentifier should return true for valid input 'Z'", boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse("validateIdentifier should return false for null input", boolean0);
  }
}