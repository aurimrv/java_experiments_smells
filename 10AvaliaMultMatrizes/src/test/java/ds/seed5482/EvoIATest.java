package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends AvaliaMultMatrizes_ESTest_scaffolding {

    /**
     * Tests multmatrize method for valid input array length.
     * @see REQ-001
     */

    /**
     * Tests constructor of AvaliaMultMatrizes.
     * @see REQ-002
     */
}