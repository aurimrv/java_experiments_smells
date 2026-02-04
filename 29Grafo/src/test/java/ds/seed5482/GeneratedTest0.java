package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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

    java.lang.Integer var0 = new java.lang.Integer(596);
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

    java.lang.Integer var0 = new java.lang.Integer(251);
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

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 251);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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
    assertTrue(var3 == 596);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 596);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
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

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    boolean var5 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(915);
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

    java.lang.Integer var0 = new java.lang.Integer(915);
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

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(170);
    boolean var5 = var1.listaAdjVazia((int)var4);
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 251);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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
    assertTrue(var2 == 596);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 251);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(915);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(115);
    java.lang.Integer var3 = new java.lang.Integer(205);
    java.lang.Integer var4 = new java.lang.Integer((-780));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    int var5 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var5, (int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 596);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 596);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    ds.Grafo var5 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 596);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(322);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    boolean var6 = var3.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(322);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    int var6 = var3.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var3.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 596);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 251);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(915);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(115);
    java.lang.Integer var3 = new java.lang.Integer(205);
    java.lang.Integer var4 = new java.lang.Integer((-780));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    assertTrue(var6 == 831);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(322);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    ds.Grafo.Aresta var7 = var6.primeiroListaAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
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
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var1.retiraAresta((int)var8, (int)var8);
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
    assertTrue(var9 == true);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(521);
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

    java.lang.Integer var0 = new java.lang.Integer(521);
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

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(322);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(322);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var3.proxAdj((int)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    ds.Grafo.Aresta var14 = var1.primeiroListaAdj((int)var12);
    
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

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
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

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 596);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 742);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 831);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var1.retiraAresta((int)var14, (int)var14);
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
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

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
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

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
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

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 596);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
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

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
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

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(170);
    boolean var5 = var1.listaAdjVazia((int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 218);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
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

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 831);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var1.retiraAresta((int)var18, (int)var18);
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

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 742);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 742);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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
    assertTrue(var6 == 218);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    var1.insereAresta((int)var6, (int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(915);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(915);
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

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    ds.Grafo.Aresta var22 = var1.proxAdj((int)var20);
    
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
    assertTrue(var22 == null);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
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

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(10);
    boolean var23 = var1.listaAdjVazia((int)var22);
    var1.insereAresta((int)var22, (int)var22, (int)var22);
    
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
    assertTrue(var23 == true);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(170);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
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

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 742);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 742);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
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

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
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

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo.Aresta var5 = var4.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
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

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(10);
    boolean var23 = var1.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(11);
    boolean var25 = var1.listaAdjVazia((int)var24);
    ds.Grafo.Aresta var26 = var1.proxAdj((int)var24);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(10);
    boolean var23 = var1.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(11);
    boolean var25 = var1.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(12);
    boolean var27 = var1.listaAdjVazia((int)var26);
    int var28 = var1.numVertices();
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 831);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(322);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    ds.Grafo.Aresta var7 = var4.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(10);
    boolean var23 = var1.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(11);
    boolean var25 = var1.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(12);
    boolean var27 = var1.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(13);
    boolean var29 = var1.listaAdjVazia((int)var28);
    ds.Grafo.Aresta var30 = var1.primeiroListaAdj((int)var28);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(322);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    int var7 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var4.listaAdjVazia((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 596);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(322);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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
    ds.Grafo.Aresta var12 = var1.proxAdj((int)var10);
    
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
    assertTrue(var12 == null);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
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

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(74);
    boolean var4 = var1.listaAdjVazia((int)var3);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(831);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var5.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var5.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var5.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var5.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var5.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var5.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(6);
    boolean var19 = var5.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(7);
    boolean var21 = var5.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(8);
    boolean var23 = var5.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(9);
    boolean var25 = var5.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(10);
    boolean var27 = var5.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(11);
    boolean var29 = var5.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(742);
    ds.Grafo var31 = new ds.Grafo(var30);
    var31.imprime();
    java.lang.Integer var33 = new java.lang.Integer(74);
    boolean var34 = var31.listaAdjVazia((int)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var35 = var2.retiraAresta((int)var28, (int)var33);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 831);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(831);
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
    java.lang.Integer var23 = new java.lang.Integer(8);
    boolean var24 = var6.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(9);
    boolean var26 = var6.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(10);
    boolean var28 = var6.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(11);
    boolean var30 = var6.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(12);
    boolean var32 = var6.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(13);
    boolean var34 = var6.listaAdjVazia((int)var33);
    boolean var35 = var2.listaAdjVazia((int)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
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
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(251);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(322);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    int var7 = var4.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(596);
    ds.Grafo var9 = new ds.Grafo(var8);
    int var10 = var9.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(831);
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
    java.lang.Integer var25 = new java.lang.Integer(6);
    boolean var26 = var12.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(7);
    boolean var28 = var12.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(596);
    ds.Grafo var30 = new ds.Grafo(var29);
    ds.Grafo var31 = var30.grafoTransposto();
    java.lang.Integer var32 = new java.lang.Integer(322);
    ds.Grafo.Aresta var33 = var31.proxAdj((int)var32);
    int var34 = var31.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var10, (int)var27, (int)var34);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 596);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 596);
    
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
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 596);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    int var5 = var2.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer(831);
    ds.Grafo var8 = new ds.Grafo(var7);
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
    java.lang.Integer var19 = new java.lang.Integer(5);
    boolean var20 = var8.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(6);
    boolean var22 = var8.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(7);
    boolean var24 = var8.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(8);
    boolean var26 = var8.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(9);
    boolean var28 = var8.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(10);
    boolean var30 = var8.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(11);
    boolean var32 = var8.listaAdjVazia((int)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var33 = var2.retiraAresta((int)var6, (int)var31);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 596);
    
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
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    var1.imprime();
    java.lang.Integer var5 = new java.lang.Integer(831);
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
    java.lang.Integer var21 = new java.lang.Integer(742);
    ds.Grafo var22 = new ds.Grafo(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var23 = var1.retiraAresta((int)var19, (int)var21);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(915);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(115);
    java.lang.Integer var3 = new java.lang.Integer(205);
    java.lang.Integer var4 = new java.lang.Integer((-780));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(218);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(251);
    ds.Grafo var6 = new ds.Grafo(var5);
    boolean var7 = var2.existeAresta((int)var3, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(831);
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
    java.lang.Integer var15 = new java.lang.Integer(5);
    boolean var16 = var4.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(6);
    boolean var18 = var4.listaAdjVazia((int)var17);
    ds.Grafo.Aresta var19 = var1.proxAdj((int)var17);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(10);
    boolean var23 = var1.listaAdjVazia((int)var22);
    ds.Grafo var24 = new ds.Grafo(var22);
    java.lang.Integer var25 = new java.lang.Integer(831);
    ds.Grafo var26 = new ds.Grafo(var25);
    ds.Grafo var27 = var26.grafoTransposto();
    int var28 = var27.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var29 = var24.listaAdjVazia((int)var28);
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 831);

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(596);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Grafo.Aresta var12 = var10.primeiroListaAdj((int)var11);
    boolean var13 = var1.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 596);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(322);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    int var7 = var4.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(251);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Grafo.Aresta var11 = var9.primeiroListaAdj((int)var10);
    ds.Grafo.Aresta var12 = var4.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 596);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(170);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(831);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(3);
    boolean var11 = var3.listaAdjVazia((int)var10);
    ds.Grafo.Aresta var12 = var1.primeiroListaAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(10);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(251);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(742);
    ds.Grafo var9 = new ds.Grafo(var8);
    var9.imprime();
    java.lang.Integer var11 = new java.lang.Integer(74);
    boolean var12 = var9.listaAdjVazia((int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var13 = var1.retiraAresta((int)var7, (int)var11);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.imprime();
    java.lang.Integer var5 = new java.lang.Integer(596);
    ds.Grafo var6 = new ds.Grafo(var5);
    int var7 = var6.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(831);
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
    java.lang.Integer var20 = new java.lang.Integer(5);
    boolean var21 = var9.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(6);
    boolean var23 = var9.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(7);
    boolean var25 = var9.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(8);
    boolean var27 = var9.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(9);
    boolean var29 = var9.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(10);
    boolean var31 = var9.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(831);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(0);
    boolean var35 = var33.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(1);
    boolean var37 = var33.listaAdjVazia((int)var36);
    java.lang.Integer var38 = new java.lang.Integer(2);
    boolean var39 = var33.listaAdjVazia((int)var38);
    java.lang.Integer var40 = new java.lang.Integer(3);
    boolean var41 = var33.listaAdjVazia((int)var40);
    java.lang.Integer var42 = new java.lang.Integer(4);
    boolean var43 = var33.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(5);
    boolean var45 = var33.listaAdjVazia((int)var44);
    java.lang.Integer var46 = new java.lang.Integer(6);
    boolean var47 = var33.listaAdjVazia((int)var46);
    java.lang.Integer var48 = new java.lang.Integer(7);
    boolean var49 = var33.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(8);
    boolean var51 = var33.listaAdjVazia((int)var50);
    java.lang.Integer var52 = new java.lang.Integer(9);
    boolean var53 = var33.listaAdjVazia((int)var52);
    java.lang.Integer var54 = new java.lang.Integer(10);
    boolean var55 = var33.listaAdjVazia((int)var54);
    java.lang.Integer var56 = new java.lang.Integer(11);
    boolean var57 = var33.listaAdjVazia((int)var56);
    java.lang.Integer var58 = new java.lang.Integer(12);
    boolean var59 = var33.listaAdjVazia((int)var58);
    java.lang.Integer var60 = new java.lang.Integer(13);
    boolean var61 = var33.listaAdjVazia((int)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var7, (int)var30, (int)var60);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 596);
    
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
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(596);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(170);
    boolean var8 = var4.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(831);
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
    java.lang.Integer var27 = new java.lang.Integer(8);
    boolean var28 = var10.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(9);
    boolean var30 = var10.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(10);
    boolean var32 = var10.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(11);
    boolean var34 = var10.listaAdjVazia((int)var33);
    boolean var35 = var2.existeAresta((int)var7, (int)var33);
    java.lang.Integer var36 = new java.lang.Integer(596);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(1);
    ds.Grafo.Aresta var39 = var37.primeiroListaAdj((int)var38);
    ds.Grafo.Aresta var40 = var2.proxAdj((int)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
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
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(10);
    boolean var23 = var1.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(11);
    boolean var25 = var1.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(12);
    boolean var27 = var1.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(915);
    ds.Grafo var29 = new ds.Grafo(var28);
    java.lang.Integer var30 = new java.lang.Integer(115);
    java.lang.Integer var31 = new java.lang.Integer(205);
    java.lang.Integer var32 = new java.lang.Integer((-780));
    var29.insereAresta((int)var30, (int)var31, (int)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var34 = var1.primeiroListaAdj((int)var32);
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(322);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(831);
    ds.Grafo var7 = new ds.Grafo(var6);
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
    java.lang.Integer var18 = new java.lang.Integer(5);
    boolean var19 = var7.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(6);
    boolean var21 = var7.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(7);
    boolean var23 = var7.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(8);
    boolean var25 = var7.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(9);
    boolean var27 = var7.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(831);
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
    java.lang.Integer var48 = new java.lang.Integer(9);
    boolean var49 = var29.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(10);
    boolean var51 = var29.listaAdjVazia((int)var50);
    java.lang.Integer var52 = new java.lang.Integer(11);
    boolean var53 = var29.listaAdjVazia((int)var52);
    java.lang.Integer var54 = new java.lang.Integer(12);
    boolean var55 = var29.listaAdjVazia((int)var54);
    java.lang.Integer var56 = new java.lang.Integer((-1));
    boolean var57 = var7.existeAresta((int)var54, (int)var56);
    java.lang.Integer var58 = new java.lang.Integer(915);
    ds.Grafo var59 = new ds.Grafo(var58);
    java.lang.Integer var60 = new java.lang.Integer(115);
    java.lang.Integer var61 = new java.lang.Integer(205);
    java.lang.Integer var62 = new java.lang.Integer((-780));
    var59.insereAresta((int)var60, (int)var61, (int)var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var64 = var3.existeAresta((int)var56, (int)var61);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test125() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(251);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Grafo.Aresta var11 = var9.primeiroListaAdj((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(742);
    ds.Grafo var13 = new ds.Grafo(var12);
    var13.imprime();
    java.lang.Integer var15 = new java.lang.Integer(74);
    boolean var16 = var13.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(10);
    java.lang.Integer var18 = new java.lang.Integer(831);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var19.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    boolean var23 = var19.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(2);
    boolean var25 = var19.listaAdjVazia((int)var24);
    boolean var26 = var13.existeAresta((int)var17, (int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var27 = var1.retiraAresta((int)var10, (int)var17);
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
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test126() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(521);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(915);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(115);
    java.lang.Integer var13 = new java.lang.Integer(205);
    java.lang.Integer var14 = new java.lang.Integer((-780));
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(596);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    ds.Grafo var19 = var17.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(322);
    ds.Grafo.Aresta var21 = var19.proxAdj((int)var20);
    boolean var22 = var11.listaAdjVazia((int)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var1.existeAresta((int)var8, (int)var20);
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
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test127() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var16 = new java.lang.Integer(596);
    ds.Grafo var17 = new ds.Grafo(var16);
    java.lang.Integer var18 = new java.lang.Integer(1);
    ds.Grafo.Aresta var19 = var17.primeiroListaAdj((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(170);
    boolean var21 = var17.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(915);
    ds.Grafo var23 = new ds.Grafo(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var24 = var1.retiraAresta((int)var20, (int)var22);
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test128() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(831);
    ds.Grafo var3 = new ds.Grafo(var2);
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
    java.lang.Integer var14 = new java.lang.Integer(5);
    boolean var15 = var3.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(6);
    boolean var17 = var3.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(7);
    boolean var19 = var3.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(8);
    boolean var21 = var3.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(9);
    boolean var23 = var3.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(10);
    boolean var25 = var3.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(11);
    boolean var27 = var3.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(12);
    boolean var29 = var3.listaAdjVazia((int)var28);
    ds.Grafo.Aresta var30 = var1.primeiroListaAdj((int)var28);
    java.lang.Integer var31 = new java.lang.Integer(915);
    ds.Grafo var32 = new ds.Grafo(var31);
    java.lang.Integer var33 = new java.lang.Integer(115);
    java.lang.Integer var34 = new java.lang.Integer(205);
    java.lang.Integer var35 = new java.lang.Integer((-780));
    var32.insereAresta((int)var33, (int)var34, (int)var35);
    ds.Grafo.Aresta var37 = var1.primeiroListaAdj((int)var33);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);

  }

  public void test129() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(831);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(3);
    boolean var11 = var3.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(251);
    ds.Grafo var13 = new ds.Grafo(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var1.retiraAresta((int)var10, (int)var12);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
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

  }

  public void test130() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(170);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(251);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var7.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(170);
    boolean var11 = var7.listaAdjVazia((int)var10);
    ds.Grafo.Aresta var12 = var1.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test131() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(915);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(115);
    java.lang.Integer var7 = new java.lang.Integer(205);
    java.lang.Integer var8 = new java.lang.Integer((-780));
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var5.proxAdj((int)var10);
    ds.Grafo.Aresta var12 = var3.primeiroListaAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test132() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(251);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test133() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(74);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(831);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var7.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var7.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(2);
    boolean var13 = var7.listaAdjVazia((int)var12);
    boolean var14 = var1.existeAresta((int)var5, (int)var12);
    ds.Grafo var15 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test134() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(218);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    int var10 = var1.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(251);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Grafo.Aresta var14 = var12.primeiroListaAdj((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(170);
    boolean var16 = var12.listaAdjVazia((int)var15);
    boolean var17 = var1.listaAdjVazia((int)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 218);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test135() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(322);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test136() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(788);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(251);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    boolean var7 = var1.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test137() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(831);
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
    java.lang.Integer var22 = new java.lang.Integer(596);
    ds.Grafo var23 = new ds.Grafo(var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    ds.Grafo.Aresta var25 = var23.primeiroListaAdj((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(251);
    ds.Grafo var27 = new ds.Grafo(var26);
    ds.Grafo var28 = var27.grafoTransposto();
    int var29 = var28.numVertices();
    int var30 = var28.numVertices();
    ds.Grafo.Aresta var31 = var23.proxAdj((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(596);
    ds.Grafo var33 = new ds.Grafo(var32);
    ds.Grafo var34 = var33.grafoTransposto();
    ds.Grafo var35 = var33.grafoTransposto();
    java.lang.Integer var36 = new java.lang.Integer(322);
    ds.Grafo.Aresta var37 = var35.proxAdj((int)var36);
    int var38 = var35.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var39 = var1.retiraAresta((int)var30, (int)var38);
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
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 596);

  }

  public void test138() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(251);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(742);
    ds.Grafo var5 = new ds.Grafo(var4);
    var5.imprime();
    java.lang.Integer var7 = new java.lang.Integer(74);
    boolean var8 = var5.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer(831);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var11.listaAdjVazia((int)var16);
    boolean var18 = var5.existeAresta((int)var9, (int)var16);
    ds.Grafo.Aresta var19 = var1.proxAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test139() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(831);
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
    java.lang.Integer var15 = new java.lang.Integer(5);
    boolean var16 = var4.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(6);
    boolean var18 = var4.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(7);
    boolean var20 = var4.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(8);
    boolean var22 = var4.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(9);
    boolean var24 = var4.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(10);
    boolean var26 = var4.listaAdjVazia((int)var25);
    ds.Grafo var27 = new ds.Grafo(var25);
    java.lang.Integer var28 = new java.lang.Integer(596);
    ds.Grafo var29 = new ds.Grafo(var28);
    ds.Grafo var30 = var29.grafoTransposto();
    ds.Grafo var31 = var29.grafoTransposto();
    ds.Grafo var32 = var29.grafoTransposto();
    java.lang.Integer var33 = new java.lang.Integer(218);
    ds.Grafo var34 = new ds.Grafo(var33);
    java.lang.Integer var35 = new java.lang.Integer(0);
    boolean var36 = var34.listaAdjVazia((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(1);
    boolean var38 = var34.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(2);
    boolean var40 = var34.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(3);
    boolean var42 = var34.listaAdjVazia((int)var41);
    ds.Grafo.Aresta var43 = var29.proxAdj((int)var41);
    java.lang.Integer var44 = new java.lang.Integer(831);
    ds.Grafo var45 = new ds.Grafo(var44);
    java.lang.Integer var46 = new java.lang.Integer(0);
    boolean var47 = var45.listaAdjVazia((int)var46);
    java.lang.Integer var48 = new java.lang.Integer(1);
    boolean var49 = var45.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(2);
    boolean var51 = var45.listaAdjVazia((int)var50);
    java.lang.Integer var52 = new java.lang.Integer(3);
    boolean var53 = var45.listaAdjVazia((int)var52);
    java.lang.Integer var54 = new java.lang.Integer(4);
    boolean var55 = var45.listaAdjVazia((int)var54);
    java.lang.Integer var56 = new java.lang.Integer(5);
    boolean var57 = var45.listaAdjVazia((int)var56);
    java.lang.Integer var58 = new java.lang.Integer(6);
    boolean var59 = var45.listaAdjVazia((int)var58);
    var2.insereAresta((int)var25, (int)var41, (int)var58);
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test140() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(74);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test141() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(596);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();

  }

}
