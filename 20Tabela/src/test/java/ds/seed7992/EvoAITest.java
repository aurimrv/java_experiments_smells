package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * Given: a table where an item and a null entry are inserted.
   * When: a binary search (binaria) is invoked for an unrelated item.
   * Then: a NullPointerException is expected due to the null entry in the table.
   *
   * Traceability: REQ-SEARCH-NULL-ENTRY
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem0;
      tabela0.insere(itemArray0[2]);
      // introduce a null entry to exercise the failure mode
      tabela0.insere((Item) null);

      // When
      MeuItem meuItem1 = new MeuItem(2);

      // Then: NullPointerException is expected when performing binary search
      try {
        tabela0.binaria(meuItem1);
        fail("Expecting exception: NullPointerException when table contains a null entry");
      } catch (NullPointerException e) {
        // Expected: no message asserted; preserve original behavior
      }
  }

  /**
   * Given: a table with a single item inserted (value 0).
   * When: a binary search is performed for value 2.
   * Then: the table size remains 1 and binaria returns 0 as per current implementation.
   *
   * Traceability: REQ-BINARIA-HAPPY-PATH
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      Item[] itemArray0 = new Item[3];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem0;
      tabela0.insere(itemArray0[2]);
      MeuItem meuItem1 = new MeuItem(2);
      int int0 = tabela0.binaria(meuItem1);
      assertEquals(1, tabela0.n);
      assertEquals(0, int0);
  }

  /**
   * Given: an empty table.
   * When: binary search is performed for value 0.
   * Then: method returns 0 (meaning not found / base case).
   *
   * Traceability: REQ-BINARIA-EMPTY-TABLE
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: empty table
      Tabela tabela0 = new Tabela();

      // When: search for item 0
      MeuItem meuItem0 = new MeuItem(0);
      int int0 = tabela0.binaria(meuItem0);

      // Then: verify result with descriptive message
      assertEquals("binaria should return 0 when searching an empty table for value 0", 0, int0);
  }

  /**
   * Given: a table with a single inserted item (value 0).
   * When: binary search is executed for that same item.
   * Then: the table size is 1 and binaria returns 1 according to implementation contract.
   *
   * Traceability: REQ-BINARIA-FIND-EXACT
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.insere(meuItem0);
      int int0 = tabela0.binaria(meuItem0);
      assertEquals(1, tabela0.n);
      assertEquals(1, int0);
  }

  /**
   * Given: a table whose size counter (n) is manually set to full capacity (10).
   * When: an insertion is attempted.
   * Then: an Exception indicating the table is full is expected.
   *
   * Traceability: REQ-INSERE-TABLE-FULL
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Tabela tabela0 = new Tabela();
      tabela0.n = 10; // simulate a full table
      MeuItem meuItem0 = new MeuItem(11);

      // When / Then: insertion should throw an Exception indicating the table is full
      try { 
        tabela0.insere(meuItem0);
        fail("Expecting exception: Exception due to full table");
      } catch(Exception e) {
         // Preserve original verification performed by EvoSuite harness
         verifyException("ds.Tabela", e);
      }
  }

  /**
   * Given: a table with one inserted item (value 0).
   * When: pesquisa is invoked for value 1.
   * Then: the table size remains 1 and pesquisa returns 0 (not found).
   *
   * Traceability: REQ-PESQUISA-NOT-FOUND
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Tabela tabela0 = new Tabela();
      MeuItem meuItem0 = new MeuItem(0);
      tabela0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      int int0 = tabela0.pesquisa(meuItem1);
      assertEquals(1, tabela0.n);
      assertEquals(0, int0);
  }
}