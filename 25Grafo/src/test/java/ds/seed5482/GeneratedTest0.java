package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
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
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var0.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    var1.imprime();

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var0.proxAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    ds.Grafo var6 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    int var4 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(99);
    ds.Grafo.Aresta var4 = var0.primeiroListaAdj((int)var3);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Grafo var2 = new ds.Grafo();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(99);
    ds.Grafo.Aresta var6 = var2.primeiroListaAdj((int)var5);
    boolean var7 = var0.existeAresta((int)var1, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(630);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(630);
    boolean var8 = var5.existeAresta((int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var5.primeiroListaAdj((int)var9);
    boolean var11 = var0.existeAresta((int)var2, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(630);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(630);
    boolean var9 = var6.existeAresta((int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var4, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(630);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo.Aresta var5 = var0.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var5 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    boolean var6 = var3.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(99);
    ds.Grafo.Aresta var4 = var0.primeiroListaAdj((int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    boolean var6 = var5.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(99);
    ds.Grafo.Aresta var4 = var0.primeiroListaAdj((int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(630);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(0);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(630);
    boolean var13 = var10.existeAresta((int)var11, (int)var12);
    var0.insereAresta((int)var2, (int)var8, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    ds.Grafo.Aresta var7 = var0.retiraAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var0.proxAdj((int)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var0.retiraAresta((int)var6, (int)var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    boolean var3 = var0.existeAresta((int)var1, (int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(0);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var0.retiraAresta((int)var4, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test32() throws Throwable {

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

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    ds.Grafo.Aresta var3 = var0.primeiroListaAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(630);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(99);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.existeAresta((int)var5, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(99);
    java.lang.Integer var2 = new java.lang.Integer(935);
    java.lang.Integer var3 = new java.lang.Integer((-256));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var0.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test39() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(630);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var0.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(99);
    java.lang.Integer var8 = new java.lang.Integer(935);
    java.lang.Integer var9 = new java.lang.Integer((-256));
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var0.retiraAresta((int)var4, (int)var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(0);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    boolean var11 = var0.existeAresta((int)var4, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(99);
    java.lang.Integer var2 = new java.lang.Integer(935);
    java.lang.Integer var3 = new java.lang.Integer((-256));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var5 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    var0.imprime();
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var3.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var3.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.retiraAresta((int)var4, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-672));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();

  }

  public void test49() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var0.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test50() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(935);
    java.lang.Integer var4 = new java.lang.Integer((-256));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(99);
    java.lang.Integer var7 = new java.lang.Integer(935);
    java.lang.Integer var8 = new java.lang.Integer((-256));
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var4, (int)var7, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test52() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    ds.Grafo var7 = var0.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test53() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo.Aresta var4 = var0.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test54() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    var0.insereAresta((int)var6, (int)var8, (int)var9);

  }

  public void test55() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var3.listaAdjVazia((int)var10);
    ds.Grafo var12 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test56() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var0.proxAdj((int)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test57() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    ds.Grafo var7 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test58() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(4);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo.Aresta var11 = var0.proxAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test59() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    ds.Grafo var7 = var0.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var0.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var7.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test60() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(99);
    ds.Grafo.Aresta var11 = var9.primeiroListaAdj((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var9.listaAdjVazia((int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var0.retiraAresta((int)var3, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test61() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    ds.Grafo var2 = new ds.Grafo();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(99);
    ds.Grafo.Aresta var7 = var5.primeiroListaAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var5.listaAdjVazia((int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.existeAresta((int)var1, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test62() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(935);
    java.lang.Integer var4 = new java.lang.Integer((-256));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(99);
    ds.Grafo.Aresta var10 = var6.primeiroListaAdj((int)var9);
    ds.Grafo var11 = new ds.Grafo();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var11.listaAdjVazia((int)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var3, (int)var9, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test63() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-672));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    int var6 = var5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test64() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(630);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.primeiroListaAdj((int)var5);
    var1.imprime();
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    ds.Grafo.Aresta var11 = var0.primeiroListaAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test65() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-672));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var6.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    ds.Grafo var7 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test67() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    ds.Grafo var7 = var0.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var0.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var0.listaAdjVazia((int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var7.retiraAresta((int)var10, (int)var10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test68() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
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
    ds.Grafo var12 = new ds.Grafo();
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer((-672));
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    boolean var17 = var0.existeAresta((int)var10, (int)var14);
    
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
    assertTrue(var17 == false);

  }

  public void test69() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    boolean var8 = var0.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test70() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(4);
    boolean var10 = var0.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(5);
    boolean var12 = var0.listaAdjVazia((int)var11);
    boolean var13 = var0.existeAresta((int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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
    assertTrue(var13 == false);

  }

  public void test71() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-672));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    ds.Grafo var7 = var0.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var0.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var0.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(2);
    boolean var13 = var0.listaAdjVazia((int)var12);
    boolean var14 = var7.existeAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test73() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(252);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test74() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var3.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var3.listaAdjVazia((int)var12);
    boolean var14 = var3.existeAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
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

  public void test75() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    boolean var4 = var0.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test76() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test77() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(935);
    java.lang.Integer var4 = new java.lang.Integer((-256));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(99);
    ds.Grafo.Aresta var11 = var9.primeiroListaAdj((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var9.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var9.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(3);
    boolean var19 = var9.listaAdjVazia((int)var18);
    boolean var20 = var0.existeAresta((int)var2, (int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
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

  public void test78() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    ds.Grafo.Aresta var7 = var6.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test79() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test80() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    ds.Grafo var3 = new ds.Grafo();
    int var4 = var3.numVertices();
    ds.Grafo var5 = var3.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(99);
    ds.Grafo.Aresta var8 = var6.primeiroListaAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var6.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var6.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var0.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test81() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(4);
    boolean var10 = var0.listaAdjVazia((int)var9);
    ds.Grafo var11 = new ds.Grafo();
    int var12 = var11.numVertices();
    ds.Grafo var13 = var11.grafoTransposto();
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(99);
    ds.Grafo.Aresta var16 = var14.primeiroListaAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var14.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    boolean var20 = var14.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(2);
    boolean var22 = var14.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(3);
    boolean var24 = var14.listaAdjVazia((int)var23);
    boolean var25 = var0.listaAdjVazia((int)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test82() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(935);
    java.lang.Integer var4 = new java.lang.Integer((-256));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.retiraAresta((int)var3, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(99);
    java.lang.Integer var7 = new java.lang.Integer(935);
    java.lang.Integer var8 = new java.lang.Integer((-256));
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer((-672));
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = new ds.Grafo();
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var15.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var15.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(2);
    boolean var21 = var15.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(3);
    boolean var23 = var15.listaAdjVazia((int)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var7, (int)var12, (int)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test84() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    boolean var9 = var0.listaAdjVazia((int)var7);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test85() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-672));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    int var8 = var7.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var6.proxAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test86() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer(0);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Grafo.Aresta var10 = var4.proxAdj((int)var9);
    ds.Grafo var11 = new ds.Grafo();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var0.retiraAresta((int)var9, (int)var14);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test87() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(252);
    boolean var9 = var6.existeAresta((int)var7, (int)var8);
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(630);
    boolean var13 = var10.existeAresta((int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    ds.Grafo.Aresta var15 = var10.primeiroListaAdj((int)var14);
    ds.Grafo.Aresta var16 = var6.proxAdj((int)var14);
    ds.Grafo var17 = new ds.Grafo();
    int var18 = var17.numVertices();
    ds.Grafo var19 = var17.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(99);
    ds.Grafo.Aresta var21 = var17.primeiroListaAdj((int)var20);
    ds.Grafo var22 = new ds.Grafo();
    int var23 = var22.numVertices();
    ds.Grafo var24 = var22.grafoTransposto();
    ds.Grafo var25 = var24.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(99);
    ds.Grafo.Aresta var27 = var25.primeiroListaAdj((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(0);
    boolean var29 = var25.listaAdjVazia((int)var28);
    ds.Grafo var30 = new ds.Grafo();
    int var31 = var30.numVertices();
    ds.Grafo var32 = var30.grafoTransposto();
    ds.Grafo var33 = var32.grafoTransposto();
    java.lang.Integer var34 = new java.lang.Integer(99);
    ds.Grafo.Aresta var35 = var33.primeiroListaAdj((int)var34);
    var6.insereAresta((int)var20, (int)var28, (int)var34);
    ds.Grafo var37 = new ds.Grafo();
    java.lang.Integer var38 = new java.lang.Integer(99);
    java.lang.Integer var39 = new java.lang.Integer(935);
    java.lang.Integer var40 = new java.lang.Integer((-256));
    var37.insereAresta((int)var38, (int)var39, (int)var40);
    boolean var42 = var3.existeAresta((int)var20, (int)var38);
    ds.Grafo var43 = new ds.Grafo();
    java.lang.Integer var44 = new java.lang.Integer(0);
    java.lang.Integer var45 = new java.lang.Integer(630);
    boolean var46 = var43.existeAresta((int)var44, (int)var45);
    ds.Grafo var47 = new ds.Grafo();
    ds.Grafo var48 = new ds.Grafo();
    java.lang.Integer var49 = new java.lang.Integer(1);
    java.lang.Integer var50 = new java.lang.Integer(1);
    java.lang.Integer var51 = new java.lang.Integer((-672));
    var48.insereAresta((int)var49, (int)var50, (int)var51);
    ds.Grafo var53 = new ds.Grafo();
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
    boolean var66 = var47.existeAresta((int)var50, (int)var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var67 = var3.existeAresta((int)var45, (int)var64);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
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
    assertTrue(var66 == false);

  }

  public void test88() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    int var6 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test89() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(630);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
    var0.imprime();
    ds.Grafo var7 = var0.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var0.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var0.listaAdjVazia((int)var10);
    ds.Grafo var12 = new ds.Grafo();
    int var13 = var12.numVertices();
    ds.Grafo var14 = var12.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(99);
    ds.Grafo.Aresta var16 = var12.primeiroListaAdj((int)var15);
    ds.Grafo.Aresta var17 = var0.primeiroListaAdj((int)var15);
    ds.Grafo var18 = new ds.Grafo();
    ds.Grafo var19 = var18.grafoTransposto();
    ds.Grafo var20 = var18.grafoTransposto();
    int var21 = var18.numVertices();
    ds.Grafo var22 = new ds.Grafo();
    java.lang.Integer var23 = new java.lang.Integer(0);
    boolean var24 = var22.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(1);
    boolean var26 = var22.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(2);
    boolean var28 = var22.listaAdjVazia((int)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var29 = var0.retiraAresta((int)var21, (int)var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test90() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var0.listaAdjVazia((int)var7);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test91() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    var0.imprime();
    ds.Grafo var5 = new ds.Grafo();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(630);
    boolean var9 = var6.existeAresta((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var6.primeiroListaAdj((int)var10);
    var6.imprime();
    ds.Grafo var13 = var6.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var6.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var6.listaAdjVazia((int)var16);
    ds.Grafo.Aresta var18 = var5.proxAdj((int)var16);
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(0);
    java.lang.Integer var21 = new java.lang.Integer(630);
    boolean var22 = var19.existeAresta((int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    ds.Grafo.Aresta var24 = var19.primeiroListaAdj((int)var23);
    var19.imprime();
    ds.Grafo var26 = var19.grafoTransposto();
    java.lang.Integer var27 = new java.lang.Integer(0);
    boolean var28 = var19.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(1);
    boolean var30 = var19.listaAdjVazia((int)var29);
    ds.Grafo var31 = new ds.Grafo();
    int var32 = var31.numVertices();
    ds.Grafo var33 = var31.grafoTransposto();
    java.lang.Integer var34 = new java.lang.Integer(99);
    ds.Grafo.Aresta var35 = var31.primeiroListaAdj((int)var34);
    ds.Grafo.Aresta var36 = var19.primeiroListaAdj((int)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var37 = var0.retiraAresta((int)var16, (int)var34);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);

  }

  public void test92() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(630);
    boolean var11 = var8.existeAresta((int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    ds.Grafo.Aresta var13 = var8.primeiroListaAdj((int)var12);
    ds.Grafo var14 = new ds.Grafo();
    int var15 = var14.numVertices();
    boolean var16 = var3.existeAresta((int)var12, (int)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test93() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-672));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(99);
    ds.Grafo.Aresta var11 = var9.primeiroListaAdj((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var9.listaAdjVazia((int)var12);
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer(630);
    boolean var17 = var14.existeAresta((int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    ds.Grafo.Aresta var19 = var14.primeiroListaAdj((int)var18);
    var14.imprime();
    ds.Grafo var21 = var14.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var14.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    boolean var25 = var14.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(2);
    boolean var27 = var14.listaAdjVazia((int)var26);
    ds.Grafo var28 = new ds.Grafo();
    java.lang.Integer var29 = new java.lang.Integer(0);
    java.lang.Integer var30 = new java.lang.Integer(630);
    boolean var31 = var28.existeAresta((int)var29, (int)var30);
    java.lang.Integer var32 = new java.lang.Integer(0);
    ds.Grafo.Aresta var33 = var28.primeiroListaAdj((int)var32);
    ds.Grafo var34 = new ds.Grafo();
    int var35 = var34.numVertices();
    var9.insereAresta((int)var26, (int)var32, (int)var35);
    ds.Grafo var37 = new ds.Grafo();
    java.lang.Integer var38 = new java.lang.Integer(1);
    java.lang.Integer var39 = new java.lang.Integer(252);
    boolean var40 = var37.existeAresta((int)var38, (int)var39);
    ds.Grafo var41 = new ds.Grafo();
    java.lang.Integer var42 = new java.lang.Integer(1);
    java.lang.Integer var43 = new java.lang.Integer(100);
    java.lang.Integer var44 = new java.lang.Integer(0);
    var41.insereAresta((int)var42, (int)var43, (int)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var35, (int)var39, (int)var43);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test94() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    var0.imprime();
    ds.Grafo var4 = new ds.Grafo();
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
    boolean var15 = var0.listaAdjVazia((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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
    assertTrue(var15 == true);

  }

  public void test95() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.listaAdjVazia((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test96() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(99);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var4.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo();
    ds.Grafo var10 = new ds.Grafo();
    int var11 = var10.numVertices();
    ds.Grafo var12 = var10.grafoTransposto();
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(99);
    ds.Grafo.Aresta var15 = var13.primeiroListaAdj((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var13.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var13.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(2);
    boolean var21 = var13.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(3);
    boolean var23 = var13.listaAdjVazia((int)var22);
    ds.Grafo var24 = new ds.Grafo();
    java.lang.Integer var25 = new java.lang.Integer(1);
    java.lang.Integer var26 = new java.lang.Integer(100);
    java.lang.Integer var27 = new java.lang.Integer(0);
    var24.insereAresta((int)var25, (int)var26, (int)var27);
    boolean var29 = var9.existeAresta((int)var22, (int)var25);
    boolean var30 = var0.existeAresta((int)var7, (int)var22);
    ds.Grafo var31 = new ds.Grafo();
    java.lang.Integer var32 = new java.lang.Integer(99);
    java.lang.Integer var33 = new java.lang.Integer(935);
    java.lang.Integer var34 = new java.lang.Integer((-256));
    var31.insereAresta((int)var32, (int)var33, (int)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var36 = var0.primeiroListaAdj((int)var33);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test97() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var3.listaAdjVazia((int)var8);
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test98() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(252);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(630);
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var4.primeiroListaAdj((int)var8);
    ds.Grafo.Aresta var10 = var0.proxAdj((int)var8);
    ds.Grafo var11 = new ds.Grafo();
    int var12 = var11.numVertices();
    ds.Grafo var13 = var11.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(99);
    ds.Grafo.Aresta var15 = var11.primeiroListaAdj((int)var14);
    ds.Grafo var16 = new ds.Grafo();
    int var17 = var16.numVertices();
    ds.Grafo var18 = var16.grafoTransposto();
    ds.Grafo var19 = var18.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(99);
    ds.Grafo.Aresta var21 = var19.primeiroListaAdj((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var19.listaAdjVazia((int)var22);
    ds.Grafo var24 = new ds.Grafo();
    int var25 = var24.numVertices();
    ds.Grafo var26 = var24.grafoTransposto();
    ds.Grafo var27 = var26.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(99);
    ds.Grafo.Aresta var29 = var27.primeiroListaAdj((int)var28);
    var0.insereAresta((int)var14, (int)var22, (int)var28);
    ds.Grafo var31 = new ds.Grafo();
    java.lang.Integer var32 = new java.lang.Integer(0);
    java.lang.Integer var33 = new java.lang.Integer(630);
    boolean var34 = var31.existeAresta((int)var32, (int)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var35 = var0.proxAdj((int)var33);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test99() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-672));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-672));
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    ds.Grafo.Aresta var11 = var5.proxAdj((int)var7);

  }

  public void test100() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    ds.Grafo var8 = new ds.Grafo();
    int var9 = var8.numVertices();
    ds.Grafo var10 = var8.grafoTransposto();
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(99);
    ds.Grafo.Aresta var13 = var11.primeiroListaAdj((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var11.listaAdjVazia((int)var14);
    ds.Grafo var16 = new ds.Grafo();
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(630);
    boolean var19 = var16.existeAresta((int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Grafo.Aresta var21 = var16.primeiroListaAdj((int)var20);
    var16.imprime();
    ds.Grafo var23 = var16.grafoTransposto();
    java.lang.Integer var24 = new java.lang.Integer(0);
    boolean var25 = var16.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(1);
    boolean var27 = var16.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(2);
    boolean var29 = var16.listaAdjVazia((int)var28);
    ds.Grafo var30 = new ds.Grafo();
    java.lang.Integer var31 = new java.lang.Integer(0);
    java.lang.Integer var32 = new java.lang.Integer(630);
    boolean var33 = var30.existeAresta((int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(0);
    ds.Grafo.Aresta var35 = var30.primeiroListaAdj((int)var34);
    ds.Grafo var36 = new ds.Grafo();
    int var37 = var36.numVertices();
    var11.insereAresta((int)var28, (int)var34, (int)var37);
    ds.Grafo var39 = new ds.Grafo();
    ds.Grafo var40 = new ds.Grafo();
    int var41 = var40.numVertices();
    ds.Grafo var42 = var40.grafoTransposto();
    ds.Grafo var43 = var42.grafoTransposto();
    java.lang.Integer var44 = new java.lang.Integer(99);
    ds.Grafo.Aresta var45 = var43.primeiroListaAdj((int)var44);
    java.lang.Integer var46 = new java.lang.Integer(0);
    boolean var47 = var43.listaAdjVazia((int)var46);
    java.lang.Integer var48 = new java.lang.Integer(1);
    boolean var49 = var43.listaAdjVazia((int)var48);
    ds.Grafo var50 = new ds.Grafo();
    ds.Grafo var51 = new ds.Grafo();
    java.lang.Integer var52 = new java.lang.Integer(1);
    java.lang.Integer var53 = new java.lang.Integer(1);
    java.lang.Integer var54 = new java.lang.Integer((-672));
    var51.insereAresta((int)var52, (int)var53, (int)var54);
    ds.Grafo var56 = new ds.Grafo();
    java.lang.Integer var57 = new java.lang.Integer(0);
    boolean var58 = var56.listaAdjVazia((int)var57);
    java.lang.Integer var59 = new java.lang.Integer(1);
    boolean var60 = var56.listaAdjVazia((int)var59);
    java.lang.Integer var61 = new java.lang.Integer(2);
    boolean var62 = var56.listaAdjVazia((int)var61);
    java.lang.Integer var63 = new java.lang.Integer(3);
    boolean var64 = var56.listaAdjVazia((int)var63);
    java.lang.Integer var65 = new java.lang.Integer(4);
    boolean var66 = var56.listaAdjVazia((int)var65);
    java.lang.Integer var67 = new java.lang.Integer(5);
    boolean var68 = var56.listaAdjVazia((int)var67);
    boolean var69 = var50.existeAresta((int)var53, (int)var67);
    boolean var70 = var39.existeAresta((int)var48, (int)var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var71 = var0.retiraAresta((int)var28, (int)var48);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

}
