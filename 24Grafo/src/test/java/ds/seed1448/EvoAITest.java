package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Simplified and slightly improved test for Grafo construction.
 * Requirement: REQ-001 - Grafo must be constructible
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Grafo_ESTest_scaffolding {

  // Helper to centralize construction and keep tests modular
  private Grafo createGrafo() {
    return new Grafo();
  }

  /** Tests REQ-001: basic Grafo construction */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo();
  }
}