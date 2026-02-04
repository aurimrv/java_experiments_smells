package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
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

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    boolean var5 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
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

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
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

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.listaAdjVazia((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
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

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(680);
    java.lang.Integer var5 = new java.lang.Integer(990);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var4.retiraAresta((int)var9, (int)var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(680);
    java.lang.Integer var5 = new java.lang.Integer(990);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-682));
    java.lang.Integer var9 = new java.lang.Integer(938);
    var1.insereAresta((int)var7, (int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.listaAdjVazia((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(680);
    java.lang.Integer var5 = new java.lang.Integer(990);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-682));
    java.lang.Integer var9 = new java.lang.Integer(938);
    var1.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-231));
    ds.Grafo.Aresta var13 = var1.retiraAresta((int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var12, (int)var12, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
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

    java.lang.Integer var0 = new java.lang.Integer(780);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
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

    java.lang.Integer var0 = new java.lang.Integer(927);
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

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    int var13 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 865);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 865);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    boolean var15 = var4.existeAresta((int)var13, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var4.retiraAresta((int)var15, (int)var15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
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

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(689);
    java.lang.Integer var4 = new java.lang.Integer(764);
    java.lang.Integer var5 = new java.lang.Integer(280);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var3, (int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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
    assertTrue(var2 == 126);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
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

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(680);
    java.lang.Integer var5 = new java.lang.Integer(990);
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

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 126);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    boolean var5 = var4.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var5, (int)var6, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.existeAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(465);
    java.lang.Integer var5 = new java.lang.Integer((-730));
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

    java.lang.Integer var0 = new java.lang.Integer(927);
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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
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

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 154);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
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

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 667);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
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

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 455);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
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

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(165);
    java.lang.Integer var4 = new java.lang.Integer(601);
    java.lang.Integer var5 = new java.lang.Integer((-62));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var3, (int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    int var19 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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
    assertTrue(var19 == 865);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var2.existeAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 455);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(5);
    boolean var20 = var1.listaAdjVazia((int)var19);
    int var21 = var4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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
    assertTrue(var21 == 865);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(5);
    boolean var20 = var1.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(6);
    boolean var22 = var1.listaAdjVazia((int)var21);
    ds.Grafo var23 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    int var5 = var2.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 455);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    boolean var6 = var5.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
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

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
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

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 455);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    ds.Grafo var4 = new ds.Grafo(var0);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
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

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(667);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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

    java.lang.Integer var0 = new java.lang.Integer(865);
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
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

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    ds.Grafo var15 = var1.grafoTransposto();
    boolean var16 = var15.existeAresta((int)var13, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    ds.Grafo var15 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var1.imprime();
    boolean var6 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    ds.Grafo var4 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.retiraAresta((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(972);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var4.primeiroListaAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 126);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    int var3 = var1.numVertices();
    ds.Grafo var4 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 126);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
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

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
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
    assertTrue(var3 == 927);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
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

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
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

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insereAresta((int)var2, (int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
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

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 865);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
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

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(689);
    java.lang.Integer var5 = new java.lang.Integer(764);
    java.lang.Integer var6 = new java.lang.Integer(280);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var4, (int)var5, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(154);
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

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
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

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(865);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(248);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(680);
    java.lang.Integer var8 = new java.lang.Integer(990);
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 927);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(154);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(455);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    int var8 = var5.numVertices();
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    ds.Grafo var10 = new ds.Grafo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(865);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(248);
    ds.Grafo.Aresta var7 = var5.primeiroListaAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(680);
    java.lang.Integer var9 = new java.lang.Integer(990);
    boolean var10 = var5.existeAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-682));
    java.lang.Integer var13 = new java.lang.Integer(938);
    var5.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(927);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(865);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    var19.imprime();
    java.lang.Integer var21 = new java.lang.Integer(865);
    ds.Grafo var22 = new ds.Grafo(var21);
    java.lang.Integer var23 = new java.lang.Integer(248);
    ds.Grafo.Aresta var24 = var22.primeiroListaAdj((int)var23);
    ds.Grafo var25 = var22.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(689);
    java.lang.Integer var27 = new java.lang.Integer(764);
    java.lang.Integer var28 = new java.lang.Integer(280);
    var22.insereAresta((int)var26, (int)var27, (int)var28);
    boolean var30 = var19.listaAdjVazia((int)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var12, (int)var15, (int)var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(154);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(780);
    ds.Grafo var6 = new ds.Grafo(var5);
    boolean var7 = var2.existeAresta((int)var3, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(865);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(248);
    ds.Grafo.Aresta var5 = var3.primeiroListaAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(680);
    java.lang.Integer var7 = new java.lang.Integer(990);
    boolean var8 = var3.existeAresta((int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer((-682));
    java.lang.Integer var11 = new java.lang.Integer(938);
    var3.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer((-231));
    ds.Grafo.Aresta var15 = var3.retiraAresta((int)var13, (int)var14);
    ds.Grafo.Aresta var16 = var1.proxAdj((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(5);
    boolean var20 = var1.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(6);
    boolean var22 = var1.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(455);
    ds.Grafo var24 = new ds.Grafo(var23);
    ds.Grafo var25 = var24.grafoTransposto();
    int var26 = var25.numVertices();
    ds.Grafo.Aresta var27 = var1.proxAdj((int)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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
    assertTrue(var26 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(865);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(248);
    ds.Grafo.Aresta var8 = var6.primeiroListaAdj((int)var7);
    ds.Grafo var9 = var6.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(689);
    java.lang.Integer var11 = new java.lang.Integer(764);
    java.lang.Integer var12 = new java.lang.Integer(280);
    var6.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var6.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var6.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(2);
    boolean var19 = var6.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(865);
    ds.Grafo var21 = new ds.Grafo(var20);
    java.lang.Integer var22 = new java.lang.Integer(248);
    ds.Grafo.Aresta var23 = var21.primeiroListaAdj((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(680);
    java.lang.Integer var25 = new java.lang.Integer(990);
    boolean var26 = var21.existeAresta((int)var24, (int)var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    java.lang.Integer var28 = new java.lang.Integer((-682));
    java.lang.Integer var29 = new java.lang.Integer(938);
    var21.insereAresta((int)var27, (int)var28, (int)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var31 = var4.retiraAresta((int)var18, (int)var29);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(865);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(248);
    ds.Grafo.Aresta var9 = var7.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(680);
    java.lang.Integer var11 = new java.lang.Integer(990);
    boolean var12 = var7.existeAresta((int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer((-682));
    java.lang.Integer var15 = new java.lang.Integer(938);
    var7.insereAresta((int)var13, (int)var14, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var18 = var5.retiraAresta((int)var14, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(455);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    int var8 = var5.numVertices();
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    java.lang.Integer var11 = new java.lang.Integer(455);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(126);
    ds.Grafo var14 = new ds.Grafo(var13);
    int var15 = var14.numVertices();
    ds.Grafo var16 = var14.grafoTransposto();
    int var17 = var16.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var10, (int)var11, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 126);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(927);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(126);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(865);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(248);
    ds.Grafo.Aresta var12 = var10.primeiroListaAdj((int)var11);
    ds.Grafo var13 = var10.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(689);
    java.lang.Integer var15 = new java.lang.Integer(764);
    java.lang.Integer var16 = new java.lang.Integer(280);
    var10.insereAresta((int)var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var10.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var10.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(2);
    boolean var23 = var10.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(3);
    boolean var25 = var10.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(4);
    boolean var27 = var10.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(5);
    boolean var29 = var10.listaAdjVazia((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(6);
    boolean var31 = var10.listaAdjVazia((int)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var5, (int)var7, (int)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
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

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(126);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(455);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(865);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(248);
    ds.Grafo.Aresta var9 = var7.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(680);
    java.lang.Integer var11 = new java.lang.Integer(990);
    boolean var12 = var7.existeAresta((int)var10, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var3.existeAresta((int)var4, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(126);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(865);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(248);
    ds.Grafo.Aresta var9 = var7.primeiroListaAdj((int)var8);
    ds.Grafo var10 = var7.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(689);
    java.lang.Integer var12 = new java.lang.Integer(764);
    java.lang.Integer var13 = new java.lang.Integer(280);
    var7.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var7.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var7.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(2);
    boolean var20 = var7.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(3);
    boolean var22 = var7.listaAdjVazia((int)var21);
    ds.Grafo.Aresta var23 = var4.proxAdj((int)var21);
    java.lang.Integer var24 = new java.lang.Integer(865);
    ds.Grafo var25 = new ds.Grafo(var24);
    ds.Grafo var26 = var25.grafoTransposto();
    var26.imprime();
    java.lang.Integer var28 = new java.lang.Integer(865);
    ds.Grafo var29 = new ds.Grafo(var28);
    java.lang.Integer var30 = new java.lang.Integer(248);
    ds.Grafo.Aresta var31 = var29.primeiroListaAdj((int)var30);
    ds.Grafo var32 = var29.grafoTransposto();
    java.lang.Integer var33 = new java.lang.Integer(689);
    java.lang.Integer var34 = new java.lang.Integer(764);
    java.lang.Integer var35 = new java.lang.Integer(280);
    var29.insereAresta((int)var33, (int)var34, (int)var35);
    java.lang.Integer var37 = new java.lang.Integer(0);
    boolean var38 = var29.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(1);
    boolean var40 = var29.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(865);
    ds.Grafo var42 = new ds.Grafo(var41);
    java.lang.Integer var43 = new java.lang.Integer(248);
    ds.Grafo.Aresta var44 = var42.primeiroListaAdj((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(680);
    java.lang.Integer var46 = new java.lang.Integer(990);
    boolean var47 = var42.existeAresta((int)var45, (int)var46);
    java.lang.Integer var48 = new java.lang.Integer(865);
    ds.Grafo var49 = new ds.Grafo(var48);
    java.lang.Integer var50 = new java.lang.Integer(248);
    ds.Grafo.Aresta var51 = var49.primeiroListaAdj((int)var50);
    ds.Grafo var52 = var49.grafoTransposto();
    java.lang.Integer var53 = new java.lang.Integer(689);
    java.lang.Integer var54 = new java.lang.Integer(764);
    java.lang.Integer var55 = new java.lang.Integer(280);
    var49.insereAresta((int)var53, (int)var54, (int)var55);
    java.lang.Integer var57 = new java.lang.Integer(0);
    boolean var58 = var49.listaAdjVazia((int)var57);
    java.lang.Integer var59 = new java.lang.Integer(1);
    boolean var60 = var49.listaAdjVazia((int)var59);
    java.lang.Integer var61 = new java.lang.Integer(2);
    boolean var62 = var49.listaAdjVazia((int)var61);
    java.lang.Integer var63 = new java.lang.Integer(3);
    boolean var64 = var49.listaAdjVazia((int)var63);
    var26.insereAresta((int)var39, (int)var45, (int)var63);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var66 = var1.retiraAresta((int)var21, (int)var45);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(865);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    var5.imprime();
    ds.Grafo var7 = var5.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(865);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    var10.imprime();
    java.lang.Integer var12 = new java.lang.Integer(865);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(248);
    ds.Grafo.Aresta var15 = var13.primeiroListaAdj((int)var14);
    ds.Grafo var16 = var13.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(689);
    java.lang.Integer var18 = new java.lang.Integer(764);
    java.lang.Integer var19 = new java.lang.Integer(280);
    var13.insereAresta((int)var17, (int)var18, (int)var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    boolean var22 = var13.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(1);
    boolean var24 = var13.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(865);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(248);
    ds.Grafo.Aresta var28 = var26.primeiroListaAdj((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(680);
    java.lang.Integer var30 = new java.lang.Integer(990);
    boolean var31 = var26.existeAresta((int)var29, (int)var30);
    java.lang.Integer var32 = new java.lang.Integer(865);
    ds.Grafo var33 = new ds.Grafo(var32);
    java.lang.Integer var34 = new java.lang.Integer(248);
    ds.Grafo.Aresta var35 = var33.primeiroListaAdj((int)var34);
    ds.Grafo var36 = var33.grafoTransposto();
    java.lang.Integer var37 = new java.lang.Integer(689);
    java.lang.Integer var38 = new java.lang.Integer(764);
    java.lang.Integer var39 = new java.lang.Integer(280);
    var33.insereAresta((int)var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(0);
    boolean var42 = var33.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(1);
    boolean var44 = var33.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(2);
    boolean var46 = var33.listaAdjVazia((int)var45);
    java.lang.Integer var47 = new java.lang.Integer(3);
    boolean var48 = var33.listaAdjVazia((int)var47);
    var10.insereAresta((int)var23, (int)var29, (int)var47);
    java.lang.Integer var50 = new java.lang.Integer(455);
    ds.Grafo var51 = new ds.Grafo(var50);
    boolean var52 = var7.existeAresta((int)var47, (int)var50);
    java.lang.Integer var53 = new java.lang.Integer(865);
    ds.Grafo var54 = new ds.Grafo(var53);
    java.lang.Integer var55 = new java.lang.Integer(248);
    ds.Grafo.Aresta var56 = var54.primeiroListaAdj((int)var55);
    ds.Grafo var57 = var54.grafoTransposto();
    java.lang.Integer var58 = new java.lang.Integer(689);
    java.lang.Integer var59 = new java.lang.Integer(764);
    java.lang.Integer var60 = new java.lang.Integer(280);
    var54.insereAresta((int)var58, (int)var59, (int)var60);
    java.lang.Integer var62 = new java.lang.Integer(0);
    boolean var63 = var54.listaAdjVazia((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(1);
    boolean var65 = var54.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(2);
    boolean var67 = var54.listaAdjVazia((int)var66);
    java.lang.Integer var68 = new java.lang.Integer(3);
    boolean var69 = var54.listaAdjVazia((int)var68);
    java.lang.Integer var70 = new java.lang.Integer(4);
    boolean var71 = var54.listaAdjVazia((int)var70);
    java.lang.Integer var72 = new java.lang.Integer(5);
    boolean var73 = var54.listaAdjVazia((int)var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var74 = var2.retiraAresta((int)var50, (int)var72);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(927);
    ds.Grafo var6 = new ds.Grafo(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var4.primeiroListaAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(455);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(328);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 455);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 927);

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(927);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(865);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(248);
    ds.Grafo.Aresta var6 = var4.primeiroListaAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(680);
    java.lang.Integer var8 = new java.lang.Integer(990);
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    boolean var10 = var1.existeAresta((int)var2, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    var1.imprime();
    ds.Grafo var20 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(5);
    boolean var20 = var1.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(455);
    ds.Grafo var22 = new ds.Grafo(var21);
    ds.Grafo var23 = var22.grafoTransposto();
    int var24 = var23.numVertices();
    ds.Grafo.Aresta var25 = var1.primeiroListaAdj((int)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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
    assertTrue(var24 == 455);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(780);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();
    ds.Grafo var4 = var2.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(780);
    ds.Grafo var6 = new ds.Grafo(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var4.proxAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(865);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    ds.Grafo.Aresta var3 = var1.primeiroListaAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(689);
    java.lang.Integer var6 = new java.lang.Integer(764);
    java.lang.Integer var7 = new java.lang.Integer(280);
    var1.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var1.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var1.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(3);
    boolean var16 = var1.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(4);
    boolean var18 = var1.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(5);
    boolean var20 = var1.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(865);
    ds.Grafo var22 = new ds.Grafo(var21);
    ds.Grafo var23 = var22.grafoTransposto();
    var23.imprime();
    ds.Grafo var25 = var23.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(865);
    ds.Grafo var27 = new ds.Grafo(var26);
    ds.Grafo var28 = var27.grafoTransposto();
    var28.imprime();
    java.lang.Integer var30 = new java.lang.Integer(865);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(248);
    ds.Grafo.Aresta var33 = var31.primeiroListaAdj((int)var32);
    ds.Grafo var34 = var31.grafoTransposto();
    java.lang.Integer var35 = new java.lang.Integer(689);
    java.lang.Integer var36 = new java.lang.Integer(764);
    java.lang.Integer var37 = new java.lang.Integer(280);
    var31.insereAresta((int)var35, (int)var36, (int)var37);
    java.lang.Integer var39 = new java.lang.Integer(0);
    boolean var40 = var31.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    boolean var42 = var31.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(865);
    ds.Grafo var44 = new ds.Grafo(var43);
    java.lang.Integer var45 = new java.lang.Integer(248);
    ds.Grafo.Aresta var46 = var44.primeiroListaAdj((int)var45);
    java.lang.Integer var47 = new java.lang.Integer(680);
    java.lang.Integer var48 = new java.lang.Integer(990);
    boolean var49 = var44.existeAresta((int)var47, (int)var48);
    java.lang.Integer var50 = new java.lang.Integer(865);
    ds.Grafo var51 = new ds.Grafo(var50);
    java.lang.Integer var52 = new java.lang.Integer(248);
    ds.Grafo.Aresta var53 = var51.primeiroListaAdj((int)var52);
    ds.Grafo var54 = var51.grafoTransposto();
    java.lang.Integer var55 = new java.lang.Integer(689);
    java.lang.Integer var56 = new java.lang.Integer(764);
    java.lang.Integer var57 = new java.lang.Integer(280);
    var51.insereAresta((int)var55, (int)var56, (int)var57);
    java.lang.Integer var59 = new java.lang.Integer(0);
    boolean var60 = var51.listaAdjVazia((int)var59);
    java.lang.Integer var61 = new java.lang.Integer(1);
    boolean var62 = var51.listaAdjVazia((int)var61);
    java.lang.Integer var63 = new java.lang.Integer(2);
    boolean var64 = var51.listaAdjVazia((int)var63);
    java.lang.Integer var65 = new java.lang.Integer(3);
    boolean var66 = var51.listaAdjVazia((int)var65);
    var28.insereAresta((int)var41, (int)var47, (int)var65);
    java.lang.Integer var68 = new java.lang.Integer(455);
    ds.Grafo var69 = new ds.Grafo(var68);
    boolean var70 = var25.existeAresta((int)var65, (int)var68);
    java.lang.Integer var71 = new java.lang.Integer(927);
    ds.Grafo var72 = new ds.Grafo(var71);
    java.lang.Integer var73 = new java.lang.Integer(455);
    ds.Grafo var74 = new ds.Grafo(var73);
    java.lang.Integer var75 = new java.lang.Integer(126);
    ds.Grafo var76 = new ds.Grafo(var75);
    int var77 = var76.numVertices();
    ds.Grafo var78 = var76.grafoTransposto();
    java.lang.Integer var79 = new java.lang.Integer(865);
    ds.Grafo var80 = new ds.Grafo(var79);
    java.lang.Integer var81 = new java.lang.Integer(248);
    ds.Grafo.Aresta var82 = var80.primeiroListaAdj((int)var81);
    ds.Grafo var83 = var80.grafoTransposto();
    java.lang.Integer var84 = new java.lang.Integer(689);
    java.lang.Integer var85 = new java.lang.Integer(764);
    java.lang.Integer var86 = new java.lang.Integer(280);
    var80.insereAresta((int)var84, (int)var85, (int)var86);
    java.lang.Integer var88 = new java.lang.Integer(0);
    boolean var89 = var80.listaAdjVazia((int)var88);
    ds.Grafo.Aresta var90 = var76.primeiroListaAdj((int)var88);
    boolean var91 = var72.existeAresta((int)var73, (int)var88);
    boolean var92 = var1.existeAresta((int)var68, (int)var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

}
