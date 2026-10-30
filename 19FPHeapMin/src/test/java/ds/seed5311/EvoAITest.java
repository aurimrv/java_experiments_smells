package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for FPHeapMin focusing on a variety of small scenarios.
 *
 * Traceability: REQ-HEAP-001..HEAP-010 (example mapping for heap behaviors)
 *
 * These tests were adapted from an automatically generated set and improved
 * to include clearer structure, small constants, and minimal additional
 * assertions without changing the original test oracles.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends FPHeapMin_ESTest_scaffolding {

  private static final int CAP_SMALL = 5;
  private static final int CAP_TYPICAL = 448;
  private static final int CAP_ZERO = 0;
  private static final int CAP_MEDIUM = 304;
  private static final int CAP_ONE = 1;
  private static final int CAP_EMPTY_164 = 164;

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    // Given: a backing array with null entries (simulating partially populated heap)
    Item[] itemArray0 = new Item[CAP_SMALL];
    FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

    // When / Then: calling imprime on a heap backed by an array with nulls should
    // surface the implementation's behavior (historically a NullPointerException).
    try {
      fPHeapMin0.imprime();
      fail("Expecting exception: NullPointerException when printing heap with null entries");
    } catch (NullPointerException e) {
      // Oracle preserved: expect NullPointerException originating from ds.FPHeapMin
      verifyException("ds.FPHeapMin", e);
    }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(448);
      fPHeapMin0.imprime();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    // Given: a heap with zero capacity and an item to insert
    FPHeapMin fPHeapMin0 = new FPHeapMin(CAP_ZERO);
    MeuItem meuItem0 = new MeuItem(0);

    // When / Then: inserting into a zero-capacity heap should raise an Exception
    try {
      fPHeapMin0.insere(meuItem0);
      fail("Expecting exception: Exception when inserting into zero-capacity heap");
    } catch (Exception e) {
      // Preserve original expectation: generic Exception from ds.FPHeapMin
      verifyException("ds.FPHeapMin", e);
    }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    // Given: a medium-capacity heap and a source array with some prefilled items
    FPHeapMin fPHeapMin0 = new FPHeapMin(CAP_MEDIUM);
    MeuItem meuItem0 = new MeuItem(CAP_MEDIUM);
    Item[] itemArray0 = new Item[7];
    MeuItem meuItem1 = new MeuItem(1);
    itemArray0[1] = (Item) meuItem1;
    itemArray0[3] = (Item) meuItem0;

    // When: copying the prepared array into the heap and inserting another item
    fPHeapMin0.copia(itemArray0);
    fPHeapMin0.insere(meuItem0);

    // Then: the inserted MeuItem's tamanho() should remain as expected (oracle preserved)
    assertEquals("MeuItem tamanho should be 4 after insertions", 4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // Given: a medium-capacity heap and a single MeuItem
    FPHeapMin fPHeapMin0 = new FPHeapMin(CAP_MEDIUM);
    MeuItem meuItem0 = new MeuItem(CAP_MEDIUM);

    // When: inserting the same MeuItem twice
    fPHeapMin0.insere(meuItem0);
    fPHeapMin0.insere(meuItem0);

    // Then: the MeuItem reports the expected tamanho (oracle preserved)
    assertEquals("MeuItem tamanho should be 4 after two insertions", 4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    // Given: a small heap and an attempt to decrease a key to null
    FPHeapMin fPHeapMin0 = new FPHeapMin(4);

    // When / Then: diminishing key to null must raise an Exception (null new key not allowed)
    try {
      fPHeapMin0.diminuiChave(2, (Object) null);
      fail("Expecting exception: Exception when diminishing key to null");
    } catch (Exception e) {
      verifyException("ds.FPHeapMin", e);
    }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    // Given: a heap backed by an array of length 1 (effectively empty)
    Item[] itemArray0 = new Item[CAP_ONE];
    FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

    // When / Then: removing min from an empty/insufficiently initialized heap should raise Exception
    try {
      fPHeapMin0.retiraMin();
      fail("Expecting exception: Exception when removing min from empty heap");
    } catch (Exception e) {
      verifyException("ds.FPHeapMin", e);
    }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(304);
      MeuItem meuItem0 = new MeuItem(304);
      fPHeapMin0.insere(meuItem0);
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem1 = new MeuItem(1);
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      fPHeapMin0.copia(itemArray0);
      fPHeapMin0.constroi();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    // Given: a backing array with null holes but some populated positions
    Item[] itemArray0 = new Item[8];
    FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);
    MeuItem meuItem0 = new MeuItem(1048);
    MeuItem meuItem1 = new MeuItem(1);
    itemArray0[2] = (Item) meuItem0;
    itemArray0[3] = (Item) meuItem1;

    // When / Then: attempting to remove the minimum from this partially null-backed heap
    // historically caused a NullPointerException in the implementation.
    try {
      fPHeapMin0.retiraMin();
      fail("Expecting exception: NullPointerException when removing min from partially null-backed heap");
    } catch (NullPointerException e) {
      verifyException("ds.FPHeapMin", e);
    }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(114);
      fPHeapMin0.refaz(114, (-221));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    // Given: a small backing array with uninitialized entries
    Item[] itemArray0 = new Item[3];
    FPHeapMin fPHeapMin0 = new FPHeapMin(itemArray0);

    // When / Then: constructing (constroi) on such an array may raise NullPointerException
    try {
      fPHeapMin0.constroi();
      fail("Expecting exception: NullPointerException when building heap from partially null-backed array");
    } catch (NullPointerException e) {
      verifyException("ds.FPHeapMin", e);
    }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FPHeapMin fPHeapMin0 = new FPHeapMin(164);
      Item item0 = fPHeapMin0.min();
      assertNull(item0);
  }
}