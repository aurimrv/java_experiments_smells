package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        CasamentoExato.bmhs("g-U#E~mB3o:Fjfz", 245, "g-U#E~mB3o:Fjfz", 1);
        fail("Expected StringIndexOutOfBoundsException to be thrown");
      } catch(StringIndexOutOfBoundsException e) {
        assertNotNull("Exception message should not be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String result = CasamentoExato.bmhs("/0bZC^)Rog&;", 0, "/0bZC^)Rog&;", 0);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String result = CasamentoExato.bmh(":`G?eOrk6(1|}", 1, ":`G?eOrk6(1|}", 1);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String result = CasamentoExato.bmh("nCS,6I^8G(v7dovk", 1, "ds.CasamentoExato", 1);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      try { 
        CasamentoExato.bmh("", 1510, "", 1510);
        fail("Expected StringIndexOutOfBoundsException to be thrown");
      } catch(StringIndexOutOfBoundsException e) {
        assertNotNull("Exception message should not be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String result = CasamentoExato.shiftAndExato("EA4iy X,S\u007f+h", 1, "EA4iy X,S\u007f+h", 1);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String result = CasamentoExato.shiftAndExato(";P`>?", 1, "A\"+", 1);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String result = CasamentoExato.forcaBruta("!f", 0, "", 0);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        CasamentoExato.forcaBruta("/+/72c^0Kk,EpM", 256, "/+/72c^0Kk,EpM", 256);
        fail("Expected StringIndexOutOfBoundsException to be thrown");
      } catch(StringIndexOutOfBoundsException e) {
        assertNotNull("Exception message should not be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String result = CasamentoExato.forcaBruta("%)5[G/z/", 256, "ds.CasamentoExato", 256);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
      assertNotNull("Object should be instantiated", casamentoExato0);
  }

}