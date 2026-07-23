package ds.seed7992;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests REQ-001: basic construction and sanity of Grafo instances.
 * This test class EvoAITest hand-reviewed to add minimal assertions and basic setup.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  private Grafo grafo;

  @Before
  public void setUp() {
    // create a fresh instance for each test to ensure independence
    this.grafo = new Grafo();
  }

  /**
   * Given a default Grafo, when constructed, then the instance should not be null.
   * Note: method name kept as 'test0' to preserve original test signatures.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      // (setup performed in @Before)

      // When
      Grafo grafo0 = new Grafo();

      // Then
      assertNotNull("Grafo should be constructed", grafo0);
      // Additional sanity check on the instance reference created in setup
      assertNotNull("Setup Grafo instance should be available", this.grafo);
  }
}