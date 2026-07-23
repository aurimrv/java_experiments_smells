package ds.seed5482;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

/**
 * Marker interface for categorizing unit tests in this package.
 */
interface UnitTest {}

/**
 * Improved tests for TabelaHash focusing on clear Given-When-Then structure,
 * single primary action per test and meaningful assertions.
 *
 * Requirement trace: HASH-REQ-001 (basic insert/search/remove behaviors)
 */
@Category(UnitTest.class)
public class EvoAITest {

    private TabelaHash tabela;

    @Before
    public void setUp() {
        // Initialize a fresh instance before each test to avoid cross-test pollution.
        tabela = new TabelaHash();
    }

    @After
    public void tearDown() {
        // No global state to clean in these tests; placeholder for future needs.
        tabela = null;
    }

    /**
     * Given an empty table,
     * When inserting a key/value pair,
     * Then searching for that key returns the stored value.
     */
    @Test(timeout = 4000)
    public void test0() throws Exception {
        // Given
        String key = "";
        String value = "";

        // When
        tabela.insere(key, value);

        // Then
        Object result = tabela.pesquisa(key);
        assertNotNull("Expected pesquisa to find the value after insert", result);
        assertEquals("Stored value should be retrievable by key", value, result);
    }

    /**
     * Given a table with a single entry,
     * When removing that entry,
     * Then the key is no longer present in the table.
     */
    @Test(timeout = 4000)
    public void test1() throws Exception {
        // Given
        String key = "/:";
        String value = "/:";
        tabela.insere(key, value);

        // When (primary action)
        tabela.retira(key);

        // Then
        Object afterRemove = tabela.pesquisa(key);
        assertNull("Expected key to be absent after retira", afterRemove);
    }

    /**
     * Given a table with a single empty-string entry,
     * When removing that entry,
     * Then searching for the empty key returns null.
     */
    @Test(timeout = 4000)
    public void test2() throws Exception {
        // Given
        String key = "";
        String value = "";
        tabela.insere(key, value);

        // When (primary action)
        tabela.retira(key);

        // Then
        Object afterRemove = tabela.pesquisa(key);
        assertNull("Expected empty key to be absent after retira", afterRemove);
    }

    /**
     * Given a key already present in the table,
     * When inserting a new value for the same key,
     * Then the most recent value overwrites the previous one.
     */
    @Test(timeout = 4000)
    public void test3() throws Exception {
        // Given
        String key = "dupKey";
        String firstValue = "first";
        String secondValue = "second";
        tabela.insere(key, firstValue);

        // When (primary action: repeated insert for same key)
        tabela.insere(key, secondValue);

        // Then
        Object result = tabela.pesquisa(key);
        assertNotNull("Expected key to be present after reinsertion", result);
        assertEquals("Most recent insertion should overwrite previous value", secondValue, result);
    }

    /**
     * Given a table with an unrelated entry,
     * When searching for a non-existent complex key,
     * Then pesquisa returns null.
     *
     * Note: Avoids mutating any global random state.
     */
    @Test(timeout = 4000)
    public void test4() throws Exception {
        // Given
        tabela.insere("existing", "value");

        // When
        Object result = tabela.pesquisa("}|$7r");

        // Then
        assertNull("Expected pesquisa to return null for non-existent complex key", result);
    }
}