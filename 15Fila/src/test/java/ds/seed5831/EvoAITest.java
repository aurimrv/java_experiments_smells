package ds.seed5831;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * test0 (Given-When-Then):
   * Given an empty queue,
   * When a String is enqueued and imprime() is invoked,
   * Then imprime should include the enqueued string, and subsequent desenfileira should return the same string.
   * Also verifies that trying to dequeue again signals the empty-queue exceptional behavior.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    final String payload = "hello-queue";

    // When
    fila0.enfileira(payload);

    // Capture output of imprime() to assert public-visible behavior (not internals).
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(baos));
      fila0.imprime();
    } finally {
      System.setOut(originalOut);
    }
    String printed = baos.toString();

    // Then - ensure printed representation mentions the enqueued item
    assertTrue("imprime() output should contain the enqueued string", printed.contains(payload));

    // And when we dequeue, we get the same object back (FIFO)
    Object dequeued = fila0.desenfileira();
    assertSame("desenfileira() should return the same object that was enqueued", payload, dequeued);

    // And the queue should now be empty: attempting to dequeue raises the expected exception
    try {
      fila0.desenfileira();
      fail("Expected an Exception when dequeuing from an empty queue");
    } catch (Exception e) {
      String msg = e.getMessage() == null ? "" : e.getMessage();
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia"));
    }
  }

  /**
   * test1 (Given-When-Then):
   * Given an empty queue,
   * When desenfileira() is invoked,
   * Then an exception indicating the queue is empty is thrown.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      fila0.desenfileira();
      fail("Expecting exception when dequeuing an empty queue");
    } catch (Exception e) {
      // Provide a stronger assertion on the exception message to improve test clarity.
      String message = e.getMessage() == null ? "" : e.getMessage();
      assertTrue("Expected exception message to mention 'vazia' (empty)", message.toLowerCase().contains("vazia"));
    }
  }

  /**
   * test2 (Boundary-aware):
   * Given a fresh queue,
   * When we repeatedly enqueue items until the implementation signals it's full or until a reasonable limit,
   * Then either an exception is thrown with a message indicating fullness, or all enqueued items can be dequeued in FIFO order.
   *
   * This test avoids touching internal representation and is robust to both bounded and unbounded implementations.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    final int MAX_ATTEMPTS = 1000;
    List<String> added = new ArrayList<>(100);

    // When - try to enqueue until capacity is reached or until MAX_ATTEMPTS
    boolean fullSignaled = false;
    for (int i = 0; i < MAX_ATTEMPTS; i++) {
      String item = "item-" + i;
      try {
        fila0.enfileira(item);
        added.add(item);
      } catch (Exception e) {
        // Implementation signaled full; assert message indicates fullness and stop filling.
        String msg = e.getMessage() == null ? "" : e.getMessage();
        assertTrue("Expected exception message to indicate the queue is full",
            msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        fullSignaled = true;
        break;
      }
    }

    // Then - if no full signal within limit, verify FIFO ordering for all enqueued items
    if (!fullSignaled) {
      for (String expected : added) {
        Object actual = fila0.desenfileira();
        assertEquals("Dequeued items should match enqueued items in FIFO order", expected, actual);
      }
      // Now the queue should be empty: next dequeue should raise empty-queue exception
      try {
        fila0.desenfileira();
        fail("Expected exception when dequeuing from an empty queue after removing all items");
      } catch (Exception e) {
        String msg = e.getMessage() == null ? "" : e.getMessage();
        assertTrue("Expected exception message to indicate the queue is empty", msg.toLowerCase().contains("vazia"));
      }
    }
  }

  /**
   * test3 (Given-When-Then):
   * Given a queue,
   * When the queue object itself is enqueued and then dequeued,
   * Then the dequeued object is the same instance that was enqueued and the queue becomes empty afterwards.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When - enqueue the queue instance itself
    fila0.enfileira(fila0);

    // Then - dequeuing should return the same instance (identity)
    Object dequeued = fila0.desenfileira();
    assertSame("Dequeued object should be the same instance that was enqueued", fila0, dequeued);

    // And the queue should now be empty (further dequeue should throw)
    try {
      fila0.desenfileira();
      fail("Expected exception when dequeuing from an empty queue after removing the only element");
    } catch (Exception e) {
      String msg = e.getMessage() == null ? "" : e.getMessage();
      assertTrue("Expected exception message to indicate the queue is empty", msg.toLowerCase().contains("vazia"));
    }
  }
}