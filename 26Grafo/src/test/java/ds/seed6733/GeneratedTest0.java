package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
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

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    var1.insereAresta((int)var5, (int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test6() throws Throwable {

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

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = new ds.Grafo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    var9.insereAresta((int)var7, (int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    ds.Grafo.Aresta var11 = var10.retiraAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo(var0);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(750);
    java.lang.Integer var12 = new java.lang.Integer((-843));
    java.lang.Integer var13 = new java.lang.Integer(782);
    var9.insereAresta((int)var11, (int)var12, (int)var13);
    ds.Grafo var15 = new ds.Grafo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    var9.imprime();
    boolean var11 = var9.existeAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    var9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(750);
    java.lang.Integer var12 = new java.lang.Integer((-843));
    java.lang.Integer var13 = new java.lang.Integer(782);
    var9.insereAresta((int)var11, (int)var12, (int)var13);
    var9.imprime();
    ds.Grafo var16 = var10.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(750);
    java.lang.Integer var12 = new java.lang.Integer((-843));
    java.lang.Integer var13 = new java.lang.Integer(782);
    var9.insereAresta((int)var11, (int)var12, (int)var13);
    var9.imprime();
    int var16 = var9.numVertices();
    var10.insereAresta((int)var16, (int)var16, (int)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(824);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var3 = var1.proxAdj((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    ds.Grafo var11 = var10.grafoTransposto();
    boolean var12 = var11.existeAresta((int)var7, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(750);
    java.lang.Integer var12 = new java.lang.Integer((-843));
    java.lang.Integer var13 = new java.lang.Integer(782);
    var9.insereAresta((int)var11, (int)var12, (int)var13);
    var9.imprime();
    int var16 = var9.numVertices();
    java.lang.Integer var17 = new java.lang.Integer(1);
    ds.Grafo.Aresta var18 = var9.proxAdj((int)var17);
    boolean var19 = var10.listaAdjVazia((int)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(80);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(80);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    var1.imprime();

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
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

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    var5.insereAresta((int)var3, (int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    int var6 = var5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 451);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    int var8 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 451);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(133);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.listaAdjVazia((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(133);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    ds.Grafo var10 = new ds.Grafo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insereAresta((int)var10, (int)var10, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 451);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    int var10 = var9.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    boolean var3 = var2.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(864);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(864);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 864);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(864);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    int var3 = var2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 864);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(551);
    ds.Grafo var1 = new ds.Grafo(var0);
    int var2 = var1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 551);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(551);
    ds.Grafo var1 = new ds.Grafo(var0);
    boolean var2 = var1.existeAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(551);
    ds.Grafo var1 = new ds.Grafo(var0);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();
    ds.Grafo var4 = new ds.Grafo(var0);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var1.imprime();

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(133);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.imprime();

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(133);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(795);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo.Aresta var2 = var1.retiraAresta((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(795);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    var2.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Grafo.Aresta var12 = var1.proxAdj((int)var11);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
    ds.Grafo var6 = var1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    int var3 = var1.numVertices();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Grafo.Aresta var5 = var1.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(795);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = new ds.Grafo(var0);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(114);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.insereAresta((int)var0, (int)var0, (int)var0);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(114);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    boolean var7 = var1.listaAdjVazia((int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Grafo.Aresta var9 = var1.primeiroListaAdj((int)var8);
    int var10 = var1.numVertices();
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Grafo.Aresta var12 = var1.proxAdj((int)var11);
    java.lang.Integer var13 = new java.lang.Integer(2);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(904);
    java.lang.Integer var16 = new java.lang.Integer(830);
    ds.Grafo.Aresta var17 = var14.retiraAresta((int)var15, (int)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var18 = var1.proxAdj((int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.Grafo var5 = new ds.Grafo(var4);
    java.lang.Integer var6 = new java.lang.Integer(904);
    java.lang.Integer var7 = new java.lang.Integer(830);
    ds.Grafo.Aresta var8 = var5.retiraAresta((int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var9 = var3.primeiroListaAdj((int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(750);
    java.lang.Integer var3 = new java.lang.Integer((-843));
    java.lang.Integer var4 = new java.lang.Integer(782);
    var1.insereAresta((int)var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(133);
    ds.Grafo var7 = new ds.Grafo(var6);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(451);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(750);
    java.lang.Integer var13 = new java.lang.Integer((-843));
    java.lang.Integer var14 = new java.lang.Integer(782);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var1.listaAdjVazia((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(451);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(750);
    java.lang.Integer var6 = new java.lang.Integer((-843));
    java.lang.Integer var7 = new java.lang.Integer(782);
    var4.insereAresta((int)var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    boolean var10 = var4.listaAdjVazia((int)var9);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    boolean var12 = var2.existeAresta((int)var9, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(2);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(904);
    java.lang.Integer var13 = new java.lang.Integer(830);
    ds.Grafo.Aresta var14 = var11.retiraAresta((int)var12, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Grafo.Aresta var16 = var11.proxAdj((int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    ds.Grafo.Aresta var18 = var11.proxAdj((int)var17);
    ds.Grafo var19 = var11.grafoTransposto();
    ds.Grafo var20 = var19.grafoTransposto();
    java.lang.Integer var21 = new java.lang.Integer(750);
    java.lang.Integer var22 = new java.lang.Integer((-843));
    java.lang.Integer var23 = new java.lang.Integer(782);
    var19.insereAresta((int)var21, (int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(80);
    ds.Grafo var26 = new ds.Grafo(var25);
    java.lang.Integer var27 = new java.lang.Integer(114);
    ds.Grafo var28 = new ds.Grafo(var27);
    var9.insereAresta((int)var21, (int)var25, (int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(795);
    ds.Grafo var13 = new ds.Grafo(var12);
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(534);
    ds.Grafo var16 = new ds.Grafo(var15);
    var16.imprime();
    int var18 = var16.numVertices();
    java.lang.Integer var19 = new java.lang.Integer(534);
    ds.Grafo var20 = new ds.Grafo(var19);
    var20.imprime();
    int var22 = var20.numVertices();
    boolean var23 = var14.existeAresta((int)var18, (int)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var24 = var11.primeiroListaAdj((int)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(451);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(750);
    java.lang.Integer var13 = new java.lang.Integer((-843));
    java.lang.Integer var14 = new java.lang.Integer(782);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var9.proxAdj((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(80);
    ds.Grafo var1 = new ds.Grafo(var0);
    var1.imprime();

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(451);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(750);
    java.lang.Integer var13 = new java.lang.Integer((-843));
    java.lang.Integer var14 = new java.lang.Integer(782);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Grafo.Aresta var16 = var1.proxAdj((int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(864);
    ds.Grafo var11 = new ds.Grafo(var10);
    ds.Grafo var12 = var11.grafoTransposto();
    java.lang.Integer var13 = new java.lang.Integer(2);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(904);
    java.lang.Integer var16 = new java.lang.Integer(830);
    ds.Grafo.Aresta var17 = var14.retiraAresta((int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(2);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(904);
    java.lang.Integer var21 = new java.lang.Integer(830);
    ds.Grafo.Aresta var22 = var19.retiraAresta((int)var20, (int)var21);
    ds.Grafo var23 = var19.grafoTransposto();
    int var24 = var19.numVertices();
    java.lang.Integer var25 = new java.lang.Integer(795);
    ds.Grafo var26 = new ds.Grafo(var25);
    ds.Grafo var27 = var26.grafoTransposto();
    java.lang.Integer var28 = new java.lang.Integer(534);
    ds.Grafo var29 = new ds.Grafo(var28);
    var29.imprime();
    int var31 = var29.numVertices();
    java.lang.Integer var32 = new java.lang.Integer(534);
    ds.Grafo var33 = new ds.Grafo(var32);
    var33.imprime();
    int var35 = var33.numVertices();
    boolean var36 = var27.existeAresta((int)var31, (int)var35);
    var12.insereAresta((int)var15, (int)var24, (int)var35);
    java.lang.Integer var38 = new java.lang.Integer(451);
    ds.Grafo var39 = new ds.Grafo(var38);
    java.lang.Integer var40 = new java.lang.Integer(750);
    java.lang.Integer var41 = new java.lang.Integer((-843));
    java.lang.Integer var42 = new java.lang.Integer(782);
    var39.insereAresta((int)var40, (int)var41, (int)var42);
    boolean var44 = var1.existeAresta((int)var35, (int)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(534);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.Grafo var4 = new ds.Grafo(var3);
    java.lang.Integer var5 = new java.lang.Integer(904);
    java.lang.Integer var6 = new java.lang.Integer(830);
    ds.Grafo.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
    ds.Grafo var8 = var4.grafoTransposto();
    int var9 = var4.numVertices();
    java.lang.Integer var10 = new java.lang.Integer(451);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(750);
    java.lang.Integer var13 = new java.lang.Integer((-843));
    java.lang.Integer var14 = new java.lang.Integer(782);
    var11.insereAresta((int)var12, (int)var13, (int)var14);
    boolean var16 = var1.existeAresta((int)var9, (int)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(451);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(864);
    ds.Grafo var3 = new ds.Grafo(var2);
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(2);
    ds.Grafo var6 = new ds.Grafo(var5);
    java.lang.Integer var7 = new java.lang.Integer(904);
    java.lang.Integer var8 = new java.lang.Integer(830);
    ds.Grafo.Aresta var9 = var6.retiraAresta((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    ds.Grafo var11 = new ds.Grafo(var10);
    java.lang.Integer var12 = new java.lang.Integer(904);
    java.lang.Integer var13 = new java.lang.Integer(830);
    ds.Grafo.Aresta var14 = var11.retiraAresta((int)var12, (int)var13);
    ds.Grafo var15 = var11.grafoTransposto();
    int var16 = var11.numVertices();
    java.lang.Integer var17 = new java.lang.Integer(795);
    ds.Grafo var18 = new ds.Grafo(var17);
    ds.Grafo var19 = var18.grafoTransposto();
    java.lang.Integer var20 = new java.lang.Integer(534);
    ds.Grafo var21 = new ds.Grafo(var20);
    var21.imprime();
    int var23 = var21.numVertices();
    java.lang.Integer var24 = new java.lang.Integer(534);
    ds.Grafo var25 = new ds.Grafo(var24);
    var25.imprime();
    int var27 = var25.numVertices();
    boolean var28 = var19.existeAresta((int)var23, (int)var27);
    var4.insereAresta((int)var7, (int)var16, (int)var27);
    boolean var30 = var1.listaAdjVazia((int)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.Grafo var1 = new ds.Grafo(var0);
    java.lang.Integer var2 = new java.lang.Integer(904);
    java.lang.Integer var3 = new java.lang.Integer(830);
    ds.Grafo.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Grafo.Aresta var6 = var1.proxAdj((int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Grafo.Aresta var8 = var1.proxAdj((int)var7);
    ds.Grafo var9 = var1.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(451);
    ds.Grafo var12 = new ds.Grafo(var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Grafo var14 = new ds.Grafo(var13);
    java.lang.Integer var15 = new java.lang.Integer(2);
    ds.Grafo var16 = new ds.Grafo(var15);
    java.lang.Integer var17 = new java.lang.Integer(904);
    java.lang.Integer var18 = new java.lang.Integer(830);
    ds.Grafo.Aresta var19 = var16.retiraAresta((int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Grafo.Aresta var21 = var16.proxAdj((int)var20);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Grafo.Aresta var23 = var16.proxAdj((int)var22);
    ds.Grafo var24 = var16.grafoTransposto();
    ds.Grafo var25 = var24.grafoTransposto();
    java.lang.Integer var26 = new java.lang.Integer(750);
    java.lang.Integer var27 = new java.lang.Integer((-843));
    java.lang.Integer var28 = new java.lang.Integer(782);
    var24.insereAresta((int)var26, (int)var27, (int)var28);
    var24.imprime();
    int var31 = var24.numVertices();
    java.lang.Integer var32 = new java.lang.Integer(1);
    ds.Grafo.Aresta var33 = var24.proxAdj((int)var32);
    ds.Grafo.Aresta var34 = var12.retiraAresta((int)var13, (int)var32);
    java.lang.Integer var35 = new java.lang.Integer(451);
    ds.Grafo var36 = new ds.Grafo(var35);
    java.lang.Integer var37 = new java.lang.Integer(750);
    java.lang.Integer var38 = new java.lang.Integer((-843));
    java.lang.Integer var39 = new java.lang.Integer(782);
    var36.insereAresta((int)var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(133);
    ds.Grafo var42 = new ds.Grafo(var41);
    var10.insereAresta((int)var13, (int)var38, (int)var41);
    int var44 = var10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(795);
    ds.Grafo var1 = new ds.Grafo(var0);
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(534);
    ds.Grafo var4 = new ds.Grafo(var3);
    var4.imprime();
    int var6 = var4.numVertices();
    java.lang.Integer var7 = new java.lang.Integer(534);
    ds.Grafo var8 = new ds.Grafo(var7);
    var8.imprime();
    int var10 = var8.numVertices();
    boolean var11 = var2.existeAresta((int)var6, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(864);
    ds.Grafo var13 = new ds.Grafo(var12);
    java.lang.Integer var14 = new java.lang.Integer(133);
    ds.Grafo var15 = new ds.Grafo(var14);
    ds.Grafo.Aresta var16 = var13.primeiroListaAdj((int)var14);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(451);
    ds.Grafo var19 = new ds.Grafo(var18);
    java.lang.Integer var20 = new java.lang.Integer(750);
    java.lang.Integer var21 = new java.lang.Integer((-843));
    java.lang.Integer var22 = new java.lang.Integer(782);
    var19.insereAresta((int)var20, (int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    boolean var25 = var19.listaAdjVazia((int)var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    ds.Grafo.Aresta var27 = var19.primeiroListaAdj((int)var26);
    int var28 = var19.numVertices();
    java.lang.Integer var29 = new java.lang.Integer(1);
    ds.Grafo.Aresta var30 = var19.proxAdj((int)var29);
    var2.insereAresta((int)var14, (int)var17, (int)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 534);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);

  }

}
