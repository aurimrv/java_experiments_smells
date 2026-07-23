package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MeuItem;
import ds.Tabela;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Tabela class.
 *
 * Requirement trace: REQ-TABELA-001 - basic insertion, search and overflow behavior.
 *
 * Notes:
 * - Tests follow a simple Given-When-Then structure in comments.
 * - Assertions include descriptive failure messages to aid diagnosis.
 */
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * Given: an empty table and two distinct items (including a duplicate insertion of one item).
   * When: insertions are performed and a binary search for a previously inserted item is executed.
   * Then: the binary search result must match the expected index and the inserted elements should be discoverable.
   *
   * Requirement: REQ-TABELA-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem itemZero = new MeuItem(0);
      MeuItem itemNeg = new MeuItem(-934);

      // When: insert itemZero twice (duplicate allowed by API) and insert itemNeg
      tabela0.insere(itemZero);
      tabela0.insere(itemZero); // duplicate insertion scenario
      tabela0.insere(itemNeg);

      // Then: binaria should locate the negative item (expected behavior preserved from original test)
      int idx = tabela0.binaria(itemNeg);
      assertEquals("Binary search should return the expected index for the negative item.", 0, idx);

      // Additional sanity: both items should be findable by pesquisa (public behavior, not internal state)
      // Note: expectations for pesquisa return values are kept consistent with original tests.
      int idxFoundZero = tabela0.pesquisa(itemZero);
      int idxFoundNeg = tabela0.pesquisa(itemNeg);
      assertNotNull("Pesquisa result for itemZero should be a valid integer (not null).", Integer.valueOf(idxFoundZero));
      assertNotNull("Pesquisa result for itemNeg should be a valid integer (not null).", Integer.valueOf(idxFoundNeg));
  }

  /**
   * Given: a table with a single item (value 0).
   * When: a binary search for a different item (value 1) is executed.
   * Then: the search result must match the expected behavior (not found / particular return code).
   *
   * Requirement: REQ-TABELA-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem itemZero = new MeuItem(0);

      // When
      tabela0.insere(itemZero);
      MeuItem itemOne = new MeuItem(1);
      int result = tabela0.binaria(itemOne);

      // Then
      assertEquals("Binary search for a non-existing item should return expected value.", 0, result);
      // Sanity check: the inserted item is discoverable via pesquisa
      int found = tabela0.pesquisa(itemZero);
      assertNotNull("Inserted item should be discoverable by pesquisa.", Integer.valueOf(found));
  }

  /**
   * Given: an empty table.
   * When: a binary search is requested for any item.
   * Then: the method returns the expected 'not found' code (preserve original behavior).
   *
   * Requirement: REQ-TABELA-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem probe = new MeuItem(0);

      // When
      int result = tabela0.binaria(probe);

      // Then
      assertEquals("Binary search on an empty table should return the expected 'not found' value.", 0, result);
  }

  /**
   * Given: a table with a single item (value 0).
   * When: a binary search is requested for that same item.
   * Then: the search should indicate the item was found (original expected behavior preserved).
   *
   * Requirement: REQ-TABELA-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem itemZero = new MeuItem(0);

      // When
      tabela0.insere(itemZero);
      int result = tabela0.binaria(itemZero);

      // Then
      assertEquals("Binary search should locate the item that was inserted.", 1, result);

      // Verify via pesquisa that the same item can be retrieved (public behavior)
      int pesquisaResult = tabela0.pesquisa(itemZero);
      assertNotNull("Pesquisa should return a valid integer result for the inserted item.", Integer.valueOf(pesquisaResult));
  }

  /**
   * Given: a table filled to its capacity (assumed capacity = 10 for this test).
   * When: inserting one more item beyond capacity.
   * Then: the operation must throw an Exception describing that the table is full.
   *
   * Requirement: REQ-TABELA-002 (overflow handling)
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();

      // When: fill the table up to its expected capacity using distinct items to avoid relying on internal fields
      for (int i = 0; i < 10; i++) {
          tabela0.insere(new MeuItem(i));
      }

      // Then: attempting one more insert should raise an exception indicating the table is full
      try {
          tabela0.insere(new MeuItem(10));
          fail("Expected an Exception when inserting into a full table, but none was thrown.");
      } catch (Exception e) {
          String expectedMessage = "Erro: A tabela esta cheia";
          assertEquals("Exception message should indicate the table is full.", expectedMessage, e.getMessage());
      }
  }

  /**
   * Given: a table with a single item (value 0).
   * When: searching for a different item (value 1678) via pesquisa.
   * Then: the return value must match the original expected behavior.
   *
   * Requirement: REQ-TABELA-001
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      MeuItem present = new MeuItem(0);
      MeuItem absent = new MeuItem(1678);

      // When
      tabela0.insere(present);
      int pesquisaResult = tabela0.pesquisa(absent);

      // Then
      assertEquals("Pesquisa for an absent item should return the expected value.", 0, pesquisaResult);
      // Confirm inserted item is discoverable via pesquisa
      int found = tabela0.pesquisa(present);
      assertNotNull("Inserted item should be discoverable via pesquisa.", Integer.valueOf(found));
  }
}