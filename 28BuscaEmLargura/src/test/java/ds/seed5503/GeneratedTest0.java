package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
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

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    boolean var5 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(397);
    java.lang.Integer var5 = new java.lang.Integer((-235));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var5, (int)var5, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(397);
    java.lang.Integer var5 = new java.lang.Integer((-235));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var7.listaAdjVazia((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
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

    java.lang.Integer var0 = new java.lang.Integer(907);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
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

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
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
    assertTrue(var2 == 907);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
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

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    int var6 = var5.numVertices();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 505);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(127);
    java.lang.Integer var4 = new java.lang.Integer(831);
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var4, (int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
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

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
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

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(21);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(21);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 21);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(21);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
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

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(900);
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

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
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

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
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

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
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

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(127);
    java.lang.Integer var4 = new java.lang.Integer(831);
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var6.primeiroListaAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(636);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(406);
    java.lang.Integer var5 = new java.lang.Integer((-544));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var3.existeAresta((int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var5.retiraAresta((int)var6, (int)var6);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
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

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var5.retiraAresta((int)var8, (int)var8);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
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

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    var2.insereAresta((int)var3, (int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    ds.Grafo var12 = new ds.Grafo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var1.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
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

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
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

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 907);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
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
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
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

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 687);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
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
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
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

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 687);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var2.proxAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
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

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
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

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
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

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 297);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(397);
    java.lang.Integer var5 = new java.lang.Integer((-235));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.existeAresta((int)var9, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 505);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(406);
    java.lang.Integer var4 = new java.lang.Integer((-544));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(193);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(193);
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

    java.lang.Integer var0 = new java.lang.Integer(297);
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

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(3);
    boolean var10 = var1.listaAdjVazia((int)var9);
    ds.Grafo var11 = new ds.Grafo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
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
    int var13 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 907);
    
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
    assertTrue(var13 == 907);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
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
    assertTrue(var2 == 907);
    
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

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var1.listaAdjVazia((int)var10);
    ds.Grafo.Aresta var12 = var1.proxAdj((int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(879);
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    var1.imprime();

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(601);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(529);
    java.lang.Integer var13 = new java.lang.Integer(104);
    java.lang.Integer var14 = new java.lang.Integer(718);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(907);
    ds.Grafo var17 = new ds.Grafo(var16);
    int var18 = var17.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var17.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    boolean var22 = var17.listaAdjVazia((int)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var23 = var1.retiraAresta((int)var13, (int)var21);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(687);
    ds.Grafo var4 = new ds.Grafo(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var2.listaAdjVazia((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(687);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(406);
    java.lang.Integer var10 = new java.lang.Integer((-544));
    boolean var11 = var7.existeAresta((int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var5.listaAdjVazia((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(907);
    ds.Grafo var3 = new ds.Grafo(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.primeiroListaAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(505);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(159);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = var4.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(505);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(159);
    ds.Grafo.Aresta var16 = var14.proxAdj((int)var15);
    boolean var17 = var2.existeAresta((int)var11, (int)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo(var3);
    java.lang.Integer var7 = new java.lang.Integer(601);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(529);
    java.lang.Integer var10 = new java.lang.Integer(104);
    java.lang.Integer var11 = new java.lang.Integer(718);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo var13 = new ds.Grafo(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var6.listaAdjVazia((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(601);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(529);
    java.lang.Integer var6 = new java.lang.Integer(104);
    java.lang.Integer var7 = new java.lang.Integer(718);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(296);
    ds.Grafo var10 = new ds.Grafo(var9);
    var10.imprime();
    java.lang.Integer var12 = new java.lang.Integer(127);
    java.lang.Integer var13 = new java.lang.Integer(831);
    boolean var14 = var10.existeAresta((int)var12, (int)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var2.existeAresta((int)var5, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo(var3);
    ds.Grafo var7 = new ds.Grafo(var3);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(505);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(687);
    ds.Grafo var7 = new ds.Grafo(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.retiraAresta((int)var4, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(601);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(529);
    java.lang.Integer var12 = new java.lang.Integer(104);
    java.lang.Integer var13 = new java.lang.Integer(718);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo.Aresta var15 = var1.primeiroListaAdj((int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(505);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(159);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(397);
    java.lang.Integer var8 = new java.lang.Integer((-235));
    boolean var9 = var4.existeAresta((int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var1.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(879);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(907);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    ds.Grafo var5 = var3.grafoTransposto();
    var5.imprime();
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
    assertTrue(var7 == 907);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(601);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(529);
    java.lang.Integer var12 = new java.lang.Integer(104);
    java.lang.Integer var13 = new java.lang.Integer(718);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    boolean var15 = var1.listaAdjVazia((int)var11);
    int var16 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 907);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(601);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(193);
    ds.Grafo var5 = new ds.Grafo(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.retiraAresta((int)var2, (int)var4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    ds.Grafo var4 = var1.grafoTransposto();
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 505);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = var1.grafoTransposto();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 297);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(601);
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

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(406);
    java.lang.Integer var4 = new java.lang.Integer((-544));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 687);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 687);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(907);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(296);
    ds.Grafo var5 = new ds.Grafo(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.retiraAresta((int)var2, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(907);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var4.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    boolean var11 = var4.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(3);
    boolean var13 = var4.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(879);
    ds.Grafo var15 = new ds.Grafo(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var2.retiraAresta((int)var12, (int)var14);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(505);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(159);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(397);
    java.lang.Integer var5 = new java.lang.Integer((-235));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var8.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(601);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(529);
    java.lang.Integer var13 = new java.lang.Integer(104);
    java.lang.Integer var14 = new java.lang.Integer(718);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    boolean var17 = var11.listaAdjVazia((int)var16);
    boolean var18 = var8.listaAdjVazia((int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var1.imprime();
    java.lang.Integer var5 = new java.lang.Integer(505);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(159);
    ds.Grafo.Aresta var8 = var6.proxAdj((int)var7);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(505);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo.Aresta var8 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(127);
    java.lang.Integer var4 = new java.lang.Integer(831);
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    ds.Grafo var7 = var1.grafoTransposto();
    ds.Grafo var8 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);
    ds.Grafo var3 = var2.grafoTransposto();

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(505);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(159);
    ds.Grafo.Aresta var11 = var9.proxAdj((int)var10);
    ds.Grafo var12 = var9.grafoTransposto();
    ds.Grafo var13 = var12.grafoTransposto();
    int var14 = var13.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(907);
    ds.Grafo var16 = new ds.Grafo(var15);
    ds.Grafo var17 = var16.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(0);
    boolean var19 = var16.listaAdjVazia((int)var18);
    java.lang.Integer var20 = new java.lang.Integer(1);
    boolean var21 = var16.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(2);
    boolean var23 = var16.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(601);
    ds.Grafo var25 = new ds.Grafo(var24);
    java.lang.Integer var26 = new java.lang.Integer(529);
    java.lang.Integer var27 = new java.lang.Integer(104);
    java.lang.Integer var28 = new java.lang.Integer(718);
    var25.insereAresta((int)var26, (int)var27, (int)var28);
    boolean var30 = var16.listaAdjVazia((int)var26);
    java.lang.Integer var31 = new java.lang.Integer(505);
    ds.Grafo var32 = new ds.Grafo(var31);
    java.lang.Integer var33 = new java.lang.Integer(159);
    ds.Grafo.Aresta var34 = var32.proxAdj((int)var33);
    var1.insereAresta((int)var14, (int)var26, (int)var33);
    java.lang.Integer var36 = new java.lang.Integer(601);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(529);
    java.lang.Integer var39 = new java.lang.Integer(104);
    java.lang.Integer var40 = new java.lang.Integer(718);
    var37.insereAresta((int)var38, (int)var39, (int)var40);
    java.lang.Integer var42 = new java.lang.Integer(907);
    ds.Grafo var43 = new ds.Grafo(var42);
    ds.Grafo var44 = var43.grafoTransposto();
    java.lang.Integer var45 = new java.lang.Integer(687);
    ds.Grafo var46 = new ds.Grafo(var45);
    ds.Grafo var47 = var46.grafoTransposto();
    java.lang.Integer var48 = new java.lang.Integer(907);
    ds.Grafo var49 = new ds.Grafo(var48);
    ds.Grafo var50 = var49.grafoTransposto();
    java.lang.Integer var51 = new java.lang.Integer(0);
    boolean var52 = var49.listaAdjVazia((int)var51);
    java.lang.Integer var53 = new java.lang.Integer(1);
    boolean var54 = var49.listaAdjVazia((int)var53);
    boolean var55 = var46.listaAdjVazia((int)var53);
    java.lang.Integer var56 = new java.lang.Integer(601);
    ds.Grafo var57 = new ds.Grafo(var56);
    java.lang.Integer var58 = new java.lang.Integer(529);
    java.lang.Integer var59 = new java.lang.Integer(104);
    java.lang.Integer var60 = new java.lang.Integer(718);
    var57.insereAresta((int)var58, (int)var59, (int)var60);
    java.lang.Integer var62 = new java.lang.Integer(0);
    boolean var63 = var57.listaAdjVazia((int)var62);
    java.lang.Integer var64 = new java.lang.Integer(1);
    boolean var65 = var57.listaAdjVazia((int)var64);
    java.lang.Integer var66 = new java.lang.Integer(2);
    boolean var67 = var57.listaAdjVazia((int)var66);
    boolean var68 = var44.existeAresta((int)var53, (int)var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var69 = var1.retiraAresta((int)var40, (int)var66);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
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

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(505);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(159);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = var4.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(505);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(159);
    ds.Grafo.Aresta var14 = var12.proxAdj((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(397);
    java.lang.Integer var16 = new java.lang.Integer((-235));
    boolean var17 = var12.existeAresta((int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(193);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer((-1));
    var4.insereAresta((int)var15, (int)var18, (int)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var1.listaAdjVazia((int)var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(296);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(505);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(159);
    ds.Grafo.Aresta var6 = var4.proxAdj((int)var5);
    ds.Grafo var7 = var4.grafoTransposto();
    ds.Grafo var8 = var7.grafoTransposto();
    int var9 = var8.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.listaAdjVazia((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 505);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(297);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(601);
    ds.Grafo var7 = new ds.Grafo(var6);
    java.lang.Integer var8 = new java.lang.Integer(687);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(907);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var12.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var12.listaAdjVazia((int)var16);
    boolean var18 = var9.listaAdjVazia((int)var16);
    boolean var19 = var7.listaAdjVazia((int)var16);
    boolean var20 = var1.existeAresta((int)var4, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(601);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(529);
    java.lang.Integer var13 = new java.lang.Integer(104);
    java.lang.Integer var14 = new java.lang.Integer(718);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    ds.Grafo var16 = new ds.Grafo(var13);
    ds.Grafo.Aresta var17 = var1.primeiroListaAdj((int)var13);
    var1.imprime();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(907);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 907);

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(406);
    java.lang.Integer var4 = new java.lang.Integer((-544));
    boolean var5 = var1.existeAresta((int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(907);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var7.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    boolean var12 = var7.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(601);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(529);
    java.lang.Integer var16 = new java.lang.Integer(104);
    java.lang.Integer var17 = new java.lang.Integer(718);
    var14.insereAresta((int)var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var14.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    boolean var22 = var14.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(2);
    boolean var24 = var14.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(900);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(907);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo var29 = var28.grafoTransposto();
    java.lang.Integer var30 = new java.lang.Integer(0);
    boolean var31 = var28.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(1);
    boolean var33 = var28.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(505);
    ds.Grafo var35 = new ds.Grafo(var34);
    java.lang.Integer var36 = new java.lang.Integer(601);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(529);
    java.lang.Integer var39 = new java.lang.Integer(104);
    java.lang.Integer var40 = new java.lang.Integer(718);
    var37.insereAresta((int)var38, (int)var39, (int)var40);
    var26.insereAresta((int)var32, (int)var34, (int)var39);
    var1.insereAresta((int)var11, (int)var23, (int)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(297);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(296);
    ds.Grafo var3 = new ds.Grafo(var2);
    var3.imprime();
    java.lang.Integer var5 = new java.lang.Integer(127);
    java.lang.Integer var6 = new java.lang.Integer(831);
    boolean var7 = var3.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(687);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(406);
    java.lang.Integer var12 = new java.lang.Integer((-544));
    boolean var13 = var9.existeAresta((int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.existeAresta((int)var6, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(601);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(529);
    java.lang.Integer var3 = new java.lang.Integer(104);
    java.lang.Integer var4 = new java.lang.Integer(718);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(601);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(529);
    java.lang.Integer var13 = new java.lang.Integer(104);
    java.lang.Integer var14 = new java.lang.Integer(718);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    ds.Grafo var16 = new ds.Grafo(var13);
    ds.Grafo.Aresta var17 = var1.primeiroListaAdj((int)var13);
    java.lang.Integer var18 = new java.lang.Integer(505);
    ds.Grafo var19 = new ds.Grafo(var18);
    ds.Grafo var20 = new ds.Grafo(var18);
    ds.Grafo.Aresta var21 = var1.proxAdj((int)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(687);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(907);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(687);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(907);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var11.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(1);
    boolean var16 = var11.listaAdjVazia((int)var15);
    boolean var17 = var8.listaAdjVazia((int)var15);
    java.lang.Integer var18 = new java.lang.Integer(601);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(529);
    java.lang.Integer var21 = new java.lang.Integer(104);
    java.lang.Integer var22 = new java.lang.Integer(718);
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    boolean var25 = var19.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(1);
    boolean var27 = var19.listaAdjVazia((int)var26);
    java.lang.Integer var28 = new java.lang.Integer(2);
    boolean var29 = var19.listaAdjVazia((int)var28);
    boolean var30 = var6.existeAresta((int)var15, (int)var28);
    java.lang.Integer var31 = new java.lang.Integer(505);
    ds.Grafo var32 = new ds.Grafo(var31);
    java.lang.Integer var33 = new java.lang.Integer(159);
    ds.Grafo.Aresta var34 = var32.proxAdj((int)var33);
    ds.Grafo var35 = var32.grafoTransposto();
    ds.Grafo var36 = var32.grafoTransposto();
    java.lang.Integer var37 = new java.lang.Integer(0);
    boolean var38 = var32.listaAdjVazia((int)var37);
    java.lang.Integer var39 = new java.lang.Integer(1);
    boolean var40 = var32.listaAdjVazia((int)var39);
    java.lang.Integer var41 = new java.lang.Integer(2);
    boolean var42 = var32.listaAdjVazia((int)var41);
    java.lang.Integer var43 = new java.lang.Integer(3);
    boolean var44 = var32.listaAdjVazia((int)var43);
    java.lang.Integer var45 = new java.lang.Integer(4);
    boolean var46 = var32.listaAdjVazia((int)var45);
    int var47 = var32.numVertices();
    java.lang.Integer var48 = new java.lang.Integer(505);
    ds.Grafo var49 = new ds.Grafo(var48);
    java.lang.Integer var50 = new java.lang.Integer(159);
    ds.Grafo.Aresta var51 = var49.proxAdj((int)var50);
    ds.Grafo var52 = var49.grafoTransposto();
    ds.Grafo var53 = var49.grafoTransposto();
    java.lang.Integer var54 = new java.lang.Integer(0);
    boolean var55 = var49.listaAdjVazia((int)var54);
    java.lang.Integer var56 = new java.lang.Integer(1);
    boolean var57 = var49.listaAdjVazia((int)var56);
    java.lang.Integer var58 = new java.lang.Integer(2);
    boolean var59 = var49.listaAdjVazia((int)var58);
    var2.insereAresta((int)var28, (int)var47, (int)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
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
    assertTrue(var47 == 505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

}
