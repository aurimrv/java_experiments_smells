package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.util.Arrays;

/**
 * Unit tests for TabelaHash focusing on basic insert/remove/inspect behaviors.
 * Traceability: REQ-TBLHASH-001
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  private static final String REQ_ID = "REQ-TBLHASH-001";

  /**
   * Given an empty table,
   * When inserting and removing the same empty-key entry,
   * Then the table should be empty and imprime() must not throw.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      tabelaHash0.imprime();
  }

  /**
   * Given an empty table,
   * When inserting then removing an empty-key entry,
   * Then retrieving items yields an empty array.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(0, objectArray0.length);
  }

  /**
   * Given an empty table,
   * When inserting a key with a null value,
   * Then retrieving items should return a single element which is null.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("@V@SGl", (Object) null);
      Object[] objectArray0 = tabelaHash0.recuperaItens();
      assertEquals(1, objectArray0.length);
  }

  /**
   * Given an empty table,
   * When inserting, removing then inserting the same empty key with a null value,
   * Then the table should contain the newly inserted null value.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.retira("");
      tabelaHash0.insere("", (Object) null);
  }

  /**
   * Given an empty table,
   * When inserting the same empty key twice,
   * Then the table must return a non-null items array (at least one slot).
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", "");
      tabelaHash0.insere("", "");
  }

  /**
   * Given an empty table,
   * When performing a sequence of diverse inserts,
   * Then recuperaItens() should return a non-null array and at least one item present.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: perform multiple inserts (various keys and values)
      tabelaHash0.insere("8yHQt%i", (Object) null);
      tabelaHash0.insere("N0rNmxV=*%_", (Object) null);
      tabelaHash0.insere("N0rNmxV=*%_", "\"");
      tabelaHash0.insere("ae", "\"");
      tabelaHash0.insere("N0rNmxV=*%_", ">'by<0t2uuZ`LFt");
      tabelaHash0.insere("N0rNmxV=*%_", (Object) null);
      tabelaHash0.insere("", "");
      tabelaHash0.insere("-0}", (Object) null);

      // Then: verify non-null array and presence of at least one element
      Object[] items = tabelaHash0.recuperaItens();
      assertNotNull("[" + REQ_ID + "] recuperaItens() should not be null after multiple inserts", items);
      assertTrue("[" + REQ_ID + "] Expected at least one item after multiple inserts, got: " + Arrays.toString(items), items.length >= 1);
  }

  /**
   * Given an empty table with a single inserted key,
   * When removing a non-existent key,
   * Then the table should remain accessible and return a non-null items array.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("8yHQt%i", (Object) null);
      tabelaHash0.retira("N0rNmxV=*%_");
  }

  /**
   * Given a table with a single entry whose value is null,
   * When calling imprime(),
   * Then a NullPointerException is expected (preserve original exceptional behavior).
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("8yHQt%i", (Object) null);
      // Undeclared exception!
      try { 
        tabelaHash0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}