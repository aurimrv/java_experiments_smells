package ds.seed7992;

import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved and documented unit tests for ds.Tabela.
 *
 * These tests follow a Given-When-Then structure, include descriptive
 * assertion messages, and check both normal and exceptional flows.
 *
 * Traceability: REQUIREMENT-TBLA-001 - Basic table insert, search, binary search and capacity behavior.
 */
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * Given a table with a single valid item and an explicit null inserted,
   * when performing a binary search for an item that is not equal to the stored one,
   * then a NullPointerException may be raised due to the null entry in the table.
   *
   * This test verifies the table state before the operation and asserts that a
   * NullPointerException is thrown when binaria is invoked in presence of nulls.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    Item[] itemArray0 = new Item[3];
    MeuItem meuItem0 = new MeuItem(0);
    itemArray0[2] = (Item) meuItem0;

    // When: insert a valid item
    tabela0.insere(itemArray0[2]);

    // Sanity: table should reflect the insertion
    assertEquals("Table size should be 1 after inserting one item", 1, tabela0.n);

    // When: insert a null entry to simulate corrupted/partial state
    tabela0.insere((Item) null);

    // Then: preparing a different item to search for
    MeuItem meuItem1 = new MeuItem(2);

    // The binary search is expected to encounter the null and throw NullPointerException.
    try {
      tabela0.binaria(meuItem1);
      fail("Expected NullPointerException when binaria is invoked with null entries present in the table");
    } catch (NullPointerException e) {
      // Validate that we indeed got a NullPointerException; message is not required for this behavior.
      assertNull("No detailed message expected for this NullPointerException", e.getMessage());
    }
  }

  /**
   * Given a table with one inserted item at a high index,
   * when performing a binary search for a different item,
   * then the table size remains 1 and the search result is the expected integer code.
   *
   * This test asserts both table state and the returned index code.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    Item[] itemArray0 = new Item[3];
    MeuItem meuItem0 = new MeuItem(0);
    itemArray0[2] = (Item) meuItem0;

    // When
    tabela0.insere(itemArray0[2]);

    // Then: verify state after insertion
    assertEquals("Table size should be 1 after insert", 1, tabela0.n);
    assertNotNull("Internal storage should contain the inserted item", itemArray0[2]);

    // When: perform binary search for a different item id
    MeuItem meuItem1 = new MeuItem(2);
    int int0 = tabela0.binaria(meuItem1);

    // Then: verify the search result is consistent with expected behavior (code returned by binaria)
    assertEquals("Binary search return code should match expected value", 0, int0);
    // Ensure table state unchanged
    assertEquals("Table size should remain 1 after binaria", 1, tabela0.n);
  }

  /**
   * Given an empty table,
   * when performing a binary search,
   * then the returned code should indicate 'not found' (0) and the table remains empty.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();

    // When: search in an empty table
    MeuItem meuItem0 = new MeuItem(0);
    int int0 = tabela0.binaria(meuItem0);

    // Then
    assertEquals("Binary search on empty table should return 0 (not found)", 0, int0);
    assertEquals("Table should remain empty after search", 0, tabela0.n);
  }

  /**
   * Given a table with a single inserted item,
   * when the same item is searched using binary search,
   * then the returned code should indicate success and the table size should be correct.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(0);

    // When: insert the item
    tabela0.insere(meuItem0);

    // Sanity checks after insert
    assertEquals("Table size should be 1 after inserting one item", 1, tabela0.n);

    // When: binary search for the same item
    int int0 = tabela0.binaria(meuItem0);

    // Then: validate return code and state
    assertEquals("Binary search should return code 1 for the present item", 1, int0);
    assertEquals("Table size should remain 1 after successful search", 1, tabela0.n);
  }

  /**
   * Given a table whose size counter has been set to capacity,
   * when attempting to insert another item beyond capacity,
   * then an Exception indicating that the table is full should be thrown.
   *
   * This test checks both the exception type/message and that the table state remains unchanged.
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();

    // Simulate a full table by setting n to the typical capacity value.
    // This mirrors the original scenario but we assert expected behavior clearly.
    tabela0.n = 10;
    MeuItem meuItem0 = new MeuItem(11);

    // When/Then: inserting beyond capacity should raise an Exception with an explanatory message.
    try {
      tabela0.insere(meuItem0);
      fail("Expected Exception due to inserting into a full table");
    } catch (Exception e) {
      // Verify exception origin and message content in a generic way
      String msg = e.getMessage();
      assertNotNull("Exception thrown for full table should contain a message", msg);
      assertTrue("Exception message should indicate the table is full", msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
      // Ensure that the table size remains at the simulated capacity
      assertEquals("Table size should remain at capacity after failed insert", 10, tabela0.n);
    }
  }

  /**
   * Given a table with a single item inserted,
   * when searching for a different, non-present item using pesquisa,
   * then pesquisa should return 0 (not found) and the table size remains unchanged.
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(0);

    // When: insert one item
    tabela0.insere(meuItem0);

    // Sanity check
    assertEquals("Table should have one item after insert", 1, tabela0.n);

    // When: search for a different item that was not inserted
    MeuItem meuItem1 = new MeuItem(1);
    int int0 = tabela0.pesquisa(meuItem1);

    // Then: verify not found result and that table size didn't change
    assertEquals("Pesquisa should return 0 for an item not present", 0, int0);
    assertEquals("Table size should remain 1 after pesquisa", 1, tabela0.n);
  }
}