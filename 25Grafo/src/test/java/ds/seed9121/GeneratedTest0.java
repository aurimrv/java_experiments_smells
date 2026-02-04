package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.insereAresta((int)var1, (int)var2, (int)var3);

  }

  public void test2() throws Throwable {

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

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(94);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(94);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(682);
    boolean var5 = var0.existeAresta((int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var0.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo.Aresta var7 = var0.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.proxAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    var1.imprime();

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(94);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(682);
    boolean var8 = var3.existeAresta((int)var6, (int)var7);
    ds.Grafo.Aresta var9 = var2.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(94);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(682);
    boolean var5 = var0.existeAresta((int)var3, (int)var4);
    int var6 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
    boolean var3 = var0.existeAresta((int)var1, (int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
    int var3 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var4.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    int var6 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    int var1 = var0.numVertices();
    ds.Grafo var2 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(94);
    ds.Grafo.Aresta var10 = var8.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(682);
    boolean var13 = var8.existeAresta((int)var11, (int)var12);
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(94);
    ds.Grafo.Aresta var16 = var14.proxAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(682);
    boolean var19 = var14.existeAresta((int)var17, (int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var7, (int)var11, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var6.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.existeAresta((int)var7, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var0.retiraAresta((int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Grafo.Aresta var2 = var0.primeiroListaAdj((int)var1);
    var0.insereAresta((int)var1, (int)var1, (int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var0.retiraAresta((int)var2, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    int var8 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test32() throws Throwable {

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

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(94);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(682);
    boolean var7 = var2.existeAresta((int)var5, (int)var6);
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(94);
    ds.Grafo.Aresta var10 = var8.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(682);
    boolean var13 = var8.existeAresta((int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var6, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(5);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(5);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    boolean var4 = var0.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(5);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    var0.imprime();
    boolean var6 = var0.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test39() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(5);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    var0.imprime();

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.existeAresta((int)var7, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test41() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    int var8 = var5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    int var6 = var4.numVertices();
    ds.Grafo var7 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    int var8 = var4.numVertices();
    int var9 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var7.primeiroListaAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    ds.Grafo var8 = var5.grafoTransposto();
    boolean var9 = var8.existeAresta((int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    ds.Grafo var8 = var5.grafoTransposto();
    ds.Grafo var9 = var5.grafoTransposto();
    ds.Grafo var10 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    ds.Grafo var8 = var5.grafoTransposto();
    ds.Grafo var9 = var5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var7.primeiroListaAdj((int)var8);
    ds.Grafo.Aresta var10 = var6.proxAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test49() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var0.numVertices();
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var6.grafoTransposto();
    int var9 = var6.numVertices();
    ds.Grafo var10 = var6.grafoTransposto();
    ds.Grafo var11 = var6.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(94);
    ds.Grafo.Aresta var16 = var14.proxAdj((int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var0.retiraAresta((int)var12, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test50() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var0.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test51() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var8.grafoTransposto();
    int var11 = var8.numVertices();
    ds.Grafo var12 = var8.grafoTransposto();
    int var13 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var7.proxAdj((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test52() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    int var5 = var2.numVertices();
    ds.Grafo var6 = var2.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(10);
    ds.Grafo.Aresta var8 = var6.primeiroListaAdj((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.existeAresta((int)var1, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test53() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(10);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var4.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test54() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    int var8 = var7.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test55() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test56() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    int var8 = var4.numVertices();
    int var9 = var4.numVertices();
    ds.Grafo var10 = new ds.Grafo();
    ds.Grafo var11 = var10.grafoTransposto();
    ds.Grafo var12 = var10.grafoTransposto();
    int var13 = var10.numVertices();
    ds.Grafo var14 = var10.grafoTransposto();
    int var15 = var10.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var4.primeiroListaAdj((int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);

  }

  public void test57() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var8.grafoTransposto();
    int var11 = var8.numVertices();
    ds.Grafo var12 = var8.grafoTransposto();
    var12.imprime();
    ds.Grafo var14 = var12.grafoTransposto();
    ds.Grafo var15 = var12.grafoTransposto();
    int var16 = var12.numVertices();
    int var17 = var12.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var7.listaAdjVazia((int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test58() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    ds.Grafo var7 = var4.grafoTransposto();
    int var8 = var4.numVertices();
    int var9 = var4.numVertices();
    ds.Grafo var10 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test59() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(94);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(682);
    boolean var7 = var2.existeAresta((int)var5, (int)var6);
    int var8 = var2.numVertices();
    ds.Grafo var9 = new ds.Grafo();
    int var10 = var9.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.existeAresta((int)var8, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test60() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test61() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(94);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(94);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer(5);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    boolean var15 = var6.existeAresta((int)var8, (int)var13);
    ds.Grafo var16 = new ds.Grafo();
    java.lang.Integer var17 = new java.lang.Integer(1);
    java.lang.Integer var18 = new java.lang.Integer(1);
    java.lang.Integer var19 = new java.lang.Integer(5);
    var16.insereAresta((int)var17, (int)var18, (int)var19);
    var0.insereAresta((int)var4, (int)var13, (int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test62() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(5);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var5.primeiroListaAdj((int)var6);
    boolean var8 = var0.listaAdjVazia((int)var6);
    ds.Grafo var9 = new ds.Grafo();
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(5);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    ds.Grafo var14 = new ds.Grafo();
    int var15 = var14.numVertices();
    ds.Grafo var16 = new ds.Grafo();
    ds.Grafo var17 = new ds.Grafo();
    java.lang.Integer var18 = new java.lang.Integer(94);
    ds.Grafo.Aresta var19 = var17.proxAdj((int)var18);
    ds.Grafo var20 = new ds.Grafo();
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer(1);
    java.lang.Integer var23 = new java.lang.Integer(5);
    var20.insereAresta((int)var21, (int)var22, (int)var23);
    boolean var25 = var16.existeAresta((int)var18, (int)var23);
    var0.insereAresta((int)var10, (int)var15, (int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test63() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    ds.Grafo var9 = var6.grafoTransposto();
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer(5);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = new ds.Grafo();
    ds.Grafo var16 = var15.grafoTransposto();
    ds.Grafo var17 = var15.grafoTransposto();
    int var18 = var15.numVertices();
    ds.Grafo var19 = var15.grafoTransposto();
    var19.imprime();
    ds.Grafo var21 = var19.grafoTransposto();
    ds.Grafo var22 = var19.grafoTransposto();
    int var23 = var19.numVertices();
    ds.Grafo var24 = new ds.Grafo();
    java.lang.Integer var25 = new java.lang.Integer(94);
    ds.Grafo.Aresta var26 = var24.proxAdj((int)var25);
    var6.insereAresta((int)var11, (int)var23, (int)var25);
    ds.Grafo.Aresta var28 = var0.proxAdj((int)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);

  }

  public void test64() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(682);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(94);
    ds.Grafo.Aresta var10 = var8.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(682);
    boolean var13 = var8.existeAresta((int)var11, (int)var12);
    int var14 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var0.existeAresta((int)var7, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test65() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(94);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(5);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    boolean var10 = var1.existeAresta((int)var3, (int)var8);
    ds.Grafo.Aresta var11 = var0.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

}
