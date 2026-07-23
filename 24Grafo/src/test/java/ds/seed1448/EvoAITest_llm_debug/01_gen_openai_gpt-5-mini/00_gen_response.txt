package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

// Define a simple unit-test category marker for selective execution
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  /**
   * Tests REQ-001: constructor creates a non-null Grafo instance.
   * Given-When-Then: Given a fresh environment, when constructing Grafo, then an instance is created and of the expected type.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: no prior state
      // When: creating a new Grafo
      Grafo grafo0 = new Grafo();
      // Then: the created object is not null and has the expected runtime type
      assertNotNull("Grafo should be created", grafo0);
      assertEquals("Grafo should be instance of Grafo", Grafo.class, grafo0.getClass());
  }
}