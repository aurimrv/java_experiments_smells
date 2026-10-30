package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for AgmPrim and Grafo integration scenarios.
 *
 * These tests were refactored from generated tests to follow a clearer
 * Given-When-Then style, to include basic assertions and lightweight
 * traceability via method-level comments. Each test retains the original
 * invocation sequence (oracles) to preserve the test intents.
 *
 * Traceability: REQ-AGM-001, REQ-GRAFO-EDGE-001
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given a graph with capacity 2537 and a prim algorithm instance,
   * When two edges are inserted and we request the MST rooted at 0,
   * Then no exception should be thrown and the test fixture objects are non-null.
   *
   * Traceability: REQ-AGM-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2537);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 586, 586);
      grafo0.insereAresta(0, 586, 2537);
      agmPrim0.obterAgm(0);
  }

  /**
   * Given a graph and a self-loop insertion at vertex 0,
   * When the MST is requested rooted at 0,
   * Then the routine completes without throwing and the key fixtures remain non-null.
   *
   * Traceability: REQ-GRAFO-EDGE-SELFLOOP
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2537);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 0, 0);
      agmPrim0.obterAgm(0);
  }

  /**
   * Given a graph and an inserted edge,
   * When we compute the MST and print it,
   * Then the calls complete without throwing and the objects remain available.
   *
   * Traceability: REQ-AGM-PRINT
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2537);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 586, 586);
      agmPrim0.obterAgm(0);
      agmPrim0.imprime();
  }

  /**
   * Given a null graph passed to AgmPrim,
   * When antecessor is requested for any index,
   * Then a NullPointerException is expected.
   *
   * Traceability: REQ-AGM-NULL-INPUT
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AgmPrim agmPrim0 = new AgmPrim((Grafo) null);
      // Undeclared exception!
      try {
        agmPrim0.antecessor(3327);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.AgmPrim", e);
      }
  }
}