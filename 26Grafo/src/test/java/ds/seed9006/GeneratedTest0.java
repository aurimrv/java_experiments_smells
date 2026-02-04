package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 920);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(111);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    boolean var10 = var5.existeAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(111);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    var1.imprime();
    ds.Grafo.Aresta var11 = var5.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var6.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(111);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    var1.imprime();
    int var11 = var1.numVertices();
    boolean var12 = var5.existeAresta((int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 920);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(111);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    var1.imprime();
    int var11 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 920);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(522);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(522);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 498);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(20);
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

    java.lang.Integer var0 = new java.lang.Integer(20);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(111);
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var7 = var2.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    boolean var9 = var2.existeAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    ds.Grafo.Aresta var5 = var2.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var2.listaAdjVazia((int)var9);
    ds.Grafo.Aresta var11 = var2.retiraAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(522);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(355);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var2.retiraAresta((int)var5, (int)var6);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(626);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(626);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(626);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var1.listaAdjVazia((int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var2.proxAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var1.listaAdjVazia((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var2.primeiroListaAdj((int)var7);
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

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(111);
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var5.listaAdjVazia((int)var11);
    ds.Grafo var13 = var6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(20);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    boolean var3 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(20);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    boolean var10 = var9.listaAdjVazia((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var2.listaAdjVazia((int)var11);
    var2.insereAresta((int)var11, (int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(3);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(4);
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
    assertTrue(var11 == 1);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var2.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(3);
    boolean var14 = var2.listaAdjVazia((int)var13);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var2.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(3);
    boolean var14 = var2.listaAdjVazia((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo.Aresta var6 = var5.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(697);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 697);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(697);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 498);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(522);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.imprime();
    var1.insereAresta((int)var2, (int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
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

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(922);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(111);
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var5.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var5.listaAdjVazia((int)var13);
    ds.Grafo var15 = var6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(111);
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var5.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var5.listaAdjVazia((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(111);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var9 = var2.grafoTransposto();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(920);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(4501);
    java.lang.Integer var6 = new java.lang.Integer((-245));
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    ds.Grafo var8 = var4.grafoTransposto();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    java.lang.Integer var12 = new java.lang.Integer(111);
    var8.insereAresta((int)var10, (int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var2.proxAdj((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(355);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var2.retiraAresta((int)var5, (int)var6);
    int var8 = var2.numVertices();
    ds.Grafo var9 = var2.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(498);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(498);
    ds.Grafo var14 = new ds.Grafo(var13);
    int var15 = var14.numVertices();
    java.lang.Integer var16 = new java.lang.Integer(920);
    ds.Grafo var17 = new ds.Grafo(var16);
    java.lang.Integer var18 = new java.lang.Integer(4501);
    java.lang.Integer var19 = new java.lang.Integer((-245));
    boolean var20 = var17.existeAresta((int)var18, (int)var19);
    ds.Grafo var21 = var17.grafoTransposto();
    ds.Grafo var22 = var21.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer((-1));
    java.lang.Integer var25 = new java.lang.Integer(111);
    var21.insereAresta((int)var23, (int)var24, (int)var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    boolean var28 = var21.listaAdjVazia((int)var27);
    ds.Grafo.Aresta var29 = var11.retiraAresta((int)var15, (int)var27);
    ds.Grafo.Aresta var30 = var2.primeiroListaAdj((int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 498);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 498);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(920);
    ds.Grafo var4 = new ds.Grafo(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(111);
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(920);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(4501);
    java.lang.Integer var14 = new java.lang.Integer((-245));
    boolean var15 = var12.existeAresta((int)var13, (int)var14);
    ds.Grafo var16 = var12.grafoTransposto();
    ds.Grafo var17 = var16.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer((-1));
    java.lang.Integer var20 = new java.lang.Integer(111);
    var16.insereAresta((int)var18, (int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var16.listaAdjVazia((int)var22);
    ds.Grafo.Aresta var24 = var5.primeiroListaAdj((int)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var5.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    boolean var10 = var5.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(3);
    boolean var12 = var5.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(498);
    ds.Grafo var14 = new ds.Grafo(var13);
    ds.Grafo var15 = var14.grafoTransposto();
    java.lang.Integer var16 = new java.lang.Integer(498);
    ds.Grafo var17 = new ds.Grafo(var16);
    int var18 = var17.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(920);
    ds.Grafo var20 = new ds.Grafo(var19);
    java.lang.Integer var21 = new java.lang.Integer(4501);
    java.lang.Integer var22 = new java.lang.Integer((-245));
    boolean var23 = var20.existeAresta((int)var21, (int)var22);
    ds.Grafo var24 = var20.grafoTransposto();
    ds.Grafo var25 = var24.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    java.lang.Integer var28 = new java.lang.Integer(111);
    var24.insereAresta((int)var26, (int)var27, (int)var28);
    java.lang.Integer var30 = new java.lang.Integer(0);
    boolean var31 = var24.listaAdjVazia((int)var30);
    ds.Grafo.Aresta var32 = var14.retiraAresta((int)var18, (int)var30);
    java.lang.Integer var33 = new java.lang.Integer((-1));
    java.lang.Integer var34 = new java.lang.Integer(1);
    ds.Grafo var35 = new ds.Grafo(var34);
    var5.insereAresta((int)var18, (int)var33, (int)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var37 = var2.proxAdj((int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 498);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 498);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(922);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    var1.insereAresta((int)var3, (int)var4, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(922);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    var9.insereAresta((int)var11, (int)var12, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(1);
    boolean var20 = var17.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(2);
    boolean var22 = var17.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(3);
    boolean var24 = var17.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(4);
    boolean var26 = var17.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(10);
    var1.insereAresta((int)var12, (int)var25, (int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(522);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.imprime();
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    var8.imprime();
    java.lang.Integer var10 = new java.lang.Integer(697);
    ds.Grafo var11 = new ds.Grafo(var10);
    boolean var12 = var8.listaAdjVazia((int)var10);
    ds.Grafo.Aresta var13 = var1.retiraAresta((int)var5, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(922);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    var3.insereAresta((int)var5, (int)var6, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(1);
    boolean var14 = var11.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(2);
    boolean var16 = var11.listaAdjVazia((int)var15);
    boolean var17 = var1.existeAresta((int)var6, (int)var15);
    java.lang.Integer var18 = new java.lang.Integer(498);
    ds.Grafo var19 = new ds.Grafo(var18);
    int var20 = var19.numVertices();
    java.lang.Integer var21 = new java.lang.Integer(1);
    ds.Grafo var22 = new ds.Grafo(var21);
    ds.Grafo var23 = var22.grafoTransposto();
    var23.imprime();
    java.lang.Integer var25 = new java.lang.Integer(697);
    ds.Grafo var26 = new ds.Grafo(var25);
    boolean var27 = var23.listaAdjVazia((int)var25);
    java.lang.Integer var28 = new java.lang.Integer(498);
    ds.Grafo var29 = new ds.Grafo(var28);
    ds.Grafo.Aresta var30 = var19.retiraAresta((int)var25, (int)var28);
    java.lang.Integer var31 = new java.lang.Integer(697);
    ds.Grafo var32 = new ds.Grafo(var31);
    boolean var33 = var1.existeAresta((int)var25, (int)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 498);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 920);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(920);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(4501);
    java.lang.Integer var3 = new java.lang.Integer((-245));
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    var8.imprime();
    java.lang.Integer var10 = new java.lang.Integer(697);
    ds.Grafo var11 = new ds.Grafo(var10);
    boolean var12 = var8.listaAdjVazia((int)var10);
    java.lang.Integer var13 = new java.lang.Integer(10);
    java.lang.Integer var14 = new java.lang.Integer(498);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo var16 = var15.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(355);
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Grafo.Aresta var21 = var16.retiraAresta((int)var19, (int)var20);
    ds.Grafo.Aresta var22 = var8.retiraAresta((int)var13, (int)var19);
    ds.Grafo.Aresta var23 = var5.primeiroListaAdj((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(498);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var4.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(3);
    boolean var11 = var4.listaAdjVazia((int)var10);
    ds.Grafo.Aresta var12 = var2.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

}
