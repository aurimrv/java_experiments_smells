package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.existeAresta((int)var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    ds.Grafo.Aresta var3 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    int var2 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var0.retiraAresta((int)var1, (int)var1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.retiraAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer((-251));
    java.lang.Integer var6 = new java.lang.Integer(724);
    var0.insereAresta((int)var4, (int)var5, (int)var6);
    int var8 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer((-251));
    java.lang.Integer var6 = new java.lang.Integer(724);
    var0.insereAresta((int)var4, (int)var5, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var0.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    boolean var5 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    var2.imprime();

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var7 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    var0.imprime();
    ds.Grafo.Aresta var5 = var0.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    ds.Grafo var2 = new ds.Grafo();
    var2.imprime();
    ds.Grafo var4 = var2.grafoTransposto();
    int var5 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.existeAresta((int)var1, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(321);
    java.lang.Integer var7 = new java.lang.Integer((-702));
    var2.insereAresta((int)var5, (int)var6, (int)var7);
    boolean var9 = var0.existeAresta((int)var1, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    var0.imprime();
    ds.Grafo var6 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    int var4 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var4, (int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(321);
    java.lang.Integer var6 = new java.lang.Integer((-702));
    var1.insereAresta((int)var4, (int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Grafo var2 = new ds.Grafo();
    var2.imprime();
    ds.Grafo var4 = var2.grafoTransposto();
    int var5 = var2.numVertices();
    int var6 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.retiraAresta((int)var1, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(321);
    java.lang.Integer var6 = new java.lang.Integer((-702));
    var1.insereAresta((int)var4, (int)var5, (int)var6);
    ds.Grafo var8 = new ds.Grafo();
    var8.imprime();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var0.retiraAresta((int)var5, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(321);
    java.lang.Integer var6 = new java.lang.Integer((-702));
    var1.insereAresta((int)var4, (int)var5, (int)var6);
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var8.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(321);
    java.lang.Integer var13 = new java.lang.Integer((-702));
    var8.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var8.listaAdjVazia((int)var15);
    ds.Grafo var17 = new ds.Grafo();
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var17.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    java.lang.Integer var21 = new java.lang.Integer(321);
    java.lang.Integer var22 = new java.lang.Integer((-702));
    var17.insereAresta((int)var20, (int)var21, (int)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var5, (int)var15, (int)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-878));
    java.lang.Integer var3 = new java.lang.Integer(444);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    var0.imprime();

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(30);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-878));
    java.lang.Integer var7 = new java.lang.Integer(444);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var0.retiraAresta((int)var2, (int)var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-878));
    java.lang.Integer var4 = new java.lang.Integer(444);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var0.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-878));
    java.lang.Integer var4 = new java.lang.Integer(444);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var0.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.listaAdjVazia((int)var7);
    var0.imprime();
    var0.insereAresta((int)var7, (int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    var0.imprime();
    ds.Grafo var5 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-878));
    java.lang.Integer var4 = new java.lang.Integer(444);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var0.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.listaAdjVazia((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var9 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test36() throws Throwable {

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

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(30);
    ds.Grafo.Aresta var7 = var5.proxAdj((int)var6);
    var5.imprime();
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer((-251));
    java.lang.Integer var11 = new java.lang.Integer(724);
    var5.insereAresta((int)var9, (int)var10, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var13 = var0.retiraAresta((int)var4, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test39() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    var3.insereAresta((int)var1, (int)var1, (int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    var0.imprime();
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer((-251));
    java.lang.Integer var7 = new java.lang.Integer(724);
    var0.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.existeAresta((int)var7, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test41() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    var0.imprime();
    int var5 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var4.existeAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var4.numVertices();
    int var6 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var4.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.listaAdjVazia((int)var7);
    var0.imprime();
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer((-251));
    java.lang.Integer var12 = new java.lang.Integer(724);
    var0.insereAresta((int)var10, (int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var0.proxAdj((int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var4.numVertices();
    int var6 = var4.numVertices();
    var4.imprime();
    ds.Grafo var8 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.listaAdjVazia((int)var7);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var10 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    int var6 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var5.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var4.numVertices();
    int var6 = var4.numVertices();
    var4.imprime();
    java.lang.Integer var8 = new java.lang.Integer(10);
    java.lang.Integer var9 = new java.lang.Integer((-251));
    java.lang.Integer var10 = new java.lang.Integer(724);
    var4.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var12 = var4.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test49() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-878));
    java.lang.Integer var3 = new java.lang.Integer(444);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var8 = var0.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    var0.imprime();
    int var6 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var6, (int)var6, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test51() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    var0.imprime();
    int var6 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test52() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-878));
    java.lang.Integer var3 = new java.lang.Integer(444);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    var0.imprime();
    ds.Grafo var9 = new ds.Grafo();

  }

  public void test53() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var0.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var0.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test54() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    int var7 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var0.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test55() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test56() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-878));
    java.lang.Integer var4 = new java.lang.Integer(444);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(321);
    java.lang.Integer var11 = new java.lang.Integer((-702));
    var6.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var6.listaAdjVazia((int)var13);
    var6.imprime();
    java.lang.Integer var16 = new java.lang.Integer(10);
    java.lang.Integer var17 = new java.lang.Integer((-251));
    java.lang.Integer var18 = new java.lang.Integer(724);
    var6.insereAresta((int)var16, (int)var17, (int)var18);
    ds.Grafo var20 = new ds.Grafo();
    java.lang.Integer var21 = new java.lang.Integer(30);
    ds.Grafo.Aresta var22 = var20.proxAdj((int)var21);
    var20.imprime();
    ds.Grafo var24 = var20.grafoTransposto();
    int var25 = var24.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var4, (int)var18, (int)var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);

  }

  public void test57() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(30);
    ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
    var2.imprime();
    ds.Grafo var6 = var2.grafoTransposto();
    int var7 = var6.numVertices();
    int var8 = var6.numVertices();
    var6.imprime();
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer((-251));
    java.lang.Integer var12 = new java.lang.Integer(724);
    var6.insereAresta((int)var10, (int)var11, (int)var12);
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-878));
    java.lang.Integer var17 = new java.lang.Integer(444);
    var14.insereAresta((int)var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    ds.Grafo.Aresta var20 = var14.proxAdj((int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var12, (int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test58() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    var1.imprime();
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

  public void test59() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-878));
    java.lang.Integer var5 = new java.lang.Integer(444);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(100);
    var0.insereAresta((int)var1, (int)var7, (int)var9);

  }

  public void test60() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-878));
    java.lang.Integer var5 = new java.lang.Integer(444);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var7.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(321);
    java.lang.Integer var12 = new java.lang.Integer((-702));
    var7.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var7.listaAdjVazia((int)var14);
    var7.imprime();
    java.lang.Integer var17 = new java.lang.Integer(10);
    java.lang.Integer var18 = new java.lang.Integer((-251));
    java.lang.Integer var19 = new java.lang.Integer(724);
    var7.insereAresta((int)var17, (int)var18, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var5, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test61() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(321);
    java.lang.Integer var7 = new java.lang.Integer((-702));
    var2.insereAresta((int)var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var0.retiraAresta((int)var1, (int)var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test62() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-878));
    java.lang.Integer var3 = new java.lang.Integer(444);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    var0.imprime();
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer((-251));
    java.lang.Integer var11 = new java.lang.Integer(724);
    var0.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo var13 = new ds.Grafo();

  }

  public void test63() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    int var4 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insereAresta((int)var4, (int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test64() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(321);
    java.lang.Integer var6 = new java.lang.Integer((-702));
    var1.insereAresta((int)var4, (int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var0.proxAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test65() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(30);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    var1.imprime();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    int var7 = var5.numVertices();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer((-878));
    java.lang.Integer var11 = new java.lang.Integer(444);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    ds.Grafo.Aresta var14 = var8.proxAdj((int)var13);
    var8.imprime();
    var8.imprime();
    java.lang.Integer var17 = new java.lang.Integer(10);
    java.lang.Integer var18 = new java.lang.Integer((-251));
    java.lang.Integer var19 = new java.lang.Integer(724);
    var8.insereAresta((int)var17, (int)var18, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var21 = var0.retiraAresta((int)var7, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test66() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(30);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    var1.imprime();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    int var7 = var5.numVertices();
    var5.imprime();
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer((-251));
    java.lang.Integer var11 = new java.lang.Integer(724);
    var5.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer((-878));
    java.lang.Integer var16 = new java.lang.Integer(444);
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    ds.Grafo.Aresta var19 = var13.proxAdj((int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var0.retiraAresta((int)var11, (int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test67() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    var0.imprime();
    int var5 = var0.numVertices();
    ds.Grafo var6 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test68() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    var0.imprime();
    int var5 = var0.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var3.retiraAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test69() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    int var4 = var0.numVertices();
    var0.imprime();
    int var6 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test70() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    int var3 = var0.numVertices();
    int var4 = var0.numVertices();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test71() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo();
    java.lang.Integer var6 = new java.lang.Integer(30);
    ds.Grafo.Aresta var7 = var5.proxAdj((int)var6);
    var5.imprime();
    ds.Grafo var9 = var5.grafoTransposto();
    int var10 = var9.numVertices();
    ds.Grafo var11 = new ds.Grafo();
    java.lang.Integer var12 = new java.lang.Integer(30);
    ds.Grafo.Aresta var13 = var11.proxAdj((int)var12);
    var11.imprime();
    java.lang.Integer var15 = new java.lang.Integer(10);
    java.lang.Integer var16 = new java.lang.Integer((-251));
    java.lang.Integer var17 = new java.lang.Integer(724);
    var11.insereAresta((int)var15, (int)var16, (int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var4.existeAresta((int)var10, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test72() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var4.numVertices();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-878));
    java.lang.Integer var9 = new java.lang.Integer(444);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Grafo.Aresta var12 = var6.proxAdj((int)var11);
    var6.imprime();
    var6.imprime();
    java.lang.Integer var15 = new java.lang.Integer(10);
    java.lang.Integer var16 = new java.lang.Integer((-251));
    java.lang.Integer var17 = new java.lang.Integer(724);
    var6.insereAresta((int)var15, (int)var16, (int)var17);
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var19.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(321);
    java.lang.Integer var24 = new java.lang.Integer((-702));
    var19.insereAresta((int)var22, (int)var23, (int)var24);
    ds.Grafo var26 = new ds.Grafo();
    java.lang.Integer var27 = new java.lang.Integer(30);
    ds.Grafo.Aresta var28 = var26.proxAdj((int)var27);
    var26.imprime();
    ds.Grafo var30 = var26.grafoTransposto();
    int var31 = var30.numVertices();
    int var32 = var30.numVertices();
    var30.imprime();
    java.lang.Integer var34 = new java.lang.Integer(10);
    java.lang.Integer var35 = new java.lang.Integer((-251));
    java.lang.Integer var36 = new java.lang.Integer(724);
    var30.insereAresta((int)var34, (int)var35, (int)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var16, (int)var24, (int)var35);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);

  }

  public void test73() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    var0.imprime();
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo();
    var5.imprime();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var5.listaAdjVazia((int)var7);
    boolean var9 = var0.listaAdjVazia((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test74() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    var0.imprime();
    ds.Grafo var5 = var0.grafoTransposto();

  }

  public void test75() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    ds.Grafo var4 = new ds.Grafo();
    var4.imprime();
    ds.Grafo var6 = var4.grafoTransposto();
    int var7 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var0.retiraAresta((int)var3, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test76() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-878));
    java.lang.Integer var3 = new java.lang.Integer(444);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    var0.imprime();
    ds.Grafo var9 = new ds.Grafo();
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(321);
    java.lang.Integer var14 = new java.lang.Integer((-702));
    var9.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var9.listaAdjVazia((int)var16);
    ds.Grafo var18 = new ds.Grafo();
    java.lang.Integer var19 = new java.lang.Integer(1);
    boolean var20 = var18.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    java.lang.Integer var22 = new java.lang.Integer(321);
    java.lang.Integer var23 = new java.lang.Integer((-702));
    var18.insereAresta((int)var21, (int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(0);
    boolean var26 = var18.listaAdjVazia((int)var25);
    var18.imprime();
    java.lang.Integer var28 = new java.lang.Integer(10);
    java.lang.Integer var29 = new java.lang.Integer((-251));
    java.lang.Integer var30 = new java.lang.Integer(724);
    var18.insereAresta((int)var28, (int)var29, (int)var30);
    ds.Grafo.Aresta var32 = var0.retiraAresta((int)var16, (int)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);

  }

  public void test77() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-878));
    java.lang.Integer var5 = new java.lang.Integer(444);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    ds.Grafo.Aresta var9 = var0.primeiroListaAdj((int)var7);
    ds.Grafo var10 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test78() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(30);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    var4.imprime();
    ds.Grafo var8 = var4.grafoTransposto();
    int var9 = var8.numVertices();
    int var10 = var8.numVertices();
    var8.imprime();
    ds.Grafo var12 = new ds.Grafo();
    var12.imprime();
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-878));
    java.lang.Integer var17 = new java.lang.Integer(444);
    var14.insereAresta((int)var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    ds.Grafo.Aresta var20 = var14.proxAdj((int)var19);
    ds.Grafo.Aresta var21 = var12.primeiroListaAdj((int)var19);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Grafo var23 = new ds.Grafo();
    var23.imprime();
    ds.Grafo var25 = new ds.Grafo();
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer((-878));
    java.lang.Integer var28 = new java.lang.Integer(444);
    var25.insereAresta((int)var26, (int)var27, (int)var28);
    java.lang.Integer var30 = new java.lang.Integer(0);
    ds.Grafo.Aresta var31 = var25.proxAdj((int)var30);
    ds.Grafo.Aresta var32 = var23.primeiroListaAdj((int)var30);
    var8.insereAresta((int)var19, (int)var22, (int)var30);
    ds.Grafo var34 = new ds.Grafo();
    java.lang.Integer var35 = new java.lang.Integer(1);
    boolean var36 = var34.listaAdjVazia((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(0);
    java.lang.Integer var38 = new java.lang.Integer(321);
    java.lang.Integer var39 = new java.lang.Integer((-702));
    var34.insereAresta((int)var37, (int)var38, (int)var39);
    boolean var41 = var0.existeAresta((int)var19, (int)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test79() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(30);
    ds.Grafo.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    int var4 = var0.numVertices();
    ds.Grafo var5 = new ds.Grafo();
    var5.imprime();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var5.listaAdjVazia((int)var7);
    ds.Grafo var9 = var5.grafoTransposto();
    ds.Grafo var10 = var5.grafoTransposto();
    int var11 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.listaAdjVazia((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test80() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = new ds.Grafo();
    int var3 = var2.numVertices();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(30);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var0.retiraAresta((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test81() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    int var6 = var0.numVertices();
    ds.Grafo var7 = new ds.Grafo();
    var7.imprime();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var7.listaAdjVazia((int)var9);
    ds.Grafo var11 = new ds.Grafo();
    var11.imprime();
    ds.Grafo var13 = var11.grafoTransposto();
    ds.Grafo var14 = var11.grafoTransposto();
    var11.imprime();
    int var16 = var11.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var0.retiraAresta((int)var9, (int)var16);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test82() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(321);
    java.lang.Integer var5 = new java.lang.Integer((-702));
    var0.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(30);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    ds.Grafo var10 = var7.grafoTransposto();
    int var11 = var7.numVertices();
    ds.Grafo var12 = new ds.Grafo();
    var12.imprime();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var12.listaAdjVazia((int)var14);
    var12.imprime();
    java.lang.Integer var17 = new java.lang.Integer(10);
    java.lang.Integer var18 = new java.lang.Integer((-251));
    java.lang.Integer var19 = new java.lang.Integer(724);
    var12.insereAresta((int)var17, (int)var18, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var21 = var0.retiraAresta((int)var11, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test83() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = var0.grafoTransposto();
    int var5 = var0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test84() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var4.listaAdjVazia((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(30);
    ds.Grafo.Aresta var10 = var8.proxAdj((int)var9);
    var8.imprime();
    ds.Grafo var12 = var8.grafoTransposto();
    int var13 = var12.numVertices();
    int var14 = var12.numVertices();
    var12.imprime();
    ds.Grafo var16 = new ds.Grafo();
    var16.imprime();
    ds.Grafo var18 = new ds.Grafo();
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer((-878));
    java.lang.Integer var21 = new java.lang.Integer(444);
    var18.insereAresta((int)var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    ds.Grafo.Aresta var24 = var18.proxAdj((int)var23);
    ds.Grafo.Aresta var25 = var16.primeiroListaAdj((int)var23);
    java.lang.Integer var26 = new java.lang.Integer(1);
    ds.Grafo var27 = new ds.Grafo();
    var27.imprime();
    ds.Grafo var29 = new ds.Grafo();
    java.lang.Integer var30 = new java.lang.Integer(0);
    java.lang.Integer var31 = new java.lang.Integer((-878));
    java.lang.Integer var32 = new java.lang.Integer(444);
    var29.insereAresta((int)var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(0);
    ds.Grafo.Aresta var35 = var29.proxAdj((int)var34);
    ds.Grafo.Aresta var36 = var27.primeiroListaAdj((int)var34);
    var12.insereAresta((int)var23, (int)var26, (int)var34);
    ds.Grafo var38 = new ds.Grafo();
    var38.imprime();
    ds.Grafo var40 = new ds.Grafo();
    java.lang.Integer var41 = new java.lang.Integer(0);
    java.lang.Integer var42 = new java.lang.Integer((-878));
    java.lang.Integer var43 = new java.lang.Integer(444);
    var40.insereAresta((int)var41, (int)var42, (int)var43);
    java.lang.Integer var45 = new java.lang.Integer(0);
    ds.Grafo.Aresta var46 = var40.proxAdj((int)var45);
    ds.Grafo.Aresta var47 = var38.primeiroListaAdj((int)var45);
    ds.Grafo var48 = new ds.Grafo();
    var48.imprime();
    java.lang.Integer var50 = new java.lang.Integer(0);
    boolean var51 = var48.listaAdjVazia((int)var50);
    var48.imprime();
    java.lang.Integer var53 = new java.lang.Integer(10);
    java.lang.Integer var54 = new java.lang.Integer((-251));
    java.lang.Integer var55 = new java.lang.Integer(724);
    var48.insereAresta((int)var53, (int)var54, (int)var55);
    var4.insereAresta((int)var23, (int)var45, (int)var53);
    ds.Grafo var58 = new ds.Grafo();
    java.lang.Integer var59 = new java.lang.Integer(30);
    ds.Grafo.Aresta var60 = var58.proxAdj((int)var59);
    ds.Grafo var61 = var58.grafoTransposto();
    var58.imprime();
    int var63 = var58.numVertices();
    boolean var64 = var0.existeAresta((int)var23, (int)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test85() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-878));
    java.lang.Integer var6 = new java.lang.Integer(444);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer((-878));
    java.lang.Integer var11 = new java.lang.Integer(444);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    ds.Grafo.Aresta var14 = var8.proxAdj((int)var13);
    var8.imprime();
    var8.imprime();
    java.lang.Integer var17 = new java.lang.Integer(10);
    java.lang.Integer var18 = new java.lang.Integer((-251));
    java.lang.Integer var19 = new java.lang.Integer(724);
    var8.insereAresta((int)var17, (int)var18, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var21 = var0.retiraAresta((int)var4, (int)var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-878));
    java.lang.Integer var3 = new java.lang.Integer(444);
    var0.insereAresta((int)var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var0.proxAdj((int)var5);
    var0.imprime();
    var0.imprime();
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer((-251));
    java.lang.Integer var11 = new java.lang.Integer(724);
    var0.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo var13 = new ds.Grafo();
    var13.imprime();
    ds.Grafo var15 = var13.grafoTransposto();
    ds.Grafo var16 = var13.grafoTransposto();
    var13.imprime();
    int var18 = var13.numVertices();
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(30);
    ds.Grafo.Aresta var21 = var19.proxAdj((int)var20);
    var19.imprime();
    ds.Grafo var23 = var19.grafoTransposto();
    int var24 = var23.numVertices();
    int var25 = var23.numVertices();
    var23.imprime();
    java.lang.Integer var27 = new java.lang.Integer(10);
    java.lang.Integer var28 = new java.lang.Integer((-251));
    java.lang.Integer var29 = new java.lang.Integer(724);
    var23.insereAresta((int)var27, (int)var28, (int)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var31 = var0.retiraAresta((int)var18, (int)var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);

  }

  public void test87() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.listaAdjVazia((int)var2);
    var0.imprime();
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer((-251));
    java.lang.Integer var7 = new java.lang.Integer(724);
    var0.insereAresta((int)var5, (int)var6, (int)var7);
    ds.Grafo var9 = new ds.Grafo();
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var9.listaAdjVazia((int)var10);
    ds.Grafo var12 = var9.grafoTransposto();
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(30);
    ds.Grafo.Aresta var15 = var13.proxAdj((int)var14);
    var13.imprime();
    ds.Grafo var17 = var13.grafoTransposto();
    int var18 = var17.numVertices();
    int var19 = var17.numVertices();
    var17.imprime();
    ds.Grafo var21 = new ds.Grafo();
    var21.imprime();
    ds.Grafo var23 = new ds.Grafo();
    java.lang.Integer var24 = new java.lang.Integer(0);
    java.lang.Integer var25 = new java.lang.Integer((-878));
    java.lang.Integer var26 = new java.lang.Integer(444);
    var23.insereAresta((int)var24, (int)var25, (int)var26);
    java.lang.Integer var28 = new java.lang.Integer(0);
    ds.Grafo.Aresta var29 = var23.proxAdj((int)var28);
    ds.Grafo.Aresta var30 = var21.primeiroListaAdj((int)var28);
    java.lang.Integer var31 = new java.lang.Integer(1);
    ds.Grafo var32 = new ds.Grafo();
    var32.imprime();
    ds.Grafo var34 = new ds.Grafo();
    java.lang.Integer var35 = new java.lang.Integer(0);
    java.lang.Integer var36 = new java.lang.Integer((-878));
    java.lang.Integer var37 = new java.lang.Integer(444);
    var34.insereAresta((int)var35, (int)var36, (int)var37);
    java.lang.Integer var39 = new java.lang.Integer(0);
    ds.Grafo.Aresta var40 = var34.proxAdj((int)var39);
    ds.Grafo.Aresta var41 = var32.primeiroListaAdj((int)var39);
    var17.insereAresta((int)var28, (int)var31, (int)var39);
    ds.Grafo var43 = new ds.Grafo();
    var43.imprime();
    ds.Grafo var45 = new ds.Grafo();
    java.lang.Integer var46 = new java.lang.Integer(0);
    java.lang.Integer var47 = new java.lang.Integer((-878));
    java.lang.Integer var48 = new java.lang.Integer(444);
    var45.insereAresta((int)var46, (int)var47, (int)var48);
    java.lang.Integer var50 = new java.lang.Integer(0);
    ds.Grafo.Aresta var51 = var45.proxAdj((int)var50);
    ds.Grafo.Aresta var52 = var43.primeiroListaAdj((int)var50);
    ds.Grafo var53 = new ds.Grafo();
    var53.imprime();
    java.lang.Integer var55 = new java.lang.Integer(0);
    boolean var56 = var53.listaAdjVazia((int)var55);
    var53.imprime();
    java.lang.Integer var58 = new java.lang.Integer(10);
    java.lang.Integer var59 = new java.lang.Integer((-251));
    java.lang.Integer var60 = new java.lang.Integer(724);
    var53.insereAresta((int)var58, (int)var59, (int)var60);
    var9.insereAresta((int)var28, (int)var50, (int)var58);
    ds.Grafo var63 = new ds.Grafo();
    java.lang.Integer var64 = new java.lang.Integer(1);
    boolean var65 = var63.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(0);
    java.lang.Integer var67 = new java.lang.Integer(321);
    java.lang.Integer var68 = new java.lang.Integer((-702));
    var63.insereAresta((int)var66, (int)var67, (int)var68);
    java.lang.Integer var70 = new java.lang.Integer(0);
    boolean var71 = var63.listaAdjVazia((int)var70);
    var63.imprime();
    java.lang.Integer var73 = new java.lang.Integer(10);
    java.lang.Integer var74 = new java.lang.Integer((-251));
    java.lang.Integer var75 = new java.lang.Integer(724);
    var63.insereAresta((int)var73, (int)var74, (int)var75);
    boolean var77 = var0.existeAresta((int)var28, (int)var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test88() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = var0.grafoTransposto();
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = var0.grafoTransposto();
    var0.imprime();

  }

  public void test89() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-878));
    java.lang.Integer var5 = new java.lang.Integer(444);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
    var2.imprime();
    var2.imprime();
    java.lang.Integer var11 = new java.lang.Integer(10);
    java.lang.Integer var12 = new java.lang.Integer((-251));
    java.lang.Integer var13 = new java.lang.Integer(724);
    var2.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = new ds.Grafo();
    java.lang.Integer var16 = new java.lang.Integer(30);
    ds.Grafo.Aresta var17 = var15.proxAdj((int)var16);
    ds.Grafo var18 = new ds.Grafo();
    var18.imprime();
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var18.listaAdjVazia((int)var20);
    var18.imprime();
    java.lang.Integer var23 = new java.lang.Integer(10);
    java.lang.Integer var24 = new java.lang.Integer((-251));
    java.lang.Integer var25 = new java.lang.Integer(724);
    var18.insereAresta((int)var23, (int)var24, (int)var25);
    boolean var27 = var15.listaAdjVazia((int)var23);
    ds.Grafo var28 = new ds.Grafo();
    var28.imprime();
    java.lang.Integer var30 = new java.lang.Integer(0);
    boolean var31 = var28.listaAdjVazia((int)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var13, (int)var23, (int)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

}
