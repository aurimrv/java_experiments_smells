package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "hi!";
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "6";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
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

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "wsu!.";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "wsu!.";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "wsu!.";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
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

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "6";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "JK7";
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
    assertTrue(var8 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "6";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "JK7";
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

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "6";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "JK7";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test18() throws Throwable {

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

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "wsu!.";
    ds.TabelaHash var4 = new ds.TabelaHash();
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

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10.0f+ "'", var4.equals(10.0f));

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
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

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "6";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
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

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    var2.retira(var3);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    java.lang.String var7 = "JK7";
    java.lang.Object var8 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
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

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "936";
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var4.insere(var5, (java.lang.Object)var6);
    var2.insere(var3, (java.lang.Object)var6);
    java.lang.String var9 = "JK7";
    java.lang.Object var10 = var2.pesquisa(var9);
    var0.insere(var9, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "6";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "JK7";
    java.lang.Object var8 = var3.pesquisa(var7);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "936";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "6";
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

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "}$3'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
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

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "}$3'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "}$3'";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "}$3'";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "wsu!.";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "6";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "JK7";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test43() throws Throwable {

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

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "6";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "wsu!.";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "}$3'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "}$3'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
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

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "936";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var5);
    java.lang.String var8 = "JK7";
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
    assertTrue(var9 == null);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "JK7";
    java.lang.Object var5 = var2.pesquisa(var4);
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

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "JK7";
    java.lang.Object var5 = var2.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "JK7";
    java.lang.Object var6 = var3.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    java.lang.String var7 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "936";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var4);
    java.lang.String var7 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "6";
    java.lang.Object var4 = var2.pesquisa(var3);
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var7 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "936";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var5);
    java.lang.String var8 = "JK7";
    java.lang.Object var9 = var1.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "JK7";
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

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test66() throws Throwable {

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

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "}$3'";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "936";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Short var6 = new java.lang.Short((short)10);
    var0.insere(var4, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "wsu!.";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "}$3'";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "936";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.Long var8 = new java.lang.Long(0L);
    var3.insere(var5, (java.lang.Object)var8);
    java.lang.Object var10 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "6";
    java.lang.Long var8 = new java.lang.Long(100L);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "JK7";
    java.lang.Object var11 = var6.pesquisa(var10);
    java.lang.Object var12 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "6";
    java.lang.Object var5 = var3.pesquisa(var4);
    var3.imprime();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var8 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "6";
    java.lang.Object var4 = var2.pesquisa(var3);
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "}$3'";
    java.lang.Object var9 = var7.pesquisa(var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "936";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "936";
    java.lang.Float var15 = new java.lang.Float(10.0f);
    var13.insere(var14, (java.lang.Object)var15);
    var11.insere(var12, (java.lang.Object)var15);
    java.lang.Object var18 = var10.pesquisa(var12);
    java.lang.Character var19 = new java.lang.Character('4');
    var7.insere(var12, (java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var12);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var0.insere(var2, (java.lang.Object)var5);
    var0.imprime();

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "936";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "936";
    java.lang.Object var6 = var4.pesquisa(var5);
    var0.retira(var5);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.Object var11 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "}$3'";
    java.lang.Object var5 = var3.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "}$3'";
    java.lang.Object var8 = var6.pesquisa(var7);
    var2.insere(var4, (java.lang.Object)var6);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var0.insere(var2, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Long var5 = new java.lang.Long(0L);
    var0.insere(var2, (java.lang.Object)var5);
    java.lang.String var7 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "wsu!.";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "}$3'";
    java.lang.Object var8 = var6.pesquisa(var7);
    java.lang.Object var9 = var4.pesquisa(var7);
    java.lang.Float var10 = new java.lang.Float(10.0f);
    var0.insere(var7, (java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = new java.lang.Object();
    var0.insere(var2, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "6";
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

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "6";
    java.lang.Long var6 = new java.lang.Long(100L);
    var4.insere(var5, (java.lang.Object)var6);
    var4.imprime();
    var0.insere(var2, (java.lang.Object)var4);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var0.insere(var2, (java.lang.Object)var5);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "936";
    java.lang.Float var10 = new java.lang.Float(10.0f);
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "";
    java.lang.Object var14 = var12.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "6";
    java.lang.Long var17 = new java.lang.Long(100L);
    var15.insere(var16, (java.lang.Object)var17);
    var8.insere(var13, (java.lang.Object)var15);
    java.lang.Object var20 = new java.lang.Object();
    var0.insere(var13, var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "wsu!.";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "936";
    java.lang.Float var8 = new java.lang.Float(10.0f);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "";
    java.lang.Object var11 = var6.pesquisa(var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var5.insere(var10, (java.lang.Object)var12);
    ds.TabelaHash var14 = new ds.TabelaHash();
    var0.insere(var10, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "6";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "936";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "}$3'";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "}$3'";
    java.lang.Object var6 = var4.pesquisa(var5);
    var0.insere(var2, (java.lang.Object)var4);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "936";
    java.lang.Float var10 = new java.lang.Float(10.0f);
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "936";
    java.lang.Object var14 = var12.pesquisa(var13);
    var0.insere(var9, (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "wsu!.";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "936";
    java.lang.Float var9 = new java.lang.Float(10.0f);
    var7.insere(var8, (java.lang.Object)var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    var6.insere(var8, (java.lang.Object)var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "936";
    ds.TabelaHash var16 = new ds.TabelaHash();
    var14.insere(var15, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    var6.insere(var15, (java.lang.Object)var18);
    ds.TabelaHash var20 = new ds.TabelaHash();
    ds.TabelaHash var21 = new ds.TabelaHash();
    java.lang.String var22 = "6";
    java.lang.Object var23 = var21.pesquisa(var22);
    java.lang.Object var24 = var20.pesquisa(var22);
    java.lang.Object var25 = var18.pesquisa(var22);
    var0.insere(var3, (java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "936";
    java.lang.Object var6 = var4.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "6";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.Object var11 = var7.pesquisa(var9);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    var4.insere(var9, (java.lang.Object)var12);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var0.insere(var9, (java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var7);
    java.lang.String var9 = "";
    java.lang.Object var10 = var7.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "936";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var0.insere(var2, (java.lang.Object)var5);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "936";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var0.insere(var9, (java.lang.Object)var12);
    ds.TabelaHash var14 = new ds.TabelaHash();
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "6";
    java.lang.Object var17 = var15.pesquisa(var16);
    java.lang.Object var18 = var14.pesquisa(var16);
    java.lang.Object var19 = var12.pesquisa(var16);
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "936";
    ds.TabelaHash var22 = new ds.TabelaHash();
    var20.insere(var21, (java.lang.Object)var22);
    ds.TabelaHash var24 = new ds.TabelaHash();
    var12.insere(var21, (java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

}
