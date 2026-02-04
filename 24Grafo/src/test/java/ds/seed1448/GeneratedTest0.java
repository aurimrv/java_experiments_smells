package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    var0.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    ds.Aresta var6 = var0.retiraAresta((int)var1, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    var0.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    boolean var6 = var0.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    var0.insereAresta((int)var7, (int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var0.listaAdjVazia((int)var11);
    ds.Aresta var13 = var0.retiraAresta((int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var6 = var5.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Aresta var5 = var0.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(65);
    java.lang.Integer var4 = new java.lang.Integer(398);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    ds.Aresta var14 = var0.proxAdj((int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    boolean var12 = var11.existeAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var5 = var0.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Aresta var7 = var6.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    ds.Grafo var6 = var0.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Aresta var8 = var6.primeiroListaAdj((int)var7);
    ds.Aresta var9 = var6.retiraAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    var5.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var7 = var5.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    var5.imprime();

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var0.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(4);
    boolean var14 = var0.listaAdjVazia((int)var13);
    ds.Aresta var15 = var0.retiraAresta((int)var13, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    ds.Aresta var14 = var11.proxAdj((int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    ds.Aresta var16 = var11.retiraAresta((int)var14, (int)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(65);
    java.lang.Integer var4 = new java.lang.Integer(398);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    ds.Aresta var12 = var0.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(65);
    java.lang.Integer var4 = new java.lang.Integer(398);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(65);
    java.lang.Integer var9 = new java.lang.Integer(398);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var6.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var6.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(2);
    boolean var16 = var6.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(3);
    boolean var18 = var6.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(4);
    boolean var20 = var6.listaAdjVazia((int)var19);
    ds.Aresta var21 = var0.retiraAresta((int)var3, (int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(65);
    java.lang.Integer var5 = new java.lang.Integer(398);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Aresta var7 = var1.primeiroListaAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var0.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(4);
    boolean var14 = var0.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(5);
    boolean var16 = var0.listaAdjVazia((int)var15);
    ds.Aresta var17 = var0.primeiroListaAdj((int)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(65);
    java.lang.Integer var4 = new java.lang.Integer(398);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var0.existeAresta((int)var16, (int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(65);
    java.lang.Integer var5 = new java.lang.Integer(398);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.existeAresta((int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(65);
    java.lang.Integer var9 = new java.lang.Integer(398);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var6.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var6.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(2);
    boolean var16 = var6.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(3);
    boolean var18 = var6.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(4);
    boolean var20 = var6.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(5);
    boolean var22 = var6.listaAdjVazia((int)var21);
    var0.insereAresta((int)var1, (int)var3, (int)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(65);
    java.lang.Integer var5 = new java.lang.Integer(398);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var7.existeAresta((int)var8, (int)var9);
    var0.insereAresta((int)var1, (int)var4, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var11.listaAdjVazia((int)var16);
    ds.Grafo var18 = var11.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var11.listaAdjVazia((int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var4 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var3 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    ds.Grafo var12 = new ds.Grafo();
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(65);
    java.lang.Integer var15 = new java.lang.Integer(398);
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    ds.Grafo var17 = new ds.Grafo();
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer(65);
    java.lang.Integer var20 = new java.lang.Integer(398);
    var17.insereAresta((int)var18, (int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var17.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    boolean var25 = var17.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(2);
    boolean var27 = var17.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(3);
    boolean var29 = var17.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(4);
    boolean var31 = var17.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(5);
    boolean var33 = var17.listaAdjVazia((int)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var34 = var0.retiraAresta((int)var15, (int)var32);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(65);
    java.lang.Integer var7 = new java.lang.Integer(398);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    ds.Grafo var9 = var4.grafoTransposto();
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(65);
    java.lang.Integer var13 = new java.lang.Integer(398);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var10.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var10.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(2);
    boolean var20 = var10.listaAdjVazia((int)var19);
    ds.Grafo var21 = new ds.Grafo();
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(65);
    java.lang.Integer var24 = new java.lang.Integer(398);
    var21.insereAresta((int)var22, (int)var23, (int)var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    boolean var27 = var21.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(1);
    boolean var29 = var21.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(2);
    boolean var31 = var21.listaAdjVazia((int)var30);
    ds.Grafo var32 = var21.grafoTransposto();
    java.lang.Integer var33 = new java.lang.Integer(0);
    boolean var34 = var32.listaAdjVazia((int)var33);
    ds.Grafo var35 = new ds.Grafo();
    java.lang.Integer var36 = new java.lang.Integer(0);
    java.lang.Integer var37 = new java.lang.Integer(65);
    java.lang.Integer var38 = new java.lang.Integer(398);
    var35.insereAresta((int)var36, (int)var37, (int)var38);
    java.lang.Integer var40 = new java.lang.Integer(0);
    boolean var41 = var35.listaAdjVazia((int)var40);
    boolean var42 = var10.existeAresta((int)var33, (int)var40);
    ds.Aresta var43 = var9.proxAdj((int)var40);
    ds.Aresta var44 = var0.primeiroListaAdj((int)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == null);

  }

  public void test39() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(65);
    java.lang.Integer var9 = new java.lang.Integer(398);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var6.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var6.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(10);
    ds.Aresta var16 = var5.retiraAresta((int)var13, (int)var15);
    ds.Grafo var17 = new ds.Grafo();
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer(1);
    boolean var20 = var17.existeAresta((int)var18, (int)var19);
    ds.Aresta var21 = var5.primeiroListaAdj((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(65);
    java.lang.Integer var10 = new java.lang.Integer(398);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    boolean var12 = var0.listaAdjVazia((int)var9);
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(65);
    java.lang.Integer var16 = new java.lang.Integer(398);
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var13.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var13.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(2);
    boolean var23 = var13.listaAdjVazia((int)var22);
    ds.Grafo var24 = var13.grafoTransposto();
    java.lang.Integer var25 = new java.lang.Integer(0);
    boolean var26 = var24.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(1);
    boolean var28 = var24.listaAdjVazia((int)var27);
    ds.Grafo var29 = new ds.Grafo();
    java.lang.Integer var30 = new java.lang.Integer(0);
    java.lang.Integer var31 = new java.lang.Integer(1);
    boolean var32 = var29.existeAresta((int)var30, (int)var31);
    java.lang.Integer var33 = new java.lang.Integer(0);
    ds.Aresta var34 = var29.proxAdj((int)var33);
    ds.Aresta var35 = var0.retiraAresta((int)var27, (int)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test41() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var0.listaAdjVazia((int)var11);
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(65);
    java.lang.Integer var16 = new java.lang.Integer(398);
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var13.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var13.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(2);
    boolean var23 = var13.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(3);
    boolean var25 = var13.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(4);
    boolean var27 = var13.listaAdjVazia((int)var26);
    ds.Grafo var28 = new ds.Grafo();
    ds.Grafo var29 = new ds.Grafo();
    java.lang.Integer var30 = new java.lang.Integer(0);
    java.lang.Integer var31 = new java.lang.Integer(65);
    java.lang.Integer var32 = new java.lang.Integer(398);
    var29.insereAresta((int)var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(0);
    boolean var35 = var29.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(1);
    boolean var37 = var29.listaAdjVazia((int)var36);
    java.lang.Integer var38 = new java.lang.Integer(2);
    boolean var39 = var29.listaAdjVazia((int)var38);
    ds.Grafo var40 = var29.grafoTransposto();
    java.lang.Integer var41 = new java.lang.Integer(0);
    boolean var42 = var40.listaAdjVazia((int)var41);
    ds.Aresta var43 = var28.primeiroListaAdj((int)var41);
    ds.Grafo var44 = new ds.Grafo();
    java.lang.Integer var45 = new java.lang.Integer(0);
    java.lang.Integer var46 = new java.lang.Integer(65);
    java.lang.Integer var47 = new java.lang.Integer(398);
    var44.insereAresta((int)var45, (int)var46, (int)var47);
    var0.insereAresta((int)var26, (int)var41, (int)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == null);

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(65);
    java.lang.Integer var4 = new java.lang.Integer(398);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    ds.Grafo var12 = var1.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var12.listaAdjVazia((int)var13);
    ds.Aresta var15 = var0.primeiroListaAdj((int)var13);
    ds.Grafo var16 = new ds.Grafo();
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(65);
    java.lang.Integer var19 = new java.lang.Integer(398);
    var16.insereAresta((int)var17, (int)var18, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var21 = var0.primeiroListaAdj((int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    ds.Grafo var16 = var11.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    ds.Grafo var12 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var0.listaAdjVazia((int)var11);
    ds.Grafo var13 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    java.lang.Integer var3 = new java.lang.Integer(398);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = var0.grafoTransposto();
    ds.Grafo var12 = new ds.Grafo();
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(65);
    java.lang.Integer var15 = new java.lang.Integer(398);
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    ds.Grafo var17 = var12.grafoTransposto();
    ds.Grafo var18 = new ds.Grafo();
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var18.existeAresta((int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    ds.Grafo var23 = new ds.Grafo();
    java.lang.Integer var24 = new java.lang.Integer(0);
    java.lang.Integer var25 = new java.lang.Integer(65);
    java.lang.Integer var26 = new java.lang.Integer(398);
    var23.insereAresta((int)var24, (int)var25, (int)var26);
    java.lang.Integer var28 = new java.lang.Integer(0);
    boolean var29 = var23.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(1);
    boolean var31 = var23.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(2);
    boolean var33 = var23.listaAdjVazia((int)var32);
    ds.Grafo var34 = new ds.Grafo();
    java.lang.Integer var35 = new java.lang.Integer(0);
    java.lang.Integer var36 = new java.lang.Integer(65);
    java.lang.Integer var37 = new java.lang.Integer(398);
    var34.insereAresta((int)var35, (int)var36, (int)var37);
    java.lang.Integer var39 = new java.lang.Integer(0);
    boolean var40 = var34.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    boolean var42 = var34.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(2);
    boolean var44 = var34.listaAdjVazia((int)var43);
    ds.Grafo var45 = var34.grafoTransposto();
    java.lang.Integer var46 = new java.lang.Integer(0);
    boolean var47 = var45.listaAdjVazia((int)var46);
    ds.Grafo var48 = new ds.Grafo();
    java.lang.Integer var49 = new java.lang.Integer(0);
    java.lang.Integer var50 = new java.lang.Integer(65);
    java.lang.Integer var51 = new java.lang.Integer(398);
    var48.insereAresta((int)var49, (int)var50, (int)var51);
    java.lang.Integer var53 = new java.lang.Integer(0);
    boolean var54 = var48.listaAdjVazia((int)var53);
    boolean var55 = var23.existeAresta((int)var46, (int)var53);
    var17.insereAresta((int)var19, (int)var22, (int)var46);
    ds.Aresta var57 = var11.primeiroListaAdj((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(65);
    java.lang.Integer var6 = new java.lang.Integer(398);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var3.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(2);
    boolean var13 = var3.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(3);
    boolean var15 = var3.listaAdjVazia((int)var14);
    ds.Grafo var16 = new ds.Grafo();
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(65);
    java.lang.Integer var19 = new java.lang.Integer(398);
    var16.insereAresta((int)var17, (int)var18, (int)var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    boolean var22 = var16.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(1);
    boolean var24 = var16.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(2);
    boolean var26 = var16.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(1);
    ds.Grafo var28 = new ds.Grafo();
    java.lang.Integer var29 = new java.lang.Integer(0);
    java.lang.Integer var30 = new java.lang.Integer(65);
    java.lang.Integer var31 = new java.lang.Integer(398);
    var28.insereAresta((int)var29, (int)var30, (int)var31);
    java.lang.Integer var33 = new java.lang.Integer(0);
    boolean var34 = var28.listaAdjVazia((int)var33);
    ds.Grafo var35 = new ds.Grafo();
    java.lang.Integer var36 = new java.lang.Integer(0);
    java.lang.Integer var37 = new java.lang.Integer(65);
    java.lang.Integer var38 = new java.lang.Integer(398);
    var35.insereAresta((int)var36, (int)var37, (int)var38);
    ds.Grafo var40 = var35.grafoTransposto();
    ds.Grafo var41 = new ds.Grafo();
    java.lang.Integer var42 = new java.lang.Integer(0);
    java.lang.Integer var43 = new java.lang.Integer(65);
    java.lang.Integer var44 = new java.lang.Integer(398);
    var41.insereAresta((int)var42, (int)var43, (int)var44);
    java.lang.Integer var46 = new java.lang.Integer(0);
    boolean var47 = var41.listaAdjVazia((int)var46);
    java.lang.Integer var48 = new java.lang.Integer(1);
    boolean var49 = var41.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(10);
    ds.Aresta var51 = var40.retiraAresta((int)var48, (int)var50);
    var16.insereAresta((int)var27, (int)var33, (int)var50);
    ds.Grafo var53 = new ds.Grafo();
    java.lang.Integer var54 = new java.lang.Integer(0);
    java.lang.Integer var55 = new java.lang.Integer(65);
    java.lang.Integer var56 = new java.lang.Integer(398);
    var53.insereAresta((int)var54, (int)var55, (int)var56);
    java.lang.Integer var58 = new java.lang.Integer(0);
    boolean var59 = var53.listaAdjVazia((int)var58);
    java.lang.Integer var60 = new java.lang.Integer(1);
    boolean var61 = var53.listaAdjVazia((int)var60);
    ds.Grafo var62 = new ds.Grafo();
    java.lang.Integer var63 = new java.lang.Integer(0);
    java.lang.Integer var64 = new java.lang.Integer(1);
    boolean var65 = var62.existeAresta((int)var63, (int)var64);
    java.lang.Integer var66 = new java.lang.Integer(0);
    ds.Aresta var67 = var62.proxAdj((int)var66);
    ds.Grafo var68 = var62.grafoTransposto();
    java.lang.Integer var69 = new java.lang.Integer(0);
    ds.Aresta var70 = var68.primeiroListaAdj((int)var69);
    ds.Grafo var71 = new ds.Grafo();
    java.lang.Integer var72 = new java.lang.Integer(0);
    java.lang.Integer var73 = new java.lang.Integer(1);
    boolean var74 = var71.existeAresta((int)var72, (int)var73);
    java.lang.Integer var75 = new java.lang.Integer(0);
    ds.Aresta var76 = var71.proxAdj((int)var75);
    ds.Grafo var77 = var71.grafoTransposto();
    java.lang.Integer var78 = new java.lang.Integer(0);
    ds.Aresta var79 = var77.primeiroListaAdj((int)var78);
    ds.Aresta var80 = var53.retiraAresta((int)var69, (int)var78);
    var1.insereAresta((int)var14, (int)var33, (int)var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == null);

  }

}
