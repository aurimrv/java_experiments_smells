package ds.seed5482;

import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import java.lang.reflect.Field;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(IntegrationTest.class)
public class EvoAITest extends Tabela_ESTest_scaffolding {

  /**
   * Scenario: Insert two items into an initially empty table and verify
   *           that the binary search (binaria) returns the expected index
   * Given: a new Tabela
   * When:  insert negative item, then insert zero-valued item, then call binaria on the second
   * Then:  table size is 2 and binaria returns the index of the second item
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();

    // When - insert first item (negative value)
    MeuItem meuItem0 = new MeuItem(-631);
    tabela0.insere(meuItem0);

    // And when - insert second item (boundary-like zero)
    MeuItem meuItem1 = new MeuItem(0);
    tabela0.insere(meuItem1);

    // Then - binaria should locate the second item; verify table size and returned index
    int indexFound = tabela0.binaria(meuItem1);
    org.junit.Assert.assertEquals("Expected table size to be 2 after two insertions", 2, tabela0.n);
    org.junit.Assert.assertEquals("binaria should return the index of the recently inserted item", 2, indexFound);

    // Additional sanity: pesquisa should return same semantic result as binaria for same item
    int pesquisaIndex = tabela0.pesquisa(meuItem1);
    org.junit.Assert.assertEquals("pesquisa and binaria should agree for the same item", pesquisaIndex, indexFound);
  }

  /**
   * Scenario: Insert a single item and search for a different item using binary search.
   * Given: a new Tabela with one inserted item
   * When:  call binaria for an item not present
   * Then:  table size remains 1 and binaria returns 0 (not found)
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem existing = new MeuItem(-1289);

    // When
    tabela0.insere(existing);

    // Then - searching for a different value should indicate not found (0) and size unaffected
    MeuItem searchItem = new MeuItem(1);
    int result = tabela0.binaria(searchItem);
    org.junit.Assert.assertEquals("Table size should be 1 after a single insertion", 1, tabela0.n);
    org.junit.Assert.assertEquals("binaria should return 0 for a missing item", 0, result);
  }

  /**
   * Scenario: Perform binary search on an empty table.
   * Given: a fresh Tabela with no insertions
   * When:  binaria is invoked for any item
   * Then:  result indicates not found (0) and table size remains zero
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();

    // When
    MeuItem probe = new MeuItem(0);
    int result = tabela0.binaria(probe);

    // Then
    org.junit.Assert.assertEquals("binaria on an empty table should return 0 (not found)", 0, result);
    org.junit.Assert.assertEquals("Table should remain empty after binaria on empty table", 0, tabela0.n);
  }

  /**
   * Scenario: Attempt to insert into a deliberately sized small backing array to provoke an exception.
   * Given: a Tabela whose internal 'registros' backing array is replaced by a small array
   * When:  an insertion is attempted that causes the implementation to throw
   * Then:  an Exception is raised and the table state is unchanged
   *
   * Note: Reflection is used to avoid relying on package-private implementation details directly.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();

    // Reduce the internal backing array to length 1 via reflection to simulate a full/limited table.
    try {
      setRegistrosLength(tabela0, 1);
    } catch (Exception e) {
      // If we cannot set the backing array, fail the test setup.
      org.junit.Assert.fail("Failed to prepare table internal state for test: " + e.getMessage());
    }

    // Confirm setup: registros length should be 1
    Item[] registrosAfterSetup;
    try {
      Field f = Tabela.class.getDeclaredField("registros");
      f.setAccessible(true);
      registrosAfterSetup = (Item[]) f.get(tabela0);
    } catch (Exception e) {
      registrosAfterSetup = null;
    }
    org.junit.Assert.assertNotNull("Internal registros array should be present after setup", registrosAfterSetup);
    org.junit.Assert.assertEquals("Internal registros length should be 1 for this test", 1, registrosAfterSetup.length);

    // When/Then - expect an exception on insertion (implementation-specific behavior)
    try {
      tabela0.insere((Item) null);
      org.junit.Assert.fail("Expected Exception when inserting into artificially small backing array");
    } catch (Exception e) {
      // Basic checks on the exception: ensure an Exception was thrown and it carries a message
      org.junit.Assert.assertNotNull("Expected exception to have a message (diagnostic)", e.getMessage());
      // Table should not have allowed a successful insertion; n should remain 0
      org.junit.Assert.assertEquals("Table size should remain 0 after failed insertion", 0, tabela0.n);
    }
  }

  /**
   * Scenario: Insert one item and perform a sequential search (pesquisa) for a non-existing item.
   * Given: a Tabela with one inserted item
   * When:  pesquisa is called for a different item
   * Then:  pesquisa indicates not found (0) and table size is unchanged
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Tabela tabela0 = new Tabela();
    MeuItem inserted = new MeuItem(-3589);
    tabela0.insere(inserted);

    // When - search for a different value
    MeuItem probe = new MeuItem(1);
    int foundIndex = tabela0.pesquisa(probe);

    // Then
    org.junit.Assert.assertEquals("Table size should be 1 after one insertion", 1, tabela0.n);
    org.junit.Assert.assertEquals("pesquisa should return 0 for a missing item", 0, foundIndex);

    // Additional check: binary search should agree for the same probe (consistency check)
    int binResult = tabela0.binaria(probe);
    org.junit.Assert.assertEquals("binaria and pesquisa should both indicate not found for the probe", binResult, foundIndex);
  }

  // Helper: set the length of the internal 'registros' array using reflection.
  private static void setRegistrosLength(Tabela tabela, int length) throws Exception {
    if (length < 0) {
      throw new IllegalArgumentException("length must be non-negative");
    }
    Field f = Tabela.class.getDeclaredField("registros");
    f.setAccessible(true);
    Item[] newArray = new Item[length];
    f.set(tabela, newArray);
  }
}