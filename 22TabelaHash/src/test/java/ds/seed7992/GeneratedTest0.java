package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100.0d+ "'", var4.equals(100.0d));

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    java.lang.Float var3 = new java.lang.Float(100.0f);
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Short var4 = new java.lang.Short((short)10);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)10+ "'", var6.equals((short)10));

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    java.lang.Float var3 = new java.lang.Float(100.0f);
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "3gp6ph2";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var2.pesquisa(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    java.lang.Object var4 = var1.pesquisa(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Byte var2 = new java.lang.Byte((byte)1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (byte)1+ "'", var4.equals((byte)1));

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Short var4 = new java.lang.Short((short)10);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Byte var3 = new java.lang.Byte((byte)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "1";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Short var5 = new java.lang.Short((short)10);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Short var2 = new java.lang.Short((short)(-1));
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "1";
    java.lang.Object var6 = var1.pesquisa(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Short var5 = new java.lang.Short((short)10);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long(1L);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1L+ "'", var6.equals(1L));

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long(1L);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(1L);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "1";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    var0.insere(var3, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var8 = "";
    var0.retira(var8);
    java.lang.Object var10 = var4.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Double var4 = new java.lang.Double(100.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var2.pesquisa(var6);
    java.lang.String var8 = "";
    var2.retira(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0d+ "'", var7.equals(100.0d));

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    java.lang.Object var3 = var0.pesquisa(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var9 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "1";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(1L);
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Short var5 = new java.lang.Short((short)10);
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

/*
  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Short var2 = new java.lang.Short((short)(-1));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "1";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }
*/
  
  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "  ";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var1, (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var10 = "";
    var0.retira(var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "false";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "false";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(10L);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(1L);
    var1.insere(var4, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "  ";
    java.lang.Object var6 = var3.pesquisa(var5);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var3.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    java.lang.String var3 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var5.pesquisa(var8);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var11 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var1.pesquisa(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var1.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-45";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var2.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Byte var3 = new java.lang.Byte((byte)1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-45";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "";
    java.lang.Long var6 = new java.lang.Long(1L);
    var2.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var2.retira(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var3.pesquisa(var7);
    java.lang.String var9 = "";
    var3.retira(var9);
    java.lang.Object var11 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0d+ "'", var8.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "false";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Double var4 = new java.lang.Double(100.0d);
    var2.insere(var3, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "false";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var1.pesquisa(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var9 = "";
    var1.retira(var9);
    java.lang.Object var11 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var5.pesquisa(var8);
    var1.insere(var4, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(1L);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var5.pesquisa(var8);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var11 = "";
    var1.retira(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "  ";
    java.lang.Object var6 = var3.pesquisa(var5);
    var1.insere(var2, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-45";
    java.lang.Object var5 = var3.pesquisa(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "  ";
    java.lang.Object var6 = var3.pesquisa(var5);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var8 = "";
    java.lang.Object var9 = var3.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test90() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Byte var3 = new java.lang.Byte((byte)1);
    var1.insere(var2, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test92() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "  ";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var7 = "";
    java.lang.Object var8 = var2.pesquisa(var7);
    java.lang.String var9 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test93() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(1L);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test94() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-45";
    java.lang.Byte var6 = new java.lang.Byte((byte)1);
    var4.insere(var5, (java.lang.Object)var6);
    var0.insere(var3, (java.lang.Object)var6);
    java.lang.Object var9 = var4.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (byte)1+ "'", var9.equals((byte)1));

  }

  public void test95() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test96() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test97() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-45";
    java.lang.Byte var6 = new java.lang.Byte((byte)1);
    var4.insere(var5, (java.lang.Object)var6);
    var0.insere(var3, (java.lang.Object)var6);
    java.lang.String var9 = "";
    var0.retira(var9);
    var4.insere(var9, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test99() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "false";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(10L);
    var1.insere(var4, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test100() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    var0.imprime();

  }

  public void test101() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));

  }

  public void test102() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-45";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "";
    java.lang.Long var6 = new java.lang.Long(1L);
    var2.insere(var5, (java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test103() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    java.lang.Double var6 = new java.lang.Double(100.0d);
    var4.insere(var5, (java.lang.Object)var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var8);
    var8.imprime();

  }

  public void test104() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long(1L);
    var0.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-45";
    java.lang.Object var8 = var6.pesquisa(var7);
    java.lang.Long var9 = new java.lang.Long(100L);
    var0.insere(var7, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test105() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var3.pesquisa(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0d+ "'", var8.equals(100.0d));

  }

  public void test106() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test107() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3gp6ph2";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var9 = "";
    var1.retira(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test108() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Object var4 = var0.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "3gp6ph2";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "3gp6ph2";
    java.lang.Object var11 = var9.pesquisa(var10);
    java.lang.String var12 = "";
    java.lang.Object var13 = var9.pesquisa(var12);
    var5.insere(var8, (java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test109() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "hi!";
    java.lang.Object var5 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test110() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-45";
    java.lang.Object var4 = var2.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test111() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Byte var2 = new java.lang.Byte((byte)1);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-45";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.String var9 = "  ";
    java.lang.Object var10 = var7.pesquisa(var9);
    var5.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test112() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = new java.lang.Object();
    var0.insere(var2, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

/*
  public void test113() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "  ";
    java.lang.Float var6 = new java.lang.Float(100.0f);
    var3.insere(var5, (java.lang.Object)var6);
    var3.imprime();
    java.lang.String var9 = "";
    var3.retira(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

*/
  public void test114() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-45";
    java.lang.Byte var7 = new java.lang.Byte((byte)1);
    var5.insere(var6, (java.lang.Object)var7);
    var1.insere(var4, (java.lang.Object)var7);
    java.lang.Integer var10 = new java.lang.Integer(0);
    var0.insere(var4, (java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test115() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "false";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "";
    java.lang.Long var6 = new java.lang.Long(10L);
    var2.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var2.retira(var8);
    var0.insere(var1, (java.lang.Object)var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "false";
    java.lang.Object var13 = var11.pesquisa(var12);
    java.lang.String var14 = "";
    java.lang.Long var15 = new java.lang.Long(10L);
    var11.insere(var14, (java.lang.Object)var15);
    java.lang.Object var17 = var0.pesquisa(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test116() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-45";
    java.lang.Byte var8 = new java.lang.Byte((byte)1);
    var6.insere(var7, (java.lang.Object)var8);
    var2.insere(var5, (java.lang.Object)var8);
    java.lang.String var11 = "";
    var2.retira(var11);
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "-45";
    ds.TabelaHash var15 = new ds.TabelaHash();
    var15.imprime();
    java.lang.String var17 = "  ";
    java.lang.Object var18 = var15.pesquisa(var17);
    var13.insere(var14, (java.lang.Object)var15);
    var1.insere(var11, (java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test117() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-45";
    java.lang.Byte var5 = new java.lang.Byte((byte)1);
    var3.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.String var9 = "  ";
    java.lang.Object var10 = var7.pesquisa(var9);
    var0.insere(var4, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test118() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var3.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    java.lang.Object var11 = var9.pesquisa(var10);
    java.lang.String var12 = "";
    java.lang.Short var13 = new java.lang.Short((short)10);
    var9.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "";
    var9.retira(var15);
    java.lang.Object var17 = var3.pesquisa(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0d+ "'", var8.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 100.0d+ "'", var17.equals(100.0d));

  }

  public void test119() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-45";
    java.lang.Byte var7 = new java.lang.Byte((byte)1);
    var5.insere(var6, (java.lang.Object)var7);
    var1.insere(var4, (java.lang.Object)var7);
    java.lang.String var10 = "";
    var1.retira(var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "-45";
    ds.TabelaHash var14 = new ds.TabelaHash();
    var14.imprime();
    java.lang.String var16 = "  ";
    java.lang.Object var17 = var14.pesquisa(var16);
    var12.insere(var13, (java.lang.Object)var14);
    var0.insere(var10, (java.lang.Object)var13);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test120() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var3.pesquisa(var7);
    java.lang.String var9 = "";
    var3.retira(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0d+ "'", var8.equals(100.0d));

  }

  public void test121() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "false";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test122() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "false";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "";
    java.lang.Short var9 = new java.lang.Short((short)10);
    var5.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var5.retira(var11);
    java.lang.Object var13 = var1.pesquisa(var11);
    java.lang.Object var14 = var0.pesquisa(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test123() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "3gp6ph2";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.String var11 = "";
    java.lang.Object var12 = var8.pesquisa(var11);
    var4.insere(var7, (java.lang.Object)var8);
    var0.insere(var2, (java.lang.Object)var8);
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test124() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    java.lang.Float var3 = new java.lang.Float(100.0f);
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "hi!";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "false";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.String var11 = "";
    java.lang.Long var12 = new java.lang.Long(10L);
    var8.insere(var11, (java.lang.Object)var12);
    java.lang.String var14 = "";
    var8.retira(var14);
    var6.insere(var7, (java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var14);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test125() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "hi!";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "false";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.String var6 = "";
    java.lang.Long var7 = new java.lang.Long(10L);
    var3.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    var3.retira(var9);
    var1.insere(var2, (java.lang.Object)var9);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    java.lang.String var14 = "  ";
    java.lang.Float var15 = new java.lang.Float(100.0f);
    var12.insere(var14, (java.lang.Object)var15);
    var12.imprime();
    var0.insere(var9, (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test126() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var1.insere(var3, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "  ";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "hi!";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "false";
    java.lang.Object var11 = var9.pesquisa(var10);
    java.lang.String var12 = "";
    java.lang.Long var13 = new java.lang.Long(10L);
    var9.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "";
    var9.retira(var15);
    var7.insere(var8, (java.lang.Object)var15);
    java.lang.Object var18 = var2.pesquisa(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test128() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "  ";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.String var9 = "  ";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var7.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "";
    java.lang.Object var14 = var12.pesquisa(var13);
    java.lang.String var15 = "";
    java.lang.Short var16 = new java.lang.Short((short)10);
    var12.insere(var15, (java.lang.Object)var16);
    java.lang.String var18 = "";
    var12.retira(var18);
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "";
    java.lang.Double var22 = new java.lang.Double(100.0d);
    var20.insere(var21, (java.lang.Object)var22);
    ds.TabelaHash var24 = new ds.TabelaHash();
    java.lang.String var25 = "";
    java.lang.Double var26 = new java.lang.Double(100.0d);
    var24.insere(var25, (java.lang.Object)var26);
    ds.TabelaHash var28 = new ds.TabelaHash();
    var20.insere(var25, (java.lang.Object)var28);
    var7.insere(var18, (java.lang.Object)var28);
    java.lang.Object var31 = var0.pesquisa(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);

  }

  public void test129() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "3gp6ph2";
    java.lang.Object var8 = var6.pesquisa(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test130() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(100.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "-45";
    java.lang.Object var10 = var8.pesquisa(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var7.insere(var9, (java.lang.Object)var11);
    var7.imprime();
    var0.insere(var5, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test131() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Object var8 = var6.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "-45";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.String var13 = "";
    java.lang.Object var14 = var10.pesquisa(var13);
    java.lang.Object var15 = var9.pesquisa(var13);
    java.lang.Short var16 = new java.lang.Short((short)0);
    var6.insere(var13, (java.lang.Object)var16);
    java.lang.Object var18 = var4.pesquisa(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test132() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Byte var3 = new java.lang.Byte((byte)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "1";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Double var7 = new java.lang.Double((-1.0d));
    var0.insere(var5, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test133() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    java.lang.Byte var2 = new java.lang.Byte((byte)1);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "false";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.String var10 = "";
    java.lang.Long var11 = new java.lang.Long(10L);
    var7.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "";
    var7.retira(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    java.lang.Double var17 = new java.lang.Double(100.0d);
    var15.insere(var16, (java.lang.Object)var17);
    java.lang.String var19 = "";
    java.lang.Object var20 = var15.pesquisa(var19);
    var4.insere(var13, var20);
    ds.TabelaHash var22 = new ds.TabelaHash();
    var0.insere(var13, (java.lang.Object)var22);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 100.0d+ "'", var20.equals(100.0d));

  }

  public void test134() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "  ";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var7 = "";
    java.lang.Object var8 = var2.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "-45";
    java.lang.Object var11 = var9.pesquisa(var10);
    java.lang.String var12 = "";
    java.lang.Object var13 = var9.pesquisa(var12);
    java.lang.Object var14 = var2.pesquisa(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test135() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3gp6ph2";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "3gp6ph2";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "3gp6ph2";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.String var13 = "";
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "3gp6ph2";
    java.lang.Object var16 = var14.pesquisa(var15);
    var10.insere(var13, (java.lang.Object)var14);
    var0.retira(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test136() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-45";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "  ";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "false";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.Object var10 = var2.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test137() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-45";
    java.lang.Byte var7 = new java.lang.Byte((byte)1);
    var5.insere(var6, (java.lang.Object)var7);
    var1.insere(var4, (java.lang.Object)var7);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "3gp6ph2";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.Object var13 = var1.pesquisa(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test138() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(1L);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    java.lang.Object var9 = new java.lang.Object();
    var0.insere(var7, var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "3gp6ph2";
    java.lang.Object var13 = var11.pesquisa(var12);
    java.lang.String var14 = "";
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "3gp6ph2";
    java.lang.Object var17 = var15.pesquisa(var16);
    var11.insere(var14, (java.lang.Object)var15);
    java.lang.String var19 = "";
    var11.retira(var19);
    var0.retira(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test139() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));

  }

  public void test140() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-45";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Double var8 = new java.lang.Double(100.0d);
    var6.insere(var7, (java.lang.Object)var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    java.lang.Double var12 = new java.lang.Double(100.0d);
    var10.insere(var11, (java.lang.Object)var12);
    ds.TabelaHash var14 = new ds.TabelaHash();
    var6.insere(var11, (java.lang.Object)var14);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var16.imprime();
    java.lang.String var18 = "  ";
    ds.TabelaHash var19 = new ds.TabelaHash();
    var16.insere(var18, (java.lang.Object)var19);
    var16.imprime();
    var4.insere(var11, (java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

}
