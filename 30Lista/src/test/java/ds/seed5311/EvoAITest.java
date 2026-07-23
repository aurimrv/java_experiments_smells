package ds.seed5311;

import ds.AgmPrim;
import ds.Grafo;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for AgmPrim and Grafo behaviors.
 *
 * The original tests were auto-generated and minimal. These tests follow a
 * simple Given-When-Then structure, include assertions that verify observable
 * behavior, and exercise a few boundary/edge cases for exceptional flows.
 *
 * Traceability:
 * - REQ-AGM-001: AgmPrim should compute a minimum spanning structure and allow printing.
 * - REQ-AGM-002: AgmPrim methods should behave consistently when constructed with null (throw NPE on usage).
 */
public class EvoAITest {

    /**
     * Small helper functional interface to allow throwing checked exceptions inside lambdas.
     */
    @FunctionalInterface
    interface ThrowingRunnable {
        void run() throws Exception;
    }

    /**
     * Capture System.out produced while running the provided action.
     *
     * @param action action that writes to System.out
     * @return captured output as String
     */
    private static String captureStdOut(ThrowingRunnable action) throws Exception {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos, true, "UTF-8");
        try {
            System.setOut(ps);
            action.run();
        } finally {
            System.setOut(originalOut);
            ps.close();
        }
        return baos.toString("UTF-8");
    }

    /**
     * REQ-AGM-001
     *
     * Given a small connected graph, when we compute the AGM from root 0 and print it,
     * then some output related to the computed structure should be produced.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        final int V = 4;
        Grafo grafo = new Grafo(V);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(0, 3, 10);
        AgmPrim agm = new AgmPrim(grafo);

        // When
        String output = captureStdOut(() -> {
            // compute AGM rooted at vertex 0 and print representation
            agm.obterAgm(0);
            agm.imprime();
        });

        // Then
        assertNotNull("Printed AGM output should not be null", output);
        assertTrue("Printed AGM output should not be empty", output.trim().length() > 0);
        // Expecting printed content to mention at least one vertex index (0..V-1)
        boolean containsVertex = false;
        for (int i = 0; i < V; i++) {
            if (output.contains(Integer.toString(i))) {
                containsVertex = true;
                break;
            }
        }
        assertTrue("Printed output should contain at least one vertex index from the graph", containsVertex);
    }

    /**
     * REQ-AGM-001
     *
     * Given a graph with a known directed edge, when the graph is transposed and the AGM is computed,
     * then printing the result should reflect vertices from the transposed graph.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        final int V = 3;
        final int from = 2;
        final int to = 1;
        Grafo original = new Grafo(V);
        original.insereAresta(from, to, 7);

        // When - transpose the graph and add a similar edge to increase coverage
        Grafo transposed = original.grafoTransposto();
        transposed.insereAresta(to, from, 7);
        AgmPrim agm = new AgmPrim(transposed);

        String output = captureStdOut(() -> {
            agm.obterAgm(to);
            agm.imprime();
        });

        // Then
        assertNotNull("Printed output should not be null after computing AGM on transposed graph", output);
        assertTrue("Output should reference the source vertex of the AGM computation", output.contains(Integer.toString(to)));
        assertTrue("Output should reference the other vertex involved in the original edge", output.contains(Integer.toString(from)));
    }

    /**
     * REQ-AGM-001
     *
     * Given a transposed graph produced from a graph with a single edge, when AGM is obtained and printed,
     * then output should be generated and include numeric vertex identifiers.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        final int V = 4;
        Grafo g = new Grafo(V);
        g.insereAresta(1, 3, 4);

        // When
        Grafo gt = g.grafoTransposto();
        AgmPrim agm = new AgmPrim(gt);

        String output = captureStdOut(() -> {
            agm.obterAgm(1); // root chosen within range
            agm.imprime();
        });

        // Then
        assertNotNull("Print output must not be null", output);
        assertTrue("Print output should contain numeric identifiers", output.matches("(?s).*\\d+.*"));
        // Ensure at least one of the involved vertices appears
        assertTrue("Output should contain vertex '1' or '3'", output.contains("1") || output.contains("3"));
    }

    /**
     * REQ-AGM-001
     *
     * Given a graph with at least one edge, when AGM is computed from a valid vertex,
     * then no exceptions should be thrown and some printable representation should be produced.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 4, 1);

        // When
        AgmPrim agm = new AgmPrim(grafo);
        String output = captureStdOut(() -> {
            agm.obterAgm(4);
            agm.imprime();
        });

        // Then
        assertNotNull("AGM printed output should not be null", output);
        assertTrue("AGM printed output should contain vertex '4' (the chosen root or connected vertex)", output.contains("4"));
    }

    /**
     * REQ-AGM-002
     *
     * Given an AgmPrim constructed with a null Grafo, accessors should fail fast with NullPointerException.
     * This test exercises multiple index values (0, negative, and Integer.MAX_VALUE) to cover boundary checks
     * and to ensure a consistent exception is thrown for invalid internal state.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        AgmPrim agmNull = new AgmPrim((Grafo) null);
        int[] testIndices = new int[] {0, -1, Integer.MAX_VALUE};

        // When / Then: each access should result in a NullPointerException (fail-fast for null internal graph)
        for (int idx : testIndices) {
            boolean threwNPE = false;
            try {
                agmNull.antecessor(idx);
            } catch (NullPointerException npe) {
                threwNPE = true;
            } catch (Exception e) {
                fail("Expected NullPointerException for antecessor(" + idx + "), but got: " + e);
            }
            assertTrue("antecessor(" + idx + ") should throw NullPointerException when AgmPrim constructed with null", threwNPE);
        }
    }
}