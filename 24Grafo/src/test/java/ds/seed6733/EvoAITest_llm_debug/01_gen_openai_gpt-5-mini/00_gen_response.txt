package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Curated test class (originally generated). Improvements:
 * - Added descriptive Javadoc for traceability
 * - Added Given-When-Then comments
 * - Added specific assertions with messages to improve fault detection
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Tests REQ-001: Grafo basic construction
   * Requirement: REQ-001 - A Grafo must be instantiable via the default constructor.
   * Given: default environment
   * When: constructing a Grafo using the no-arg constructor
   * Then: the returned instance is non-null and of the expected type
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
      // Given: no special setup required
      // When: creating a new graph instance
      Grafo grafo0 = new Grafo();

      // Then: basic verifications (explicit, with messages)
      assertNotNull("Grafo should be instantiated", grafo0);
      // verify simple properties to increase fault-detection surface
      assertTrue("Instance should be of type Grafo", grafo0 instanceof Grafo);
      assertNotNull("toString() should not return null", grafo0.toString());
  }
}