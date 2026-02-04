package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    boolean var2 = var0.listaAdjVazia((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer((-1));
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
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Aresta var4 = var0.proxAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test4() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.listaAdjVazia((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

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

  public void test6() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    var0.insereAresta((int)var1, (int)var1, (int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    boolean var5 = var4.existeAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test8() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    boolean var6 = var5.listaAdjVazia((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test11() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(2);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
    ds.Grafo var8 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test12() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test13() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(2);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Aresta var9 = var4.proxAdj((int)var8);
    ds.Grafo var10 = var4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test14() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    java.lang.Integer var5 = new java.lang.Integer(2);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var4.retiraAresta((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Aresta var9 = var4.proxAdj((int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test15() throws Throwable {

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

  public void test16() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    var1.imprime();

  }

  public void test17() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(2);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Aresta var5 = var1.proxAdj((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test18() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(2);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Aresta var6 = var1.proxAdj((int)var5);
    ds.Aresta var7 = var1.retiraAresta((int)var5, (int)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test19() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(2);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test20() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Aresta var8 = var7.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test21() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Aresta var8 = var7.retiraAresta((int)var2, (int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test22() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var6.grafoTransposto();
    ds.Aresta var9 = var8.primeiroListaAdj((int)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test23() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = var6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    boolean var2 = var0.listaAdjVazia((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test25() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    var0.imprime();

  }

  public void test26() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(79);
    java.lang.Integer var3 = new java.lang.Integer(1);
    boolean var4 = var1.existeAresta((int)var2, (int)var3);
    ds.Grafo var5 = var1.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(2);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Aresta var8 = var5.retiraAresta((int)var6, (int)var7);
    ds.Grafo var9 = new ds.Grafo();
    ds.Grafo var10 = var9.grafoTransposto();
    java.lang.Integer var11 = new java.lang.Integer(2);
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Aresta var13 = var10.retiraAresta((int)var11, (int)var12);
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(79);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var14.existeAresta((int)var15, (int)var16);
    ds.Grafo var18 = var14.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(2);
    java.lang.Integer var20 = new java.lang.Integer(1);
    ds.Aresta var21 = var18.retiraAresta((int)var19, (int)var20);
    var0.insereAresta((int)var6, (int)var11, (int)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test27() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(2);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    ds.Grafo var5 = new ds.Grafo();
    ds.Grafo var6 = var5.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(2);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Aresta var9 = var6.retiraAresta((int)var7, (int)var8);
    ds.Aresta var10 = var0.retiraAresta((int)var3, (int)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test28() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Aresta var2 = var0.primeiroListaAdj((int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();

  }

  public void test30() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(2);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    ds.Aresta var6 = var0.primeiroListaAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test31() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(2);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Aresta var3 = var0.retiraAresta((int)var1, (int)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var0.proxAdj((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test32() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    java.lang.Integer var2 = new java.lang.Integer(2);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Aresta var6 = var1.proxAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(10);
    var0.insereAresta((int)var5, (int)var9, (int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test33() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var2.retiraAresta((int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Aresta var7 = var0.retiraAresta((int)var4, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test34() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Grafo var2 = new ds.Grafo();
    java.lang.Integer var3 = new java.lang.Integer(79);
    java.lang.Integer var4 = new java.lang.Integer(1);
    boolean var5 = var2.existeAresta((int)var3, (int)var4);
    ds.Grafo var6 = var2.grafoTransposto();
    java.lang.Integer var7 = new java.lang.Integer(2);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Aresta var9 = var6.retiraAresta((int)var7, (int)var8);
    boolean var10 = var0.existeAresta((int)var1, (int)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test35() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(10);
    ds.Grafo var4 = new ds.Grafo();
    ds.Grafo var5 = var4.grafoTransposto();
    java.lang.Integer var6 = new java.lang.Integer(2);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Aresta var8 = var5.retiraAresta((int)var6, (int)var7);
    boolean var9 = var2.existeAresta((int)var3, (int)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test36() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = var0.grafoTransposto();

  }

  public void test37() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    ds.Grafo var11 = var7.grafoTransposto();
    ds.Grafo var12 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test38() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Aresta var12 = var7.proxAdj((int)var11);
    ds.Grafo var13 = new ds.Grafo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test39() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Aresta var12 = var7.proxAdj((int)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test40() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var2.retiraAresta((int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Aresta var7 = var2.proxAdj((int)var6);
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(2);
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Aresta var11 = var8.retiraAresta((int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Aresta var13 = var8.proxAdj((int)var12);
    ds.Aresta var14 = var0.retiraAresta((int)var6, (int)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test41() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = new ds.Grafo();
    ds.Grafo var2 = var1.grafoTransposto();
    java.lang.Integer var3 = new java.lang.Integer(2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Aresta var5 = var2.retiraAresta((int)var3, (int)var4);
    boolean var6 = var0.listaAdjVazia((int)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test42() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    ds.Grafo var11 = var7.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(2);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Aresta var14 = var11.retiraAresta((int)var12, (int)var13);
    boolean var15 = var11.listaAdjVazia((int)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test43() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    ds.Grafo var11 = var7.grafoTransposto();
    ds.Grafo var12 = new ds.Grafo();
    ds.Grafo var13 = var12.grafoTransposto();
    java.lang.Integer var14 = new java.lang.Integer(2);
    java.lang.Integer var15 = new java.lang.Integer(1);
    ds.Aresta var16 = var13.retiraAresta((int)var14, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    ds.Aresta var18 = var13.proxAdj((int)var17);
    ds.Grafo var19 = new ds.Grafo();
    java.lang.Integer var20 = new java.lang.Integer(2);
    java.lang.Integer var21 = new java.lang.Integer(1);
    ds.Aresta var22 = var19.retiraAresta((int)var20, (int)var21);
    boolean var23 = var11.existeAresta((int)var17, (int)var21);
    var11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test44() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var4.grafoTransposto();
    ds.Grafo var6 = new ds.Grafo();
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.Aresta var8 = var6.proxAdj((int)var7);
    boolean var9 = var5.listaAdjVazia((int)var7);
    ds.Grafo var10 = new ds.Grafo();
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Aresta var12 = var10.proxAdj((int)var11);
    ds.Grafo var13 = new ds.Grafo();
    ds.Grafo var14 = new ds.Grafo();
    java.lang.Integer var15 = new java.lang.Integer(79);
    java.lang.Integer var16 = new java.lang.Integer(1);
    boolean var17 = var14.existeAresta((int)var15, (int)var16);
    ds.Grafo var18 = var14.grafoTransposto();
    java.lang.Integer var19 = new java.lang.Integer(2);
    java.lang.Integer var20 = new java.lang.Integer(1);
    ds.Aresta var21 = var18.retiraAresta((int)var19, (int)var20);
    boolean var22 = var13.listaAdjVazia((int)var20);
    boolean var23 = var5.existeAresta((int)var11, (int)var20);
    ds.Grafo var24 = var5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test45() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    ds.Grafo var11 = var7.grafoTransposto();
    java.lang.Integer var12 = new java.lang.Integer(2);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Aresta var14 = var11.retiraAresta((int)var12, (int)var13);
    ds.Grafo var15 = var11.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test46() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    ds.Grafo var2 = new ds.Grafo();
    ds.Grafo var3 = new ds.Grafo();
    java.lang.Integer var4 = new java.lang.Integer(79);
    java.lang.Integer var5 = new java.lang.Integer(1);
    boolean var6 = var3.existeAresta((int)var4, (int)var5);
    ds.Grafo var7 = var3.grafoTransposto();
    java.lang.Integer var8 = new java.lang.Integer(2);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Aresta var10 = var7.retiraAresta((int)var8, (int)var9);
    boolean var11 = var2.listaAdjVazia((int)var9);
    ds.Aresta var12 = var0.proxAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test47() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(0);
    ds.Aresta var2 = var0.proxAdj((int)var1);
    ds.Grafo var3 = var0.grafoTransposto();
    ds.Grafo var4 = var0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test48() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    java.lang.Integer var1 = new java.lang.Integer(79);
    java.lang.Integer var2 = new java.lang.Integer(1);
    boolean var3 = var0.existeAresta((int)var1, (int)var2);
    ds.Grafo var4 = var0.grafoTransposto();
    ds.Grafo var5 = var0.grafoTransposto();
    ds.Grafo var6 = var0.grafoTransposto();
    ds.Grafo var7 = var6.grafoTransposto();
    ds.Grafo var8 = new ds.Grafo();
    java.lang.Integer var9 = new java.lang.Integer(79);
    java.lang.Integer var10 = new java.lang.Integer(1);
    boolean var11 = var8.existeAresta((int)var9, (int)var10);
    ds.Aresta var12 = var6.proxAdj((int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test49() throws Throwable {

    ds.Grafo var0 = new ds.Grafo();
    ds.Grafo var1 = var0.grafoTransposto();
    java.lang.Integer var2 = new java.lang.Integer(2);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Aresta var4 = var1.retiraAresta((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Aresta var6 = var1.proxAdj((int)var5);
    ds.Grafo var7 = new ds.Grafo();
    java.lang.Integer var8 = new java.lang.Integer(79);
    java.lang.Integer var9 = new java.lang.Integer(1);
    boolean var10 = var7.existeAresta((int)var8, (int)var9);
    ds.Grafo var11 = var7.grafoTransposto();
    ds.Grafo var12 = var7.grafoTransposto();
    ds.Grafo var13 = var7.grafoTransposto();
    ds.Grafo var14 = var13.grafoTransposto();
    java.lang.Integer var15 = new java.lang.Integer(2);
    java.lang.Integer var16 = new java.lang.Integer(1);
    ds.Aresta var17 = var14.retiraAresta((int)var15, (int)var16);
    ds.Grafo var18 = var14.grafoTransposto();
    ds.Grafo var19 = new ds.Grafo();
    ds.Grafo var20 = var19.grafoTransposto();
    java.lang.Integer var21 = new java.lang.Integer(2);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Aresta var23 = var20.retiraAresta((int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(1);
    ds.Aresta var25 = var20.proxAdj((int)var24);
    ds.Grafo var26 = new ds.Grafo();
    java.lang.Integer var27 = new java.lang.Integer(79);
    java.lang.Integer var28 = new java.lang.Integer(1);
    boolean var29 = var26.existeAresta((int)var27, (int)var28);
    ds.Grafo var30 = var26.grafoTransposto();
    ds.Grafo var31 = var26.grafoTransposto();
    ds.Grafo var32 = var26.grafoTransposto();
    ds.Grafo var33 = var32.grafoTransposto();
    java.lang.Integer var34 = new java.lang.Integer(2);
    java.lang.Integer var35 = new java.lang.Integer(1);
    ds.Aresta var36 = var33.retiraAresta((int)var34, (int)var35);
    ds.Grafo var37 = var33.grafoTransposto();
    java.lang.Integer var38 = new java.lang.Integer(2);
    java.lang.Integer var39 = new java.lang.Integer(1);
    ds.Aresta var40 = var37.retiraAresta((int)var38, (int)var39);
    ds.Aresta var41 = var14.retiraAresta((int)var24, (int)var39);
    ds.Grafo var42 = new ds.Grafo();
    java.lang.Integer var43 = new java.lang.Integer(79);
    java.lang.Integer var44 = new java.lang.Integer(1);
    boolean var45 = var42.existeAresta((int)var43, (int)var44);
    ds.Grafo var46 = var42.grafoTransposto();
    ds.Grafo var47 = var42.grafoTransposto();
    ds.Grafo var48 = var42.grafoTransposto();
    ds.Grafo var49 = var48.grafoTransposto();
    java.lang.Integer var50 = new java.lang.Integer(2);
    java.lang.Integer var51 = new java.lang.Integer(1);
    ds.Aresta var52 = var49.retiraAresta((int)var50, (int)var51);
    ds.Grafo var53 = var49.grafoTransposto();
    ds.Grafo var54 = new ds.Grafo();
    ds.Grafo var55 = var54.grafoTransposto();
    java.lang.Integer var56 = new java.lang.Integer(2);
    java.lang.Integer var57 = new java.lang.Integer(1);
    ds.Aresta var58 = var55.retiraAresta((int)var56, (int)var57);
    java.lang.Integer var59 = new java.lang.Integer(1);
    ds.Aresta var60 = var55.proxAdj((int)var59);
    ds.Grafo var61 = new ds.Grafo();
    java.lang.Integer var62 = new java.lang.Integer(79);
    java.lang.Integer var63 = new java.lang.Integer(1);
    boolean var64 = var61.existeAresta((int)var62, (int)var63);
    ds.Grafo var65 = var61.grafoTransposto();
    ds.Grafo var66 = var61.grafoTransposto();
    ds.Grafo var67 = var61.grafoTransposto();
    ds.Grafo var68 = var67.grafoTransposto();
    java.lang.Integer var69 = new java.lang.Integer(2);
    java.lang.Integer var70 = new java.lang.Integer(1);
    ds.Aresta var71 = var68.retiraAresta((int)var69, (int)var70);
    ds.Grafo var72 = var68.grafoTransposto();
    java.lang.Integer var73 = new java.lang.Integer(2);
    java.lang.Integer var74 = new java.lang.Integer(1);
    ds.Aresta var75 = var72.retiraAresta((int)var73, (int)var74);
    ds.Aresta var76 = var49.retiraAresta((int)var59, (int)var74);
    boolean var77 = var1.existeAresta((int)var24, (int)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

}
