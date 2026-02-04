package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
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

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 731);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
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

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 731);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var2.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 169);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(473);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-543));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var2, (int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(338);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
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

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 719);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
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

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
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

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
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

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var3.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.listaAdjVazia((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 719);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    var1.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 883);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-28));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var3.existeAresta((int)var5, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 169);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var3.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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
    assertTrue(var2 == 0);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    boolean var5 = var4.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
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

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.existeAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 94);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
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

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    int var7 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 883);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 883);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
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

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(338);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
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

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(338);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(593);
    boolean var5 = var1.listaAdjVazia((int)var4);
    boolean var6 = var1.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(338);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(593);
    boolean var5 = var1.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
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

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var3, (int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 169);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-28));
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    int var6 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var2.listaAdjVazia((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 731);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-28));
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    int var6 = var2.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    ds.Grafo.Aresta var9 = var2.primeiroListaAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 731);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insereAresta((int)var2, (int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var4.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var4.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var3, (int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 883);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 883);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var3.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
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

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(940);
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

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(940);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 94);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    boolean var7 = var1.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
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

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-28));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-28));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var2.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
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

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-28));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.existeAresta((int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-28));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    int var8 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var4.existeAresta((int)var8, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 731);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-28));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    int var8 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 731);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 731);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(710);
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

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(710);
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

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-28));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    int var6 = var1.numVertices();
    ds.Grafo var7 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 719);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 94);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
    boolean var6 = var2.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(94);
    ds.Grafo var3 = new ds.Grafo(var2);
    int var4 = var3.numVertices();
    boolean var5 = var1.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(719);
    ds.Grafo var4 = new ds.Grafo(var3);
    var4.imprime();
    int var6 = var4.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    ds.Grafo.Aresta var10 = var1.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(731);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer((-28));
    boolean var10 = var7.existeAresta((int)var8, (int)var9);
    int var11 = var7.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(0);
    ds.Grafo.Aresta var13 = var7.proxAdj((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(710);
    ds.Grafo var15 = new ds.Grafo(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var4.retiraAresta((int)var12, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(169);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    int var9 = var7.numVertices();
    java.lang.Integer var10 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var4.existeAresta((int)var9, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 169);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-28));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(883);
    ds.Grafo var8 = new ds.Grafo(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 719);

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(731);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    int var8 = var6.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var6.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(731);
    ds.Grafo var12 = new ds.Grafo(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var3.existeAresta((int)var9, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 169);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(731);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    int var6 = var3.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var3.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo.Aresta var11 = var3.proxAdj((int)var9);
    java.lang.Integer var12 = new java.lang.Integer(731);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    int var15 = var13.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var1.retiraAresta((int)var9, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 731);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(883);
    ds.Grafo var5 = new ds.Grafo(var4);
    var5.imprime();
    int var7 = var5.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(169);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    int var12 = var9.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Grafo var14 = new ds.Grafo(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insereAresta((int)var7, (int)var12, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 883);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 169);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(883);
    ds.Grafo var4 = new ds.Grafo(var3);
    var4.imprime();
    int var6 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var2.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 883);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(731);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 731);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(731);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(731);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    ds.Grafo var9 = var6.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-28));
    boolean var12 = var9.existeAresta((int)var10, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var2.existeAresta((int)var3, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(719);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(94);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    int var10 = var8.numVertices();
    int var11 = var8.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(731);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    int var15 = var13.numVertices();
    java.lang.Integer var16 = new java.lang.Integer((-1));
    var5.insereAresta((int)var11, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(731);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var19.listaAdjVazia((int)var20);
    ds.Grafo var22 = var19.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(0);
    boolean var24 = var22.listaAdjVazia((int)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var25 = var1.retiraAresta((int)var15, (int)var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 94);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(169);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(94);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    int var10 = var8.numVertices();
    boolean var11 = var5.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(719);
    ds.Grafo var13 = new ds.Grafo(var12);
    var13.imprime();
    int var15 = var13.numVertices();
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var13.existeAresta((int)var16, (int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var1.retiraAresta((int)var10, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(883);
    ds.Grafo var4 = new ds.Grafo(var3);
    var4.imprime();
    java.lang.Integer var6 = new java.lang.Integer(719);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer((-28));
    boolean var11 = var7.existeAresta((int)var9, (int)var10);
    int var12 = var7.numVertices();
    boolean var13 = var4.listaAdjVazia((int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var2.listaAdjVazia((int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(710);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var7);
    java.lang.Integer var10 = new java.lang.Integer(731);
    ds.Grafo var11 = new ds.Grafo(var10);
    int var12 = var11.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.listaAdjVazia((int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 731);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(731);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    int var8 = var7.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(731);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    int var13 = var10.numVertices();
    java.lang.Integer var14 = new java.lang.Integer(0);
    ds.Grafo.Aresta var15 = var10.proxAdj((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(710);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo.Aresta var18 = var10.primeiroListaAdj((int)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var1.retiraAresta((int)var8, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(731);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Grafo var11 = new ds.Grafo(var10);
    int var12 = var11.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(719);
    ds.Grafo var14 = new ds.Grafo(var13);
    var14.imprime();
    int var16 = var14.numVertices();
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var14.existeAresta((int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(731);
    ds.Grafo var21 = new ds.Grafo(var20);
    var9.insereAresta((int)var12, (int)var17, (int)var20);
    java.lang.Integer var23 = new java.lang.Integer(731);
    ds.Grafo var24 = new ds.Grafo(var23);
    ds.Grafo var25 = var24.grafoTransposto();
    int var26 = var25.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var4.existeAresta((int)var20, (int)var26);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 731);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(883);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(940);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(731);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.retiraAresta((int)var2, (int)var7);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 731);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(719);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(94);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var9.numVertices();
    int var12 = var9.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(731);
    ds.Grafo var14 = new ds.Grafo(var13);
    ds.Grafo var15 = var14.grafoTransposto();
    int var16 = var14.numVertices();
    java.lang.Integer var17 = new java.lang.Integer((-1));
    var6.insereAresta((int)var12, (int)var16, (int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var1.primeiroListaAdj((int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 731);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 94);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(719);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    int var5 = var3.numVertices();
    boolean var6 = var1.listaAdjVazia((int)var5);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(169);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(94);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var4.numVertices();
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(731);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var9.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(169);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var13.listaAdjVazia((int)var14);
    int var16 = var13.numVertices();
    int var17 = var13.numVertices();
    ds.Grafo.Aresta var18 = var9.primeiroListaAdj((int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var1.primeiroListaAdj((int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 94);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(94);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var4.numVertices();
    int var7 = var4.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(731);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var9.numVertices();
    java.lang.Integer var12 = new java.lang.Integer((-1));
    var1.insereAresta((int)var7, (int)var11, (int)var12);
    int var14 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 731);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 719);

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(94);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(731);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(719);
    ds.Grafo var8 = new ds.Grafo(var7);
    var8.imprime();
    int var10 = var8.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var8.existeAresta((int)var11, (int)var12);
    ds.Grafo.Aresta var14 = var6.proxAdj((int)var11);
    boolean var15 = var3.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(719);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(94);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var4.numVertices();
    int var7 = var4.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(731);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var9.numVertices();
    java.lang.Integer var12 = new java.lang.Integer((-1));
    var1.insereAresta((int)var7, (int)var11, (int)var12);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 731);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(169);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    int var6 = var3.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var3.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(883);
    ds.Grafo var10 = new ds.Grafo(var9);
    var10.imprime();
    java.lang.Integer var12 = new java.lang.Integer(719);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-28));
    boolean var17 = var13.existeAresta((int)var15, (int)var16);
    int var18 = var13.numVertices();
    boolean var19 = var10.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(10);
    var1.insereAresta((int)var7, (int)var18, (int)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 719);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(169);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    ds.Grafo var8 = var5.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(169);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(883);
    ds.Grafo var14 = new ds.Grafo(var13);
    var14.imprime();
    int var16 = var14.numVertices();
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var14.existeAresta((int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(169);
    ds.Grafo var21 = new ds.Grafo(var20);
    ds.Grafo var22 = var21.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(94);
    ds.Grafo var24 = new ds.Grafo(var23);
    ds.Grafo var25 = var24.grafoTransposto();
    int var26 = var24.numVertices();
    boolean var27 = var21.listaAdjVazia((int)var26);
    var8.insereAresta((int)var11, (int)var18, (int)var26);
    java.lang.Integer var29 = new java.lang.Integer(94);
    ds.Grafo var30 = new ds.Grafo(var29);
    boolean var31 = var3.existeAresta((int)var26, (int)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 883);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

}
