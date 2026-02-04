package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
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
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0.0d+ "'", var3.equals(0.0d));

  }

  public void test3() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();

  }

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

  }

  public void test5() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var5);
    int var7 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);

  }

  public void test6() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test7() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var5);
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.0d+ "'", var5.equals(0.0d));

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
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    int var7 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(100.0d);
    var5.empilha((java.lang.Object)var7);
    boolean var9 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test13() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test14() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(100.0d);
    var5.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();
    int var10 = var9.tamanho();
    var5.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test16() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var5);
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var0.desempilha();
    int var10 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (byte)100+ "'", var9.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);

  }

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var5);
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (byte)100+ "'", var9.equals((byte)100));

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
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
    assertTrue(var3 == true);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(100.0d);
    var5.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();
    int var10 = var9.tamanho();
    var5.empilha((java.lang.Object)var10);
    boolean var12 = var5.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var9.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    boolean var6 = var4.vazia();
    boolean var7 = var4.vazia();
    var0.empilha((java.lang.Object)var4);
    int var9 = var4.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test24() throws Throwable {

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

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    java.lang.String var4 = "hi!";
    var0.empilha((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    java.lang.String var4 = "hi!";
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    var1.empilha((java.lang.Object)var9);
    int var11 = var9.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    var1.empilha((java.lang.Object)var9);
    ds.Pilha var11 = new ds.Pilha();
    int var12 = var11.tamanho();
    var9.empilha((java.lang.Object)var11);
    ds.Pilha var14 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    var1.empilha((java.lang.Object)var9);
    ds.Pilha var11 = new ds.Pilha();
    int var12 = var11.tamanho();
    var9.empilha((java.lang.Object)var11);
    java.lang.Object var14 = var9.desempilha();
    var11.empilha(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    boolean var4 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var2.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var2);
    boolean var11 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test32() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var13 = new ds.Pilha();
    var5.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    int var16 = var15.tamanho();
    var13.empilha((java.lang.Object)var15);
    java.lang.Object var18 = var13.desempilha();
    var0.empilha(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var15.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var5.empilha((java.lang.Object)var6);
    ds.Pilha var10 = new ds.Pilha();
    boolean var11 = var10.vazia();
    boolean var12 = var10.vazia();
    var6.empilha((java.lang.Object)var10);
    ds.Pilha var14 = new ds.Pilha();
    var6.empilha((java.lang.Object)var14);
    ds.Pilha var16 = new ds.Pilha();
    int var17 = var16.tamanho();
    var14.empilha((java.lang.Object)var16);
    java.lang.Object var19 = var14.desempilha();
    var1.empilha(var19);
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var16.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    boolean var4 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var2.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var11 = new ds.Pilha();
    ds.Pilha var12 = new ds.Pilha();
    java.lang.Double var13 = new java.lang.Double(0.0d);
    var12.empilha((java.lang.Object)var13);
    var11.empilha((java.lang.Object)var13);
    ds.Pilha var16 = new ds.Pilha();
    var11.empilha((java.lang.Object)var16);
    var2.empilha((java.lang.Object)var11);
    ds.Pilha var19 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var5.empilha((java.lang.Object)var6);
    ds.Pilha var10 = new ds.Pilha();
    boolean var11 = var10.vazia();
    boolean var12 = var10.vazia();
    var6.empilha((java.lang.Object)var10);
    ds.Pilha var14 = new ds.Pilha();
    var6.empilha((java.lang.Object)var14);
    ds.Pilha var16 = new ds.Pilha();
    int var17 = var16.tamanho();
    var14.empilha((java.lang.Object)var16);
    java.lang.Object var19 = var14.desempilha();
    var1.empilha(var19);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var22 = new ds.Pilha();
    ds.Pilha var23 = new ds.Pilha();
    boolean var24 = var23.vazia();
    boolean var25 = var23.vazia();
    var22.empilha((java.lang.Object)var23);
    ds.Pilha var27 = new ds.Pilha();
    boolean var28 = var27.vazia();
    boolean var29 = var27.vazia();
    var23.empilha((java.lang.Object)var27);
    ds.Pilha var31 = new ds.Pilha();
    var23.empilha((java.lang.Object)var31);
    ds.Pilha var33 = new ds.Pilha();
    int var34 = var33.tamanho();
    var31.empilha((java.lang.Object)var33);
    java.lang.Object var36 = var31.desempilha();
    var0.empilha(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = var33.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test37() throws Throwable {

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

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var5.empilha((java.lang.Object)var6);
    ds.Pilha var10 = new ds.Pilha();
    boolean var11 = var10.vazia();
    boolean var12 = var10.vazia();
    var6.empilha((java.lang.Object)var10);
    ds.Pilha var14 = new ds.Pilha();
    var6.empilha((java.lang.Object)var14);
    ds.Pilha var16 = new ds.Pilha();
    int var17 = var16.tamanho();
    var14.empilha((java.lang.Object)var16);
    java.lang.Object var19 = var14.desempilha();
    var1.empilha(var19);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var22 = new ds.Pilha();
    ds.Pilha var23 = new ds.Pilha();
    boolean var24 = var23.vazia();
    boolean var25 = var23.vazia();
    var22.empilha((java.lang.Object)var23);
    ds.Pilha var27 = new ds.Pilha();
    boolean var28 = var27.vazia();
    boolean var29 = var27.vazia();
    var23.empilha((java.lang.Object)var27);
    ds.Pilha var31 = new ds.Pilha();
    var23.empilha((java.lang.Object)var31);
    ds.Pilha var33 = new ds.Pilha();
    int var34 = var33.tamanho();
    var31.empilha((java.lang.Object)var33);
    java.lang.Object var36 = var31.desempilha();
    var0.empilha(var36);
    ds.Pilha var38 = new ds.Pilha();
    boolean var39 = var38.vazia();
    boolean var40 = var38.vazia();
    boolean var41 = var38.vazia();
    ds.Pilha var42 = new ds.Pilha();
    ds.Pilha var43 = new ds.Pilha();
    boolean var44 = var43.vazia();
    boolean var45 = var43.vazia();
    var42.empilha((java.lang.Object)var43);
    ds.Pilha var47 = new ds.Pilha();
    boolean var48 = var47.vazia();
    boolean var49 = var47.vazia();
    var43.empilha((java.lang.Object)var47);
    ds.Pilha var51 = new ds.Pilha();
    var43.empilha((java.lang.Object)var51);
    ds.Pilha var53 = new ds.Pilha();
    int var54 = var53.tamanho();
    var51.empilha((java.lang.Object)var53);
    java.lang.Object var56 = var51.desempilha();
    var38.empilha(var56);
    var0.empilha(var56);
    boolean var59 = var53.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var2.empilha((java.lang.Object)var3);
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    var1.empilha((java.lang.Object)var6);
    java.lang.Double var8 = new java.lang.Double(100.0d);
    var6.empilha((java.lang.Object)var8);
    var0.empilha((java.lang.Object)var6);
    ds.Pilha var11 = new ds.Pilha();
    ds.Pilha var12 = new ds.Pilha();
    boolean var13 = var12.vazia();
    boolean var14 = var12.vazia();
    var11.empilha((java.lang.Object)var12);
    ds.Pilha var16 = new ds.Pilha();
    boolean var17 = var16.vazia();
    boolean var18 = var16.vazia();
    var12.empilha((java.lang.Object)var16);
    ds.Pilha var20 = new ds.Pilha();
    var12.empilha((java.lang.Object)var20);
    var0.empilha((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    ds.Pilha var7 = new ds.Pilha();
    ds.Pilha var8 = new ds.Pilha();
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    var8.empilha((java.lang.Object)var9);
    ds.Pilha var13 = new ds.Pilha();
    boolean var14 = var13.vazia();
    boolean var15 = var13.vazia();
    var9.empilha((java.lang.Object)var13);
    var7.empilha((java.lang.Object)var9);
    ds.Pilha var18 = new ds.Pilha();
    ds.Pilha var19 = new ds.Pilha();
    java.lang.Double var20 = new java.lang.Double(0.0d);
    var19.empilha((java.lang.Object)var20);
    var18.empilha((java.lang.Object)var20);
    ds.Pilha var23 = new ds.Pilha();
    var18.empilha((java.lang.Object)var23);
    var9.empilha((java.lang.Object)var18);
    var0.empilha((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    var1.empilha((java.lang.Object)var9);
    ds.Pilha var11 = new ds.Pilha();
    int var12 = var11.tamanho();
    var9.empilha((java.lang.Object)var11);
    java.lang.Object var14 = var9.desempilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var9.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var5 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1L+ "'", var5.equals(1L));

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100.0d+ "'", var3.equals(100.0d));

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(100.0d);
    var5.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();
    int var10 = var9.tamanho();
    var5.empilha((java.lang.Object)var10);
    boolean var12 = var5.vazia();
    boolean var13 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    boolean var6 = var4.vazia();
    boolean var7 = var4.vazia();
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var9 = new ds.Pilha();
    var4.empilha((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var4.empilha((java.lang.Object)var5);
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var13 = new ds.Pilha();
    var5.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    int var16 = var15.tamanho();
    var13.empilha((java.lang.Object)var15);
    java.lang.Object var18 = var13.desempilha();
    var0.empilha(var18);
    ds.Pilha var20 = new ds.Pilha();
    var0.empilha((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    boolean var4 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    var2.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var11 = var2.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Double var1 = new java.lang.Double(0.0d);
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.empilha((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var5);
    java.lang.Object var7 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0d+ "'", var7.equals(100.0d));

  }

  public void test56() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(100.0d);
    var5.empilha((java.lang.Object)var7);
    int var9 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test57() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    boolean var6 = var4.vazia();
    boolean var7 = var4.vazia();
    ds.Pilha var8 = new ds.Pilha();
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    var8.empilha((java.lang.Object)var9);
    ds.Pilha var13 = new ds.Pilha();
    boolean var14 = var13.vazia();
    boolean var15 = var13.vazia();
    var9.empilha((java.lang.Object)var13);
    ds.Pilha var17 = new ds.Pilha();
    var9.empilha((java.lang.Object)var17);
    ds.Pilha var19 = new ds.Pilha();
    int var20 = var19.tamanho();
    var17.empilha((java.lang.Object)var19);
    java.lang.Object var22 = var17.desempilha();
    var4.empilha(var22);
    var3.empilha((java.lang.Object)var4);
    ds.Pilha var25 = new ds.Pilha();
    ds.Pilha var26 = new ds.Pilha();
    boolean var27 = var26.vazia();
    boolean var28 = var26.vazia();
    var25.empilha((java.lang.Object)var26);
    ds.Pilha var30 = new ds.Pilha();
    boolean var31 = var30.vazia();
    boolean var32 = var30.vazia();
    var26.empilha((java.lang.Object)var30);
    ds.Pilha var34 = new ds.Pilha();
    var26.empilha((java.lang.Object)var34);
    ds.Pilha var36 = new ds.Pilha();
    int var37 = var36.tamanho();
    var34.empilha((java.lang.Object)var36);
    java.lang.Object var39 = var34.desempilha();
    var3.empilha(var39);
    ds.Pilha var41 = new ds.Pilha();
    boolean var42 = var41.vazia();
    boolean var43 = var41.vazia();
    boolean var44 = var41.vazia();
    ds.Pilha var45 = new ds.Pilha();
    ds.Pilha var46 = new ds.Pilha();
    boolean var47 = var46.vazia();
    boolean var48 = var46.vazia();
    var45.empilha((java.lang.Object)var46);
    ds.Pilha var50 = new ds.Pilha();
    boolean var51 = var50.vazia();
    boolean var52 = var50.vazia();
    var46.empilha((java.lang.Object)var50);
    ds.Pilha var54 = new ds.Pilha();
    var46.empilha((java.lang.Object)var54);
    ds.Pilha var56 = new ds.Pilha();
    int var57 = var56.tamanho();
    var54.empilha((java.lang.Object)var56);
    java.lang.Object var59 = var54.desempilha();
    var41.empilha(var59);
    var3.empilha(var59);
    var0.empilha(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);

  }

}
