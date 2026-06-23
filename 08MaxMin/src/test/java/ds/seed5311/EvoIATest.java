package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      int[] intArray0 = new int[0];
      // Test with empty array to check boundary condition
      try {
          MaxMin4.maxMin4(intArray0, 0, 0);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertNotNull("Exception message should not be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      int[] intArray0 = new int[0];
      // Test with empty array to check boundary condition
      try {
          MaxMin4.maxMin4(intArray0, 0, 0);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertNotNull("Exception message should not be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      MaxMin4 maxMin4_0 = new MaxMin4();
      // Act
      int[] input = {1, 2, 3, 4};
      int[] result = MaxMin4.maxMin4(input, 0, input.length - 1);
      // Assert
      assertNotNull("Result should not be null", result);
      assertEquals("Result length should be 4", 4, result.length);
  }

}