package ds.seed5838;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.AgmPrim;
import ds.Grafo;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit test classification.
 */
interface UnitTest {}

/**
 * Improved and clarified tests for AgmPrim/Grafo interactions.
 *
 * Note: Method names are preserved (test0..test3) to comply with existing
 * test-suite expectations. Each test includes Arrange-Act-Assert structure,
 * descriptive assertion messages, and a traceability tag (requirement id).
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AgmPrim_ESTest_scaffolding {

    // Common constants to avoid magic numbers scattered across tests.
    private static final int DEFAULT_TIMEOUT = 4000;
    private static final String REQ_PREFIX = "REQ-AGM-";

    /**
     * REQ-AGM-01: Verify that inserting duplicate edges does not crash and that
     * obtaining an AGM for a valid start node completes without exception.
     */
    @Test(timeout = DEFAULT_TIMEOUT)
    public void test0() throws Throwable {
        // Given: a graph with a known size and an AgmPrim instance
        final int graphSize = 32;
        final int u = 2;
        final int v = 21;
        final int weight = 2;

        Grafo grafo = new Grafo(graphSize);
        Assert.assertNotNull("Grafo instance should be created successfully (" + REQ_PREFIX + "01)", grafo);

        AgmPrim agm = new AgmPrim(grafo);
        Assert.assertNotNull("AgmPrim wrapper should be created successfully (" + REQ_PREFIX + "01)", agm);

        // When: inserting the same edge twice (duplicate insertion scenario)
        try {
            grafo.insereAresta(u, v, weight);
            grafo.insereAresta(u, v, weight);
        } catch (Exception ex) {
            Assert.fail("Inserting duplicate edges should not throw an unexpected exception: " + ex.getMessage());
        }

        // Then: obtaining the AGM from a valid start node should not throw
        try {
            agm.obterAgm(u);
        } catch (Exception ex) {
            Assert.fail("obterAgm should complete for a valid start node without throwing (" + REQ_PREFIX + "01): " + ex);
        }

        // Sanity check: objects remain non-null after operations
        Assert.assertNotNull("Grafo should still be non-null after operations", grafo);
        Assert.assertNotNull("AgmPrim should still be non-null after operations", agm);
    }

    /**
     * REQ-AGM-02: Verify that a self-loop can be inserted and that obtaining an AGM
     * from that node does not crash (happy-path behavior).
     */
    @Test(timeout = DEFAULT_TIMEOUT)
    public void test1() throws Throwable {
        // Given: a moderately sized graph
        final int graphSize = 57;
        final int node = 18;
        final int weight = 18;

        Grafo grafo = new Grafo(graphSize);
        Assert.assertNotNull("Grafo created for self-loop test (" + REQ_PREFIX + "02)", grafo);

        AgmPrim agm = new AgmPrim(grafo);
        Assert.assertNotNull("AgmPrim created for self-loop test (" + REQ_PREFIX + "02)", agm);

        // When: insert a self-loop and compute AGM starting at that node
        try {
            grafo.insereAresta(node, node, weight);
        } catch (Exception ex) {
            Assert.fail("Inserting a self-loop should not throw an unexpected exception: " + ex.getMessage());
        }

        try {
            agm.obterAgm(node);
        } catch (Exception ex) {
            Assert.fail("obterAgm should not throw when invoked for a node with a self-loop (" + REQ_PREFIX + "02): " + ex);
        }

        // Then: basic invariants hold
        Assert.assertNotNull("After operations, AgmPrim instance should remain available", agm);
    }

    /**
     * REQ-AGM-03: Verify that printing the AGM (imprime) after computation completes
     * and does not throw. This also exercises typical insertion followed by output.
     */
    @Test(timeout = DEFAULT_TIMEOUT)
    public void test2() throws Throwable {
        // Given: graph and AgmPrim
        final int graphSize = 32;
        final int u = 2;
        final int v = 21;
        final int weight = 2;

        Grafo grafo = new Grafo(graphSize);
        Assert.assertNotNull("Grafo created for imprime test (" + REQ_PREFIX + "03)", grafo);

        AgmPrim agm = new AgmPrim(grafo);
        Assert.assertNotNull("AgmPrim created for imprime test (" + REQ_PREFIX + "03)", agm);

        // When: insert an edge and obtain the AGM
        try {
            grafo.insereAresta(u, v, weight);
        } catch (Exception ex) {
            Assert.fail("Edge insertion failed unexpectedly: " + ex.getMessage());
        }

        try {
            agm.obterAgm(u);
        } catch (Exception ex) {
            Assert.fail("obterAgm should not throw for normal input (" + REQ_PREFIX + "03): " + ex);
        }

        // Then: printing should not throw and should be safe to call after computation
        try {
            agm.imprime();
        } catch (Exception ex) {
            Assert.fail("imprime should be safe to call after computing AGM (" + REQ_PREFIX + "03): " + ex);
        }

        Assert.assertNotNull("AgmPrim remains non-null after imprime", agm);
    }

    /**
     * REQ-AGM-04: Verify that antecessor handles invalid negative indices by
     * throwing a NullPointerException (or a documented exception). This test
     * asserts the exceptional behavior and documents the expected failure mode.
     */
    @Test(timeout = DEFAULT_TIMEOUT)
    public void test3() throws Throwable {
        // Given: a graph and AgmPrim instance (empty)
        final int graphSize = 1053;
        final int invalidIndex = -1093;

        Grafo grafo = new Grafo(graphSize);
        Assert.assertNotNull("Grafo created for antecessor-negative-index test (" + REQ_PREFIX + "04)", grafo);

        AgmPrim agm = new AgmPrim(grafo);
        Assert.assertNotNull("AgmPrim created for antecessor-negative-index test (" + REQ_PREFIX + "04)", agm);

        // When / Then: calling antecessor with a negative index is expected to fail.
        try {
            agm.antecessor(invalidIndex);
            Assert.fail("Expected a NullPointerException or similar when calling antecessor with a negative index (" + REQ_PREFIX + "04" + ")");
        } catch (NullPointerException npe) {
            // Expected outcome: document and assert occurrence.
            Assert.assertNull("NullPointerException is expected to have no message in this implementation (" + REQ_PREFIX + "04" + ")", npe.getMessage());
        } catch (Exception ex) {
            // If another exception type is thrown, fail with details for diagnostics.
            Assert.fail("Expected NullPointerException for negative index but got: " + ex.getClass() + " - " + ex.getMessage());
        }
    }
}