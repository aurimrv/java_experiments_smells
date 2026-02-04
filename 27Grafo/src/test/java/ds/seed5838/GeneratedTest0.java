package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
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

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
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

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
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

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
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

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
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

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.retiraAresta((int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var5.existeAresta((int)var6, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
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

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    int var7 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 145);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var2.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
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

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.insereAresta((int)var3, (int)var3, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    var1.imprime();

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
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

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo.Aresta var5 = var4.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(738);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(738);
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

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(237);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var5.retiraAresta((int)var6, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    int var8 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 779);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo var9 = var2.grafoTransposto();
    var9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
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

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    boolean var10 = var1.existeAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var1.retiraAresta((int)var10, (int)var10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
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

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var2.proxAdj((int)var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
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

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(804);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    boolean var14 = var1.existeAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
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

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(5);
    boolean var14 = var2.listaAdjVazia((int)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var15 = var2.retiraAresta((int)var13, (int)var13);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
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
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 651);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    boolean var5 = var2.existeAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 791);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo var9 = var2.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(237);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var2.proxAdj((int)var10);
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

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    ds.Grafo var5 = new ds.Grafo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 779);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(74);
    java.lang.Integer var10 = new java.lang.Integer(206);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var7.proxAdj((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(645);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(645);
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

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
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

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(74);
    java.lang.Integer var10 = new java.lang.Integer(206);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var7.listaAdjVazia((int)var12);
    ds.Grafo.Aresta var14 = var7.retiraAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
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

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    ds.Grafo var13 = var2.grafoTransposto();
    int var14 = var13.numVertices();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 145);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(74);
    java.lang.Integer var8 = new java.lang.Integer(206);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var5.listaAdjVazia((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    int var5 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var2.retiraAresta((int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 779);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var8.listaAdjVazia((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
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

    java.lang.Integer var0 = new java.lang.Integer(804);
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

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    ds.Grafo var8 = var5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.listaAdjVazia((int)var4);
    int var6 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 779);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var1.listaAdjVazia((int)var14);
    var1.imprime();
    
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
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

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(237);
    ds.Grafo.Aresta var10 = var8.proxAdj((int)var9);
    ds.Grafo var11 = var8.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 734);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
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

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var2.listaAdjVazia((int)var6);
    int var8 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 779);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(5);
    boolean var14 = var2.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(6);
    boolean var16 = var2.listaAdjVazia((int)var15);
    int var17 = var2.numVertices();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 145);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(74);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    int var8 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var5.primeiroListaAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 145);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(738);
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

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
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

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(874);
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

    java.lang.Integer var0 = new java.lang.Integer(874);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(874);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 145);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var1.listaAdjVazia((int)var9);
    int var11 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 791);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(74);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 651);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(74);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 651);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var5.retiraAresta((int)var2, (int)var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(874);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(874);
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

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(74);
    java.lang.Integer var10 = new java.lang.Integer(206);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var7.listaAdjVazia((int)var12);
    ds.Grafo var14 = var7.grafoTransposto();
    boolean var15 = var14.existeAresta((int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
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

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(645);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(645);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
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

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
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

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
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

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
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

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(2);
    boolean var12 = var1.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var1.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var2.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 651);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(5);
    boolean var14 = var2.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(6);
    boolean var16 = var2.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(7);
    boolean var18 = var2.listaAdjVazia((int)var17);
    ds.Grafo.Aresta var19 = var2.primeiroListaAdj((int)var17);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(5);
    boolean var14 = var2.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(6);
    boolean var16 = var2.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(7);
    boolean var18 = var2.listaAdjVazia((int)var17);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    ds.Grafo var7 = var5.grafoTransposto();
    int var8 = var7.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 145);

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    int var5 = var2.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var2.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 651);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var2.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var2.listaAdjVazia((int)var8);
    var2.insereAresta((int)var8, (int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(680);
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var1.listaAdjVazia((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(738);
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

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    int var18 = var1.numVertices();
    
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
    assertTrue(var18 == 779);

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(4);
    boolean var15 = var1.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(5);
    boolean var17 = var1.listaAdjVazia((int)var16);
    
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

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insereAresta((int)var0, (int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 791);

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(779);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    int var9 = var8.numVertices();
    int var10 = var8.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(779);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(74);
    java.lang.Integer var15 = new java.lang.Integer(206);
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var17 = var1.retiraAresta((int)var10, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 779);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(779);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var4.listaAdjVazia((int)var6);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(651);
    ds.Grafo var4 = new ds.Grafo(var3);
    boolean var5 = var1.existeAresta((int)var2, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var2.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var2.listaAdjVazia((int)var8);
    ds.Grafo var10 = new ds.Grafo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    int var8 = var5.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(791);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(496);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(680);
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(779);
    ds.Grafo var17 = new ds.Grafo(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var18 = var5.retiraAresta((int)var13, (int)var16);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test125() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(74);
    java.lang.Integer var10 = new java.lang.Integer(206);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var7.listaAdjVazia((int)var12);
    ds.Grafo var14 = var7.grafoTransposto();
    var14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test126() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(651);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(145);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var25 = var5.retiraAresta((int)var6, (int)var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test127() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = var1.grafoTransposto();
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test128() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(779);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    int var7 = var5.numVertices();
    int var8 = var5.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(791);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(496);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(680);
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(779);
    ds.Grafo var17 = new ds.Grafo(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var8, (int)var13, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test129() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(779);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    int var7 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 779);

  }

  public void test130() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(145);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(145);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
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
    java.lang.Integer var24 = new java.lang.Integer(6);
    boolean var25 = var11.listaAdjVazia((int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var26 = var2.retiraAresta((int)var7, (int)var24);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
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

  public void test131() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(804);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test132() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var2.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(4);
    boolean var12 = var2.listaAdjVazia((int)var11);
    ds.Grafo var13 = var2.grafoTransposto();
    var13.imprime();
    
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

  public void test133() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(804);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = new ds.Grafo(var4);
    java.lang.Integer var7 = new java.lang.Integer(145);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(143);
    java.lang.Integer var10 = new java.lang.Integer(172);
    boolean var11 = var8.existeAresta((int)var9, (int)var10);
    boolean var12 = var1.existeAresta((int)var4, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test134() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var2.listaAdjVazia((int)var6);
    ds.Grafo var8 = new ds.Grafo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test135() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(791);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(779);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    int var8 = var7.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var2.retiraAresta((int)var3, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 779);

  }

  public void test136() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(651);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    int var7 = var5.numVertices();
    int var8 = var5.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.proxAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 651);

  }

  public void test137() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(779);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(74);
    java.lang.Integer var7 = new java.lang.Integer(206);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    boolean var14 = var4.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(791);
    ds.Grafo var16 = new ds.Grafo(var15);
    ds.Grafo var17 = var16.grafoTransposto();
    ds.Grafo var18 = var17.grafoTransposto();
    ds.Grafo var19 = var17.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(145);
    ds.Grafo var21 = new ds.Grafo(var20);
    java.lang.Integer var22 = new java.lang.Integer(143);
    java.lang.Integer var23 = new java.lang.Integer(172);
    boolean var24 = var21.existeAresta((int)var22, (int)var23);
    ds.Grafo var25 = var21.grafoTransposto();
    int var26 = var21.numVertices();
    ds.Grafo var27 = var21.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(0);
    java.lang.Integer var29 = new java.lang.Integer(74);
    java.lang.Integer var30 = new java.lang.Integer(206);
    var27.insereAresta((int)var28, (int)var29, (int)var30);
    java.lang.Integer var32 = new java.lang.Integer(779);
    ds.Grafo var33 = new ds.Grafo(var32);
    ds.Grafo var34 = var33.grafoTransposto();
    int var35 = var34.numVertices();
    boolean var36 = var19.existeAresta((int)var29, (int)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var37 = var1.retiraAresta((int)var13, (int)var29);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test138() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    ds.Grafo var7 = var5.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(779);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(145);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var25 = var7.existeAresta((int)var8, (int)var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
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

  }

  public void test139() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(804);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(651);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    int var8 = var7.numVertices();
    int var9 = var7.numVertices();
    int var10 = var7.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(970);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(496);
    ds.Grafo.Aresta var14 = var12.proxAdj((int)var13);
    boolean var15 = var4.existeAresta((int)var10, (int)var13);
    java.lang.Integer var16 = new java.lang.Integer(779);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(779);
    ds.Grafo var20 = new ds.Grafo(var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    java.lang.Integer var22 = new java.lang.Integer(74);
    java.lang.Integer var23 = new java.lang.Integer(206);
    var20.insereAresta((int)var21, (int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(1);
    boolean var26 = var20.listaAdjVazia((int)var25);
    ds.Grafo var27 = var20.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(237);
    ds.Grafo.Aresta var29 = var27.proxAdj((int)var28);
    java.lang.Integer var30 = new java.lang.Integer(779);
    ds.Grafo var31 = new ds.Grafo(var30);
    java.lang.Integer var32 = new java.lang.Integer(0);
    java.lang.Integer var33 = new java.lang.Integer(74);
    java.lang.Integer var34 = new java.lang.Integer(206);
    var31.insereAresta((int)var32, (int)var33, (int)var34);
    java.lang.Integer var36 = new java.lang.Integer(1);
    boolean var37 = var31.listaAdjVazia((int)var36);
    java.lang.Integer var38 = new java.lang.Integer(1);
    boolean var39 = var31.listaAdjVazia((int)var38);
    java.lang.Integer var40 = new java.lang.Integer(2);
    boolean var41 = var31.listaAdjVazia((int)var40);
    java.lang.Integer var42 = new java.lang.Integer(3);
    boolean var43 = var31.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(4);
    boolean var45 = var31.listaAdjVazia((int)var44);
    boolean var46 = var18.existeAresta((int)var28, (int)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var47 = var2.retiraAresta((int)var13, (int)var28);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
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
    assertTrue(var46 == false);

  }

  public void test140() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(496);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    var1.imprime();
    ds.Grafo var5 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test141() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(651);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test142() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(145);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(143);
    java.lang.Integer var7 = new java.lang.Integer(172);
    boolean var8 = var5.existeAresta((int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(791);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(145);
    ds.Grafo var14 = new ds.Grafo(var13);
    ds.Grafo.Aresta var15 = var12.primeiroListaAdj((int)var13);
    boolean var16 = var1.existeAresta((int)var7, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test143() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test144() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(734);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test145() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(779);
    ds.Grafo var3 = new ds.Grafo(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(779);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var4.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(651);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    int var13 = var12.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var14 = var1.retiraAresta((int)var8, (int)var13);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 651);

  }

  public void test147() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    int var4 = var2.numVertices();
    int var5 = var2.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(970);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(496);
    ds.Grafo.Aresta var9 = var7.proxAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(680);
    boolean var12 = var7.existeAresta((int)var10, (int)var11);
    boolean var13 = var2.listaAdjVazia((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 651);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test148() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(779);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    int var7 = var6.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var6.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var6.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(145);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var14.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    boolean var18 = var14.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(2);
    boolean var20 = var14.listaAdjVazia((int)var19);
    boolean var21 = var2.existeAresta((int)var10, (int)var19);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 779);
    
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
    assertTrue(var21 == false);

  }

  public void test149() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(779);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(779);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(74);
    java.lang.Integer var10 = new java.lang.Integer(206);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var7.listaAdjVazia((int)var12);
    ds.Grafo var14 = var7.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(237);
    ds.Grafo.Aresta var16 = var14.proxAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(779);
    ds.Grafo var18 = new ds.Grafo(var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer(74);
    java.lang.Integer var21 = new java.lang.Integer(206);
    var18.insereAresta((int)var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(1);
    boolean var24 = var18.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(1);
    boolean var26 = var18.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(2);
    boolean var28 = var18.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(3);
    boolean var30 = var18.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(4);
    boolean var32 = var18.listaAdjVazia((int)var31);
    boolean var33 = var5.existeAresta((int)var15, (int)var31);
    java.lang.Integer var34 = new java.lang.Integer(779);
    ds.Grafo var35 = new ds.Grafo(var34);
    java.lang.Integer var36 = new java.lang.Integer(0);
    java.lang.Integer var37 = new java.lang.Integer(74);
    java.lang.Integer var38 = new java.lang.Integer(206);
    var35.insereAresta((int)var36, (int)var37, (int)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var40 = var2.retiraAresta((int)var15, (int)var38);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
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
    assertTrue(var33 == false);

  }

  public void test150() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(779);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var5.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(970);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(496);
    ds.Grafo.Aresta var12 = var10.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(680);
    boolean var15 = var10.existeAresta((int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(145);
    ds.Grafo var17 = new ds.Grafo(var16);
    java.lang.Integer var18 = new java.lang.Integer(143);
    java.lang.Integer var19 = new java.lang.Integer(172);
    boolean var20 = var17.existeAresta((int)var18, (int)var19);
    ds.Grafo var21 = var17.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(74);
    java.lang.Integer var24 = new java.lang.Integer(206);
    var17.insereAresta((int)var22, (int)var23, (int)var24);
    java.lang.Integer var26 = new java.lang.Integer(145);
    ds.Grafo var27 = new ds.Grafo(var26);
    ds.Grafo var28 = var27.grafoTransposto();
    java.lang.Integer var29 = new java.lang.Integer(0);
    boolean var30 = var28.listaAdjVazia((int)var29);
    java.lang.Integer var31 = new java.lang.Integer(1);
    boolean var32 = var28.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(2);
    boolean var34 = var28.listaAdjVazia((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(3);
    boolean var36 = var28.listaAdjVazia((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(4);
    boolean var38 = var28.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(5);
    boolean var40 = var28.listaAdjVazia((int)var39);
    var5.insereAresta((int)var14, (int)var22, (int)var39);
    boolean var42 = var1.listaAdjVazia((int)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
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

  }

  public void test151() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(970);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(970);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(496);
    ds.Grafo.Aresta var5 = var3.proxAdj((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(680);
    boolean var8 = var3.existeAresta((int)var6, (int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test152() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(651);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(145);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(143);
    java.lang.Integer var5 = new java.lang.Integer(172);
    boolean var6 = var3.existeAresta((int)var4, (int)var5);
    ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test153() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(74);
    java.lang.Integer var10 = new java.lang.Integer(206);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    boolean var13 = var7.listaAdjVazia((int)var12);
    ds.Grafo var14 = var7.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(791);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(496);
    ds.Grafo.Aresta var18 = var16.proxAdj((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(680);
    boolean var21 = var16.existeAresta((int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(779);
    ds.Grafo var23 = new ds.Grafo(var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    java.lang.Integer var25 = new java.lang.Integer(74);
    java.lang.Integer var26 = new java.lang.Integer(206);
    var23.insereAresta((int)var24, (int)var25, (int)var26);
    java.lang.Integer var28 = new java.lang.Integer(1);
    boolean var29 = var23.listaAdjVazia((int)var28);
    ds.Grafo var30 = var23.grafoTransposto();
    java.lang.Integer var31 = new java.lang.Integer(237);
    ds.Grafo.Aresta var32 = var30.proxAdj((int)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var33 = var14.existeAresta((int)var20, (int)var31);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);

  }

  public void test154() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo var9 = var2.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(145);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(143);
    java.lang.Integer var13 = new java.lang.Integer(172);
    boolean var14 = var11.existeAresta((int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(779);
    ds.Grafo var16 = new ds.Grafo(var15);
    ds.Grafo var17 = var16.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(779);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    java.lang.Integer var21 = new java.lang.Integer(74);
    java.lang.Integer var22 = new java.lang.Integer(206);
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    boolean var25 = var19.listaAdjVazia((int)var24);
    ds.Grafo var26 = var19.grafoTransposto();
    java.lang.Integer var27 = new java.lang.Integer(237);
    ds.Grafo.Aresta var28 = var26.proxAdj((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(779);
    ds.Grafo var30 = new ds.Grafo(var29);
    java.lang.Integer var31 = new java.lang.Integer(0);
    java.lang.Integer var32 = new java.lang.Integer(74);
    java.lang.Integer var33 = new java.lang.Integer(206);
    var30.insereAresta((int)var31, (int)var32, (int)var33);
    java.lang.Integer var35 = new java.lang.Integer(1);
    boolean var36 = var30.listaAdjVazia((int)var35);
    java.lang.Integer var37 = new java.lang.Integer(1);
    boolean var38 = var30.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(2);
    boolean var40 = var30.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(3);
    boolean var42 = var30.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(4);
    boolean var44 = var30.listaAdjVazia((int)var43);
    boolean var45 = var17.existeAresta((int)var27, (int)var43);
    java.lang.Integer var46 = new java.lang.Integer(791);
    ds.Grafo var47 = new ds.Grafo(var46);
    java.lang.Integer var48 = new java.lang.Integer(496);
    ds.Grafo.Aresta var49 = var47.proxAdj((int)var48);
    java.lang.Integer var50 = new java.lang.Integer(1);
    java.lang.Integer var51 = new java.lang.Integer(680);
    boolean var52 = var47.existeAresta((int)var50, (int)var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var13, (int)var43, (int)var51);
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test155() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(651);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = var7.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(145);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(143);
    java.lang.Integer var13 = new java.lang.Integer(172);
    boolean var14 = var11.existeAresta((int)var12, (int)var13);
    ds.Grafo var15 = var11.grafoTransposto();
    int var16 = var11.numVertices();
    ds.Grafo var17 = var11.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer(74);
    java.lang.Integer var20 = new java.lang.Integer(206);
    var17.insereAresta((int)var18, (int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var17.listaAdjVazia((int)var22);
    ds.Grafo var24 = var17.grafoTransposto();
    java.lang.Integer var25 = new java.lang.Integer(779);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(0);
    java.lang.Integer var28 = new java.lang.Integer(74);
    java.lang.Integer var29 = new java.lang.Integer(206);
    var26.insereAresta((int)var27, (int)var28, (int)var29);
    java.lang.Integer var31 = new java.lang.Integer(779);
    ds.Grafo var32 = new ds.Grafo(var31);
    ds.Grafo var33 = var32.grafoTransposto();
    int var34 = var33.numVertices();
    java.lang.Integer var35 = new java.lang.Integer(791);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(496);
    ds.Grafo.Aresta var38 = var36.proxAdj((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(1);
    java.lang.Integer var40 = new java.lang.Integer(680);
    boolean var41 = var36.existeAresta((int)var39, (int)var40);
    java.lang.Integer var42 = new java.lang.Integer(0);
    boolean var43 = var36.listaAdjVazia((int)var42);
    java.lang.Integer var44 = new java.lang.Integer(1);
    boolean var45 = var36.listaAdjVazia((int)var44);
    java.lang.Integer var46 = new java.lang.Integer(2);
    boolean var47 = var36.listaAdjVazia((int)var46);
    var24.insereAresta((int)var27, (int)var34, (int)var46);
    ds.Grafo.Aresta var49 = var7.proxAdj((int)var27);
    java.lang.Integer var50 = new java.lang.Integer(738);
    ds.Grafo var51 = new ds.Grafo(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var52 = var1.retiraAresta((int)var27, (int)var50);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 145);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == null);

  }

  public void test156() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    int var10 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 779);

  }

  public void test157() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(145);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(143);
    java.lang.Integer var6 = new java.lang.Integer(172);
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    ds.Grafo var8 = var4.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(74);
    java.lang.Integer var11 = new java.lang.Integer(206);
    var4.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo.Aresta var13 = var1.primeiroListaAdj((int)var10);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test158() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(734);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(791);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(779);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(0);
    boolean var11 = var8.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    boolean var13 = var8.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(145);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo var16 = var15.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(0);
    boolean var18 = var16.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    boolean var20 = var16.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(2);
    boolean var22 = var16.listaAdjVazia((int)var21);
    boolean var23 = var4.existeAresta((int)var12, (int)var21);
    java.lang.Integer var24 = new java.lang.Integer(779);
    ds.Grafo var25 = new ds.Grafo(var24);
    boolean var26 = var1.existeAresta((int)var12, (int)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test159() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(779);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(74);
    java.lang.Integer var7 = new java.lang.Integer(206);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    ds.Grafo.Aresta var13 = var2.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test160() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(145);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(143);
    java.lang.Integer var3 = new java.lang.Integer(172);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(74);
    java.lang.Integer var8 = new java.lang.Integer(206);
    var1.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo var10 = new ds.Grafo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test161() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var2.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    boolean var9 = var2.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(651);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(779);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    int var15 = var14.numVertices();
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var14.listaAdjVazia((int)var16);
    java.lang.Integer var18 = new java.lang.Integer(1);
    boolean var19 = var14.listaAdjVazia((int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var2.retiraAresta((int)var10, (int)var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 779);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test162() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(779);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(74);
    java.lang.Integer var4 = new java.lang.Integer(206);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(791);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(496);
    ds.Grafo.Aresta var11 = var9.proxAdj((int)var10);
    boolean var12 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var13 = new java.lang.Integer(651);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(74);
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer(206);
    var14.insereAresta((int)var15, (int)var16, (int)var17);
    boolean var19 = var1.listaAdjVazia((int)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

}
