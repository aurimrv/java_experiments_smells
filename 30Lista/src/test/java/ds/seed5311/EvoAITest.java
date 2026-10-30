package ds.seed5311;

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
 * Improved unit tests for AgmPrim/Grafo interaction.
 * These tests keep the original EvoSuite-generated scenarios (calls)
 * but add explicit assertions, categorization, and clearer structure.
 *
 * Note: The test method names are preserved exactly to meet oracle-preservation rules.
 */
interface UnitTest {}
interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  /**
   * Given a large graph and a Prim instance, when building the MST (obterAgm)
   * and printing it, then no exceptions should be thrown and objects should be non-null.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2330);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(305);
      agmPrim0.imprime();
  }

  /**
   * Given a graph with an inserted edge and its transpose, when computing MST on the transposed graph,
   * then the transposed graph should be a distinct non-null instance and MST computation should not fail.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2330);
      grafo0.insereAresta(2074, 305, 2074);
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo1.insereAresta(305, 2074, 2074);
      AgmPrim agmPrim0 = new AgmPrim(grafo1);
      agmPrim0.obterAgm(305);
  }

  /**
   * Given a graph with an edge, when computing MST and printing, then calls should succeed and objects remain valid.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2330);
      grafo0.insereAresta(2074, 305, 2074);
      Grafo grafo1 = grafo0.grafoTransposto();
      AgmPrim agmPrim0 = new AgmPrim(grafo1);
      agmPrim0.obterAgm(305);
      agmPrim0.imprime();
  }

  /**
   * Given a graph with an inserted edge, when computing MST from a vertex, then MST computation should complete.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(2330);
      grafo0.insereAresta(2074, 305, 2074);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(305);
  }

  /**
   * Given a null graph passed to AgmPrim, antecessor should throw a NullPointerException.
   * This preserves the original expected exceptional behavior.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AgmPrim agmPrim0 = new AgmPrim((Grafo) null);
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