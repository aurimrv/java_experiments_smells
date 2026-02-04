package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
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

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    ds.Grafo var6 = var1.grafoTransposto();

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    var1.insereAresta((int)var6, (int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    boolean var9 = var8.existeAresta((int)var6, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 875);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var1.insereAresta((int)var9, (int)var10, (int)var11);
    boolean var13 = var8.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    boolean var10 = var1.existeAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    ds.Grafo.Aresta var5 = var2.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var1.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(64);
    ds.Grafo.Aresta var14 = var1.proxAdj((int)var13);
    boolean var15 = var8.listaAdjVazia((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var1.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(64);
    ds.Grafo.Aresta var14 = var1.proxAdj((int)var13);
    int var15 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var8.primeiroListaAdj((int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 875);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var2.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 727);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(946);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(946);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(946);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    int var5 = var1.numVertices();
    ds.Grafo.Aresta var6 = var2.retiraAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    boolean var6 = var5.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
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

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    var2.imprime();

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
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

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(4499);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
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

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 758);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    boolean var13 = var8.existeAresta((int)var11, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(200);
    java.lang.Integer var3 = new java.lang.Integer(227);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo.Aresta var5 = var1.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var8.listaAdjVazia((int)var13);
    var8.insereAresta((int)var13, (int)var13, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    boolean var4 = var3.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(200);
    java.lang.Integer var3 = new java.lang.Integer(227);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    int var5 = var1.numVertices();
    ds.Grafo var6 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 727);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var8 = var2.proxAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo.Aresta var3 = var2.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var8.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Grafo.Aresta var16 = var8.primeiroListaAdj((int)var15);
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 991);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-735));
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var5 = var1.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    var2.insereAresta((int)var7, (int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
    boolean var11 = var2.existeAresta((int)var9, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Grafo.Aresta var10 = var2.primeiroListaAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-735));
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(853);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    ds.Grafo.Aresta var11 = var1.retiraAresta((int)var10, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(200);
    java.lang.Integer var3 = new java.lang.Integer(227);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    ds.Grafo var11 = var1.grafoTransposto();
    ds.Grafo.Aresta var12 = var11.retiraAresta((int)var10, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(820);
    java.lang.Integer var7 = new java.lang.Integer((-391));
    java.lang.Integer var8 = new java.lang.Integer(1);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    ds.Grafo.Aresta var10 = var5.retiraAresta((int)var8, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var8.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Grafo.Aresta var16 = var8.primeiroListaAdj((int)var15);
    int var17 = var8.numVertices();
    ds.Grafo.Aresta var18 = var8.retiraAresta((int)var17, (int)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(820);
    java.lang.Integer var5 = new java.lang.Integer((-391));
    java.lang.Integer var6 = new java.lang.Integer(1);
    var2.insereAresta((int)var4, (int)var5, (int)var6);
    int var8 = var3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 727);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(820);
    java.lang.Integer var5 = new java.lang.Integer((-391));
    java.lang.Integer var6 = new java.lang.Integer(1);
    var2.insereAresta((int)var4, (int)var5, (int)var6);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    ds.Grafo var7 = new ds.Grafo(var5);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(200);
    java.lang.Integer var3 = new java.lang.Integer(227);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    int var5 = var1.numVertices();
    ds.Grafo var6 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(200);
    java.lang.Integer var3 = new java.lang.Integer(227);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    int var5 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
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

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(875);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(923);
    java.lang.Integer var5 = new java.lang.Integer(933);
    java.lang.Integer var6 = new java.lang.Integer(51);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    ds.Grafo var10 = var3.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(820);
    java.lang.Integer var12 = new java.lang.Integer((-391));
    java.lang.Integer var13 = new java.lang.Integer(1);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var10.listaAdjVazia((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Grafo.Aresta var18 = var10.primeiroListaAdj((int)var17);
    int var19 = var10.numVertices();
    java.lang.Integer var20 = new java.lang.Integer(1);
    ds.Grafo var21 = new ds.Grafo(var20);
    boolean var22 = var1.existeAresta((int)var19, (int)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    boolean var8 = var2.listaAdjVazia((int)var7);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var1.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(64);
    ds.Grafo.Aresta var14 = var1.proxAdj((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(875);
    ds.Grafo var16 = new ds.Grafo(var15);
    ds.Grafo var17 = var16.grafoTransposto();
    java.lang.Integer var18 = new java.lang.Integer(456);
    ds.Grafo.Aresta var19 = var16.proxAdj((int)var18);
    int var20 = var16.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var21 = var1.primeiroListaAdj((int)var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 875);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(727);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(200);
    java.lang.Integer var7 = new java.lang.Integer(227);
    boolean var8 = var5.existeAresta((int)var6, (int)var7);
    boolean var9 = var2.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var8.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(875);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(923);
    java.lang.Integer var18 = new java.lang.Integer(933);
    java.lang.Integer var19 = new java.lang.Integer(51);
    var16.insereAresta((int)var17, (int)var18, (int)var19);
    java.lang.Integer var21 = new java.lang.Integer(0);
    boolean var22 = var16.listaAdjVazia((int)var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    ds.Grafo.Aresta var24 = var16.primeiroListaAdj((int)var23);
    java.lang.Integer var25 = new java.lang.Integer(875);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(923);
    java.lang.Integer var28 = new java.lang.Integer(933);
    java.lang.Integer var29 = new java.lang.Integer(51);
    var26.insereAresta((int)var27, (int)var28, (int)var29);
    java.lang.Integer var31 = new java.lang.Integer(727);
    ds.Grafo var32 = new ds.Grafo(var31);
    boolean var33 = var16.existeAresta((int)var28, (int)var31);
    boolean var34 = var8.listaAdjVazia((int)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    int var9 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 875);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(875);
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

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(991);
    ds.Grafo var14 = new ds.Grafo(var13);
    boolean var15 = var8.listaAdjVazia((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(820);
    java.lang.Integer var4 = new java.lang.Integer((-391));
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.insereAresta((int)var3, (int)var4, (int)var5);
    var2.imprime();
    java.lang.Integer var8 = new java.lang.Integer(875);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(923);
    java.lang.Integer var11 = new java.lang.Integer(933);
    java.lang.Integer var12 = new java.lang.Integer(51);
    var9.insereAresta((int)var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var9.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(875);
    ds.Grafo var17 = new ds.Grafo(var16);
    java.lang.Integer var18 = new java.lang.Integer(923);
    java.lang.Integer var19 = new java.lang.Integer(933);
    java.lang.Integer var20 = new java.lang.Integer(51);
    var17.insereAresta((int)var18, (int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    boolean var23 = var17.listaAdjVazia((int)var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    ds.Grafo.Aresta var25 = var17.primeiroListaAdj((int)var24);
    int var26 = var17.numVertices();
    ds.Grafo.Aresta var27 = var2.retiraAresta((int)var14, (int)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-735));
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(875);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(923);
    java.lang.Integer var8 = new java.lang.Integer(933);
    java.lang.Integer var9 = new java.lang.Integer(51);
    var6.insereAresta((int)var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    boolean var12 = var6.listaAdjVazia((int)var11);
    boolean var13 = var1.listaAdjVazia((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var1.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(64);
    ds.Grafo.Aresta var14 = var1.proxAdj((int)var13);
    int var15 = var1.numVertices();
    int var16 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 875);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var1.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(991);
    ds.Grafo var14 = new ds.Grafo(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var15 = var1.primeiroListaAdj((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);
    java.lang.Integer var3 = new java.lang.Integer(727);
    ds.Grafo var4 = new ds.Grafo(var3);
    boolean var5 = var2.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(820);
    java.lang.Integer var7 = new java.lang.Integer((-391));
    java.lang.Integer var8 = new java.lang.Integer(1);
    var5.insereAresta((int)var6, (int)var7, (int)var8);
    boolean var10 = var1.listaAdjVazia((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo var5 = new ds.Grafo(var4);
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(875);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(923);
    java.lang.Integer var10 = new java.lang.Integer(933);
    java.lang.Integer var11 = new java.lang.Integer(51);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var8.listaAdjVazia((int)var13);
    ds.Grafo var15 = var8.grafoTransposto();
    java.lang.Integer var16 = new java.lang.Integer(820);
    java.lang.Integer var17 = new java.lang.Integer((-391));
    java.lang.Integer var18 = new java.lang.Integer(1);
    var15.insereAresta((int)var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var15.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    ds.Grafo.Aresta var23 = var15.primeiroListaAdj((int)var22);
    int var24 = var15.numVertices();
    java.lang.Integer var25 = new java.lang.Integer(727);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(200);
    java.lang.Integer var28 = new java.lang.Integer(227);
    boolean var29 = var26.existeAresta((int)var27, (int)var28);
    java.lang.Integer var30 = new java.lang.Integer(875);
    ds.Grafo var31 = new ds.Grafo(var30);
    ds.Grafo var32 = var31.grafoTransposto();
    java.lang.Integer var33 = new java.lang.Integer(456);
    ds.Grafo.Aresta var34 = var31.proxAdj((int)var33);
    int var35 = var31.numVertices();
    ds.Grafo var36 = new ds.Grafo(var35);
    var6.insereAresta((int)var24, (int)var28, (int)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var38 = var2.proxAdj((int)var35);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 875);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo var8 = new ds.Grafo(var7);
    java.lang.Integer var9 = new java.lang.Integer(758);
    ds.Grafo var10 = new ds.Grafo(var9);
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(820);
    java.lang.Integer var13 = new java.lang.Integer((-391));
    java.lang.Integer var14 = new java.lang.Integer(1);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    var5.insereAresta((int)var6, (int)var7, (int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(991);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(456);
    ds.Grafo.Aresta var4 = var1.proxAdj((int)var3);
    int var5 = var1.numVertices();
    java.lang.Integer var6 = new java.lang.Integer(758);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    ds.Grafo.Aresta var13 = var1.primeiroListaAdj((int)var11);
    java.lang.Integer var14 = new java.lang.Integer(875);
    ds.Grafo var15 = new ds.Grafo(var14);
    java.lang.Integer var16 = new java.lang.Integer(923);
    java.lang.Integer var17 = new java.lang.Integer(933);
    java.lang.Integer var18 = new java.lang.Integer(51);
    var15.insereAresta((int)var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    boolean var21 = var15.listaAdjVazia((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    ds.Grafo.Aresta var23 = var15.primeiroListaAdj((int)var22);
    int var24 = var15.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var25 = var1.proxAdj((int)var24);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 875);

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(727);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(200);
    java.lang.Integer var6 = new java.lang.Integer(227);
    boolean var7 = var4.existeAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Grafo var9 = new ds.Grafo(var8);
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(820);
    java.lang.Integer var12 = new java.lang.Integer((-391));
    java.lang.Integer var13 = new java.lang.Integer(1);
    var10.insereAresta((int)var11, (int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    boolean var16 = var10.listaAdjVazia((int)var15);
    ds.Grafo.Aresta var17 = var2.retiraAresta((int)var6, (int)var15);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Grafo var10 = new ds.Grafo(var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(100);
    java.lang.Integer var14 = new java.lang.Integer(758);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo var16 = var15.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(820);
    java.lang.Integer var18 = new java.lang.Integer((-391));
    java.lang.Integer var19 = new java.lang.Integer(1);
    var16.insereAresta((int)var17, (int)var18, (int)var19);
    var10.insereAresta((int)var11, (int)var13, (int)var17);
    ds.Grafo.Aresta var22 = var1.proxAdj((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    ds.Grafo var8 = var1.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(820);
    java.lang.Integer var10 = new java.lang.Integer((-391));
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.insereAresta((int)var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(0);
    boolean var14 = var8.listaAdjVazia((int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Grafo.Aresta var16 = var8.primeiroListaAdj((int)var15);
    int var17 = var8.numVertices();
    java.lang.Integer var18 = new java.lang.Integer(875);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(923);
    java.lang.Integer var21 = new java.lang.Integer(933);
    java.lang.Integer var22 = new java.lang.Integer(51);
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    boolean var25 = var19.listaAdjVazia((int)var24);
    ds.Grafo var26 = var19.grafoTransposto();
    java.lang.Integer var27 = new java.lang.Integer(820);
    java.lang.Integer var28 = new java.lang.Integer((-391));
    java.lang.Integer var29 = new java.lang.Integer(1);
    var26.insereAresta((int)var27, (int)var28, (int)var29);
    java.lang.Integer var31 = new java.lang.Integer(0);
    boolean var32 = var26.listaAdjVazia((int)var31);
    java.lang.Integer var33 = new java.lang.Integer(0);
    ds.Grafo.Aresta var34 = var26.primeiroListaAdj((int)var33);
    java.lang.Integer var35 = new java.lang.Integer(875);
    ds.Grafo var36 = new ds.Grafo(var35);
    ds.Grafo var37 = var36.grafoTransposto();
    java.lang.Integer var38 = new java.lang.Integer(456);
    ds.Grafo.Aresta var39 = var36.proxAdj((int)var38);
    ds.Grafo var40 = var36.grafoTransposto();
    java.lang.Integer var41 = new java.lang.Integer(820);
    java.lang.Integer var42 = new java.lang.Integer((-391));
    java.lang.Integer var43 = new java.lang.Integer(1);
    var40.insereAresta((int)var41, (int)var42, (int)var43);
    java.lang.Integer var45 = new java.lang.Integer(758);
    ds.Grafo var46 = new ds.Grafo(var45);
    ds.Grafo var47 = var46.grafoTransposto();
    java.lang.Integer var48 = new java.lang.Integer(820);
    java.lang.Integer var49 = new java.lang.Integer((-391));
    java.lang.Integer var50 = new java.lang.Integer(1);
    var47.insereAresta((int)var48, (int)var49, (int)var50);
    var8.insereAresta((int)var33, (int)var41, (int)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(875);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(923);
    java.lang.Integer var5 = new java.lang.Integer(933);
    java.lang.Integer var6 = new java.lang.Integer(51);
    var3.insereAresta((int)var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    boolean var9 = var3.listaAdjVazia((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo.Aresta var11 = var3.primeiroListaAdj((int)var10);
    int var12 = var3.numVertices();
    ds.Grafo var13 = var3.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(875);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo var16 = var15.grafoTransposto();
    java.lang.Integer var17 = new java.lang.Integer(456);
    ds.Grafo.Aresta var18 = var15.proxAdj((int)var17);
    ds.Grafo var19 = var15.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(820);
    java.lang.Integer var21 = new java.lang.Integer((-391));
    java.lang.Integer var22 = new java.lang.Integer(1);
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    boolean var24 = var13.listaAdjVazia((int)var22);
    ds.Grafo.Aresta var25 = var1.proxAdj((int)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 875);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Grafo var4 = new ds.Grafo(var3);
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(100);
    boolean var7 = var4.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(727);
    ds.Grafo var9 = new ds.Grafo(var8);
    java.lang.Integer var10 = new java.lang.Integer(200);
    java.lang.Integer var11 = new java.lang.Integer(227);
    boolean var12 = var9.existeAresta((int)var10, (int)var11);
    int var13 = var9.numVertices();
    boolean var14 = var2.existeAresta((int)var6, (int)var13);
    int var15 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 727);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    int var6 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 875);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(758);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = new ds.Grafo(var0);
    ds.Grafo var3 = var2.grafoTransposto();
    int var4 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 758);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Grafo var3 = new ds.Grafo(var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(758);
    ds.Grafo var6 = new ds.Grafo(var5);
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(820);
    java.lang.Integer var9 = new java.lang.Integer((-391));
    java.lang.Integer var10 = new java.lang.Integer(1);
    var7.insereAresta((int)var8, (int)var9, (int)var10);
    var1.insereAresta((int)var2, (int)var4, (int)var8);
    java.lang.Integer var13 = new java.lang.Integer(875);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(923);
    java.lang.Integer var16 = new java.lang.Integer(933);
    java.lang.Integer var17 = new java.lang.Integer(51);
    var14.insereAresta((int)var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    boolean var20 = var14.listaAdjVazia((int)var19);
    ds.Grafo var21 = var14.grafoTransposto();
    java.lang.Integer var22 = new java.lang.Integer(820);
    java.lang.Integer var23 = new java.lang.Integer((-391));
    java.lang.Integer var24 = new java.lang.Integer(1);
    var21.insereAresta((int)var22, (int)var23, (int)var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    boolean var27 = var21.listaAdjVazia((int)var26);
    ds.Grafo.Aresta var28 = var1.primeiroListaAdj((int)var26);
    java.lang.Integer var29 = new java.lang.Integer(758);
    ds.Grafo var30 = new ds.Grafo(var29);
    ds.Grafo var31 = var30.grafoTransposto();
    java.lang.Integer var32 = new java.lang.Integer(820);
    java.lang.Integer var33 = new java.lang.Integer((-391));
    java.lang.Integer var34 = new java.lang.Integer(1);
    var31.insereAresta((int)var32, (int)var33, (int)var34);
    java.lang.Integer var36 = new java.lang.Integer(727);
    ds.Grafo var37 = new ds.Grafo(var36);
    java.lang.Integer var38 = new java.lang.Integer(1);
    java.lang.Integer var39 = new java.lang.Integer((-735));
    ds.Grafo.Aresta var40 = var37.retiraAresta((int)var38, (int)var39);
    boolean var41 = var1.existeAresta((int)var34, (int)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(875);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(923);
    java.lang.Integer var3 = new java.lang.Integer(933);
    java.lang.Integer var4 = new java.lang.Integer(51);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    java.lang.Integer var10 = new java.lang.Integer(875);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(923);
    java.lang.Integer var13 = new java.lang.Integer(933);
    java.lang.Integer var14 = new java.lang.Integer(51);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(727);
    ds.Grafo var17 = new ds.Grafo(var16);
    boolean var18 = var1.existeAresta((int)var13, (int)var16);
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Grafo var20 = new ds.Grafo(var19);
    ds.Grafo.Aresta var21 = var1.proxAdj((int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

}
