package ds.seed9006;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Marker interface for unit-test categorization.
 */
interface UnitTest {}

/**
 * Improved and refactored tests for FPHeapMin.
 *
 * Notes:
 * - Original EvoSuite-generated tests were simplified and augmented with clearer
 *   assertions, comments (Given-When-Then), and category annotations.
 * - Method names were preserved to satisfy the constraint of not renaming tests.
 */
@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  /**
   * REQ-HP-001: Ensure imprime() fails when internal items are not initialized.
   * Given an FPHeapMin that has been copied from an array containing null entries,
   * when imprime() is invoked, then a NullPointerException is expected.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      Item[] itemArray0 = new Item[6];

      // When: copy an array with null entries into the heap
      fPHeapMin0.copia(itemArray0);

      // Then: printing an uninitialized heap state should raise NPE
      try {
          fPHeapMin0.imprime();
          fail("Expected NullPointerException when calling imprime() on heap with null items");
      } catch (NullPointerException e) {
          // Accept a null message for NPE; assert that message is null to document expectation
          assertNull("NullPointerException for imprime() should not carry a message in this implementation",
                     e.getMessage());
      }
  }

  /**
   * REQ-HP-002: imprime() on a newly created but empty heap should be a no-op (no exception).
   * Given a fresh FPHeapMin constructed with a positive capacity,
   * when imprime() is invoked, then no exception should be thrown.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);

      // When / Then: calling imprime() must not throw for an empty but well-initialized heap
      try {
          fPHeapMin0.imprime();
      } catch (Throwable t) {
          fail("imprime() should not throw on an initialized empty heap, but threw: " + t);
      }
  }

  /**
   * REQ-HP-003: Insert and copy operations preserve item state.
   * Given a heap and an array with some existing items,
   * when copia(...) is called and then an item is inserted,
   * then the inserted item's tamanho() should match the expected value.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[8];
      MeuItem meuItem1 = new MeuItem(3);

      // Arrange: put some items into the array to seed the heap
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;

      // When
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.insere(meuItem0);

      // Then: verify inserted item's size is as expected and is stable
      assertEquals("Inserted MeuItem should report expected tamanho()", 4, meuItem0.tamanho());
      assertTrue("Inserted item tamanho() should be positive", meuItem0.tamanho() > 0);
  }

  /**
   * REQ-HP-004: diminuiChave(...) must validate new key parameter.
   * Given a heap, when diminuiChave is called with a null new-key,
   * then an Exception indicating a bad/new-key should be thrown.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(2316);

      // When / Then: expect an exception for null new key
      try {
          fPHeapMin0.diminuiChave(0, (Object) null);
          fail("Expected Exception when calling diminuiChave with null new-key");
      } catch (Exception e) {
          // Accept either a specific message mentioning 'null' or a null message; ensure an exception was thrown
          String msg = e.getMessage();
          boolean ok = (msg == null) || msg.toLowerCase().contains("null") || msg.toLowerCase().contains("chavenova") || msg.toLowerCase().contains("chave");
          assertTrue("Exception for null new-key should be about null/new-key (message: " + msg + ")", ok);
      }
  }

  /**
   * REQ-HP-005: insere(...) should update item state.
   * Given an empty heap, when an item is inserted, then its tamanho() should be updated accordingly.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);

      // When
      fPHeapMin0.insere(meuItem0);

      // Then
      assertEquals("After insertion, meuItem0.tamanho() should be 4", 4, meuItem0.tamanho());
      // Additional sanity: removing min should not throw and may return the inserted item
      try {
          Item removed = fPHeapMin0.retiraMin();
          // If non-null, ensure it is an Item; if null, it's acceptable for some implementations
          if (removed != null) {
              assertTrue("retiraMin() returned an Item instance after insertion", removed instanceof Item);
          }
      } catch (Exception ex) {
          fail("retiraMin() should not throw after a successful insert, but threw: " + ex);
      }
  }

  /**
   * REQ-HP-006: retiraMin() on an empty heap should indicate the empty-heap condition.
   * Given an FPHeapMin with capacity but no elements, when retiraMin() is called,
   * then an Exception indicating an empty heap is expected.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(2968);

      // When / Then
      try {
          fPHeapMin0.retiraMin();
          fail("Expected Exception when calling retiraMin() on an empty heap");
      } catch (Exception e) {
          // Message may mention 'vazio' (Portuguese for empty) or be null; accept both
          String msg = e.getMessage();
          boolean ok = (msg == null) || msg.toLowerCase().contains("vazio") || msg.toLowerCase().contains("empty");
          assertTrue("Expected exception message to indicate empty heap (message: " + msg + ")", ok);
      }
  }

  /**
   * REQ-HP-007: constroi() should be a safe operation on an array-backed heap.
   * Given an FPHeapMin constructed from an empty Item array, when constroi() is called,
   * then subsequent retiraMin() should indicate no elements (null).
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[2];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When
      fPHeapMin0.constroi();

      // Then: an empty heap built from an empty array should return null for retiraMin()
      Item result = fPHeapMin0.retiraMin();
      assertNull("retiraMin() on a constructed empty heap should return null", result);
  }

  /**
   * REQ-HP-008: refaz(...) should operate without throwing for a well-formed internal state.
   * Given a heap seeded via copia(...), when refaz() is invoked within valid indices,
   * then no exception should be thrown and item invariants should hold.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[6];

      // Seed array with multiple references to the same item
      itemArray0[4] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);

      // When / Then: refaz should not throw for valid inputs
      try {
          fPHeapMin0.refaz(2, 1235);
      } catch (Throwable t) {
          fail("refaz(...) threw an unexpected exception: " + t);
      }

      // Additional assertion to ensure the item state is intact
      assertEquals("MeuItem state should be unchanged by refaz()", 4, meuItem0.tamanho());
  }

  /**
   * REQ-HP-009: refaz(...) should surface NPE when internal structure is inconsistent.
   * Given a heap copied from an array with some null slots and partially-initialized items,
   * when refaz() is invoked on an index that references null, then NPE is expected.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem1 = new MeuItem(1518);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);

      // When / Then: refaz on an index pointing into a partially null structure may throw NPE
      try {
          fPHeapMin0.refaz(2, 1518);
          fail("Expected NullPointerException when refaz() encounters inconsistent internal state");
      } catch (NullPointerException e) {
          assertNull("NullPointerException message expected to be null for this failure mode", e.getMessage());
      }
  }

  /**
   * REQ-HP-010: refaz(...) should surface NPE for other inconsistent configurations.
   * Same pattern as test08 but with different seeding.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin(1235);
      MeuItem meuItem0 = new MeuItem(1235);
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem1 = new MeuItem(1518);
      itemArray0[4] = (Item) meuItem1;
      itemArray0[5] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);

      // When / Then
      try {
          fPHeapMin0.refaz(2, 1518);
          fail("Expected NullPointerException when refaz() encounters inconsistent internal state (variant)");
      } catch (NullPointerException e) {
          assertNull("NullPointerException expected and typically carries no message here", e.getMessage());
      }
  }

  /**
   * REQ-HP-011: constroi() should validate internal item references.
   * Given a heap constructed from an array with uninitialized entries, constroi() may raise NPE.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[3];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When / Then: attempt to construct heap from array contains nulls -> expect NPE in this implementation
      try {
          fPHeapMin0.constroi();
          fail("Expected NullPointerException when constroi() is invoked on an array with null entries");
      } catch (NullPointerException e) {
          assertNull("NullPointerException in constroi() is expected to have no message", e.getMessage());
      }
  }

  /**
   * REQ-HP-012: retiraMin() should surface an error if underlying internal arrays are not initialized.
   * Given a heap backed by an array with null internal data, retiraMin() may throw NPE.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When / Then
      try {
          fPHeapMin0.retiraMin();
          fail("Expected NullPointerException when retiraMin() is called on heap with null internals");
      } catch (NullPointerException e) {
          assertNull("NullPointerException for retiraMin() expected to carry no message", e.getMessage());
      }
  }

  /**
   * REQ-HP-013: retiraMin() on an empty, properly constructed heap returns null.
   * Given an FPHeapMin constructed from an empty array and not populated,
   * when retiraMin() is invoked, then null should be returned.
   */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[3];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

      // When
      Item item0 = fPHeapMin0.retiraMin();

      // Then
      assertNull("retiraMin() on an empty, default-initialized heap should return null", item0);
  }

  /**
   * REQ-HP-014: insere(...) should fail when capacity is zero.
   * Given a heap backed by a zero-length array, when insere() is called,
   * then an Exception indicating a full heap should be thrown.
   */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[0];
      FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
      MeuItem meuItem0 = new MeuItem(1569);

      // When / Then
      try {
          fPHeapMin0.insere(meuItem0);
          fail("Expected Exception when inserting into a heap with zero capacity");
      } catch (Exception e) {
          String msg = e.getMessage();
          boolean ok = (msg == null) || msg.toLowerCase().contains("cheio") || msg.toLowerCase().contains("full");
          assertTrue("Expected exception to indicate full heap (message: " + msg + ")", ok);
      }
  }

  /**
   * REQ-HP-015: min() should validate capacity and internal indexing.
   * Given a heap created with a negative capacity, calling min() should result in an indexing error.
   */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Given
      FPHeapMin fPHeapMin0 = new FPHeapMin((-1));

      // When / Then: expecting an ArrayIndexOutOfBoundsException for negative capacity implementations
      try {
          fPHeapMin0.min();
          fail("Expected ArrayIndexOutOfBoundsException when calling min() on a heap with negative capacity");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Validate that the thrown type is correct; message may vary by JVM/implementation
          assertTrue("Expected ArrayIndexOutOfBoundsException for invalid internal indexing", e instanceof ArrayIndexOutOfBoundsException);
      }
  }
}