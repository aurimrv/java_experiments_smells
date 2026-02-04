package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 102);

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
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

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var4.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(165);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(941);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var5, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(941);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var2, (int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 206);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    int var8 = var7.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    ds.Grafo.Aresta var9 = var8.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    int var7 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var4.listaAdjVazia((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    int var7 = var1.numVertices();
    ds.Grafo var8 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var8.listaAdjVazia((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
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

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 176);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(485);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(500);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var2, (int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(392);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(392);
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

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
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

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 176);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(392);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var8.primeiroListaAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    ds.Grafo var10 = var8.grafoTransposto();
    ds.Grafo var11 = new ds.Grafo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
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

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 614);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(540);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(540);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    ds.Grafo var12 = var8.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
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

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(392);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(516);
    java.lang.Integer var5 = new java.lang.Integer(41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.existeAresta((int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var1.proxAdj((int)var9);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.imprime();

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var8.listaAdjVazia((int)var12);
    ds.Grafo var14 = var8.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var8.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    ds.Grafo.Aresta var15 = var8.primeiroListaAdj((int)var14);
    boolean var16 = var8.existeAresta((int)var14, (int)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    ds.Grafo var10 = var8.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    int var13 = var10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 102);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
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
    assertTrue(var3 == 614);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
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

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
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

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    boolean var6 = var5.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo(var0);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var4.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 614);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = new ds.Grafo(var4);
    java.lang.Integer var8 = new java.lang.Integer(102);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(68);
    java.lang.Integer var13 = new java.lang.Integer(7);
    boolean var14 = var9.existeAresta((int)var12, (int)var13);
    ds.Grafo var15 = var9.grafoTransposto();
    ds.Grafo var16 = var9.grafoTransposto();
    int var17 = var16.numVertices();
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var16.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(102);
    ds.Grafo var21 = new ds.Grafo(var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var21.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(68);
    java.lang.Integer var25 = new java.lang.Integer(7);
    boolean var26 = var21.existeAresta((int)var24, (int)var25);
    ds.Grafo var27 = var21.grafoTransposto();
    ds.Grafo var28 = var21.grafoTransposto();
    int var29 = var28.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var30 = var7.retiraAresta((int)var18, (int)var29);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 102);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(102);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var4.listaAdjVazia((int)var8);
    int var10 = var4.numVertices();
    ds.Grafo.Aresta var11 = var2.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    int var7 = var1.numVertices();
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(102);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(68);
    java.lang.Integer var14 = new java.lang.Integer(7);
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    ds.Grafo var16 = var10.grafoTransposto();
    ds.Grafo var17 = var10.grafoTransposto();
    int var18 = var17.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var8.primeiroListaAdj((int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 102);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(176);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(102);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(68);
    java.lang.Integer var10 = new java.lang.Integer(7);
    boolean var11 = var6.existeAresta((int)var9, (int)var10);
    ds.Grafo var12 = var6.grafoTransposto();
    ds.Grafo var13 = var6.grafoTransposto();
    int var14 = var13.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var13.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var13.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Grafo.Aresta var20 = var13.primeiroListaAdj((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(102);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    boolean var24 = var22.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(68);
    java.lang.Integer var26 = new java.lang.Integer(7);
    boolean var27 = var22.existeAresta((int)var25, (int)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var3, (int)var19, (int)var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    ds.Grafo var10 = var8.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(176);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(392);
    ds.Grafo var16 = new ds.Grafo(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var10.existeAresta((int)var13, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(102);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(68);
    java.lang.Integer var8 = new java.lang.Integer(7);
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    ds.Grafo var11 = var4.grafoTransposto();
    int var12 = var11.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var11.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var11.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(206);
    ds.Grafo var18 = new ds.Grafo(var17);
    int var19 = var18.numVertices();
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var18.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    boolean var23 = var18.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    ds.Grafo.Aresta var25 = var18.primeiroListaAdj((int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var26 = var1.retiraAresta((int)var15, (int)var24);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var8.listaAdjVazia((int)var12);
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(206);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(392);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.retiraAresta((int)var5, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 206);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(392);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(614);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var3.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(206);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo.Aresta var8 = var3.proxAdj((int)var6);
    ds.Grafo var9 = var3.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(102);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    ds.Grafo var14 = var11.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var11.listaAdjVazia((int)var15);
    ds.Grafo var17 = var11.grafoTransposto();
    int var18 = var17.numVertices();
    ds.Grafo.Aresta var19 = var3.primeiroListaAdj((int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var1.primeiroListaAdj((int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(529);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(614);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(540);
    ds.Grafo var6 = new ds.Grafo(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var2.retiraAresta((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(102);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(68);
    java.lang.Integer var8 = new java.lang.Integer(7);
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    ds.Grafo var11 = var4.grafoTransposto();
    int var12 = var11.numVertices();
    ds.Grafo var13 = var11.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var13.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(176);
    ds.Grafo var17 = new ds.Grafo(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var18 = var1.retiraAresta((int)var14, (int)var16);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(614);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(102);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(68);
    java.lang.Integer var14 = new java.lang.Integer(7);
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    ds.Grafo var16 = var10.grafoTransposto();
    ds.Grafo var17 = var10.grafoTransposto();
    int var18 = var17.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var17.listaAdjVazia((int)var19);
    ds.Grafo var21 = new ds.Grafo(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var22 = var1.retiraAresta((int)var7, (int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(206);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    int var7 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 206);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 206);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(614);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(540);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(529);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(102);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    ds.Grafo var13 = var10.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var10.listaAdjVazia((int)var14);
    ds.Grafo var16 = var10.grafoTransposto();
    int var17 = var16.numVertices();
    ds.Grafo.Aresta var18 = var7.proxAdj((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(102);
    ds.Grafo var20 = new ds.Grafo(var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    boolean var22 = var20.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(68);
    java.lang.Integer var24 = new java.lang.Integer(7);
    boolean var25 = var20.existeAresta((int)var23, (int)var24);
    ds.Grafo var26 = var20.grafoTransposto();
    ds.Grafo var27 = var20.grafoTransposto();
    int var28 = var27.numVertices();
    java.lang.Integer var29 = new java.lang.Integer(0);
    boolean var30 = var27.listaAdjVazia((int)var29);
    var3.insereAresta((int)var4, (int)var17, (int)var29);
    ds.Grafo.Aresta var32 = var1.primeiroListaAdj((int)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(68);
    java.lang.Integer var5 = new java.lang.Integer(7);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    ds.Grafo var10 = var8.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(392);
    ds.Grafo var12 = new ds.Grafo(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var10.listaAdjVazia((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(102);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(68);
    java.lang.Integer var8 = new java.lang.Integer(7);
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    ds.Grafo var11 = var4.grafoTransposto();
    int var12 = var11.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var11.listaAdjVazia((int)var13);
    ds.Grafo var15 = new ds.Grafo(var13);
    java.lang.Integer var16 = new java.lang.Integer(100);
    boolean var17 = var1.existeAresta((int)var13, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(206);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(614);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(540);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(529);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(102);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    ds.Grafo var19 = var16.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var16.listaAdjVazia((int)var20);
    ds.Grafo var22 = var16.grafoTransposto();
    int var23 = var22.numVertices();
    ds.Grafo.Aresta var24 = var13.proxAdj((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(102);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    boolean var28 = var26.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(68);
    java.lang.Integer var30 = new java.lang.Integer(7);
    boolean var31 = var26.existeAresta((int)var29, (int)var30);
    ds.Grafo var32 = var26.grafoTransposto();
    ds.Grafo var33 = var26.grafoTransposto();
    int var34 = var33.numVertices();
    java.lang.Integer var35 = new java.lang.Integer(0);
    boolean var36 = var33.listaAdjVazia((int)var35);
    var9.insereAresta((int)var10, (int)var23, (int)var35);
    ds.Grafo.Aresta var38 = var7.primeiroListaAdj((int)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(102);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo.Aresta var5 = var2.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(614);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var4.numVertices();
    ds.Grafo var7 = var4.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var4.proxAdj((int)var8);
    boolean var10 = var1.listaAdjVazia((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(102);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(176);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(614);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(206);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    java.lang.Integer var7 = new java.lang.Integer(102);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var8.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(68);
    java.lang.Integer var12 = new java.lang.Integer(7);
    boolean var13 = var8.existeAresta((int)var11, (int)var12);
    ds.Grafo var14 = var8.grafoTransposto();
    ds.Grafo var15 = var8.grafoTransposto();
    int var16 = var15.numVertices();
    boolean var17 = var1.listaAdjVazia((int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

}
