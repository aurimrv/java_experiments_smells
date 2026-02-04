package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

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

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test3() throws Throwable {

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

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "38";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Long var3 = new java.lang.Long(100L);
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

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "38";
    java.lang.Short var2 = new java.lang.Short((short)(-1));
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "8;>3?(";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "8;>3?(";
    java.lang.Object var5 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "hi!";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "8;>3?(";
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

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Long var3 = new java.lang.Long(100L);
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
    assertTrue(var6 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    try {
      var1.retira(var5);
      // The following exception was thrown during execution.
      // This behavior will recorded for regression testing.
    
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
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

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "h";
    java.lang.Short var2 = new java.lang.Short((short)0);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
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

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
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

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "38";
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

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
    java.lang.Short var3 = new java.lang.Short((short)0);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    java.lang.Float var3 = new java.lang.Float(10.0f);
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

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
    java.lang.Short var3 = new java.lang.Short((short)0);
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

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
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

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
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

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var2.pesquisa(var4);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(0);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var3.pesquisa(var5);
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

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var9 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var9 = "8;>3?(";
    java.lang.Object var10 = var0.pesquisa(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
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

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(0);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var3);
    var2.retira(var3);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "h";
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "38";
    java.lang.Long var4 = new java.lang.Long(100L);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var2.pesquisa(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "h";
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "8;>3?(";
    java.lang.Object var9 = var4.pesquisa(var8);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var11 = "8;>3?(";
    java.lang.Object var12 = var2.pesquisa(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test56() throws Throwable {

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

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var3.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();
    var2.insere(var3, (java.lang.Object)var3);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "h";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var3);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var0.pesquisa(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    java.lang.Object var4 = var2.pesquisa(var3);
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

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
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

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
    java.lang.Short var3 = new java.lang.Short((short)0);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "8;>3?(";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var6 = var2.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var0.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "38";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var4);
    java.lang.String var7 = "8;>3?(";
    java.lang.Object var8 = var1.pesquisa(var7);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "38";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var4);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var3.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10.0f+ "'", var4.equals(10.0f));

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float(10.0f);
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

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(0);
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

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    var2.imprime();

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "38";
    java.lang.Long var4 = new java.lang.Long(100L);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "328";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var5);
    java.lang.Object var8 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    java.lang.String var7 = "";
    java.lang.Object var8 = var0.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10.0f+ "'", var8.equals(10.0f));

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "328";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var5);
    java.lang.String var8 = "";
    java.lang.Object var9 = var1.pesquisa(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10.0f+ "'", var9.equals(10.0f));

  }

  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "h";
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "8;>3?(";
    java.lang.Object var8 = var3.pesquisa(var7);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var10 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test90() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
    java.lang.Short var3 = new java.lang.Short((short)0);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "8;>3?(";
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

  public void test91() throws Throwable {

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

  public void test92() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Object var4 = var2.pesquisa(var3);
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

  public void test93() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "328";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "e";
    java.lang.Object var7 = var5.pesquisa(var6);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var9 = "8;>3?(";
    java.lang.Object var10 = var3.pesquisa(var9);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test94() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "328";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test95() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var6 = "8;>3?(";
    java.lang.Object var7 = var0.pesquisa(var6);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test96() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "e";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var7 = "8;>3?(";
    java.lang.Object var8 = var1.pesquisa(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test97() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "e";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "h";
    java.lang.Short var7 = new java.lang.Short((short)0);
    var5.insere(var6, (java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();

  }

  public void test99() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "e";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "h";
    java.lang.Short var7 = new java.lang.Short((short)0);
    var5.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "8;>3?(";
    java.lang.Object var10 = var5.pesquisa(var9);
    var3.insere(var4, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test100() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "h";
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var1.pesquisa(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test101() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "38";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    java.lang.Object var6 = var4.pesquisa(var5);
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

  public void test102() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "328";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "e";
    java.lang.Object var7 = var5.pesquisa(var6);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var9 = "8;>3?(";
    java.lang.Object var10 = var3.pesquisa(var9);
    java.lang.Object var11 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test103() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "328";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "38";
    java.lang.Long var7 = new java.lang.Long(100L);
    var5.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    java.lang.Object var10 = var5.pesquisa(var9);
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
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test104() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var4.pesquisa(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test105() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var4.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "e";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.Object var10 = var4.pesquisa(var8);
    java.lang.Object var11 = var1.pesquisa(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test106() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "e";
    java.lang.Object var6 = var4.pesquisa(var5);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var8 = "8;>3?(";
    java.lang.Object var9 = var2.pesquisa(var8);
    java.lang.Object var10 = var1.pesquisa(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test107() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var3.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "h";
    java.lang.Short var11 = new java.lang.Short((short)0);
    var9.insere(var10, (java.lang.Object)var11);
    var7.insere(var8, (java.lang.Object)var10);
    ds.TabelaHash var14 = new ds.TabelaHash();
    var3.insere(var10, (java.lang.Object)var14);
    java.lang.Object var16 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test108() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(0);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "e";
    java.lang.Object var7 = var5.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "38";
    java.lang.Object var12 = var10.pesquisa(var11);
    var8.insere(var9, (java.lang.Object)var11);
    java.lang.String var14 = "8;>3?(";
    java.lang.Object var15 = var8.pesquisa(var14);
    var0.insere(var6, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test109() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "h";
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "8;>3?(";
    java.lang.Object var8 = var3.pesquisa(var7);
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
    assertTrue(var8 == null);

  }

  public void test110() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "h";
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var4);
    java.lang.Object var8 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test111() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "38";
    java.lang.Object var10 = var8.pesquisa(var9);
    var6.insere(var7, (java.lang.Object)var9);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "h";
    java.lang.Short var16 = new java.lang.Short((short)0);
    var14.insere(var15, (java.lang.Object)var16);
    java.lang.Object var18 = var12.pesquisa(var15);
    java.lang.Object var19 = var6.pesquisa(var15);
    java.lang.Object var20 = var0.pesquisa(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);

  }

  public void test112() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "e";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.Object var7 = var1.pesquisa(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test113() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "e";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    var5.imprime();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "e";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.Object var11 = var5.pesquisa(var9);
    java.lang.Object var12 = var2.pesquisa(var9);
    java.lang.Object var13 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test114() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(0);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = new java.lang.Object();
    var0.insere(var2, var5);

  }

  public void test115() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "h";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test116() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "328";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    java.lang.String var7 = "";
    java.lang.Object var8 = var0.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "e";
    ds.TabelaHash var11 = new ds.TabelaHash();
    var9.insere(var10, (java.lang.Object)var11);
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "";
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "328";
    java.lang.Float var17 = new java.lang.Float(10.0f);
    var15.insere(var16, (java.lang.Object)var17);
    var13.insere(var14, (java.lang.Object)var17);
    var0.insere(var10, (java.lang.Object)var17);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10.0f+ "'", var8.equals(10.0f));

  }

  public void test117() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "e";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "38";
    java.lang.Object var7 = var5.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "328";
    java.lang.Object var10 = var8.pesquisa(var9);
    var1.insere(var6, (java.lang.Object)var8);
    java.lang.Object var12 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test118() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "38";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "38";
    java.lang.Short var6 = new java.lang.Short((short)(-1));
    var4.insere(var5, (java.lang.Object)var6);
    var0.insere(var2, (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test119() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "h";
    java.lang.Short var4 = new java.lang.Short((short)0);
    var2.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "38";
    java.lang.Long var10 = new java.lang.Long(100L);
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "38";
    java.lang.Object var14 = var12.pesquisa(var13);
    var6.insere(var9, (java.lang.Object)var12);
    var0.insere(var3, (java.lang.Object)var6);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "328";
    java.lang.Object var19 = var17.pesquisa(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.retira(var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test120() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(0);
    var1.insere(var2, (java.lang.Object)var3);
    var1.imprime();
    var1.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "e";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "h";
    java.lang.Short var11 = new java.lang.Short((short)0);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "8;>3?(";
    java.lang.Object var14 = var9.pesquisa(var13);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var16 = "8;>3?(";
    java.lang.Object var17 = var7.pesquisa(var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "";
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "328";
    java.lang.Float var22 = new java.lang.Float(10.0f);
    var20.insere(var21, (java.lang.Object)var22);
    var18.insere(var19, (java.lang.Object)var22);
    java.lang.String var25 = "";
    java.lang.Object var26 = var18.pesquisa(var25);
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.String var28 = "e";
    ds.TabelaHash var29 = new ds.TabelaHash();
    var27.insere(var28, (java.lang.Object)var29);
    ds.TabelaHash var31 = new ds.TabelaHash();
    java.lang.String var32 = "";
    ds.TabelaHash var33 = new ds.TabelaHash();
    java.lang.String var34 = "328";
    java.lang.Float var35 = new java.lang.Float(10.0f);
    var33.insere(var34, (java.lang.Object)var35);
    var31.insere(var32, (java.lang.Object)var35);
    var18.insere(var28, (java.lang.Object)var35);
    var1.insere(var16, (java.lang.Object)var28);
    java.lang.Object var40 = var0.pesquisa(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 10.0f+ "'", var26.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);

  }

  public void test121() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(0);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "e";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "h";
    java.lang.Short var10 = new java.lang.Short((short)0);
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "8;>3?(";
    java.lang.Object var13 = var8.pesquisa(var12);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var15 = "8;>3?(";
    java.lang.Object var16 = var6.pesquisa(var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "";
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "328";
    java.lang.Float var21 = new java.lang.Float(10.0f);
    var19.insere(var20, (java.lang.Object)var21);
    var17.insere(var18, (java.lang.Object)var21);
    java.lang.String var24 = "";
    java.lang.Object var25 = var17.pesquisa(var24);
    ds.TabelaHash var26 = new ds.TabelaHash();
    java.lang.String var27 = "e";
    ds.TabelaHash var28 = new ds.TabelaHash();
    var26.insere(var27, (java.lang.Object)var28);
    ds.TabelaHash var30 = new ds.TabelaHash();
    java.lang.String var31 = "";
    ds.TabelaHash var32 = new ds.TabelaHash();
    java.lang.String var33 = "328";
    java.lang.Float var34 = new java.lang.Float(10.0f);
    var32.insere(var33, (java.lang.Object)var34);
    var30.insere(var31, (java.lang.Object)var34);
    var17.insere(var27, (java.lang.Object)var34);
    var0.insere(var15, (java.lang.Object)var27);
    ds.TabelaHash var39 = new ds.TabelaHash();
    java.lang.String var40 = "e";
    java.lang.Object var41 = var39.pesquisa(var40);
    java.lang.Object var42 = var0.pesquisa(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 10.0f+ "'", var25.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == null);

  }

  public void test122() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10.0f+ "'", var6.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test123() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "328";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "e";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    var5.imprime();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "e";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.Object var11 = var5.pesquisa(var9);
    java.lang.Object var12 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test124() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(0);
    var1.insere(var2, (java.lang.Object)var3);
    var1.imprime();
    var1.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "e";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "h";
    java.lang.Short var11 = new java.lang.Short((short)0);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "8;>3?(";
    java.lang.Object var14 = var9.pesquisa(var13);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var16 = "8;>3?(";
    java.lang.Object var17 = var7.pesquisa(var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "";
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "328";
    java.lang.Float var22 = new java.lang.Float(10.0f);
    var20.insere(var21, (java.lang.Object)var22);
    var18.insere(var19, (java.lang.Object)var22);
    java.lang.String var25 = "";
    java.lang.Object var26 = var18.pesquisa(var25);
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.String var28 = "e";
    ds.TabelaHash var29 = new ds.TabelaHash();
    var27.insere(var28, (java.lang.Object)var29);
    ds.TabelaHash var31 = new ds.TabelaHash();
    java.lang.String var32 = "";
    ds.TabelaHash var33 = new ds.TabelaHash();
    java.lang.String var34 = "328";
    java.lang.Float var35 = new java.lang.Float(10.0f);
    var33.insere(var34, (java.lang.Object)var35);
    var31.insere(var32, (java.lang.Object)var35);
    var18.insere(var28, (java.lang.Object)var35);
    var1.insere(var16, (java.lang.Object)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var16);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 10.0f+ "'", var26.equals(10.0f));

  }

  public void test125() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "38";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var3.pesquisa(var7);
    java.lang.Object var9 = var1.pesquisa(var7);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "e";
    ds.TabelaHash var12 = new ds.TabelaHash();
    var10.insere(var11, (java.lang.Object)var12);
    java.lang.String var14 = "";
    java.lang.Object var15 = var12.pesquisa(var14);
    var0.insere(var7, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test126() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "e";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "h";
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "8;>3?(";
    java.lang.Object var9 = var4.pesquisa(var8);
    var2.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "328";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "e";
    java.lang.Object var15 = var13.pesquisa(var14);
    var11.insere(var12, (java.lang.Object)var13);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var17.imprime();
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "h";
    java.lang.Short var21 = new java.lang.Short((short)0);
    var19.insere(var20, (java.lang.Object)var21);
    ds.TabelaHash var23 = new ds.TabelaHash();
    var23.imprime();
    ds.TabelaHash var25 = new ds.TabelaHash();
    java.lang.String var26 = "38";
    java.lang.Long var27 = new java.lang.Long(100L);
    var25.insere(var26, (java.lang.Object)var27);
    ds.TabelaHash var29 = new ds.TabelaHash();
    java.lang.String var30 = "38";
    java.lang.Object var31 = var29.pesquisa(var30);
    var23.insere(var26, (java.lang.Object)var29);
    var17.insere(var20, (java.lang.Object)var23);
    ds.TabelaHash var34 = new ds.TabelaHash();
    ds.TabelaHash var35 = new ds.TabelaHash();
    java.lang.String var36 = "38";
    java.lang.Object var37 = var35.pesquisa(var36);
    java.lang.Object var38 = var34.pesquisa(var36);
    var11.insere(var20, (java.lang.Object)var34);
    var1.insere(var3, (java.lang.Object)var20);
    ds.TabelaHash var41 = new ds.TabelaHash();
    java.lang.String var42 = "e";
    ds.TabelaHash var43 = new ds.TabelaHash();
    var41.insere(var42, (java.lang.Object)var43);
    java.lang.String var45 = "";
    java.lang.Object var46 = var43.pesquisa(var45);
    ds.TabelaHash var47 = new ds.TabelaHash();
    java.lang.String var48 = "";
    ds.TabelaHash var49 = new ds.TabelaHash();
    java.lang.String var50 = "h";
    java.lang.Short var51 = new java.lang.Short((short)0);
    var49.insere(var50, (java.lang.Object)var51);
    var47.insere(var48, (java.lang.Object)var50);
    ds.TabelaHash var54 = new ds.TabelaHash();
    var43.insere(var50, (java.lang.Object)var54);
    var0.insere(var20, (java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);

  }

}
