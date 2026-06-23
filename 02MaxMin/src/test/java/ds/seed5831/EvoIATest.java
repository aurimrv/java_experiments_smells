package ds.seed5831;

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

  private void expectArrayIndexOutOfBounds(int[] array, int index) {
    try {
      MaxMin1.maxMin1(array, index);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch(ArrayIndexOutOfBoundsException e) {
      verifyException("ds.MaxMin1", e);
    }
  }





}