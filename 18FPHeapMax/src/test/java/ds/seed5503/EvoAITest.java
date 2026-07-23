package ds.seed5503;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.Assert;

import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface to allow selective execution of unit tests.
 */
interface UnitTest {}

/**
 * Improved test class for FPHeapMax that replaces auto-generated, minimal tests with
 * clearer, self-contained scenarios and richer assertions.
 *
 * Note: The original test method names (test0..test9) are preserved to satisfy tooling
 * that depends on those exact names.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMax_ESTest_scaffolding {

  /**
   * Given a heap with capacity 1,
   * When an item is inserted and then removed,
   * Then the removed item must be the same instance that was inserted,
   * and subsequent removal should indicate the heap is empty.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(1);
      MeuItem item = new MeuItem(1);

      // Act: insert and remove
      heap.insere(item);
      Item removed = heap.retiraMax();

      // Assert: the same instance is returned and it is not null
      Assert.assertNotNull("retiraMax should not return null immediately after insert", removed);
      Assert.assertSame("retiraMax should return the exact instance that was inserted", item, removed);

      // Assert: removing again results in an empty-heap error
      try {
          heap.retiraMax();
          Assert.fail("Expected an exception when removing from an empty heap after the single removal");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertTrue("Expected error message to mention 'heap vazio' when removing from empty heap; was: " + msg,
                  msg != null && msg.contains("heap vazio"));
      }
  }

  /**
   * Given a heap with capacity zero,
   * When insertion is attempted,
   * Then an exception should be thrown indicating the heap is full,
   * and the heap should remain empty afterwards.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(0);
      MeuItem item = new MeuItem(172);

      // Act / Assert: inserting into a zero-capacity heap should fail with a clear message
      try {
          heap.insere(item);
          Assert.fail("Inserting into a heap with capacity 0 should have thrown an exception indicating the heap is full");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertNotNull("Exception message must not be null for a capacity/full error", msg);
          Assert.assertTrue("Expected exception message to contain 'heap cheio', was: " + msg, msg.contains("heap cheio"));
      }

      // Ensure heap is still empty: retiraMax should report heap vazio
      try {
          heap.retiraMax();
          Assert.fail("Expected heap to be empty after failed insertion (retiraMax should throw)");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertNotNull("retiraMax from an empty heap should include an explanatory message", msg);
          Assert.assertTrue("Expected 'heap vazio' message when removing from empty heap; was: " + msg, msg.contains("heap vazio"));
      }
  }

  /**
   * Given a small heap,
   * When two items are inserted,
   * Then repeated removals should return two non-null items and the heap becomes empty.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(2);
      MeuItem itemA = new MeuItem(0);
      MeuItem itemB = new MeuItem(1);

      // Insert two items (happy-path)
      heap.insere(itemA);
      heap.insere(itemB);

      // Remove twice and verify returned items are not null and distinct instances
      Item first = heap.retiraMax();
      Item second = heap.retiraMax();

      Assert.assertNotNull("First removal should return a non-null item", first);
      Assert.assertNotNull("Second removal should return a non-null item", second);
      Assert.assertNotSame("Two different removals should not return the same reference unless duplicates were inserted",
              first, second);

      // Heap should now be empty
      try {
          heap.retiraMax();
          Assert.fail("Expected an exception when removing from an empty heap after two removals");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertNotNull("Exception message should explain empty heap condition", msg);
          Assert.assertTrue("Expected 'heap vazio' when removing from empty heap; was: " + msg, msg.contains("heap vazio"));
      }
  }

  /**
   * Given an attempt to increase a key with a null new key,
   * When aumentaChave is invoked with null as chaveNova,
   * Then an exception should be thrown indicating the new key is null.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(0);

      try {
          // The implementation should validate chaveNova before other checks and throw a meaningful exception.
          heap.aumentaChave(0, (Object) null);
          Assert.fail("Expected an exception when calling aumentaChave with a null new key");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertNotNull("Exception message must indicate why aumentaChave failed", msg);
          Assert.assertTrue("Expected message to mention 'chaveNova' or 'null' indicating the null new key; was: " + msg,
                  msg.toLowerCase().contains("chavenova") || msg.toLowerCase().contains("null"));
      }
  }

  /**
   * Given an empty heap,
   * When retiraMax is called,
   * Then an exception should be raised and the message should mention that the heap is empty.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(0);

      try {
          heap.retiraMax();
          Assert.fail("Expected an exception when calling retiraMax on an empty heap");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertNotNull("Expected an explanatory message when removing from an empty heap", msg);
          Assert.assertTrue("Expected message to contain 'heap vazio'; was: " + msg, msg.contains("heap vazio"));
      }
  }

  /**
   * Given a freshly created heap,
   * When constroi is invoked without prior copia,
   * Then it should succeed (no exception) and subsequent removals report the heap is empty.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(986);

      // constroi on an empty internal state should not throw
      heap.constroi();

      // Verify that there are no elements to remove
      try {
          heap.retiraMax();
          Assert.fail("After building an empty heap, retiraMax should indicate the heap is empty");
      } catch (Exception e) {
          String msg = e.getMessage();
          Assert.assertNotNull("Expected message when removing from empty heap after constroi", msg);
          Assert.assertTrue("Expected 'heap vazio' after constroi on empty heap; was: " + msg, msg.contains("heap vazio"));
      }
  }

  /**
   * Given a heap and a partially filled array containing nulls,
   * When copia is invoked followed by constroi,
   * Then a NullPointerException is expected if the implementation does not accept null entries.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(986);
      MeuItem repeated = new MeuItem(986);

      // Prepare an array with intentional nulls to simulate invalid input to copia/constroi
      Item[] itemArray = new Item[7];
      itemArray[1] = (Item) repeated;
      itemArray[3] = (Item) repeated;
      MeuItem another = new MeuItem(2445);
      itemArray[4] = (Item) another;
      itemArray[5] = (Item) repeated;
      itemArray[6] = (Item) repeated;

      // Copy the array -- should succeed in copying the references
      heap.copia(itemArray);

      // constroi is expected to try to process whole backing array and may encounter nulls;
      // assert that a NullPointerException is thrown as in the original failing scenario.
      try {
          heap.constroi();
          Assert.fail("Expected NullPointerException from constroi when backing array contains null entries");
      } catch (NullPointerException e) {
          // The original behavior produced a NullPointerException with a null message; accept that.
          Assert.assertNull("NullPointerException message is expected to be null in this implementation", e.getMessage());
      }
  }

  /**
   * Given an array with several null entries,
   * When copied into the heap and constroi is invoked,
   * Then a NullPointerException is expected during heap construction.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(1006);
      MeuItem base = new MeuItem(1006);
      Item[] arr = new Item[9];

      // Place some entries and leave other positions null to simulate malformed input
      arr[4] = (Item) base;
      arr[6] = (Item) base;
      arr[7] = (Item) base;
      arr[8] = (Item) base;

      heap.copia(arr);

      try {
          heap.constroi();
          Assert.fail("Expected NullPointerException from constroi when array contains null entries");
      } catch (NullPointerException e) {
          Assert.assertNull("Expected no message for this NullPointerException in this implementation", e.getMessage());
      }
  }

  /**
   * Given a heap where copia was invoked with an array of nulls,
   * When retiraMax is called,
   * Then the implementation may raise a NullPointerException; assert that behavior explicitly.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax(394);
      Item[] arr = new Item[4]; // all entries null

      heap.copia(arr);

      try {
          heap.retiraMax();
          Assert.fail("Expected NullPointerException when attempting to remove from a heap backed by an array of nulls");
      } catch (NullPointerException e) {
          // The implementation produced an NPE with no message in the original; mirror that expectation.
          Assert.assertNull("Expected NullPointerException to have a null message for this implementation", e.getMessage());
      }
  }

  /**
   * Given a heap constructed with an invalid (negative) capacity,
   * When max is invoked,
   * Then an ArrayIndexOutOfBoundsException is expected; assert its origin via message.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FPHeapMax heap = new FPHeapMax((-1));

      try {
          heap.max();
          Assert.fail("Expected ArrayIndexOutOfBoundsException when calling max on a heap created with negative capacity");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Validate that this is the expected array bounds error (message may contain index information)
          String msg = e.getMessage();
          Assert.assertNotNull("Expected ArrayIndexOutOfBoundsException to include index information", msg);
          // The original demonstrated message "1"; verify it contains a digit as basic sanity
          Assert.assertTrue("Expected message to contain an index number, was: " + msg, msg.matches(".*\\d.*"));
      }
  }
}