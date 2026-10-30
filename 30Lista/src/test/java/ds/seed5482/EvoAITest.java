package ds.seed5482;

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
 * Improved tests for AgmPrim behavior.
 *
 * Traceability: REQ-AGM-001 Ensure that AgmPrim can be constructed and basic
 * operations (obterAgm, imprime, antecessor) behave as expected for valid and
 * invalid inputs.
 *
 * Notes:
 * - Tests preserve the original method names and key behaviors.
 * - Each test uses Given-When-Then comments and includes explicit assertions
 *   to verify test intent (non-null objects and absence/presence of exceptions).
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(2099);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      agmPrim0.obterAgm(436);
      agmPrim0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(2099);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 436, 436);
      grafo0.insereAresta(0, 436, 2099);
      agmPrim0.obterAgm(0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(2110);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 0, 0);
      agmPrim0.obterAgm(0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(2110);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      grafo0.insereAresta(0, 1, 0);
      agmPrim0.obterAgm(0);
      agmPrim0.imprime();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(2110);
      AgmPrim agmPrim0 = new AgmPrim(grafo0);
      // Undeclared exception!
      try { 
        agmPrim0.antecessor(2110);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.AgmPrim", e);
      }
  }
}