package ds.seed5838;

import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Requirement: DS-TABLE-01
 * Tests for basic behaviors of Tabela: insertion, binary search (binaria) and pesquisa.
 *
 * Notes:
 * - Tests follow a Given-When-Then structure in comments.
 * - Each test concentrates on a single observable behavior.
 * - This test class is categorized as UnitTest to allow selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

    private static final int MAX_FILL_ATTEMPT = 1000;

    /**
     * Given a fresh table, when two items are inserted, then the table size (n) should be 2
     * and binaria should report the expected index for the second inserted item.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Tabela tabela = new Tabela();
        MeuItem item0 = new MeuItem(0);
        MeuItem item1 = new MeuItem(1);

        // When
        tabela.insere(item0);
        tabela.insere(item1);
        int result = tabela.binaria(item1);

        // Then
        assertEquals("After inserting two items, tabela.n should be 2", 2, tabela.n);
        assertEquals("binaria should return the insertion/search index for the second item", 2, result);
    }

    /**
     * Given a table with one item, when binaria is invoked for a non-present item,
     * then binaria should return 0 (indicating not found / insertion point per implementation).
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Tabela tabela = new Tabela();
        MeuItem existing = new MeuItem(0);
        tabela.insere(existing);
        MeuItem missing = new MeuItem(1);

        // When
        int result = tabela.binaria(missing);

        // Then
        assertEquals("Tabela should contain one item after insertion", 1, tabela.n);
        assertEquals("binaria for a non-present item should return 0 as per current implementation", 0, result);
    }

    /**
     * Given an empty table, when binaria is invoked with any item, then it should return 0.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Tabela tabela = new Tabela();
        MeuItem probe = new MeuItem(0);

        // When
        int result = tabela.binaria(probe);

        // Then
        assertEquals("binaria on an empty table should return 0", 0, result);
    }

    /**
     * Given a table, when inserting items until the table is full, then an exception should be thrown
     * indicating the table is full. This test attempts to insert up to MAX_FILL_ATTEMPT items and expects
     * to observe the "cheia" (full) condition at some point for reasonable table implementations.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Tabela tabela = new Tabela();

        // When
        boolean sawException = false;
        int successfulInserts = 0;
        for (int i = 0; i < MAX_FILL_ATTEMPT; i++) {
            try {
                tabela.insere(new MeuItem(i));
                successfulInserts++;
            } catch (Exception e) {
                // Then
                sawException = true;
                String msg = e.getMessage() == null ? "" : e.getMessage().toLowerCase();
                // Expect the implementation to provide a message indicating the table is full (in Portuguese or English).
                boolean indicatesFull = msg.contains("cheia") || msg.contains("tabela") || msg.contains("full");
                assertTrue("Expected exception message to indicate a full table, got: " + e.getMessage(), indicatesFull);
                break;
            }
        }

        // If no exception occurred within reasonable attempts, fail to highlight missing full-table behavior.
        if (!sawException) {
            fail("Did not observe a table-full exception after " + successfulInserts + " inserts; check table capacity behavior.");
        }
        assertTrue("There should be at least one successful insert before the table became full", successfulInserts > 0);
    }

    /**
     * Given a table with one inserted item (id = 1), when searching for a different item (id = 0)
     * using pesquisa, then pesquisa should return 0 and the table size should remain 1.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Tabela tabela = new Tabela();
        MeuItem present = new MeuItem(1);
        MeuItem absent = new MeuItem(0);

        // When
        tabela.insere(present);
        int result = tabela.pesquisa(absent);

        // Then
        assertEquals("After inserting one item, tabela.n should be 1", 1, tabela.n);
        assertEquals("Pesquisa for a missing item should return 0 per current implementation", 0, result);
    }
}