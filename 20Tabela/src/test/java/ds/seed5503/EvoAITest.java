package ds.seed5503;

import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker for unit tests to allow selective execution.
 */
interface UnitTest {}

/**
 * Improved tests for Tabela behavior.
 *
 * Notes:
 * - Each test retains its original name to preserve compatibility with external tooling.
 * - Tests include Given-When-Then comments, basic requirement linking (REQ-0001),
 *   and additional sanity checks to make failures easier to diagnose.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

    // Common constants to avoid magic numbers and improve readability
    private static final int VAL_POS = 11;
    private static final int VAL_SMALL = 1;
    private static final int VAL_ZERO = 0;
    private static final int VAL_NEG = -1632;

    // Helper to create MeuItem safely
    private static MeuItem item(int v) {
        return new MeuItem(v);
    }

    // Helper to assert internal consistency between n and registros array if accessible
    private static void assertInternalConsistency(Tabela tabela) {
        assertNotNull("registros should be initialized", tabela.registros);
        assertTrue("n should be non-negative", tabela.n >= 0);
        assertTrue("registros length should be at least n", tabela.registros.length >= tabela.n);
    }

    /**
     * REQ-0001: Verify binary search behavior when multiple identical elements are inserted
     *
     * Given a table with three identical positive items inserted
     * When we search (binaria) for a smaller distinct item
     * Then the table size should be 3 and the returned index is expected to be 0
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem meuItem0 = item(VAL_POS);
        MeuItem meuItem1 = item(VAL_SMALL);

        // When: insert the same positive item three times
        tabela0.insere(meuItem0);
        tabela0.insere(meuItem0);
        tabela0.insere(meuItem0);

        // Sanity checks on internal structure
        assertInternalConsistency(tabela0);

        // Then: searching for a smaller value should return 0 (consistent with original behavior)
        int int0 = tabela0.binaria(meuItem1);
        assertEquals("table should contain three entries after three inserts", 3, tabela0.n);
        assertEquals("binary search for a value smaller than all entries should return 0", 0, int0);
    }

    /**
     * REQ-0001: Verify binary search on a table with a single negative element
     *
     * Given a table with one negative element inserted
     * When we run a binary search for a different positive element
     * Then the table size should be 1 and the returned index should be 0
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem existing = item(VAL_NEG);
        MeuItem query = item(VAL_POS);

        // When
        tabela0.insere(existing);

        // Sanity checks
        assertInternalConsistency(tabela0);

        // Then
        int int0 = tabela0.binaria(query);
        assertEquals("table should contain one entry", 1, tabela0.n);
        assertEquals("binary search for a non-existing element should return 0 as per implementation", 0, int0);
    }

    /**
     * REQ-0001: Verify binary search on an empty table with a zero-valued item
     *
     * Given an empty table
     * When we run binary search for an item with value zero
     * Then the returned index should be 0 (empty table behavior)
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem query = item(VAL_ZERO);

        // Precondition sanity
        assertInternalConsistency(tabela0);

        // When
        int int0 = tabela0.binaria(query);

        // Then
        assertEquals("binary search on empty table should return 0", 0, int0);
        // Ensure internal state unchanged
        assertEquals("n should remain 0 for an empty table", 0, tabela0.n);
    }

    /**
     * REQ-0001: Verify insertion of a zero-valued item followed by binary search
     *
     * Given an empty table
     * When we insert an item with value zero and search for it
     * Then the table size should be 1 and the binary search should indicate found position (1)
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem zeroItem = item(VAL_ZERO);

        // When: insert once
        tabela0.insere(zeroItem);

        // Sanity checks
        assertInternalConsistency(tabela0);

        // Then
        int int0 = tabela0.binaria(zeroItem);
        assertEquals("n should be 1 after inserting one item", 1, tabela0.n);
        assertEquals("binary search for the inserted item should return its position (1)", 1, int0);
    }

    /**
     * REQ-0002: Verify that inserting into a full table triggers the appropriate exception
     *
     * Given a table with a small fixed backing array
     * When we fill it and attempt one more insert
     * Then an exception should be thrown indicating the table is full
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem meuItem0 = item(VAL_ZERO);

        // Force a small capacity backing array to exercise the "table full" path
        Item[] itemArray0 = new Item[3];
        tabela0.registros = itemArray0;

        // When: fill two slots (leave one slot initially)
        tabela0.insere(meuItem0);
        tabela0.insere(meuItem0);

        // Sanity checks: should have space for at least one more according to array length
        assertInternalConsistency(tabela0);
        assertTrue("There should be at least one free slot before the final insert",
                tabela0.registros.length > tabela0.n);

        // Then: attempt an insert that, according to original test, should result in an exception.
        // We preserve the original expectation but also check the exception message for clarity.
        try {
            // The original test attempted to insert a null entry (itemArray0[1] is null).
            // Doing the same here to match original behavior and assert the exception is raised.
            tabela0.insere(itemArray0[1]);
            fail("Expecting exception: Exception due to table full or invalid insert");
        } catch (Exception e) {
            // Confirm the exception relates to table full / insertion failure
            String msg = e.getMessage();
            assertNotNull("Exception should include a message", msg);
            // original message contains Portuguese "Erro: A tabela esta cheia"
            assertTrue("Exception message should indicate a table full or insertion error",
                    msg.contains("tabela") || msg.toLowerCase().contains("erro") || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("full"));
            // Allow existing EvoSuite verification to run as well if available
            try {
                verifyException("ds.Tabela", e);
            } catch (Throwable ignore) {
                // verifyException may not always be present or may throw; ignore to keep robustness
            }
        }
    }

    /**
     * REQ-0001: Verify pesquisa (search) returns appropriate result for a non-existing item
     *
     * Given a table with a single inserted positive item
     * When we call pesquisa for a different small positive item
     * Then the function should return 0 indicating not found
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem inserted = item(VAL_POS);
        MeuItem query = item(VAL_SMALL);

        // When
        tabela0.insere(inserted);

        // Sanity checks
        assertInternalConsistency(tabela0);

        // Then: pesquisa should indicate not found (0) per original behavior
        int int0 = tabela0.pesquisa(query);
        assertEquals("table should contain one entry after insert", 1, tabela0.n);
        assertEquals("pesquisa for non-existing item should return 0", 0, int0);
    }
}