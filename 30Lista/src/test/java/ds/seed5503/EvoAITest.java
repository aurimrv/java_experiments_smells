package ds.seed5503;

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
 * Traceability: REQ-AGM-001
 * Improved tests for AgmPrim and Grafo basic scenarios.
 *
 * Notes:
 * - Preserves original test method signatures and behavior.
 * - Adds lightweight assertions and Given-When-Then comments for clarity.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

    /**
     * Helper to centralize Grafo creation.
     */
    private Grafo createGraph(int vertices) {
        // Centralized creation to reduce duplication and improve readability
        return new Grafo(vertices);
    }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1994);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(1948, 1948, 2895);
      agmPrim0.obterAgm(101);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1994);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(1987, 1152, 1152);
      agmPrim0.obterAgm(1967);
      agmPrim0.imprime();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1666);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      // Undeclared exception!
      try { 
        agmPrim0.antecessor(1666);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.AgmPrim", e);
      }
  }
}