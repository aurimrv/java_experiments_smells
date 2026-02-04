package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(1);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = ":'";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
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
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "14";
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

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "14";
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

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "0LB4aV";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = ":'";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
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

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "0LB4aV";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var8 = new ds.TabelaHash();

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "0LB4aV";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    ds.TabelaHash var9 = new ds.TabelaHash();

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "0LB4aV";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.imprime();
    var5.insere(var4, (java.lang.Object)var5);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "0LB4aV";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.imprime();

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "0LB4aV";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var3.insere(var5, (java.lang.Object)var6);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var9 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    java.lang.String var6 = "0LB4aV";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var4.insere(var6, (java.lang.Object)var7);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
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

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "0LB4aV";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var3.insere(var5, (java.lang.Object)var6);
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
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "0LB4aV";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "14";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "0LB4aV";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = ":'";
    java.lang.Object var5 = var3.pesquisa(var4);
    var0.insere(var2, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "0LB4aV";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = ":'";
    java.lang.Object var6 = var4.pesquisa(var5);
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "0LB4aV";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var3.insere(var5, (java.lang.Object)var6);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
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

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.insere(var1, (java.lang.Object)var2);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "14";
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

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "14";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();
    java.lang.Object var7 = var2.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "14";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();
    var0.imprime();
    java.lang.Object var8 = var2.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "0LB4aV";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = ":'";
    java.lang.Object var6 = var4.pesquisa(var5);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var8 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
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

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = ":'";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "14";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "]y{BA";
    java.lang.Object var5 = var0.pesquisa(var4);
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

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "hi!";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
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

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = ":'";
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

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "14";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "]y{BA";
    java.lang.Object var13 = var8.pesquisa(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var12);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    java.lang.Integer var9 = new java.lang.Integer(1);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    var2.insere(var8, (java.lang.Object)var11);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "14";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "0LB4aV";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "14";
    java.lang.Object var7 = var5.pesquisa(var6);
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

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var2.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = ":'";
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "14";
    java.lang.Object var12 = var10.pesquisa(var11);
    var8.insere(var9, (java.lang.Object)var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    ds.TabelaHash var16 = new ds.TabelaHash();
    var16.imprime();
    var14.insere(var15, (java.lang.Object)var16);
    var2.insere(var11, (java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1+ "'", var7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "]y{BA";
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

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "0LB4aV";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "]y{BA";
    java.lang.Object var8 = var3.pesquisa(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "0LB4aV";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "14";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.Object var11 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = ":'";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "14";
    java.lang.Object var10 = var8.pesquisa(var9);
    var6.insere(var7, (java.lang.Object)var9);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "";
    ds.TabelaHash var14 = new ds.TabelaHash();
    var14.imprime();
    var12.insere(var13, (java.lang.Object)var14);
    var0.insere(var9, (java.lang.Object)var12);
    var12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "14";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var5.insere(var6, (java.lang.Object)var7);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object var10 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "14";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.Object var11 = var7.pesquisa(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.retira(var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object var7 = var1.pesquisa(var3);
    ds.TabelaHash var8 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "0LB4aV";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var3.insere(var5, (java.lang.Object)var6);
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var9 = new ds.TabelaHash();
    var9.imprime();
    var0.insere(var2, (java.lang.Object)var9);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = ":'";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "14";
    java.lang.Object var6 = var4.pesquisa(var5);
    var2.insere(var3, (java.lang.Object)var5);
    ds.TabelaHash var8 = new ds.TabelaHash();
    var8.imprime();
    java.lang.String var10 = "0LB4aV";
    ds.TabelaHash var11 = new ds.TabelaHash();
    var8.insere(var10, (java.lang.Object)var11);
    var0.insere(var5, (java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    java.lang.Object var9 = var7.pesquisa(var8);
    var0.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object var8 = var2.pesquisa(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = ":'";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test66() throws Throwable {

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

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "]y{BA";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "14";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.Object var10 = var6.pesquisa(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "14";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    var4.insere(var5, (java.lang.Object)var6);
    var6.imprime();
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "14";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.Long var13 = new java.lang.Long(0L);
    var6.insere(var11, (java.lang.Object)var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    java.lang.Integer var17 = new java.lang.Integer(1);
    var15.insere(var16, (java.lang.Object)var17);
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "";
    java.lang.Integer var21 = new java.lang.Integer(1);
    var19.insere(var20, (java.lang.Object)var21);
    java.lang.String var23 = "";
    java.lang.Object var24 = var19.pesquisa(var23);
    ds.TabelaHash var25 = new ds.TabelaHash();
    java.lang.String var26 = ":'";
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.String var28 = "14";
    java.lang.Object var29 = var27.pesquisa(var28);
    var25.insere(var26, (java.lang.Object)var28);
    ds.TabelaHash var31 = new ds.TabelaHash();
    java.lang.String var32 = "";
    ds.TabelaHash var33 = new ds.TabelaHash();
    var33.imprime();
    var31.insere(var32, (java.lang.Object)var33);
    var19.insere(var28, (java.lang.Object)var31);
    var6.insere(var16, (java.lang.Object)var19);
    var0.insere(var2, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 1+ "'", var24.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

  }

}
