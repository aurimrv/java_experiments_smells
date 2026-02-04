package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(903);
    java.lang.Integer var8 = new java.lang.Integer(807);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var5.proxAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(903);
    java.lang.Integer var8 = new java.lang.Integer(807);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    int var10 = var5.numVertices();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.existeAresta((int)var1, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = new ds.Grafo();

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(903);
    java.lang.Integer var10 = new java.lang.Integer(807);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.listaAdjVazia((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    int var5 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var0.retiraAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var0.proxAdj((int)var2);
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(903);
    java.lang.Integer var10 = new java.lang.Integer(807);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var1.proxAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var5.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var0.proxAdj((int)var2);
    int var4 = var0.numVertices();
    ds.Grafo var5 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var0.proxAdj((int)var2);
    int var4 = var0.numVertices();
    int var5 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.primeiroListaAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.listaAdjVazia((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(35);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-523));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(35);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-523));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    boolean var6 = var0.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    int var7 = var6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(903);
    java.lang.Integer var9 = new java.lang.Integer(807);
    var0.insereAresta((int)var7, (int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var6.proxAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer((-390));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(903);
    java.lang.Integer var10 = new java.lang.Integer(807);
    var1.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var0.primeiroListaAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(35);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-523));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.insereAresta((int)var3, (int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    int var6 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var5.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(35);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-523));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var0.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    boolean var10 = var7.existeAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(903);
    java.lang.Integer var9 = new java.lang.Integer(807);
    var0.insereAresta((int)var7, (int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var11 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    int var10 = var7.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var7.proxAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    int var10 = var7.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(35);
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-523));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    ds.Grafo var9 = var4.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    ds.Grafo var11 = var9.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Grafo.Aresta var13 = var11.proxAdj((int)var12);
    int var14 = var11.numVertices();
    ds.Grafo var15 = new ds.Grafo();
    java.lang.Integer var16 = new java.lang.Integer(35);
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer((-523));
    var15.insereAresta((int)var16, (int)var17, (int)var18);
    ds.Grafo var20 = var15.grafoTransposto();
    ds.Grafo var21 = var20.grafoTransposto();
    ds.Grafo var22 = var20.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(1);
    ds.Grafo.Aresta var24 = var22.proxAdj((int)var23);
    int var25 = var22.numVertices();
    var0.insereAresta((int)var2, (int)var14, (int)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer((-390));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(903);
    java.lang.Integer var10 = new java.lang.Integer(807);
    var1.insereAresta((int)var8, (int)var9, (int)var10);
    ds.Grafo var12 = new ds.Grafo();
    var12.imprime();
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer((-390));
    boolean var16 = var12.existeAresta((int)var14, (int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var0.retiraAresta((int)var9, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    int var5 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(35);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-523));
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(903);
    java.lang.Integer var11 = new java.lang.Integer(807);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    int var13 = var8.numVertices();
    ds.Grafo var14 = new ds.Grafo();
    var14.imprime();
    java.lang.Integer var16 = new java.lang.Integer(10);
    java.lang.Integer var17 = new java.lang.Integer((-390));
    boolean var18 = var14.existeAresta((int)var16, (int)var17);
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(35);
    java.lang.Integer var21 = new java.lang.Integer(0);
    java.lang.Integer var22 = new java.lang.Integer((-523));
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    int var24 = var19.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var13, (int)var16, (int)var24);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var0.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var0.proxAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

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
    int var9 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test41() throws Throwable {

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
    var0.imprime();
    
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

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var4.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var4.listaAdjVazia((int)var11);
    ds.Grafo var13 = new ds.Grafo();
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(1);
    ds.Grafo.Aresta var16 = var13.proxAdj((int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var3.retiraAresta((int)var11, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var5.listaAdjVazia((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(35);
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer((-523));
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var5.proxAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(35);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-523));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(903);
    java.lang.Integer var9 = new java.lang.Integer(807);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    int var11 = var6.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.listaAdjVazia((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(35);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-523));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    var3.imprime();
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer((-390));
    boolean var7 = var3.existeAresta((int)var5, (int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    ds.Grafo var9 = var3.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(903);
    java.lang.Integer var12 = new java.lang.Integer(807);
    var3.insereAresta((int)var10, (int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var2.proxAdj((int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test49() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(35);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-523));
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(903);
    java.lang.Integer var11 = new java.lang.Integer(807);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    int var13 = var8.numVertices();
    ds.Grafo var14 = new ds.Grafo();
    ds.Grafo var15 = var14.grafoTransposto();
    ds.Grafo var16 = var14.grafoTransposto();
    ds.Grafo var17 = new ds.Grafo();
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var17.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var17.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(2);
    boolean var23 = var17.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(3);
    boolean var25 = var17.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(4);
    boolean var27 = var17.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(100);
    boolean var29 = var14.existeAresta((int)var26, (int)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var30 = var0.retiraAresta((int)var13, (int)var28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
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
    assertTrue(var29 == false);

  }

  public void test50() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(35);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer((-523));
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    ds.Grafo var11 = var6.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(903);
    java.lang.Integer var14 = new java.lang.Integer(807);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    ds.Grafo var16 = new ds.Grafo();
    var16.imprime();
    java.lang.Integer var18 = new java.lang.Integer(10);
    java.lang.Integer var19 = new java.lang.Integer((-390));
    boolean var20 = var16.existeAresta((int)var18, (int)var19);
    ds.Grafo var21 = var16.grafoTransposto();
    int var22 = var21.numVertices();
    java.lang.Integer var23 = new java.lang.Integer(100);
    var0.insereAresta((int)var12, (int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var26 = var0.primeiroListaAdj((int)var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);

  }

  public void test51() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(100);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var6.listaAdjVazia((int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.existeAresta((int)var5, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test52() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    var5.imprime();

  }

  public void test53() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var7.grafoTransposto();
    ds.Grafo var10 = new ds.Grafo();
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
    java.lang.Integer var21 = new java.lang.Integer(100);
    boolean var22 = var7.existeAresta((int)var19, (int)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var23 = var0.proxAdj((int)var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test54() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    int var5 = var0.numVertices();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test55() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(10);
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(35);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-523));
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(903);
    java.lang.Integer var11 = new java.lang.Integer(807);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo var13 = new ds.Grafo();
    var13.imprime();
    java.lang.Integer var15 = new java.lang.Integer(10);
    java.lang.Integer var16 = new java.lang.Integer((-390));
    boolean var17 = var13.existeAresta((int)var15, (int)var16);
    var0.insereAresta((int)var2, (int)var10, (int)var15);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test56() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(903);
    java.lang.Integer var10 = new java.lang.Integer(807);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    int var12 = var7.numVertices();
    ds.Grafo var13 = new ds.Grafo();
    ds.Grafo var14 = var13.grafoTransposto();
    ds.Grafo var15 = var14.grafoTransposto();
    ds.Grafo var16 = new ds.Grafo();
    ds.Grafo var17 = var16.grafoTransposto();
    ds.Grafo var18 = var16.grafoTransposto();
    ds.Grafo var19 = new ds.Grafo();
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
    java.lang.Integer var30 = new java.lang.Integer(100);
    boolean var31 = var16.existeAresta((int)var28, (int)var30);
    ds.Grafo var32 = new ds.Grafo();
    java.lang.Integer var33 = new java.lang.Integer(35);
    java.lang.Integer var34 = new java.lang.Integer(0);
    java.lang.Integer var35 = new java.lang.Integer((-523));
    var32.insereAresta((int)var33, (int)var34, (int)var35);
    int var37 = var32.numVertices();
    ds.Grafo var38 = new ds.Grafo();
    java.lang.Integer var39 = new java.lang.Integer(0);
    boolean var40 = var38.listaAdjVazia((int)var39);
    var14.insereAresta((int)var28, (int)var37, (int)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var42 = var1.existeAresta((int)var12, (int)var39);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
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
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test57() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var4);
    int var6 = var2.numVertices();
    int var7 = var2.numVertices();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var8.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var8.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var8.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var8.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var8.listaAdjVazia((int)var17);
    ds.Grafo.Aresta var19 = var2.proxAdj((int)var17);
    ds.Grafo var20 = new ds.Grafo();
    java.lang.Integer var21 = new java.lang.Integer(0);
    boolean var22 = var20.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(1);
    boolean var24 = var20.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(2);
    boolean var26 = var20.listaAdjVazia((int)var25);
    boolean var27 = var1.existeAresta((int)var17, (int)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
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
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test58() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(3);
    boolean var11 = var3.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(4);
    boolean var13 = var3.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(100);
    boolean var15 = var0.existeAresta((int)var12, (int)var14);
    ds.Grafo var16 = new ds.Grafo();
    var16.imprime();
    java.lang.Integer var18 = new java.lang.Integer(10);
    java.lang.Integer var19 = new java.lang.Integer((-390));
    boolean var20 = var16.existeAresta((int)var18, (int)var19);
    ds.Grafo var21 = var16.grafoTransposto();
    ds.Grafo var22 = new ds.Grafo();
    java.lang.Integer var23 = new java.lang.Integer(35);
    java.lang.Integer var24 = new java.lang.Integer(0);
    java.lang.Integer var25 = new java.lang.Integer((-523));
    var22.insereAresta((int)var23, (int)var24, (int)var25);
    ds.Grafo var27 = var22.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(0);
    java.lang.Integer var29 = new java.lang.Integer(903);
    java.lang.Integer var30 = new java.lang.Integer(807);
    var27.insereAresta((int)var28, (int)var29, (int)var30);
    ds.Grafo var32 = new ds.Grafo();
    var32.imprime();
    java.lang.Integer var34 = new java.lang.Integer(10);
    java.lang.Integer var35 = new java.lang.Integer((-390));
    boolean var36 = var32.existeAresta((int)var34, (int)var35);
    ds.Grafo var37 = var32.grafoTransposto();
    int var38 = var37.numVertices();
    java.lang.Integer var39 = new java.lang.Integer(100);
    var16.insereAresta((int)var28, (int)var38, (int)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var41 = var0.proxAdj((int)var38);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100);

  }

  public void test59() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Grafo.Aresta var10 = var7.proxAdj((int)var9);
    int var11 = var7.numVertices();
    int var12 = var7.numVertices();
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(35);
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-523));
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    int var18 = var13.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var0.existeAresta((int)var12, (int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test60() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var5.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(35);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-523));
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo.Aresta var13 = var7.proxAdj((int)var10);
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test61() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    var7.imprime();
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer((-390));
    boolean var11 = var7.existeAresta((int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var0.existeAresta((int)var10, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test62() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    int var5 = var1.numVertices();
    int var6 = var1.numVertices();
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var7.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var7.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(2);
    boolean var13 = var7.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(3);
    boolean var15 = var7.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(4);
    boolean var17 = var7.listaAdjVazia((int)var16);
    ds.Grafo.Aresta var18 = var1.proxAdj((int)var16);
    ds.Grafo.Aresta var19 = var0.primeiroListaAdj((int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
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
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test63() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test64() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    var0.imprime();
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    boolean var8 = var0.existeAresta((int)var6, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test65() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(3);
    boolean var11 = var3.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(4);
    boolean var13 = var3.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(100);
    boolean var15 = var0.existeAresta((int)var12, (int)var14);
    ds.Grafo var16 = new ds.Grafo();
    var16.imprime();
    java.lang.Integer var18 = new java.lang.Integer(10);
    java.lang.Integer var19 = new java.lang.Integer((-390));
    boolean var20 = var16.existeAresta((int)var18, (int)var19);
    int var21 = var16.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var22 = var0.primeiroListaAdj((int)var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);

  }

  public void test66() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test67() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    int var9 = var7.numVertices();
    ds.Grafo var10 = new ds.Grafo();
    var10.imprime();
    java.lang.Integer var12 = new java.lang.Integer(10);
    java.lang.Integer var13 = new java.lang.Integer((-390));
    boolean var14 = var10.existeAresta((int)var12, (int)var13);
    ds.Grafo var15 = var10.grafoTransposto();
    ds.Grafo var16 = new ds.Grafo();
    java.lang.Integer var17 = new java.lang.Integer(35);
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer((-523));
    var16.insereAresta((int)var17, (int)var18, (int)var19);
    ds.Grafo var21 = var16.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(903);
    java.lang.Integer var24 = new java.lang.Integer(807);
    var21.insereAresta((int)var22, (int)var23, (int)var24);
    ds.Grafo var26 = new ds.Grafo();
    var26.imprime();
    java.lang.Integer var28 = new java.lang.Integer(10);
    java.lang.Integer var29 = new java.lang.Integer((-390));
    boolean var30 = var26.existeAresta((int)var28, (int)var29);
    ds.Grafo var31 = var26.grafoTransposto();
    int var32 = var31.numVertices();
    java.lang.Integer var33 = new java.lang.Integer(100);
    var10.insereAresta((int)var22, (int)var32, (int)var33);
    ds.Grafo var35 = new ds.Grafo();
    java.lang.Integer var36 = new java.lang.Integer(35);
    java.lang.Integer var37 = new java.lang.Integer(0);
    java.lang.Integer var38 = new java.lang.Integer((-523));
    var35.insereAresta((int)var36, (int)var37, (int)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var9, (int)var33, (int)var37);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);

  }

  public void test68() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer((-390));
    boolean var4 = var0.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(35);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-523));
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var5.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(903);
    java.lang.Integer var13 = new java.lang.Integer(807);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = new ds.Grafo();
    ds.Grafo var16 = var15.grafoTransposto();
    ds.Grafo var17 = var15.grafoTransposto();
    ds.Grafo var18 = new ds.Grafo();
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
    java.lang.Integer var29 = new java.lang.Integer(100);
    boolean var30 = var15.existeAresta((int)var27, (int)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var31 = var0.existeAresta((int)var13, (int)var29);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var30 == false);

  }

  public void test69() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(35);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-523));
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    var6.imprime();

  }

  public void test70() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test71() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(35);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-523));
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(903);
    java.lang.Integer var10 = new java.lang.Integer(807);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    ds.Grafo var12 = new ds.Grafo();
    ds.Grafo var13 = var12.grafoTransposto();
    ds.Grafo var14 = var13.grafoTransposto();
    ds.Grafo var15 = new ds.Grafo();
    ds.Grafo var16 = var15.grafoTransposto();
    ds.Grafo var17 = var15.grafoTransposto();
    ds.Grafo var18 = new ds.Grafo();
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
    java.lang.Integer var29 = new java.lang.Integer(100);
    boolean var30 = var15.existeAresta((int)var27, (int)var29);
    ds.Grafo var31 = new ds.Grafo();
    java.lang.Integer var32 = new java.lang.Integer(35);
    java.lang.Integer var33 = new java.lang.Integer(0);
    java.lang.Integer var34 = new java.lang.Integer((-523));
    var31.insereAresta((int)var32, (int)var33, (int)var34);
    int var36 = var31.numVertices();
    ds.Grafo var37 = new ds.Grafo();
    java.lang.Integer var38 = new java.lang.Integer(0);
    boolean var39 = var37.listaAdjVazia((int)var38);
    var13.insereAresta((int)var27, (int)var36, (int)var38);
    boolean var41 = var0.existeAresta((int)var8, (int)var36);
    
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
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

}
