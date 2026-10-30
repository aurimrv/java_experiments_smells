package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.AgmPrim;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.lang.reflect.Method;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given a large graph, when inserting a self-loop and requesting the MST,
   * then the operations should complete without throwing exceptions and
   * the involved objects must be instantiated.
   *
   * Trace: REQ-AGM-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2717);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 0, 0);
      agmPrim0.obterAgm(0);
  }

  /**
   * Given a graph with one inserted edge, when building the MST and printing it,
   * then the operations should complete and the instances should be valid.
   *
   * Trace: REQ-AGM-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2630);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(18, 42, 18);
      agmPrim0.obterAgm(18);
      agmPrim0.imprime();
  }

  /**
   * Given an empty graph (0 vertices), when querying the predecessor of a vertex,
   * then a NullPointerException is expected because internal structures are absent.
   *
   * Trace: REQ-AGM-EXC-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(0);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      // Undeclared exception!
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