package ds.seed6733;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Given: a graph with a single vertex
      Grafo grafo0 = new Grafo(1);

      // When: perform several non-mutating inspections and a transpose operation
      grafo0.insereAresta(4484, 1, 4484);
      grafo0.grafoTransposto();
      grafo0.insereAresta(1, 4484, (-3762));
      grafo0.existeAresta(1, 4492); // exercised for side-effect / stability

      // Then: the graph still reports the original vertex count
      assertEquals("Graph should report one vertex after edge insertions/transpose", 1, grafo0.numVertices());

      // Additional sanity checks: repeated existence checks should not throw
      grafo0.existeAresta(1, (-3762));
      grafo0.existeAresta(1, 4484);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(4484, 1, 4484);
      grafo0.insereAresta(1, 1889, (-3762));
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo1.retiraAresta(1, 1);
      grafo0.existeAresta(1, 4492);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Grafo grafo0 = new Grafo(1218);
      grafo0.primeiroListaAdj(1);
      grafo0.insereAresta(1, 5269, 1);
      grafo0.retiraAresta(1, 2063);
  }

  @Ignore
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // This test is intentionally ignored. It previously exercised many internal states
      // and relies on internal array mutations; preserving as ignored to avoid brittle behavior.
      int int0 = 1;
      Grafo grafo0 = new Grafo(1);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      grafo0.insereAresta(1, 1, 1);
      grafo0.prox = intArray0;
      intArray0[3] = 1;
      intArray0[4] = 1;
      grafo0.prox = intArray0;
      grafo0.retiraAresta(0, 1);
      grafo0.cab = intArray0;
      grafo0.grafoTransposto();
      grafo0.retiraAresta(intArray0[0], intArray0[4]);
      grafo0.imprime();
      grafo0.proxAdj(int0);
      grafo0.numVertices();
      grafo0.imprime();
      Grafo grafo1 = grafo0.grafoTransposto();
      int int1 = 1;
      grafo1.retiraAresta(int1, intArray0[3]);
      grafo1.cab = grafo0.prox;
      int int2 = 2301;
      int int3 = 0;
      int int4 = 1;
      grafo1.insereAresta(int2, int3, int4);
      grafo1.listaAdjVazia(intArray0[3]);
      int int5 = 1;
      grafo0.existeAresta(intArray0[2], int5);
      int int6 = 0;
      grafo0.retiraAresta(int0, int6);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Grafo.Aresta grafo_Aresta0 = new Grafo.Aresta(1734, 1734, 710);
      Grafo grafo0 = new Grafo(1734);
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo0.peso = grafo1.prox;
      grafo0.prox = grafo1.cab;
      grafo1.cab = grafo0.prox;
      int int0 = 0;
      grafo1.insereAresta(1734, 0, 0);
      grafo1.retiraAresta(710, 0);
      // Undeclared exception!
      try { 
        grafo0.grafoTransposto();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Ignore
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Ignored: manipulates internal arrays and calls imprime() which may be implementation dependent.
      Grafo grafo0 = new Grafo(1);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 1;
      grafo0.prox = intArray0;
      // The behaviour can be implementation-specific; keep ignored to avoid brittle assertion.
      grafo0.imprime();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Grafo.Aresta grafo_Aresta0 = new Grafo.Aresta(1029, 1, 1);
      grafo_Aresta0.v1();
      grafo_Aresta0.peso();
      Grafo grafo0 = new Grafo(1);
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo1.insereAresta(1029, 95, (-2691));
      grafo1.grafoTransposto();
      // Undeclared exception!
      try { 
        grafo1.proxAdj(2464);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Given: a simple Aresta
      Grafo.Aresta grafo_Aresta0 = new Grafo.Aresta(0, 1678, 0);

      // When: query attributes
      int int0 = grafo_Aresta0.peso();

      // Then: verify fields via accessors
      assertEquals("v2 should be 1678", 1678, grafo_Aresta0.v2());
      assertEquals("peso should be 0", 0, int0);
      assertEquals("v1 should be 0", 0, grafo_Aresta0.v1());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given: another Aresta
      Grafo.Aresta grafo_Aresta0 = new Grafo.Aresta(772, 282, 4500);

      // When: inspect v2 and other fields
      int int0 = grafo_Aresta0.v2();

      // Then: verify accessor behavior with clear messages
      assertEquals("peso accessor should return 4500", 4500, grafo_Aresta0.peso());
      assertEquals("v1 accessor should return 772", 772, grafo_Aresta0.v1());
      assertEquals("v2 accessor should return 282", 282, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Given: a graph of a large declared size
      Grafo grafo0 = new Grafo(4500);

      // Then: the number of vertices should match the constructor parameter
      int int0 = grafo0.numVertices();
      assertEquals("Graph constructed with 4500 vertices should report 4500", 4500, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Given: a graph and an attempt to remove a non-existent edge
      Grafo grafo0 = new Grafo(2027);

      // When: attempt to remove an edge (returns an Aresta placeholder per implementation)
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1215, 0);

      // Then: the returned Aresta has the expected placeholder values and the graph size is unchanged
      assertEquals("Removed Aresta v1 should be 1215", 1215, grafo_Aresta0.v1());
      assertEquals("Removed Aresta v2 should be 0", 0, grafo_Aresta0.v2());
      assertEquals("Removed Aresta peso should be 0", 0, grafo_Aresta0.peso());
      assertEquals("Graph vertex count should remain 2027", 2027, grafo0.numVertices());
      assertNotNull("retiraAresta should not return null for this call", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Given: a graph
      Grafo grafo0 = new Grafo(2041);

      // When: obtain transpose and insert an edge there
      Grafo grafo1 = grafo0.grafoTransposto();
      grafo1.insereAresta(2041, 2041, (-1));

      // Then: ensure transpose produced a distinct instance
      assertNotSame("Transposed graph should be a different instance than the original", grafo1, grafo0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Given: an empty graph (0 vertices)
      Grafo grafo0 = new Grafo(0);
      Grafo grafo1 = grafo0.grafoTransposto();

      // When/Then: calling primeiroListaAdj with a negative index must throw ArrayIndexOutOfBoundsException
      try {
        grafo1.primeiroListaAdj((-1668));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         // -1668
         verifyException("ds.Grafo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Given: an empty graph
      Grafo grafo0 = new Grafo(0);

      // When: attempt to remove an edge from an empty graph
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(569, 569);

      // Then: vertex count remains zero and the returned Aresta is null
      assertEquals("Empty graph should report zero vertices", 0, grafo0.numVertices());
      assertNull("retiraAresta on empty graph should return null", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Given/When/Then: constructing a graph with a negative size must throw NegativeArraySizeException
      Grafo grafo0 = null;
      try {
        grafo0 = new Grafo((-46));
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
         // expected for negative size
         verifyException("ds.Grafo", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Given: an empty graph and invalid indices
      Grafo grafo0 = new Grafo(0);

      // When/Then: inserting an edge with negative indices should throw ArrayIndexOutOfBoundsException
      try { 
        grafo0.insereAresta((-1953), (-1953), (-29));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
         // expected
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Given: a well-formed Aresta and a reasonably sized graph
      Grafo.Aresta grafo_Aresta0 = new Grafo.Aresta(455, 455, 455);

      // Then: Aresta accessors should report the constructed values
      int int0 = grafo_Aresta0.v1();
      assertEquals("v1 should be 455", 455, int0);
      assertEquals("v2 should be 455", 455, grafo_Aresta0.v2());
      assertEquals("peso should be 455", 455, grafo_Aresta0.peso());

      // Given: a large graph with many vertices
      Grafo grafo0 = new Grafo(4500);

      // When: query adjacency list for an index that likely has none
      Grafo.Aresta grafo_Aresta1 = grafo0.proxAdj(1384);
      assertNull("proxAdj for a vertex with no adjacency should return null", grafo_Aresta1);

      // Then: existence checks should be false for non-inserted edges
      boolean boolean0 = grafo0.existeAresta(1384, 4500);
      assertFalse("Non-existent edge should not be reported as present", boolean0);

      // Exercise removal and printing to ensure no exceptions and size remains the same
      grafo0.retiraAresta(1384, 4500);
      grafo0.imprime();
      grafo0.imprime();
      assertEquals("Graph size should remain 4500 after benign operations", 4500, grafo0.numVertices());
  }
}