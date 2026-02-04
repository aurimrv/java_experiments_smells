package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
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
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    java.lang.Object[] var5 = var0.recuperaItens();
    java.lang.Object var6 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (byte)100+ "'", var6.equals((byte)100));

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "792";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "792";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "I7sJoQ";
    java.lang.Byte var4 = new java.lang.Byte((byte)(-1));
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "792";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "I7sJoQ";
    java.lang.Byte var4 = new java.lang.Byte((byte)(-1));
    var0.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "-800";
    java.lang.Long var7 = new java.lang.Long((-1L));
    var0.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0d+ "'", var5.equals(10.0d));

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.retira(var1);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10.0d+ "'", var6.equals(10.0d));

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10.0d+ "'", var6.equals(10.0d));

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.retira(var1);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "-800";
    java.lang.Long var8 = new java.lang.Long((-1L));
    var1.insere(var7, (java.lang.Object)var8);
    java.lang.Object var10 = var0.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "-800";
    java.lang.Long var8 = new java.lang.Long((-1L));
    var1.insere(var7, (java.lang.Object)var8);
    var0.insere(var7, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = ".";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "792";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    var2.insere(var1, (java.lang.Object)var2);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "jx21py";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    var0.retira(var2);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = ".";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "jx21py";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "I7sJoQ";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-569";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var4.insere(var5, (java.lang.Object)var6);
    var6.imprime();
    var0.insere(var3, (java.lang.Object)var6);
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "792";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "I7sJoQ";
    java.lang.Object var4 = var0.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "jx21py";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    java.lang.Object[] var5 = var2.recuperaItens();
    ds.TabelaHash var6 = new ds.TabelaHash();

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = ".";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = ".";
    java.lang.Object var5 = var0.pesquisa(var4);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = ".";
    java.lang.Object var5 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    var0.insere(var2, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "792";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "jx21py";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    ds.TabelaHash var5 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "jx21py";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.String var3 = "I7sJoQ";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-569";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var4.insere(var5, (java.lang.Object)var6);
    var6.imprime();
    var0.insere(var3, (java.lang.Object)var6);
    java.lang.String var10 = "-800";
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.Object[] var12 = var11.recuperaItens();
    var6.insere(var10, (java.lang.Object)var12);
    ds.TabelaHash var14 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "jx21py";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-569";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var5.insere(var6, (java.lang.Object)var7);
    var7.imprime();
    var1.insere(var4, (java.lang.Object)var7);
    var0.insere(var4, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "jx21py";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Byte var5 = new java.lang.Byte((byte)100);
    var3.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.Object[] var2 = var0.recuperaItens();
    var0.imprime();

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "792";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Double var5 = new java.lang.Double(10.0d);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "";
    java.lang.Object var8 = var3.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10.0d+ "'", var8.equals(10.0d));

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    java.lang.Byte var6 = new java.lang.Byte((byte)100);
    var4.insere(var5, (java.lang.Object)var6);
    var4.imprime();
    java.lang.Object[] var9 = var4.recuperaItens();
    var0.insere(var2, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = ".";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "jx21py";
    java.lang.Object var8 = var6.pesquisa(var7);
    java.lang.String var9 = "I7sJoQ";
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "-569";
    ds.TabelaHash var12 = new ds.TabelaHash();
    var10.insere(var11, (java.lang.Object)var12);
    var12.imprime();
    var6.insere(var9, (java.lang.Object)var12);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var0.insere(var9, (java.lang.Object)var16);
    var16.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "685470321";
    java.lang.Object var4 = var1.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = ".";
    java.lang.Object var6 = var1.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "jx21py";
    java.lang.Object var9 = var7.pesquisa(var8);
    java.lang.String var10 = "I7sJoQ";
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.String var12 = "-569";
    ds.TabelaHash var13 = new ds.TabelaHash();
    var11.insere(var12, (java.lang.Object)var13);
    var13.imprime();
    var7.insere(var10, (java.lang.Object)var13);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var1.insere(var10, (java.lang.Object)var17);
    ds.TabelaHash var19 = new ds.TabelaHash();
    var0.insere(var10, (java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "jx21py";
    java.lang.Object var8 = var6.pesquisa(var7);
    java.lang.String var9 = "I7sJoQ";
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "-569";
    ds.TabelaHash var12 = new ds.TabelaHash();
    var10.insere(var11, (java.lang.Object)var12);
    var12.imprime();
    var6.insere(var9, (java.lang.Object)var12);
    java.lang.Short var16 = new java.lang.Short((short)1);
    var0.insere(var9, (java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0d+ "'", var5.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "792";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.String var4 = "I7sJoQ";
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var1.insere(var4, (java.lang.Object)var5);
    java.lang.String var7 = "-800";
    java.lang.Long var8 = new java.lang.Long((-1L));
    var1.insere(var7, (java.lang.Object)var8);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10.0d+ "'", var6.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "-569";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = ".";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    java.lang.String var8 = "hi!";
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "-569";
    ds.TabelaHash var11 = new ds.TabelaHash();
    var9.insere(var10, (java.lang.Object)var11);
    var0.insere(var8, (java.lang.Object)var9);
    java.lang.Object[] var14 = var9.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "685470321";
    java.lang.Object var7 = var4.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Double var10 = new java.lang.Double(10.0d);
    var8.insere(var9, (java.lang.Object)var10);
    var0.insere(var6, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "-569";
    ds.TabelaHash var4 = new ds.TabelaHash();
    var2.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    java.lang.Object[] var7 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-569";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var6.insere(var7, (java.lang.Object)var8);
    var4.retira(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "685470321";
    java.lang.Object var5 = var2.pesquisa(var4);
    var1.retira(var4);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.String var6 = "";
    var0.retira(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0d+ "'", var5.equals(10.0d));

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "685470321";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    java.lang.Object[] var5 = var0.recuperaItens();
    var0.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "-569";
    ds.TabelaHash var10 = new ds.TabelaHash();
    var8.insere(var9, (java.lang.Object)var10);
    ds.TabelaHash var12 = new ds.TabelaHash();
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "jx21py";
    java.lang.Object var15 = var13.pesquisa(var14);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var12.insere(var14, (java.lang.Object)var16);
    var7.insere(var9, (java.lang.Object)var14);
    var0.retira(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "-569";
    ds.TabelaHash var6 = new ds.TabelaHash();
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = ".";
    java.lang.Object var9 = var4.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "-569";
    ds.TabelaHash var8 = new ds.TabelaHash();
    var6.insere(var7, (java.lang.Object)var8);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0d+ "'", var5.equals(10.0d));

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();
    java.lang.Object[] var5 = var2.recuperaItens();
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "792";
    java.lang.Object var8 = var6.pesquisa(var7);
    java.lang.Object var9 = var2.pesquisa(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "-569";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    java.lang.String var6 = "685470321";
    java.lang.Object var7 = var4.pesquisa(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    java.lang.Object[] var9 = var0.recuperaItens();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "-569";
    ds.TabelaHash var7 = new ds.TabelaHash();
    var5.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "-569";
    ds.TabelaHash var11 = new ds.TabelaHash();
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = ".";
    java.lang.Object var14 = var9.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "jx21py";
    java.lang.Object var17 = var15.pesquisa(var16);
    java.lang.String var18 = "I7sJoQ";
    ds.TabelaHash var19 = new ds.TabelaHash();
    java.lang.String var20 = "-569";
    ds.TabelaHash var21 = new ds.TabelaHash();
    var19.insere(var20, (java.lang.Object)var21);
    var21.imprime();
    var15.insere(var18, (java.lang.Object)var21);
    ds.TabelaHash var25 = new ds.TabelaHash();
    var9.insere(var18, (java.lang.Object)var25);
    var5.retira(var18);
    java.lang.Float var28 = new java.lang.Float((-1.0f));
    var0.insere(var18, (java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

}
