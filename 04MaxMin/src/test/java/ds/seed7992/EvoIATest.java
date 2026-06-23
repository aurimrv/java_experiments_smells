package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  private void expectArrayIndexOutOfBounds(int[] arr, int index) {
    try {
      MaxMin3.maxMin3(arr, index);
      fail("Expected ArrayIndexOutOfBoundsException when index is out of bounds");
    } catch(ArrayIndexOutOfBoundsException e) {
      verifyException("ds.MaxMin3", e);
    }
  }





  private static final int TEST_ARRAY_SIZE = 3;
  private static final int TEST_INDEX = -650;





}