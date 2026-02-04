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

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.Object var3 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0f+ "'", var6.equals(100.0f));

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    java.lang.Object var7 = var0.pesquisa(var6);
    java.lang.Object[] var8 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    java.lang.Object var7 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test9() throws Throwable {

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

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(100.0f);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "{}";
    java.lang.Object var8 = var1.pesquisa(var7);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.retira(var2);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    var0.insere(var1, (java.lang.Object)var1);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(100.0f);
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    var0.imprime();

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "m$(oP+M";
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "*;/$|{`(";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "m$(oP+M";
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Long var5 = new java.lang.Long(10L);
    var1.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*;/$|{`(";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "*;/$|{`(";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Short var4 = new java.lang.Short((short)(-1));
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)(-1)+ "'", var6.equals((short)(-1)));

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Short var4 = new java.lang.Short((short)(-1));
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var7);
    var7.retira(var6);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    var0.imprime();

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var7);
    java.lang.Object var9 = var7.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*;/$|{`(";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Short var5 = new java.lang.Short((short)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "{}";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var1.insere(var7, (java.lang.Object)var8);
    var0.retira(var7);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "*;/$|{`(";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    java.lang.Character var7 = new java.lang.Character('4');
    var0.insere(var6, (java.lang.Object)var7);
    java.lang.Object var9 = var4.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "m$(oP+M";
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.insere(var4, (java.lang.Object)var4);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(100.0f);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "{}";
    java.lang.Object var8 = var1.pesquisa(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    var4.retira(var5);
    java.lang.String var7 = "Entrada[";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var7);
    var4.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "m$(oP+M";
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*;/$|{`(";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "{}";
    java.lang.Character var8 = new java.lang.Character('4');
    var1.insere(var7, (java.lang.Object)var8);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*;/$|{`(";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    ds.TabelaHash var5 = new ds.TabelaHash();
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "{}";
    java.lang.Character var8 = new java.lang.Character('4');
    var1.insere(var7, (java.lang.Object)var8);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "*.<!0";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    var0.retira(var1);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    var0.retira(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    var0.retira(var2);
    var0.imprime();
    java.lang.Object[] var5 = var0.recuperaItens();

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    var4.retira(var5);
    java.lang.String var7 = "Entrada[";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var7);
    java.lang.String var10 = "{}";
    java.lang.Object var11 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    var5.retira(var6);
    java.lang.String var8 = "Entrada[";
    java.lang.Object var9 = var5.pesquisa(var8);
    var1.insere(var4, (java.lang.Object)var8);
    java.lang.String var11 = "{}";
    java.lang.Object var12 = var1.pesquisa(var11);
    java.lang.Object var13 = var0.pesquisa(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "m$(oP+M";
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();
    java.lang.String var7 = "";
    java.lang.Object var8 = var0.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "m$(oP+M";
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.imprime();
    java.lang.String var7 = "";
    java.lang.Object var8 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "*;/$|{`(";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "Entrada[";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var4.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "{}";
    java.lang.Character var11 = new java.lang.Character('4');
    var4.insere(var10, (java.lang.Object)var11);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var14 = var8.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "*;/$|{`(";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "Entrada[";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var4.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "{}";
    java.lang.Character var11 = new java.lang.Character('4');
    var4.insere(var10, (java.lang.Object)var11);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var14 = "{}";
    java.lang.Object var15 = var4.pesquisa(var14);
    var8.insere(var14, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '4'+ "'", var15.equals('4'));

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "*;/$|{`(";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "Entrada[";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var4.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "{}";
    java.lang.Character var11 = new java.lang.Character('4');
    var4.insere(var10, (java.lang.Object)var11);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var14 = "{}";
    java.lang.Object var15 = var4.pesquisa(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '4'+ "'", var15.equals('4'));

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Short var5 = new java.lang.Short((short)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "*.<!0";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.retira(var1);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Object var5 = var1.pesquisa(var4);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    var4.retira(var5);
    java.lang.String var7 = "Entrada[";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var7);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    var9.retira(var10);
    java.lang.Long var12 = new java.lang.Long(10L);
    var7.insere(var10, (java.lang.Object)var12);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Short var4 = new java.lang.Short((short)(-1));
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    var9.retira(var10);
    java.lang.String var12 = "Entrada[";
    java.lang.Long var13 = new java.lang.Long(10L);
    var9.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "{}";
    ds.TabelaHash var16 = new ds.TabelaHash();
    var9.insere(var15, (java.lang.Object)var16);
    java.lang.String var18 = "hi!";
    var7.insere(var15, (java.lang.Object)var18);
    var7.imprime();

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "*;/$|{`(";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "Entrada[";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var4.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "{}";
    java.lang.Character var11 = new java.lang.Character('4');
    var4.insere(var10, (java.lang.Object)var11);
    var0.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    var14.retira(var15);
    java.lang.String var17 = "Entrada[";
    java.lang.Long var18 = new java.lang.Long(10L);
    var14.insere(var17, (java.lang.Object)var18);
    java.lang.Object var20 = var4.pesquisa(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    var4.retira(var5);
    java.lang.String var7 = "Entrada[";
    java.lang.Object var8 = var4.pesquisa(var7);
    var0.insere(var3, (java.lang.Object)var7);
    java.lang.Object[] var10 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Long var4 = new java.lang.Long(10L);
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var7);
    var7.imprime();

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    var1.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "*;/$|{`(";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "Entrada[";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var4.insere(var7, (java.lang.Object)var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    java.lang.Object var12 = var10.pesquisa(var11);
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "m$(oP+M";
    java.lang.Short var15 = new java.lang.Short((short)100);
    var13.insere(var14, (java.lang.Object)var15);
    java.lang.String var17 = "";
    var13.retira(var17);
    var10.retira(var17);
    java.lang.Object var20 = var8.pesquisa(var17);
    var0.retira(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*.<!0";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var0.insere(var5, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    var9.retira(var10);
    java.lang.String var12 = "Entrada[";
    java.lang.Short var13 = new java.lang.Short((short)(-1));
    var9.insere(var12, (java.lang.Object)var13);
    java.lang.String var15 = "{}";
    ds.TabelaHash var16 = new ds.TabelaHash();
    var9.insere(var15, (java.lang.Object)var16);
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.String var19 = "";
    var18.retira(var19);
    java.lang.String var21 = "Entrada[";
    java.lang.Long var22 = new java.lang.Long(10L);
    var18.insere(var21, (java.lang.Object)var22);
    java.lang.String var24 = "{}";
    ds.TabelaHash var25 = new ds.TabelaHash();
    var18.insere(var24, (java.lang.Object)var25);
    java.lang.String var27 = "hi!";
    var16.insere(var24, (java.lang.Object)var27);
    ds.TabelaHash var29 = new ds.TabelaHash();
    java.lang.String var30 = "";
    var29.retira(var30);
    java.lang.String var32 = "Entrada[";
    java.lang.Object var33 = var29.pesquisa(var32);
    ds.TabelaHash var34 = new ds.TabelaHash();
    java.lang.String var35 = "";
    var34.retira(var35);
    var29.retira(var35);
    var0.insere(var27, (java.lang.Object)var35);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*.<!0";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var0.insere(var5, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.Object[] var10 = var9.recuperaItens();
    java.lang.String var11 = "";
    var9.retira(var11);
    var0.retira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    java.lang.String var3 = "Entrada[";
    java.lang.Short var4 = new java.lang.Short((short)(-1));
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "{}";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var6, (java.lang.Object)var7);
    java.lang.Object[] var9 = var0.recuperaItens();

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Long var5 = new java.lang.Long(10L);
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "{}";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var1.insere(var7, (java.lang.Object)var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "*;/$|{`(";
    java.lang.Object var12 = var10.pesquisa(var11);
    java.lang.String var13 = "Entrada[";
    ds.TabelaHash var14 = new ds.TabelaHash();
    var10.insere(var13, (java.lang.Object)var14);
    java.lang.String var16 = "{}";
    java.lang.Character var17 = new java.lang.Character('4');
    var10.insere(var16, (java.lang.Object)var17);
    var0.insere(var7, (java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "*.<!0";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = new java.lang.Object();
    var0.insere(var1, var2);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "*;/$|{`(";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "Entrada[";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var3, (java.lang.Object)var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Object var8 = var6.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "m$(oP+M";
    java.lang.Short var11 = new java.lang.Short((short)100);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "";
    var9.retira(var13);
    var6.retira(var13);
    java.lang.Object var16 = var0.pesquisa(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "m$(oP+M";
    java.lang.Short var6 = new java.lang.Short((short)100);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    var4.retira(var8);
    var1.retira(var8);
    java.lang.Object var11 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(100.0f);
    var1.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.Object[] var8 = var7.recuperaItens();
    java.lang.String var9 = "";
    var7.retira(var9);
    var0.insere(var4, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Short var5 = new java.lang.Short((short)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "*.<!0";
    java.lang.Short var10 = new java.lang.Short((short)1);
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "";
    java.lang.Object var13 = var8.pesquisa(var12);
    java.lang.Short var14 = new java.lang.Short((short)100);
    var7.insere(var12, (java.lang.Object)var14);
    java.lang.Object var16 = var1.pesquisa(var12);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.Object[] var18 = var17.recuperaItens();
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "";
    var19.retira(var20);
    java.lang.String var22 = "Entrada[";
    java.lang.Object var23 = var19.pesquisa(var22);
    ds.TabelaHash var24 = new ds.TabelaHash();
    java.lang.String var25 = "";
    var24.retira(var25);
    var19.retira(var25);
    java.lang.Object var28 = var17.pesquisa(var25);
    ds.TabelaHash var29 = new ds.TabelaHash();
    var1.insere(var25, (java.lang.Object)var29);
    ds.TabelaHash var31 = new ds.TabelaHash();
    ds.TabelaHash var32 = new ds.TabelaHash();
    java.lang.String var33 = "";
    var32.retira(var33);
    java.lang.String var35 = "Entrada[";
    java.lang.Short var36 = new java.lang.Short((short)(-1));
    var32.insere(var35, (java.lang.Object)var36);
    ds.TabelaHash var38 = new ds.TabelaHash();
    ds.TabelaHash var39 = new ds.TabelaHash();
    java.lang.String var40 = "*.<!0";
    java.lang.Short var41 = new java.lang.Short((short)1);
    var39.insere(var40, (java.lang.Object)var41);
    java.lang.String var43 = "";
    java.lang.Object var44 = var39.pesquisa(var43);
    java.lang.Short var45 = new java.lang.Short((short)100);
    var38.insere(var43, (java.lang.Object)var45);
    java.lang.Object var47 = var32.pesquisa(var43);
    ds.TabelaHash var48 = new ds.TabelaHash();
    java.lang.Object[] var49 = var48.recuperaItens();
    ds.TabelaHash var50 = new ds.TabelaHash();
    java.lang.String var51 = "";
    var50.retira(var51);
    java.lang.String var53 = "Entrada[";
    java.lang.Object var54 = var50.pesquisa(var53);
    ds.TabelaHash var55 = new ds.TabelaHash();
    java.lang.String var56 = "";
    var55.retira(var56);
    var50.retira(var56);
    java.lang.Object var59 = var48.pesquisa(var56);
    ds.TabelaHash var60 = new ds.TabelaHash();
    var32.insere(var56, (java.lang.Object)var60);
    ds.TabelaHash var62 = new ds.TabelaHash();
    java.lang.Object[] var63 = var62.recuperaItens();
    java.lang.String var64 = "";
    var62.retira(var64);
    var62.imprime();
    var62.imprime();
    var31.insere(var56, (java.lang.Object)var62);
    var0.insere(var25, (java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == null);

  }

}
