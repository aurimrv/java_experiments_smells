package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

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

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
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

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
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

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    boolean var6 = var5.existeAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 232);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
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

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
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

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    boolean var7 = var6.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var5.proxAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    ds.Grafo var11 = new ds.Grafo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
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

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(170);
    java.lang.Integer var12 = new java.lang.Integer(157);
    java.lang.Integer var13 = new java.lang.Integer(891);
    var1.insereAresta((int)var11, (int)var12, (int)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var15 = var10.retiraAresta((int)var13, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    var1.insereAresta((int)var4, (int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var10.listaAdjVazia((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 214);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var10.existeAresta((int)var8, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(170);
    java.lang.Integer var12 = new java.lang.Integer(157);
    java.lang.Integer var13 = new java.lang.Integer(891);
    var1.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = var1.grafoTransposto();
    var15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
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

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var2.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
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

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
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

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
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

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
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

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    int var11 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var10.retiraAresta((int)var11, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 742);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(261);
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

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(261);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 261);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
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

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(934);
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

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(934);
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

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    boolean var6 = var1.existeAresta((int)var4, (int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var1.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
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
    assertTrue(var2 == 214);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(170);
    java.lang.Integer var12 = new java.lang.Integer(157);
    java.lang.Integer var13 = new java.lang.Integer(891);
    var1.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = var1.grafoTransposto();
    int var16 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var15.retiraAresta((int)var16, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 742);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 742);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
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
    assertTrue(var3 == 801);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var1.listaAdjVazia((int)var9);
    var2.insereAresta((int)var9, (int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var1.listaAdjVazia((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
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
    assertTrue(var2 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 214);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
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

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
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

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 801);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(261);
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

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(261);
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

    java.lang.Integer var0 = new java.lang.Integer(637);
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

    java.lang.Integer var0 = new java.lang.Integer(637);
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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(997);
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

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(997);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var2.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(997);
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

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(997);
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

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
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

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(934);
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

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = var1.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(170);
    java.lang.Integer var12 = new java.lang.Integer(157);
    java.lang.Integer var13 = new java.lang.Integer(891);
    var1.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var15.proxAdj((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Grafo var9 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 742);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = var6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 742);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var7.primeiroListaAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(637);
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

    java.lang.Integer var0 = new java.lang.Integer(261);
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

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
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

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(410);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.listaAdjVazia((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    int var6 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 408);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(214);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(170);
    java.lang.Integer var6 = new java.lang.Integer(157);
    java.lang.Integer var7 = new java.lang.Integer(891);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(801);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var9.numVertices();
    int var12 = var9.numVertices();
    ds.Grafo var13 = new ds.Grafo(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var7.proxAdj((int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 801);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(232);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var5.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    var1.insereAresta((int)var3, (int)var6, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(214);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    int var6 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var2, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 214);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(214);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    int var10 = var9.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(742);
    ds.Grafo var12 = new ds.Grafo(var11);
    var12.imprime();
    java.lang.Integer var14 = new java.lang.Integer(348);
    boolean var15 = var12.listaAdjVazia((int)var14);
    ds.Grafo var16 = var12.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(170);
    java.lang.Integer var18 = new java.lang.Integer(157);
    java.lang.Integer var19 = new java.lang.Integer(891);
    var12.insereAresta((int)var17, (int)var18, (int)var19);
    ds.Grafo var21 = var12.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(170);
    java.lang.Integer var23 = new java.lang.Integer(157);
    java.lang.Integer var24 = new java.lang.Integer(891);
    var12.insereAresta((int)var22, (int)var23, (int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var26 = var5.retiraAresta((int)var10, (int)var24);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(214);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(170);
    java.lang.Integer var8 = new java.lang.Integer(157);
    java.lang.Integer var9 = new java.lang.Integer(891);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(742);
    ds.Grafo var12 = new ds.Grafo(var11);
    var12.imprime();
    java.lang.Integer var14 = new java.lang.Integer(348);
    boolean var15 = var12.listaAdjVazia((int)var14);
    ds.Grafo var16 = var12.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(170);
    java.lang.Integer var18 = new java.lang.Integer(157);
    java.lang.Integer var19 = new java.lang.Integer(891);
    var12.insereAresta((int)var17, (int)var18, (int)var19);
    java.lang.Integer var21 = new java.lang.Integer(742);
    ds.Grafo var22 = new ds.Grafo(var21);
    var22.imprime();
    java.lang.Integer var24 = new java.lang.Integer(348);
    boolean var25 = var22.listaAdjVazia((int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var9, (int)var17, (int)var24);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(997);
    ds.Grafo var4 = new ds.Grafo(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(261);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(214);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(170);
    java.lang.Integer var8 = new java.lang.Integer(157);
    java.lang.Integer var9 = new java.lang.Integer(891);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(801);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    int var14 = var12.numVertices();
    int var15 = var12.numVertices();
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(742);
    ds.Grafo var18 = new ds.Grafo(var17);
    var18.imprime();
    java.lang.Integer var20 = new java.lang.Integer(348);
    boolean var21 = var18.listaAdjVazia((int)var20);
    ds.Grafo var22 = var18.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(170);
    java.lang.Integer var24 = new java.lang.Integer(157);
    java.lang.Integer var25 = new java.lang.Integer(891);
    var18.insereAresta((int)var23, (int)var24, (int)var25);
    ds.Grafo var27 = var18.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(170);
    java.lang.Integer var29 = new java.lang.Integer(157);
    java.lang.Integer var30 = new java.lang.Integer(891);
    var18.insereAresta((int)var28, (int)var29, (int)var30);
    ds.Grafo var32 = var18.grafoTransposto();
    int var33 = var18.numVertices();
    ds.Grafo.Aresta var34 = var16.primeiroListaAdj((int)var33);
    boolean var35 = var1.existeAresta((int)var7, (int)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 742);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(10);
    boolean var5 = var1.listaAdjVazia((int)var4);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(801);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var5.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(232);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var9.listaAdjVazia((int)var10);
    ds.Grafo.Aresta var12 = var5.primeiroListaAdj((int)var10);
    java.lang.Integer var13 = new java.lang.Integer(742);
    ds.Grafo var14 = new ds.Grafo(var13);
    var14.imprime();
    java.lang.Integer var16 = new java.lang.Integer(348);
    boolean var17 = var14.listaAdjVazia((int)var16);
    ds.Grafo var18 = var14.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(170);
    java.lang.Integer var20 = new java.lang.Integer(157);
    java.lang.Integer var21 = new java.lang.Integer(891);
    var14.insereAresta((int)var19, (int)var20, (int)var21);
    ds.Grafo var23 = var14.grafoTransposto();
    java.lang.Integer var24 = new java.lang.Integer(170);
    java.lang.Integer var25 = new java.lang.Integer(157);
    java.lang.Integer var26 = new java.lang.Integer(891);
    var14.insereAresta((int)var24, (int)var25, (int)var26);
    java.lang.Integer var28 = new java.lang.Integer(801);
    ds.Grafo var29 = new ds.Grafo(var28);
    var1.insereAresta((int)var10, (int)var26, (int)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(214);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(801);
    ds.Grafo var7 = new ds.Grafo(var6);
    boolean var8 = var1.existeAresta((int)var5, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(637);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var8.listaAdjVazia((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 742);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    int var6 = var1.numVertices();
    ds.Grafo var7 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 408);

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(170);
    java.lang.Integer var7 = new java.lang.Integer(157);
    java.lang.Integer var8 = new java.lang.Integer(891);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(214);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    int var13 = var12.numVertices();
    java.lang.Integer var14 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var15 = var1.retiraAresta((int)var13, (int)var14);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 214);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(742);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    java.lang.Integer var5 = new java.lang.Integer(348);
    boolean var6 = var3.listaAdjVazia((int)var5);
    ds.Grafo var7 = var3.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(170);
    java.lang.Integer var9 = new java.lang.Integer(157);
    java.lang.Integer var10 = new java.lang.Integer(891);
    var3.insereAresta((int)var8, (int)var9, (int)var10);
    ds.Grafo var12 = var3.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(170);
    java.lang.Integer var14 = new java.lang.Integer(157);
    java.lang.Integer var15 = new java.lang.Integer(891);
    var3.insereAresta((int)var13, (int)var14, (int)var15);
    ds.Grafo var17 = var3.grafoTransposto();
    int var18 = var3.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var1.proxAdj((int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 742);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(997);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(742);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    java.lang.Integer var5 = new java.lang.Integer(348);
    boolean var6 = var3.listaAdjVazia((int)var5);
    ds.Grafo var7 = var3.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(170);
    java.lang.Integer var9 = new java.lang.Integer(157);
    java.lang.Integer var10 = new java.lang.Integer(891);
    var3.insereAresta((int)var8, (int)var9, (int)var10);
    boolean var12 = var1.listaAdjVazia((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(997);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.listaAdjVazia((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(214);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var2.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(801);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    int var11 = var9.numVertices();
    int var12 = var9.numVertices();
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(742);
    ds.Grafo var15 = new ds.Grafo(var14);
    var15.imprime();
    java.lang.Integer var17 = new java.lang.Integer(348);
    boolean var18 = var15.listaAdjVazia((int)var17);
    ds.Grafo var19 = var15.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(170);
    java.lang.Integer var21 = new java.lang.Integer(157);
    java.lang.Integer var22 = new java.lang.Integer(891);
    var15.insereAresta((int)var20, (int)var21, (int)var22);
    ds.Grafo var24 = var15.grafoTransposto();
    java.lang.Integer var25 = new java.lang.Integer(170);
    java.lang.Integer var26 = new java.lang.Integer(157);
    java.lang.Integer var27 = new java.lang.Integer(891);
    var15.insereAresta((int)var25, (int)var26, (int)var27);
    ds.Grafo var29 = var15.grafoTransposto();
    int var30 = var15.numVertices();
    ds.Grafo.Aresta var31 = var13.primeiroListaAdj((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(734);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(261);
    ds.Grafo var35 = new ds.Grafo(var34);
    ds.Grafo.Aresta var36 = var33.proxAdj((int)var34);
    int var37 = var33.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var38 = var2.retiraAresta((int)var30, (int)var37);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 742);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 734);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(934);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    java.lang.Integer var4 = new java.lang.Integer(408);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var5.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(114);
    boolean var9 = var5.listaAdjVazia((int)var8);
    boolean var10 = var1.listaAdjVazia((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(742);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    java.lang.Integer var5 = new java.lang.Integer(348);
    boolean var6 = var3.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var5);
    ds.Grafo var8 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 801);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(742);
    ds.Grafo var7 = new ds.Grafo(var6);
    var7.imprime();
    java.lang.Integer var9 = new java.lang.Integer(348);
    boolean var10 = var7.listaAdjVazia((int)var9);
    ds.Grafo var11 = var7.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(170);
    java.lang.Integer var13 = new java.lang.Integer(157);
    java.lang.Integer var14 = new java.lang.Integer(891);
    var7.insereAresta((int)var12, (int)var13, (int)var14);
    ds.Grafo var16 = var7.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(170);
    java.lang.Integer var18 = new java.lang.Integer(157);
    java.lang.Integer var19 = new java.lang.Integer(891);
    var7.insereAresta((int)var17, (int)var18, (int)var19);
    ds.Grafo var21 = var7.grafoTransposto();
    int var22 = var7.numVertices();
    ds.Grafo.Aresta var23 = var5.primeiroListaAdj((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(742);
    ds.Grafo var25 = new ds.Grafo(var24);
    var25.imprime();
    java.lang.Integer var27 = new java.lang.Integer(348);
    boolean var28 = var25.listaAdjVazia((int)var27);
    ds.Grafo var29 = var25.grafoTransposto();
    java.lang.Integer var30 = new java.lang.Integer(408);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(1);
    ds.Grafo.Aresta var33 = var31.proxAdj((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(114);
    boolean var35 = var31.listaAdjVazia((int)var34);
    boolean var36 = var25.listaAdjVazia((int)var34);
    ds.Grafo.Aresta var37 = var5.primeiroListaAdj((int)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 742);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(214);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    int var12 = var11.numVertices();
    boolean var13 = var1.listaAdjVazia((int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(261);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(214);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(170);
    java.lang.Integer var10 = new java.lang.Integer(157);
    java.lang.Integer var11 = new java.lang.Integer(891);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    boolean var13 = var1.listaAdjVazia((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 734);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(232);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(742);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    java.lang.Integer var5 = new java.lang.Integer(348);
    boolean var6 = var3.listaAdjVazia((int)var5);
    ds.Grafo var7 = var3.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(170);
    java.lang.Integer var9 = new java.lang.Integer(157);
    java.lang.Integer var10 = new java.lang.Integer(891);
    var3.insereAresta((int)var8, (int)var9, (int)var10);
    ds.Grafo var12 = var3.grafoTransposto();
    int var13 = var3.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.listaAdjVazia((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 742);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(742);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(348);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(408);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(114);
    boolean var11 = var7.listaAdjVazia((int)var10);
    boolean var12 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var13 = new java.lang.Integer(742);
    ds.Grafo var14 = new ds.Grafo(var13);
    var14.imprime();
    java.lang.Integer var16 = new java.lang.Integer(348);
    boolean var17 = var14.listaAdjVazia((int)var16);
    ds.Grafo var18 = var14.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(170);
    java.lang.Integer var20 = new java.lang.Integer(157);
    java.lang.Integer var21 = new java.lang.Integer(891);
    var14.insereAresta((int)var19, (int)var20, (int)var21);
    ds.Grafo var23 = var14.grafoTransposto();
    int var24 = var14.numVertices();
    java.lang.Integer var25 = new java.lang.Integer((-1));
    java.lang.Integer var26 = new java.lang.Integer(214);
    ds.Grafo var27 = new ds.Grafo(var26);
    int var28 = var27.numVertices();
    int var29 = var27.numVertices();
    java.lang.Integer var30 = new java.lang.Integer(10);
    boolean var31 = var27.listaAdjVazia((int)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var24, (int)var25, (int)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 742);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(408);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(114);
    boolean var5 = var1.listaAdjVazia((int)var4);
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(801);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    int var10 = var8.numVertices();
    int var11 = var8.numVertices();
    ds.Grafo var12 = new ds.Grafo(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var13 = var1.proxAdj((int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 801);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(801);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(170);
    java.lang.Integer var4 = new java.lang.Integer(157);
    java.lang.Integer var5 = new java.lang.Integer(891);
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(232);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(934);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(742);
    ds.Grafo var16 = new ds.Grafo(var15);
    var16.imprime();
    java.lang.Integer var18 = new java.lang.Integer(348);
    boolean var19 = var16.listaAdjVazia((int)var18);
    ds.Grafo var20 = var16.grafoTransposto();
    java.lang.Integer var21 = new java.lang.Integer(170);
    java.lang.Integer var22 = new java.lang.Integer(157);
    java.lang.Integer var23 = new java.lang.Integer(891);
    var16.insereAresta((int)var21, (int)var22, (int)var23);
    ds.Grafo var25 = var16.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(170);
    java.lang.Integer var27 = new java.lang.Integer(157);
    java.lang.Integer var28 = new java.lang.Integer(891);
    var16.insereAresta((int)var26, (int)var27, (int)var28);
    ds.Grafo var30 = var16.grafoTransposto();
    int var31 = var16.numVertices();
    var1.insereAresta((int)var11, (int)var13, (int)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 742);

  }

}
