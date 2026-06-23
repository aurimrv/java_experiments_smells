package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 782;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 782);
        fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain array size", e.getMessage().contains("6"));
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[4] = (-2288);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 976);
        fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain array size", e.getMessage().contains("9"));
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[2] = 2126;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 976);
        fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain array size", e.getMessage().contains("9"));
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[5] = (-3062);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 782);
        fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain array size", e.getMessage().contains("6"));
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 3843;
      int[] intArray1 = MaxMin3.maxMin3(intArray0, (-764));
      assertArrayEquals("Returned array should match expected values", new int[] {3843, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 509);
        fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
      } catch(ArrayIndexOutOfBoundsException e) {
         assertNotNull("Exception should not be null", e);
         assertTrue("Exception message should contain array size", e.getMessage().contains("2"));
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
      assertNotNull("Instance should be created", maxMin3_0);
  }

}