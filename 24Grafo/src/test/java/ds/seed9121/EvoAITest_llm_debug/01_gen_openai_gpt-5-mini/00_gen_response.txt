package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Test intent: verify the default Grafo constructor produces a non-null instance. Traceability: REQ-001
   * Given-When-Then:
   *   Given a test environment
   *   When the Grafo default constructor is invoked
   *   Then the resulting Grafo instance should not be null
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
      // Given - no special setup
      // When - construct a Grafo
      Grafo grafo0 = new Grafo();
      // Then - basic assertions to make the test meaningful and diagnosable
      assertNotNull("Grafo instance should not be null after construction", grafo0);
  }
}