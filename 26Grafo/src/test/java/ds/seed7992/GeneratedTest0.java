package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    boolean var5 = var3.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 264);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(968);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var3.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(968);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 304);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
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

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    boolean var10 = var3.existeAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(968);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(968);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    int var5 = var1.numVertices();
    ds.Grafo var6 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4499);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(968);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

    java.lang.Integer var0 = new java.lang.Integer(4501);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4501);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    int var8 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 245);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo.Aresta var7 = var6.retiraAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var3.primeiroListaAdj((int)var10);
    var3.insereAresta((int)var10, (int)var10, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 264);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var3.primeiroListaAdj((int)var10);
    int var12 = var3.numVertices();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 264);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var3.primeiroListaAdj((int)var10);
    int var12 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 264);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 264);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 939);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4501);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    boolean var4 = var3.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
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

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4501);
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

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4501);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(968);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo var7 = var1.grafoTransposto();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 939);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 304);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var10 = var3.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    boolean var6 = var1.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(829);
    java.lang.Integer var6 = new java.lang.Integer((-448));
    java.lang.Integer var7 = new java.lang.Integer(626);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    int var9 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo.Aresta var4 = var2.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(829);
    java.lang.Integer var6 = new java.lang.Integer((-448));
    java.lang.Integer var7 = new java.lang.Integer(626);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    int var11 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(829);
    java.lang.Integer var6 = new java.lang.Integer((-448));
    java.lang.Integer var7 = new java.lang.Integer(626);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var4.primeiroListaAdj((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 304);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var2.retiraAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
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
    ds.Grafo var12 = new ds.Grafo(var10);
    
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

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    var2.insereAresta((int)var7, (int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    boolean var11 = var2.existeAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo.Aresta var4 = var2.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 245);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo.Aresta var4 = var2.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(968);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
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

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var1.proxAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(968);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(780);
    java.lang.Integer var3 = new java.lang.Integer((-321));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(780);
    java.lang.Integer var3 = new java.lang.Integer((-321));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(115);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var1.retiraAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
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

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4501);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var2.retiraAresta((int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(4499);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(968);
    ds.Grafo.Aresta var8 = var5.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(939);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(780);
    java.lang.Integer var12 = new java.lang.Integer((-321));
    boolean var13 = var10.existeAresta((int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(115);
    boolean var15 = var10.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(939);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var18.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    boolean var22 = var18.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(2);
    boolean var24 = var18.listaAdjVazia((int)var23);
    var2.insereAresta((int)var7, (int)var14, (int)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(829);
    java.lang.Integer var5 = new java.lang.Integer((-448));
    java.lang.Integer var6 = new java.lang.Integer(626);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(4501);
    ds.Grafo var11 = new ds.Grafo(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var3.proxAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(264);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    ds.Grafo var6 = var4.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(829);
    java.lang.Integer var8 = new java.lang.Integer((-448));
    java.lang.Integer var9 = new java.lang.Integer(626);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(245);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var12.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var12.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(2);
    boolean var18 = var12.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(3);
    boolean var20 = var12.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(4);
    boolean var22 = var12.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(5);
    boolean var24 = var12.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(939);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(780);
    java.lang.Integer var28 = new java.lang.Integer((-321));
    boolean var29 = var26.existeAresta((int)var27, (int)var28);
    java.lang.Integer var30 = new java.lang.Integer(115);
    boolean var31 = var26.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(264);
    ds.Grafo var33 = new ds.Grafo(var32);
    ds.Grafo.Aresta var34 = var26.primeiroListaAdj((int)var32);
    var2.insereAresta((int)var9, (int)var23, (int)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 264);
    
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(304);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(264);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(4499);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(968);
    ds.Grafo.Aresta var10 = var7.proxAdj((int)var9);
    int var11 = var7.numVertices();
    ds.Grafo.Aresta var12 = var1.retiraAresta((int)var4, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 304);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 4499);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(4499);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(4501);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(0);
    ds.Grafo var14 = new ds.Grafo(var13);
    ds.Grafo var15 = var14.grafoTransposto();
    ds.Grafo var16 = var14.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(4499);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(968);
    ds.Grafo.Aresta var21 = var18.proxAdj((int)var20);
    int var22 = var18.numVertices();
    java.lang.Integer var23 = new java.lang.Integer(4501);
    ds.Grafo var24 = new ds.Grafo(var23);
    java.lang.Integer var25 = new java.lang.Integer(245);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    boolean var28 = var26.listaAdjVazia((int)var27);
    var16.insereAresta((int)var22, (int)var23, (int)var27);
    java.lang.Integer var30 = new java.lang.Integer(939);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(780);
    java.lang.Integer var33 = new java.lang.Integer((-321));
    boolean var34 = var31.existeAresta((int)var32, (int)var33);
    java.lang.Integer var35 = new java.lang.Integer(115);
    boolean var36 = var31.listaAdjVazia((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(245);
    ds.Grafo var38 = new ds.Grafo(var37);
    java.lang.Integer var39 = new java.lang.Integer(4501);
    ds.Grafo var40 = new ds.Grafo(var39);
    ds.Grafo var41 = var40.grafoTransposto();
    java.lang.Integer var42 = new java.lang.Integer(1);
    java.lang.Integer var43 = new java.lang.Integer(939);
    ds.Grafo var44 = new ds.Grafo(var43);
    java.lang.Integer var45 = new java.lang.Integer(780);
    java.lang.Integer var46 = new java.lang.Integer((-321));
    boolean var47 = var44.existeAresta((int)var45, (int)var46);
    ds.Grafo.Aresta var48 = var41.retiraAresta((int)var42, (int)var46);
    java.lang.Integer var49 = new java.lang.Integer(264);
    ds.Grafo var50 = new ds.Grafo(var49);
    boolean var51 = var38.existeAresta((int)var42, (int)var49);
    var12.insereAresta((int)var22, (int)var35, (int)var42);
    ds.Grafo.Aresta var53 = var1.retiraAresta((int)var8, (int)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 4499);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == null);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(264);
    ds.Grafo var7 = new ds.Grafo(var6);
    int var8 = var7.numVertices();
    ds.Grafo var9 = var7.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(829);
    java.lang.Integer var11 = new java.lang.Integer((-448));
    java.lang.Integer var12 = new java.lang.Integer(626);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var9.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Grafo.Aresta var17 = var9.primeiroListaAdj((int)var16);
    boolean var18 = var1.existeAresta((int)var5, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(4499);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(968);
    ds.Grafo.Aresta var8 = var5.proxAdj((int)var7);
    int var9 = var5.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(4501);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(245);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var13.listaAdjVazia((int)var14);
    var3.insereAresta((int)var9, (int)var10, (int)var14);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    int var20 = var19.numVertices();
    java.lang.Integer var21 = new java.lang.Integer(939);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(780);
    java.lang.Integer var24 = new java.lang.Integer((-321));
    boolean var25 = var22.existeAresta((int)var23, (int)var24);
    java.lang.Integer var26 = new java.lang.Integer(245);
    ds.Grafo var27 = new ds.Grafo(var26);
    java.lang.Integer var28 = new java.lang.Integer(4501);
    ds.Grafo var29 = new ds.Grafo(var28);
    ds.Grafo var30 = var29.grafoTransposto();
    java.lang.Integer var31 = new java.lang.Integer(1);
    java.lang.Integer var32 = new java.lang.Integer(939);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(780);
    java.lang.Integer var35 = new java.lang.Integer((-321));
    boolean var36 = var33.existeAresta((int)var34, (int)var35);
    ds.Grafo.Aresta var37 = var30.retiraAresta((int)var31, (int)var35);
    java.lang.Integer var38 = new java.lang.Integer(264);
    ds.Grafo var39 = new ds.Grafo(var38);
    boolean var40 = var27.existeAresta((int)var31, (int)var38);
    var3.insereAresta((int)var20, (int)var23, (int)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4499);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4501);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = var4.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(4499);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(968);
    ds.Grafo.Aresta var11 = var8.proxAdj((int)var10);
    int var12 = var8.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(4501);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(245);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    var6.insereAresta((int)var12, (int)var13, (int)var17);
    java.lang.Integer var20 = new java.lang.Integer(939);
    ds.Grafo var21 = new ds.Grafo(var20);
    java.lang.Integer var22 = new java.lang.Integer(780);
    java.lang.Integer var23 = new java.lang.Integer((-321));
    boolean var24 = var21.existeAresta((int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(115);
    boolean var26 = var21.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(245);
    ds.Grafo var28 = new ds.Grafo(var27);
    java.lang.Integer var29 = new java.lang.Integer(4501);
    ds.Grafo var30 = new ds.Grafo(var29);
    ds.Grafo var31 = var30.grafoTransposto();
    java.lang.Integer var32 = new java.lang.Integer(1);
    java.lang.Integer var33 = new java.lang.Integer(939);
    ds.Grafo var34 = new ds.Grafo(var33);
    java.lang.Integer var35 = new java.lang.Integer(780);
    java.lang.Integer var36 = new java.lang.Integer((-321));
    boolean var37 = var34.existeAresta((int)var35, (int)var36);
    ds.Grafo.Aresta var38 = var31.retiraAresta((int)var32, (int)var36);
    java.lang.Integer var39 = new java.lang.Integer(264);
    ds.Grafo var40 = new ds.Grafo(var39);
    boolean var41 = var28.existeAresta((int)var32, (int)var39);
    var2.insereAresta((int)var12, (int)var25, (int)var32);
    ds.Grafo var43 = new ds.Grafo(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4499);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(4501);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(939);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(780);
    java.lang.Integer var10 = new java.lang.Integer((-321));
    boolean var11 = var8.existeAresta((int)var9, (int)var10);
    ds.Grafo.Aresta var12 = var5.retiraAresta((int)var6, (int)var10);
    ds.Grafo.Aresta var13 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(245);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(245);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(264);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var7.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(939);
    ds.Grafo var11 = new ds.Grafo(var10);
    var11.imprime();
    int var13 = var11.numVertices();
    java.lang.Integer var14 = new java.lang.Integer(245);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var15.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(264);
    ds.Grafo var19 = new ds.Grafo(var18);
    int var20 = var19.numVertices();
    ds.Grafo var21 = var19.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(829);
    java.lang.Integer var23 = new java.lang.Integer((-448));
    java.lang.Integer var24 = new java.lang.Integer(626);
    var21.insereAresta((int)var22, (int)var23, (int)var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    boolean var27 = var21.listaAdjVazia((int)var26);
    var9.insereAresta((int)var13, (int)var16, (int)var26);
    boolean var29 = var1.existeAresta((int)var4, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 939);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 939);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

}
