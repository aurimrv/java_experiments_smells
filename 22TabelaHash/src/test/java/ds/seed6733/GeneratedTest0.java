package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
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
    java.lang.String var1 = "cWUH";
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

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "cWUH";
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

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "cWUH";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
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

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "cWUH";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "cWUH";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test9() throws Throwable {

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

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
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
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

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

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "cWUH";
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

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test25() throws Throwable {

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

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "#%;|'";
    java.lang.Character var3 = new java.lang.Character('#');
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
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

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    var4.imprime();

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.String var10 = "728134";
    java.lang.Object var11 = var1.pesquisa(var10);
    java.lang.Object var12 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    var0.imprime();
    var0.insere(var1, (java.lang.Object)var1);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.Object var10 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.String var10 = "728134";
    java.lang.Object var11 = var1.pesquisa(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
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

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "YSxiudl";
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

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "YSxiudl";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    var0.imprime();
    java.lang.Object var5 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "YSxiudl";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "#%;|'";
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

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "YSxiudl";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var9 = "728134";
    java.lang.Object var10 = var0.pesquisa(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    java.lang.String var13 = "";
    java.lang.Object var14 = var11.pesquisa(var13);
    var0.retira(var13);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var16.imprime();
    java.lang.String var18 = "";
    java.lang.Object var19 = var16.pesquisa(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "#%;|'";
    java.lang.Character var3 = new java.lang.Character('#');
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    java.lang.String var7 = "";
    java.lang.Object var8 = var5.pesquisa(var7);
    var0.insere(var2, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var4.retira(var8);
    var2.insere(var3, (java.lang.Object)var8);
    java.lang.String var11 = "728134";
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
    assertTrue(var12 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "cWUH";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    java.lang.String var6 = "";
    java.lang.Object var7 = var4.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Object var10 = var8.pesquisa(var9);
    var0.insere(var6, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.Object var8 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "";
    var8.retira(var12);
    var6.insere(var7, (java.lang.Object)var12);
    java.lang.String var15 = "728134";
    java.lang.Object var16 = var6.pesquisa(var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var17.imprime();
    java.lang.String var19 = "";
    java.lang.Object var20 = var17.pesquisa(var19);
    var6.retira(var19);
    java.lang.Short var22 = new java.lang.Short((short)1);
    var5.insere(var19, (java.lang.Object)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var19);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "#%;|'";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "cWUH";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var5.insere(var6, (java.lang.Object)var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "";
    ds.TabelaHash var18 = new ds.TabelaHash();
    var16.insere(var17, (java.lang.Object)var18);
    java.lang.String var20 = "";
    var16.retira(var20);
    var14.insere(var15, (java.lang.Object)var20);
    var0.insere(var11, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    java.lang.Object var13 = var5.pesquisa(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    ds.TabelaHash var11 = new ds.TabelaHash();
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "";
    var9.retira(var13);
    var7.insere(var8, (java.lang.Object)var13);
    java.lang.String var16 = "728134";
    java.lang.Object var17 = var7.pesquisa(var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    var18.imprime();
    java.lang.String var20 = "";
    java.lang.Object var21 = var18.pesquisa(var20);
    var7.retira(var20);
    var0.retira(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "";
    var6.retira(var10);
    var4.insere(var5, (java.lang.Object)var10);
    java.lang.String var13 = "728134";
    java.lang.Object var14 = var4.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var15.imprime();
    java.lang.String var17 = "";
    java.lang.Object var18 = var15.pesquisa(var17);
    var4.retira(var17);
    ds.TabelaHash var20 = new ds.TabelaHash();
    ds.TabelaHash var21 = new ds.TabelaHash();
    java.lang.String var22 = "";
    ds.TabelaHash var23 = new ds.TabelaHash();
    var21.insere(var22, (java.lang.Object)var23);
    ds.TabelaHash var25 = new ds.TabelaHash();
    var20.insere(var22, (java.lang.Object)var25);
    var0.insere(var17, (java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "#%;|'";
    java.lang.Object var4 = var2.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var5.insere(var6, (java.lang.Object)var11);
    java.lang.String var14 = "728134";
    java.lang.Object var15 = var5.pesquisa(var14);
    var1.insere(var3, (java.lang.Object)var14);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "";
    ds.TabelaHash var13 = new ds.TabelaHash();
    var11.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "";
    var11.retira(var15);
    var9.insere(var10, (java.lang.Object)var15);
    var0.retira(var10);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.String var10 = "728134";
    java.lang.Object var11 = var1.pesquisa(var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    java.lang.String var14 = "";
    java.lang.Object var15 = var12.pesquisa(var14);
    var1.retira(var14);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var0.insere(var14, (java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
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

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "#%;|'";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var7.insere(var9, (java.lang.Object)var12);
    ds.TabelaHash var14 = new ds.TabelaHash();
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    ds.TabelaHash var17 = new ds.TabelaHash();
    var15.insere(var16, (java.lang.Object)var17);
    ds.TabelaHash var19 = new ds.TabelaHash();
    var14.insere(var16, (java.lang.Object)var19);
    var6.insere(var9, (java.lang.Object)var14);
    ds.TabelaHash var22 = new ds.TabelaHash();
    var0.insere(var9, (java.lang.Object)var22);
    var0.imprime();

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "#%;|'";
    java.lang.Object var8 = var6.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "";
    ds.TabelaHash var13 = new ds.TabelaHash();
    var11.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "";
    var11.retira(var15);
    var9.insere(var10, (java.lang.Object)var15);
    java.lang.String var18 = "728134";
    java.lang.Object var19 = var9.pesquisa(var18);
    var5.insere(var7, (java.lang.Object)var18);
    java.lang.Object var21 = var0.pesquisa(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

}
