package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
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

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var2.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
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

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 363);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 363);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var4);
    var2.insereAresta((int)var4, (int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 363);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var4);
    ds.Grafo var6 = var2.grafoTransposto();
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 363);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 363);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var1.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 363);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.imprime();

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(426);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 652);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 363);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(798);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(798);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 798);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
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

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(426);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var3.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
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

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
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

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
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

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
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

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
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

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var2.retiraAresta((int)var7, (int)var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 652);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var2.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var2.retiraAresta((int)var9, (int)var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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
    ds.Grafo var13 = var2.grafoTransposto();
    
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

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(279);
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

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(279);
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

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(279);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(294);
    java.lang.Integer var4 = new java.lang.Integer((-54));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var6 = new ds.Grafo(var4);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    boolean var7 = var6.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
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

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(489);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(294);
    java.lang.Integer var4 = new java.lang.Integer((-54));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(149);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    int var8 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 700);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var3.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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
    java.lang.Integer var13 = new java.lang.Integer(5);
    boolean var14 = var2.listaAdjVazia((int)var13);
    boolean var15 = var2.existeAresta((int)var13, (int)var13);
    
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
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(489);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(48);
    java.lang.Integer var6 = new java.lang.Integer(312);
    java.lang.Integer var7 = new java.lang.Integer((-804));
    var2.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var2.retiraAresta((int)var7, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 868);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 363);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(489);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(48);
    java.lang.Integer var6 = new java.lang.Integer(312);
    java.lang.Integer var7 = new java.lang.Integer((-804));
    var2.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var2.listaAdjVazia((int)var9);
    ds.Grafo var11 = new ds.Grafo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 363);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
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
    java.lang.Integer var13 = new java.lang.Integer(5);
    boolean var14 = var2.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(6);
    boolean var16 = var2.listaAdjVazia((int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var2.retiraAresta((int)var15, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    var1.insereAresta((int)var3, (int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 652);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 652);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo var9 = var2.grafoTransposto();
    var9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo var9 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(489);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(489);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(48);
    java.lang.Integer var6 = new java.lang.Integer(312);
    java.lang.Integer var7 = new java.lang.Integer((-804));
    var2.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var2.listaAdjVazia((int)var11);
    boolean var13 = var2.existeAresta((int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(489);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(48);
    java.lang.Integer var6 = new java.lang.Integer(312);
    java.lang.Integer var7 = new java.lang.Integer((-804));
    var2.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var2.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(294);
    java.lang.Integer var4 = new java.lang.Integer((-54));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(149);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    int var11 = var10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 700);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(798);
    ds.Grafo var5 = new ds.Grafo(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 652);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(868);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(868);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(489);
    ds.Grafo.Aresta var8 = var6.primeiroListaAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(48);
    java.lang.Integer var10 = new java.lang.Integer(312);
    java.lang.Integer var11 = new java.lang.Integer((-804));
    var6.insereAresta((int)var9, (int)var10, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var13 = var1.retiraAresta((int)var2, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(804);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(363);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.retiraAresta((int)var3, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var4);
    ds.Grafo var6 = var2.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(868);
    ds.Grafo var8 = new ds.Grafo(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var6.primeiroListaAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 363);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(804);
    ds.Grafo var3 = new ds.Grafo(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(652);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(652);
    ds.Grafo var6 = new ds.Grafo(var5);
    int var7 = var6.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.retiraAresta((int)var3, (int)var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 652);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 868);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    ds.Grafo var6 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 363);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(700);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(294);
    java.lang.Integer var4 = new java.lang.Integer((-54));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(149);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(363);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(868);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var13.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var13.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(2);
    boolean var19 = var13.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(3);
    boolean var21 = var13.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(4);
    boolean var23 = var13.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(5);
    boolean var25 = var13.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(6);
    boolean var27 = var13.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(652);
    ds.Grafo var29 = new ds.Grafo(var28);
    var29.imprime();
    int var31 = var29.numVertices();
    java.lang.Integer var32 = new java.lang.Integer(868);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(868);
    ds.Grafo var35 = new ds.Grafo(var34);
    ds.Grafo var36 = var35.grafoTransposto();
    java.lang.Integer var37 = new java.lang.Integer(489);
    ds.Grafo.Aresta var38 = var36.primeiroListaAdj((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(868);
    ds.Grafo var40 = new ds.Grafo(var39);
    java.lang.Integer var41 = new java.lang.Integer(363);
    ds.Grafo var42 = new ds.Grafo(var41);
    java.lang.Integer var43 = new java.lang.Integer(0);
    boolean var44 = var42.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(1);
    boolean var46 = var42.listaAdjVazia((int)var45);
    java.lang.Integer var47 = new java.lang.Integer((-1));
    java.lang.Integer var48 = new java.lang.Integer(868);
    ds.Grafo var49 = new ds.Grafo(var48);
    ds.Grafo var50 = var49.grafoTransposto();
    java.lang.Integer var51 = new java.lang.Integer(0);
    boolean var52 = var50.listaAdjVazia((int)var51);
    java.lang.Integer var53 = new java.lang.Integer(1);
    boolean var54 = var50.listaAdjVazia((int)var53);
    java.lang.Integer var55 = new java.lang.Integer(2);
    boolean var56 = var50.listaAdjVazia((int)var55);
    java.lang.Integer var57 = new java.lang.Integer(3);
    boolean var58 = var50.listaAdjVazia((int)var57);
    java.lang.Integer var59 = new java.lang.Integer(4);
    boolean var60 = var50.listaAdjVazia((int)var59);
    java.lang.Integer var61 = new java.lang.Integer(5);
    boolean var62 = var50.listaAdjVazia((int)var61);
    java.lang.Integer var63 = new java.lang.Integer(6);
    boolean var64 = var50.listaAdjVazia((int)var63);
    var40.insereAresta((int)var45, (int)var47, (int)var63);
    boolean var66 = var33.existeAresta((int)var37, (int)var63);
    var9.insereAresta((int)var26, (int)var31, (int)var63);
    boolean var68 = var1.listaAdjVazia((int)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
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
    assertTrue(var31 == 652);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(363);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(652);
    ds.Grafo var5 = new ds.Grafo(var4);
    boolean var6 = var1.existeAresta((int)var2, (int)var4);
    var1.imprime();
    java.lang.Integer var8 = new java.lang.Integer(652);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(868);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
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
    java.lang.Integer var25 = new java.lang.Integer(868);
    ds.Grafo var26 = new ds.Grafo(var25);
    ds.Grafo var27 = var26.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(489);
    ds.Grafo.Aresta var29 = var27.primeiroListaAdj((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(48);
    java.lang.Integer var31 = new java.lang.Integer(312);
    java.lang.Integer var32 = new java.lang.Integer((-804));
    var27.insereAresta((int)var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(363);
    ds.Grafo var35 = new ds.Grafo(var34);
    ds.Grafo var36 = var35.grafoTransposto();
    int var37 = var36.numVertices();
    java.lang.Integer var38 = new java.lang.Integer(0);
    ds.Grafo.Aresta var39 = var36.proxAdj((int)var38);
    var9.insereAresta((int)var23, (int)var31, (int)var38);
    boolean var41 = var1.listaAdjVazia((int)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 363);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(363);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(868);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var11.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(3);
    boolean var19 = var11.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(4);
    boolean var21 = var11.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(5);
    boolean var23 = var11.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(6);
    boolean var25 = var11.listaAdjVazia((int)var24);
    var1.insereAresta((int)var6, (int)var8, (int)var24);
    java.lang.Integer var27 = new java.lang.Integer(652);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo.Aresta var29 = var1.proxAdj((int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(868);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(868);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(489);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(868);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(363);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var10.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer((-1));
    java.lang.Integer var16 = new java.lang.Integer(868);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
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
    java.lang.Integer var29 = new java.lang.Integer(5);
    boolean var30 = var18.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(6);
    boolean var32 = var18.listaAdjVazia((int)var31);
    var8.insereAresta((int)var13, (int)var15, (int)var31);
    boolean var34 = var1.existeAresta((int)var5, (int)var31);
    java.lang.Integer var35 = new java.lang.Integer(868);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(363);
    ds.Grafo var38 = new ds.Grafo(var37);
    java.lang.Integer var39 = new java.lang.Integer(0);
    boolean var40 = var38.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    boolean var42 = var38.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer((-1));
    java.lang.Integer var44 = new java.lang.Integer(868);
    ds.Grafo var45 = new ds.Grafo(var44);
    ds.Grafo var46 = var45.grafoTransposto();
    java.lang.Integer var47 = new java.lang.Integer(0);
    boolean var48 = var46.listaAdjVazia((int)var47);
    java.lang.Integer var49 = new java.lang.Integer(1);
    boolean var50 = var46.listaAdjVazia((int)var49);
    java.lang.Integer var51 = new java.lang.Integer(2);
    boolean var52 = var46.listaAdjVazia((int)var51);
    java.lang.Integer var53 = new java.lang.Integer(3);
    boolean var54 = var46.listaAdjVazia((int)var53);
    java.lang.Integer var55 = new java.lang.Integer(4);
    boolean var56 = var46.listaAdjVazia((int)var55);
    java.lang.Integer var57 = new java.lang.Integer(5);
    boolean var58 = var46.listaAdjVazia((int)var57);
    java.lang.Integer var59 = new java.lang.Integer(6);
    boolean var60 = var46.listaAdjVazia((int)var59);
    var36.insereAresta((int)var41, (int)var43, (int)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var62 = var1.proxAdj((int)var43);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
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
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(652);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var3.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var3.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(868);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
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
    boolean var21 = var2.listaAdjVazia((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 363);
    
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
    assertTrue(var21 == true);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(363);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(363);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(868);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
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
    java.lang.Integer var20 = new java.lang.Integer(5);
    boolean var21 = var9.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(6);
    boolean var23 = var9.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(652);
    ds.Grafo var25 = new ds.Grafo(var24);
    var25.imprime();
    int var27 = var25.numVertices();
    java.lang.Integer var28 = new java.lang.Integer(868);
    ds.Grafo var29 = new ds.Grafo(var28);
    java.lang.Integer var30 = new java.lang.Integer(868);
    ds.Grafo var31 = new ds.Grafo(var30);
    ds.Grafo var32 = var31.grafoTransposto();
    java.lang.Integer var33 = new java.lang.Integer(489);
    ds.Grafo.Aresta var34 = var32.primeiroListaAdj((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(868);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(363);
    ds.Grafo var38 = new ds.Grafo(var37);
    java.lang.Integer var39 = new java.lang.Integer(0);
    boolean var40 = var38.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    boolean var42 = var38.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer((-1));
    java.lang.Integer var44 = new java.lang.Integer(868);
    ds.Grafo var45 = new ds.Grafo(var44);
    ds.Grafo var46 = var45.grafoTransposto();
    java.lang.Integer var47 = new java.lang.Integer(0);
    boolean var48 = var46.listaAdjVazia((int)var47);
    java.lang.Integer var49 = new java.lang.Integer(1);
    boolean var50 = var46.listaAdjVazia((int)var49);
    java.lang.Integer var51 = new java.lang.Integer(2);
    boolean var52 = var46.listaAdjVazia((int)var51);
    java.lang.Integer var53 = new java.lang.Integer(3);
    boolean var54 = var46.listaAdjVazia((int)var53);
    java.lang.Integer var55 = new java.lang.Integer(4);
    boolean var56 = var46.listaAdjVazia((int)var55);
    java.lang.Integer var57 = new java.lang.Integer(5);
    boolean var58 = var46.listaAdjVazia((int)var57);
    java.lang.Integer var59 = new java.lang.Integer(6);
    boolean var60 = var46.listaAdjVazia((int)var59);
    var36.insereAresta((int)var41, (int)var43, (int)var59);
    boolean var62 = var29.existeAresta((int)var33, (int)var59);
    var5.insereAresta((int)var22, (int)var27, (int)var59);
    ds.Grafo.Aresta var64 = var1.primeiroListaAdj((int)var59);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 652);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == null);

  }

}
