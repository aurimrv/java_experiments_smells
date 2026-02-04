package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
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
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "hi!";
    var0.retira(var2);

  }

  public void test7() throws Throwable {

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

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer((-1));
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer((-1));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    var0.imprime();

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Integer var2 = new java.lang.Integer((-1));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    var0.imprime();

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.Object var3 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long((-1L));
    var0.insere(var1, (java.lang.Object)var2);
    var0.retira(var1);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long((-1L));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    var0.imprime();

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long((-1L));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long((-1L));
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    var0.retira(var2);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.retira(var2);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Long var4 = new java.lang.Long((-1L));
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "HQKYqxJWL";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Long var3 = new java.lang.Long((-1L));
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Long var3 = new java.lang.Long((-1L));
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "HQKYqxJWL";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.Object var8 = var5.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var8 = var5.recuperaItens();
    java.lang.Object var9 = var5.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var8 = var5.recuperaItens();

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.Object[] var3 = var0.recuperaItens();

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    var0.insere(var1, (java.lang.Object)var1);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "HQKYqxJWL";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "";
    java.lang.Object var5 = var2.pesquisa(var4);
    var0.insere(var4, (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "";
    java.lang.Object var5 = var2.pesquisa(var4);
    var1.retira(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var8 = var0.recuperaItens();

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "]:";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "hi!";
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer((-1));
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var1.pesquisa(var3);
    java.lang.Object var7 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "]:";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var0.insere(var2, (java.lang.Object)var4);
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "HQKYqxJWL";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    java.lang.Object[] var7 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var0.insere(var2, (java.lang.Object)var4);
    java.lang.Object[] var6 = var0.recuperaItens();

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    var2.retira(var3);
    java.lang.Short var5 = new java.lang.Short((short)100);
    var1.insere(var3, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var7);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "HQKYqxJWL";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    var3.retira(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.retira(var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    var4.retira(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long((-1L));
    var3.insere(var4, (java.lang.Object)var5);
    var1.retira(var4);
    var0.retira(var4);
    var0.imprime();

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.Object[] var8 = var7.recuperaItens();
    var2.insere(var6, (java.lang.Object)var7);
    java.lang.String var10 = "";
    java.lang.Object var11 = var7.pesquisa(var10);
    java.lang.Object var12 = var1.pesquisa(var10);
    java.lang.Object var13 = new java.lang.Object();
    var0.insere(var10, var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.String var8 = "";
    java.lang.Object var9 = var5.pesquisa(var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    var10.retira(var11);
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "HQKYqxJWL";
    java.lang.Object var15 = var13.pesquisa(var14);
    java.lang.Short var16 = new java.lang.Short((short)100);
    var10.insere(var14, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "";
    java.lang.Double var20 = new java.lang.Double((-1.0d));
    var18.insere(var19, (java.lang.Object)var20);
    java.lang.String var22 = "";
    ds.TabelaHash var23 = new ds.TabelaHash();
    java.lang.Object[] var24 = var23.recuperaItens();
    var18.insere(var22, (java.lang.Object)var23);
    var5.insere(var14, (java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "]:";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.Long var5 = new java.lang.Long(0L);
    var1.insere(var3, (java.lang.Object)var5);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    var3.retira(var4);
    java.lang.Short var6 = new java.lang.Short((short)100);
    var2.insere(var4, (java.lang.Object)var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    var9.retira(var10);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var8.insere(var10, (java.lang.Object)var12);
    var2.retira(var10);
    java.lang.Object var15 = var1.pesquisa(var10);
    java.lang.Object var16 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "";
    java.lang.Object var5 = var2.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Integer var8 = new java.lang.Integer((-1));
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.Object var10 = var5.pesquisa(var7);
    var1.retira(var7);
    java.lang.Object var12 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "";
    java.lang.Object var7 = var4.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.Object[] var14 = var13.recuperaItens();
    var8.insere(var12, (java.lang.Object)var13);
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.Object[] var17 = var16.recuperaItens();
    java.lang.String var18 = "";
    java.lang.Object var19 = var16.pesquisa(var18);
    java.lang.Object var20 = var8.pesquisa(var18);
    var0.insere(var6, (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Integer var8 = new java.lang.Integer((-1));
    var6.insere(var7, (java.lang.Object)var8);
    java.lang.Object var10 = var5.pesquisa(var7);
    var1.retira(var7);
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.Object[] var13 = var12.recuperaItens();
    java.lang.String var14 = "";
    java.lang.Object var15 = var12.pesquisa(var14);
    ds.TabelaHash var16 = new ds.TabelaHash();
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.Object[] var18 = var17.recuperaItens();
    java.lang.String var19 = "";
    java.lang.Object var20 = var17.pesquisa(var19);
    var16.retira(var19);
    java.lang.Object var22 = var12.pesquisa(var19);
    var0.insere(var7, (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Object var6 = var1.pesquisa(var4);
    var0.retira(var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    var3.retira(var4);
    java.lang.Short var6 = new java.lang.Short((short)100);
    var2.insere(var4, (java.lang.Object)var6);
    var0.insere(var1, (java.lang.Object)var2);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var0.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.Object[] var14 = var13.recuperaItens();
    var8.insere(var12, (java.lang.Object)var13);
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "HQKYqxJWL";
    java.lang.Object var18 = var16.pesquisa(var17);
    var13.retira(var17);
    var0.retira(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

}
