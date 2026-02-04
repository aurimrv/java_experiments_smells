package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 578);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo.Aresta var5 = var4.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var7 = new ds.Grafo(var5);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    ds.Grafo var6 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 578);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    boolean var7 = var6.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.insereAresta((int)var7, (int)var7, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var6.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
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

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var6.primeiroListaAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
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

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 492);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    boolean var7 = var2.existeAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    boolean var9 = var2.existeAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var3.existeAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 578);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    int var4 = var2.numVertices();
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 578);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
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

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 60);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(859);
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

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(859);
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

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-333));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-333));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    boolean var8 = var1.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var1.listaAdjVazia((int)var9);
    int var11 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 492);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo.Aresta var7 = var6.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var8.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(886);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(886);
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

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    ds.Grafo var8 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var2.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 939);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-333));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var8 = var1.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var1.listaAdjVazia((int)var11);
    var2.imprime();
    
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

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var1.listaAdjVazia((int)var11);
    
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

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 492);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var9.retiraAresta((int)var7, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(859);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 859);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
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

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(859);
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

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
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

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    int var10 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var9.listaAdjVazia((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 578);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(578);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    var7.imprime();
    int var9 = var7.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(492);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(474);
    ds.Grafo.Aresta var13 = var11.proxAdj((int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var1.retiraAresta((int)var9, (int)var12);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(900);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(474);
    ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    boolean var11 = var6.existeAresta((int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(578);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    var14.imprime();
    int var16 = var14.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var1.retiraAresta((int)var10, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 939);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 578);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(60);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-333));
    java.lang.Integer var7 = new java.lang.Integer(1);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(859);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(900);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(474);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(578);
    ds.Grafo var11 = new ds.Grafo(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var2.retiraAresta((int)var7, (int)var10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(859);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(492);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var3.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var3.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(900);
    ds.Grafo var10 = new ds.Grafo(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var1.retiraAresta((int)var7, (int)var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(886);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(578);
    ds.Grafo var9 = new ds.Grafo(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var6.listaAdjVazia((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(859);
    ds.Grafo var11 = new ds.Grafo(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var9.primeiroListaAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-333));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(939);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(578);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(474);
    ds.Grafo.Aresta var7 = var5.proxAdj((int)var6);
    ds.Grafo var8 = var5.grafoTransposto();
    ds.Grafo var9 = var5.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var10.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var1.proxAdj((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 578);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    int var9 = var6.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(578);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    var12.imprime();
    int var14 = var12.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var15 = var6.proxAdj((int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 578);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(60);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-333));
    java.lang.Integer var12 = new java.lang.Integer(1);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(578);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(900);
    ds.Grafo var17 = new ds.Grafo(var16);
    var6.insereAresta((int)var10, (int)var14, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(578);
    ds.Grafo var5 = new ds.Grafo(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var2.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 492);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(939);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    var6.imprime();
    int var9 = var6.numVertices();
    ds.Grafo var10 = new ds.Grafo(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var4.listaAdjVazia((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 939);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    ds.Grafo var6 = var1.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(939);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(859);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = new ds.Grafo(var10);
    java.lang.Integer var13 = new java.lang.Integer(492);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(578);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(474);
    ds.Grafo.Aresta var18 = var16.proxAdj((int)var17);
    ds.Grafo var19 = var16.grafoTransposto();
    int var20 = var16.numVertices();
    var8.insereAresta((int)var10, (int)var13, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(578);
    ds.Grafo var23 = new ds.Grafo(var22);
    java.lang.Integer var24 = new java.lang.Integer(474);
    ds.Grafo.Aresta var25 = var23.proxAdj((int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var26 = var1.retiraAresta((int)var20, (int)var24);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(939);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Grafo.Aresta var11 = var8.proxAdj((int)var10);
    ds.Grafo.Aresta var12 = var5.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(900);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(474);
    ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    boolean var11 = var6.existeAresta((int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var4.proxAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-333));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var6 = new ds.Grafo(var3);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(578);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(474);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = var4.grafoTransposto();
    ds.Grafo var9 = var4.grafoTransposto();
    int var10 = var9.numVertices();
    ds.Grafo var11 = var9.grafoTransposto();
    int var12 = var9.numVertices();
    java.lang.Integer var13 = new java.lang.Integer(578);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(859);
    ds.Grafo var16 = new ds.Grafo(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var12, (int)var13, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 578);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(939);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var6.proxAdj((int)var8);
    ds.Grafo.Aresta var10 = var4.proxAdj((int)var8);
    java.lang.Integer var11 = new java.lang.Integer(578);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(474);
    ds.Grafo.Aresta var14 = var12.proxAdj((int)var13);
    ds.Grafo var15 = var12.grafoTransposto();
    ds.Grafo var16 = var12.grafoTransposto();
    ds.Grafo var17 = var12.grafoTransposto();
    int var18 = var17.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(939);
    ds.Grafo var20 = new ds.Grafo(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var21 = var4.retiraAresta((int)var18, (int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 578);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(60);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-333));
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo(var2);
    var6.imprime();

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(900);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(474);
    ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(578);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(474);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer((-1));
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    boolean var16 = var4.existeAresta((int)var7, (int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var17 = new ds.Grafo(var14);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(886);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    int var9 = var6.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(578);
    ds.Grafo var11 = new ds.Grafo(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var6.listaAdjVazia((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 578);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(578);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var5.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo.Aresta var5 = var2.proxAdj((int)var3);
    ds.Grafo var6 = new ds.Grafo(var3);
    ds.Grafo var7 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(578);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(474);
    ds.Grafo.Aresta var14 = var12.proxAdj((int)var13);
    ds.Grafo var15 = var12.grafoTransposto();
    ds.Grafo var16 = var12.grafoTransposto();
    ds.Grafo var17 = var16.grafoTransposto();
    int var18 = var17.numVertices();
    ds.Grafo var19 = var17.grafoTransposto();
    ds.Grafo var20 = var19.grafoTransposto();
    int var21 = var19.numVertices();
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(939);
    ds.Grafo var24 = new ds.Grafo(var23);
    ds.Grafo var25 = var24.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(1);
    ds.Grafo var27 = new ds.Grafo(var26);
    ds.Grafo.Aresta var28 = var25.proxAdj((int)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var21, (int)var22, (int)var26);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    int var5 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 578);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(900);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(474);
    ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(578);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(474);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer((-1));
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    boolean var16 = var4.existeAresta((int)var7, (int)var14);
    java.lang.Integer var17 = new java.lang.Integer(492);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var18.listaAdjVazia((int)var20);
    ds.Grafo var22 = var18.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(578);
    ds.Grafo var24 = new ds.Grafo(var23);
    java.lang.Integer var25 = new java.lang.Integer(60);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    java.lang.Integer var28 = new java.lang.Integer((-333));
    java.lang.Integer var29 = new java.lang.Integer(1);
    var26.insereAresta((int)var27, (int)var28, (int)var29);
    boolean var31 = var24.listaAdjVazia((int)var29);
    java.lang.Integer var32 = new java.lang.Integer(939);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(939);
    ds.Grafo var35 = new ds.Grafo(var34);
    ds.Grafo var36 = var35.grafoTransposto();
    java.lang.Integer var37 = new java.lang.Integer(1);
    ds.Grafo var38 = new ds.Grafo(var37);
    ds.Grafo.Aresta var39 = var36.proxAdj((int)var37);
    ds.Grafo var40 = new ds.Grafo(var37);
    var18.insereAresta((int)var29, (int)var32, (int)var37);
    java.lang.Integer var42 = new java.lang.Integer(859);
    ds.Grafo var43 = new ds.Grafo(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var44 = var4.existeAresta((int)var32, (int)var42);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    var6.imprime();
    int var9 = var6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 578);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(10);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(578);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(60);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-333));
    java.lang.Integer var12 = new java.lang.Integer(1);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    boolean var14 = var7.listaAdjVazia((int)var12);
    var1.insereAresta((int)var3, (int)var5, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var6.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(578);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(474);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    ds.Grafo var13 = var10.grafoTransposto();
    int var14 = var10.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var15 = var6.retiraAresta((int)var8, (int)var14);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 578);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 578);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(492);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(939);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(60);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-333));
    java.lang.Integer var7 = new java.lang.Integer(1);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(578);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(474);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(492);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(492);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var13.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var13.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(2);
    boolean var20 = var13.listaAdjVazia((int)var19);
    boolean var21 = var5.existeAresta((int)var10, (int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

}
