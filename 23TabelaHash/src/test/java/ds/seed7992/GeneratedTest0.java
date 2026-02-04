package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test2() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.String var4 = "";
    var0.retira(var4);
    var0.insere(var4, (java.lang.Object)var4);

  }

  public void test3() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.retira(var2);

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
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Short var4 = new java.lang.Short((short)1);
    var2.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var1);

  }

  public void test6() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    var0.retira(var1);

  }

  public void test7() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "";
    java.lang.Object var3 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test8() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "67#_'*a";
    var0.retira(var2);
    var0.imprime();

  }

  public void test9() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    var0.retira(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test10() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "67#_'*a";
    var1.retira(var3);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test11() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'}4/t+{zr&";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test12() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "hi!";
    var0.insere(var1, (java.lang.Object)var0);

  }

  public void test13() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "|";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test14() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "hi!";
    var0.insere(var2, (java.lang.Object)var1);

  }

  public void test15() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "7245860139";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test16() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test17() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "7245860139";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.pesquisa(var1);
    ds.TabelaHash var3 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test19() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "|";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test20() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'}4/t+{zr&";
    java.lang.Object var3 = var1.pesquisa(var2);
    java.lang.Object var4 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test21() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "";
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test22() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    var0.insere(var2, (java.lang.Object)var0);

  }

  public void test23() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.insere(var5, (java.lang.Object)var0);

  }

  public void test24() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test25() throws Throwable {

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

  public void test26() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var3);
    var2.imprime();

  }

  public void test27() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.String var5 = "";
    var1.retira(var5);
    var0.retira(var5);

  }

  public void test28() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "zh#b<nxitu";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.retira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test29() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    var0.insere(var1, (java.lang.Object)var3);
    java.lang.String var5 = "";
    java.lang.Object var6 = var0.pesquisa(var5);
    ds.TabelaHash var7 = new ds.TabelaHash();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test30() throws Throwable {

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

  public void test31() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    var0.imprime();

  }

  public void test32() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.String var3 = "7245860139";
    java.lang.Object var4 = var2.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test33() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "|";
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.Object[] var5 = var4.recuperaItens();
    var1.insere(var3, (java.lang.Object)var4);
    var0.insere(var3, (java.lang.Object)var0);

  }

  public void test34() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "67#_'*a";
    var0.retira(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();

  }

  public void test35() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "|";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    java.lang.Object var7 = var3.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test36() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "67#_'*a";
    var2.retira(var4);
    var0.retira(var4);

  }

  public void test37() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.Object[] var2 = var0.recuperaItens();

  }

  public void test38() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "zh#b<nxitu";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test39() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "67#_'*a";
    var0.retira(var2);
    var0.insere(var2, (java.lang.Object)var2);

  }

  public void test40() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'}4/t+{zr&";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var1.insere(var2, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var1.pesquisa(var6);
    var0.retira(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test41() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "|";
    java.lang.Object var5 = var2.pesquisa(var4);
    java.lang.Object var6 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test42() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "zh#b<nxitu";
    java.lang.Object var3 = var0.pesquisa(var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test43() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var2.imprime();

  }

  public void test44() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    var1.imprime();
    java.lang.String var3 = "zh#b<nxitu";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.insere(var3, (java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test45() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var2.recuperaItens();
    var2.imprime();

  }

  public void test46() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    java.lang.Object[] var4 = var2.recuperaItens();

  }

  public void test47() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'}4/t+{zr&";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var1.insere(var2, (java.lang.Object)var4);
    java.lang.String var6 = "";
    java.lang.Object var7 = var1.pesquisa(var6);
    java.lang.Object var8 = var0.pesquisa(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test48() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "67#_'*a";
    var0.retira(var2);
    java.lang.Object[] var4 = var0.recuperaItens();

  }

  public void test49() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    java.lang.Object var2 = var0.pesquisa(var1);
    java.lang.Object[] var3 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test50() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "67#_'*a";
    var2.retira(var4);
    var1.retira(var4);
    java.lang.Object var7 = var0.pesquisa(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test51() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "67#_'*a";
    var1.retira(var3);
    var0.retira(var3);
    var0.imprime();

  }

  public void test52() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "'}4/t+{zr&";
    ds.TabelaHash var2 = new ds.TabelaHash();
    var0.insere(var1, (java.lang.Object)var2);
    var0.imprime();

  }

  public void test53() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test54() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.Object[] var2 = var0.recuperaItens();

  }

  public void test55() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "'}4/t+{zr&";
    ds.TabelaHash var3 = new ds.TabelaHash();
    var1.insere(var2, (java.lang.Object)var3);
    java.lang.Object var5 = var0.pesquisa(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test56() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.String var1 = "";
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.insere(var1, (java.lang.Object)var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    java.lang.String var5 = "7245860139";
    java.lang.Object var6 = var4.pesquisa(var5);
    java.lang.Object var7 = var0.pesquisa(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test57() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "67#_'*a";
    var1.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    java.lang.String var8 = "zh#b<nxitu";
    java.lang.Object var9 = var6.pesquisa(var8);
    var0.retira(var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.Object[] var13 = var12.recuperaItens();
    java.lang.String var14 = "67#_'*a";
    var12.retira(var14);
    java.lang.Object var16 = var11.pesquisa(var14);
    ds.TabelaHash var17 = new ds.TabelaHash();
    var17.imprime();
    java.lang.String var19 = "zh#b<nxitu";
    java.lang.Object var20 = var17.pesquisa(var19);
    var11.retira(var19);
    var0.retira(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);

  }

  public void test58() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "67#_'*a";
    var1.retira(var3);
    java.lang.Double var5 = new java.lang.Double(10.0d);
    var0.insere(var3, (java.lang.Object)var5);

  }

  public void test59() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "|";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    java.lang.Short var9 = new java.lang.Short((short)1);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.String var11 = "";
    var7.retira(var11);
    var3.retira(var11);

  }

  public void test60() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "67#_'*a";
    var1.retira(var3);
    java.lang.Object var5 = var0.pesquisa(var3);
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    java.lang.String var8 = "zh#b<nxitu";
    java.lang.Object var9 = var6.pesquisa(var8);
    var0.retira(var8);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var11.imprime();
    java.lang.String var13 = "zh#b<nxitu";
    java.lang.Object var14 = var11.pesquisa(var13);
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.String var16 = "";
    java.lang.Object var17 = var15.pesquisa(var16);
    java.lang.Object[] var18 = var15.recuperaItens();
    var0.insere(var13, (java.lang.Object)var15);
    java.lang.Object[] var20 = var0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test61() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "|";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    ds.TabelaHash var8 = new ds.TabelaHash();
    java.lang.String var9 = "hi!";
    var8.retira(var9);
    ds.TabelaHash var11 = new ds.TabelaHash();
    var7.insere(var9, (java.lang.Object)var11);
    java.lang.Object var13 = var3.pesquisa(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test62() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "|";
    java.lang.Object var5 = var2.pesquisa(var4);
    var1.retira(var4);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.String var9 = "zh#b<nxitu";
    java.lang.Object var10 = var7.pesquisa(var9);
    java.lang.Object var11 = var1.pesquisa(var9);
    java.lang.String var12 = "hi!";
    ds.TabelaHash var13 = new ds.TabelaHash();
    java.lang.String var14 = "'}4/t+{zr&";
    ds.TabelaHash var15 = new ds.TabelaHash();
    java.lang.Object[] var16 = var15.recuperaItens();
    var13.insere(var14, (java.lang.Object)var16);
    java.lang.String var18 = "";
    java.lang.Object var19 = var13.pesquisa(var18);
    var1.insere(var12, (java.lang.Object)var18);
    java.lang.Object var21 = var0.pesquisa(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test63() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "zh#b<nxitu";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    ds.TabelaHash var5 = new ds.TabelaHash();
    java.lang.Object[] var6 = var5.recuperaItens();
    java.lang.String var7 = "|";
    java.lang.Object var8 = var5.pesquisa(var7);
    var4.retira(var7);
    ds.TabelaHash var10 = new ds.TabelaHash();
    var10.imprime();
    java.lang.String var12 = "zh#b<nxitu";
    java.lang.Object var13 = var10.pesquisa(var12);
    java.lang.Object var14 = var4.pesquisa(var12);
    java.lang.String var15 = "hi!";
    ds.TabelaHash var16 = new ds.TabelaHash();
    java.lang.String var17 = "'}4/t+{zr&";
    ds.TabelaHash var18 = new ds.TabelaHash();
    java.lang.Object[] var19 = var18.recuperaItens();
    var16.insere(var17, (java.lang.Object)var19);
    java.lang.String var21 = "";
    java.lang.Object var22 = var16.pesquisa(var21);
    var4.insere(var15, (java.lang.Object)var21);
    ds.TabelaHash var24 = new ds.TabelaHash();
    java.lang.String var25 = "";
    java.lang.Object var26 = var24.pesquisa(var25);
    ds.TabelaHash var27 = new ds.TabelaHash();
    java.lang.String var28 = "";
    java.lang.Object var29 = var27.pesquisa(var28);
    ds.TabelaHash var30 = new ds.TabelaHash();
    var30.imprime();
    java.lang.String var32 = "zh#b<nxitu";
    java.lang.Object var33 = var30.pesquisa(var32);
    java.lang.Object[] var34 = var30.recuperaItens();
    var24.insere(var28, (java.lang.Object)var30);
    var0.insere(var15, (java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);

  }

  public void test64() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "hi!";
    var1.retira(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    var0.insere(var2, (java.lang.Object)var4);
    var4.imprime();

  }

  public void test65() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    java.lang.Object[] var1 = var0.recuperaItens();
    java.lang.String var2 = "|";
    ds.TabelaHash var3 = new ds.TabelaHash();
    java.lang.Object[] var4 = var3.recuperaItens();
    var0.insere(var2, (java.lang.Object)var3);
    var3.imprime();
    ds.TabelaHash var7 = new ds.TabelaHash();
    java.lang.String var8 = "";
    java.lang.Short var9 = new java.lang.Short((short)1);
    var7.insere(var8, (java.lang.Object)var9);
    java.lang.Object var11 = var3.pesquisa(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test66() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.Object[] var2 = var1.recuperaItens();
    java.lang.String var3 = "|";
    java.lang.Object var4 = var1.pesquisa(var3);
    var0.retira(var3);
    ds.TabelaHash var6 = new ds.TabelaHash();
    var6.imprime();
    java.lang.String var8 = "zh#b<nxitu";
    java.lang.Object var9 = var6.pesquisa(var8);
    java.lang.Object var10 = var0.pesquisa(var8);
    java.lang.String var11 = "hi!";
    ds.TabelaHash var12 = new ds.TabelaHash();
    java.lang.String var13 = "'}4/t+{zr&";
    ds.TabelaHash var14 = new ds.TabelaHash();
    java.lang.Object[] var15 = var14.recuperaItens();
    var12.insere(var13, (java.lang.Object)var15);
    java.lang.String var17 = "";
    java.lang.Object var18 = var12.pesquisa(var17);
    var0.insere(var11, (java.lang.Object)var17);
    ds.TabelaHash var20 = new ds.TabelaHash();
    java.lang.String var21 = "hi!";
    var20.retira(var21);
    java.lang.Long var23 = new java.lang.Long(10L);
    var0.insere(var21, (java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test67() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    java.lang.String var2 = "";
    java.lang.Object var3 = var1.pesquisa(var2);
    var0.retira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test68() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    var0.imprime();
    java.lang.String var2 = "zh#b<nxitu";
    java.lang.Object var3 = var0.pesquisa(var2);
    ds.TabelaHash var4 = new ds.TabelaHash();
    ds.TabelaHash var5 = new ds.TabelaHash();
    var5.imprime();
    java.lang.String var7 = "zh#b<nxitu";
    java.lang.Object var8 = var5.pesquisa(var7);
    java.lang.Object var9 = var4.pesquisa(var7);
    ds.TabelaHash var10 = new ds.TabelaHash();
    var10.imprime();
    java.lang.String var12 = "zh#b<nxitu";
    java.lang.Object var13 = var10.pesquisa(var12);
    java.lang.Object[] var14 = var10.recuperaItens();
    ds.TabelaHash var15 = new ds.TabelaHash();
    var15.imprime();
    java.lang.String var17 = "zh#b<nxitu";
    java.lang.Object var18 = var15.pesquisa(var17);
    java.lang.Long var19 = new java.lang.Long(1L);
    var10.insere(var17, (java.lang.Object)var19);
    ds.TabelaHash var21 = new ds.TabelaHash();
    java.lang.Object[] var22 = var21.recuperaItens();
    java.lang.String var23 = "67#_'*a";
    var21.retira(var23);
    var4.insere(var17, (java.lang.Object)var23);
    java.lang.Object var26 = var0.pesquisa(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);

  }

  public void test69() throws Throwable {

    ds.TabelaHash var0 = new ds.TabelaHash();
    ds.TabelaHash var1 = new ds.TabelaHash();
    ds.TabelaHash var2 = new ds.TabelaHash();
    java.lang.Object[] var3 = var2.recuperaItens();
    java.lang.String var4 = "|";
    java.lang.Object var5 = var2.pesquisa(var4);
    java.lang.Object var6 = var1.pesquisa(var4);
    ds.TabelaHash var7 = new ds.TabelaHash();
    var7.imprime();
    java.lang.String var9 = "zh#b<nxitu";
    java.lang.Object var10 = var7.pesquisa(var9);
    java.lang.Object[] var11 = var7.recuperaItens();
    ds.TabelaHash var12 = new ds.TabelaHash();
    var12.imprime();
    java.lang.String var14 = "zh#b<nxitu";
    java.lang.Object var15 = var12.pesquisa(var14);
    java.lang.Long var16 = new java.lang.Long(1L);
    var7.insere(var14, (java.lang.Object)var16);
    var0.insere(var4, (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

}
