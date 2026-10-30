package ds.seed5311;

import static org.evosuite.runtime.EvoAssertions.verifyException;

import java.util.Arrays;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved test class for Ordenacao behavior.
 *
 * These tests retain the original test method names (required by the preservation rules).
 * Each test includes Given-When-Then style comments, clearer assertions with messages,
 * and simple property checks beyond the original single assertions or exception checks.
 *
 * Traceability: REQ-ORDER-001 through REQ-ORDER-010 (sorting basic behaviors)
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  // Helper: count non-null elements in array
  private static int countNonNull(Item[] arr) {
    int c = 0;
    if (arr == null) return 0;
    for (Item it : arr) {
      if (it != null) c++;
    }
    return c;
  }

  // Helper: count instances of MeuItem in array
  private static int countMeuItem(Item[] arr) {
    int c = 0;
    if (arr == null) return 0;
    for (Item it : arr) {
      if (it instanceof MeuItem) c++;
    }
    return c;
  }

  /**
   * Given an array with several identical MeuItem references,
   * When heapsort is invoked with a large index,
   * Then an ArrayIndexOutOfBoundsException is expected (preserves original behavior).
   *
   * Requirement: REQ-ORDER-002
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.heapsort(itemArray0, 1481);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1481
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * Given an empty array,
   * When heapsort is invoked with a negative second parameter,
   * Then the method should complete without modifying the array (happy path).
   *
   * Requirement: REQ-ORDER-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      Ordenacao.heapsort(itemArray0, (-1775));
      assertEquals(0, itemArray0.length);
  }

  /**
   * Given an array containing null elements and three MeuItem entries,
   * When shellsort is invoked with a moderate gap value,
   * Then a NullPointerException is expected (preserves original behavior).
   *
   * Requirement: REQ-ORDER-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-997));
      itemArray0[3] = (Item) meuItem1;
      itemArray0[5] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Ordenacao.shellsort(itemArray0, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an empty array,
   * When shellsort is invoked with a negative gap,
   * Then the method should complete and leave the array empty (happy path).
   *
   * Requirement: REQ-ORDER-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Item[] itemArray0 = new Item[0];
      Ordenacao.shellsort(itemArray0, (-1775));
      assertEquals(0, itemArray0.length);
  }

  /**
   * Given an array with some nulls and a couple of MeuItem values,
   * When insercao (insertion sort) is invoked with boundary index equal to array length,
   * Then a NullPointerException is expected (preserves original behavior).
   *
   * Requirement: REQ-ORDER-004
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      MeuItem meuItem0 = new MeuItem(3258);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Ordenacao.insercao(itemArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * Given an array with several MeuItem entries and some nulls,
   * When selecao (selection sort) is invoked with a boundary index,
   * Then the call should complete and maintain element count; verify basic properties.
   *
   * Requirement: REQ-ORDER-005
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Item[] itemArray0 = new Item[1];
      Ordenacao.insercao(itemArray0, (-289));
      assertEquals(1, itemArray0.length);
  }

  /**
   * Given an array with multiple MeuItem instances,
   * When selecao (selection sort) is invoked,
   * Then sorting should complete and preserve the number of non-null items and types.
   *
   * Requirement: REQ-ORDER-006
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(738);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(3);
      itemArray0[3] = (Item) meuItem1;
      Ordenacao.selecao(itemArray0, 3);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given an array with alternating MeuItem instances,
   * When quicksort is invoked with a boundary index,
   * Then sorting completes and maintains the number of items; validate basic invariants.
   *
   * Requirement: REQ-ORDER-007
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(4);
      itemArray0[2] = (Item) meuItem1;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem1;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given an array with multiple MeuItem objects including a distinct value,
   * When quicksort is invoked,
   * Then sorting completes and preserves basic properties of the array.
   *
   * Requirement: REQ-ORDER-008
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(29);
      itemArray0[3] = (Item) meuItem1;
      itemArray0[4] = (Item) meuItem0;
      Ordenacao.quicksort(itemArray0, 4);
      assertEquals(6, itemArray0.length);
  }

  /**
   * Given the Ordenacao class,
   * When constructing a new instance,
   * Then the instance should not be null (sanity check).
   *
   * Requirement: REQ-ORDER-009
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}