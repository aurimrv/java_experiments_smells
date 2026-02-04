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
    var0.retira(var1);

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.0d+ "'", var4.equals(1.0d));

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    java.lang.Object[] var6 = var0.recuperaItens();

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();
    var0.retira(var4);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "";
    var0.insere(var3, (java.lang.Object)var2);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.retira(var5);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "yvtJN";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var0.pesquisa(var5);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "02047117152";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    var2.imprime();

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    var0.imprime();

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "yvtJN";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "02047117152";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var9 = "";
    var0.retira(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    java.lang.Object[] var5 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "02047117152";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var9 = "";
    var0.retira(var9);
    var0.imprime();
    var2.insere(var9, (java.lang.Object)var9);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3168754209";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "8oLv5FsY4Dy";
    var0.retira(var2);
    var0.insere(var2, (java.lang.Object)var2);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "8oLv5FsY4Dy";
    var0.retira(var2);
    var0.imprime();
    java.lang.Object[] var5 = var0.recuperaItens();

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "8oLv5FsY4Dy";
    var0.retira(var2);
    var0.imprime();

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3168754209";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    java.lang.Object[] var5 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.insere(var5, (java.lang.Object)var0);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "02047117152";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.Object var10 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "8oLv5FsY4Dy";
    var1.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "yvtJN";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var1.pesquisa(var6);
    var0.retira(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "02047117152";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3168754209";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-319";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    var0.imprime();

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3168754209";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    var0.insere(var1, (java.lang.Object)var1);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-319";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-319";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    var0.retira(var2);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "02047117152";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    var0.retira(var7);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "yvtJN";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-319";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "o5xk5n";
    java.lang.Object var5 = var1.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-319";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "02047117152";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.Object var10 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "3168754209";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "o5xk5n";
    java.lang.Object var5 = var1.pesquisa(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-319";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "yvtJN";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var1.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    var2.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "8oLv5FsY4Dy";
    var0.retira(var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "yvtJN";
    java.lang.Double var6 = new java.lang.Double(1.0d);
    var3.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var3.pesquisa(var8);
    var0.insere(var8, (java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "02047117152";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "02047117152";
    java.lang.Double var6 = new java.lang.Double(1.0d);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var4.retira(var8);
    var2.insere(var3, (java.lang.Object)var8);
    java.lang.Object var11 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "3168754209";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.String var5 = "o5xk5n";
    java.lang.Object var6 = var2.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "yvtJN";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var2.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var2.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.Object[] var7 = var6.recuperaItens();
    java.lang.String var8 = "8oLv5FsY4Dy";
    var6.retira(var8);
    var0.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "yvtJN";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-319";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "o5xk5n";
    java.lang.Object var9 = var5.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "yvtJN";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.Object[] var9 = var7.recuperaItens();
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "-319";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.Object var13 = var7.pesquisa(var11);
    java.lang.Object var14 = var6.pesquisa(var11);
    java.lang.Object var15 = new java.lang.Object();
    var0.insere(var11, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "02047117152";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "02047117152";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.String var10 = "";
    var1.retira(var10);
    var1.imprime();
    java.lang.Object[] var13 = var1.recuperaItens();
    ds.TabelaHash var14 = new ds.TabelaHash();
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "02047117152";
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "02047117152";
    java.lang.Double var19 = new java.lang.Double(1.0d);
    var17.insere(var18, (java.lang.Object)var19);
    java.lang.String var21 = "";
    var17.retira(var21);
    var15.insere(var16, (java.lang.Object)var21);
    java.lang.String var24 = "";
    var15.retira(var24);
    java.lang.Object var26 = var14.pesquisa(var24);
    java.lang.Object var27 = var1.pesquisa(var24);
    java.lang.Object var28 = var0.pesquisa(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    var2.retira(var3);
    java.lang.Character var5 = new java.lang.Character(' ');
    var1.insere(var3, (java.lang.Object)var5);
    var0.retira(var3);
    ds.TabelaHash var8 = new ds.TabelaHash();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    var9.retira(var10);
    java.lang.String var12 = "o5xk5n";
    java.lang.Object var13 = var9.pesquisa(var12);
    java.lang.Object var14 = var8.pesquisa(var12);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var0.insere(var12, (java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-319";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "o5xk5n";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    java.lang.Object[] var6 = var0.recuperaItens();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    var7.retira(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.Object[] var12 = var11.recuperaItens();
    java.lang.String var13 = "8oLv5FsY4Dy";
    var11.retira(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var0.insere(var13, (java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "3168754209";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "yvtJN";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    var6.retira(var7);
    java.lang.String var9 = "o5xk5n";
    java.lang.Object var10 = var6.pesquisa(var9);
    java.lang.Object var11 = var5.pesquisa(var9);
    var0.retira(var9);
    java.lang.Object[] var13 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.Character var4 = new java.lang.Character(' ');
    var0.insere(var2, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.Object[] var7 = var6.recuperaItens();
    ds.TabelaHash var8 = new ds.TabelaHash();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.Object[] var10 = var9.recuperaItens();
    java.lang.String var11 = "8oLv5FsY4Dy";
    var9.retira(var11);
    var8.retira(var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    var14.imprime();
    java.lang.String var16 = "yvtJN";
    java.lang.Double var17 = new java.lang.Double(1.0d);
    var14.insere(var16, (java.lang.Object)var17);
    java.lang.String var19 = "";
    java.lang.Object var20 = var14.pesquisa(var19);
    var6.insere(var11, (java.lang.Object)var19);
    var0.retira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "02047117152";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var9 = "";
    var0.retira(var9);
    var0.imprime();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.Object[] var13 = var12.recuperaItens();
    java.lang.String var14 = "8oLv5FsY4Dy";
    var12.retira(var14);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var0.insere(var14, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "02047117152";
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "02047117152";
    java.lang.Double var22 = new java.lang.Double(1.0d);
    var20.insere(var21, (java.lang.Object)var22);
    java.lang.String var24 = "";
    var20.retira(var24);
    var18.insere(var19, (java.lang.Object)var24);
    java.lang.String var27 = "";
    var18.retira(var27);
    var18.imprime();
    ds.TabelaHash var30 = new ds.TabelaHash();
    java.lang.Object[] var31 = var30.recuperaItens();
    java.lang.String var32 = "8oLv5FsY4Dy";
    var30.retira(var32);
    ds.TabelaHash var34 = new ds.TabelaHash();
    var18.insere(var32, (java.lang.Object)var34);
    ds.TabelaHash var36 = new ds.TabelaHash();
    java.lang.String var37 = "02047117152";
    ds.TabelaHash var38 = new ds.TabelaHash();
    java.lang.String var39 = "02047117152";
    java.lang.Double var40 = new java.lang.Double(1.0d);
    var38.insere(var39, (java.lang.Object)var40);
    java.lang.String var42 = "";
    var38.retira(var42);
    var36.insere(var37, (java.lang.Object)var42);
    ds.TabelaHash var45 = new ds.TabelaHash();
    java.lang.Object[] var46 = var45.recuperaItens();
    var34.insere(var42, (java.lang.Object)var46);
    var0.retira(var42);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.Object[] var3 = var0.recuperaItens();

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.retira(var2);
    var0.imprime();

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "02047117152";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "02047117152";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var9 = "";
    var0.retira(var9);
    var0.imprime();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.Object[] var13 = var12.recuperaItens();
    java.lang.String var14 = "8oLv5FsY4Dy";
    var12.retira(var14);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var0.insere(var14, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "";
    var18.retira(var19);
    java.lang.String var21 = "o5xk5n";
    java.lang.Object var22 = var18.pesquisa(var21);
    ds.TabelaHash var23 = new ds.TabelaHash();
    java.lang.String var24 = "02047117152";
    ds.TabelaHash var25 = new ds.TabelaHash();
    java.lang.String var26 = "02047117152";
    java.lang.Double var27 = new java.lang.Double(1.0d);
    var25.insere(var26, (java.lang.Object)var27);
    java.lang.String var29 = "";
    var25.retira(var29);
    var23.insere(var24, (java.lang.Object)var29);
    java.lang.String var32 = "";
    var23.retira(var32);
    var23.imprime();
    ds.TabelaHash var35 = new ds.TabelaHash();
    java.lang.Object[] var36 = var35.recuperaItens();
    java.lang.String var37 = "8oLv5FsY4Dy";
    var35.retira(var37);
    ds.TabelaHash var39 = new ds.TabelaHash();
    var23.insere(var37, (java.lang.Object)var39);
    var0.insere(var21, (java.lang.Object)var23);
    java.lang.Object[] var42 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

}
