package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends MaxMin2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 0; // boundary minimum
      intArray0[6] = 100; // boundary maximum
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 7); // index just outside upper bound
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertEquals("Index 7 out of bounds for length 7", e.getMessage());
         verifyException("ds.MaxMin2", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 0; // boundary minimum
      intArray0[6] = 100; // boundary maximum
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 7); // index just outside upper bound
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertEquals("Index 7 out of bounds for length 7", e.getMessage());
         verifyException("ds.MaxMin2", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 0; // boundary minimum
      intArray0[2] = 100; // boundary maximum
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
      assertNotNull("Result should not be null", intArray1);
      assertEquals("Result array length should be 2", 2, intArray1.length);
      assertEquals("First element should be 0", 0, intArray1[0]);
      assertEquals("Second element should be 0", 0, intArray1[1]);
  }


}