package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    int var10 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 908);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(603);
    java.lang.Integer var3 = new java.lang.Integer(180);
    java.lang.Integer var4 = new java.lang.Integer((-369));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo var6 = new ds.Grafo(var4);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(603);
    java.lang.Integer var3 = new java.lang.Integer(180);
    java.lang.Integer var4 = new java.lang.Integer((-369));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    boolean var8 = var1.existeAresta((int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 264);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
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

    java.lang.Integer var0 = new java.lang.Integer(972);
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

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(89);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    boolean var5 = var2.existeAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(603);
    java.lang.Integer var3 = new java.lang.Integer(180);
    java.lang.Integer var4 = new java.lang.Integer((-369));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    int var8 = var1.numVertices();
    boolean var9 = var1.existeAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    boolean var14 = var1.existeAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(89);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    boolean var4 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 972);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 297);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    int var16 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 908);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    var1.insereAresta((int)var16, (int)var16, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
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

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
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

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(6);
    boolean var19 = var1.listaAdjVazia((int)var18);
    ds.Grafo.Aresta var20 = var1.proxAdj((int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
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
    assertTrue(var20 == null);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    ds.Grafo var16 = var1.grafoTransposto();
    var16.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    ds.Grafo var16 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    boolean var4 = var3.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(6);
    boolean var19 = var1.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(7);
    boolean var21 = var1.listaAdjVazia((int)var20);
    int var22 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
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
    assertTrue(var22 == 908);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(89);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
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
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 555);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test40() throws Throwable {

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

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(89);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    boolean var5 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(6);
    boolean var19 = var1.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(7);
    boolean var21 = var1.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(519);
    boolean var23 = var1.listaAdjVazia((int)var22);
    ds.Grafo var24 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
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

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(89);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    int var5 = var2.numVertices();
    boolean var6 = var2.existeAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(89);
    ds.Grafo.Aresta var4 = var2.primeiroListaAdj((int)var3);
    int var5 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 555);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo.Aresta var4 = var2.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(512);
    boolean var5 = var2.listaAdjVazia((int)var4);
    ds.Grafo var6 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(89);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    int var6 = var3.numVertices();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 555);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(512);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(513);
    boolean var7 = var2.listaAdjVazia((int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var2.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(89);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    int var5 = var1.numVertices();
    var2.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 555);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(89);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 555);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    boolean var4 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(512);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(513);
    boolean var7 = var2.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(514);
    boolean var9 = var2.listaAdjVazia((int)var8);
    ds.Grafo var10 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
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

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 555);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    int var4 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 555);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(6);
    boolean var19 = var1.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(7);
    boolean var21 = var1.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(519);
    boolean var23 = var1.listaAdjVazia((int)var22);
    ds.Grafo var24 = var1.grafoTransposto();
    ds.Grafo.Aresta var25 = var24.retiraAresta((int)var22, (int)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
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
    assertTrue(var25 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(908);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(398);
    java.lang.Integer var3 = new java.lang.Integer(370);
    java.lang.Integer var4 = new java.lang.Integer(715);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(512);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(514);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(515);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(6);
    boolean var19 = var1.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(7);
    boolean var21 = var1.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(519);
    boolean var23 = var1.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(9);
    boolean var25 = var1.listaAdjVazia((int)var24);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(83);
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

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(83);
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

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    boolean var4 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(908);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(398);
    java.lang.Integer var6 = new java.lang.Integer(370);
    java.lang.Integer var7 = new java.lang.Integer(715);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var4.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(908);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(398);
    java.lang.Integer var14 = new java.lang.Integer(370);
    java.lang.Integer var15 = new java.lang.Integer(715);
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Grafo.Aresta var18 = var12.proxAdj((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(512);
    boolean var20 = var12.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(2);
    boolean var22 = var12.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(514);
    boolean var24 = var12.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(515);
    boolean var26 = var12.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(5);
    boolean var28 = var12.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(6);
    boolean var30 = var12.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(7);
    boolean var32 = var12.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(519);
    boolean var34 = var12.listaAdjVazia((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(9);
    boolean var36 = var12.listaAdjVazia((int)var35);
    ds.Grafo.Aresta var37 = var1.retiraAresta((int)var9, (int)var35);
    ds.Grafo var38 = new ds.Grafo(var9);
    java.lang.Integer var39 = new java.lang.Integer(555);
    ds.Grafo var40 = new ds.Grafo(var39);
    java.lang.Integer var41 = new java.lang.Integer(908);
    ds.Grafo var42 = new ds.Grafo(var41);
    java.lang.Integer var43 = new java.lang.Integer(398);
    java.lang.Integer var44 = new java.lang.Integer(370);
    java.lang.Integer var45 = new java.lang.Integer(715);
    var42.insereAresta((int)var43, (int)var44, (int)var45);
    ds.Grafo.Aresta var47 = var38.retiraAresta((int)var39, (int)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == null);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(89);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    int var4 = var1.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(555);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(603);
    java.lang.Integer var9 = new java.lang.Integer(180);
    java.lang.Integer var10 = new java.lang.Integer((-369));
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    boolean var12 = var1.existeAresta((int)var5, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(555);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var3.numVertices();
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer(908);
    ds.Grafo var8 = new ds.Grafo(var7);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 555);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(908);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(398);
    java.lang.Integer var6 = new java.lang.Integer(370);
    java.lang.Integer var7 = new java.lang.Integer(715);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var4.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(908);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(398);
    java.lang.Integer var14 = new java.lang.Integer(370);
    java.lang.Integer var15 = new java.lang.Integer(715);
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Grafo.Aresta var18 = var12.proxAdj((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(512);
    boolean var20 = var12.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(2);
    boolean var22 = var12.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(514);
    boolean var24 = var12.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(515);
    boolean var26 = var12.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(5);
    boolean var28 = var12.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(6);
    boolean var30 = var12.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(7);
    boolean var32 = var12.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(519);
    boolean var34 = var12.listaAdjVazia((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(9);
    boolean var36 = var12.listaAdjVazia((int)var35);
    ds.Grafo.Aresta var37 = var1.retiraAresta((int)var9, (int)var35);
    ds.Grafo var38 = new ds.Grafo(var9);
    java.lang.Integer var39 = new java.lang.Integer(555);
    ds.Grafo var40 = new ds.Grafo(var39);
    ds.Grafo var41 = var40.grafoTransposto();
    java.lang.Integer var42 = new java.lang.Integer(908);
    ds.Grafo var43 = new ds.Grafo(var42);
    java.lang.Integer var44 = new java.lang.Integer(398);
    java.lang.Integer var45 = new java.lang.Integer(370);
    java.lang.Integer var46 = new java.lang.Integer(715);
    var43.insereAresta((int)var44, (int)var45, (int)var46);
    java.lang.Integer var48 = new java.lang.Integer(0);
    ds.Grafo.Aresta var49 = var43.proxAdj((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(512);
    boolean var51 = var43.listaAdjVazia((int)var50);
    java.lang.Integer var52 = new java.lang.Integer(2);
    boolean var53 = var43.listaAdjVazia((int)var52);
    java.lang.Integer var54 = new java.lang.Integer(514);
    boolean var55 = var43.listaAdjVazia((int)var54);
    java.lang.Integer var56 = new java.lang.Integer(515);
    boolean var57 = var43.listaAdjVazia((int)var56);
    java.lang.Integer var58 = new java.lang.Integer(5);
    boolean var59 = var43.listaAdjVazia((int)var58);
    java.lang.Integer var60 = new java.lang.Integer(6);
    boolean var61 = var43.listaAdjVazia((int)var60);
    java.lang.Integer var62 = new java.lang.Integer(7);
    boolean var63 = var43.listaAdjVazia((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(519);
    boolean var65 = var43.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(9);
    boolean var67 = var43.listaAdjVazia((int)var66);
    boolean var68 = var41.listaAdjVazia((int)var66);
    java.lang.Integer var69 = new java.lang.Integer(297);
    ds.Grafo var70 = new ds.Grafo(var69);
    ds.Grafo var71 = var70.grafoTransposto();
    int var72 = var71.numVertices();
    boolean var73 = var38.existeAresta((int)var66, (int)var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == null);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(555);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(89);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    int var6 = var3.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(555);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(89);
    ds.Grafo.Aresta var10 = var8.proxAdj((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(297);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    int var14 = var13.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(512);
    boolean var16 = var13.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(513);
    boolean var18 = var13.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(514);
    boolean var20 = var13.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(908);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(398);
    java.lang.Integer var24 = new java.lang.Integer(370);
    java.lang.Integer var25 = new java.lang.Integer(715);
    var22.insereAresta((int)var23, (int)var24, (int)var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    ds.Grafo.Aresta var28 = var22.proxAdj((int)var27);
    var3.insereAresta((int)var9, (int)var19, (int)var27);
    java.lang.Integer var30 = new java.lang.Integer(555);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(89);
    ds.Grafo.Aresta var33 = var31.proxAdj((int)var32);
    int var34 = var31.numVertices();
    java.lang.Integer var35 = new java.lang.Integer(555);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(89);
    ds.Grafo.Aresta var38 = var36.proxAdj((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(297);
    ds.Grafo var40 = new ds.Grafo(var39);
    ds.Grafo var41 = var40.grafoTransposto();
    int var42 = var41.numVertices();
    java.lang.Integer var43 = new java.lang.Integer(512);
    boolean var44 = var41.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(513);
    boolean var46 = var41.listaAdjVazia((int)var45);
    java.lang.Integer var47 = new java.lang.Integer(514);
    boolean var48 = var41.listaAdjVazia((int)var47);
    java.lang.Integer var49 = new java.lang.Integer(908);
    ds.Grafo var50 = new ds.Grafo(var49);
    java.lang.Integer var51 = new java.lang.Integer(398);
    java.lang.Integer var52 = new java.lang.Integer(370);
    java.lang.Integer var53 = new java.lang.Integer(715);
    var50.insereAresta((int)var51, (int)var52, (int)var53);
    java.lang.Integer var55 = new java.lang.Integer(0);
    ds.Grafo.Aresta var56 = var50.proxAdj((int)var55);
    var31.insereAresta((int)var37, (int)var47, (int)var55);
    ds.Grafo var58 = new ds.Grafo(var37);
    ds.Grafo.Aresta var59 = var1.retiraAresta((int)var19, (int)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == null);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(512);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo var7 = new ds.Grafo(var6);
    boolean var8 = var2.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(264);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    int var5 = var3.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(908);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(972);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(908);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(398);
    java.lang.Integer var13 = new java.lang.Integer(370);
    java.lang.Integer var14 = new java.lang.Integer(715);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Grafo.Aresta var17 = var11.proxAdj((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(512);
    boolean var19 = var11.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(2);
    boolean var21 = var11.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(514);
    boolean var23 = var11.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(515);
    boolean var25 = var11.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(5);
    boolean var27 = var11.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(6);
    boolean var29 = var11.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(7);
    boolean var31 = var11.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(519);
    boolean var33 = var11.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(9);
    boolean var35 = var11.listaAdjVazia((int)var34);
    java.lang.Integer var36 = new java.lang.Integer(908);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(398);
    java.lang.Integer var39 = new java.lang.Integer(370);
    java.lang.Integer var40 = new java.lang.Integer(715);
    var37.insereAresta((int)var38, (int)var39, (int)var40);
    java.lang.Integer var42 = new java.lang.Integer(0);
    ds.Grafo.Aresta var43 = var37.proxAdj((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(512);
    boolean var45 = var37.listaAdjVazia((int)var44);
    java.lang.Integer var46 = new java.lang.Integer(2);
    boolean var47 = var37.listaAdjVazia((int)var46);
    boolean var48 = var9.existeAresta((int)var34, (int)var46);
    java.lang.Integer var49 = new java.lang.Integer(555);
    ds.Grafo var50 = new ds.Grafo(var49);
    java.lang.Integer var51 = new java.lang.Integer(89);
    ds.Grafo.Aresta var52 = var50.proxAdj((int)var51);
    int var53 = var50.numVertices();
    java.lang.Integer var54 = new java.lang.Integer(555);
    ds.Grafo var55 = new ds.Grafo(var54);
    java.lang.Integer var56 = new java.lang.Integer(89);
    ds.Grafo.Aresta var57 = var55.proxAdj((int)var56);
    java.lang.Integer var58 = new java.lang.Integer(297);
    ds.Grafo var59 = new ds.Grafo(var58);
    ds.Grafo var60 = var59.grafoTransposto();
    int var61 = var60.numVertices();
    java.lang.Integer var62 = new java.lang.Integer(512);
    boolean var63 = var60.listaAdjVazia((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(513);
    boolean var65 = var60.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(514);
    boolean var67 = var60.listaAdjVazia((int)var66);
    java.lang.Integer var68 = new java.lang.Integer(908);
    ds.Grafo var69 = new ds.Grafo(var68);
    java.lang.Integer var70 = new java.lang.Integer(398);
    java.lang.Integer var71 = new java.lang.Integer(370);
    java.lang.Integer var72 = new java.lang.Integer(715);
    var69.insereAresta((int)var70, (int)var71, (int)var72);
    java.lang.Integer var74 = new java.lang.Integer(0);
    ds.Grafo.Aresta var75 = var69.proxAdj((int)var74);
    var50.insereAresta((int)var56, (int)var66, (int)var74);
    boolean var77 = var7.existeAresta((int)var46, (int)var66);
    java.lang.Integer var78 = new java.lang.Integer(1);
    ds.Grafo var79 = new ds.Grafo(var78);
    boolean var80 = var3.existeAresta((int)var46, (int)var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var81 = var1.proxAdj((int)var46);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 264);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
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
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(555);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(603);
    java.lang.Integer var6 = new java.lang.Integer(180);
    java.lang.Integer var7 = new java.lang.Integer((-369));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    int var11 = var4.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(908);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(398);
    java.lang.Integer var15 = new java.lang.Integer(370);
    java.lang.Integer var16 = new java.lang.Integer(715);
    var13.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(555);
    ds.Grafo var19 = new ds.Grafo(var18);
    ds.Grafo var20 = var19.grafoTransposto();
    java.lang.Integer var21 = new java.lang.Integer(908);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(398);
    java.lang.Integer var24 = new java.lang.Integer(370);
    java.lang.Integer var25 = new java.lang.Integer(715);
    var22.insereAresta((int)var23, (int)var24, (int)var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    ds.Grafo.Aresta var28 = var22.proxAdj((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(908);
    ds.Grafo var30 = new ds.Grafo(var29);
    java.lang.Integer var31 = new java.lang.Integer(398);
    java.lang.Integer var32 = new java.lang.Integer(370);
    java.lang.Integer var33 = new java.lang.Integer(715);
    var30.insereAresta((int)var31, (int)var32, (int)var33);
    java.lang.Integer var35 = new java.lang.Integer(0);
    ds.Grafo.Aresta var36 = var30.proxAdj((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(512);
    boolean var38 = var30.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(2);
    boolean var40 = var30.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(514);
    boolean var42 = var30.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(515);
    boolean var44 = var30.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(5);
    boolean var46 = var30.listaAdjVazia((int)var45);
    java.lang.Integer var47 = new java.lang.Integer(6);
    boolean var48 = var30.listaAdjVazia((int)var47);
    java.lang.Integer var49 = new java.lang.Integer(7);
    boolean var50 = var30.listaAdjVazia((int)var49);
    java.lang.Integer var51 = new java.lang.Integer(519);
    boolean var52 = var30.listaAdjVazia((int)var51);
    java.lang.Integer var53 = new java.lang.Integer(9);
    boolean var54 = var30.listaAdjVazia((int)var53);
    ds.Grafo.Aresta var55 = var19.retiraAresta((int)var27, (int)var53);
    java.lang.Integer var56 = new java.lang.Integer(0);
    ds.Grafo var57 = new ds.Grafo(var56);
    ds.Grafo var58 = var57.grafoTransposto();
    int var59 = var58.numVertices();
    ds.Grafo.Aresta var60 = var13.retiraAresta((int)var27, (int)var59);
    ds.Grafo.Aresta var61 = var1.retiraAresta((int)var11, (int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);
    
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
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(937);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 937);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(83);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(908);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(972);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(908);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(398);
    java.lang.Integer var11 = new java.lang.Integer(370);
    java.lang.Integer var12 = new java.lang.Integer(715);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    ds.Grafo.Aresta var15 = var9.proxAdj((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(512);
    boolean var17 = var9.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(2);
    boolean var19 = var9.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(514);
    boolean var21 = var9.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(515);
    boolean var23 = var9.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(5);
    boolean var25 = var9.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(6);
    boolean var27 = var9.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(7);
    boolean var29 = var9.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(519);
    boolean var31 = var9.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(9);
    boolean var33 = var9.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(908);
    ds.Grafo var35 = new ds.Grafo(var34);
    java.lang.Integer var36 = new java.lang.Integer(398);
    java.lang.Integer var37 = new java.lang.Integer(370);
    java.lang.Integer var38 = new java.lang.Integer(715);
    var35.insereAresta((int)var36, (int)var37, (int)var38);
    java.lang.Integer var40 = new java.lang.Integer(0);
    ds.Grafo.Aresta var41 = var35.proxAdj((int)var40);
    java.lang.Integer var42 = new java.lang.Integer(512);
    boolean var43 = var35.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(2);
    boolean var45 = var35.listaAdjVazia((int)var44);
    boolean var46 = var7.existeAresta((int)var32, (int)var44);
    java.lang.Integer var47 = new java.lang.Integer(555);
    ds.Grafo var48 = new ds.Grafo(var47);
    java.lang.Integer var49 = new java.lang.Integer(89);
    ds.Grafo.Aresta var50 = var48.proxAdj((int)var49);
    int var51 = var48.numVertices();
    java.lang.Integer var52 = new java.lang.Integer(555);
    ds.Grafo var53 = new ds.Grafo(var52);
    java.lang.Integer var54 = new java.lang.Integer(89);
    ds.Grafo.Aresta var55 = var53.proxAdj((int)var54);
    java.lang.Integer var56 = new java.lang.Integer(297);
    ds.Grafo var57 = new ds.Grafo(var56);
    ds.Grafo var58 = var57.grafoTransposto();
    int var59 = var58.numVertices();
    java.lang.Integer var60 = new java.lang.Integer(512);
    boolean var61 = var58.listaAdjVazia((int)var60);
    java.lang.Integer var62 = new java.lang.Integer(513);
    boolean var63 = var58.listaAdjVazia((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(514);
    boolean var65 = var58.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(908);
    ds.Grafo var67 = new ds.Grafo(var66);
    java.lang.Integer var68 = new java.lang.Integer(398);
    java.lang.Integer var69 = new java.lang.Integer(370);
    java.lang.Integer var70 = new java.lang.Integer(715);
    var67.insereAresta((int)var68, (int)var69, (int)var70);
    java.lang.Integer var72 = new java.lang.Integer(0);
    ds.Grafo.Aresta var73 = var67.proxAdj((int)var72);
    var48.insereAresta((int)var54, (int)var64, (int)var72);
    boolean var75 = var5.existeAresta((int)var44, (int)var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var76 = var2.proxAdj((int)var64);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
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
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 972);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 555);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 264);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(555);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(555);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(603);
    java.lang.Integer var6 = new java.lang.Integer(180);
    java.lang.Integer var7 = new java.lang.Integer((-369));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    int var11 = var4.numVertices();
    java.lang.Integer var12 = new java.lang.Integer(555);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(89);
    ds.Grafo.Aresta var16 = var14.primeiroListaAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(555);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    ds.Grafo var20 = var18.grafoTransposto();
    java.lang.Integer var21 = new java.lang.Integer(89);
    ds.Grafo.Aresta var22 = var20.primeiroListaAdj((int)var21);
    int var23 = var20.numVertices();
    boolean var24 = var4.existeAresta((int)var15, (int)var23);
    int var25 = var4.numVertices();
    java.lang.Integer var26 = new java.lang.Integer(264);
    ds.Grafo var27 = new ds.Grafo(var26);
    ds.Grafo var28 = var27.grafoTransposto();
    java.lang.Integer var29 = new java.lang.Integer(555);
    ds.Grafo var30 = new ds.Grafo(var29);
    java.lang.Integer var31 = new java.lang.Integer(89);
    ds.Grafo.Aresta var32 = var30.proxAdj((int)var31);
    int var33 = var30.numVertices();
    boolean var34 = var27.listaAdjVazia((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(555);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(603);
    java.lang.Integer var38 = new java.lang.Integer(180);
    java.lang.Integer var39 = new java.lang.Integer((-369));
    var36.insereAresta((int)var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(0);
    boolean var42 = var36.listaAdjVazia((int)var41);
    var2.insereAresta((int)var25, (int)var33, (int)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 555);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

}
