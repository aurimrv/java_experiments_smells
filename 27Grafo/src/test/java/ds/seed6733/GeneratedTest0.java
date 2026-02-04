package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
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

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 902);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-317));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var3.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-317));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var6, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 330);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    assertTrue(var6 == 931);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 314);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    ds.Grafo var5 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
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

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
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

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-317));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
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

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 776);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 776);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
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

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var1.primeiroListaAdj((int)var8);
    
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 776);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 926);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
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

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var4.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 776);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 776);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
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

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
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
    assertTrue(var2 == 937);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 314);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
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

    java.lang.Integer var0 = new java.lang.Integer(538);
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

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
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

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 538);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
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

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var5.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 314);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 314);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 330);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    ds.Grafo var14 = var1.grafoTransposto();
    
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

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(942);
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

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(942);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 931);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    int var11 = var10.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var10.existeAresta((int)var11, (int)var11);
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
    assertTrue(var11 == 931);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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
    assertTrue(var3 == 776);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 902);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(594);
    java.lang.Integer var3 = new java.lang.Integer((-500));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    ds.Grafo var16 = var1.grafoTransposto();
    
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

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    int var18 = var1.numVertices();
    
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
    assertTrue(var18 == 931);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    ds.Grafo var20 = var1.grafoTransposto();
    
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

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    int var22 = var1.numVertices();
    
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
    assertTrue(var22 == 931);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
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

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(942);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(942);
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

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(942);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(594);
    java.lang.Integer var3 = new java.lang.Integer((-500));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    var1.insereAresta((int)var4, (int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
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

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 776);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
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

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 931);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
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

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
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

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    ds.Grafo var26 = new ds.Grafo(var24);
    
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

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 902);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(462);
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

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(462);
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

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var1.primeiroListaAdj((int)var8);
    
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

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(931);
    ds.Grafo var5 = new ds.Grafo(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 902);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(320);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(776);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(931);
    ds.Grafo var8 = new ds.Grafo(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var3, (int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(942);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(926);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(931);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var7.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var7.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(2);
    boolean var13 = var7.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(3);
    boolean var15 = var7.listaAdjVazia((int)var14);
    ds.Grafo var16 = var7.grafoTransposto();
    int var17 = var16.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var2, (int)var4, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 931);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(942);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(594);
    java.lang.Integer var6 = new java.lang.Integer((-500));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var2.primeiroListaAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(931);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(314);
    ds.Grafo var9 = new ds.Grafo(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var5.retiraAresta((int)var6, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(776);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var4.listaAdjVazia((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 776);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 776);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(942);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(594);
    java.lang.Integer var6 = new java.lang.Integer((-500));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(538);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(931);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var12.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var12.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(2);
    boolean var18 = var12.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(3);
    boolean var20 = var12.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(330);
    ds.Grafo var22 = new ds.Grafo(var21);
    ds.Grafo var23 = var22.grafoTransposto();
    int var24 = var23.numVertices();
    java.lang.Integer var25 = new java.lang.Integer(926);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(594);
    java.lang.Integer var28 = new java.lang.Integer((-500));
    boolean var29 = var26.existeAresta((int)var27, (int)var28);
    var10.insereAresta((int)var19, (int)var24, (int)var28);
    java.lang.Integer var31 = new java.lang.Integer(538);
    ds.Grafo var32 = new ds.Grafo(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var6, (int)var19, (int)var31);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 937);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(931);
    ds.Grafo var3 = new ds.Grafo(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.listaAdjVazia((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(314);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    int var5 = var3.numVertices();
    ds.Grafo.Aresta var6 = var1.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);
    java.lang.Integer var3 = new java.lang.Integer(931);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var4.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var4.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(931);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var12.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var12.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(2);
    boolean var18 = var12.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(3);
    boolean var20 = var12.listaAdjVazia((int)var19);
    ds.Grafo var21 = var12.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(931);
    ds.Grafo var23 = new ds.Grafo(var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    boolean var25 = var23.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(1);
    boolean var27 = var23.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(2);
    boolean var29 = var23.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(3);
    boolean var31 = var23.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(4);
    boolean var33 = var23.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(5);
    boolean var35 = var23.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(931);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(0);
    boolean var39 = var37.listaAdjVazia((int)var38);
    java.lang.Integer var40 = new java.lang.Integer(1);
    boolean var41 = var37.listaAdjVazia((int)var40);
    java.lang.Integer var42 = new java.lang.Integer(2);
    boolean var43 = var37.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(3);
    boolean var45 = var37.listaAdjVazia((int)var44);
    java.lang.Integer var46 = new java.lang.Integer(4);
    boolean var47 = var37.listaAdjVazia((int)var46);
    java.lang.Integer var48 = new java.lang.Integer(5);
    boolean var49 = var37.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(6);
    boolean var51 = var37.listaAdjVazia((int)var50);
    java.lang.Integer var52 = new java.lang.Integer(7);
    boolean var53 = var37.listaAdjVazia((int)var52);
    boolean var54 = var23.listaAdjVazia((int)var52);
    java.lang.Integer var55 = new java.lang.Integer(10);
    java.lang.Integer var56 = new java.lang.Integer(330);
    ds.Grafo var57 = new ds.Grafo(var56);
    java.lang.Integer var58 = new java.lang.Integer(1);
    java.lang.Integer var59 = new java.lang.Integer(0);
    java.lang.Integer var60 = new java.lang.Integer((-317));
    var57.insereAresta((int)var58, (int)var59, (int)var60);
    int var62 = var57.numVertices();
    java.lang.Integer var63 = new java.lang.Integer(1);
    boolean var64 = var57.listaAdjVazia((int)var63);
    var12.insereAresta((int)var52, (int)var55, (int)var63);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var66 = var2.retiraAresta((int)var9, (int)var63);
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
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
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
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(330);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-317));
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(931);
    ds.Grafo var11 = new ds.Grafo(var10);
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
    java.lang.Integer var24 = new java.lang.Integer(931);
    ds.Grafo var25 = new ds.Grafo(var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    boolean var27 = var25.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(1);
    boolean var29 = var25.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(2);
    boolean var31 = var25.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(3);
    boolean var33 = var25.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(4);
    boolean var35 = var25.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(5);
    boolean var37 = var25.listaAdjVazia((int)var36);
    java.lang.Integer var38 = new java.lang.Integer(6);
    boolean var39 = var25.listaAdjVazia((int)var38);
    java.lang.Integer var40 = new java.lang.Integer(7);
    boolean var41 = var25.listaAdjVazia((int)var40);
    boolean var42 = var11.listaAdjVazia((int)var40);
    int var43 = var11.numVertices();
    boolean var44 = var3.existeAresta((int)var7, (int)var43);
    
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
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
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
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 931);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(931);
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
    java.lang.Integer var25 = new java.lang.Integer(931);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    boolean var28 = var26.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(1);
    boolean var30 = var26.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(2);
    boolean var32 = var26.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(3);
    boolean var34 = var26.listaAdjVazia((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(4);
    boolean var36 = var26.listaAdjVazia((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(5);
    boolean var38 = var26.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(6);
    boolean var40 = var26.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(7);
    boolean var42 = var26.listaAdjVazia((int)var41);
    boolean var43 = var12.listaAdjVazia((int)var41);
    java.lang.Integer var44 = new java.lang.Integer(10);
    java.lang.Integer var45 = new java.lang.Integer(330);
    ds.Grafo var46 = new ds.Grafo(var45);
    java.lang.Integer var47 = new java.lang.Integer(1);
    java.lang.Integer var48 = new java.lang.Integer(0);
    java.lang.Integer var49 = new java.lang.Integer((-317));
    var46.insereAresta((int)var47, (int)var48, (int)var49);
    int var51 = var46.numVertices();
    java.lang.Integer var52 = new java.lang.Integer(1);
    boolean var53 = var46.listaAdjVazia((int)var52);
    var1.insereAresta((int)var41, (int)var44, (int)var52);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
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
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(902);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(931);
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
    java.lang.Integer var23 = new java.lang.Integer(926);
    ds.Grafo var24 = new ds.Grafo(var23);
    boolean var25 = var1.existeAresta((int)var21, (int)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 902);
    
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
    assertTrue(var25 == false);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(942);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(931);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(3);
    boolean var11 = var3.listaAdjVazia((int)var10);
    ds.Grafo var12 = var3.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(931);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var14.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var14.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(2);
    boolean var20 = var14.listaAdjVazia((int)var19);
    ds.Grafo.Aresta var21 = var12.proxAdj((int)var19);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var12.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(931);
    ds.Grafo var25 = new ds.Grafo(var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    boolean var27 = var25.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(1);
    boolean var29 = var25.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(2);
    boolean var31 = var25.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(3);
    boolean var33 = var25.listaAdjVazia((int)var32);
    ds.Grafo var34 = var25.grafoTransposto();
    java.lang.Integer var35 = new java.lang.Integer(931);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(0);
    boolean var38 = var36.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(1);
    boolean var40 = var36.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(2);
    boolean var42 = var36.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(3);
    boolean var44 = var36.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(4);
    boolean var46 = var36.listaAdjVazia((int)var45);
    java.lang.Integer var47 = new java.lang.Integer(5);
    boolean var48 = var36.listaAdjVazia((int)var47);
    java.lang.Integer var49 = new java.lang.Integer(931);
    ds.Grafo var50 = new ds.Grafo(var49);
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
    java.lang.Integer var65 = new java.lang.Integer(7);
    boolean var66 = var50.listaAdjVazia((int)var65);
    boolean var67 = var36.listaAdjVazia((int)var65);
    java.lang.Integer var68 = new java.lang.Integer(10);
    java.lang.Integer var69 = new java.lang.Integer(330);
    ds.Grafo var70 = new ds.Grafo(var69);
    java.lang.Integer var71 = new java.lang.Integer(1);
    java.lang.Integer var72 = new java.lang.Integer(0);
    java.lang.Integer var73 = new java.lang.Integer((-317));
    var70.insereAresta((int)var71, (int)var72, (int)var73);
    int var75 = var70.numVertices();
    java.lang.Integer var76 = new java.lang.Integer(1);
    boolean var77 = var70.listaAdjVazia((int)var76);
    var25.insereAresta((int)var65, (int)var68, (int)var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var79 = var1.retiraAresta((int)var22, (int)var76);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
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
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(931);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var12.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var12.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(2);
    boolean var18 = var12.listaAdjVazia((int)var17);
    ds.Grafo.Aresta var19 = var10.proxAdj((int)var17);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var10.listaAdjVazia((int)var20);
    int var22 = var10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 931);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    java.lang.Integer var26 = new java.lang.Integer(931);
    ds.Grafo var27 = new ds.Grafo(var26);
    java.lang.Integer var28 = new java.lang.Integer(0);
    boolean var29 = var27.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(1);
    boolean var31 = var27.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(320);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(330);
    ds.Grafo var35 = new ds.Grafo(var34);
    java.lang.Integer var36 = new java.lang.Integer(776);
    ds.Grafo var37 = new ds.Grafo(var36);
    ds.Grafo var38 = var37.grafoTransposto();
    int var39 = var37.numVertices();
    var27.insereAresta((int)var32, (int)var34, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(776);
    ds.Grafo var42 = new ds.Grafo(var41);
    ds.Grafo var43 = var42.grafoTransposto();
    int var44 = var42.numVertices();
    java.lang.Integer var45 = new java.lang.Integer(937);
    ds.Grafo var46 = new ds.Grafo(var45);
    int var47 = var46.numVertices();
    boolean var48 = var27.existeAresta((int)var44, (int)var47);
    java.lang.Integer var49 = new java.lang.Integer(776);
    ds.Grafo var50 = new ds.Grafo(var49);
    ds.Grafo var51 = var50.grafoTransposto();
    int var52 = var50.numVertices();
    java.lang.Integer var53 = new java.lang.Integer(314);
    ds.Grafo var54 = new ds.Grafo(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var47, (int)var52, (int)var53);
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 776);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 776);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 937);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 776);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
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
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 776);

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(320);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var1.insereAresta((int)var3, (int)var5, (int)var6);

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(931);
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
    java.lang.Integer var28 = new java.lang.Integer(314);
    ds.Grafo var29 = new ds.Grafo(var28);
    var29.imprime();
    ds.Grafo var31 = var29.grafoTransposto();
    int var32 = var31.numVertices();
    boolean var33 = var1.existeAresta((int)var26, (int)var32);
    var1.imprime();
    
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
    assertTrue(var32 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(926);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(330);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var4.numVertices();
    boolean var6 = var1.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(462);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(931);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(320);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(330);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(776);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    int var15 = var13.numVertices();
    var3.insereAresta((int)var8, (int)var10, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(776);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    int var20 = var18.numVertices();
    java.lang.Integer var21 = new java.lang.Integer(937);
    ds.Grafo var22 = new ds.Grafo(var21);
    int var23 = var22.numVertices();
    boolean var24 = var3.existeAresta((int)var20, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(776);
    ds.Grafo var26 = new ds.Grafo(var25);
    ds.Grafo var27 = var26.grafoTransposto();
    int var28 = var26.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var29 = var1.retiraAresta((int)var23, (int)var28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 776);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 776);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 937);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 776);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(926);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(594);
    java.lang.Integer var14 = new java.lang.Integer((-500));
    boolean var15 = var12.existeAresta((int)var13, (int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var1.primeiroListaAdj((int)var14);
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
    assertTrue(var15 == false);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(320);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(330);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(776);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    int var13 = var11.numVertices();
    var1.insereAresta((int)var6, (int)var8, (int)var13);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 776);

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    var2.imprime();

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);
    java.lang.Integer var3 = new java.lang.Integer(942);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(594);
    java.lang.Integer var6 = new java.lang.Integer((-500));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(931);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(931);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(2);
    boolean var17 = var11.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(3);
    boolean var19 = var11.listaAdjVazia((int)var18);
    ds.Grafo var20 = var11.grafoTransposto();
    java.lang.Integer var21 = new java.lang.Integer(931);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    boolean var24 = var22.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(1);
    boolean var26 = var22.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(2);
    boolean var28 = var22.listaAdjVazia((int)var27);
    ds.Grafo.Aresta var29 = var20.proxAdj((int)var27);
    ds.Grafo var30 = new ds.Grafo(var27);
    boolean var31 = var4.existeAresta((int)var8, (int)var27);
    java.lang.Integer var32 = new java.lang.Integer(902);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(926);
    ds.Grafo var35 = new ds.Grafo(var34);
    java.lang.Integer var36 = new java.lang.Integer(594);
    java.lang.Integer var37 = new java.lang.Integer((-500));
    boolean var38 = var35.existeAresta((int)var36, (int)var37);
    var2.insereAresta((int)var27, (int)var32, (int)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(538);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 538);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 538);

  }

  public void test125() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 314);

  }

  public void test126() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(330);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-317));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo(var3);

  }

  public void test127() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(3);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(10);
    ds.Grafo.Aresta var13 = var11.primeiroListaAdj((int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test128() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(776);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(538);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test129() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(538);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(931);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var10.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var10.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(2);
    boolean var16 = var10.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(3);
    boolean var18 = var10.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(330);
    ds.Grafo var20 = new ds.Grafo(var19);
    ds.Grafo var21 = var20.grafoTransposto();
    int var22 = var21.numVertices();
    java.lang.Integer var23 = new java.lang.Integer(926);
    ds.Grafo var24 = new ds.Grafo(var23);
    java.lang.Integer var25 = new java.lang.Integer(594);
    java.lang.Integer var26 = new java.lang.Integer((-500));
    boolean var27 = var24.existeAresta((int)var25, (int)var26);
    var8.insereAresta((int)var17, (int)var22, (int)var26);
    java.lang.Integer var29 = new java.lang.Integer(926);
    ds.Grafo var30 = new ds.Grafo(var29);
    java.lang.Integer var31 = new java.lang.Integer(594);
    java.lang.Integer var32 = new java.lang.Integer((-500));
    boolean var33 = var30.existeAresta((int)var31, (int)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var34 = var1.retiraAresta((int)var17, (int)var31);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test130() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(931);
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
    java.lang.Integer var27 = new java.lang.Integer(11);
    boolean var28 = var4.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(314);
    ds.Grafo var30 = new ds.Grafo(var29);
    java.lang.Integer var31 = new java.lang.Integer(776);
    ds.Grafo var32 = new ds.Grafo(var31);
    var2.insereAresta((int)var27, (int)var29, (int)var31);
    ds.Grafo var34 = new ds.Grafo(var27);
    
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
    assertTrue(var28 == true);

  }

  public void test131() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
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
    java.lang.Integer var18 = new java.lang.Integer(776);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var19.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    boolean var23 = var19.listaAdjVazia((int)var22);
    boolean var24 = var1.listaAdjVazia((int)var22);
    
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
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test132() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(931);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(330);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer((-317));
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    int var15 = var10.numVertices();
    ds.Grafo.Aresta var16 = var8.primeiroListaAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(937);
    ds.Grafo var18 = new ds.Grafo(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var8.proxAdj((int)var17);
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
    assertTrue(var15 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test133() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(320);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(314);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var4.numVertices();
    boolean var6 = var1.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 314);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test134() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(931);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(320);
    ds.Grafo var7 = new ds.Grafo(var6);
    boolean var8 = var5.listaAdjVazia((int)var6);
    java.lang.Integer var9 = new java.lang.Integer(330);
    ds.Grafo var10 = new ds.Grafo(var9);
    var1.insereAresta((int)var2, (int)var6, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

}
