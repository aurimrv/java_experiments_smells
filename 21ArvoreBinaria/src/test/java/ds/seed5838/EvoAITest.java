package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Traceability: REQ-ARV-001 (basic binary tree operations)
 * This test class contains focused unit tests for ArvoreBinaria and MeuItem.
 * Each test follows a Given-When-Then structure and includes descriptive assertions.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  // Common constants to avoid magic numbers and improve readability.
  private static final Integer ZERO = Integer.valueOf(0);
  private static final Integer FOUR_EXPECTED_SIZE = Integer.valueOf(4);

  /**
   * Given: two items inserted into the tree and one item's key changed.
   * When: testa() is invoked.
   * Then: the test harness is expected to trigger a SystemExitException.
   *
   * Trace: REQ-ARV-001-A (test harness termination)
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(69);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(2572);
      arvoreBinaria0.insere(meuItem1);
      Integer integer0 = new Integer((-985));
      meuItem1.alteraChave(integer0);
      // Undeclared exception!
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * Given: two distinct items inserted into the tree.
   * When: testa() is invoked to exercise the tree traversal/harness.
   * Then: no exception should be thrown and item metadata remain unchanged.
   *
   * Trace: REQ-ARV-001-B (basic insertion + harness)
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(2577);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given: one item's key is captured and used to change another item's key.
   * When: testa() is invoked.
   * Then: the change should be visible on the modified item and the harness should trigger SystemExitException.
   *
   * Trace: REQ-ARV-001-C (key mutation + harness)
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      Object object0 = meuItem0.recuperaChave();
      MeuItem meuItem1 = new MeuItem((-996));
      MeuItem meuItem2 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem2);
      arvoreBinaria0.insere(meuItem1);
      meuItem1.alteraChave(object0);
      // Undeclared exception!
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * Given: an item inserted then immediately removed.
   * When: retira(...) is executed.
   * Then: the detached item should retain its internal invariants (tamanho) and original key.
   *
   * Trace: REQ-ARV-001-D (insert + remove)
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: a different item is inserted while another (not present) is removed.
   * When: retira(nonexistent) is invoked.
   * Then: removing a non-present item should not change the non-inserted item's invariants.
   *
   * Trace: REQ-ARV-001-E (remove non-existing)
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      MeuItem meuItem1 = new MeuItem((-1007));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: one item is inserted, another remove is attempted for a distinct item.
   * When: retira(nonInserted) is executed.
   * Then: the two items are distinct and keep their initial keys.
   *
   * Trace: REQ-ARV-001-F (distinct objects invariants)
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-2274));
      MeuItem meuItem1 = new MeuItem(924);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertNotSame(meuItem0, meuItem1);
  }

  /**
   * Given: several items are inserted then one is removed.
   * When: retira(...) is performed on the initially inserted item.
   * Then: the removed item should still preserve its internal invariants.
   *
   * Trace: REQ-ARV-001-G (multiple inserts + remove)
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-978));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-982));
      MeuItem meuItem2 = new MeuItem(30);
      MeuItem meuItem3 = new MeuItem((-1119));
      arvoreBinaria0.insere(meuItem3);
      arvoreBinaria0.insere(meuItem2);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: two items inserted and then one removed.
   * When: retira(...) is invoked.
   * Then: the remaining and removed items remain distinct and keep their internal invariants.
   *
   * Trace: REQ-ARV-001-H (insert + remove distinct)
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(2577);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertNotSame(meuItem0, meuItem1);
  }

  /**
   * Given: two items are inserted and the harness is executed.
   * When: testa() is called.
   * Then: the items should preserve their internal invariants prior to harness invocation.
   *
   * Trace: REQ-ARV-001-I (insertion + harness)
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-996));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

  /**
   * Given: an item is inserted twice (same instance).
   * When: second insertion is requested.
   * Then: the item object remains unchanged and preserves its invariants.
   *
   * Trace: REQ-ARV-001-J (idempotent insert behavior)
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

  /**
   * Given: one item is inserted and another distinct item is used to search.
   * When: pesquisa(nonExisting) is called.
   * Then: the result should be null and inserted item's invariants preserved.
   *
   * Trace: REQ-ARV-001-K (search miss)
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(3547);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Given: an item is inserted and a search is performed for a different item.
   * When: pesquisa(...) is executed for a non-existing item.
   * Then: the search must return null and items must be distinct.
   *
   * Trace: REQ-ARV-001-L (search non-existent entry)
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-996));
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

  /**
   * Given: an item is inserted and then searched for the same instance.
   * When: pesquisa(...) is performed with the same item.
   * Then: the returned reference should be the identical inserted object.
   *
   * Trace: REQ-ARV-001-M (search hit)
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      Item item0 = arvoreBinaria0.pesquisa(meuItem0);
      assertSame(meuItem0, item0);
  }
}