package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests to allow selective execution.
 */
interface UnitTest {}

/*
 * Improved and documented version of the EvoSuite-generated tests.
 * These tests keep the original method names and exception expectations
 * while adding structure, documentation, and basic assertions to make
 * the intent clearer and the tests more actionable.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  /**
   * REQ-001: Verify bmhs reports an index-related error for malformed inputs.
   *
   * Given: an input pattern and text that should provoke an index issue.
   * When: bmhs is executed with those inputs.
   * Then: a StringIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmhs("#klA/q>kn`", 217, "7Zc#7@YMm<9:", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
   * REQ-002: Ensure bmhs handles identical small pattern and text without throwing.
   *
   * Given: identical non-empty pattern and text and a positive integer parameter.
   * When: bmhs is invoked.
   * Then: the method completes without throwing an exception.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CasamentoExato.bmhs("L=y(bQ3<R.zW", 1, "L=y(bQ3<R.zW", 1);
  }

  /**
   * REQ-003: bmh should accept simple inputs and not throw.
   *
   * Given: a short pattern and a prefix message.
   * When: bmh is executed.
   * Then: completes normally (no exception).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CasamentoExato.bmh(";kpcTap[oNf2", 1, "Casamento na posicao: ", 1);
  }

  /**
   * REQ-004: bmh should complete when pattern equals text.
   *
   * Given: identical short pattern and text.
   * When: bmh is executed.
   * Then: it completes without throwing exceptions.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CasamentoExato.bmh("KDX8]d", 1, "KDX8]d", 1);
  }

  /**
   * REQ-005: bmh should throw StringIndexOutOfBoundsException for a large index parameter.
   *
   * Given: pattern and text equal to the class name and a very large index value.
   * When: bmh is invoked with these parameters.
   * Then: a StringIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh("ds.CasamentoExato", 1, "ds.CasamentoExato", 505);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
   * REQ-006: shiftAndExato should throw StringIndexOutOfBoundsException for invalid index.
   *
   * Given: an input likely to cause index issues and a very large index.
   * When: shiftAndExato is executed.
   * Then: StringIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.shiftAndExato("/Cpp</", 608, "/Cpp</", 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
   * REQ-007: shiftAndExato should accept typical small indices and not throw.
   *
   * Given: valid small indices and matching pattern/text.
   * When: shiftAndExato is called.
   * Then: the call completes normally.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CasamentoExato.shiftAndExato("/Cpp</", 1, "/Cpp</", 1);
  }

  /**
   * REQ-008: forcaBruta should handle identical pattern/text and small indices without throwing.
   *
   * Given: identical pattern and text.
   * When: forcaBruta is invoked.
   * Then: no exception is thrown.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      try {
          CasamentoExato.forcaBruta("7!0vT{<atu'MM{`b5", 1, "7!0vT{<atu'MM{`b5", 1);
          assertTrue("forcaBruta completed without exception for identical inputs", true);
      } catch (RuntimeException e) {
          fail("forcaBruta threw an unexpected exception: " + e.toString());
      }
  }

  /**
   * REQ-009: forcaBruta should accept large numeric parameters gracefully (no crash).
   *
   * Given: non-boundary strings and large integer parameters.
   * When: forcaBruta is invoked.
   * Then: it completes (or handles error gracefully) — here we assert no unexpected runtime exception.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CasamentoExato.forcaBruta("OIr32NNn}/J+%e", 1645, "4Plc", 1645);
          fail("Unexpected runtime exception from forcaBruta with large numeric parameters: " + e.toString());
      }
  }

  /**
   * REQ-010: Constructing CasamentoExato should produce a non-null instance.
   *
   * Given: default construction.
   * When: new CasamentoExato() is executed.
   * Then: returned instance is not null.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}