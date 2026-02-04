package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var2, (int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.insereAresta((int)var2, (int)var3, (int)var4);

  }

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    ds.Grafo var6 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    var1.insereAresta((int)var3, (int)var3, (int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(99);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var1.retiraAresta((int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var0.retiraAresta((int)var3, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    boolean var5 = var0.listaAdjVazia((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Aresta var3 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test15() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(99);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(99);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(57);
    ds.Aresta var3 = var0.proxAdj((int)var2);
    ds.Aresta var4 = var1.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(57);
    ds.Aresta var3 = var0.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(99);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Aresta var10 = var6.retiraAresta((int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insereAresta((int)var1, (int)var3, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.listaAdjVazia((int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    ds.Aresta var5 = var1.primeiroListaAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Aresta var7 = var2.proxAdj((int)var6);
    ds.Aresta var8 = var1.primeiroListaAdj((int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(57);
    ds.Aresta var3 = var1.proxAdj((int)var2);
    boolean var4 = var1.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(57);
    ds.Aresta var3 = var1.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(99);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var1.retiraAresta((int)var3, (int)var4);
    ds.Grafo var6 = new ds.Grafo();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(99);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    ds.Aresta var11 = var0.retiraAresta((int)var3, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(10);
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var3.retiraAresta((int)var4, (int)var5);
    boolean var7 = var0.existeAresta((int)var1, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    var1.imprime();

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    var5.imprime();
    java.lang.Integer var7 = new java.lang.Integer(99);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Aresta var9 = var5.retiraAresta((int)var7, (int)var8);
    ds.Aresta var10 = var0.primeiroListaAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(99);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Aresta var6 = var3.retiraAresta((int)var4, (int)var5);
    ds.Aresta var7 = var1.primeiroListaAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = var2.grafoTransposto();
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(10);
    boolean var6 = var3.existeAresta((int)var4, (int)var5);
    boolean var7 = var1.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    java.lang.Integer var2 = new java.lang.Integer(99);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Aresta var4 = var0.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    ds.Grafo var6 = var5.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    ds.Grafo var8 = var7.grafoTransposto();
    java.lang.Integer var9 = new java.lang.Integer(99);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Aresta var11 = var8.retiraAresta((int)var9, (int)var10);
    ds.Grafo var12 = new ds.Grafo();
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(99);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Aresta var16 = var12.retiraAresta((int)var14, (int)var15);
    boolean var17 = var5.existeAresta((int)var9, (int)var15);
    ds.Aresta var18 = var0.primeiroListaAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(99);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Aresta var5 = var1.retiraAresta((int)var3, (int)var4);
    boolean var6 = var0.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(0);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Aresta var7 = var2.proxAdj((int)var6);
    ds.Grafo var8 = new ds.Grafo();
    ds.Grafo var9 = var8.grafoTransposto();
    java.lang.Integer var10 = new java.lang.Integer(99);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Aresta var12 = var9.retiraAresta((int)var10, (int)var11);
    ds.Aresta var13 = var0.retiraAresta((int)var6, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

}
