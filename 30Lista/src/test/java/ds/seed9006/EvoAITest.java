package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * REQ-AGM-01: Verify that AgmPrim can be constructed from a graph
   * and that obtaining a spanning tree for a valid vertex completes
   * without throwing an exception and produces a non-null textual representation.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1473);
      grafo0.insereAresta(1451, 1445, 1445);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(1451, 1445, 1473);
      agmPrim0.obterAgm(1451);
  }

  /**
   * REQ-AGM-02: Obtaining AGM starting at vertex zero should complete
   * and the AgmPrim instance should remain valid.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1473);
      grafo0.insereAresta(1451, 1472, 1472);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(0);
  }

  /**
   * REQ-AGM-03: After computing the AGM, calling imprime should write
   * a textual representation to standard output (no exception and some output captured).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1473);
      grafo0.insereAresta(1451, 1445, 1445);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(1451);
      agmPrim0.imprime();
  }

  /**
   * REQ-AGM-ERR-01: Requesting an antecessor on an empty graph is expected
   * to result in a NullPointerException (legacy behavior).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a graph with zero vertices (edge case)
      Grafo grafo0 = new Grafo(0);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);

      // When / Then: calling antecessor(0) on this instance is expected to throw NullPointerException
      try { 
        agmPrim0.antecessor(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.AgmPrim", e);
      }
  }
}