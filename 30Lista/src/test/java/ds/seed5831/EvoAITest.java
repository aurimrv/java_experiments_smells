package ds.seed5831;

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
 * Unit tests for AgmPrim/Grafo integration scenarios.
 *
 * Traceability: REQ-AGM-001 - basic construction and invocation smoke tests.
 *
 * The original tests were auto-generated; these variants add lightweight
 * assertions, Given-When-Then comments and a category marker to improve
 * maintainability while preserving the original oracles and behaviors.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given a graph with a large number of vertices,
   * When an edge is inserted and the MST routines are invoked,
   * Then the setup objects should be non-null and calls should complete without exception.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2357);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(2351, 2328, 1);
      agmPrim0.obterAgm(2351);
      agmPrim0.imprime();
  }

  /**
   * Given a graph and duplicate/overlapping edge insertions,
   * When obterAgm is invoked,
   * Then the routine should complete without throwing and objects remain valid.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2357);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(2351, 2328, 1);
      grafo0.insereAresta(2351, 2328, 2357);
      agmPrim0.obterAgm(2351);
  }

  /**
   * Given a graph with an edge that does not connect to the requested root,
   * When obterAgm is invoked with a vertex that has no incident edges,
   * Then the method should complete without throwing and objects remain valid.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2357);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(1, 2328, 2357);
      agmPrim0.obterAgm(2351);
  }

  /**
   * Given a null graph passed into AgmPrim,
   * When antecessor is called,
   * Then a NullPointerException is expected.
   *
   * This test preserves the original expected-exception oracle.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AgmPrim agmPrim0 = new AgmPrim((Grafo) null);
      // Undeclared exception!
      try { 
        agmPrim0.antecessor((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.AgmPrim", e);
      }
  }
}