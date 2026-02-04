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
    ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    var1.imprime();

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(100);
    var2.insereAresta((int)var3, (int)var4, (int)var5);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.listaAdjVazia((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    boolean var2 = var0.listaAdjVazia((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.existeAresta((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(100);
    var4.insereAresta((int)var5, (int)var6, (int)var7);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    int var7 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    int var2 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var2, (int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var7.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var7.listaAdjVazia((int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var3, (int)var5, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo();
    int var6 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var3, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-863));
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    ds.Grafo.Aresta var9 = var4.primeiroListaAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    int var3 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(10);
    ds.Grafo var5 = new ds.Grafo();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    boolean var8 = var3.existeAresta((int)var4, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-863));
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    ds.Grafo var11 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    int var2 = var0.numVertices();
    ds.Grafo var3 = var0.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    int var2 = var0.numVertices();
    ds.Grafo var3 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var2.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var8.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer((-863));
    java.lang.Integer var13 = new java.lang.Integer(0);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = new ds.Grafo();
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var15.listaAdjVazia((int)var16);
    ds.Grafo var18 = new ds.Grafo();
    ds.Grafo var19 = var18.grafoTransposto();
    ds.Grafo var20 = var19.grafoTransposto();
    ds.Grafo var21 = var20.grafoTransposto();
    ds.Grafo var22 = var20.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(1);
    java.lang.Integer var24 = new java.lang.Integer((-863));
    java.lang.Integer var25 = new java.lang.Integer(0);
    var22.insereAresta((int)var23, (int)var24, (int)var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    boolean var28 = var22.listaAdjVazia((int)var27);
    var5.insereAresta((int)var13, (int)var16, (int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-863));
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var0.retiraAresta((int)var1, (int)var3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = var4.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer((-863));
    java.lang.Integer var9 = new java.lang.Integer(0);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    ds.Grafo.Aresta var11 = var1.primeiroListaAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    boolean var5 = var1.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    ds.Grafo var9 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-863));
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Grafo.Aresta var14 = var4.primeiroListaAdj((int)var13);
    ds.Grafo.Aresta var15 = var4.proxAdj((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(10);
    ds.Grafo var5 = new ds.Grafo();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var7.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer((-863));
    java.lang.Integer var12 = new java.lang.Integer(0);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var9.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var9.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(1);
    ds.Grafo.Aresta var19 = var9.primeiroListaAdj((int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var3.retiraAresta((int)var4, (int)var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo var3 = new ds.Grafo();
    ds.Grafo var4 = var3.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-863));
    java.lang.Integer var10 = new java.lang.Integer(0);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var7.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var7.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    ds.Grafo.Aresta var17 = var7.primeiroListaAdj((int)var16);
    boolean var18 = var1.existeAresta((int)var2, (int)var16);
    ds.Grafo var19 = new ds.Grafo();
    int var20 = var19.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var21 = var0.retiraAresta((int)var2, (int)var20);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    int var3 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var0.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test39() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo();
    ds.Grafo var10 = var9.grafoTransposto();
    ds.Grafo var11 = var10.grafoTransposto();
    ds.Grafo var12 = var11.grafoTransposto();
    ds.Grafo var13 = var11.grafoTransposto();
    ds.Grafo var14 = var11.grafoTransposto();
    ds.Grafo var15 = new ds.Grafo();
    ds.Grafo var16 = var15.grafoTransposto();
    ds.Grafo var17 = var16.grafoTransposto();
    ds.Grafo var18 = var17.grafoTransposto();
    ds.Grafo var19 = var17.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(1);
    java.lang.Integer var21 = new java.lang.Integer((-863));
    java.lang.Integer var22 = new java.lang.Integer(0);
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    ds.Grafo var24 = new ds.Grafo();
    ds.Grafo var25 = var24.grafoTransposto();
    ds.Grafo var26 = var25.grafoTransposto();
    ds.Grafo var27 = var26.grafoTransposto();
    ds.Grafo var28 = var26.grafoTransposto();
    java.lang.Integer var29 = new java.lang.Integer(1);
    java.lang.Integer var30 = new java.lang.Integer((-863));
    java.lang.Integer var31 = new java.lang.Integer(0);
    var28.insereAresta((int)var29, (int)var30, (int)var31);
    ds.Grafo var33 = new ds.Grafo();
    ds.Grafo var34 = var33.grafoTransposto();
    int var35 = var34.numVertices();
    var11.insereAresta((int)var20, (int)var30, (int)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var37 = var0.listaAdjVazia((int)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test41() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var4.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo();
    int var10 = var9.numVertices();
    int var11 = var9.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var3, (int)var7, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(2);
    boolean var15 = var9.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(3);
    boolean var17 = var9.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var19.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    boolean var23 = var19.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(2);
    boolean var25 = var19.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(3);
    boolean var27 = var19.listaAdjVazia((int)var26);
    ds.Grafo var28 = new ds.Grafo();
    java.lang.Integer var29 = new java.lang.Integer(1);
    ds.Grafo var30 = new ds.Grafo();
    ds.Grafo var31 = var30.grafoTransposto();
    ds.Grafo var32 = var31.grafoTransposto();
    ds.Grafo var33 = var32.grafoTransposto();
    ds.Grafo var34 = var32.grafoTransposto();
    java.lang.Integer var35 = new java.lang.Integer(1);
    java.lang.Integer var36 = new java.lang.Integer((-863));
    java.lang.Integer var37 = new java.lang.Integer(0);
    var34.insereAresta((int)var35, (int)var36, (int)var37);
    java.lang.Integer var39 = new java.lang.Integer(0);
    boolean var40 = var34.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    boolean var42 = var34.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(1);
    ds.Grafo.Aresta var44 = var34.primeiroListaAdj((int)var43);
    boolean var45 = var28.existeAresta((int)var29, (int)var43);
    var9.insereAresta((int)var18, (int)var26, (int)var43);
    ds.Grafo var47 = new ds.Grafo();
    java.lang.Integer var48 = new java.lang.Integer(0);
    boolean var49 = var47.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(1);
    boolean var51 = var47.listaAdjVazia((int)var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var52 = var0.retiraAresta((int)var43, (int)var50);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var8.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer((-863));
    java.lang.Integer var13 = new java.lang.Integer(0);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var5.retiraAresta((int)var11, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = var4.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer((-863));
    java.lang.Integer var9 = new java.lang.Integer(0);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    ds.Grafo var11 = new ds.Grafo();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var1.retiraAresta((int)var9, (int)var14);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-863));
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    ds.Grafo var11 = new ds.Grafo();
    ds.Grafo var12 = var11.grafoTransposto();
    ds.Grafo var13 = var12.grafoTransposto();
    ds.Grafo var14 = var13.grafoTransposto();
    ds.Grafo var15 = var13.grafoTransposto();
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer((-863));
    java.lang.Integer var18 = new java.lang.Integer(0);
    var15.insereAresta((int)var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var15.listaAdjVazia((int)var20);
    ds.Grafo.Aresta var22 = var4.proxAdj((int)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var8.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer((-863));
    java.lang.Integer var13 = new java.lang.Integer(0);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var10.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var10.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Grafo.Aresta var20 = var10.primeiroListaAdj((int)var19);
    boolean var21 = var5.listaAdjVazia((int)var19);
    boolean var22 = var2.listaAdjVazia((int)var19);
    boolean var23 = var0.listaAdjVazia((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

}
