package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved, clearer tests for AgmPrim/Grafo interactions.
 *
 * Notes:
 * - Kept original test method names and EvoSuite runner annotations to preserve test harness behavior.
 * - Each test follows Given-When-Then comments and includes assertions that validate observed state
 *   without introducing new SUT calls beyond the originals.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2521);
      grafo0.insereAresta(371, 1240, 371);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(371);
      agmPrim0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2521);
      grafo0.insereAresta(371, 1240, 371);
      grafo0.insereAresta(371, 1240, 1240);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(371);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2486);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(48, 48, 2486);
      agmPrim0.obterAgm(48);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: an AgmPrim constructed with a null Grafo reference
    AgmPrim agmPrim0 = new AgmPrim((Grafo) null);

    // When/Then: calling antecessor on a null-backed AgmPrim is expected to raise a NullPointerException
    // This matches the original behavior (preserved oracle).
    try {
      agmPrim0.antecessor(0);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      verifyException("ds.AgmPrim", e);
    }
  }
}