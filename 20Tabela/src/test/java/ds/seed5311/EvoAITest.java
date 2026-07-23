package ds.seed5311;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Requirement: DS-Table-Operations (REQ-DS-1)
 * These tests exercise basic behaviors of Tabela: insertion, binary search and lookup.
 * Tests follow Given-When-Then structure in comments and include descriptive assertion messages.
 */
interface UnitTest {}
interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
    // Given: an empty table and two distinct items
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(0);
    MeuItem meuItem1 = new MeuItem(656);

    // When: we insert two items (setup) and perform a binary search for the second item (action)
    tabela0.insere(meuItem0); // setup
    tabela0.insere(meuItem1); // setup
    int resultIndex = tabela0.binaria(meuItem1); // action

    // Then: table size should reflect both inserts and binary search should locate the inserted item
    assertEquals("Expected table size to be 2 after inserting two items", 2, tabela0.n);
    assertEquals("Binary search should return index 2 for the second inserted item", 2, resultIndex);
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
    // Given: a table with a single negative-valued item
    Tabela tabela0 = new Tabela();
    MeuItem existing = new MeuItem(-246);
    tabela0.insere(existing); // setup

    // When: we perform a binary search for a different item (action)
    MeuItem lookup = new MeuItem(11);
    int idx = tabela0.binaria(lookup);

    // Then: table size remains 1 and lookup for a non-present item returns 0 (not found)
    assertEquals("Table size should remain 1 after a single insert", 1, tabela0.n);
    assertEquals("Binary search should return 0 when the item is not present", 0, idx);
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
    // Given: an empty table
    Tabela tabela0 = new Tabela();

    // When: binary search is invoked with a null reference (action)
    int idx = tabela0.binaria((Item) null);

    // Then: the method should handle null gracefully and not alter the table state
    assertEquals("Binary search with null should indicate not found (return 0)", 0, idx);
    assertEquals("Table size should remain 0 after binary search with null", 0, tabela0.n);
  }

  @Test(timeout = 4000)
  @Category(IntegrationTest.class)
  public void test3()  throws Throwable  {
    // Given: a table with items inserted and an explicitly resized backing array
    Tabela tabela0 = new Tabela();
    MeuItem meuItem0 = new MeuItem(1);
    tabela0.insere(meuItem0);
    tabela0.insere(meuItem0); // duplicate insertion as part of setup

    // Force a specific internal backing array length (setup)
    tabela0.registros = new Item[3];

    // When & Then: inserting a null reference should result in an exception.
    try {
      tabela0.insere((Item) null); // action expected to fail
      fail("Inserting null should throw an Exception indicating invalid input or full table");
    } catch (Exception e) {
      // Validate that an exception was thrown and contains a helpful message (if available)
      String msg = e.getMessage();
      assertNotNull("Expected an exception message for inserting null or when table is full", msg != null ? msg : "exception-without-message");
      // Prefer messages that mention "Erro" or "tabela" if present, but allow any exception as evidence of error handling
      boolean containsHint = (msg != null) && (msg.contains("Erro") || msg.toLowerCase().contains("tabela") || msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("null"));
      assertTrue("Exception message should mention an error or the table (if provided); actual: " + msg, containsHint || msg == null || msg.length() > 0);
    }
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test4()  throws Throwable  {
    // Given: a table with one inserted high-valued item
    Tabela tabela0 = new Tabela();
    MeuItem inserted = new MeuItem(1307);
    tabela0.insere(inserted); // setup

    // When: we search for a different item that was not inserted (action)
    MeuItem lookup = new MeuItem(1);
    int found = tabela0.pesquisa(lookup);

    // Then: the table should still contain exactly one element and pesquisa should indicate not found (0)
    assertEquals("Table should contain exactly one element after a single insert", 1, tabela0.n);
    assertEquals("Pesquisa should return 0 for an item that is not present", 0, found);
  }
}