package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

  private void expectArrayIndexOutOfBounds(int[] array, int start, int end) {
    try {
      MaxMin4.maxMin4(array, start, end);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[0];
    // Test with empty array boundary
    expectArrayIndexOutOfBounds(intArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = new int[0];
    // Test with empty array boundary
    expectArrayIndexOutOfBounds(intArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    MaxMin4 maxMin4_0 = new MaxMin4();
    assertNotNull("MaxMin4 instance should not be null", maxMin4_0);
  }

}