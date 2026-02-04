package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 989);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    int var5 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 989);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.imprime();

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 41);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 41);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var2.retiraAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    int var10 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 41);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var6 = var1.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    var1.insereAresta((int)var10, (int)var10, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var2.retiraAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    ds.Grafo var14 = new ds.Grafo(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var1.listaAdjVazia((int)var14);
    ds.Grafo.Aresta var16 = var1.retiraAresta((int)var14, (int)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var1.listaAdjVazia((int)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(465);
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

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(465);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
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
    boolean var11 = var2.existeAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
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
    ds.Grafo.Aresta var11 = var2.retiraAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
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

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo.Aresta var3 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var3.primeiroListaAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(465);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 465);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 365);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo(var0);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    int var6 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 365);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(106);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(106);
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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    var3.insereAresta((int)var6, (int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 656);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    ds.Grafo.Aresta var9 = var8.retiraAresta((int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
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

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 656);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    ds.Grafo var9 = var3.grafoTransposto();
    int var10 = var9.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 365);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    ds.Grafo var9 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(41);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(384);
    java.lang.Integer var6 = new java.lang.Integer((-51));
    java.lang.Integer var7 = new java.lang.Integer((-21));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var4.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var4.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    java.lang.Integer var18 = new java.lang.Integer(365);
    ds.Grafo var19 = new ds.Grafo(var18);
    var19.imprime();
    ds.Grafo var21 = var19.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var21.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    boolean var25 = var21.listaAdjVazia((int)var24);
    ds.Grafo.Aresta var26 = var4.retiraAresta((int)var17, (int)var24);
    java.lang.Integer var27 = new java.lang.Integer(41);
    ds.Grafo var28 = new ds.Grafo(var27);
    java.lang.Integer var29 = new java.lang.Integer(384);
    java.lang.Integer var30 = new java.lang.Integer((-51));
    java.lang.Integer var31 = new java.lang.Integer((-21));
    var28.insereAresta((int)var29, (int)var30, (int)var31);
    ds.Grafo.Aresta var33 = var1.retiraAresta((int)var24, (int)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(656);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(41);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(384);
    java.lang.Integer var15 = new java.lang.Integer((-51));
    java.lang.Integer var16 = new java.lang.Integer((-21));
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var13.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var13.listaAdjVazia((int)var20);
    ds.Grafo var22 = new ds.Grafo(var20);
    java.lang.Integer var23 = new java.lang.Integer(656);
    ds.Grafo var24 = new ds.Grafo(var23);
    java.lang.Integer var25 = new java.lang.Integer(989);
    ds.Grafo var26 = new ds.Grafo(var25);
    int var27 = var26.numVertices();
    java.lang.Integer var28 = new java.lang.Integer(989);
    ds.Grafo var29 = new ds.Grafo(var28);
    ds.Grafo var30 = var29.grafoTransposto();
    java.lang.Integer var31 = new java.lang.Integer(0);
    boolean var32 = var29.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(1);
    boolean var34 = var29.listaAdjVazia((int)var33);
    boolean var35 = var24.existeAresta((int)var27, (int)var33);
    boolean var36 = var10.existeAresta((int)var20, (int)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var37 = var3.primeiroListaAdj((int)var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 989);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(384);
    java.lang.Integer var3 = new java.lang.Integer((-51));
    java.lang.Integer var4 = new java.lang.Integer((-21));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(365);
    ds.Grafo var16 = new ds.Grafo(var15);
    var16.imprime();
    ds.Grafo var18 = var16.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var18.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    boolean var22 = var18.listaAdjVazia((int)var21);
    ds.Grafo.Aresta var23 = var1.retiraAresta((int)var14, (int)var21);
    ds.Grafo var24 = new ds.Grafo(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(989);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(656);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(365);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    ds.Grafo var5 = var3.grafoTransposto();
    int var6 = var5.numVertices();
    java.lang.Integer var7 = new java.lang.Integer((-1));
    boolean var8 = var1.existeAresta((int)var6, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 365);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = var3.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(989);
    ds.Grafo var10 = new ds.Grafo(var9);
    int var11 = var10.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var3.proxAdj((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 989);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(656);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = new ds.Grafo(var8);
    boolean var11 = var3.listaAdjVazia((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
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
    java.lang.Integer var11 = new java.lang.Integer(465);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Grafo.Aresta var14 = var12.proxAdj((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(41);
    ds.Grafo var16 = new ds.Grafo(var15);
    ds.Grafo var17 = var16.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var16.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var16.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(2);
    boolean var23 = var16.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(3);
    boolean var25 = var16.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(989);
    ds.Grafo var27 = new ds.Grafo(var26);
    ds.Grafo var28 = var27.grafoTransposto();
    java.lang.Integer var29 = new java.lang.Integer(0);
    boolean var30 = var27.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(1);
    boolean var32 = var27.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(2);
    boolean var34 = var27.listaAdjVazia((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(3);
    boolean var36 = var27.listaAdjVazia((int)var35);
    boolean var37 = var12.existeAresta((int)var24, (int)var35);
    ds.Grafo var38 = new ds.Grafo(var24);
    java.lang.Integer var39 = new java.lang.Integer(465);
    ds.Grafo var40 = new ds.Grafo(var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    ds.Grafo.Aresta var42 = var40.proxAdj((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(41);
    ds.Grafo var44 = new ds.Grafo(var43);
    ds.Grafo var45 = var44.grafoTransposto();
    java.lang.Integer var46 = new java.lang.Integer(0);
    boolean var47 = var44.listaAdjVazia((int)var46);
    java.lang.Integer var48 = new java.lang.Integer(1);
    boolean var49 = var44.listaAdjVazia((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(2);
    boolean var51 = var44.listaAdjVazia((int)var50);
    java.lang.Integer var52 = new java.lang.Integer(3);
    boolean var53 = var44.listaAdjVazia((int)var52);
    java.lang.Integer var54 = new java.lang.Integer(989);
    ds.Grafo var55 = new ds.Grafo(var54);
    ds.Grafo var56 = var55.grafoTransposto();
    java.lang.Integer var57 = new java.lang.Integer(0);
    boolean var58 = var55.listaAdjVazia((int)var57);
    java.lang.Integer var59 = new java.lang.Integer(1);
    boolean var60 = var55.listaAdjVazia((int)var59);
    java.lang.Integer var61 = new java.lang.Integer(2);
    boolean var62 = var55.listaAdjVazia((int)var61);
    java.lang.Integer var63 = new java.lang.Integer(3);
    boolean var64 = var55.listaAdjVazia((int)var63);
    boolean var65 = var40.existeAresta((int)var52, (int)var63);
    ds.Grafo var66 = new ds.Grafo(var52);
    boolean var67 = var1.existeAresta((int)var24, (int)var52);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(106);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(989);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(41);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var7.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var7.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var7.listaAdjVazia((int)var13);
    boolean var15 = var1.existeAresta((int)var5, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 989);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(365);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(41);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(384);
    java.lang.Integer var9 = new java.lang.Integer((-51));
    java.lang.Integer var10 = new java.lang.Integer((-21));
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var3.proxAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(41);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(41);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var4.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var4.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var4.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(989);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo var16 = var15.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var15.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    boolean var20 = var15.listaAdjVazia((int)var19);
    ds.Grafo var21 = new ds.Grafo(var19);
    java.lang.Integer var22 = new java.lang.Integer(41);
    ds.Grafo var23 = new ds.Grafo(var22);
    ds.Grafo var24 = var23.grafoTransposto();
    java.lang.Integer var25 = new java.lang.Integer(0);
    boolean var26 = var23.listaAdjVazia((int)var25);
    var1.insereAresta((int)var12, (int)var19, (int)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

}
