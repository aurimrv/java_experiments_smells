package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    java.lang.Object var3 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.retira(var1);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "!<ua*)7!=";
    var1.retira(var2);
    var0.retira(var2);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();
    var0.imprime();

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "!<ua*)7!=";
    var1.retira(var2);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "!<ua*)7!=";
    var1.retira(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    java.lang.Integer var2 = new java.lang.Integer(10);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.Object var8 = var2.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "qdT";
    java.lang.Object var5 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "CFsSd5shz";
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = var0.recuperaItens();

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var0.retira(var8);
    var2.insere(var8, (java.lang.Object)var8);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var0.retira(var8);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    java.lang.Integer var2 = new java.lang.Integer(10);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    var0.imprime();

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "CFsSd5shz";
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var6);
    var6.imprime();

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "CFsSd5shz";
    java.lang.Boolean var4 = new java.lang.Boolean(false);
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "qdT";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "!<ua*)7!=";
    var3.retira(var4);
    var3.imprime();
    java.lang.Object[] var7 = var3.recuperaItens();
    var1.insere(var2, (java.lang.Object)var7);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "CFsSd5shz";
    java.lang.Boolean var4 = new java.lang.Boolean(false);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var1.insere(var6, (java.lang.Object)var7);
    var0.retira(var6);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "CFsSd5shz";
    java.lang.Boolean var4 = new java.lang.Boolean(false);
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();
    ds.TabelaHash var5 = new ds.TabelaHash();

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "!<ua*)7!=";
    var3.retira(var4);
    var3.imprime();
    java.lang.Object[] var7 = var3.recuperaItens();
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.String var9 = "";
    var1.retira(var9);
    var0.retira(var9);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "0_4CVEqvl";
    java.lang.Short var4 = new java.lang.Short((short)1);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var2.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    var0.insere(var1, (java.lang.Object)var1);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();
    java.lang.Object var5 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "!<ua*)7!=";
    var3.retira(var4);
    var3.imprime();
    java.lang.Object[] var7 = var3.recuperaItens();
    var1.insere(var2, (java.lang.Object)var7);
    java.lang.Object var9 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "CFsSd5shz";
    java.lang.Boolean var4 = new java.lang.Boolean(false);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var1.insere(var6, (java.lang.Object)var7);
    var0.insere(var6, (java.lang.Object)var0);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    var0.retira(var2);
    var0.insere(var2, (java.lang.Object)var2);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "qdT";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "!<ua*)7!=";
    var3.retira(var4);
    var3.imprime();
    java.lang.Object[] var7 = var3.recuperaItens();
    var1.insere(var2, (java.lang.Object)var7);
    var0.retira(var2);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    var0.retira(var1);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "qdT";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    java.lang.Object[] var3 = var0.recuperaItens();

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();
    var0.retira(var1);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "  ";
    var1.retira(var3);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0_4CVEqvl";
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.Object[] var8 = var2.recuperaItens();

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.insere(var1, (java.lang.Object)var1);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "  ";
    var0.retira(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "0_4CVEqvl";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var0.pesquisa(var8);
    java.lang.Object[] var10 = var2.recuperaItens();

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "CFsSd5shz";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "  ";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "!<ua*)7!=";
    var4.retira(var5);
    var4.imprime();
    java.lang.Object[] var8 = var4.recuperaItens();
    var2.insere(var3, (java.lang.Object)var8);
    java.lang.String var10 = "";
    java.lang.Object var11 = var2.pesquisa(var10);
    var0.insere(var1, var11);
    ds.TabelaHash var13 = new ds.TabelaHash();

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "!<ua*)7!=";
    var3.retira(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "0_4CVEqvl";
    java.lang.Object var5 = var3.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "!<ua*)7!=";
    var8.retira(var9);
    var8.imprime();
    java.lang.Object[] var12 = var8.recuperaItens();
    var6.insere(var7, (java.lang.Object)var12);
    java.lang.String var14 = "";
    java.lang.Object var15 = var6.pesquisa(var14);
    var0.insere(var4, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "!<ua*)7!=";
    var5.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var0.pesquisa(var8);
    var0.imprime();

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "CFsSd5shz";
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "  ";
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "!<ua*)7!=";
    var12.retira(var13);
    var12.imprime();
    java.lang.Object[] var16 = var12.recuperaItens();
    var10.insere(var11, (java.lang.Object)var16);
    java.lang.String var18 = "";
    java.lang.Object var19 = var10.pesquisa(var18);
    var8.insere(var9, var19);
    var0.retira(var9);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "!<ua*)7!=";
    var5.retira(var6);
    var5.imprime();
    java.lang.Object[] var9 = var5.recuperaItens();
    var3.insere(var4, (java.lang.Object)var9);
    java.lang.String var11 = "";
    java.lang.Object var12 = var3.pesquisa(var11);
    var1.insere(var2, var12);
    var0.retira(var2);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "  ";
    java.lang.Object var6 = var4.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "!<ua*)7!=";
    var7.retira(var8);
    var7.imprime();
    java.lang.Object[] var11 = var7.recuperaItens();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "0_4CVEqvl";
    java.lang.Float var14 = new java.lang.Float((-1.0f));
    var12.insere(var13, (java.lang.Object)var14);
    java.lang.Object var16 = var7.pesquisa(var13);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "  ";
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "";
    ds.TabelaHash var21 = new ds.TabelaHash();
    java.lang.String var22 = "!<ua*)7!=";
    var21.retira(var22);
    var21.imprime();
    java.lang.Object[] var25 = var21.recuperaItens();
    var19.insere(var20, (java.lang.Object)var25);
    java.lang.String var27 = "";
    java.lang.Object var28 = var19.pesquisa(var27);
    var17.insere(var18, var28);
    var4.insere(var13, (java.lang.Object)var18);
    var0.retira(var18);
    ds.TabelaHash var32 = new ds.TabelaHash();
    java.lang.String var33 = "0_4CVEqvl";
    java.lang.Object var34 = var32.pesquisa(var33);
    java.lang.Object var35 = var0.pesquisa(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "!<ua*)7!=";
    var4.retira(var5);
    var4.imprime();
    java.lang.Object[] var8 = var4.recuperaItens();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "0_4CVEqvl";
    java.lang.Float var11 = new java.lang.Float((-1.0f));
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.Object var13 = var4.pesquisa(var10);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "  ";
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "";
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "!<ua*)7!=";
    var18.retira(var19);
    var18.imprime();
    java.lang.Object[] var22 = var18.recuperaItens();
    var16.insere(var17, (java.lang.Object)var22);
    java.lang.String var24 = "";
    java.lang.Object var25 = var16.pesquisa(var24);
    var14.insere(var15, var25);
    var1.insere(var10, (java.lang.Object)var15);
    var0.retira(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "CFsSd5shz";
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "hi!";
    java.lang.Object var9 = var6.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "CFsSd5shz";
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "  ";
    java.lang.Integer var10 = new java.lang.Integer(10);
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.Object[] var13 = var12.recuperaItens();
    java.lang.String var14 = "CFsSd5shz";
    java.lang.Object var15 = var12.pesquisa(var14);
    var0.insere(var9, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "  ";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "!<ua*)7!=";
    var4.retira(var5);
    var4.imprime();
    java.lang.Object[] var8 = var4.recuperaItens();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "0_4CVEqvl";
    java.lang.Float var11 = new java.lang.Float((-1.0f));
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.Object var13 = var4.pesquisa(var10);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "  ";
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "";
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "!<ua*)7!=";
    var18.retira(var19);
    var18.imprime();
    java.lang.Object[] var22 = var18.recuperaItens();
    var16.insere(var17, (java.lang.Object)var22);
    java.lang.String var24 = "";
    java.lang.Object var25 = var16.pesquisa(var24);
    var14.insere(var15, var25);
    var1.insere(var10, (java.lang.Object)var15);
    var0.retira(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "!<ua*)7!=";
    var4.retira(var5);
    var4.imprime();
    java.lang.Object[] var8 = var4.recuperaItens();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "0_4CVEqvl";
    java.lang.Float var11 = new java.lang.Float((-1.0f));
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.Object var13 = var4.pesquisa(var10);
    var0.retira(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "CFsSd5shz";
    java.lang.Boolean var7 = new java.lang.Boolean(false);
    var4.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var4.insere(var9, (java.lang.Object)var10);
    java.lang.Object var12 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "!<ua*)7!=";
    var4.retira(var5);
    var4.imprime();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "  ";
    java.lang.Object var10 = var8.pesquisa(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "!<ua*)7!=";
    var11.retira(var12);
    var11.imprime();
    java.lang.Object[] var15 = var11.recuperaItens();
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "0_4CVEqvl";
    java.lang.Float var18 = new java.lang.Float((-1.0f));
    var16.insere(var17, (java.lang.Object)var18);
    java.lang.Object var20 = var11.pesquisa(var17);
    ds.TabelaHash var21 = new ds.TabelaHash();
    java.lang.String var22 = "  ";
    ds.TabelaHash var23 = new ds.TabelaHash();
    java.lang.String var24 = "";
    ds.TabelaHash var25 = new ds.TabelaHash();
    java.lang.String var26 = "!<ua*)7!=";
    var25.retira(var26);
    var25.imprime();
    java.lang.Object[] var29 = var25.recuperaItens();
    var23.insere(var24, (java.lang.Object)var29);
    java.lang.String var31 = "";
    java.lang.Object var32 = var23.pesquisa(var31);
    var21.insere(var22, var32);
    var8.insere(var17, (java.lang.Object)var22);
    var4.retira(var22);
    java.lang.Object var36 = var0.pesquisa(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "!<ua*)7!=";
    var2.retira(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "!<ua*)7!=";
    var5.retira(var6);
    var2.retira(var6);
    var0.insere(var1, (java.lang.Object)var6);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.Object[] var11 = var10.recuperaItens();
    java.lang.String var12 = "CFsSd5shz";
    java.lang.Boolean var13 = new java.lang.Boolean(false);
    var10.insere(var12, (java.lang.Object)var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var0.insere(var12, (java.lang.Object)var15);

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0_4CVEqvl";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "!<ua*)7!=";
    var3.retira(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "!<ua*)7!=";
    var6.retira(var7);
    var3.retira(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "!<ua*)7!=";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "0_4CVEqvl";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.String var8 = "";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "!<ua*)7!=";
    var9.retira(var10);
    var9.imprime();
    java.lang.Object[] var13 = var9.recuperaItens();
    var5.insere(var8, (java.lang.Object)var13);
    java.lang.Object var15 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "hi!";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    java.lang.String var7 = "  ";
    var5.retira(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "0_4CVEqvl";
    java.lang.Object var11 = var9.pesquisa(var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "";
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "!<ua*)7!=";
    var15.retira(var16);
    var15.imprime();
    java.lang.Object[] var19 = var15.recuperaItens();
    var13.insere(var14, (java.lang.Object)var19);
    java.lang.Float var21 = new java.lang.Float(0.0f);
    var12.insere(var14, (java.lang.Object)var21);
    var5.insere(var10, (java.lang.Object)var14);
    ds.TabelaHash var24 = new ds.TabelaHash();
    java.lang.Object[] var25 = var24.recuperaItens();
    var4.insere(var10, (java.lang.Object)var24);
    var0.insere(var2, (java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

}
