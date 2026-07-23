package ds.seed1448;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests in this package.
 */
interface UnitTest {}

/**
 * Improved and more descriptive tests for ds.Max.
 *
 * Notes:
 * - Preserves original test method names (test0..test3) to keep compatibility with any tooling that references them.
 * - Uses JUnit @Test expected semantics for clearer exception expectations.
 * - Adds descriptive assertions and Given-When-Then style comments.
 */
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given: an Item[] with some non-null MeuItem instances and remaining null slots.
   * When:  Max.max is invoked with a very large index that is outside the array bounds or otherwise
   *        causes the implementation to touch null entries.
   * Then:  A NullPointerException is expected from the implementation (this documents the previously
   *        observed exceptional behavior).
   *
   * Requirement trace: REQ-MAX-001
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(-2810);
      itemArray0[0] = meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[1] = meuItem1;

      // Sanity checks (Given)
      assertEquals("Array length should be 6", 6, itemArray0.length);
      assertNotNull("First element must be set for this test", itemArray0[0]);
      assertNotNull("Second element must be set for this test", itemArray0[1]);
      // Remaining positions intentionally left null to exercise the exceptional behavior.

      // When / Then: expect NullPointerException to be thrown by the SUT
      Max.max(itemArray0, 692);
  }

  /**
   * Given: an Item[] where two slots reference the same MeuItem instance and other slots are null.
   * When:  Max.max is invoked with a large index that previously triggered a NullPointerException.
   * Then:  A NullPointerException is expected (this documents the implementation's behavior when
   *        encountering null entries while computing the maximum).
   *
   * Requirement trace: REQ-MAX-002
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test1()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem(-2810);
      itemArray0[0] = meuItem0;
      itemArray0[1] = meuItem0; // duplicate reference to exercise stable behaviour

      // Sanity checks
      assertSame("Both first and second elements should reference the same MeuItem instance",
                 itemArray0[0], itemArray0[1]);
      assertEquals("Array length should be 6", 6, itemArray0.length);

      // When / Then
      Max.max(itemArray0, 692);
  }

  /**
   * Given: an Item[] of the correct size but with every slot null.
   * When:  Max.max is invoked with a negative index.
   * Then:  The method is expected to return null (documenting current behavior for invalid index).
   *
   * Requirement trace: REQ-MAX-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[6];
      // all entries are null by default

      // When
      Item item0 = Max.max(itemArray0, -2810);

      // Then
      assertNull("Expected null when computing max on an all-null array with a negative index", item0);
  }

  /**
   * Simple construction test to ensure Max has a public no-arg constructor and is instantiable.
   *
   * Requirement trace: REQ-MAX-004
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // When
      Max max0 = new Max();

      // Then
      assertNotNull("Max instance should be created successfully", max0);
  }
}