package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
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

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 823);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
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

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    var1.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo.Aresta var6 = var5.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 823);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
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

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var5.primeiroListaAdj((int)var7);
    boolean var9 = var5.existeAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
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

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.existeAresta((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo.Aresta var10 = var9.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    var1.insereAresta((int)var4, (int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
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

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    boolean var6 = var2.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.existeAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 823);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
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
    assertTrue(var3 == 8);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    ds.Grafo.Aresta var6 = var2.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var1.primeiroListaAdj((int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
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

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    boolean var6 = var1.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
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
    assertTrue(var3 == 8);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(307);
    java.lang.Integer var4 = new java.lang.Integer((-71));
    java.lang.Integer var5 = new java.lang.Integer((-571));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 823);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var2.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(307);
    java.lang.Integer var4 = new java.lang.Integer((-71));
    java.lang.Integer var5 = new java.lang.Integer((-571));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var2.primeiroListaAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(307);
    java.lang.Integer var11 = new java.lang.Integer((-71));
    java.lang.Integer var12 = new java.lang.Integer((-571));
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var14 = new ds.Grafo(var12);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo.Aresta var8 = var7.proxAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.retiraAresta((int)var6, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(125);
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

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(125);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 125);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo.Aresta var5 = var4.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(125);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(307);
    java.lang.Integer var11 = new java.lang.Integer((-71));
    java.lang.Integer var12 = new java.lang.Integer((-571));
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var9.listaAdjVazia((int)var14);
    ds.Grafo var16 = new ds.Grafo(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(307);
    java.lang.Integer var11 = new java.lang.Integer((-71));
    java.lang.Integer var12 = new java.lang.Integer((-571));
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var9.listaAdjVazia((int)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(992);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(992);
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

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
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

    java.lang.Integer var0 = new java.lang.Integer(960);
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

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(307);
    java.lang.Integer var6 = new java.lang.Integer((-71));
    java.lang.Integer var7 = new java.lang.Integer((-571));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var4.primeiroListaAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
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

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.proxAdj((int)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo.Aresta var7 = var6.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(307);
    java.lang.Integer var6 = new java.lang.Integer((-71));
    java.lang.Integer var7 = new java.lang.Integer((-571));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    ds.Grafo.Aresta var11 = var4.primeiroListaAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
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

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(992);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 992);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(992);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test63() throws Throwable {

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

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
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

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
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

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test70() throws Throwable {

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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    var1.insereAresta((int)var8, (int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
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
    assertTrue(var2 == 745);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
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

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 960);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.proxAdj((int)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 745);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(307);
    java.lang.Integer var4 = new java.lang.Integer((-71));
    java.lang.Integer var5 = new java.lang.Integer((-571));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var1.listaAdjVazia((int)var9);
    int var11 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 823);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var3.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    var5.insereAresta((int)var3, (int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(307);
    java.lang.Integer var4 = new java.lang.Integer((-71));
    java.lang.Integer var5 = new java.lang.Integer((-571));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var1.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var2.primeiroListaAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test89() throws Throwable {

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

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
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
    assertTrue(var2 == 745);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo(var0);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    var1.insereAresta((int)var12, (int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
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

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(823);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    ds.Grafo var8 = var5.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(307);
    java.lang.Integer var10 = new java.lang.Integer((-71));
    java.lang.Integer var11 = new java.lang.Integer((-571));
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(823);
    ds.Grafo var15 = new ds.Grafo(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insereAresta((int)var11, (int)var13, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(823);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(33);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var4.listaAdjVazia((int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(745);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var12.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var12.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(823);
    ds.Grafo var18 = new ds.Grafo(var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var18.listaAdjVazia((int)var19);
    int var21 = var18.numVertices();
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Grafo.Aresta var23 = var18.primeiroListaAdj((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(745);
    ds.Grafo var25 = new ds.Grafo(var24);
    var4.insereAresta((int)var15, (int)var22, (int)var24);
    java.lang.Integer var27 = new java.lang.Integer(8);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo var29 = var28.grafoTransposto();
    int var30 = var28.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var31 = var2.retiraAresta((int)var15, (int)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 8);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(307);
    java.lang.Integer var4 = new java.lang.Integer((-71));
    java.lang.Integer var5 = new java.lang.Integer((-571));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(125);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo.Aresta var11 = var1.proxAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(823);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(33);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var15.existeAresta((int)var16, (int)var17);
    ds.Grafo var19 = var15.grafoTransposto();
    int var20 = var19.numVertices();
    java.lang.Integer var21 = new java.lang.Integer(1);
    ds.Grafo.Aresta var22 = var19.primeiroListaAdj((int)var21);
    ds.Grafo.Aresta var23 = var1.primeiroListaAdj((int)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 745);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(745);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(8);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    int var9 = var7.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(823);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(33);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var11.existeAresta((int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var11.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    ds.Grafo.Aresta var18 = var11.primeiroListaAdj((int)var17);
    ds.Grafo var19 = var11.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(307);
    java.lang.Integer var21 = new java.lang.Integer((-71));
    java.lang.Integer var22 = new java.lang.Integer((-571));
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var5, (int)var9, (int)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 745);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(8);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(823);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(823);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(33);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var9.existeAresta((int)var10, (int)var11);
    ds.Grafo var13 = var9.grafoTransposto();
    int var14 = var13.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(1);
    ds.Grafo.Aresta var16 = var13.primeiroListaAdj((int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var1.retiraAresta((int)var6, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(745);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(823);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var15.listaAdjVazia((int)var16);
    int var18 = var15.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Grafo.Aresta var20 = var15.primeiroListaAdj((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(745);
    ds.Grafo var22 = new ds.Grafo(var21);
    var1.insereAresta((int)var12, (int)var19, (int)var21);
    java.lang.Integer var24 = new java.lang.Integer(125);
    ds.Grafo var25 = new ds.Grafo(var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    boolean var27 = var25.listaAdjVazia((int)var26);
    ds.Grafo.Aresta var28 = var1.proxAdj((int)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(992);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(823);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(307);
    java.lang.Integer var8 = new java.lang.Integer((-71));
    java.lang.Integer var9 = new java.lang.Integer((-571));
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.existeAresta((int)var2, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(307);
    java.lang.Integer var4 = new java.lang.Integer((-71));
    java.lang.Integer var5 = new java.lang.Integer((-571));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    var1.imprime();

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(823);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(33);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var3.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var3.grafoTransposto();
    int var8 = var7.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(8);
    ds.Grafo var10 = new ds.Grafo(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var1.retiraAresta((int)var8, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 823);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(960);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(975);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer(1);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var4.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var4.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(823);
    ds.Grafo var18 = new ds.Grafo(var17);
    java.lang.Integer var19 = new java.lang.Integer(33);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var18.existeAresta((int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    boolean var23 = var18.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    ds.Grafo.Aresta var25 = var18.primeiroListaAdj((int)var24);
    ds.Grafo var26 = var18.grafoTransposto();
    java.lang.Integer var27 = new java.lang.Integer(307);
    java.lang.Integer var28 = new java.lang.Integer((-71));
    java.lang.Integer var29 = new java.lang.Integer((-571));
    var26.insereAresta((int)var27, (int)var28, (int)var29);
    boolean var31 = var1.existeAresta((int)var15, (int)var28);
    ds.Grafo var32 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(8);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    int var12 = var10.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(8);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(823);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    ds.Grafo var19 = var16.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(307);
    java.lang.Integer var21 = new java.lang.Integer((-71));
    java.lang.Integer var22 = new java.lang.Integer((-571));
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    boolean var25 = var19.listaAdjVazia((int)var24);
    ds.Grafo.Aresta var26 = var14.proxAdj((int)var24);
    java.lang.Integer var27 = new java.lang.Integer(8);
    ds.Grafo var28 = new ds.Grafo(var27);
    java.lang.Integer var29 = new java.lang.Integer(0);
    ds.Grafo.Aresta var30 = var28.proxAdj((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(8);
    ds.Grafo var32 = new ds.Grafo(var31);
    ds.Grafo var33 = new ds.Grafo(var31);
    boolean var34 = var14.existeAresta((int)var29, (int)var31);
    java.lang.Integer var35 = new java.lang.Integer(8);
    ds.Grafo var36 = new ds.Grafo(var35);
    var36.imprime();
    java.lang.Integer var38 = new java.lang.Integer(1);
    ds.Grafo.Aresta var39 = var36.primeiroListaAdj((int)var38);
    var1.insereAresta((int)var12, (int)var31, (int)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(823);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    ds.Grafo var9 = var6.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(307);
    java.lang.Integer var11 = new java.lang.Integer((-71));
    java.lang.Integer var12 = new java.lang.Integer((-571));
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(975);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(1);
    var15.insereAresta((int)var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(8);
    ds.Grafo var21 = new ds.Grafo(var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    ds.Grafo.Aresta var23 = var21.proxAdj((int)var22);
    var1.insereAresta((int)var10, (int)var18, (int)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 745);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    int var12 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 975);

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);
    java.lang.Integer var3 = new java.lang.Integer(823);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(823);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(33);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var6.existeAresta((int)var7, (int)var8);
    ds.Grafo var10 = var6.grafoTransposto();
    int var11 = var10.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Grafo.Aresta var13 = var10.primeiroListaAdj((int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var2.retiraAresta((int)var3, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(823);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(745);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo.Aresta var10 = var7.primeiroListaAdj((int)var8);
    java.lang.Integer var11 = new java.lang.Integer(823);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(307);
    java.lang.Integer var15 = new java.lang.Integer((-71));
    java.lang.Integer var16 = new java.lang.Integer((-571));
    var12.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var12.listaAdjVazia((int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var1.retiraAresta((int)var8, (int)var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(823);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(307);
    java.lang.Integer var6 = new java.lang.Integer((-71));
    java.lang.Integer var7 = new java.lang.Integer((-571));
    var3.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var3.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var3.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(745);
    ds.Grafo var14 = new ds.Grafo(var13);
    boolean var15 = var1.existeAresta((int)var11, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(823);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(307);
    java.lang.Integer var12 = new java.lang.Integer((-71));
    java.lang.Integer var13 = new java.lang.Integer((-571));
    var9.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(823);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(33);
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var16.existeAresta((int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var16.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Grafo.Aresta var23 = var16.primeiroListaAdj((int)var22);
    ds.Grafo var24 = var16.grafoTransposto();
    java.lang.Integer var25 = new java.lang.Integer(307);
    java.lang.Integer var26 = new java.lang.Integer((-71));
    java.lang.Integer var27 = new java.lang.Integer((-571));
    var24.insereAresta((int)var25, (int)var26, (int)var27);
    java.lang.Integer var29 = new java.lang.Integer(823);
    ds.Grafo var30 = new ds.Grafo(var29);
    ds.Grafo var31 = var30.grafoTransposto();
    java.lang.Integer var32 = new java.lang.Integer(307);
    java.lang.Integer var33 = new java.lang.Integer((-71));
    java.lang.Integer var34 = new java.lang.Integer((-571));
    var30.insereAresta((int)var32, (int)var33, (int)var34);
    java.lang.Integer var36 = new java.lang.Integer(0);
    boolean var37 = var30.listaAdjVazia((int)var36);
    java.lang.Integer var38 = new java.lang.Integer(1);
    boolean var39 = var30.listaAdjVazia((int)var38);
    java.lang.Integer var40 = new java.lang.Integer(2);
    boolean var41 = var30.listaAdjVazia((int)var40);
    var1.insereAresta((int)var11, (int)var25, (int)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(745);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo.Aresta var7 = var4.primeiroListaAdj((int)var5);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var4);
    ds.Grafo var6 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(745);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(823);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var15.listaAdjVazia((int)var16);
    int var18 = var15.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Grafo.Aresta var20 = var15.primeiroListaAdj((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(745);
    ds.Grafo var22 = new ds.Grafo(var21);
    var1.insereAresta((int)var12, (int)var19, (int)var21);
    java.lang.Integer var24 = new java.lang.Integer(823);
    ds.Grafo var25 = new ds.Grafo(var24);
    java.lang.Integer var26 = new java.lang.Integer(33);
    java.lang.Integer var27 = new java.lang.Integer(1);
    boolean var28 = var25.existeAresta((int)var26, (int)var27);
    java.lang.Integer var29 = new java.lang.Integer(1);
    boolean var30 = var25.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(1);
    ds.Grafo.Aresta var32 = var25.primeiroListaAdj((int)var31);
    ds.Grafo.Aresta var33 = var1.primeiroListaAdj((int)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(745);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    var1.imprime();
    java.lang.Integer var5 = new java.lang.Integer(745);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(823);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(33);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var8.existeAresta((int)var9, (int)var10);
    ds.Grafo var12 = var8.grafoTransposto();
    int var13 = var12.numVertices();
    java.lang.Integer var14 = new java.lang.Integer(1);
    ds.Grafo.Aresta var15 = var12.primeiroListaAdj((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(10);
    ds.Grafo var17 = new ds.Grafo(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var5, (int)var14, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(823);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(33);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(8);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(8);
    ds.Grafo var5 = new ds.Grafo(var4);
    int var6 = var5.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var5.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var5.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    ds.Grafo var13 = var11.grafoTransposto();
    int var14 = var11.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(823);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    int var19 = var16.numVertices();
    java.lang.Integer var20 = new java.lang.Integer(1);
    ds.Grafo.Aresta var21 = var16.primeiroListaAdj((int)var20);
    boolean var22 = var5.existeAresta((int)var14, (int)var20);
    java.lang.Integer var23 = new java.lang.Integer(823);
    ds.Grafo var24 = new ds.Grafo(var23);
    java.lang.Integer var25 = new java.lang.Integer(0);
    boolean var26 = var24.listaAdjVazia((int)var25);
    ds.Grafo var27 = var24.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(307);
    java.lang.Integer var29 = new java.lang.Integer((-71));
    java.lang.Integer var30 = new java.lang.Integer((-571));
    var27.insereAresta((int)var28, (int)var29, (int)var30);
    boolean var32 = var1.existeAresta((int)var20, (int)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

}
