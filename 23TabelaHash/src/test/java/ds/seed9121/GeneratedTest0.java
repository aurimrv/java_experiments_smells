package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    var0.retira(var2);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.retira(var1);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    java.lang.Float var4 = new java.lang.Float(1.0f);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "";
    java.lang.Object var4 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    var0.insere(var4, (java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

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
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Object var5 = var1.pesquisa(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Float var5 = new java.lang.Float(1.0f);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "t/6r&![8_x";
    java.lang.Object var8 = var1.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Float var5 = new java.lang.Float(1.0f);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Object var5 = var1.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    var0.imprime();

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    java.lang.Integer var4 = new java.lang.Integer(10);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var0.recuperaItens();

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "true";
    java.lang.Object var4 = var0.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "true";
    java.lang.Object var4 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100L+ "'", var4.equals(100L));

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Float var5 = new java.lang.Float(1.0f);
    var1.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    java.lang.Integer var4 = new java.lang.Integer(10);
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    java.lang.Integer var4 = new java.lang.Integer(10);
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();
    java.lang.String var7 = "txqpr|o#";
    java.lang.Object var8 = var0.pesquisa(var7);
    java.lang.Object[] var9 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "true";
    java.lang.Object var5 = var1.pesquisa(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var0.insere(var3, (java.lang.Object)var4);
    var4.imprime();

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Float var5 = new java.lang.Float(1.0f);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "t/6r&![8_x";
    java.lang.Object var8 = var1.pesquisa(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "Entrada[";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var2.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var8 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "Entrada[";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    var2.insere(var1, (java.lang.Object)var2);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Integer var5 = new java.lang.Integer(10);
    var1.insere(var4, (java.lang.Object)var5);
    var1.imprime();
    java.lang.String var8 = "txqpr|o#";
    java.lang.Object var9 = var1.pesquisa(var8);
    var0.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Integer var5 = new java.lang.Integer(10);
    var1.insere(var4, (java.lang.Object)var5);
    var1.imprime();
    java.lang.String var8 = "txqpr|o#";
    java.lang.Object var9 = var1.pesquisa(var8);
    var0.insere(var8, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Integer var5 = new java.lang.Integer(10);
    var1.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();
    java.lang.Object var8 = var4.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "true";
    java.lang.Object var5 = var1.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    var1.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Object var5 = var1.pesquisa(var4);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    java.lang.Float var5 = new java.lang.Float(1.0f);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "t/6r&![8_x";
    java.lang.Object var8 = var1.pesquisa(var7);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "Entrada[";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    java.lang.String var5 = "true";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "]:";
    java.lang.Long var8 = new java.lang.Long(100L);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "";
    var6.retira(var10);
    var0.insere(var5, (java.lang.Object)var10);
    ds.TabelaHash var13 = new ds.TabelaHash();

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    java.lang.String var6 = "true";
    java.lang.Short var7 = new java.lang.Short((short)0);
    var0.insere(var6, (java.lang.Object)var7);
    java.lang.Object var9 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "43806";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "]:";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "43806";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "]:";
    java.lang.Long var6 = new java.lang.Long(100L);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var4.retira(var8);
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var1.imprime();
    java.lang.String var6 = "true";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "]:";
    java.lang.Long var9 = new java.lang.Long(100L);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var1.insere(var6, (java.lang.Object)var11);
    var0.insere(var11, (java.lang.Object)var0);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    java.lang.String var7 = "true";
    java.lang.Short var8 = new java.lang.Short((short)0);
    var1.insere(var7, (java.lang.Object)var8);
    java.lang.Object var10 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var1.imprime();
    java.lang.String var6 = "true";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "]:";
    java.lang.Long var9 = new java.lang.Long(100L);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var1.insere(var6, (java.lang.Object)var11);
    var0.insere(var6, (java.lang.Object)var0);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.retira(var5);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "43806";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "]:";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var10 = var3.recuperaItens();
    var3.insere(var7, (java.lang.Object)var10);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "]:";
    java.lang.Long var6 = new java.lang.Long(100L);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var4.retira(var8);
    var0.insere(var3, (java.lang.Object)var8);
    var4.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "43806";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "]:";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var10 = var3.recuperaItens();
    java.lang.String var11 = "true";
    ds.TabelaHash var12 = new ds.TabelaHash();
    var3.insere(var11, (java.lang.Object)var12);
    var12.retira(var11);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.Object[] var3 = var1.recuperaItens();
    java.lang.String var4 = "aw";
    java.lang.Integer var5 = new java.lang.Integer(10);
    var1.insere(var4, (java.lang.Object)var5);
    var1.imprime();
    java.lang.String var8 = "txqpr|o#";
    java.lang.Object var9 = var1.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "Entrada[";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    java.lang.String var5 = "true";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "]:";
    java.lang.Long var8 = new java.lang.Long(100L);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "";
    var6.retira(var10);
    var0.insere(var5, (java.lang.Object)var10);
    java.lang.String var13 = "t/6r&![8_x";
    java.lang.Object var14 = var0.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "Entrada[";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    java.lang.String var5 = "true";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "]:";
    java.lang.Long var8 = new java.lang.Long(100L);
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "";
    var6.retira(var10);
    var0.insere(var5, (java.lang.Object)var10);
    java.lang.String var13 = "t/6r&![8_x";
    java.lang.Object var14 = var0.pesquisa(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();
    java.lang.String var8 = "txqpr|o#";
    java.lang.Object var9 = var0.pesquisa(var8);
    java.lang.Object[] var10 = var4.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    java.lang.Object var4 = var0.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Object var7 = var5.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "Entrada[";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var8.insere(var9, (java.lang.Object)var10);
    var0.insere(var6, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var1.imprime();
    java.lang.String var6 = "true";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "]:";
    java.lang.Long var9 = new java.lang.Long(100L);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var1.insere(var6, (java.lang.Object)var11);
    var0.retira(var6);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    java.lang.String var6 = "true";
    java.lang.Short var7 = new java.lang.Short((short)0);
    var0.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    var9.imprime();
    java.lang.Object[] var11 = var9.recuperaItens();
    java.lang.String var12 = "aw";
    java.lang.Object var13 = var9.pesquisa(var12);
    java.lang.Object var14 = var0.pesquisa(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "]:";
    java.lang.Long var4 = new java.lang.Long(100L);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var2.retira(var6);
    java.lang.String var8 = "true";
    java.lang.Short var9 = new java.lang.Short((short)0);
    var2.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "t/6r&![8_x";
    java.lang.Object var12 = var2.pesquisa(var11);
    var1.retira(var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    var0.insere(var11, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "43806";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "]:";
    java.lang.Long var5 = new java.lang.Long(100L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var3.retira(var7);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var10 = var3.recuperaItens();
    java.lang.Object[] var11 = var3.recuperaItens();

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Long var2 = new java.lang.Long(100L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    java.lang.String var6 = "true";
    java.lang.Short var7 = new java.lang.Short((short)0);
    var0.insere(var6, (java.lang.Object)var7);
    java.lang.Object[] var9 = var0.recuperaItens();

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.String var3 = "aw";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();
    java.lang.String var8 = "txqpr|o#";
    java.lang.Object var9 = var0.pesquisa(var8);
    java.lang.Object[] var10 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "]:";
    java.lang.Long var7 = new java.lang.Long(100L);
    var5.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    var5.retira(var9);
    var1.insere(var4, (java.lang.Object)var9);
    var0.retira(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Long var3 = new java.lang.Long(100L);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "43806";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "]:";
    java.lang.Long var7 = new java.lang.Long(100L);
    var5.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    var5.retira(var9);
    var2.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "Entrada[";
    ds.TabelaHash var16 = new ds.TabelaHash();
    var14.insere(var15, (java.lang.Object)var16);
    var14.imprime();
    java.lang.String var19 = "true";
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "]:";
    java.lang.Long var22 = new java.lang.Long(100L);
    var20.insere(var21, (java.lang.Object)var22);
    java.lang.String var24 = "";
    var20.retira(var24);
    var14.insere(var19, (java.lang.Object)var24);
    ds.TabelaHash var27 = new ds.TabelaHash();
    var12.insere(var24, (java.lang.Object)var27);
    java.lang.Object var29 = var5.pesquisa(var24);
    java.lang.Object var30 = var0.pesquisa(var24);
    ds.TabelaHash var31 = new ds.TabelaHash();
    java.lang.String var32 = "]:";
    java.lang.Long var33 = new java.lang.Long(100L);
    var31.insere(var32, (java.lang.Object)var33);
    java.lang.String var35 = "";
    var31.retira(var35);
    java.lang.String var37 = "true";
    java.lang.Short var38 = new java.lang.Short((short)0);
    var31.insere(var37, (java.lang.Object)var38);
    java.lang.Object var40 = var0.pesquisa(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    var0.insere(var2, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "]:";
    java.lang.Long var9 = new java.lang.Long(100L);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var0.retira(var11);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    java.lang.Object[] var8 = var6.recuperaItens();
    java.lang.String var9 = "aw";
    java.lang.Integer var10 = new java.lang.Integer(10);
    var6.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    java.lang.Object[] var14 = var12.recuperaItens();
    java.lang.String var15 = "aw";
    java.lang.Object var16 = var12.pesquisa(var15);
    var5.insere(var9, (java.lang.Object)var12);
    java.lang.Object var18 = var1.pesquisa(var9);
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.Object[] var20 = var19.recuperaItens();
    java.lang.String var21 = "43806";
    ds.TabelaHash var22 = new ds.TabelaHash();
    java.lang.String var23 = "]:";
    java.lang.Long var24 = new java.lang.Long(100L);
    var22.insere(var23, (java.lang.Object)var24);
    java.lang.String var26 = "";
    var22.retira(var26);
    var19.insere(var21, (java.lang.Object)var22);
    java.lang.Object[] var29 = var22.recuperaItens();
    java.lang.String var30 = "true";
    ds.TabelaHash var31 = new ds.TabelaHash();
    var22.insere(var30, (java.lang.Object)var31);
    var0.insere(var9, (java.lang.Object)var31);
    ds.TabelaHash var34 = new ds.TabelaHash();
    java.lang.String var35 = "";
    java.lang.Object var36 = var34.pesquisa(var35);
    java.lang.String var37 = "";
    java.lang.Float var38 = new java.lang.Float(1.0f);
    var34.insere(var37, (java.lang.Object)var38);
    java.lang.String var40 = "t/6r&![8_x";
    java.lang.Object var41 = var34.pesquisa(var40);
    java.lang.Object var42 = var31.pesquisa(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "Entrada[";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    java.lang.Object[] var7 = var5.recuperaItens();
    java.lang.String var8 = "aw";
    java.lang.Integer var9 = new java.lang.Integer(10);
    var5.insere(var8, (java.lang.Object)var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    java.lang.Object[] var13 = var11.recuperaItens();
    java.lang.String var14 = "aw";
    java.lang.Object var15 = var11.pesquisa(var14);
    var4.insere(var8, (java.lang.Object)var11);
    java.lang.Object var17 = var2.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "Entrada[";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    java.lang.Object[] var8 = var6.recuperaItens();
    java.lang.String var9 = "aw";
    java.lang.Integer var10 = new java.lang.Integer(10);
    var6.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    java.lang.Object[] var14 = var12.recuperaItens();
    java.lang.String var15 = "aw";
    java.lang.Object var16 = var12.pesquisa(var15);
    var5.insere(var9, (java.lang.Object)var12);
    java.lang.Object var18 = var1.pesquisa(var9);
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.Object[] var20 = var19.recuperaItens();
    java.lang.String var21 = "43806";
    ds.TabelaHash var22 = new ds.TabelaHash();
    java.lang.String var23 = "]:";
    java.lang.Long var24 = new java.lang.Long(100L);
    var22.insere(var23, (java.lang.Object)var24);
    java.lang.String var26 = "";
    var22.retira(var26);
    var19.insere(var21, (java.lang.Object)var22);
    java.lang.Object[] var29 = var22.recuperaItens();
    java.lang.String var30 = "true";
    ds.TabelaHash var31 = new ds.TabelaHash();
    var22.insere(var30, (java.lang.Object)var31);
    var0.insere(var9, (java.lang.Object)var31);
    ds.TabelaHash var34 = new ds.TabelaHash();
    java.lang.String var35 = "]:";
    java.lang.Long var36 = new java.lang.Long(100L);
    var34.insere(var35, (java.lang.Object)var36);
    java.lang.String var38 = "";
    var34.retira(var38);
    java.lang.String var40 = "true";
    java.lang.Short var41 = new java.lang.Short((short)0);
    var34.insere(var40, (java.lang.Object)var41);
    java.lang.String var43 = "t/6r&![8_x";
    java.lang.Object var44 = var34.pesquisa(var43);
    var31.retira(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    var2.imprime();
    java.lang.String var7 = "true";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "]:";
    java.lang.Long var10 = new java.lang.Long(100L);
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "";
    var8.retira(var12);
    var2.insere(var7, (java.lang.Object)var12);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var0.insere(var12, (java.lang.Object)var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var17.imprime();
    java.lang.Object[] var19 = var17.recuperaItens();
    java.lang.String var20 = "aw";
    ds.TabelaHash var21 = new ds.TabelaHash();
    var21.imprime();
    var17.insere(var20, (java.lang.Object)var21);
    var17.imprime();
    java.lang.String var25 = "txqpr|o#";
    java.lang.Object var26 = var17.pesquisa(var25);
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.Object[] var28 = var27.recuperaItens();
    java.lang.String var29 = "43806";
    ds.TabelaHash var30 = new ds.TabelaHash();
    java.lang.String var31 = "]:";
    java.lang.Long var32 = new java.lang.Long(100L);
    var30.insere(var31, (java.lang.Object)var32);
    java.lang.String var34 = "";
    var30.retira(var34);
    var27.insere(var29, (java.lang.Object)var30);
    ds.TabelaHash var37 = new ds.TabelaHash();
    var37.imprime();
    ds.TabelaHash var39 = new ds.TabelaHash();
    java.lang.String var40 = "Entrada[";
    ds.TabelaHash var41 = new ds.TabelaHash();
    var39.insere(var40, (java.lang.Object)var41);
    var39.imprime();
    java.lang.String var44 = "true";
    ds.TabelaHash var45 = new ds.TabelaHash();
    java.lang.String var46 = "]:";
    java.lang.Long var47 = new java.lang.Long(100L);
    var45.insere(var46, (java.lang.Object)var47);
    java.lang.String var49 = "";
    var45.retira(var49);
    var39.insere(var44, (java.lang.Object)var49);
    ds.TabelaHash var52 = new ds.TabelaHash();
    var37.insere(var49, (java.lang.Object)var52);
    java.lang.Object var54 = var30.pesquisa(var49);
    ds.TabelaHash var55 = new ds.TabelaHash();
    java.lang.String var56 = "Entrada[";
    ds.TabelaHash var57 = new ds.TabelaHash();
    var55.insere(var56, (java.lang.Object)var57);
    java.lang.Object var59 = var30.pesquisa(var56);
    var0.insere(var25, (java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == null);

  }

}
