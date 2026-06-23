package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 65;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 65);
        fail("Expected ArrayIndexOutOfBoundsException when index is out of bounds");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain '4'", e.getMessage().contains("4"));
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 565;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 65);
        fail("Expected ArrayIndexOutOfBoundsException when index is out of bounds");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain '4'", e.getMessage().contains("4"));
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals("Returned array length should be 2", 2, intArray1.length);
      assertNotNull("Returned array should not be null", intArray1);
      // Additional assertions could verify contents of intArray1
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
      assertNotNull("Instance should not be null", maxMin1_0);
  }

}