package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.existeAresta((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Aresta var6 = var0.proxAdj((int)var5);
    boolean var7 = var4.listaAdjVazia((int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var5 = var2.retiraAresta((int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(15);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Aresta var5 = var0.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(15);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    boolean var5 = var0.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Aresta var3 = var0.primeiroListaAdj((int)var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    boolean var3 = var0.listaAdjVazia((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    var3.imprime();

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(15);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var1.proxAdj((int)var6);
    boolean var8 = var0.listaAdjVazia((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.proxAdj((int)var3);
    ds.Grafo var5 = var2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    ds.Aresta var3 = var0.primeiroListaAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(15);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var1.proxAdj((int)var6);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var9 = var0.retiraAresta((int)var6, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var1.listaAdjVazia((int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(15);
    ds.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Aresta var9 = var4.proxAdj((int)var8);
    ds.Grafo var10 = new ds.Grafo();
    ds.Grafo var11 = var10.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Aresta var13 = var10.primeiroListaAdj((int)var12);
    var0.insereAresta((int)var2, (int)var8, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var3.primeiroListaAdj((int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var6 = var3.proxAdj((int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var4 = var0.proxAdj((int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var0.listaAdjVazia((int)var3);
    boolean var5 = var0.existeAresta((int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    boolean var5 = var4.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.primeiroListaAdj((int)var3);
    java.lang.Integer var5 = new java.lang.Integer(10);
    ds.Aresta var6 = var0.retiraAresta((int)var3, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var2.proxAdj((int)var4);
    ds.Aresta var6 = var3.primeiroListaAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var3.listaAdjVazia((int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    boolean var7 = var3.listaAdjVazia((int)var6);
    ds.Grafo var8 = new ds.Grafo();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Aresta var11 = var8.primeiroListaAdj((int)var10);
    boolean var12 = var0.existeAresta((int)var6, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(15);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(15);
    ds.Aresta var9 = var6.retiraAresta((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Grafo var11 = new ds.Grafo();
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Aresta var13 = var11.primeiroListaAdj((int)var12);
    var1.insereAresta((int)var8, (int)var10, (int)var12);
    ds.Grafo var15 = new ds.Grafo();
    ds.Grafo var16 = var15.grafoTransposto();
    ds.Grafo var17 = var16.grafoTransposto();
    ds.Grafo var18 = var16.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Aresta var20 = var18.primeiroListaAdj((int)var19);
    boolean var21 = var0.existeAresta((int)var8, (int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var2.proxAdj((int)var4);
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(15);
    ds.Aresta var9 = var6.retiraAresta((int)var7, (int)var8);
    ds.Grafo var10 = var6.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Aresta var12 = var6.proxAdj((int)var11);
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(0);
    boolean var15 = var13.listaAdjVazia((int)var14);
    java.lang.Integer var16 = new java.lang.Integer(100);
    var2.insereAresta((int)var11, (int)var14, (int)var16);
    ds.Grafo var18 = new ds.Grafo();
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(15);
    ds.Aresta var21 = var18.retiraAresta((int)var19, (int)var20);
    ds.Grafo var22 = var18.grafoTransposto();
    java.lang.Integer var23 = new java.lang.Integer(1);
    ds.Aresta var24 = var18.proxAdj((int)var23);
    ds.Aresta var25 = var2.primeiroListaAdj((int)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var1.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var3.primeiroListaAdj((int)var4);
    ds.Grafo var6 = var3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = new ds.Grafo();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var4.primeiroListaAdj((int)var6);
    ds.Aresta var8 = var2.proxAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(15);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    ds.Grafo var4 = new ds.Grafo();
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(15);
    ds.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
    ds.Grafo var8 = new ds.Grafo();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Aresta var12 = var9.proxAdj((int)var11);
    ds.Aresta var13 = var0.retiraAresta((int)var6, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    ds.Grafo var3 = var2.grafoTransposto();
    ds.Grafo var4 = var3.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Aresta var6 = var3.proxAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    ds.Grafo var8 = var7.grafoTransposto();
    ds.Grafo var9 = new ds.Grafo();
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(15);
    ds.Aresta var12 = var9.retiraAresta((int)var10, (int)var11);
    boolean var13 = var8.listaAdjVazia((int)var11);
    boolean var14 = var0.existeAresta((int)var5, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = new ds.Grafo();
    ds.Grafo var4 = new ds.Grafo();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    ds.Grafo var9 = var8.grafoTransposto();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Aresta var12 = var9.proxAdj((int)var11);
    ds.Grafo var13 = new ds.Grafo();
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(15);
    ds.Aresta var16 = var13.retiraAresta((int)var14, (int)var15);
    ds.Grafo var17 = var13.grafoTransposto();
    ds.Grafo var18 = new ds.Grafo();
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(15);
    ds.Aresta var21 = var18.retiraAresta((int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    ds.Grafo var23 = new ds.Grafo();
    java.lang.Integer var24 = new java.lang.Integer(1);
    ds.Aresta var25 = var23.primeiroListaAdj((int)var24);
    var13.insereAresta((int)var20, (int)var22, (int)var24);
    boolean var27 = var6.existeAresta((int)var11, (int)var20);
    java.lang.Integer var28 = new java.lang.Integer(10);
    ds.Aresta var29 = var3.retiraAresta((int)var20, (int)var28);
    ds.Grafo var30 = new ds.Grafo();
    ds.Grafo var31 = var30.grafoTransposto();
    ds.Grafo var32 = var31.grafoTransposto();
    ds.Grafo var33 = var32.grafoTransposto();
    ds.Grafo var34 = new ds.Grafo();
    ds.Grafo var35 = var34.grafoTransposto();
    ds.Grafo var36 = var35.grafoTransposto();
    java.lang.Integer var37 = new java.lang.Integer(1);
    ds.Aresta var38 = var35.proxAdj((int)var37);
    ds.Grafo var39 = new ds.Grafo();
    java.lang.Integer var40 = new java.lang.Integer(1);
    java.lang.Integer var41 = new java.lang.Integer(15);
    ds.Aresta var42 = var39.retiraAresta((int)var40, (int)var41);
    ds.Grafo var43 = var39.grafoTransposto();
    ds.Grafo var44 = new ds.Grafo();
    java.lang.Integer var45 = new java.lang.Integer(1);
    java.lang.Integer var46 = new java.lang.Integer(15);
    ds.Aresta var47 = var44.retiraAresta((int)var45, (int)var46);
    java.lang.Integer var48 = new java.lang.Integer(0);
    ds.Grafo var49 = new ds.Grafo();
    java.lang.Integer var50 = new java.lang.Integer(1);
    ds.Aresta var51 = var49.primeiroListaAdj((int)var50);
    var39.insereAresta((int)var46, (int)var48, (int)var50);
    boolean var53 = var32.existeAresta((int)var37, (int)var46);
    boolean var54 = var0.existeAresta((int)var20, (int)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

}
