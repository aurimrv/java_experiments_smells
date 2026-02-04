package ds.seed5831;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5831 in this file.
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
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "igfq";
    java.lang.Character var3 = new java.lang.Character('a');
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = var0.recuperaItens();

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var4);
    var3.retira(var2);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    java.lang.Character var4 = new java.lang.Character('a');
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    var3.insere(var6, (java.lang.Object)var6);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "p83ril5w4";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    var1.insere(var3, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    var0.insere(var7, (java.lang.Object)var0);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "igfq";
    java.lang.Character var3 = new java.lang.Character('a');
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var0.retira(var5);
    var0.insere(var5, (java.lang.Object)var5);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.retira(var1);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    java.lang.Character var4 = new java.lang.Character('a');
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    java.lang.Character var4 = new java.lang.Character('a');
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    var0.retira(var6);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    var0.retira(var2);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "p83ril5w4";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var3.retira(var2);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    java.lang.Character var4 = new java.lang.Character('a');
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var0.retira(var5);
    var3.insere(var5, (java.lang.Object)var5);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var2.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.0d+ "'", var4.equals(1.0d));

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "_r:";
    java.lang.Object var5 = var0.pesquisa(var4);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "_r:";
    java.lang.Object var5 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "_r:";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    java.lang.Object var5 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var5 = var2.recuperaItens();

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "_r:";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    java.lang.String var5 = "";
    var0.retira(var5);
    var0.insere(var5, (java.lang.Object)var5);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "_r:";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    var1.insere(var3, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.retira(var1);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    java.lang.Character var4 = new java.lang.Character('a');
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    var0.retira(var6);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    var1.insere(var3, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var1.retira(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    java.lang.String var6 = "";
    var2.retira(var6);
    java.lang.Object var8 = var2.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "rl8(3q!_";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var2.recuperaItens();
    java.lang.String var7 = "";
    var2.retira(var7);
    var0.insere(var1, (java.lang.Object)var7);
    var2.imprime();

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "p83ril5w4";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test42() throws Throwable {

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

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "rl8(3q!_";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var2.recuperaItens();
    java.lang.String var7 = "";
    var2.retira(var7);
    var0.insere(var1, (java.lang.Object)var7);
    var0.imprime();
    var2.insere(var7, (java.lang.Object)var7);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "rl8(3q!_";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var2.recuperaItens();
    java.lang.String var7 = "";
    var2.retira(var7);
    var0.insere(var1, (java.lang.Object)var7);
    var0.imprime();
    java.lang.String var11 = "";
    var0.retira(var11);
    ds.TabelaHash var13 = new ds.TabelaHash();

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var7 = var3.recuperaItens();
    java.lang.String var8 = "";
    var3.retira(var8);
    var1.insere(var2, (java.lang.Object)var8);
    var1.imprime();
    java.lang.String var12 = "";
    var1.retira(var12);
    var0.retira(var12);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    java.lang.Character var4 = new java.lang.Character('a');
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    var0.insere(var6, (java.lang.Object)var0);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var7 = var3.recuperaItens();
    java.lang.String var8 = "";
    var3.retira(var8);
    var1.insere(var2, (java.lang.Object)var8);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = var1.recuperaItens();
    java.lang.String var6 = "";
    var1.retira(var6);
    var0.insere(var6, (java.lang.Object)var0);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "p83ril5w4";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "z3";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var4.imprime();
    var2.insere(var3, (java.lang.Object)var4);
    var4.imprime();
    java.lang.String var8 = "";
    var4.retira(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    var1.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    java.lang.String var7 = "";
    var3.retira(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "rl8(3q!_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = var1.recuperaItens();
    java.lang.String var6 = "";
    var1.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    var1.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    java.lang.String var7 = "";
    var3.retira(var7);
    var0.insere(var7, (java.lang.Object)var0);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "FrfCh7t";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    var2.insere(var4, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var2.retira(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "igfq";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Object var5 = var3.pesquisa(var4);
    var0.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var7 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "igfq";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Object var5 = var3.pesquisa(var4);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var7 = "";
    var0.retira(var7);
    var3.insere(var7, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "p83ril5w4";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var3.retira(var5);
    var3.imprime();

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var3.retira(var5);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "rl8(3q!_";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var7 = var3.recuperaItens();
    java.lang.String var8 = "";
    var3.retira(var8);
    var1.insere(var2, (java.lang.Object)var8);
    var0.retira(var2);

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    java.lang.Object[] var6 = var2.recuperaItens();

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "rl8(3q!_";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var2.recuperaItens();
    java.lang.String var7 = "";
    var2.retira(var7);
    var0.insere(var1, (java.lang.Object)var7);
    java.lang.String var10 = "";
    java.lang.Object var11 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "rl8(3q!_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "igfq";
    java.lang.Character var7 = new java.lang.Character('a');
    var4.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    var4.retira(var9);
    java.lang.Object var11 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "z3";
    java.lang.Object var8 = var6.pesquisa(var7);
    var2.retira(var7);
    java.lang.Object[] var10 = var2.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "rl8(3q!_";
    java.lang.Object var6 = var4.pesquisa(var5);
    var1.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var8 = new ds.TabelaHash();
    ds.TabelaHash var9 = new ds.TabelaHash();
    var9.imprime();
    java.lang.String var11 = "FrfCh7t";
    ds.TabelaHash var12 = new ds.TabelaHash();
    var9.insere(var11, (java.lang.Object)var12);
    ds.TabelaHash var14 = new ds.TabelaHash();
    var14.imprime();
    java.lang.String var16 = "FrfCh7t";
    ds.TabelaHash var17 = new ds.TabelaHash();
    var14.insere(var16, (java.lang.Object)var17);
    var8.insere(var11, (java.lang.Object)var17);
    var0.insere(var3, (java.lang.Object)var8);
    java.lang.Object[] var21 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "igfq";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Object var5 = var3.pesquisa(var4);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var7 = "";
    var0.retira(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "z3";
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    var9.insere(var10, (java.lang.Object)var11);
    var11.imprime();
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "z3";
    java.lang.Object var17 = var15.pesquisa(var16);
    var11.retira(var16);
    var0.retira(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "p83ril5w4";
    java.lang.Object var8 = var6.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "rl8(3q!_";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var2.recuperaItens();
    java.lang.String var7 = "";
    var2.retira(var7);
    var0.insere(var1, (java.lang.Object)var7);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "z3";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.Object var13 = var0.pesquisa(var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    java.lang.Object var16 = var14.pesquisa(var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.Object[] var18 = var17.recuperaItens();
    java.lang.String var19 = "igfq";
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "rl8(3q!_";
    java.lang.Object var22 = var20.pesquisa(var21);
    var17.insere(var19, (java.lang.Object)var20);
    var0.insere(var15, (java.lang.Object)var17);
    ds.TabelaHash var25 = new ds.TabelaHash();
    java.lang.String var26 = "z3";
    ds.TabelaHash var27 = new ds.TabelaHash();
    var27.imprime();
    var25.insere(var26, (java.lang.Object)var27);
    var27.imprime();
    java.lang.String var31 = "";
    var27.retira(var31);
    java.lang.Object var33 = var0.pesquisa(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "FrfCh7t";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var2.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var1.pesquisa(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var7 = var3.recuperaItens();
    java.lang.String var8 = "";
    var3.retira(var8);
    var1.insere(var2, (java.lang.Object)var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "z3";
    java.lang.Object var13 = var11.pesquisa(var12);
    java.lang.Object var14 = var1.pesquisa(var12);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    java.lang.Object var17 = var15.pesquisa(var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.Object[] var19 = var18.recuperaItens();
    java.lang.String var20 = "igfq";
    ds.TabelaHash var21 = new ds.TabelaHash();
    java.lang.String var22 = "rl8(3q!_";
    java.lang.Object var23 = var21.pesquisa(var22);
    var18.insere(var20, (java.lang.Object)var21);
    var1.insere(var16, (java.lang.Object)var18);
    java.lang.Object var26 = var0.pesquisa(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "rl8(3q!_";
    java.lang.Double var10 = new java.lang.Double(1.0d);
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.Object[] var12 = var8.recuperaItens();
    java.lang.String var13 = "";
    var8.retira(var13);
    var6.insere(var7, (java.lang.Object)var13);
    java.lang.Object var16 = var1.pesquisa(var13);
    var0.retira(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test90() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "rl8(3q!_";
    java.lang.Object var6 = var4.pesquisa(var5);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var8 = "";
    var1.retira(var8);
    var0.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test91() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "z3";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test92() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "FrfCh7t";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test93() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "rl8(3q!_";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var7 = var3.recuperaItens();
    java.lang.String var8 = "";
    var3.retira(var8);
    var1.insere(var2, (java.lang.Object)var8);
    var1.imprime();
    java.lang.String var12 = "";
    var1.retira(var12);
    java.lang.Object var14 = var0.pesquisa(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test94() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();

  }

  public void test95() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "z3";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test96() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "igfq";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "rl8(3q!_";
    java.lang.Object var6 = var4.pesquisa(var5);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var8 = "";
    var1.retira(var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    var10.imprime();
    var0.insere(var8, (java.lang.Object)var10);
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "";
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "rl8(3q!_";
    java.lang.Double var17 = new java.lang.Double(1.0d);
    var15.insere(var16, (java.lang.Object)var17);
    java.lang.Object[] var19 = var15.recuperaItens();
    java.lang.String var20 = "";
    var15.retira(var20);
    var13.insere(var14, (java.lang.Object)var20);
    var13.imprime();
    java.lang.String var24 = "";
    var13.retira(var24);
    ds.TabelaHash var26 = new ds.TabelaHash();
    var26.imprime();
    var10.insere(var24, (java.lang.Object)var26);
    java.lang.Object[] var29 = var26.recuperaItens();
    ds.TabelaHash var30 = new ds.TabelaHash();
    ds.TabelaHash var31 = new ds.TabelaHash();
    java.lang.String var32 = "";
    ds.TabelaHash var33 = new ds.TabelaHash();
    java.lang.String var34 = "rl8(3q!_";
    java.lang.Double var35 = new java.lang.Double(1.0d);
    var33.insere(var34, (java.lang.Object)var35);
    java.lang.Object[] var37 = var33.recuperaItens();
    java.lang.String var38 = "";
    var33.retira(var38);
    var31.insere(var32, (java.lang.Object)var38);
    java.lang.Object var41 = var30.pesquisa(var32);
    java.lang.Object var42 = var26.pesquisa(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == null);

  }

  public void test97() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "igfq";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "rl8(3q!_";
    java.lang.Object var7 = var5.pesquisa(var6);
    var2.insere(var4, (java.lang.Object)var5);
    java.lang.String var9 = "";
    var2.retira(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    var1.insere(var9, (java.lang.Object)var11);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "rl8(3q!_";
    java.lang.Double var18 = new java.lang.Double(1.0d);
    var16.insere(var17, (java.lang.Object)var18);
    java.lang.Object[] var20 = var16.recuperaItens();
    java.lang.String var21 = "";
    var16.retira(var21);
    var14.insere(var15, (java.lang.Object)var21);
    var14.imprime();
    java.lang.String var25 = "";
    var14.retira(var25);
    ds.TabelaHash var27 = new ds.TabelaHash();
    var27.imprime();
    var11.insere(var25, (java.lang.Object)var27);
    var0.retira(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test98() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "FrfCh7t";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.Object[] var10 = var9.recuperaItens();
    java.lang.String var11 = "igfq";
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "rl8(3q!_";
    java.lang.Object var14 = var12.pesquisa(var13);
    var9.insere(var11, (java.lang.Object)var12);
    java.lang.String var16 = "";
    var9.retira(var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    var18.imprime();
    var8.insere(var16, (java.lang.Object)var18);
    ds.TabelaHash var21 = new ds.TabelaHash();
    var0.insere(var16, (java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

}
