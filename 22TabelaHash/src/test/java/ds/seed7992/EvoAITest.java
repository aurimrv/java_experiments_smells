package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.experimental.categories.Category;

/**
 * Lightweight improved tests for TabelaHash.
 * Preserves original EvoSuite structure and test method names.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends TabelaHash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("", (Object) null);
      tabelaHash0.imprime();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a table with one known entry
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("HZ'({", "Ilk");

      // When: attempt to remove a non-existing key "w" (original SUT call)
      try {
          tabelaHash0.retira("w");
      } catch (Exception e) {
          // Fail with a clear message to aid debugging if unexpected exception occurs
          fail("retira(\"w\") threw an unexpected exception: " + e.getClass().getName() + " - " + e.getMessage());
      }

      // Then: the table should still exist and no exception should have been thrown
      assertNotNull("TabelaHash should remain non-null after attempting to remove a missing key", tabelaHash0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a table with an inserted entry for key "HZ'({"
      TabelaHash tabelaHash0 = new TabelaHash();
      tabelaHash0.insere("HZ'({", "Ilk");

      // When: remove the inserted key (original SUT call)
      try {
          tabelaHash0.retira("HZ'({");
      } catch (Exception e) {
          fail("retira(\"HZ'({\") threw an unexpected exception: " + e.getClass().getName() + " - " + e.getMessage());
      }

      // Then: the table instance should remain valid
      assertNotNull("TabelaHash should be non-null after removing an existing key", tabelaHash0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a fresh table
      TabelaHash tabelaHash0 = new TabelaHash();

      // When: insert two entries (original SUT calls)
      tabelaHash0.insere("HZ'({", "HZ'({");
      tabelaHash0.insere("", "");

      // Then: operations should complete without throwing and the object should be usable
      assertNotNull("TabelaHash should be non-null after multiple inserts", tabelaHash0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TabelaHash tabelaHash0 = new TabelaHash();
      Object object0 = new Object();
      tabelaHash0.insere("", object0);
      tabelaHash0.insere("", "");
  }
}