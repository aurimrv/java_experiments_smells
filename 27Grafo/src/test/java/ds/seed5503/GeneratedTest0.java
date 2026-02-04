package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
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

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    var2.insereAresta((int)var3, (int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
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

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
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

    java.lang.Integer var0 = new java.lang.Integer(52);
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

    java.lang.Integer var0 = new java.lang.Integer(911);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
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

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var2.proxAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var2.listaAdjVazia((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 911);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(105);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(105);
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

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(867);
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

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(867);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 867);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
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

    java.lang.Integer var0 = new java.lang.Integer(259);
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

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
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

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.listaAdjVazia((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var3.proxAdj((int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var2.listaAdjVazia((int)var3);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(867);
    boolean var9 = var1.listaAdjVazia((int)var8);
    ds.Grafo.Aresta var10 = var2.proxAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(867);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(868);
    boolean var11 = var1.listaAdjVazia((int)var10);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(867);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(868);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(869);
    boolean var13 = var1.listaAdjVazia((int)var12);
    var2.insereAresta((int)var12, (int)var12, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(867);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    ds.Grafo var3 = new ds.Grafo(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 975);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    var1.imprime();
    int var7 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var1.retiraAresta((int)var7, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 259);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    var1.imprime();
    int var7 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 259);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(867);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(867);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    boolean var8 = var1.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(867);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    int var8 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 867);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(867);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(248);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-321));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Grafo.Aresta var7 = var1.proxAdj((int)var6);
    int var8 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 867);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(52);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
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

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
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

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
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

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(867);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(868);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(195);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    boolean var4 = var1.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 259);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(867);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(868);
    boolean var11 = var1.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(869);
    boolean var13 = var1.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(870);
    boolean var15 = var1.listaAdjVazia((int)var14);
    ds.Grafo var16 = new ds.Grafo(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var2.listaAdjVazia((int)var5);
    ds.Grafo var7 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(867);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(868);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(869);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo.Aresta var9 = var1.proxAdj((int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(145);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.existeAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    java.lang.Integer var3 = new java.lang.Integer(867);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(868);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(869);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(870);
    boolean var10 = var1.listaAdjVazia((int)var9);
    ds.Grafo.Aresta var11 = var1.proxAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 975);
    
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

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
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

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(195);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-633));
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

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(195);
    ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-633));
    boolean var6 = var1.existeAresta((int)var4, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
    boolean var8 = var2.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var3.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var3.retiraAresta((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 259);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 259);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
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

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(108);
    boolean var10 = var1.listaAdjVazia((int)var9);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
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

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
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

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
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

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo.Aresta var7 = var2.primeiroListaAdj((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(145);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(975);
    ds.Grafo var7 = new ds.Grafo(var6);
    int var8 = var7.numVertices();
    java.lang.Integer var9 = new java.lang.Integer(911);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(248);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer((-321));
    var10.insereAresta((int)var12, (int)var13, (int)var14);
    int var16 = var10.numVertices();
    java.lang.Integer var17 = new java.lang.Integer(867);
    boolean var18 = var10.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(868);
    boolean var20 = var10.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(869);
    boolean var22 = var10.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(808);
    ds.Grafo var24 = new ds.Grafo(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var8, (int)var21, (int)var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(52);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(259);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(105);
    boolean var8 = var6.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(106);
    boolean var10 = var6.listaAdjVazia((int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var11 = var1.retiraAresta((int)var2, (int)var9);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(911);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(248);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-321));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    int var10 = var4.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(911);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(248);
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-321));
    var12.insereAresta((int)var14, (int)var15, (int)var16);
    int var18 = var12.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(867);
    boolean var20 = var12.listaAdjVazia((int)var19);
    java.lang.Integer var21 = new java.lang.Integer(868);
    boolean var22 = var12.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(869);
    boolean var24 = var12.listaAdjVazia((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(870);
    boolean var26 = var12.listaAdjVazia((int)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var27 = var1.retiraAresta((int)var10, (int)var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(52);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.listaAdjVazia((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(108);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(808);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = new ds.Grafo(var11);
    java.lang.Integer var14 = new java.lang.Integer(433);
    ds.Grafo var15 = new ds.Grafo(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var1.retiraAresta((int)var11, (int)var14);
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

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(975);
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

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
    boolean var8 = var1.listaAdjVazia((int)var7);
    ds.Grafo var9 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(975);
    ds.Grafo var6 = new ds.Grafo(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.primeiroListaAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(911);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(248);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer((-321));
    var5.insereAresta((int)var7, (int)var8, (int)var9);
    ds.Grafo.Aresta var11 = var1.primeiroListaAdj((int)var7);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(911);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(248);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-321));
    var4.insereAresta((int)var6, (int)var7, (int)var8);
    int var10 = var4.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(867);
    boolean var12 = var4.listaAdjVazia((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(868);
    boolean var14 = var4.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(869);
    boolean var16 = var4.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(870);
    boolean var18 = var4.listaAdjVazia((int)var17);
    java.lang.Integer var19 = new java.lang.Integer(975);
    ds.Grafo var20 = new ds.Grafo(var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer(145);
    java.lang.Integer var23 = new java.lang.Integer((-1));
    var20.insereAresta((int)var21, (int)var22, (int)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var25 = var2.existeAresta((int)var17, (int)var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(975);
    ds.Grafo var4 = new ds.Grafo(var3);
    int var5 = var4.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(867);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(868);
    boolean var9 = var4.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(869);
    boolean var11 = var4.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(870);
    boolean var13 = var4.listaAdjVazia((int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var2.listaAdjVazia((int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(259);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(248);
    java.lang.Integer var7 = new java.lang.Integer((-321));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(975);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(808);
    ds.Grafo var12 = new ds.Grafo(var11);
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var12.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var12.listaAdjVazia((int)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insereAresta((int)var7, (int)var9, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
    boolean var8 = var1.listaAdjVazia((int)var7);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(433);
    ds.Grafo var3 = new ds.Grafo(var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(107);
    boolean var8 = var1.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(108);
    boolean var10 = var1.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer(975);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(145);
    java.lang.Integer var15 = new java.lang.Integer((-1));
    var12.insereAresta((int)var13, (int)var14, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(911);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(248);
    java.lang.Integer var21 = new java.lang.Integer(0);
    java.lang.Integer var22 = new java.lang.Integer((-321));
    var18.insereAresta((int)var20, (int)var21, (int)var22);
    int var24 = var18.numVertices();
    java.lang.Integer var25 = new java.lang.Integer(867);
    boolean var26 = var18.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(868);
    boolean var28 = var18.listaAdjVazia((int)var27);
    java.lang.Integer var29 = new java.lang.Integer(869);
    boolean var30 = var18.listaAdjVazia((int)var29);
    ds.Grafo var31 = new ds.Grafo(var29);
    boolean var32 = var1.existeAresta((int)var13, (int)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(911);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(248);
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-321));
    var3.insereAresta((int)var5, (int)var6, (int)var7);
    int var9 = var3.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(867);
    boolean var11 = var3.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(868);
    boolean var13 = var3.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(869);
    boolean var15 = var3.listaAdjVazia((int)var14);
    ds.Grafo var16 = new ds.Grafo(var14);
    java.lang.Integer var17 = new java.lang.Integer(911);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(248);
    java.lang.Integer var21 = new java.lang.Integer(0);
    java.lang.Integer var22 = new java.lang.Integer((-321));
    var18.insereAresta((int)var20, (int)var21, (int)var22);
    int var24 = var18.numVertices();
    java.lang.Integer var25 = new java.lang.Integer(867);
    boolean var26 = var18.listaAdjVazia((int)var25);
    java.lang.Integer var27 = new java.lang.Integer(259);
    ds.Grafo var28 = new ds.Grafo(var27);
    ds.Grafo var29 = var28.grafoTransposto();
    java.lang.Integer var30 = new java.lang.Integer(105);
    boolean var31 = var29.listaAdjVazia((int)var30);
    java.lang.Integer var32 = new java.lang.Integer(106);
    boolean var33 = var29.listaAdjVazia((int)var32);
    java.lang.Integer var34 = new java.lang.Integer(107);
    boolean var35 = var29.listaAdjVazia((int)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var14, (int)var25, (int)var34);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(52);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(259);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(105);
    boolean var7 = var5.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(106);
    boolean var9 = var5.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(107);
    boolean var11 = var5.listaAdjVazia((int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.listaAdjVazia((int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(52);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(911);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(248);
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-321));
    var3.insereAresta((int)var5, (int)var6, (int)var7);
    int var9 = var3.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(105);
    ds.Grafo var11 = new ds.Grafo(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var12 = var1.retiraAresta((int)var9, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 911);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(433);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var1.listaAdjVazia((int)var5);
    ds.Grafo var7 = var1.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(259);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(248);
    java.lang.Integer var12 = new java.lang.Integer((-321));
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    ds.Grafo.Aresta var14 = var7.primeiroListaAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(259);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(145);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(911);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(248);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-321));
    var8.insereAresta((int)var10, (int)var11, (int)var12);
    int var14 = var8.numVertices();
    java.lang.Integer var15 = new java.lang.Integer(433);
    ds.Grafo var16 = new ds.Grafo(var15);
    ds.Grafo var17 = var16.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(105);
    boolean var19 = var16.listaAdjVazia((int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var20 = var1.retiraAresta((int)var14, (int)var18);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 911);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    ds.Grafo var4 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 911);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(911);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(911);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(248);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-321));
    var7.insereAresta((int)var9, (int)var10, (int)var11);
    int var13 = var7.numVertices();
    java.lang.Integer var14 = new java.lang.Integer(867);
    boolean var15 = var7.listaAdjVazia((int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var3.existeAresta((int)var4, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    int var7 = var1.numVertices();
    java.lang.Integer var8 = new java.lang.Integer(867);
    boolean var9 = var1.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(868);
    boolean var11 = var1.listaAdjVazia((int)var10);
    int var12 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 911);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 911);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(433);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(105);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(106);
    boolean var9 = var4.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(107);
    boolean var11 = var4.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(108);
    boolean var13 = var4.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(259);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo var16 = var15.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(100);
    boolean var18 = var16.listaAdjVazia((int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var19 = var1.retiraAresta((int)var12, (int)var17);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = var1.grafoTransposto();

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(975);
    ds.Grafo var3 = new ds.Grafo(var2);
    int var4 = var3.numVertices();
    java.lang.Integer var5 = new java.lang.Integer(975);
    ds.Grafo var6 = new ds.Grafo(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var7 = var1.retiraAresta((int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 975);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(259);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(105);
    boolean var6 = var4.listaAdjVazia((int)var5);
    boolean var7 = var1.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(105);
    boolean var4 = var2.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(106);
    boolean var6 = var2.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    ds.Grafo.Aresta var8 = var2.primeiroListaAdj((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(911);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(248);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer((-321));
    var10.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(259);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(105);
    boolean var20 = var18.listaAdjVazia((int)var19);
    boolean var21 = var10.listaAdjVazia((int)var19);
    ds.Grafo.Aresta var22 = var2.primeiroListaAdj((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(808);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(0);
    boolean var6 = var3.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    boolean var8 = var3.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(259);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(105);
    boolean var13 = var11.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(106);
    boolean var15 = var11.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(107);
    boolean var17 = var11.listaAdjVazia((int)var16);
    ds.Grafo.Aresta var18 = var3.proxAdj((int)var16);
    ds.Grafo.Aresta var19 = var1.primeiroListaAdj((int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(145);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 975);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(975);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(145);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    int var9 = var4.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 975);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(808);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(0);
    boolean var4 = var1.listaAdjVazia((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var1.listaAdjVazia((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(259);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(105);
    boolean var11 = var9.listaAdjVazia((int)var10);
    java.lang.Integer var12 = new java.lang.Integer(106);
    boolean var13 = var9.listaAdjVazia((int)var12);
    java.lang.Integer var14 = new java.lang.Integer(107);
    boolean var15 = var9.listaAdjVazia((int)var14);
    ds.Grafo.Aresta var16 = var1.proxAdj((int)var14);
    ds.Grafo var17 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(911);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(248);
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-321));
    var3.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(911);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(248);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer((-321));
    var10.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(433);
    ds.Grafo var17 = new ds.Grafo(var16);
    ds.Grafo var18 = var17.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(975);
    ds.Grafo var20 = new ds.Grafo(var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer(145);
    java.lang.Integer var23 = new java.lang.Integer((-1));
    var20.insereAresta((int)var21, (int)var22, (int)var23);
    boolean var25 = var17.listaAdjVazia((int)var21);
    var1.insereAresta((int)var6, (int)var12, (int)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(975);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 975);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(911);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(248);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-321));
    var1.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(259);
    ds.Grafo var8 = new ds.Grafo(var7);
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(105);
    boolean var11 = var9.listaAdjVazia((int)var10);
    boolean var12 = var1.listaAdjVazia((int)var10);
    ds.Grafo var13 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(259);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(259);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(975);
    ds.Grafo var5 = new ds.Grafo(var4);
    int var6 = var5.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(867);
    boolean var8 = var5.listaAdjVazia((int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var1.retiraAresta((int)var2, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 975);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

}
