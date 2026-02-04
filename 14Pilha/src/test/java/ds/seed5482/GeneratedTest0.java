package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

  }

  public void test2() throws Throwable {

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

  public void test3() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test6() throws Throwable {

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

  public void test7() throws Throwable {

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

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
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
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();

  }

  public void test10() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();

  }

  public void test11() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    int var7 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test13() throws Throwable {

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

  public void test14() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    int var7 = var0.tamanho();
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test16() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var5.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var0.desempilha();
    int var10 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0+ "'", var9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var0.desempilha();
    boolean var10 = var0.vazia();
    int var11 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0+ "'", var9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var5 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (byte)10+ "'", var5.equals((byte)10));

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (byte)10+ "'", var6.equals((byte)10));

  }

  public void test24() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var0.desempilha();
    boolean var10 = var0.vazia();
    int var11 = var0.tamanho();
    var5.empilha(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0+ "'", var9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    int var7 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    int var2 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    int var7 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    int var7 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test32() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var0.empilha((java.lang.Object)var7);
    int var9 = var7.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var0.empilha((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    int var10 = var7.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    java.lang.Double var4 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var4);
    int var6 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test37() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var0.empilha((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    var7.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    java.lang.Double var4 = new java.lang.Double(100.0d);
    var0.empilha((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var0.empilha((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    int var11 = var0.tamanho();
    ds.Pilha var12 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var0.empilha((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    int var11 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var1.empilha((java.lang.Object)var5);
    int var7 = var4.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Long var7 = new java.lang.Long((-1L));
    var6.empilha((java.lang.Object)var7);
    java.lang.Long var9 = new java.lang.Long(0L);
    var6.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var12 = new ds.Pilha();
    var5.empilha((java.lang.Object)var12);
    boolean var14 = var5.vazia();
    boolean var15 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var12.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Long var7 = new java.lang.Long((-1L));
    var6.empilha((java.lang.Object)var7);
    java.lang.Long var9 = new java.lang.Long(0L);
    var6.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var12 = new ds.Pilha();
    var5.empilha((java.lang.Object)var12);
    boolean var14 = var5.vazia();
    boolean var15 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    java.lang.Object var17 = var1.desempilha();
    boolean var18 = var12.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Long var7 = new java.lang.Long((-1L));
    var6.empilha((java.lang.Object)var7);
    java.lang.Long var9 = new java.lang.Long(0L);
    var6.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var12 = new ds.Pilha();
    var5.empilha((java.lang.Object)var12);
    boolean var14 = var5.vazia();
    boolean var15 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    java.lang.Object var17 = var1.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var1.empilha((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    ds.Pilha var8 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var1.empilha((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    int var9 = var4.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var1.empilha((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Long var2 = new java.lang.Long((-1L));
    var1.empilha((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    var0.empilha((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    java.lang.Object var11 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var1.empilha((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    java.lang.Object var8 = var1.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0+ "'", var8.equals(0));

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    var1.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    java.lang.Float var3 = new java.lang.Float(100.0f);
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Integer var3 = new java.lang.Integer(10);
    var2.empilha((java.lang.Object)var3);
    java.lang.Byte var5 = new java.lang.Byte((byte)10);
    var2.empilha((java.lang.Object)var5);
    boolean var7 = var2.vazia();
    boolean var8 = var2.vazia();
    var0.empilha((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test56() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    int var4 = var0.tamanho();
    java.lang.Integer var5 = new java.lang.Integer((-1));
    var0.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test57() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    var0.empilha((java.lang.Object)var2);
    boolean var4 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test58() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    int var6 = var5.tamanho();
    var0.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test59() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    int var4 = var3.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test60() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test61() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    int var7 = var6.tamanho();
    int var8 = var6.tamanho();
    var5.empilha((java.lang.Object)var6);
    ds.Pilha var10 = new ds.Pilha();
    boolean var11 = var10.vazia();
    int var12 = var10.tamanho();
    var5.empilha((java.lang.Object)var12);
    java.lang.Object var14 = var5.desempilha();
    int var15 = var5.tamanho();
    var1.empilha((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test62() throws Throwable {

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

  public void test63() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test64() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    int var4 = var2.tamanho();
    var0.empilha((java.lang.Object)var2);
    boolean var6 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test65() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    var1.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test66() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    boolean var5 = var2.vazia();
    boolean var6 = var2.vazia();
    var0.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test67() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test68() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    ds.Pilha var10 = new ds.Pilha();
    ds.Pilha var11 = new ds.Pilha();
    int var12 = var11.tamanho();
    int var13 = var11.tamanho();
    var10.empilha((java.lang.Object)var11);
    ds.Pilha var15 = new ds.Pilha();
    boolean var16 = var15.vazia();
    int var17 = var15.tamanho();
    var10.empilha((java.lang.Object)var17);
    boolean var19 = var10.vazia();
    int var20 = var10.tamanho();
    var0.empilha((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);

  }

  public void test69() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test70() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var0.desempilha();
    boolean var10 = var0.vazia();
    int var11 = var0.tamanho();
    boolean var12 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0+ "'", var9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test71() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.empilha((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    java.lang.Object var7 = var0.desempilha();
    int var8 = var0.tamanho();
    java.lang.Object var9 = new java.lang.Object();
    var0.empilha(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)10+ "'", var7.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test72() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Long var7 = new java.lang.Long((-1L));
    var6.empilha((java.lang.Object)var7);
    java.lang.Long var9 = new java.lang.Long(0L);
    var6.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var12 = new ds.Pilha();
    var5.empilha((java.lang.Object)var12);
    boolean var14 = var5.vazia();
    boolean var15 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    java.lang.Object var17 = var5.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test73() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Long var7 = new java.lang.Long((-1L));
    var6.empilha((java.lang.Object)var7);
    java.lang.Long var9 = new java.lang.Long(0L);
    var6.empilha((java.lang.Object)var9);
    var5.empilha((java.lang.Object)var9);
    ds.Pilha var12 = new ds.Pilha();
    var5.empilha((java.lang.Object)var12);
    boolean var14 = var5.vazia();
    boolean var15 = var5.vazia();
    var1.empilha((java.lang.Object)var5);
    boolean var17 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test74() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Long var4 = new java.lang.Long((-1L));
    var3.empilha((java.lang.Object)var4);
    java.lang.Long var6 = new java.lang.Long(0L);
    var3.empilha((java.lang.Object)var6);
    boolean var8 = var3.vazia();
    var0.empilha((java.lang.Object)var3);
    boolean var10 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test75() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test76() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    int var4 = var2.tamanho();
    var0.empilha((java.lang.Object)var2);
    int var6 = var2.tamanho();
    ds.Pilha var7 = new ds.Pilha();
    var2.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test77() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    int var6 = var4.tamanho();
    var2.empilha((java.lang.Object)var4);
    java.lang.Object var8 = var2.desempilha();
    var0.empilha((java.lang.Object)var2);
    int var10 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test78() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test79() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var2.empilha((java.lang.Object)var3);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var6 = new ds.Pilha();
    var0.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test80() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test81() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    int var4 = var0.tamanho();
    java.lang.Object var5 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test82() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    int var5 = var0.tamanho();
    ds.Pilha var6 = new ds.Pilha();
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    var6.empilha((java.lang.Object)var7);
    ds.Pilha var10 = new ds.Pilha();
    int var11 = var10.tamanho();
    var7.empilha((java.lang.Object)var11);
    boolean var13 = var7.vazia();
    ds.Pilha var14 = new ds.Pilha();
    ds.Pilha var15 = new ds.Pilha();
    int var16 = var15.tamanho();
    int var17 = var15.tamanho();
    var14.empilha((java.lang.Object)var15);
    ds.Pilha var19 = new ds.Pilha();
    boolean var20 = var19.vazia();
    int var21 = var19.tamanho();
    var14.empilha((java.lang.Object)var21);
    boolean var23 = var14.vazia();
    int var24 = var14.tamanho();
    var7.empilha((java.lang.Object)var24);
    java.lang.Object var26 = var7.desempilha();
    var0.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 2+ "'", var26.equals(2));

  }

  public void test83() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test84() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Double var7 = new java.lang.Double(10.0d);
    var6.empilha((java.lang.Object)var7);
    var4.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test85() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.empilha((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test86() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    var0.empilha((java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test87() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    int var4 = var2.tamanho();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var6 = new ds.Pilha();
    ds.Pilha var7 = new ds.Pilha();
    int var8 = var7.tamanho();
    var6.empilha((java.lang.Object)var7);
    java.lang.Double var10 = new java.lang.Double(100.0d);
    var6.empilha((java.lang.Object)var10);
    boolean var12 = var6.vazia();
    var2.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test88() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var2.empilha((java.lang.Object)var3);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var6 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)100+ "'", var6.equals((short)100));

  }

  public void test89() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    int var4 = var2.tamanho();
    var0.empilha((java.lang.Object)var2);
    int var6 = var2.tamanho();
    ds.Pilha var7 = new ds.Pilha();
    ds.Pilha var8 = new ds.Pilha();
    boolean var9 = var8.vazia();
    var7.empilha((java.lang.Object)var8);
    boolean var11 = var7.vazia();
    java.lang.Object var12 = var7.desempilha();
    var2.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test90() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Integer var3 = new java.lang.Integer(10);
    var2.empilha((java.lang.Object)var3);
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test91() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var1.empilha((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    ds.Pilha var8 = new ds.Pilha();
    ds.Pilha var9 = new ds.Pilha();
    int var10 = var9.tamanho();
    int var11 = var9.tamanho();
    var8.empilha((java.lang.Object)var9);
    ds.Pilha var13 = new ds.Pilha();
    boolean var14 = var13.vazia();
    int var15 = var13.tamanho();
    var8.empilha((java.lang.Object)var15);
    boolean var17 = var8.vazia();
    int var18 = var8.tamanho();
    var1.empilha((java.lang.Object)var18);
    java.lang.Object var20 = var1.desempilha();
    boolean var21 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 2+ "'", var20.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

}
