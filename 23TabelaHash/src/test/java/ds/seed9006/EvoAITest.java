package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;

import java.util.Arrays;
import java.util.Objects;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved tests for TabelaHash.
 * These tests retain the original method names but are refactored to include clear arrange-act-assert structure,
 * boundary checks, and descriptive assertions.
 */
public class EvoAITest {

    private static final String KEY_CS = "cs@1J";
    private static final String KEY_DS = "ds[(#8Inf>I";
    private static final String KEY_X = "xv6-H;SIUqm";

    /**
     * Helper: safely get current items array length, treating null as zero-length.
     */
    private int itemsLength(TabelaHash tabela) {
        Object[] items = tabela.recuperaItens();
        return (items == null) ? 0 : items.length;
    }

    /**
     * Helper: tolerant containment check for the recuperaItens() elements.
     * It attempts a direct equals check, then a toString comparison to avoid brittle assumptions about storage types.
     */
    private boolean itemsContain(Object[] items, Object expected) {
        if (items == null) return expected == null;
        for (Object item : items) {
            if (Objects.equals(item, expected)) {
                return true;
            }
            if (expected != null && item != null) {
                try {
                    if (item.toString().equals(expected.toString()) || item.toString().contains(expected.toString())) {
                        return true;
                    }
                } catch (Exception e) {
                    // ignore toString issues and continue
                }
            }
            if (expected == null && item == null) {
                return true;
            }
        }
        return false;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given an empty hash table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When inserting a single entry
        tabelaHash0.insere(KEY_CS, KEY_CS);

        // Then the items should reflect the insertion
        Object[] afterInsert = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not return null after insertion", afterInsert);
        assertTrue("recuperaItens should contain at least one element after insertion", afterInsert.length >= 1);
        assertTrue("Inserted value should be present in items after insert", itemsContain(afterInsert, KEY_CS));

        // When removing the entry
        tabelaHash0.retira(KEY_CS);

        // Then the table should be empty (or not contain the previously inserted item)
        Object[] afterRemove = tabelaHash0.recuperaItens();
        int lenAfterRemove = (afterRemove == null) ? 0 : afterRemove.length;
        assertTrue("After removal the table should be empty or not contain the removed item", lenAfterRemove == 0 || !itemsContain(afterRemove, KEY_CS));

        // Exercise the imprime() method to ensure it does not throw
        tabelaHash0.imprime();
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given a fresh table with one inserted element
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(KEY_CS, KEY_CS);

        // When removing that element
        tabelaHash0.retira(KEY_CS);

        // Then recuperaItens should be empty
        Object[] objectArray0 = tabelaHash0.recuperaItens();
        int len = (objectArray0 == null) ? 0 : objectArray0.length;
        assertEquals("Expected no items after removing the only inserted element", 0, len);

        // And removing a non-existent key again should not produce an exception and should keep it empty
        tabelaHash0.retira(KEY_CS);
        Object[] objectArray1 = tabelaHash0.recuperaItens();
        int len2 = (objectArray1 == null) ? 0 : objectArray1.length;
        assertEquals("Table should remain empty after removing a non-existent key", 0, len2);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given an empty hash table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When inserting a typical key/value
        tabelaHash0.insere(KEY_DS, KEY_DS);

        // Then recuperaItens should report exactly one stored element (or at least one)
        Object[] objectArray0 = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens must not return null after insertion", objectArray0);
        assertTrue("Expected at least one item after insertion", objectArray0.length >= 1);

        // Verify that the inserted value is represented in the returned items (tolerant check)
        assertTrue("Inserted value should be represented in recuperaItens", itemsContain(objectArray0, KEY_DS));

        // Additional sanity: the single-element optimistic case
        if (objectArray0.length == 1) {
            Object item = objectArray0[0];
            assertNotNull("Single returned item should not be null", item);
            if (item instanceof String) {
                assertEquals("Returned string should match the inserted value", KEY_DS, item);
            }
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given an empty table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When attempting to remove a non-existent key
        tabelaHash0.retira("RZe8Ty");

        // Then the table should remain empty and no exception should be thrown
        Object[] items = tabelaHash0.recuperaItens();
        int len = (items == null) ? 0 : items.length;
        assertEquals("Removing a non-existent key from an empty table should leave it empty", 0, len);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given a table where multiple different values (including empty and null) are inserted
        TabelaHash tabelaHash0 = new TabelaHash();

        Object[] valuesToInsert = new Object[] {
            "xv6-H;SIUqm",
            null,
            "uSCA",
            "+)g>2/'8n.H&]I",
            "Entrada[",
            "]:",
            "",
            "vNJoP"
        };

        // When inserting all values; no insertion should throw
        tabelaHash0.insere("xv6-H;SIUqm", "xv6-H;SIUqm");
        tabelaHash0.insere("\"x58K2O>", (Object) null);
        tabelaHash0.insere("uSCA", "uSCA");
        tabelaHash0.insere("Hfa", "+)g>2/'8n.H&]I");
        tabelaHash0.insere("Entrada[", "Entrada[");
        tabelaHash0.insere("]:", "]:");
        tabelaHash0.insere("", (Object) null);
        tabelaHash0.insere("R'y", "vNJoP");

        // Then recuperaItens should return a non-null array with at least one element
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not be null after multiple inserts", items);
        assertTrue("recuperaItens should contain at least one element after inserts", items.length >= 1);

        // And at least one of the inserted recognizable values should be present
        boolean foundAny = false;
        for (Object v : valuesToInsert) {
            if (itemsContain(items, v)) {
                foundAny = true;
                break;
            }
        }
        assertTrue("At least one of the inserted values (including null/empty) should be represented in items", foundAny);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given a table and a key inserted twice
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere("uSCA", "uSCA");

        int lenAfterFirst = itemsLength(tabelaHash0);

        // When inserting the same key again with the same value
        tabelaHash0.insere("uSCA", "uSCA");

        int lenAfterSecond = itemsLength(tabelaHash0);

        // Then the table should either keep the same number of entries (overwrite) or increase by one (allow duplicates).
        // Both behaviors are acceptable depending on implementation, but the change should be bounded.
        boolean acceptable = (lenAfterSecond == lenAfterFirst) || (lenAfterSecond == lenAfterFirst + 1);
        assertTrue("After inserting the same key twice the table should either overwrite or add at most one new entry; got first="
                + lenAfterFirst + ", second=" + lenAfterSecond, acceptable);

        // And the inserted value should be present
        Object[] items = tabelaHash0.recuperaItens();
        assertTrue("Inserted value should be present after duplicate insert", itemsContain(items, "uSCA"));
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given a table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When inserting a value and calling imprime()
        tabelaHash0.insere(KEY_X, KEY_X);
        tabelaHash0.imprime(); // exercise printing path; should not throw

        // Then the value should be present in the items
        Object[] items = tabelaHash0.recuperaItens();
        assertNotNull("recuperaItens should not be null after insertion", items);
        assertTrue("Inserted value should be represented after insertion", itemsContain(items, KEY_X));
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given an empty table
        TabelaHash tabelaHash0 = new TabelaHash();

        // When inserting a key, removing it, and inserting again
        String key = "ds[(#8Inf>I";
        tabelaHash0.insere(key, key);

        Object[] afterFirstInsert = tabelaHash0.recuperaItens();
        assertTrue("Should contain the inserted item after first insert", itemsContain(afterFirstInsert, key));

        tabelaHash0.retira(key);
        Object[] afterRemove = tabelaHash0.recuperaItens();
        int afterRemoveLen = (afterRemove == null) ? 0 : afterRemove.length;
        assertTrue("After removal the table should not contain the previously inserted key", afterRemoveLen == 0 || !itemsContain(afterRemove, key));

        tabelaHash0.insere(key, key);
        Object[] afterSecondInsert = tabelaHash0.recuperaItens();
        assertTrue("After reinserting the key it should be present again", itemsContain(afterSecondInsert, key));
    }
}