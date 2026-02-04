package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
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
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test5() throws Throwable {

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

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(1);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
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

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer(1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.insere(var5, (java.lang.Object)var0);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "hi!";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'.is@|4";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'.is@|4";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
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

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
    java.lang.Double var3 = new java.lang.Double((-1.0d));
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

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.insere(var5, (java.lang.Object)var0);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'.is@|4";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
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

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "RS";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var6 = "";
    java.lang.Object var7 = var0.pesquisa(var6);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
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
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "'.is@|4";
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "RS";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
    java.lang.Double var3 = new java.lang.Double((-1.0d));
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

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    var0.retira(var1);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
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

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.String var2 = "hi!";
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

/*
  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.String var2 = "hi!";
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();

  }
*/
  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Character var2 = new java.lang.Character('#');
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();

  }

  public void test47() throws Throwable {

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

  public void test48() throws Throwable {

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

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
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

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "RS";
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

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var7 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var6 = "";
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

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
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

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character('#');
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
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
    assertTrue(var5 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var7 = "";
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

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.String var4 = "hi!";
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var3);
    java.lang.Object var7 = var2.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
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

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
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

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.String var5 = "hi!";
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var4);
    var0.insere(var4, (java.lang.Object)var0);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
    java.lang.String var3 = "hi!";
    var1.insere(var2, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'.is@|4";
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.String var4 = "hi!";
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var3);
    java.lang.String var7 = "";
    java.lang.Object var8 = var0.pesquisa(var7);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-38"+ "'", var8.equals("-38"));

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-38";
    java.lang.Object var6 = var4.pesquisa(var5);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var8 = "";
    java.lang.Object var9 = var2.pesquisa(var8);
    var0.insere(var1, var9);
    java.lang.Object var11 = var4.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.insere(var3, (java.lang.Object)var3);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.String var5 = "hi!";
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

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-38";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var7 = "";
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

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-38";
    java.lang.Object var8 = var6.pesquisa(var7);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var10 = "";
    java.lang.Object var11 = var4.pesquisa(var10);
    var2.insere(var3, var11);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var14 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "'.is@|4";
    java.lang.Object var10 = var8.pesquisa(var9);
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

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.String var5 = "hi!";
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var4);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "RS";
    java.lang.Object var10 = var8.pesquisa(var9);
    var0.insere(var4, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "'.is@|4";
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
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.String var4 = "hi!";
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var1, (java.lang.Object)var3);
    var0.imprime();

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
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
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

/*
  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Character var8 = new java.lang.Character('#');
    var6.insere(var7, (java.lang.Object)var8);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }
*/
  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-38";
    java.lang.String var7 = "hi!";
    var5.insere(var6, (java.lang.Object)var7);
    var0.insere(var2, (java.lang.Object)var5);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    java.lang.Character var12 = new java.lang.Character('#');
    var10.insere(var11, (java.lang.Object)var12);
    java.lang.String var14 = "";
    var10.retira(var14);
    var0.retira(var14);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.String var5 = "hi!";
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var4);
    java.lang.Object var8 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.String var2 = "hi!";
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-38";
    java.lang.Object var8 = var6.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    java.lang.String var2 = "hi!";
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
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
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character('#');
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-38";
    java.lang.Object var7 = var5.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Object var10 = var8.pesquisa(var9);
    var1.insere(var6, (java.lang.Object)var8);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    var0.insere(var2, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.Object var7 = var3.pesquisa(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-38";
    java.lang.Object var8 = var6.pesquisa(var7);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var10 = "";
    java.lang.Object var11 = var4.pesquisa(var10);
    var2.insere(var3, var11);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var14 = new ds.TabelaHash();
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "-38";
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "";
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "-38";
    java.lang.Object var21 = var19.pesquisa(var20);
    var17.insere(var18, (java.lang.Object)var19);
    java.lang.String var23 = "";
    java.lang.Object var24 = var17.pesquisa(var23);
    var15.insere(var16, var24);
    java.lang.String var26 = "";
    var14.insere(var16, (java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var26);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

/*
  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-38";
    java.lang.Object var6 = var4.pesquisa(var5);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var8 = "";
    java.lang.Object var9 = var2.pesquisa(var8);
    var0.insere(var1, var9);
    var0.imprime();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "RS";
    java.lang.Object var14 = var12.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    java.lang.Integer var17 = new java.lang.Integer(1);
    var15.insere(var16, (java.lang.Object)var17);
    java.lang.Object var19 = var12.pesquisa(var16);
    var0.retira(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }
*/
  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-38";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Float var8 = new java.lang.Float((-1.0f));
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.Object var10 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Object var7 = var5.pesquisa(var6);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var9 = "";
    java.lang.Object var10 = var3.pesquisa(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "-38";
    java.lang.String var13 = "hi!";
    var11.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "";
    java.lang.Object var16 = var11.pesquisa(var15);
    var0.insere(var9, (java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test90() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-38";
    java.lang.String var7 = "hi!";
    var5.insere(var6, (java.lang.Object)var7);
    var3.insere(var4, (java.lang.Object)var6);
    java.lang.String var10 = "";
    java.lang.Object var11 = var3.pesquisa(var10);
    java.lang.Object var12 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-38"+ "'", var11.equals("-38"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test91() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "RS";
    java.lang.Object var5 = var3.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    var0.insere(var4, (java.lang.Object)var6);
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test92() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "RS";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.Object var7 = var3.pesquisa(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test93() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "RS";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Integer var5 = new java.lang.Integer(1);
    var3.insere(var4, (java.lang.Object)var5);
    var1.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    java.lang.Integer var11 = new java.lang.Integer(1);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.Object var13 = var3.pesquisa(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1+ "'", var13.equals(1));

  }

  public void test94() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-38";
    java.lang.Object var8 = var6.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    java.lang.Object var11 = var9.pesquisa(var10);
    var0.insere(var7, (java.lang.Object)var10);
    ds.TabelaHash var13 = new ds.TabelaHash();
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    java.lang.Float var16 = new java.lang.Float((-1.0f));
    var14.insere(var15, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "-38";
    java.lang.String var20 = "hi!";
    var18.insere(var19, (java.lang.Object)var20);
    var13.insere(var15, (java.lang.Object)var18);
    ds.TabelaHash var23 = new ds.TabelaHash();
    java.lang.String var24 = "'.is@|4";
    java.lang.Object var25 = var23.pesquisa(var24);
    java.lang.Object var26 = var18.pesquisa(var24);
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.String var28 = "RS";
    java.lang.Object var29 = var27.pesquisa(var28);
    var0.insere(var24, (java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

  }

  public void test95() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-38";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var6 = "";
    java.lang.Object var7 = var0.pesquisa(var6);
    var0.imprime();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "-38";
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "";
    java.lang.Object var13 = var11.pesquisa(var12);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var15 = "";
    java.lang.Object var16 = var9.pesquisa(var15);
    java.lang.Object var17 = var0.pesquisa(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test96() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    java.lang.Object var5 = var3.pesquisa(var4);
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "-38";
    java.lang.Object var9 = var7.pesquisa(var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    java.lang.Object var12 = var10.pesquisa(var11);
    var1.insere(var8, (java.lang.Object)var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "'.is@|4";
    java.lang.Object var16 = var14.pesquisa(var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var1.insere(var15, (java.lang.Object)var17);
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "'.is@|4";
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    var19.insere(var20, (java.lang.Object)var21);
    var0.insere(var15, (java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test97() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'.is@|4";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-38";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "-38";
    java.lang.Object var10 = var8.pesquisa(var9);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var12 = "";
    java.lang.Object var13 = var6.pesquisa(var12);
    var4.insere(var5, var13);
    var4.imprime();
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "'.is@|4";
    java.lang.Object var18 = var16.pesquisa(var17);
    java.lang.Object var19 = var4.pesquisa(var17);
    var0.retira(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test98() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Float var4 = new java.lang.Float((-1.0f));
    var2.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-38";
    java.lang.String var8 = "hi!";
    var6.insere(var7, (java.lang.Object)var8);
    var1.insere(var3, (java.lang.Object)var6);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "-38";
    java.lang.String var13 = "hi!";
    var11.insere(var12, (java.lang.Object)var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    java.lang.Object var17 = var15.pesquisa(var16);
    var6.insere(var13, (java.lang.Object)var16);
    java.lang.Object var19 = var0.pesquisa(var13);
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "-38";
    java.lang.Object var22 = var20.pesquisa(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.retira(var21);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test99() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'.is@|4";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "-38";
    java.lang.String var10 = "hi!";
    var8.insere(var9, (java.lang.Object)var10);
    var6.insere(var7, (java.lang.Object)var9);
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

  }

  public void test100() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'.is@|4";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-38";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "-38";
    java.lang.Object var11 = var9.pesquisa(var10);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var13 = "";
    java.lang.Object var14 = var7.pesquisa(var13);
    var5.insere(var6, var14);
    java.lang.String var16 = "";
    var4.insere(var6, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "";
    java.lang.Object var21 = var19.pesquisa(var20);
    java.lang.Object var22 = var18.pesquisa(var20);
    var0.insere(var6, (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test101() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "-38";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Object var7 = var5.pesquisa(var6);
    var3.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "-38";
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "-38";
    java.lang.Object var15 = var13.pesquisa(var14);
    var11.insere(var12, (java.lang.Object)var13);
    java.lang.String var17 = "";
    java.lang.Object var18 = var11.pesquisa(var17);
    var9.insere(var10, var18);
    var1.insere(var4, (java.lang.Object)var10);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

}
