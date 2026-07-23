package ds.seed9121;

import ds.MeuItem;
import ds.Tabela;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Marker interface for unit tests so they can be selected by category.
 */
interface UnitTest {}

/**
 * Improved and documented tests for Tabela operations.
 *
 * Note:
 * - Tests retain the original method names (test0..test4) for compatibility.
 * - Each test follows a Given-When-Then structure, includes assertions with messages,
 *   and contains a lightweight traceability tag in the Javadoc (REQ-TEST).
 */
@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest {

    private static final int MAX_INSERT_ATTEMPTS = 20;

    @Before
    public void setUp() {
        // Common setup could be placed here if needed in the future.
    }

    /**
     * REQ-TEST-001
     *
     * Given an empty table,
     * When the same item is inserted twice and an unrelated item is searched via binary search,
     * Then the table size increases accordingly and binary search for the unrelated item indicates 'not found' (0).
     */
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem inserted = new MeuItem(1);
        MeuItem searchForMissing = new MeuItem(2088);

        // When: insert the same item twice (testing duplicate handling)
        tabela0.insere(inserted);
        tabela0.insere(inserted);

        // Then
        assertEquals("After inserting the same item twice, table size should be 2", 2, tabela0.n);

        // Binary search for an item that was not inserted should indicate not found (original test expected 0)
        int pos = tabela0.binaria(searchForMissing);
        assertEquals("Binary search for a missing item should return 0", 0, pos);
    }

    /**
     * REQ-TEST-002
     *
     * Given an empty table,
     * When searching for a negative-valued item,
     * Then the search should indicate 'not found' and the table remains empty.
     */
    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem target = new MeuItem(-797);

        // When
        int result = tabela0.binaria(target);

        // Then
        assertEquals("Search in empty table must return 0 (not found)", 0, result);
        assertEquals("Table size should remain 0 after searching empty table", 0, tabela0.n);
    }

    /**
     * REQ-TEST-003
     *
     * Given an empty table,
     * When an item is inserted and then searched via binary search,
     * Then the table size increases to 1 and the binary search returns the expected position (1).
     */
    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem item = new MeuItem(-1);

        // When
        tabela0.insere(item);
        int pos = tabela0.binaria(item);

        // Then
        assertEquals("Table size should be 1 after inserting one item", 1, tabela0.n);
        assertEquals("Binary search should find the inserted item at position 1", 1, pos);
    }

    /**
     * REQ-TEST-004
     *
     * Given a table,
     * When inserting items until capacity is reached,
     * Then an insertion beyond capacity should throw an Exception with an informative message.
     *
     * This test avoids coupling to internal fields by inserting items through the public API
     * until an exception occurs.
     */
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        // Given
        Tabela tabela0 = new Tabela();

        // When: keep inserting distinct items until insertion fails due to capacity.
        int successfulInserts = 0;
        Exception observed = null;
        for (int i = 0; i < MAX_INSERT_ATTEMPTS; i++) {
            try {
                tabela0.insere(new MeuItem(i + 1000)); // distinct values to avoid duplicate behavior affecting size
                successfulInserts++;
            } catch (Exception e) {
                observed = e;
                break;
            }
        }

        // Then: we expect an exception at or before MAX_INSERT_ATTEMPTS; assert it and inspect message.
        assertNotNull("Expected an exception when inserting beyond capacity, but none occurred within attempts",
                observed);
        String msg = observed.getMessage();
        assertTrue("Exception message should indicate full table (contain 'cheia' or 'full') but was: " + msg,
                (msg != null && (msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"))));

        // Also assert that at least one insert succeeded and that the reported size matches the number of successful inserts.
        assertTrue("At least one insert should have succeeded before capacity was reached", successfulInserts > 0);
        assertEquals("Tabela.n must reflect the number of successful inserts", successfulInserts, tabela0.n);
    }

    /**
     * REQ-TEST-005
     *
     * Given an empty table,
     * When an item with key 0 is inserted and a different item is searched,
     * Then the table size should be 1 and the search for the different item should return 0 (not found).
     */
    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        // Given
        Tabela tabela0 = new Tabela();
        MeuItem inserted = new MeuItem(0);
        MeuItem missing = new MeuItem(4);

        // When
        tabela0.insere(inserted);
        int pos = tabela0.pesquisa(missing);

        // Then
        assertEquals("Table size should be 1 after one insertion", 1, tabela0.n);
        assertEquals("Search for a non-inserted item should return 0 (not found)", 0, pos);
    }
}