package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;

import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for ds.Tabela behaviors.
 *
 * Traceability:
 * - REQ-001: Basic insert/search semantics
 * - REQ-002: Binary search behavior for present/absent items
 * - REQ-003: Table-full handling
 *
 * Notes:
 * - Tests keep original method names to preserve compatibility with external tooling.
 * - Each test follows a Given-When-Then structure in comments and includes clearer assertions.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * REQ-001: When a null entry is present in the table, subsequent binary-search operations
   * may throw a NullPointerException. This test verifies that behavior while asserting pre/post conditions.
   *
   * Given: a fresh table with one valid item and one explicit null inserted.
   * When: performing a binary search for a different item.
   * Then: a NullPointerException is expected and the table retains a single non-null entry.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      assertNotNull("Tabela instance should be created", tabela0);

      MeuItem existing = new MeuItem(-387);
      tabela0.insere(existing);
      // Intentionally insert a null reference to reproduce historical behavior (REQ-001)
      tabela0.insere((Item) null);

      MeuItem probe = new MeuItem(2);
      // When / Then
      try {
          tabela0.binaria(probe);
          fail("Expected NullPointerException when binary-searching with a null entry present (REQ-001)");
      } catch (NullPointerException e) {
          // verify minimal post-conditions: table size still reflects inserted non-null item(s)
          assertEquals("Table should report 1 inserted non-null item after attempting to insert a null",
                       1, tabela0.n);
      }
  }

  /**
   * REQ-002: Binary search on a table with a single, different key should indicate 'not found' (returned 0).
   *
   * Given: a table with one item (key 0).
   * When: performing binary search for key 1.
   * Then: the table size is unchanged and the search indicates 'not found' via returned value 0.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem item0 = new MeuItem(0);
      tabela0.insere(item0);
      assertEquals("After insertion, n should be 1", 1, tabela0.n);

      // When
      MeuItem query = new MeuItem(1);
      int result = tabela0.binaria(query);

      // Then
      assertEquals("Table size should remain 1 after searching for absent key", 1, tabela0.n);
      assertEquals("Binary search for absent key should return 0 (not found) as per REQ-002", 0, result);
  }

  /**
   * REQ-002: Binary search on an empty table should indicate 'not found' (returned 0).
   *
   * Given: an empty table.
   * When: performing binary search for any key.
   * Then: result should be 0 and table remains empty.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem probe = new MeuItem(0);

      // Pre-condition
      assertEquals("New table should be empty (n==0)", 0, tabela0.n);

      // When
      int result = tabela0.binaria(probe);

      // Then
      assertEquals("Binary search on empty table should return 0 (not found)", 0, result);
      assertEquals("Table should remain empty after search", 0, tabela0.n);
  }

  /**
   * REQ-002: Binary search for an item that exists in the table should indicate presence (returned 1).
   *
   * Given: a table with a single item (key 0).
   * When: performing binary search for that same item.
   * Then: the table size is unchanged and the search indicates presence via returned value 1.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem item0 = new MeuItem(0);
      tabela0.insere(item0);

      // Sanity
      assertEquals("After insertion, n should be 1", 1, tabela0.n);

      // When
      int result = tabela0.binaria(item0);

      // Then
      assertEquals("Binary search for existing item should return 1 (found) as per REQ-002", 1, result);
      assertEquals("Table size should remain 1 after searching for existing item", 1, tabela0.n);
  }

  /**
   * REQ-003: When the internal storage is constrained (table full), further insertions should raise an Exception.
   *
   * Given: a table whose internal 'registros' array is adjusted to a small fixed size via reflection.
   * When: inserting items until the capacity is exceeded.
   * Then: an Exception is thrown and the message references the table-full condition.
   *
   * Note: reflection is used here instead of direct field manipulation to avoid compile-time coupling.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      assertNotNull("Tabela instance should be created", tabela0);

      // Reduce internal capacity to 1 to deterministically provoke a 'table full' condition.
      setRegistrosLength(tabela0, 1);

      MeuItem first = new MeuItem(0);
      tabela0.insere(first);
      assertEquals("After first insertion, n should be 1", 1, tabela0.n);

      // When / Then: second insertion should fail due to capacity limit
      try {
          tabela0.insere(new MeuItem(0));
          fail("Expected an Exception indicating the table is full (REQ-003)");
      } catch (Exception e) {
          String msg = e.getMessage();
          assertNotNull("Exception message should be non-null for table-full condition", msg);
          assertTrue("Exception message should indicate 'tabela' or 'cheia' (table full): " + msg,
                     msg.toLowerCase().contains("tabela") || msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
      }
  }

  /**
   * REQ-001: pesquisa should indicate not found (returned 0) when querying for absent key,
   * and should not mutate the table.
   *
   * Given: a table with a single item (key 0).
   * When: searching for key 1.
   * Then: pesquisa returns 0 and table size remains 1.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem item0 = new MeuItem(0);
      tabela0.insere(item0);

      // Sanity
      assertEquals("After insertion, n should be 1", 1, tabela0.n);

      // When
      MeuItem query = new MeuItem(1);
      int result = tabela0.pesquisa(query);

      // Then
      assertEquals("Pesquisa for absent key should return 0 (not found) as per REQ-001", 0, result);
      assertEquals("Table size should remain unchanged after pesquisa", 1, tabela0.n);
  }

  /**
   * Helper: set the length of the 'registros' array on a Tabela instance via reflection.
   * This avoids direct compile-time field access while allowing deterministic capacity control in tests.
   */
  private static void setRegistrosLength(Tabela tabela, int length) throws Exception {
      Field f = Tabela.class.getDeclaredField("registros");
      f.setAccessible(true);
      Object array = Array.newInstance(Item.class, length);
      f.set(tabela, array);
  }
}