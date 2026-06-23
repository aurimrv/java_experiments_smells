package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      int[] intArray0 = new int[7];
      intArray0[2] = (-316);
      try {
          MaxMin1.maxMin1(intArray0, 1966);
          fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertEquals("7", e.getMessage());
          verifyException("ds.MaxMin1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      int[] intArray0 = new int[7];
      intArray0[1] = 134;
      try {
          MaxMin1.maxMin1(intArray0, 1966);
          fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertEquals("7", e.getMessage());
          verifyException("ds.MaxMin1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 2);
      assertNotNull("Result should not be null", intArray1);
      assertEquals("Result array length should be 2", 2, intArray1.length);
      assertEquals("First element should be 0", 0, intArray1[0]);
      assertEquals("Second element should be 0", 0, intArray1[1]);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      MaxMin1 maxMin1_0 = new MaxMin1();
      assertNotNull("Instance should be created", maxMin1_0);
  }
}