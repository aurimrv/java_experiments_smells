package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

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

  public void test2() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test3() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test5() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var5 = var0.desempilha();
    var0.empilha(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10+ "'", var5.equals(10));

  }

  public void test7() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.empilha((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var5 = var0.desempilha();
    int var6 = var0.tamanho();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10+ "'", var5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test10() throws Throwable {

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

  public void test11() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var8 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
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
    assertTrue(var2 == 0);

  }

  public void test13() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

  }

  public void test14() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    var1.empilha((java.lang.Object)var5);
    java.lang.Object var8 = var1.desempilha();
    var4.empilha(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)0+ "'", var8.equals((short)0));

  }

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test16() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    var1.empilha((java.lang.Object)var5);
    java.lang.Object var8 = var1.desempilha();
    int var9 = var1.tamanho();
    var4.empilha(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)0+ "'", var8.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Short var4 = new java.lang.Short((short)0);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var6);
    java.lang.Object var9 = var3.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10+ "'", var9.equals(10));

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Short var4 = new java.lang.Short((short)0);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var6);
    boolean var9 = var0.vazia();
    ds.Pilha var10 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Short var4 = new java.lang.Short((short)0);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var6);
    boolean var9 = var0.vazia();
    int var10 = var0.tamanho();
    var3.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test24() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    int var12 = var4.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    boolean var21 = var16.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    java.lang.Object var21 = var13.desempilha();
    boolean var22 = var16.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    java.lang.Object var21 = var13.desempilha();
    int var22 = var13.tamanho();
    boolean var23 = var16.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    java.lang.Object var21 = var13.desempilha();
    int var22 = var13.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    int var6 = var5.tamanho();
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var8 = new ds.Pilha();
    java.lang.Short var9 = new java.lang.Short((short)0);
    var8.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    java.lang.Object var12 = var5.desempilha();
    int var13 = var5.tamanho();
    var0.empilha((java.lang.Object)var13);
    int var15 = var8.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (short)0+ "'", var12.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test32() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    int var6 = var5.tamanho();
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var8 = new ds.Pilha();
    java.lang.Short var9 = new java.lang.Short((short)0);
    var8.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    java.lang.Object var12 = var5.desempilha();
    int var13 = var5.tamanho();
    var0.empilha((java.lang.Object)var13);
    boolean var15 = var0.vazia();
    ds.Pilha var16 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (short)0+ "'", var12.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    int var6 = var5.tamanho();
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var8 = new ds.Pilha();
    java.lang.Short var9 = new java.lang.Short((short)0);
    var8.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    java.lang.Object var12 = var5.desempilha();
    int var13 = var5.tamanho();
    var0.empilha((java.lang.Object)var13);
    boolean var15 = var0.vazia();
    int var16 = var0.tamanho();
    ds.Pilha var17 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (short)0+ "'", var12.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var3.empilha((java.lang.Object)var5);
    var0.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    ds.Pilha var3 = new ds.Pilha();
    int var4 = var3.tamanho();
    var2.empilha((java.lang.Object)var4);
    ds.Pilha var6 = new ds.Pilha();
    ds.Pilha var7 = new ds.Pilha();
    int var8 = var7.tamanho();
    var6.empilha((java.lang.Object)var7);
    ds.Pilha var10 = new ds.Pilha();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var10.empilha((java.lang.Object)var11);
    var7.empilha((java.lang.Object)var11);
    java.lang.Object var14 = var7.desempilha();
    int var15 = var7.tamanho();
    var2.empilha((java.lang.Object)var15);
    boolean var17 = var2.vazia();
    int var18 = var2.tamanho();
    var0.empilha((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)0+ "'", var14.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);

  }

  public void test37() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)0+ "'", var3.equals((short)0));

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    var1.empilha((java.lang.Object)var5);
    java.lang.Object var8 = var1.desempilha();
    int var9 = var1.tamanho();
    int var10 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)0+ "'", var8.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    java.lang.Object var21 = var13.desempilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var13.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Short var4 = new java.lang.Short((short)0);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var3.desempilha();
    int var9 = var3.tamanho();
    var0.empilha((java.lang.Object)var3);
    java.lang.Double var11 = new java.lang.Double(100.0d);
    var3.empilha((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    int var12 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    int var2 = var0.tamanho();
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    java.lang.Object var21 = var13.desempilha();
    java.lang.Double var22 = new java.lang.Double(100.0d);
    var13.empilha((java.lang.Object)var22);
    ds.Pilha var24 = new ds.Pilha();
    var13.empilha((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    java.lang.Integer var5 = new java.lang.Integer(0);
    var0.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Short var4 = new java.lang.Short((short)0);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var6);
    boolean var9 = var0.vazia();
    int var10 = var0.tamanho();
    java.lang.Object var11 = var0.desempilha();
    int var12 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    int var6 = var5.tamanho();
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var8 = new ds.Pilha();
    java.lang.Short var9 = new java.lang.Short((short)0);
    var8.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    java.lang.Object var12 = var5.desempilha();
    int var13 = var5.tamanho();
    var0.empilha((java.lang.Object)var13);
    boolean var15 = var0.vazia();
    int var16 = var0.tamanho();
    boolean var17 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (short)0+ "'", var12.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.String var1 = "hi!";
    var0.empilha((java.lang.Object)var1);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    ds.Pilha var21 = new ds.Pilha();
    boolean var22 = var21.vazia();
    var0.empilha((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Object var1 = new java.lang.Object();
    var0.empilha(var1);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Short var4 = new java.lang.Short((short)0);
    var3.empilha((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var3.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var3.desempilha();
    int var9 = var3.tamanho();
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var11 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test56() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Short var5 = new java.lang.Short((short)0);
    var4.empilha((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var4.empilha((java.lang.Object)var7);
    var1.empilha((java.lang.Object)var7);
    boolean var10 = var1.vazia();
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    int var14 = var13.tamanho();
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    java.lang.Short var17 = new java.lang.Short((short)0);
    var16.empilha((java.lang.Object)var17);
    var13.empilha((java.lang.Object)var17);
    var0.empilha((java.lang.Object)var13);
    ds.Pilha var21 = new ds.Pilha();
    ds.Pilha var22 = new ds.Pilha();
    var21.empilha((java.lang.Object)var22);
    var0.empilha((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test57() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    int var4 = var1.tamanho();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test58() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test59() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var1);

  }

  public void test60() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    int var7 = var6.tamanho();
    var5.empilha((java.lang.Object)var6);
    ds.Pilha var9 = new ds.Pilha();
    java.lang.Short var10 = new java.lang.Short((short)0);
    var9.empilha((java.lang.Object)var10);
    var6.empilha((java.lang.Object)var10);
    java.lang.Object var13 = var6.desempilha();
    int var14 = var6.tamanho();
    var1.empilha((java.lang.Object)var14);
    boolean var16 = var1.vazia();
    var0.empilha((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + (short)0+ "'", var13.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test61() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    int var5 = var0.tamanho();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Long var7 = new java.lang.Long(0L);
    var6.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();
    java.lang.Short var10 = new java.lang.Short((short)0);
    var9.empilha((java.lang.Object)var10);
    java.lang.Integer var12 = new java.lang.Integer(10);
    var9.empilha((java.lang.Object)var12);
    var6.empilha((java.lang.Object)var12);
    boolean var15 = var6.vazia();
    int var16 = var6.tamanho();
    var0.empilha((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

}
