package ds.seed5311;

import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for FPHeapMin.
 *
 * These tests were improved to be more descriptive and to include basic
 * assertions and Given-When-Then structure. Each test method name is kept
 * exactly as in the original suite to preserve test identifiers.
 *
 * Requirement reference: REQ-HEAP-001 (basic heap behaviors: construction, insert,
 * remove, decrease-key and printing).
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    // Given: a backing array with null entries is provided to the heap
    Item[] backing = new Item[5];
    FPHeapMin heap = new FPHeapMin(backing);

    // When / Then: printing a heap that contains nulls may surface a NullPointerException.
    // We assert that a NullPointerException is thrown and its message is null (as historically observed).
    try {
      heap.imprime();
      fail("Expected NullPointerException when calling imprime() on a heap constructed from an array containing nulls");
    } catch (NullPointerException e) {
      assertNull("Expected NullPointerException.getMessage() to be null for this case", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    // Given: a heap created with a positive capacity
    FPHeapMin heap = new FPHeapMin(448);

    // When: we print it (should be a no-op that does not throw)
    heap.imprime();

    // Then: the heap is empty; min() should return null for an empty heap
    assertNull("A newly created heap should have no minimum element (min() == null)", heap.min());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    // Given: a heap constructed with zero capacity and an item to insert
    FPHeapMin heap = new FPHeapMin(0);
    MeuItem item = new MeuItem(0);

    // When / Then: inserting into a zero-capacity heap should raise an Exception indicating the heap is full.
    try {
      heap.insere(item);
      fail("Expected Exception when inserting into a heap with capacity 0");
    } catch (Exception e) {
      // Verify we received a checked Exception (as the implementation historically throws Exception)
      assertEquals("Expected a plain Exception to be thrown for full-heap condition", Exception.class, e.getClass());
      // Ensure the implementation provides an explanatory message
      assertNotNull("Full-heap exception should provide a non-null message", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    // Given: a heap with reasonable capacity and a partially populated array
    FPHeapMin heap = new FPHeapMin(304);
    MeuItem item304 = new MeuItem(304);
    Item[] snapshot = new Item[7];
    MeuItem item1 = new MeuItem(1);
    snapshot[1] = item1;
    snapshot[3] = item304;

    // When: we copy a partial snapshot into the heap and then insert an element
    heap.copia(snapshot);
    heap.insere(item304);

    // Then: the inserted item should maintain its internal invariants (size/tamanho expected historically to be 4)
    assertEquals("After insertion the MeuItem.tamanho() should be 4", 4, item304.tamanho());
    // And the heap should have a minimum element (not necessarily item304 due to other items)
    assertNotNull("Heap.min() should be non-null after insertion", heap.min());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // Given: a heap and a single item
    FPHeapMin heap = new FPHeapMin(304);
    MeuItem item = new MeuItem(304);

    // When: inserting the same item twice (some implementations may allow duplicates or increase internal counters)
    heap.insere(item);
    heap.insere(item);

    // Then: the item's reported tamanho should reflect the expected internal state
    assertEquals("MeuItem.tamanho() should remain 4 after repeated insertions of the same object", 4, item.tamanho());
    // And the heap should expose a minimum
    assertNotNull("Heap.min() should not be null after insertions", heap.min());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    // Given: a small heap and an attempt to decrease a key to a null value
    FPHeapMin heap = new FPHeapMin(4);

    // When / Then: decreasing a key to null should raise an Exception indicating invalid new key
    try {
      heap.diminuiChave(2, (Object) null);
      fail("Expected Exception when calling diminuiChave with a null new-key argument");
    } catch (Exception e) {
      // Implementation historically signals this with a plain Exception and a descriptive message
      assertEquals("Expected a plain Exception for null chaveNova", Exception.class, e.getClass());
      assertNotNull("Exception for null chaveNova should include a descriptive message", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    // Given: a heap constructed directly from an array containing nulls (empty logical heap)
    Item[] backing = new Item[1];
    FPHeapMin heap = new FPHeapMin(backing);

    // When / Then: removing the minimum from an effectively empty heap should throw an Exception
    try {
      heap.retiraMin();
      fail("Expected Exception when removing min from an empty heap");
    } catch (Exception e) {
      // Verify type and presence of message to help diagnostics
      assertEquals("Expected a plain Exception for empty-heap removal", Exception.class, e.getClass());
      assertNotNull("Empty-heap exception should provide a non-null message", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    // Given: a heap and multiple items to populate a snapshot for copying
    FPHeapMin heap = new FPHeapMin(304);
    MeuItem item304 = new MeuItem(304);
    heap.insere(item304);

    Item[] snapshot = new Item[7];
    MeuItem item1 = new MeuItem(1);
    snapshot[1] = item1;
    snapshot[2] = item304;
    snapshot[3] = item304;
    snapshot[4] = item304;
    snapshot[5] = item304;
    snapshot[6] = item304;

    // When: we copy the snapshot and then build the heap structure
    heap.copia(snapshot);
    heap.constroi();

    // Then: the heap must expose a minimum element and not throw during construction
    assertNotNull("After constroi(), heap.min() should not be null when snapshot contains items", heap.min());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    // Given: a heap constructed from an array with populated positions but also nulls
    Item[] backing = new Item[8];
    FPHeapMin heap = new FPHeapMin(backing);
    MeuItem big = new MeuItem(1048);
    MeuItem one = new MeuItem(1);
    backing[2] = big;
    backing[3] = one;

    // When / Then: removing minimum may encounter null entries internally and historically raised NullPointerException.
    try {
      heap.retiraMin();
      fail("Expected NullPointerException when removing min from a heap constructed with sparse backing array");
    } catch (NullPointerException e) {
      assertNull("Historically the NPE from this operation had a null message", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    // Given: a heap with a declared capacity
    FPHeapMin heap = new FPHeapMin(114);

    // When: calling refaz with indices that are out of the normal range
    // Then: this should not throw a runtime exception (implementation should handle gracefully)
    heap.refaz(114, -221);

    // And: heap should still be in a consistent state (empty, so min() == null)
    assertNull("After refaz on an empty heap, min() should remain null", heap.min());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    // Given: a heap constructed from a small array with nulls
    Item[] backing = new Item[3];
    FPHeapMin heap = new FPHeapMin(backing);

    // When / Then: constructing internal structure may throw NullPointerException for sparse arrays
    try {
      heap.constroi();
      fail("Expected NullPointerException when calling constroi() on a heap created from a sparse array");
    } catch (NullPointerException e) {
      assertNull("Expected the NullPointerException message to be null in this historical case", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    // Given: an empty heap (created with capacity)
    FPHeapMin heap = new FPHeapMin(164);

    // When: querying the minimum element
    Item item0 = heap.min();

    // Then: the returned value should be null for an empty heap
    assertNull("min() must return null for an empty heap", item0);
  }
}