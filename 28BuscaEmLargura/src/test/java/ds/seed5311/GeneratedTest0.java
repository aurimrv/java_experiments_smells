package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.listaAdjVazia((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 848);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var1.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.primeiroListaAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.primeiroListaAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    var1.insereAresta((int)var8, (int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-313));
    java.lang.Integer var4 = new java.lang.Integer((-634));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var2.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var2.primeiroListaAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(751);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(751);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    boolean var5 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var4, (int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 848);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 848);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var2.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 848);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 848);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    boolean var12 = var1.existeAresta((int)var10, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(550);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(550);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var2.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(550);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var1.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var8.retiraAresta((int)var6, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var1.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var2.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(445);
    java.lang.Integer var5 = new java.lang.Integer(927);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var1.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    boolean var14 = var1.existeAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(16);
    java.lang.Integer var5 = new java.lang.Integer((-712));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var2.existeAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-313));
    java.lang.Integer var4 = new java.lang.Integer((-634));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer((-594));
    ds.Grafo.Aresta var8 = var1.retiraAresta((int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.existeAresta((int)var7, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(445);
    java.lang.Integer var5 = new java.lang.Integer(927);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    ds.Grafo var9 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 618);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.listaAdjVazia((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 618);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(751);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    ds.Grafo var16 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(7);
    boolean var17 = var1.listaAdjVazia((int)var16);
    ds.Grafo var18 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(445);
    java.lang.Integer var5 = new java.lang.Integer(927);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 618);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(751);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 751);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    int var10 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var8.existeAresta((int)var10, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 618);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 618);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(16);
    java.lang.Integer var5 = new java.lang.Integer((-712));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    ds.Grafo var9 = var2.grafoTransposto();

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(616);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var5.retiraAresta((int)var8, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var3.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    int var10 = var8.numVertices();
    int var11 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var8.listaAdjVazia((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 618);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 618);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 618);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    int var10 = var8.numVertices();
    int var11 = var8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 618);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 618);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 618);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var2.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 618);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 618);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-313));
    java.lang.Integer var4 = new java.lang.Integer((-634));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var6 = var1.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var10.existeAresta((int)var8, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(235);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo.Aresta var5 = var4.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(7);
    boolean var17 = var1.listaAdjVazia((int)var16);
    ds.Grafo var18 = var1.grafoTransposto();
    int var19 = var18.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertTrue(var19 == 618);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    ds.Grafo var12 = var1.grafoTransposto();
    ds.Grafo var13 = new ds.Grafo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    ds.Grafo var12 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(895);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(895);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.primeiroListaAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(7);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(8);
    boolean var19 = var1.listaAdjVazia((int)var18);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertTrue(var19 == true);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    ds.Grafo.Aresta var11 = var10.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var4.proxAdj((int)var10);
    ds.Grafo var12 = new ds.Grafo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(16);
    java.lang.Integer var5 = new java.lang.Integer((-712));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    var7.imprime();

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(16);
    java.lang.Integer var5 = new java.lang.Integer((-712));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(895);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var1.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var4.proxAdj((int)var10);
    int var12 = var4.numVertices();
    ds.Grafo var13 = new ds.Grafo(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 848);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(7);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(8);
    boolean var19 = var1.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(9);
    boolean var21 = var1.listaAdjVazia((int)var20);
    var1.insereAresta((int)var20, (int)var20, (int)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(16);
    java.lang.Integer var4 = new java.lang.Integer((-712));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 618);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    ds.Grafo.Aresta var9 = var8.proxAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var4.proxAdj((int)var10);
    int var12 = var4.numVertices();
    int var13 = var4.numVertices();
    ds.Grafo var14 = var5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 848);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var1.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 987);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(16);
    java.lang.Integer var5 = new java.lang.Integer((-712));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    int var9 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 618);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(16);
    java.lang.Integer var4 = new java.lang.Integer((-712));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(895);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.existeAresta((int)var6, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(848);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    int var13 = var12.numVertices();
    ds.Grafo var14 = var12.grafoTransposto();
    ds.Grafo var15 = var14.grafoTransposto();
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer(16);
    java.lang.Integer var18 = new java.lang.Integer((-712));
    var14.insereAresta((int)var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Grafo.Aresta var21 = var14.proxAdj((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(900);
    ds.Grafo var23 = new ds.Grafo(var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    java.lang.Integer var25 = new java.lang.Integer((-313));
    java.lang.Integer var26 = new java.lang.Integer((-634));
    var23.insereAresta((int)var24, (int)var25, (int)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var28 = var8.retiraAresta((int)var20, (int)var26);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 618);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 848);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    java.lang.Integer var4 = new java.lang.Integer(232);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(618);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var7.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var7.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(2);
    boolean var13 = var7.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(3);
    boolean var15 = var7.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(235);
    ds.Grafo var17 = new ds.Grafo(var16);
    var1.insereAresta((int)var4, (int)var14, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var1 = new ds.Grafo(var0);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(445);
    java.lang.Integer var5 = new java.lang.Integer(927);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(618);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(16);
    java.lang.Integer var14 = new java.lang.Integer((-712));
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Grafo.Aresta var17 = var11.proxAdj((int)var16);
    int var18 = var11.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var8.proxAdj((int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 618);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(618);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(16);
    java.lang.Integer var16 = new java.lang.Integer((-712));
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    ds.Grafo.Aresta var19 = var13.proxAdj((int)var18);
    boolean var20 = var4.listaAdjVazia((int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(235);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(550);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(618);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(16);
    java.lang.Integer var6 = new java.lang.Integer((-712));
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(848);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var10.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(848);
    ds.Grafo var13 = new ds.Grafo(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var6, (int)var11, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 848);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(895);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 895);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(616);
    ds.Grafo var11 = new ds.Grafo(var10);
    boolean var12 = var1.listaAdjVazia((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(445);
    java.lang.Integer var5 = new java.lang.Integer(927);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    ds.Grafo var8 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 618);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(445);
    java.lang.Integer var5 = new java.lang.Integer(927);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(848);
    ds.Grafo var10 = new ds.Grafo(var9);
    int var11 = var10.numVertices();
    int var12 = var10.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(618);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var14.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var14.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(2);
    boolean var20 = var14.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(3);
    boolean var22 = var14.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(4);
    boolean var24 = var14.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(5);
    boolean var26 = var14.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(6);
    boolean var28 = var14.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(7);
    boolean var30 = var14.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(618);
    ds.Grafo var32 = new ds.Grafo(var31);
    java.lang.Integer var33 = new java.lang.Integer(0);
    ds.Grafo.Aresta var34 = var32.proxAdj((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(445);
    java.lang.Integer var36 = new java.lang.Integer(927);
    boolean var37 = var32.existeAresta((int)var35, (int)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var12, (int)var29, (int)var36);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var2.retiraAresta((int)var3, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    int var16 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 618);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(16);
    java.lang.Integer var5 = new java.lang.Integer((-712));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(895);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(232);
    ds.Grafo var12 = new ds.Grafo(var11);
    int var13 = var12.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var2.retiraAresta((int)var9, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 232);

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(848);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    ds.Grafo var7 = var5.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(16);
    java.lang.Integer var11 = new java.lang.Integer((-712));
    var7.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    ds.Grafo.Aresta var14 = var7.proxAdj((int)var13);
    int var15 = var7.numVertices();
    int var16 = var7.numVertices();
    java.lang.Integer var17 = new java.lang.Integer(618);
    ds.Grafo var18 = new ds.Grafo(var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var18.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    boolean var22 = var18.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(2);
    boolean var24 = var18.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(3);
    boolean var26 = var18.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(4);
    boolean var28 = var18.listaAdjVazia((int)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var29 = var2.existeAresta((int)var16, (int)var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(16);
    java.lang.Integer var8 = new java.lang.Integer((-712));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 848);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(550);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(900);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    var4.imprime();
    java.lang.Integer var7 = new java.lang.Integer(618);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(16);
    java.lang.Integer var12 = new java.lang.Integer((-712));
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(895);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(751);
    ds.Grafo var17 = new ds.Grafo(var16);
    int var18 = var17.numVertices();
    var4.insereAresta((int)var11, (int)var14, (int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var1.retiraAresta((int)var2, (int)var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 751);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(616);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(848);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    ds.Grafo var7 = var5.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(16);
    java.lang.Integer var11 = new java.lang.Integer((-712));
    var7.insereAresta((int)var9, (int)var10, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.listaAdjVazia((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 848);

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(5);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(6);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(7);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(8);
    boolean var19 = var1.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(9);
    boolean var21 = var1.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(618);
    ds.Grafo var23 = new ds.Grafo(var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    java.lang.Integer var25 = new java.lang.Integer(16);
    java.lang.Integer var26 = new java.lang.Integer((-712));
    var23.insereAresta((int)var24, (int)var25, (int)var26);
    java.lang.Integer var28 = new java.lang.Integer(895);
    ds.Grafo var29 = new ds.Grafo(var28);
    java.lang.Integer var30 = new java.lang.Integer(618);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(0);
    ds.Grafo.Aresta var33 = var31.proxAdj((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(445);
    java.lang.Integer var35 = new java.lang.Integer(927);
    boolean var36 = var31.existeAresta((int)var34, (int)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var26, (int)var28, (int)var35);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(900);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-313));
    java.lang.Integer var6 = new java.lang.Integer((-634));
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-594));
    ds.Grafo.Aresta var10 = var3.retiraAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var1.retiraAresta((int)var8, (int)var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(232);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo.Aresta var8 = var4.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(900);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = var4.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(900);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    var8.imprime();
    java.lang.Integer var11 = new java.lang.Integer(618);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(16);
    java.lang.Integer var16 = new java.lang.Integer((-712));
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(895);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(751);
    ds.Grafo var21 = new ds.Grafo(var20);
    int var22 = var21.numVertices();
    var8.insereAresta((int)var15, (int)var18, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(751);
    ds.Grafo var25 = new ds.Grafo(var24);
    int var26 = var25.numVertices();
    java.lang.Integer var27 = new java.lang.Integer(618);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo var29 = var28.grafoTransposto();
    java.lang.Integer var30 = new java.lang.Integer(0);
    java.lang.Integer var31 = new java.lang.Integer(16);
    java.lang.Integer var32 = new java.lang.Integer((-712));
    var29.insereAresta((int)var30, (int)var31, (int)var32);
    var4.insereAresta((int)var22, (int)var26, (int)var30);
    ds.Grafo.Aresta var35 = var1.primeiroListaAdj((int)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 751);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 751);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(618);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var6.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var6.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var1.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(751);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(900);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-313));
    java.lang.Integer var6 = new java.lang.Integer((-634));
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(618);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(2);
    boolean var15 = var9.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(3);
    boolean var17 = var9.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(4);
    boolean var19 = var9.listaAdjVazia((int)var18);
    boolean var20 = var1.existeAresta((int)var4, (int)var18);
    java.lang.Integer var21 = new java.lang.Integer(987);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(618);
    ds.Grafo var24 = new ds.Grafo(var23);
    java.lang.Integer var25 = new java.lang.Integer(0);
    java.lang.Integer var26 = new java.lang.Integer(16);
    java.lang.Integer var27 = new java.lang.Integer((-712));
    var24.insereAresta((int)var25, (int)var26, (int)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var29 = var1.retiraAresta((int)var21, (int)var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(550);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(618);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(16);
    java.lang.Integer var7 = new java.lang.Integer((-712));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(618);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    var10.imprime();
    java.lang.Integer var13 = new java.lang.Integer(618);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Grafo.Aresta var16 = var14.proxAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(848);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    int var20 = var19.numVertices();
    ds.Grafo var21 = var19.grafoTransposto();
    ds.Grafo var22 = var21.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer(16);
    java.lang.Integer var25 = new java.lang.Integer((-712));
    var21.insereAresta((int)var23, (int)var24, (int)var25);
    boolean var27 = var10.existeAresta((int)var15, (int)var23);
    java.lang.Integer var28 = new java.lang.Integer(618);
    ds.Grafo var29 = new ds.Grafo(var28);
    java.lang.Integer var30 = new java.lang.Integer(0);
    boolean var31 = var29.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(1);
    boolean var33 = var29.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(2);
    boolean var35 = var29.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(3);
    boolean var37 = var29.listaAdjVazia((int)var36);
    java.lang.Integer var38 = new java.lang.Integer(4);
    boolean var39 = var29.listaAdjVazia((int)var38);
    java.lang.Integer var40 = new java.lang.Integer(5);
    boolean var41 = var29.listaAdjVazia((int)var40);
    java.lang.Integer var42 = new java.lang.Integer(6);
    boolean var43 = var29.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(7);
    boolean var45 = var29.listaAdjVazia((int)var44);
    java.lang.Integer var46 = new java.lang.Integer(8);
    boolean var47 = var29.listaAdjVazia((int)var46);
    var1.insereAresta((int)var6, (int)var23, (int)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(987);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(616);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(100);
    var1.insereAresta((int)var2, (int)var3, (int)var5);

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    java.lang.Integer var4 = new java.lang.Integer(618);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(16);
    java.lang.Integer var9 = new java.lang.Integer((-712));
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(895);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(751);
    ds.Grafo var14 = new ds.Grafo(var13);
    int var15 = var14.numVertices();
    var1.insereAresta((int)var8, (int)var11, (int)var15);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 751);

  }

  public void test125() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test126() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(618);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(848);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    int var8 = var7.numVertices();
    ds.Grafo var9 = var7.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(16);
    java.lang.Integer var13 = new java.lang.Integer((-712));
    var9.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(618);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Grafo.Aresta var18 = var16.proxAdj((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(445);
    java.lang.Integer var20 = new java.lang.Integer(927);
    boolean var21 = var16.existeAresta((int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(751);
    ds.Grafo var23 = new ds.Grafo(var22);
    int var24 = var23.numVertices();
    var4.insereAresta((int)var11, (int)var19, (int)var24);
    ds.Grafo var26 = new ds.Grafo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 751);

  }

  public void test127() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(848);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(618);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(848);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var10.numVertices();
    ds.Grafo var12 = var10.grafoTransposto();
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(16);
    java.lang.Integer var16 = new java.lang.Integer((-712));
    var12.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(618);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Grafo.Aresta var21 = var19.proxAdj((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(445);
    java.lang.Integer var23 = new java.lang.Integer(927);
    boolean var24 = var19.existeAresta((int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(751);
    ds.Grafo var26 = new ds.Grafo(var25);
    int var27 = var26.numVertices();
    var7.insereAresta((int)var14, (int)var22, (int)var27);
    java.lang.Integer var29 = new java.lang.Integer(900);
    ds.Grafo var30 = new ds.Grafo(var29);
    java.lang.Integer var31 = new java.lang.Integer(1);
    java.lang.Integer var32 = new java.lang.Integer((-313));
    java.lang.Integer var33 = new java.lang.Integer((-634));
    var30.insereAresta((int)var31, (int)var32, (int)var33);
    java.lang.Integer var35 = new java.lang.Integer(1);
    java.lang.Integer var36 = new java.lang.Integer((-594));
    ds.Grafo.Aresta var37 = var30.retiraAresta((int)var35, (int)var36);
    java.lang.Integer var38 = new java.lang.Integer(235);
    ds.Grafo var39 = new ds.Grafo(var38);
    var2.insereAresta((int)var22, (int)var36, (int)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 848);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 751);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);

  }

}
