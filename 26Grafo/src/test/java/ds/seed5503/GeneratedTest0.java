package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    boolean var5 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    var4.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
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

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo.Aresta var8 = var4.retiraAresta((int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo.Aresta var6 = var5.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
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

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(918);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 878);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(754);
    java.lang.Integer var4 = new java.lang.Integer((-934));
    java.lang.Integer var5 = new java.lang.Integer(238);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    boolean var7 = var2.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(754);
    java.lang.Integer var4 = new java.lang.Integer((-934));
    java.lang.Integer var5 = new java.lang.Integer(238);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var7 = var2.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(686);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(918);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(500);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(918);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(500);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(754);
    java.lang.Integer var4 = new java.lang.Integer((-934));
    java.lang.Integer var5 = new java.lang.Integer(238);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var2.retiraAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 878);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(168);
    boolean var12 = var1.listaAdjVazia((int)var11);
    ds.Grafo var13 = new ds.Grafo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(168);
    boolean var12 = var1.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(815);
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

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(815);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 815);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(815);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = new ds.Grafo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
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

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(686);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(686);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(168);
    boolean var8 = var1.listaAdjVazia((int)var7);
    boolean var9 = var1.existeAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(686);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(168);
    boolean var8 = var1.listaAdjVazia((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    boolean var7 = var5.existeAresta((int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
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

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(918);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(918);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo var9 = var5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(815);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(309);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(309);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 309);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    int var12 = var1.numVertices();
    
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
    assertTrue(var12 == 878);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    assertTrue(var3 == 878);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 878);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    ds.Grafo.Aresta var14 = var1.proxAdj((int)var12);
    
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
    assertTrue(var14 == null);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(754);
    java.lang.Integer var4 = new java.lang.Integer((-934));
    java.lang.Integer var5 = new java.lang.Integer(238);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
    ds.Grafo.Aresta var11 = var2.retiraAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(754);
    java.lang.Integer var4 = new java.lang.Integer((-934));
    java.lang.Integer var5 = new java.lang.Integer(238);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
    int var11 = var2.numVertices();
    boolean var12 = var2.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 985);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    boolean var16 = var1.existeAresta((int)var14, (int)var14);
    
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
    assertTrue(var16 == false);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 878);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    ds.Grafo var18 = new ds.Grafo(var16);
    
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

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var1.primeiroListaAdj((int)var9);
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    boolean var6 = var4.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    java.lang.Integer var16 = new java.lang.Integer(878);
    ds.Grafo var17 = new ds.Grafo(var16);
    java.lang.Integer var18 = new java.lang.Integer(100);
    boolean var19 = var1.existeAresta((int)var16, (int)var18);
    
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
    assertTrue(var19 == false);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(878);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var10.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(2);
    boolean var16 = var10.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(3);
    boolean var18 = var10.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(4);
    boolean var20 = var10.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(5);
    boolean var22 = var10.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(6);
    boolean var24 = var10.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(7);
    boolean var26 = var10.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(985);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo var29 = var28.grafoTransposto();
    java.lang.Integer var30 = new java.lang.Integer(754);
    java.lang.Integer var31 = new java.lang.Integer((-934));
    java.lang.Integer var32 = new java.lang.Integer(238);
    var29.insereAresta((int)var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(0);
    boolean var35 = var29.listaAdjVazia((int)var34);
    boolean var36 = var1.existeAresta((int)var25, (int)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(878);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var4.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(4);
    boolean var14 = var4.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(878);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    ds.Grafo var19 = var16.grafoTransposto();
    ds.Grafo var20 = var16.grafoTransposto();
    int var21 = var16.numVertices();
    ds.Grafo.Aresta var22 = var1.retiraAresta((int)var13, (int)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(878);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var6.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var6.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(3);
    boolean var14 = var6.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(4);
    boolean var16 = var6.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(5);
    boolean var18 = var6.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(6);
    boolean var20 = var6.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(7);
    boolean var22 = var6.listaAdjVazia((int)var21);
    ds.Grafo.Aresta var23 = var4.proxAdj((int)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
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
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
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
    java.lang.Integer var16 = new java.lang.Integer(985);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(754);
    java.lang.Integer var20 = new java.lang.Integer((-934));
    java.lang.Integer var21 = new java.lang.Integer(238);
    var18.insereAresta((int)var19, (int)var20, (int)var21);
    ds.Grafo.Aresta var23 = var1.proxAdj((int)var21);
    
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
    assertTrue(var23 == null);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(754);
    java.lang.Integer var4 = new java.lang.Integer((-934));
    java.lang.Integer var5 = new java.lang.Integer(238);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
    int var11 = var2.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(985);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(754);
    java.lang.Integer var16 = new java.lang.Integer((-934));
    java.lang.Integer var17 = new java.lang.Integer(238);
    var14.insereAresta((int)var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(878);
    ds.Grafo var20 = new ds.Grafo(var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    boolean var22 = var20.listaAdjVazia((int)var21);
    ds.Grafo var23 = var20.grafoTransposto();
    int var24 = var20.numVertices();
    java.lang.Integer var25 = new java.lang.Integer(0);
    boolean var26 = var20.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(985);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo var29 = var28.grafoTransposto();
    java.lang.Integer var30 = new java.lang.Integer(754);
    java.lang.Integer var31 = new java.lang.Integer((-934));
    java.lang.Integer var32 = new java.lang.Integer(238);
    var29.insereAresta((int)var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(10);
    java.lang.Integer var35 = new java.lang.Integer(878);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(0);
    boolean var38 = var36.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(1);
    boolean var40 = var36.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(2);
    boolean var42 = var36.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(3);
    boolean var44 = var36.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(4);
    boolean var46 = var36.listaAdjVazia((int)var45);
    java.lang.Integer var47 = new java.lang.Integer(5);
    boolean var48 = var36.listaAdjVazia((int)var47);
    java.lang.Integer var49 = new java.lang.Integer(6);
    boolean var50 = var36.listaAdjVazia((int)var49);
    java.lang.Integer var51 = new java.lang.Integer(7);
    boolean var52 = var36.listaAdjVazia((int)var51);
    var20.insereAresta((int)var30, (int)var34, (int)var51);
    java.lang.Integer var54 = new java.lang.Integer(878);
    ds.Grafo var55 = new ds.Grafo(var54);
    java.lang.Integer var56 = new java.lang.Integer(0);
    boolean var57 = var55.listaAdjVazia((int)var56);
    ds.Grafo var58 = var55.grafoTransposto();
    int var59 = var55.numVertices();
    java.lang.Integer var60 = new java.lang.Integer(0);
    boolean var61 = var55.listaAdjVazia((int)var60);
    java.lang.Integer var62 = new java.lang.Integer(0);
    ds.Grafo.Aresta var63 = var55.primeiroListaAdj((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(985);
    ds.Grafo var65 = new ds.Grafo(var64);
    ds.Grafo var66 = var65.grafoTransposto();
    java.lang.Integer var67 = new java.lang.Integer(754);
    java.lang.Integer var68 = new java.lang.Integer((-934));
    java.lang.Integer var69 = new java.lang.Integer(238);
    var66.insereAresta((int)var67, (int)var68, (int)var69);
    boolean var71 = var55.listaAdjVazia((int)var67);
    java.lang.Integer var72 = new java.lang.Integer(1);
    var14.insereAresta((int)var30, (int)var67, (int)var72);
    java.lang.Integer var74 = new java.lang.Integer(985);
    ds.Grafo var75 = new ds.Grafo(var74);
    ds.Grafo var76 = var75.grafoTransposto();
    java.lang.Integer var77 = new java.lang.Integer(754);
    java.lang.Integer var78 = new java.lang.Integer((-934));
    java.lang.Integer var79 = new java.lang.Integer(238);
    var76.insereAresta((int)var77, (int)var78, (int)var79);
    boolean var81 = var2.existeAresta((int)var67, (int)var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 985);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(985);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(754);
    java.lang.Integer var14 = new java.lang.Integer((-934));
    java.lang.Integer var15 = new java.lang.Integer(238);
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    boolean var17 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var18 = new java.lang.Integer(100);
    ds.Grafo.Aresta var19 = var1.proxAdj((int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(878);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    int var8 = var4.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(922);
    ds.Grafo var10 = new ds.Grafo(var9);
    boolean var11 = var1.existeAresta((int)var8, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(878);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var8.listaAdjVazia((int)var9);
    ds.Grafo var11 = var8.grafoTransposto();
    ds.Grafo var12 = var8.grafoTransposto();
    int var13 = var8.numVertices();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var8.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Grafo.Aresta var17 = var8.primeiroListaAdj((int)var16);
    boolean var18 = var1.listaAdjVazia((int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    var1.imprime();
    java.lang.Integer var11 = new java.lang.Integer(985);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(878);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var15.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var15.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(2);
    boolean var21 = var15.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(3);
    boolean var23 = var15.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(4);
    boolean var25 = var15.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(5);
    boolean var27 = var15.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(6);
    boolean var29 = var15.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(878);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(0);
    boolean var33 = var31.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(1);
    boolean var35 = var31.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(0);
    var12.insereAresta((int)var28, (int)var34, (int)var36);
    ds.Grafo.Aresta var38 = var1.proxAdj((int)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(985);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(878);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    ds.Grafo var12 = var9.grafoTransposto();
    ds.Grafo var13 = var9.grafoTransposto();
    int var14 = var9.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var9.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Grafo.Aresta var18 = var9.primeiroListaAdj((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(918);
    ds.Grafo var20 = new ds.Grafo(var19);
    boolean var21 = var7.existeAresta((int)var17, (int)var19);
    java.lang.Integer var22 = new java.lang.Integer(918);
    ds.Grafo var23 = new ds.Grafo(var22);
    ds.Grafo.Aresta var24 = var1.retiraAresta((int)var19, (int)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(985);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(878);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    ds.Grafo var7 = var3.grafoTransposto();
    int var8 = var3.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var3.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Grafo.Aresta var12 = var3.primeiroListaAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(918);
    ds.Grafo var14 = new ds.Grafo(var13);
    boolean var15 = var1.existeAresta((int)var11, (int)var13);
    ds.Grafo var16 = new ds.Grafo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(309);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(878);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(878);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(985);
    ds.Grafo var9 = new ds.Grafo(var8);
    int var10 = var9.numVertices();
    ds.Grafo.Aresta var11 = var3.retiraAresta((int)var6, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(878);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var13.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(878);
    ds.Grafo var17 = new ds.Grafo(var16);
    java.lang.Integer var18 = new java.lang.Integer(985);
    ds.Grafo var19 = new ds.Grafo(var18);
    int var20 = var19.numVertices();
    ds.Grafo.Aresta var21 = var13.retiraAresta((int)var16, (int)var20);
    boolean var22 = var1.existeAresta((int)var6, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 985);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 985);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(878);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    var1.imprime();
    java.lang.Integer var11 = new java.lang.Integer(985);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(754);
    java.lang.Integer var15 = new java.lang.Integer((-934));
    java.lang.Integer var16 = new java.lang.Integer(238);
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(878);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var19.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    boolean var23 = var19.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(2);
    boolean var25 = var19.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(3);
    boolean var27 = var19.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(4);
    boolean var29 = var19.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(5);
    boolean var31 = var19.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(6);
    boolean var33 = var19.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(7);
    boolean var35 = var19.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(878);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(0);
    boolean var39 = var37.listaAdjVazia((int)var38);
    ds.Grafo var40 = var37.grafoTransposto();
    int var41 = var37.numVertices();
    java.lang.Integer var42 = new java.lang.Integer(0);
    boolean var43 = var37.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(985);
    ds.Grafo var45 = new ds.Grafo(var44);
    ds.Grafo var46 = var45.grafoTransposto();
    java.lang.Integer var47 = new java.lang.Integer(754);
    java.lang.Integer var48 = new java.lang.Integer((-934));
    java.lang.Integer var49 = new java.lang.Integer(238);
    var46.insereAresta((int)var47, (int)var48, (int)var49);
    java.lang.Integer var51 = new java.lang.Integer(10);
    java.lang.Integer var52 = new java.lang.Integer(878);
    ds.Grafo var53 = new ds.Grafo(var52);
    java.lang.Integer var54 = new java.lang.Integer(0);
    boolean var55 = var53.listaAdjVazia((int)var54);
    java.lang.Integer var56 = new java.lang.Integer(1);
    boolean var57 = var53.listaAdjVazia((int)var56);
    java.lang.Integer var58 = new java.lang.Integer(2);
    boolean var59 = var53.listaAdjVazia((int)var58);
    java.lang.Integer var60 = new java.lang.Integer(3);
    boolean var61 = var53.listaAdjVazia((int)var60);
    java.lang.Integer var62 = new java.lang.Integer(4);
    boolean var63 = var53.listaAdjVazia((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(5);
    boolean var65 = var53.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(6);
    boolean var67 = var53.listaAdjVazia((int)var66);
    java.lang.Integer var68 = new java.lang.Integer(7);
    boolean var69 = var53.listaAdjVazia((int)var68);
    var37.insereAresta((int)var47, (int)var51, (int)var68);
    java.lang.Integer var71 = new java.lang.Integer(878);
    ds.Grafo var72 = new ds.Grafo(var71);
    java.lang.Integer var73 = new java.lang.Integer(0);
    boolean var74 = var72.listaAdjVazia((int)var73);
    ds.Grafo var75 = var72.grafoTransposto();
    ds.Grafo var76 = var72.grafoTransposto();
    int var77 = var72.numVertices();
    java.lang.Integer var78 = new java.lang.Integer(0);
    boolean var79 = var72.listaAdjVazia((int)var78);
    java.lang.Integer var80 = new java.lang.Integer(878);
    ds.Grafo var81 = new ds.Grafo(var80);
    java.lang.Integer var82 = new java.lang.Integer(0);
    boolean var83 = var81.listaAdjVazia((int)var82);
    ds.Grafo var84 = var81.grafoTransposto();
    int var85 = var81.numVertices();
    java.lang.Integer var86 = new java.lang.Integer(0);
    boolean var87 = var81.listaAdjVazia((int)var86);
    java.lang.Integer var88 = new java.lang.Integer(0);
    ds.Grafo.Aresta var89 = var81.primeiroListaAdj((int)var88);
    int var90 = var81.numVertices();
    var19.insereAresta((int)var68, (int)var78, (int)var90);
    java.lang.Integer var92 = new java.lang.Integer(878);
    ds.Grafo var93 = new ds.Grafo(var92);
    java.lang.Integer var94 = new java.lang.Integer(1);
    java.lang.Integer var95 = new java.lang.Integer(686);
    boolean var96 = var93.existeAresta((int)var94, (int)var95);
    java.lang.Integer var97 = new java.lang.Integer(0);
    boolean var98 = var93.listaAdjVazia((int)var97);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var15, (int)var68, (int)var97);
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
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 878);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);

  }

}
