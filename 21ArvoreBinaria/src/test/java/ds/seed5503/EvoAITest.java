package ds.seed5503;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

/**
 * Marker interface used to categorize tests as unit tests.
 * Defined at package level so it is visible to @Category annotations.
 */
interface UnitTest {}

/**
 * Improved tests for ArvoreBinaria focusing on clearer Arrange-Act-Assert structure,
 * additional meaningful assertions, descriptive messages and basic traceability.
 *
 * Requirement reference used in Javadoc: REQ-ARB-001 (basic binary-tree insert/search/remove behaviors).
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  /**
   * REQ-ARB-001: Verify that altering a key after insertion may trigger internal validation (testa).
   *
   * Given a tree with two inserted items,
   * When one item's key is altered to an incompatible value,
   * Then calling the internal test routine may produce a SystemExitException.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(-2214);
      MeuItem meuItem1 = new MeuItem(-691);
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem1);

      // Sanity checks (Assert - verify preconditions)
      assertEquals("Inserted items should have default size 4", 4, meuItem0.tamanho());
      assertSame("pesquisa should return the inserted item meuItem0", meuItem0, arvoreBinaria0.pesquisa(meuItem0));
      assertSame("pesquisa should return the inserted item meuItem1", meuItem1, arvoreBinaria0.pesquisa(meuItem1));

      // When: change key on an existing item (may corrupt tree invariants)
      Integer newKey = Integer.valueOf(3576);
      meuItem0.alteraChave(newKey);

      // Then: call testa and expect SystemExitException due to detected inconsistency.
      try {
        arvoreBinaria0.testa();
        fail("Expecting System.SystemExitException due to altered key breaking tree invariants");
      } catch (System.SystemExitException e) {
        // verifyException is provided by EvoSuite runtime assertions helper
        verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * REQ-ARB-001: Validate basic insertion and internal check (testa) for normal values.
   *
   * Given a tree with two negative keys,
   * When the internal test routine is executed,
   * Then it should complete without throwing an exception.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem primeiro = new MeuItem(-2470);
      MeuItem segundo = new MeuItem(-1502);

      // When
      arvoreBinaria0.insere(primeiro);
      arvoreBinaria0.insere(segundo);

      // Then: verify items are searchable and tree invariants hold (testa should not throw)
      assertSame("First inserted item should be found by pesquisa", primeiro, arvoreBinaria0.pesquisa(primeiro));
      assertSame("Second inserted item should be found by pesquisa", segundo, arvoreBinaria0.pesquisa(segundo));
      // Execute internal check; if it throws, the test framework will fail the test.
      arvoreBinaria0.testa();
  }

  /**
   * REQ-ARB-001: When a node key is changed after insertion, internal validation may detect inconsistency.
   *
   * Given a tree with two items,
   * When one item's key is altered,
   * Then calling testa is expected to raise a SystemExitException as a signal of detected inconsistency.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem a = new MeuItem(-1);
      MeuItem b = new MeuItem(-2187);
      arvoreBinaria0.insere(a);
      arvoreBinaria0.insere(b);

      // Preconditions
      assertSame("Item a should be findable before alteration", a, arvoreBinaria0.pesquisa(a));
      assertSame("Item b should be findable before alteration", b, arvoreBinaria0.pesquisa(b));

      // When: alter key of b
      b.alteraChave(Integer.valueOf(2495));

      // Then: expect internal validation to detect the anomaly and throw SystemExitException
      try {
        arvoreBinaria0.testa();
        fail("Expecting System.SystemExitException after key alteration that invalidates tree invariants");
      } catch (System.SystemExitException e) {
        verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * REQ-ARB-001: Inserting multiple negative keys and running internal test should succeed.
   *
   * Given three negative-valued items inserted,
   * When testa is invoked,
   * Then no exception should be thrown and items remain searchable.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem m1 = new MeuItem(-2470);
      MeuItem m2 = new MeuItem(-5102);

      // When
      arvoreBinaria0.insere(m1);
      arvoreBinaria0.insere(m2);

      // Then: basic checks
      assertSame("m1 should be findable", m1, arvoreBinaria0.pesquisa(m1));
      assertSame("m2 should be findable", m2, arvoreBinaria0.pesquisa(m2));
      arvoreBinaria0.testa();
  }

  /**
   * REQ-ARB-001: Removing an inserted item should make it no longer searchable and should not affect the item's internal state size.
   *
   * Given an inserted item,
   * When it is removed,
   * Then pesquisa should not find it and the item's tamanho remains as expected.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem alvo = new MeuItem(-611);
      arvoreBinaria0.insere(alvo);

      // When
      arvoreBinaria0.retira(alvo);

      // Then
      assertNull("Removed item should no longer be findable by pesquisa", arvoreBinaria0.pesquisa(alvo));
      assertEquals("Removed item's internal size should remain 4", 4, alvo.tamanho());
  }

  /**
   * REQ-ARB-001: Removing a non-existent item should not throw and the non-existent item should retain its internal properties.
   *
   * Given a tree with one inserted item,
   * When retira is called with a different item,
   * Then the tree remains unchanged and the argument item's tamanho is unchanged.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem present = new MeuItem(-611);
      MeuItem absent = new MeuItem(0);
      arvoreBinaria0.insere(present);

      // When: attempt to remove an item that was not inserted
      arvoreBinaria0.retira(absent);

      // Then: absent remains absent and its own tamanho is as constructed
      assertNull("Absent item should not be found in the tree", arvoreBinaria0.pesquisa(absent));
      assertEquals("Non-inserted item's tamanho should remain 4", 4, absent.tamanho());
  }

  /**
   * REQ-ARB-001: Removing an item not present in tree is a no-op and does not affect the argument's internal state.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem present = new MeuItem(-2079);
      MeuItem absent = new MeuItem(-3478);
      arvoreBinaria0.insere(present);

      // When
      arvoreBinaria0.retira(absent);

      // Then
      assertNull("Absent item should not be found after attempting removal", arvoreBinaria0.pesquisa(absent));
      assertEquals("Absent item's tamanho should remain unchanged", 4, absent.tamanho());
      // Also ensure present item is still findable
      assertSame("Present item should still be findable after removing an absent item", present, arvoreBinaria0.pesquisa(present));
  }

  /**
   * REQ-ARB-001: Removing a root node when multiple nodes exist should update tree and distinct items remain unequal.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem root = new MeuItem(-2470);
      MeuItem child1 = new MeuItem(-1502);
      MeuItem child2 = new MeuItem(-5102);
      arvoreBinaria0.insere(root);
      arvoreBinaria0.insere(child1);
      arvoreBinaria0.insere(child2);

      // When: remove the root
      arvoreBinaria0.retira(root);

      // Then: removed root should not be equal to remaining child and should not be findable
      assertFalse("Removed root should not be equal to child1", root.equals((Object)child1));
      assertNull("Removed root should no longer be findable", arvoreBinaria0.pesquisa(root));
      assertSame("child1 should still be findable", child1, arvoreBinaria0.pesquisa(child1));
  }

  /**
   * REQ-ARB-001: Removing a left child should leave other nodes intact and items remain distinct.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem left = new MeuItem(-2165);
      MeuItem right = new MeuItem(-611);
      arvoreBinaria0.insere(left);
      arvoreBinaria0.insere(right);

      // When
      arvoreBinaria0.retira(left);

      // Then
      assertFalse("Removed left should not equal right", left.equals((Object)right));
      assertNull("Removed left should not be found", arvoreBinaria0.pesquisa(left));
      assertSame("Right should still be findable", right, arvoreBinaria0.pesquisa(right));
  }

  /**
   * REQ-ARB-001: Inserting the same item twice should not change the item's internal tamanho property.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem item = new MeuItem(-2165);

      // When: insert the same object twice
      arvoreBinaria0.insere(item);
      arvoreBinaria0.insere(item);

      // Then: pesquisa should find the item and its tamanho remains unchanged
      assertSame("Item should be findable after insertion", item, arvoreBinaria0.pesquisa(item));
      assertEquals("Item's tamanho should remain 4 after duplicate insertions", 4, item.tamanho());
  }

  /**
   * REQ-ARB-001: Searching for an absent item should return null.
   *
   * Given a tree with one inserted negative item,
   * When searching for a different item,
   * Then pesquisa should return null.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem present = new MeuItem(-2165);
      MeuItem absent = new MeuItem(-611);
      arvoreBinaria0.insere(present);

      // When
      Item result = arvoreBinaria0.pesquisa(absent);

      // Then
      assertNull("pesquisa should return null for an item that was not inserted", result);
      // also ensure the inserted item is findable
      assertSame("Inserted item should be findable", present, arvoreBinaria0.pesquisa(present));
  }

  /**
   * REQ-ARB-001: Searching for a different key in a tree containing another item should return null.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem inserted = new MeuItem(-1);
      MeuItem query = new MeuItem(-2165);
      arvoreBinaria0.insere(inserted);

      // When
      Item found = arvoreBinaria0.pesquisa(query);

      // Then
      assertNull("Searching for a non-inserted key should return null", found);
      assertSame("Originally inserted item should still be findable", inserted, arvoreBinaria0.pesquisa(inserted));
  }

  /**
   * REQ-ARB-001: Inserting an item and immediately searching for it should return the same instance.
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Given
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem item = new MeuItem(-611);
      arvoreBinaria0.insere(item);

      // When
      Item found = arvoreBinaria0.pesquisa(item);

      // Then
      assertSame("pesquisa should return the exact instance that was inserted", item, found);
      assertEquals("Inserted item's tamanho should be 4", 4, item.tamanho());
  }
}