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
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "OG|>0!&";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(0.0f);
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.Object[] var7 = var0.recuperaItens();

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.String var4 = "5<W";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var5.insere(var6, (java.lang.Object)var7);
    var0.insere(var4, (java.lang.Object)var6);
    java.lang.Object var10 = var5.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (byte)100+ "'", var10.equals((byte)100));

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.String var4 = "5<W";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var5.insere(var6, (java.lang.Object)var7);
    var0.insere(var4, (java.lang.Object)var6);
    java.lang.Object[] var10 = var0.recuperaItens();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.String var4 = "5<W";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var5.insere(var6, (java.lang.Object)var7);
    var0.insere(var4, (java.lang.Object)var6);
    java.lang.Object[] var10 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "Entrada[";
    java.lang.Float var6 = new java.lang.Float(0.0f);
    var1.insere(var5, (java.lang.Object)var6);
    var0.insere(var5, (java.lang.Object)var0);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "lj;p[k";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(0.0f);
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    var0.retira(var7);
    java.lang.Object var9 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "lj;p[k";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "lj;p[k";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "";
    var0.retira(var5);
    var0.insere(var5, (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "OG|>0!&";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.String var5 = "5<W";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Byte var8 = new java.lang.Byte((byte)100);
    var6.insere(var7, (java.lang.Object)var8);
    var1.insere(var5, (java.lang.Object)var7);
    java.lang.Object var11 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "OG|>0!&";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.String var5 = "5<W";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Byte var8 = new java.lang.Byte((byte)100);
    var6.insere(var7, (java.lang.Object)var8);
    var1.insere(var5, (java.lang.Object)var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Long var6 = new java.lang.Long(1L);
    var0.insere(var5, (java.lang.Object)var6);
    java.lang.Object var8 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 1L+ "'", var8.equals(1L));

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "lj;p[k";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    var0.retira(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Long var6 = new java.lang.Long(1L);
    var0.insere(var5, (java.lang.Object)var6);
    java.lang.Object[] var8 = var0.recuperaItens();
    ds.TabelaHash var9 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "OG|>0!&";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "lj;p[k";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "7826430159";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Byte var4 = new java.lang.Byte((byte)100);
    var2.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    var0.retira(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "lj;p[k";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_@{([";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_@{([";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    var0.insere(var3, (java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "_@{([";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "lj;p[k";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "";
    var1.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "OG|>0!&";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.String var5 = "5<W";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    java.lang.Byte var8 = new java.lang.Byte((byte)100);
    var6.insere(var7, (java.lang.Object)var8);
    var1.insere(var5, (java.lang.Object)var7);
    java.lang.Object var11 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "OG|>0!&";
    java.lang.Object var5 = var2.pesquisa(var4);
    java.lang.String var6 = "5<W";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    java.lang.Byte var9 = new java.lang.Byte((byte)100);
    var7.insere(var8, (java.lang.Object)var9);
    var2.insere(var6, (java.lang.Object)var8);
    var0.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    var0.insere(var3, (java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0718526439";
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "Entrada[";
    java.lang.Float var6 = new java.lang.Float(0.0f);
    var1.insere(var5, (java.lang.Object)var6);
    var0.retira(var5);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "5<W";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "5<W";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var6 = var3.recuperaItens();
    ds.TabelaHash var7 = new ds.TabelaHash();

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Object var6 = var0.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0718526439";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_@{([";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "";
    var0.retira(var5);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    var0.insere(var3, (java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Object var6 = var0.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "lj;p[k";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "lj;p[k";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "0718526439";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.String var7 = "8203571469";
    var4.retira(var7);
    java.lang.String var9 = "5<W";
    java.lang.Object var10 = var4.pesquisa(var9);
    java.lang.Object var11 = var0.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    java.lang.String var7 = "OG|>0!&";
    java.lang.Object var8 = var5.pesquisa(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.Object[] var10 = var9.recuperaItens();
    java.lang.String var11 = "5<W";
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.Object[] var13 = var12.recuperaItens();
    var9.insere(var11, (java.lang.Object)var12);
    var0.insere(var7, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.Object[] var5 = var0.recuperaItens();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    java.lang.Object[] var8 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "7826430159";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Object var6 = var2.pesquisa(var4);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.Object[] var9 = var7.recuperaItens();
    var0.insere(var4, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "Entrada[";
    java.lang.Float var5 = new java.lang.Float(0.0f);
    var0.insere(var4, (java.lang.Object)var5);
    var0.imprime();

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "_@{([";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.String var6 = "";
    var1.retira(var6);
    java.lang.Short var8 = new java.lang.Short((short)10);
    var0.insere(var6, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "lj;p[k";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Long var6 = new java.lang.Long(1L);
    var0.insere(var5, (java.lang.Object)var6);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.Object[] var3 = var0.recuperaItens();
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "0718526439";
    java.lang.Boolean var6 = new java.lang.Boolean(true);
    var4.insere(var5, (java.lang.Object)var6);
    var0.retira(var5);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Byte var4 = new java.lang.Byte((byte)100);
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "Entrada[";
    java.lang.Float var7 = new java.lang.Float(0.0f);
    var2.insere(var6, (java.lang.Object)var7);
    java.lang.String var9 = "";
    var2.retira(var9);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var12 = var2.recuperaItens();

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Object var6 = var0.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "_@{([";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.String var10 = "8203571469";
    var7.retira(var10);
    java.lang.String var12 = "";
    var7.retira(var12);
    java.lang.Object var14 = var0.pesquisa(var12);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "lj;p[k";
    java.lang.Object var17 = var15.pesquisa(var16);
    java.lang.String var18 = "8203571469";
    var15.retira(var18);
    java.lang.String var20 = "";
    var15.retira(var20);
    java.lang.Object var22 = var0.pesquisa(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.Object[] var3 = var0.recuperaItens();
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    java.lang.String var7 = "5<W";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.Object[] var9 = var8.recuperaItens();
    var5.insere(var7, (java.lang.Object)var8);
    java.lang.Object[] var11 = var8.recuperaItens();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "";
    java.lang.Object var14 = var12.pesquisa(var13);
    java.lang.String var15 = "8203571469";
    var12.retira(var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "_@{([";
    java.lang.Object var19 = var17.pesquisa(var18);
    var8.insere(var15, (java.lang.Object)var18);
    var0.retira(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Object var6 = var2.pesquisa(var4);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.String var6 = "8203571469";
    var3.retira(var6);
    java.lang.Byte var8 = new java.lang.Byte((byte)0);
    var2.insere(var6, (java.lang.Object)var8);
    java.lang.Object var10 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "lj;p[k";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.Object[] var5 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "lj;p[k";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    var0.retira(var4);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.Object[] var8 = var7.recuperaItens();
    java.lang.String var9 = "5<W";
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.Object[] var11 = var10.recuperaItens();
    var7.insere(var9, (java.lang.Object)var10);
    java.lang.Object[] var13 = var10.recuperaItens();
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.String var15 = "";
    java.lang.Object var16 = var14.pesquisa(var15);
    java.lang.String var17 = "8203571469";
    var14.retira(var17);
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "_@{([";
    java.lang.Object var21 = var19.pesquisa(var20);
    var10.insere(var17, (java.lang.Object)var20);
    ds.TabelaHash var23 = new ds.TabelaHash();
    java.lang.String var24 = "7826430159";
    java.lang.Object var25 = var23.pesquisa(var24);
    java.lang.String var26 = "8203571469";
    var23.retira(var26);
    java.lang.String var28 = "5<W";
    java.lang.Long var29 = new java.lang.Long(1L);
    var23.insere(var28, (java.lang.Object)var29);
    java.lang.Object[] var31 = var23.recuperaItens();
    var0.insere(var17, (java.lang.Object)var23);
    ds.TabelaHash var33 = new ds.TabelaHash();
    java.lang.String var34 = "7826430159";
    java.lang.Object var35 = var33.pesquisa(var34);
    java.lang.Object var36 = var0.pesquisa(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0718526439";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.String var6 = "5<W";
    java.lang.Object var7 = var1.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "_@{([";
    java.lang.Object var10 = var8.pesquisa(var9);
    java.lang.String var11 = "8203571469";
    var8.retira(var11);
    java.lang.String var13 = "";
    var8.retira(var13);
    java.lang.Object var15 = var1.pesquisa(var13);
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "7826430159";
    java.lang.Object var18 = var16.pesquisa(var17);
    java.lang.Object[] var19 = var16.recuperaItens();
    var0.insere(var13, (java.lang.Object)var19);
    ds.TabelaHash var21 = new ds.TabelaHash();
    ds.TabelaHash var22 = new ds.TabelaHash();
    java.lang.String var23 = "7826430159";
    java.lang.Object var24 = var22.pesquisa(var23);
    var21.retira(var23);
    var0.retira(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "0718526439";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "8203571469";
    var1.retira(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7826430159";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.String var5 = "5<W";
    java.lang.Long var6 = new java.lang.Long(1L);
    var0.insere(var5, (java.lang.Object)var6);
    java.lang.Object[] var8 = var0.recuperaItens();
    java.lang.Object[] var9 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "";
    var2.retira(var4);
    var1.retira(var4);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var0.insere(var4, (java.lang.Object)var7);

  }

  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "OG|>0!&";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "5<W";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.Object[] var8 = var7.recuperaItens();
    var4.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "";
    java.lang.Object var12 = var10.pesquisa(var11);
    var4.retira(var11);
    var0.retira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_@{([";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "8203571469";
    var0.retira(var3);
    java.lang.Object[] var5 = var0.recuperaItens();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.Object[] var7 = var6.recuperaItens();
    java.lang.String var8 = "5<W";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.Object[] var10 = var9.recuperaItens();
    var6.insere(var8, (java.lang.Object)var9);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var0.insere(var8, (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "0718526439";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "";
    var4.retira(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    var8.imprime();
    java.lang.String var10 = "OG|>0!&";
    java.lang.Object var11 = var8.pesquisa(var10);
    java.lang.String var12 = "5<W";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "";
    java.lang.Byte var15 = new java.lang.Byte((byte)100);
    var13.insere(var14, (java.lang.Object)var15);
    var8.insere(var12, (java.lang.Object)var14);
    var0.insere(var6, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test90() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();
    java.lang.Object[] var3 = var0.recuperaItens();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "7826430159";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.Object var10 = var6.pesquisa(var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "";
    java.lang.Object var14 = var12.pesquisa(var13);
    java.lang.String var15 = "8203571469";
    var12.retira(var15);
    java.lang.String var17 = "5<W";
    java.lang.Object var18 = var12.pesquisa(var17);
    java.lang.Object var19 = var11.pesquisa(var17);
    var0.insere(var8, (java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

}
