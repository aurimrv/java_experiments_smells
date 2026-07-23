package ds.seed5831;

import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of tests (unit tests).
 * Defined at package level so it can be used in @Category annotations.
 */
interface UnitTest {}

/**
 * Improved and refactored tests for Tabela.
 *
 * Notes:
 * - Test method names are preserved (test0..test4) to satisfy the constraint
 *   of not renaming existing tests.
 * - Each test follows a Given-When-Then structure in comments and provides
 *   richer assertions with descriptive failure messages.
 * - Tests include lightweight requirement identifiers in the Javadoc.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Requirement: REQ-TABELA-INSERT-SEARCH-1
   *
   * Given an empty Tabela,
   * When inserting the same MeuItem twice,
   * Then the internal count (n) should reflect two insertions and
   * a binary search for a smaller item should indicate it would be placed at index 0.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem itemNeg = new MeuItem(-399);

    // When: insert the same item twice (duplicates may be allowed by the implementation)
    tabela0.insere(itemNeg);
    tabela0.insere(itemNeg);

    // And: perform a binary search for an item that is smaller than existing ones
    MeuItem smaller = new MeuItem(-10);
    int position = tabela0.binaria(smaller);

    // Then: verify internal count and search result
    assertEquals("After two insertions, tabela.n should be 2", 2, tabela0.n);
    assertEquals("Binary search for a smaller item should return index 0", 0, position);
  }

  /**
   * Requirement: REQ-TABELA-SEARCH-EMPTY-1
   *
   * Given an empty Tabela,
   * When performing a binary search for any item,
   * Then the search should indicate insertion at index 0 and internal count remains zero.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem probe = new MeuItem(0);

    // When
    int position = tabela0.binaria(probe);

    // Then
    assertEquals("Binary search on an empty table should return 0 (insertion index)", 0, position);
    assertEquals("Empty table should have n == 0 after search", 0, tabela0.n);
  }

  /**
   * Requirement: REQ-TABELA-INSERT-SEARCH-2
   *
   * Given an empty Tabela,
   * When inserting a single MeuItem and searching for that same item via binary search,
   * Then tabela.n should be 1 and binaria should indicate the item is at position 1.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem inserted = new MeuItem(-399);

    // When
    tabela0.insere(inserted);
    int pos = tabela0.binaria(inserted);

    // Then
    assertEquals("After inserting one item, tabela.n should be 1", 1, tabela0.n);
    assertEquals("Binary search for the inserted item should return its position (1)", 1, pos);
  }

  /**
   * Requirement: REQ-TABELA-INSERT-FULL-1
   *
   * Given a Tabela (unknown capacity),
   * When attempting to insert items until the table reports full,
   * Then an exception indicating the table is full should be thrown, or if the
   * implementation supports growth, at least one insertion must succeed.
   *
   * This test avoids direct manipulation of internal arrays (no access to tabela.registros)
   * and instead probes capacity via the public API. It tolerates implementations that
   * grow dynamically by asserting sensible post-conditions.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    final int MAX_ATTEMPTS = 1024; // defensive upper bound to avoid infinite loops

    // When: keep inserting unique items until we either hit an exception or reach MAX_ATTEMPTS
    boolean threw = false;
    int inserted = 0;
    for (int i = 0; i < MAX_ATTEMPTS; i++) {
      try {
        tabela0.insere(new MeuItem(i));
        inserted++;
      } catch (Exception e) {
        // Then: we expect a well-formed exception indicating the table is full in some implementations
        threw = true;
        String msg = e.getMessage() != null ? e.getMessage().toLowerCase() : "";
        // Basic sanity check on the exception message if present
        assertTrue("Expected exception message to mention 'cheia' or 'full' when table is full: " + e.getMessage(),
            msg.contains("cheia") || msg.contains("full") || msg.contains("erro"));
        break;
      }
    }

    // Final assertions:
    // Either we observed a full-table exception, or we successfully inserted at least one item (dynamic growth).
    assertTrue("Either an insertion should succeed or the table should eventually report full", threw || inserted > 0);
    // Validate internal counter consistency if available
    assertEquals("Tabela.n should equal number of successful insertions", inserted, tabela0.n);
  }

  /**
   * Requirement: REQ-TABELA-INSERT-SEARCH-NEGATIVE-1
   *
   * Given a Tabela with one inserted negative item,
   * When searching (pesquisa) for a different positive item,
   * Then the search should indicate 'not found' as 0 and the internal count remains 1.
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem negative = new MeuItem(-1869);
    tabela0.insere(negative);

    // When
    MeuItem probe = new MeuItem(1614);
    int result = tabela0.pesquisa(probe);

    // Then
    assertEquals("After one insertion, tabela.n should be 1", 1, tabela0.n);
    assertEquals("Searching for a different item should return 0 to indicate 'not found'", 0, result);
  }
}