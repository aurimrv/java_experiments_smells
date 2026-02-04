package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(13);
    ds.Aresta var4 = var0.proxAdj((int)var3);
    boolean var5 = var0.existeAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(13);
    ds.Aresta var4 = var0.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    boolean var4 = var3.existeAresta((int)var1, (int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    boolean var4 = var0.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(100);
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var3.primeiroListaAdj((int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var6 = var1.retiraAresta((int)var2, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var0.existeAresta((int)var4, (int)var5);
    var3.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(13);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    boolean var6 = var3.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var0.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(13);
    ds.Aresta var8 = var0.proxAdj((int)var7);
    boolean var9 = var3.listaAdjVazia((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    ds.Aresta var9 = var0.retiraAresta((int)var6, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(13);
    ds.Aresta var6 = var1.proxAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Aresta var9 = var7.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(13);
    ds.Aresta var11 = var7.proxAdj((int)var10);
    ds.Grafo var12 = new ds.Grafo();
    java.lang.Integer var13 = new java.lang.Integer(0);
    ds.Aresta var14 = var12.primeiroListaAdj((int)var13);
    ds.Grafo var15 = var12.grafoTransposto();
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var12.existeAresta((int)var16, (int)var17);
    var0.insereAresta((int)var5, (int)var10, (int)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var4.primeiroListaAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Aresta var9 = var7.primeiroListaAdj((int)var8);
    var0.insereAresta((int)var2, (int)var5, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var3.existeAresta((int)var4, (int)var5);
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var4.primeiroListaAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var7.existeAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var9, (int)var11, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    var1.imprime();

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var4.primeiroListaAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var7.existeAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(10);
    java.lang.Integer var12 = new java.lang.Integer(10);
    boolean var13 = var7.existeAresta((int)var11, (int)var12);
    ds.Aresta var14 = var0.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var2.primeiroListaAdj((int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var5 = var0.retiraAresta((int)var1, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var3.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Aresta var9 = var7.primeiroListaAdj((int)var8);
    ds.Grafo var10 = var7.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var7.existeAresta((int)var11, (int)var12);
    ds.Aresta var14 = var3.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var3.listaAdjVazia((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var4.primeiroListaAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(13);
    ds.Aresta var9 = var4.proxAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(10);
    boolean var11 = var0.existeAresta((int)var8, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var4.primeiroListaAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(10);
    ds.Grafo var9 = new ds.Grafo();
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Aresta var11 = var9.primeiroListaAdj((int)var10);
    ds.Grafo var12 = var9.grafoTransposto();
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(0);
    ds.Aresta var15 = var13.primeiroListaAdj((int)var14);
    ds.Grafo var16 = var13.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var13.existeAresta((int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(13);
    ds.Aresta var21 = var13.proxAdj((int)var20);
    ds.Grafo var22 = new ds.Grafo();
    java.lang.Integer var23 = new java.lang.Integer(0);
    ds.Aresta var24 = var22.primeiroListaAdj((int)var23);
    ds.Grafo var25 = var22.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer(1);
    boolean var28 = var22.existeAresta((int)var26, (int)var27);
    java.lang.Integer var29 = new java.lang.Integer(13);
    ds.Aresta var30 = var22.proxAdj((int)var29);
    ds.Aresta var31 = var12.retiraAresta((int)var20, (int)var29);
    boolean var32 = var7.existeAresta((int)var8, (int)var20);
    ds.Grafo var33 = new ds.Grafo();
    java.lang.Integer var34 = new java.lang.Integer(0);
    ds.Aresta var35 = var33.primeiroListaAdj((int)var34);
    ds.Grafo var36 = var33.grafoTransposto();
    java.lang.Integer var37 = new java.lang.Integer(0);
    java.lang.Integer var38 = new java.lang.Integer(1);
    boolean var39 = var36.existeAresta((int)var37, (int)var38);
    java.lang.Integer var40 = new java.lang.Integer(10);
    java.lang.Integer var41 = new java.lang.Integer(10);
    boolean var42 = var36.existeAresta((int)var40, (int)var41);
    ds.Aresta var43 = var3.retiraAresta((int)var20, (int)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == null);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var3.listaAdjVazia((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Aresta var9 = var7.primeiroListaAdj((int)var8);
    ds.Grafo var10 = var7.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var7.existeAresta((int)var11, (int)var12);
    ds.Aresta var14 = var6.proxAdj((int)var11);
    ds.Grafo var15 = new ds.Grafo();
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Aresta var17 = var15.primeiroListaAdj((int)var16);
    ds.Grafo var18 = var15.grafoTransposto();
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Aresta var21 = var19.primeiroListaAdj((int)var20);
    ds.Grafo var22 = var19.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(13);
    ds.Aresta var24 = var19.proxAdj((int)var23);
    ds.Grafo var25 = new ds.Grafo();
    java.lang.Integer var26 = new java.lang.Integer(0);
    ds.Aresta var27 = var25.primeiroListaAdj((int)var26);
    ds.Grafo var28 = var25.grafoTransposto();
    java.lang.Integer var29 = new java.lang.Integer(0);
    java.lang.Integer var30 = new java.lang.Integer(1);
    boolean var31 = var25.existeAresta((int)var29, (int)var30);
    boolean var32 = var18.existeAresta((int)var23, (int)var30);
    boolean var33 = var6.listaAdjVazia((int)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

}
