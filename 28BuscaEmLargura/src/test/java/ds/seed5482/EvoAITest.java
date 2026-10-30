package ds.seed5482;

import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.*;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(4389);
      // Undeclared exception!
      grafo0.grafoTransposto();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1);
      grafo0.insereAresta(0, 0, (-93));
      grafo0.imprime();
      assertEquals(1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Requirement: Inserting an edge and then removing it should return the inserted edge with correct properties.
    // Given
    Grafo grafo0 = new Grafo(4389);

    // When
    grafo0.insereAresta(1, 1, 1);
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(1, 1);

    // Then
    assertNotNull("retiraAresta should return the removed edge instance", grafo_Aresta0);
    assertEquals("Removed edge should report weight 1", 1, grafo_Aresta0.peso());
    assertEquals("Removed edge should have v2 == 1", 1, grafo_Aresta0.v2());
    assertEquals("Removed edge should have v1 == 1", 1, grafo_Aresta0.v1());
    assertEquals("Vertex count must remain unchanged after removal", 4389, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Requirement: Attempting to remove a non-existent edge should yield null and not change vertex count.
    // Given
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 0, 1);

    // When
    Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 4344);

    // Then
    assertEquals("Graph should still have 1 vertex after failed removal", 1, grafo0.numVertices());
    assertNull("retiraAresta should return null when edge does not exist", grafo_Aresta0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Requirement: Transposing a graph after inserting an invalid edge index should trigger ArrayIndexOutOfBoundsException.
    // Given
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 0, (-93));
    grafo0.insereAresta(0, (-2922), 3274);

    // When / Then: Expect ArrayIndexOutOfBoundsException when computing transpose due to invalid vertex index
    try {
      grafo0.grafoTransposto();
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Verify exception originates from ds.Grafo implementation
      verifyException("ds.Grafo", e);
    }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Requirement: Accessing the first adjacency list of a valid vertex should not change the vertex count.
    // Given
    Grafo grafo0 = new Grafo(4592);

    // When
    grafo0.primeiroListaAdj(0);

    // Then
    assertEquals("Vertex count must remain 4592 after accessing adjacency list", 4592, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Requirement: After inserting an edge, existeAresta should report true for that edge.
    // Given
    Grafo grafo0 = new Grafo(1);

    // When
    grafo0.insereAresta(0, 0, 1);
    boolean boolean0 = grafo0.existeAresta(0, 0);

    // Then
    assertTrue("Edge 0->0 should exist after insertion", boolean0);
    assertEquals("Graph should have 1 vertex", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    // Requirement: existeAresta should return false for non-inserted edges.
    // Given
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 0, 1);

    // When
    boolean boolean0 = grafo0.existeAresta(0, 1484);

    // Then
    assertFalse("Edge 0->1484 should not exist in a 1-vertex graph", boolean0);
    assertEquals("Graph should have 1 vertex", 1, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    // Requirement: A graph constructed with 0 vertices should report 0 vertices.
    // Given
    Grafo grafo0 = new Grafo(0);

    // When
    int int0 = grafo0.numVertices();

    // Then
    assertEquals("Graph constructed with 0 vertices must report numVertices == 0", 0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
    // Requirement: Transposing a graph with a self-loop should preserve vertex counts on both graphs.
    // Given
    Grafo grafo0 = new Grafo(1);
    grafo0.insereAresta(0, 0, (-93));

    // When
    Grafo grafo1 = grafo0.grafoTransposto();

    // Then
    assertEquals("Original graph should have 1 vertex", 1, grafo0.numVertices());
    assertEquals("Transposed graph should have same number of vertices as original", 1, grafo1.numVertices());
  }
}