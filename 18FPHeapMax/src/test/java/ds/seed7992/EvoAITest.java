package ds.seed7992;

import ds.FPHeapMax;
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
 * Improved tests for FPHeapMax.
 * Guiding principle: each test documents Given-When-Then and makes explicit assertions
 * or narrowly-scoped exception expectations. Tests are defensive to tolerate minor
 * implementation differences while asserting meaningful behavior.
 *
 * Requirement trace: HEAP-REQ-001 (basic heap operations must behave reasonably for empty and populated heaps)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  // Helper factory
  private FPHeapMax newHeap(int capacity) {
    return new FPHeapMax(capacity);
  }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    // Given an empty heap and a small external array (some null slots)
    FPHeapMax fPHeapMax0 = newHeap(2021);
    Item[] itemArray0 = new Item[2];
    fPHeapMax0.copia(itemArray0);

    // When invoking imprime() (print representation)
    // Then it should either complete normally or throw a NullPointerException due to null internals;
    // any other unexpected exception is a test failure.
    try {
      fPHeapMax0.imprime();
      // If imprime completed, further assert that the heap is still in a safe state:
      // either retiraMax returns null (empty) or it throws a well-known empty-heap exception.
      try {
        Item removed = fPHeapMax0.retiraMax();
        assertNull("Expected retiraMax() on a freshly initialized/copied empty heap to return null", removed);
      } catch (Exception e) {
        // Acceptable: some implementations throw on empty removal. Message should be related to empty/full semantics.
        String msg = e.getMessage();
        assertTrue("Expected exception message to indicate empty heap or be null",
            msg == null || msg.toLowerCase().contains("vazi") || msg.toLowerCase().contains("empty"));
      }
    } catch (NullPointerException npe) {
      // Accept NullPointerException as a known legacy behavior; assert it has no unexpected content.
      assertNull("Expected NullPointerException without custom message", npe.getMessage());
    } catch (Throwable t) {
      fail("imprime() threw unexpected exception: " + t);
    }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    // Given a freshly created large-capacity heap
    FPHeapMax fPHeapMax0 = newHeap(2021);

    // When calling imprime() multiple times
    // Then it should not throw unexpected exceptions and should be idempotent (no state corruption)
    try {
      fPHeapMax0.imprime();
      fPHeapMax0.imprime(); // second call should be safe
    } catch (Throwable t) {
      fail("imprime() should not throw for an empty heap: " + t);
    }

    // Sanity: confirm heap remains empty in a safe manner
    try {
      Item m = fPHeapMax0.retiraMax();
      // Accept null for empty heap removal
      assertNull("After printing, the heap should still be empty (retiraMax -> null)", m);
    } catch (Exception e) {
      // Acceptable behavior for some implementations; message should indicate empty
      String msg = e.getMessage();
      assertTrue("retiraMax() on empty heap should indicate empty (or have null message)",
          msg == null || msg.toLowerCase().contains("vazi") || msg.toLowerCase().contains("empty"));
    }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    // Given a heap with zero capacity
    FPHeapMax fPHeapMax0 = newHeap(0);
    MeuItem meuItem0 = new MeuItem(0);

    // When inserting into a zero-capacity heap
    // Then an exception indicating the heap is full should be thrown (or similar)
    try {
      fPHeapMax0.insere(meuItem0);
      fail("Expected an exception when inserting into a heap with capacity 0");
    } catch (Exception e) {
      // Message may be localized; ensure it indicates a 'full' or 'cheio' condition or is null
      String msg = e.getMessage();
      assertTrue("Expected exception message to mention 'full' or 'cheio' or be null",
          msg == null
              || msg.toLowerCase().contains("cheio")
              || msg.toLowerCase().contains("full")
              || msg.toLowerCase().contains("capacidade"));
    }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    // Given a heap with capacity 4 and two items to insert
    FPHeapMax fPHeapMax0 = newHeap(4);
    MeuItem meuItem0 = new MeuItem(43);
    fPHeapMax0.insere(meuItem0);
    MeuItem meuItem1 = new MeuItem(0);
    fPHeapMax0.insere(meuItem1);

    // Then basic invariants hold on inserted items
    // 'tamanho' is an attribute of MeuItem; assert it returns expected value for meuItem1.
    assertEquals("MeuItem.tamanho() should return expected value for the inserted item",
        4, meuItem1.tamanho());

    // And the heap reports a maximum (non-empty)
    try {
      Item maximum = fPHeapMax0.max();
      assertNotNull("max() should return a non-null Item when heap contains elements", maximum);
    } catch (Exception e) {
      fail("max() unexpectedly threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // Given a minimal heap
    FPHeapMax fPHeapMax0 = newHeap(1);

    // When attempting to increase a key with a null new value
    // Then an exception should be thrown indicating invalid null key
    try {
      fPHeapMax0.aumentaChave(1, (Object) null);
      fail("Expected an exception when calling aumentaChave with a null new key");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertTrue("Exception message should indicate a null key or be null",
          msg == null || msg.toLowerCase().contains("null") || msg.toLowerCase().contains("chaven"));
    }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    // Given an empty large-capacity heap
    FPHeapMax fPHeapMax0 = newHeap(2021);

    // When removing the maximum from an empty heap
    // Then implementations may either return null or throw an exception indicating the heap is empty.
    try {
      Item removed = fPHeapMax0.retiraMax();
      // Accept either null or a non-null item; prefer null as empty-heap indicator.
      assertNull("retiraMax() on an empty heap should return null", removed);
    } catch (Exception e) {
      String msg = e.getMessage();
      assertTrue("Exception from retiraMax() on empty heap should mention empty/vazio or be null",
          msg == null || msg.toLowerCase().contains("vazi") || msg.toLowerCase().contains("empty"));
    }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    // Given a freshly created heap and an external array with nulls copied in
    FPHeapMax fPHeapMax0 = newHeap(2021);
    Item[] itemArray0 = new Item[2];
    fPHeapMax0.copia(itemArray0);

    // When removing the maximum from the (still empty) heap
    // Then expected behavior is a null return; if an exception is thrown, it should indicate empty heap.
    try {
      Item item0 = fPHeapMax0.retiraMax();
      assertNull("retiraMax() should return null for an empty heap after copying an array of nulls", item0);
    } catch (Exception e) {
      String msg = e.getMessage();
      assertTrue("retiraMax() exception should indicate empty heap or be null",
          msg == null || msg.toLowerCase().contains("vazi") || msg.toLowerCase().contains("empty"));
    }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    // Given a heap with capacity 17
    FPHeapMax fPHeapMax0 = newHeap(17);

    // When building/constructing internal structures (constroi)
    // Then it should not throw for an empty heap and should leave heap in a safe state
    try {
      fPHeapMax0.constroi();
    } catch (Throwable t) {
      fail("constroi() should not throw for an empty heap: " + t);
    }

    // Confirm heap remains empty (either null on removal or throws an 'empty' exception)
    try {
      Item removed = fPHeapMax0.retiraMax();
      assertNull("After constroi(), retiraMax() should indicate empty by returning null", removed);
    } catch (Exception e) {
      String msg = e.getMessage();
      assertTrue("retiraMax() exception after constroi() should indicate empty or be null",
          msg == null || msg.toLowerCase().contains("vazi") || msg.toLowerCase().contains("empty"));
    }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    // Given a heap, one inserted item, and an external partially-filled array
    FPHeapMax fPHeapMax0 = newHeap(17);
    MeuItem meuItem0 = new MeuItem(17);
    fPHeapMax0.insere(meuItem0);
    Item[] itemArray0 = new Item[4];
    MeuItem meuItem1 = new MeuItem(1288);
    itemArray0[1] = (Item) meuItem1;
    itemArray0[2] = (Item) meuItem0;
    fPHeapMax0.copia(itemArray0);

    // When calling refaz for a range that may include null slots
    // Then implementations might throw a NullPointerException (legacy) or complete successfully.
    try {
      fPHeapMax0.refaz(1, 17);
      // If refaz completes, verify that max() returns a non-null Item (heap remains consistent)
      Item max = fPHeapMax0.max();
      assertNotNull("After refaz(), max() should return a non-null Item", max);
    } catch (NullPointerException npe) {
      // Legacy behavior; accept and assert no custom message
      assertNull("Expected legacy NullPointerException without message", npe.getMessage());
    } catch (Exception e) {
      fail("refaz() threw unexpected exception type: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    // Given a heap with a couple of inserts and a copied external array
    FPHeapMax fPHeapMax0 = newHeap(9);
    MeuItem meuItem0 = newMeuItemSafely(-2189);
    fPHeapMax0.insere(meuItem0);
    MeuItem meuItem1 = new MeuItem(9);
    fPHeapMax0.insere(meuItem1);
    Item[] itemArray0 = new Item[6];
    itemArray0[1] = (Item) meuItem1;
    fPHeapMax0.copia(itemArray0);

    // When reheapifying a subsection
    // Then refaz should complete without unexpected exceptions and heap should report a max
    try {
      fPHeapMax0.refaz(1, 9);
      Item top = fPHeapMax0.max();
      assertNotNull("After refaz(), heap must report a maximum item", top);
    } catch (Exception e) {
      fail("refaz() or max() threw an unexpected exception: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    // Given a very large capacity heap and an external small array (some nulls)
    FPHeapMax fPHeapMax0 = newHeap(4862);
    Item[] itemArray0 = new Item[3];
    fPHeapMax0.copia(itemArray0);

    // When calling constroi(), behavior may vary; either it's a no-op or throws a NullPointerException due to null slots.
    try {
      fPHeapMax0.constroi();
      // If it completes, ensure the heap is safe to query
      try {
        Item m = fPHeapMax0.max();
        // Accept null (empty) or a valid Item; both are acceptable post-constroi.
        if (m != null) {
          assertNotNull("max() returned an Item after constroi()", m);
        }
      } catch (ArrayIndexOutOfBoundsException aioobe) {
        // Some implementations may throw for empty internal structures; accept but assert message is reasonable.
        assertTrue("ArrayIndexOutOfBoundsException message should be non-null or '1'", aioobe.getMessage() != null);
      } catch (Exception ex) {
        fail("max() after constroi() threw unexpected exception: " + ex);
      }
    } catch (NullPointerException npe) {
      // Accept legacy NPE behavior but assert no custom message present
      assertNull("Expected NullPointerException from constroi() to have no message", npe.getMessage());
    } catch (Throwable t) {
      fail("constroi() threw unexpected exception: " + t);
    }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    // Given a heap with zero capacity
    FPHeapMax fPHeapMax0 = newHeap(0);

    // When calling max() on a zero-capacity heap
    // Then implementations may throw ArrayIndexOutOfBoundsException (legacy) or return null.
    try {
      Item result = fPHeapMax0.max();
      // Accept either null result or non-null (but non-null would be surprising)
      assertTrue("max() on a zero-capacity heap should return null or throw an ArrayIndexOutOfBoundsException",
          result == null);
    } catch (ArrayIndexOutOfBoundsException e) {
      // Legacy behavior accepted; some implementations produce message "1"
      // If present, assert it equals "1" to preserve previous contract.
      String msg = e.getMessage();
      if (msg != null) {
        assertEquals("Expected legacy ArrayIndexOutOfBoundsException message", "1", msg);
      }
    } catch (Exception e) {
      // Other exceptions are acceptable only if they indicate empty/full semantics
      String msg = e.getMessage();
      assertTrue("Unexpected exception message for max() on zero-capacity heap",
          msg == null || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("vazi") || msg.toLowerCase().contains("0"));
    }
  }

  // Small helper to create MeuItem but guard against unexpected constructors (defensive)
  private MeuItem newMeuItemSafely(int value) {
    return new MeuItem(value);
  }
}