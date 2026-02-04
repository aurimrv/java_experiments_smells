package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test2() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

  }

  public void test3() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test5() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test7() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test10() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var3.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test11() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();

  }

  public void test14() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    var3.empilha((java.lang.Object)var6);
    int var8 = var6.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test16() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var1.empilha((java.lang.Object)var5);
    boolean var7 = var3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    int var8 = var5.tamanho();
    var0.empilha((java.lang.Object)var8);
    ds.Pilha var10 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    int var8 = var5.tamanho();
    var0.empilha((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    boolean var9 = var7.vazia();
    int var10 = var7.tamanho();
    var1.empilha((java.lang.Object)var7);
    ds.Pilha var12 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var5.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1+ "'", var9.equals(1));

  }

  public void test24() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();

  }

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var1.empilha((java.lang.Object)var4);
    int var6 = var3.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    boolean var9 = var7.vazia();
    int var10 = var7.tamanho();
    var1.empilha((java.lang.Object)var7);
    boolean var12 = var1.vazia();
    var7.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var0.desempilha();
    int var10 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    java.lang.Integer var9 = new java.lang.Integer(100);
    var6.empilha((java.lang.Object)var9);
    ds.Pilha var11 = new ds.Pilha();
    java.lang.Integer var12 = new java.lang.Integer(1);
    var11.empilha((java.lang.Object)var12);
    var6.empilha((java.lang.Object)var11);
    java.lang.Object var15 = var6.desempilha();
    var1.empilha((java.lang.Object)var6);
    boolean var17 = var11.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var0.desempilha();
    int var10 = var0.tamanho();
    ds.Pilha var11 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test32() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var0.desempilha();
    int var10 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    boolean var9 = var7.vazia();
    int var10 = var7.tamanho();
    var1.empilha((java.lang.Object)var7);
    boolean var12 = var1.vazia();
    int var13 = var1.tamanho();
    boolean var14 = var7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    var3.empilha((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var6.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Integer var2 = new java.lang.Integer(1);
    var1.empilha((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var6);
    java.lang.Object var10 = var1.desempilha();
    var0.empilha(var10);
    ds.Pilha var12 = new ds.Pilha();

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Integer var2 = new java.lang.Integer(1);
    var1.empilha((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var6);
    java.lang.Object var10 = var1.desempilha();
    var0.empilha(var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    boolean var16 = var15.vazia();
    boolean var17 = var15.vazia();
    var13.empilha((java.lang.Object)var17);
    ds.Pilha var19 = new ds.Pilha();
    boolean var20 = var19.vazia();
    boolean var21 = var19.vazia();
    int var22 = var19.tamanho();
    var13.empilha((java.lang.Object)var19);
    boolean var24 = var13.vazia();
    int var25 = var13.tamanho();
    var0.empilha((java.lang.Object)var13);
    int var27 = var19.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test37() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Integer var2 = new java.lang.Integer(1);
    var1.empilha((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var6);
    java.lang.Object var10 = var1.desempilha();
    var0.empilha(var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    boolean var16 = var15.vazia();
    boolean var17 = var15.vazia();
    var13.empilha((java.lang.Object)var17);
    ds.Pilha var19 = new ds.Pilha();
    boolean var20 = var19.vazia();
    boolean var21 = var19.vazia();
    int var22 = var19.tamanho();
    var13.empilha((java.lang.Object)var19);
    boolean var24 = var13.vazia();
    int var25 = var13.tamanho();
    var0.empilha((java.lang.Object)var13);
    ds.Pilha var27 = new ds.Pilha();
    ds.Pilha var28 = new ds.Pilha();
    java.lang.Integer var29 = new java.lang.Integer(1);
    var28.empilha((java.lang.Object)var29);
    java.lang.Integer var31 = new java.lang.Integer(100);
    var28.empilha((java.lang.Object)var31);
    ds.Pilha var33 = new ds.Pilha();
    java.lang.Integer var34 = new java.lang.Integer(1);
    var33.empilha((java.lang.Object)var34);
    var28.empilha((java.lang.Object)var33);
    java.lang.Object var37 = var28.desempilha();
    var27.empilha(var37);
    var13.empilha((java.lang.Object)var27);
    ds.Pilha var40 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);

  }

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    var0.empilha((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Integer var4 = new java.lang.Integer(1);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(100);
    var3.empilha((java.lang.Object)var6);
    ds.Pilha var8 = new ds.Pilha();
    java.lang.Integer var9 = new java.lang.Integer(1);
    var8.empilha((java.lang.Object)var9);
    var3.empilha((java.lang.Object)var8);
    java.lang.Object var12 = var3.desempilha();
    var2.empilha(var12);
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Long var3 = new java.lang.Long(10L);
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    var0.empilha((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    java.lang.Integer var9 = new java.lang.Integer(100);
    var6.empilha((java.lang.Object)var9);
    ds.Pilha var11 = new ds.Pilha();
    java.lang.Integer var12 = new java.lang.Integer(1);
    var11.empilha((java.lang.Object)var12);
    var6.empilha((java.lang.Object)var11);
    java.lang.Object var15 = var6.desempilha();
    var1.empilha((java.lang.Object)var6);
    int var17 = var6.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float(1.0f);
    var0.empilha((java.lang.Object)var1);

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    boolean var9 = var7.vazia();
    int var10 = var7.tamanho();
    var1.empilha((java.lang.Object)var7);
    ds.Pilha var12 = new ds.Pilha();
    java.lang.Character var13 = new java.lang.Character(' ');
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    boolean var16 = var15.vazia();
    var12.empilha((java.lang.Object)var15);
    ds.Pilha var18 = new ds.Pilha();
    var15.empilha((java.lang.Object)var18);
    var1.empilha((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Character var2 = new java.lang.Character(' ');
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var4.empilha((java.lang.Object)var7);
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var0.desempilha();
    ds.Pilha var10 = new ds.Pilha();
    int var11 = var10.tamanho();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var13 = new ds.Pilha();
    boolean var14 = var13.vazia();
    boolean var15 = var13.vazia();
    int var16 = var13.tamanho();
    ds.Pilha var17 = new ds.Pilha();
    var13.empilha((java.lang.Object)var17);
    ds.Pilha var19 = new ds.Pilha();
    boolean var20 = var19.vazia();
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    var19.empilha((java.lang.Object)var21);
    var17.empilha((java.lang.Object)var21);
    var0.empilha((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var0.desempilha();
    boolean var10 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var1.tamanho();
    int var4 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Character var5 = new java.lang.Character(' ');
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    var4.empilha((java.lang.Object)var7);
    int var10 = var4.tamanho();
    int var11 = var4.tamanho();
    boolean var12 = var4.vazia();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    var6.empilha((java.lang.Object)var8);
    var4.empilha((java.lang.Object)var8);
    java.lang.Object var11 = new java.lang.Object();
    var4.empilha(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Integer var2 = new java.lang.Integer(1);
    var1.empilha((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var6);
    java.lang.Object var10 = var1.desempilha();
    var0.empilha(var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    boolean var16 = var15.vazia();
    boolean var17 = var15.vazia();
    var13.empilha((java.lang.Object)var17);
    ds.Pilha var19 = new ds.Pilha();
    boolean var20 = var19.vazia();
    boolean var21 = var19.vazia();
    int var22 = var19.tamanho();
    var13.empilha((java.lang.Object)var19);
    boolean var24 = var13.vazia();
    int var25 = var13.tamanho();
    var0.empilha((java.lang.Object)var13);
    ds.Pilha var27 = new ds.Pilha();
    ds.Pilha var28 = new ds.Pilha();
    java.lang.Integer var29 = new java.lang.Integer(1);
    var28.empilha((java.lang.Object)var29);
    java.lang.Integer var31 = new java.lang.Integer(100);
    var28.empilha((java.lang.Object)var31);
    ds.Pilha var33 = new ds.Pilha();
    java.lang.Integer var34 = new java.lang.Integer(1);
    var33.empilha((java.lang.Object)var34);
    var28.empilha((java.lang.Object)var33);
    java.lang.Object var37 = var28.desempilha();
    var27.empilha(var37);
    var13.empilha((java.lang.Object)var27);
    ds.Pilha var40 = new ds.Pilha();
    var13.empilha((java.lang.Object)var40);
    boolean var42 = var40.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Character var7 = new java.lang.Character(' ');
    var6.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    var6.empilha((java.lang.Object)var9);
    int var12 = var6.tamanho();
    int var13 = var6.tamanho();
    java.lang.Object var14 = var6.desempilha();
    var3.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    java.lang.Byte var4 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test56() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    int var10 = var9.tamanho();
    var5.empilha((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var9.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test57() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test58() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Integer var6 = new java.lang.Integer(1);
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var9 = var0.desempilha();
    java.lang.Object var10 = var0.desempilha();
    boolean var11 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 100+ "'", var10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test59() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    java.lang.Character var2 = new java.lang.Character('#');
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test60() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Integer var2 = new java.lang.Integer(1);
    var1.empilha((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    var1.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Integer var7 = new java.lang.Integer(1);
    var6.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var6);
    java.lang.Object var10 = var1.desempilha();
    var0.empilha(var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    boolean var16 = var15.vazia();
    boolean var17 = var15.vazia();
    var13.empilha((java.lang.Object)var17);
    ds.Pilha var19 = new ds.Pilha();
    boolean var20 = var19.vazia();
    boolean var21 = var19.vazia();
    int var22 = var19.tamanho();
    var13.empilha((java.lang.Object)var19);
    boolean var24 = var13.vazia();
    int var25 = var13.tamanho();
    var0.empilha((java.lang.Object)var13);
    ds.Pilha var27 = new ds.Pilha();
    ds.Pilha var28 = new ds.Pilha();
    java.lang.Integer var29 = new java.lang.Integer(1);
    var28.empilha((java.lang.Object)var29);
    java.lang.Integer var31 = new java.lang.Integer(100);
    var28.empilha((java.lang.Object)var31);
    ds.Pilha var33 = new ds.Pilha();
    java.lang.Integer var34 = new java.lang.Integer(1);
    var33.empilha((java.lang.Object)var34);
    var28.empilha((java.lang.Object)var33);
    java.lang.Object var37 = var28.desempilha();
    var27.empilha(var37);
    var13.empilha((java.lang.Object)var27);
    java.lang.Object var40 = var27.desempilha();
    ds.Pilha var41 = new ds.Pilha();
    ds.Pilha var42 = new ds.Pilha();
    var41.empilha((java.lang.Object)var42);
    var27.empilha((java.lang.Object)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);

  }

  public void test61() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test62() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    var3.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var4.empilha((java.lang.Object)var8);
    ds.Pilha var10 = new ds.Pilha();
    boolean var11 = var10.vazia();
    boolean var12 = var10.vazia();
    int var13 = var10.tamanho();
    var4.empilha((java.lang.Object)var10);
    java.lang.Object var15 = var4.desempilha();
    var0.empilha(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test63() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    boolean var9 = var7.vazia();
    int var10 = var7.tamanho();
    var1.empilha((java.lang.Object)var7);
    boolean var12 = var1.vazia();
    boolean var13 = var1.vazia();
    java.lang.Object var14 = var1.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test64() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test65() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    int var6 = var0.tamanho();
    int var7 = var0.tamanho();
    boolean var8 = var0.vazia();
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    int var12 = var9.tamanho();
    ds.Pilha var13 = new ds.Pilha();
    var9.empilha((java.lang.Object)var13);
    var0.empilha((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test66() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    int var4 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

}
