package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
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
    ds.TabelaHash var2 = new ds.TabelaHash();

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test4() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character(' ');
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = var0.recuperaItens();

  }

  public void test5() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    var0.retira(var2);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "]:";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(10);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10+ "'", var5.equals(10));

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "]:";
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "12";
    java.lang.Object var6 = var0.pesquisa(var5);
    java.lang.Object[] var7 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer(10);
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer(10);
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character(' ');
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    ds.TabelaHash var6 = new ds.TabelaHash();

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character(' ');
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "]:";
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insere(var4, (java.lang.Object)var5);
    var0.insere(var4, (java.lang.Object)var1);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Integer var3 = new java.lang.Integer(10);
    var0.insere(var2, (java.lang.Object)var3);
    var0.imprime();
    var0.retira(var2);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "12";
    java.lang.Object var7 = var1.pesquisa(var6);
    var0.insere(var6, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test25() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "]:";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.Object[] var5 = var0.recuperaItens();

  }

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.String var4 = "XmErqLjB2ik";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.String var4 = "XmErqLjB2ik";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "T0QWGKiXce";
    java.lang.Object var7 = var5.pesquisa(var6);
    var0.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var9 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test30() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.String var4 = "XmErqLjB2ik";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "T0QWGKiXce";
    java.lang.Object var7 = var5.pesquisa(var6);
    var0.insere(var4, (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    java.lang.Object var6 = var1.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.Object var4 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "+x";
    var0.retira(var1);
    java.lang.Object var3 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "+x";
    var0.retira(var1);
    var0.imprime();
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "hi!";
    var0.retira(var2);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "]:";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "12";
    java.lang.Byte var6 = new java.lang.Byte((byte)0);
    var0.insere(var5, (java.lang.Object)var6);
    ds.TabelaHash var8 = new ds.TabelaHash();

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    java.lang.Object var2 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "12";
    java.lang.Object var7 = var1.pesquisa(var6);
    var0.retira(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.String var4 = "XmErqLjB2ik";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "T0QWGKiXce";
    java.lang.Object var7 = var5.pesquisa(var6);
    var0.insere(var4, (java.lang.Object)var5);
    java.lang.Object var9 = var5.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long(10L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    java.lang.Object var5 = var0.pesquisa(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Long var3 = new java.lang.Long(10L);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "+x";
    var0.retira(var1);
    var0.imprime();
    java.lang.String var4 = "XmErqLjB2ik";
    java.lang.Object var5 = var0.pesquisa(var4);
    java.lang.Object[] var6 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "+x";
    var1.retira(var2);
    var0.retira(var2);

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "+x";
    var1.retira(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Integer var4 = new java.lang.Integer(10);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    var0.insere(var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "+x";
    var1.retira(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "12";
    java.lang.Byte var7 = new java.lang.Byte((byte)0);
    var1.insere(var6, (java.lang.Object)var7);
    java.lang.Object var9 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "T0QWGKiXce";
    java.lang.Object var8 = var6.pesquisa(var7);
    var1.insere(var5, (java.lang.Object)var6);
    java.lang.Object var10 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "T0QWGKiXce";
    java.lang.Object var8 = var6.pesquisa(var7);
    var1.insere(var5, (java.lang.Object)var6);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Character var4 = new java.lang.Character(' ');
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "T0QWGKiXce";
    java.lang.Object var8 = var6.pesquisa(var7);
    var1.insere(var5, (java.lang.Object)var6);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var2.insere(var3, (java.lang.Object)var4);
    var0.retira(var3);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Long var3 = new java.lang.Long(10L);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.insere(var2, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Long var3 = new java.lang.Long(10L);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.insere(var5, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test70() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var1.imprime();
    java.lang.String var5 = "XmErqLjB2ik";
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "T0QWGKiXce";
    java.lang.Object var8 = var6.pesquisa(var7);
    var1.insere(var5, (java.lang.Object)var6);
    java.lang.Object var10 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test71() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var1.pesquisa(var5);
    var0.retira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10.0f+ "'", var6.equals(10.0f));

  }

  public void test72() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.imprime();
    java.lang.String var4 = "XmErqLjB2ik";
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "T0QWGKiXce";
    java.lang.Object var7 = var5.pesquisa(var6);
    var0.insere(var4, (java.lang.Object)var5);
    ds.TabelaHash var9 = new ds.TabelaHash();
    var9.imprime();
    java.lang.String var11 = "";
    java.lang.Object var12 = var9.pesquisa(var11);
    java.lang.Object var13 = var0.pesquisa(var11);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test73() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "T0QWGKiXce";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Long var5 = new java.lang.Long(10L);
    var3.insere(var4, (java.lang.Object)var5);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test74() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();

  }

  public void test75() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    java.lang.Character var3 = new java.lang.Character(' ');
    var0.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ' '+ "'", var6.equals(' '));

  }

  public void test76() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    ds.TabelaHash var3 = new ds.TabelaHash();
    var3.imprime();
    java.lang.String var5 = "";
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.insere(var5, (java.lang.Object)var6);
    var3.imprime();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "";
    java.lang.Float var11 = new java.lang.Float(10.0f);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "";
    java.lang.Object var14 = var9.pesquisa(var13);
    var3.retira(var13);
    var2.retira(var13);
    var0.retira(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10.0f+ "'", var14.equals(10.0f));

  }

  public void test77() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "+x";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var3.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);
    ds.TabelaHash var8 = new ds.TabelaHash();
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "T0QWGKiXce";
    java.lang.Object var11 = var9.pesquisa(var10);
    var8.retira(var10);
    var0.retira(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test78() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "_";
    java.lang.Double var2 = new java.lang.Double(1.0d);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    java.lang.Object var5 = var0.pesquisa(var4);
    ds.TabelaHash var6 = new ds.TabelaHash();
    java.lang.String var7 = "";
    var6.retira(var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "T0QWGKiXce";
    java.lang.Object var11 = var9.pesquisa(var10);
    java.lang.Object var12 = var6.pesquisa(var10);
    java.lang.Boolean var13 = new java.lang.Boolean(true);
    var0.insere(var10, (java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test79() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long(10L);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Object var7 = var5.pesquisa(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10L+ "'", var8.equals(10L));

  }

  public void test80() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var4);

  }

  public void test81() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "T0QWGKiXce";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "+x";
    var5.retira(var6);
    var5.imprime();
    java.lang.String var9 = "XmErqLjB2ik";
    java.lang.Object var10 = var5.pesquisa(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    java.lang.Object[] var12 = var11.recuperaItens();
    java.lang.String var13 = "]:";
    java.lang.Integer var14 = new java.lang.Integer(1);
    var11.insere(var13, (java.lang.Object)var14);
    java.lang.String var16 = "12";
    java.lang.Object var17 = var11.pesquisa(var16);
    var5.retira(var16);
    ds.TabelaHash var19 = new ds.TabelaHash();
    var19.imprime();
    java.lang.String var21 = "";
    java.lang.Object var22 = var19.pesquisa(var21);
    var5.retira(var21);
    java.lang.Object var24 = var0.pesquisa(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);

  }

  public void test82() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    var1.retira(var2);
    var0.retira(var2);

  }

  public void test83() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "12";
    java.lang.Byte var7 = new java.lang.Byte((byte)0);
    var1.insere(var6, (java.lang.Object)var7);
    var0.retira(var6);
    var0.imprime();

  }

  public void test84() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "+x";
    var1.retira(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "";
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var4.insere(var5, (java.lang.Object)var6);
    var1.retira(var5);
    ds.TabelaHash var9 = new ds.TabelaHash();
    var0.insere(var5, (java.lang.Object)var9);

  }

  public void test85() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long(10L);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "_";
    java.lang.Double var6 = new java.lang.Double(1.0d);
    var4.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "";
    java.lang.Object var9 = var4.pesquisa(var8);
    ds.TabelaHash var10 = new ds.TabelaHash();
    var10.imprime();
    java.lang.String var12 = "";
    java.lang.Object var13 = var10.pesquisa(var12);
    var0.insere(var8, (java.lang.Object)var12);
    java.lang.Object[] var15 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test86() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    var0.imprime();
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "T0QWGKiXce";
    java.lang.Object var5 = var3.pesquisa(var4);
    var3.imprime();
    java.lang.String var7 = "XmErqLjB2ik";
    java.lang.Object var8 = var3.pesquisa(var7);
    var0.retira(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test87() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "";
    java.lang.Object var5 = var3.pesquisa(var4);
    var3.imprime();
    java.lang.String var7 = "XmErqLjB2ik";
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "T0QWGKiXce";
    java.lang.Object var10 = var8.pesquisa(var9);
    var3.insere(var7, (java.lang.Object)var8);
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    java.lang.String var14 = "";
    java.lang.Object var15 = var12.pesquisa(var14);
    java.lang.Object var16 = var3.pesquisa(var14);
    ds.TabelaHash var17 = new ds.TabelaHash();
    java.lang.String var18 = "";
    java.lang.Object var19 = var17.pesquisa(var18);
    var17.imprime();
    java.lang.String var21 = "XmErqLjB2ik";
    ds.TabelaHash var22 = new ds.TabelaHash();
    java.lang.String var23 = "T0QWGKiXce";
    java.lang.Object var24 = var22.pesquisa(var23);
    var17.insere(var21, (java.lang.Object)var22);
    var0.insere(var14, (java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);

  }

  public void test88() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var2.imprime();
    java.lang.String var6 = "XmErqLjB2ik";
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "T0QWGKiXce";
    java.lang.Object var9 = var7.pesquisa(var8);
    var2.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    java.lang.String var13 = "";
    java.lang.Object var14 = var11.pesquisa(var13);
    java.lang.Object var15 = var2.pesquisa(var13);
    ds.TabelaHash var16 = new ds.TabelaHash();
    var16.imprime();
    java.lang.String var18 = "";
    java.lang.Object var19 = var16.pesquisa(var18);
    var0.insere(var13, (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test89() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "]:";
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var2.insere(var4, (java.lang.Object)var5);
    var0.retira(var4);

  }

  public void test90() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "+x";
    var2.retira(var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    java.lang.String var7 = "]:";
    java.lang.Integer var8 = new java.lang.Integer(1);
    var5.insere(var7, (java.lang.Object)var8);
    java.lang.String var10 = "12";
    java.lang.Object var11 = var5.pesquisa(var10);
    java.lang.Object var12 = var2.pesquisa(var10);
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "";
    java.lang.Float var15 = new java.lang.Float(10.0f);
    var13.insere(var14, (java.lang.Object)var15);
    java.lang.String var17 = "";
    java.lang.Object var18 = var13.pesquisa(var17);
    var13.imprime();
    var1.insere(var10, (java.lang.Object)var13);
    java.lang.Object var21 = var0.pesquisa(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10.0f+ "'", var18.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test91() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "+x";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    java.lang.String var5 = "]:";
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "12";
    java.lang.Object var9 = var3.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    java.lang.Object[] var11 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test92() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "]:";
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.String var6 = "12";
    java.lang.Byte var7 = new java.lang.Byte((byte)0);
    var1.insere(var6, (java.lang.Object)var7);
    var0.retira(var6);
    ds.TabelaHash var10 = new ds.TabelaHash();
    java.lang.String var11 = "+x";
    var10.retira(var11);
    var0.retira(var11);

  }

  public void test93() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.String var6 = "";
    java.lang.Long var7 = new java.lang.Long(10L);
    var5.insere(var6, (java.lang.Object)var7);
    ds.TabelaHash var9 = new ds.TabelaHash();
    java.lang.String var10 = "_";
    java.lang.Double var11 = new java.lang.Double(1.0d);
    var9.insere(var10, (java.lang.Object)var11);
    java.lang.String var13 = "";
    java.lang.Object var14 = var9.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    var15.imprime();
    java.lang.String var17 = "";
    java.lang.Object var18 = var15.pesquisa(var17);
    var5.insere(var13, (java.lang.Object)var17);
    var0.insere(var2, (java.lang.Object)var5);
    ds.TabelaHash var21 = new ds.TabelaHash();
    var21.imprime();
    java.lang.String var23 = "";
    java.lang.Integer var24 = new java.lang.Integer(10);
    var21.insere(var23, (java.lang.Object)var24);
    var21.imprime();
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.String var28 = "";
    java.lang.Float var29 = new java.lang.Float(10.0f);
    var27.insere(var28, (java.lang.Object)var29);
    java.lang.String var31 = "";
    java.lang.Object var32 = var27.pesquisa(var31);
    var21.retira(var31);
    ds.TabelaHash var34 = new ds.TabelaHash();
    var34.imprime();
    java.lang.String var36 = "";
    java.lang.Integer var37 = new java.lang.Integer(10);
    var34.insere(var36, (java.lang.Object)var37);
    var34.imprime();
    ds.TabelaHash var40 = new ds.TabelaHash();
    java.lang.String var41 = "";
    java.lang.Float var42 = new java.lang.Float(10.0f);
    var40.insere(var41, (java.lang.Object)var42);
    java.lang.String var44 = "";
    java.lang.Object var45 = var40.pesquisa(var44);
    var34.retira(var44);
    ds.TabelaHash var47 = new ds.TabelaHash();
    java.lang.String var48 = "+x";
    var47.retira(var48);
    ds.TabelaHash var50 = new ds.TabelaHash();
    java.lang.String var51 = "";
    java.lang.Float var52 = new java.lang.Float(10.0f);
    var50.insere(var51, (java.lang.Object)var52);
    var47.retira(var51);
    var21.insere(var44, (java.lang.Object)var51);
    var5.retira(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + 10.0f+ "'", var45.equals(10.0f));

  }

  public void test94() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test95() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "+x";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    java.lang.String var5 = "]:";
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.insere(var5, (java.lang.Object)var6);
    java.lang.String var8 = "12";
    java.lang.Object var9 = var3.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    java.lang.String var13 = "";
    java.lang.Object var14 = var11.pesquisa(var13);
    java.lang.String var15 = "hi!";
    java.lang.Object var16 = var11.pesquisa(var15);
    ds.TabelaHash var17 = new ds.TabelaHash();
    ds.TabelaHash var18 = new ds.TabelaHash();
    var18.imprime();
    java.lang.String var20 = "";
    java.lang.Integer var21 = new java.lang.Integer(10);
    var18.insere(var20, (java.lang.Object)var21);
    var18.imprime();
    ds.TabelaHash var24 = new ds.TabelaHash();
    java.lang.String var25 = "";
    java.lang.Float var26 = new java.lang.Float(10.0f);
    var24.insere(var25, (java.lang.Object)var26);
    java.lang.String var28 = "";
    java.lang.Object var29 = var24.pesquisa(var28);
    var18.retira(var28);
    var17.retira(var28);
    var0.insere(var15, (java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 10.0f+ "'", var29.equals(10.0f));

  }

  public void test96() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Character var4 = new java.lang.Character(' ');
    var1.insere(var3, (java.lang.Object)var4);
    java.lang.Object var6 = var0.pesquisa(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test97() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Long var2 = new java.lang.Long(10L);
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test98() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "_";
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

  }

  public void test99() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.retira(var3);
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    java.lang.String var8 = "";
    java.lang.Integer var9 = new java.lang.Integer(10);
    var6.insere(var8, (java.lang.Object)var9);
    var0.retira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test100() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.String var4 = "T0QWGKiXce";
    java.lang.Object var5 = var3.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    var7.retira(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test101() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    var2.imprime();
    java.lang.String var4 = "";
    java.lang.Object var5 = var2.pesquisa(var4);
    java.lang.String var6 = "hi!";
    java.lang.Object var7 = var2.pesquisa(var6);
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "";
    java.lang.Float var10 = new java.lang.Float(10.0f);
    var8.insere(var9, (java.lang.Object)var10);
    java.lang.String var12 = "";
    java.lang.Object var13 = var8.pesquisa(var12);
    var1.insere(var6, var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "";
    java.lang.Float var18 = new java.lang.Float(10.0f);
    var16.insere(var17, (java.lang.Object)var18);
    java.lang.Object var20 = var15.pesquisa(var17);
    var0.insere(var6, (java.lang.Object)var15);
    java.lang.Object[] var22 = var15.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10.0f+ "'", var13.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);

  }

}
