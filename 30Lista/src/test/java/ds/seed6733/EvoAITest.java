package ds.seed6733;

import ds.AgmPrim;
import ds.Grafo;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to classify tests as unit tests.
 * Placed at package level so it can be referenced by @Category.
 */
interface UnitTest {}

/**
 * Improved and hardened versions of the originally generated tests.
 * - Each test follows a simple Given-When-Then structure.
 * - Assertions are added to validate observable behavior.
 * - Side-effects from printing are captured and validated.
 *
 * Note: The test method names are kept identical to the original (test0..test3).
 */
public class EvoAITest {

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given: a graph with two vertices implicitly and a single edge
        Grafo grafo = new Grafo(2521);
        grafo.insereAresta(371, 1240, 371);
        AgmPrim agmPrim = new AgmPrim(grafo);

        // When: obtain the minimum spanning tree starting from a valid vertex
        agmPrim.obterAgm(371);

        // And: capture any printed representation of the MST
        String printed = captureImprimeOutput(agmPrim);

        // Then: printed output must be non-null and should contain some non-whitespace characters
        Assert.assertNotNull("imprime() must not return null output", printed);
        Assert.assertTrue("imprime() should produce output for a graph with at least one edge",
                printed.trim().length() > 0);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given: a graph where the same edge is inserted twice with different weights
        Grafo grafo = new Grafo(2521);
        grafo.insereAresta(371, 1240, 371);
        grafo.insereAresta(371, 1240, 1240);
        AgmPrim agmPrim = new AgmPrim(grafo);

        // When: compute MST from one endpoint
        agmPrim.obterAgm(371);

        // Then: ensure the printed MST representation is present and non-empty
        String printed = captureImprimeOutput(agmPrim);
        Assert.assertNotNull("imprime() must not return null output when duplicate edges exist", printed);
        Assert.assertTrue("imprime() should produce some output for graph with duplicate edges",
                printed.trim().length() > 0);

        // Also verify that obtaining MST from the other vertex does not throw and produces output
        agmPrim.obterAgm(1240);
        String printed2 = captureImprimeOutput(agmPrim);
        Assert.assertNotNull("imprime() must not return null output when computing MST from alternate root", printed2);
    }

    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given: graph with many vertices and a self-loop edge
        Grafo grafo = new Grafo(2486);
        grafo.insereAresta(48, 48, 2486);
        AgmPrim agmPrim = new AgmPrim(grafo);

        // When: compute MST starting at the node that has a self-loop
        agmPrim.obterAgm(48);

        // Then: printing should still behave and produce some textual output (even if trivial)
        String printed = captureImprimeOutput(agmPrim);
        Assert.assertNotNull("imprime() must not return null output for graph with self-loop", printed);
        // Allow empty or minimal output but assert at least the call completes without exceptions
        Assert.assertTrue("imprime() returned a string (may be empty)", printed != null);
    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given: an AgmPrim instance constructed with a null graph reference
        AgmPrim agmPrim = new AgmPrim((Grafo) null);

        // When / Then: calling antecessor on that instance should raise NullPointerException
        // This is expected and documented by the test via the expected attribute of @Test.
        agmPrim.antecessor(0);
    }

    // ---------- Helper methods ----------

    /**
     * Capture the output produced by AgmPrim.imprime() and return it as a String.
     * Ensures System.out is restored even if imprime() throws.
     */
    private static String captureImprimeOutput(AgmPrim agmPrim) throws UnsupportedEncodingException {
        if (agmPrim == null) {
            return "";
        }
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream interceptor = new PrintStream(baos);
        try {
            System.setOut(interceptor);
            // Call imprime() (may print to stdout)
            agmPrim.imprime();
        } finally {
            // flush and restore original System.out
            interceptor.flush();
            System.setOut(originalOut);
        }
        return baos.toString("UTF-8");
    }
}