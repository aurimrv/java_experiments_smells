package ds.seed9006;

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
      int[] intArray0 = new int[8];
      intArray0[0] = 0; // boundary minimum
      intArray0[7] = 100; // boundary maximum
      // Undeclared exception!
      try {
        MaxMin2.maxMin2(intArray0, 8); // index just outside upper bound
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertEquals("Exception message should contain array length", "8", e.getMessage());
         verifyException("ds.MaxMin2", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 0; // boundary minimum
      intArray0[7] = 100; // boundary maximum
      // Undeclared exception!
      try {
        MaxMin2.maxMin2(intArray0, 8); // index just outside upper bound
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertEquals("Exception message should contain array length", "8", e.getMessage());
         verifyException("ds.MaxMin2", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0); // boundary minimum index
      assertArrayEquals("Expected min and max to be zero", new int[] {0, 0}, intArray1);
      int[] intArray2 = MaxMin2.maxMin2(intArray0, 4); // boundary maximum index
      assertArrayEquals("Expected min and max to be zero", new int[] {0, 0}, intArray2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
      assertNotNull("Object should be instantiated", maxMin2_0);
  }

}