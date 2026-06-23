package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  private int[] createArrayWithValues(int length, int... values) {
    int[] arr = new int[length];
    for (int i = 0; i < values.length; i++) {
      arr[i] = values[i];
    }
    return arr;
  }

  /**
   * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds.
   */

  /**
   * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds.
   */

  /**
   * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds.
   */

  /**
   * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds.
   */

  /**
   * Test that maxMin3 throws ArrayIndexOutOfBoundsException when index is out of bounds.
   */

  /**
   * Test maxMin3 returns correct max and min values for valid input array.
   */

  /**
   * Test maxMin3 returns zero max and min for zero-filled array.
   */

  /**
   * Test that MaxMin3 constructor creates a non-null instance.
   */

}