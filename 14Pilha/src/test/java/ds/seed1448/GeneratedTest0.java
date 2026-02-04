package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test2() throws Throwable {

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

  public void test3() throws Throwable {

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

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

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
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test7() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    var0.empilha(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test11() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test14() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    boolean var5 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test16() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    int var5 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Float var6 = new java.lang.Float((-1.0f));
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    boolean var9 = var5.vazia();
    var0.empilha((java.lang.Object)var9);
    int var11 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Float var6 = new java.lang.Float((-1.0f));
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    boolean var9 = var5.vazia();
    var0.empilha((java.lang.Object)var9);
    java.lang.Object var11 = var0.desempilha();
    int var12 = var5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + true+ "'", var11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var7 = new ds.Pilha();
    java.lang.Float var8 = new java.lang.Float((-1.0f));
    var7.empilha((java.lang.Object)var8);
    var0.empilha((java.lang.Object)var8);
    int var11 = var7.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var2.empilha((java.lang.Object)var3);
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Float var7 = new java.lang.Float((-1.0f));
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var6.desempilha();
    boolean var10 = var6.vazia();
    var1.empilha((java.lang.Object)var10);
    java.lang.Object var12 = var1.desempilha();
    var0.empilha(var12);
    boolean var14 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test24() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var2.empilha((java.lang.Object)var3);
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Float var7 = new java.lang.Float((-1.0f));
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var6.desempilha();
    boolean var10 = var6.vazia();
    var1.empilha((java.lang.Object)var10);
    java.lang.Object var12 = var1.desempilha();
    var0.empilha(var12);
    java.lang.Object var14 = var0.desempilha();
    boolean var15 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var7 = new ds.Pilha();
    java.lang.Float var8 = new java.lang.Float((-1.0f));
    var7.empilha((java.lang.Object)var8);
    var0.empilha((java.lang.Object)var8);
    boolean var11 = var0.vazia();
    java.lang.Object var12 = var7.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0f)+ "'", var12.equals((-1.0f)));

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var7 = new ds.Pilha();
    java.lang.Float var8 = new java.lang.Float((-1.0f));
    var7.empilha((java.lang.Object)var8);
    var0.empilha((java.lang.Object)var8);
    boolean var11 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var2.empilha((java.lang.Object)var3);
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Float var7 = new java.lang.Float((-1.0f));
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var6.desempilha();
    boolean var10 = var6.vazia();
    var1.empilha((java.lang.Object)var10);
    java.lang.Object var12 = var1.desempilha();
    var0.empilha(var12);
    java.lang.Object var14 = var0.desempilha();
    boolean var15 = var0.vazia();
    ds.Pilha var16 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Float var4 = new java.lang.Float((-1.0f));
    var3.empilha((java.lang.Object)var4);
    var2.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    java.lang.Float var8 = new java.lang.Float((-1.0f));
    var7.empilha((java.lang.Object)var8);
    java.lang.Object var10 = var7.desempilha();
    boolean var11 = var7.vazia();
    var2.empilha((java.lang.Object)var11);
    var0.empilha((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0f)+ "'", var10.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    java.lang.Double var5 = new java.lang.Double(1.0d);
    var0.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Float var6 = new java.lang.Float((-1.0f));
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    boolean var9 = var5.vazia();
    var0.empilha((java.lang.Object)var9);
    boolean var11 = var0.vazia();
    int var12 = var0.tamanho();
    java.lang.Integer var13 = new java.lang.Integer((-1));
    var0.empilha((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test32() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    int var9 = var7.tamanho();
    var0.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    ds.Pilha var6 = new ds.Pilha();
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var10 = var6.desempilha();
    boolean var11 = var6.vazia();
    var4.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    int var7 = var5.tamanho();
    var0.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var2.empilha((java.lang.Object)var3);
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Float var7 = new java.lang.Float((-1.0f));
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var6.desempilha();
    boolean var10 = var6.vazia();
    var1.empilha((java.lang.Object)var10);
    java.lang.Object var12 = var1.desempilha();
    var0.empilha(var12);
    java.lang.Object var14 = var0.desempilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));

  }

  public void test37() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Float var6 = new java.lang.Float((-1.0f));
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    boolean var9 = var5.vazia();
    var0.empilha((java.lang.Object)var9);
    java.lang.Object var11 = var0.desempilha();
    java.lang.Float var12 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var12);
    boolean var14 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + true+ "'", var11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    int var5 = var3.tamanho();
    int var6 = var3.tamanho();
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    var0.empilha((java.lang.Object)var3);
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Float var4 = new java.lang.Float((-1.0f));
    var3.empilha((java.lang.Object)var4);
    var2.empilha((java.lang.Object)var4);
    ds.Pilha var7 = new ds.Pilha();
    java.lang.Float var8 = new java.lang.Float((-1.0f));
    var7.empilha((java.lang.Object)var8);
    java.lang.Object var10 = var7.desempilha();
    boolean var11 = var7.vazia();
    var2.empilha((java.lang.Object)var11);
    java.lang.Object var13 = var2.desempilha();
    var1.empilha(var13);
    java.lang.Object var15 = var1.desempilha();
    var0.empilha(var15);
    int var17 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0f)+ "'", var10.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + true+ "'", var13.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + true+ "'", var15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var5 = var1.desempilha();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var7 = new java.lang.Object();
    var1.empilha(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    int var5 = var0.tamanho();
    java.lang.Object var6 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    java.lang.Character var4 = new java.lang.Character('4');
    var1.empilha((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    var0.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var0.desempilha();
    ds.Pilha var9 = new ds.Pilha();
    var0.empilha((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Float var6 = new java.lang.Float((-1.0f));
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    boolean var9 = var5.vazia();
    var0.empilha((java.lang.Object)var9);
    java.lang.Object var11 = var0.desempilha();
    java.lang.Float var12 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var12);
    java.lang.Object var14 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + true+ "'", var11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (-1.0f)+ "'", var14.equals((-1.0f)));

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Float var5 = new java.lang.Float((-1.0f));
    var4.empilha((java.lang.Object)var5);
    var3.empilha((java.lang.Object)var5);
    ds.Pilha var8 = new ds.Pilha();
    java.lang.Float var9 = new java.lang.Float((-1.0f));
    var8.empilha((java.lang.Object)var9);
    java.lang.Object var11 = var8.desempilha();
    boolean var12 = var8.vazia();
    var3.empilha((java.lang.Object)var12);
    boolean var14 = var3.vazia();
    var0.empilha((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1.0f)+ "'", var11.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    int var3 = var0.tamanho();
    int var4 = var0.tamanho();
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    ds.Pilha var7 = new ds.Pilha();
    ds.Pilha var8 = new ds.Pilha();
    boolean var9 = var8.vazia();
    var7.empilha((java.lang.Object)var8);
    java.lang.Object var11 = var7.desempilha();
    boolean var12 = var7.vazia();
    var5.empilha((java.lang.Object)var7);
    var0.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    var1.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var4 = var0.desempilha();
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    java.lang.Character var3 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '4'+ "'", var6.equals('4'));

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Float var2 = new java.lang.Float((-1.0f));
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Float var6 = new java.lang.Float((-1.0f));
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    boolean var9 = var5.vazia();
    var0.empilha((java.lang.Object)var9);
    boolean var11 = var0.vazia();
    java.lang.Object var12 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var10 = var6.desempilha();
    var5.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var6.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    int var6 = var4.tamanho();
    boolean var7 = var4.vazia();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
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
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Float var3 = new java.lang.Float((-1.0f));
    var2.empilha((java.lang.Object)var3);
    var1.empilha((java.lang.Object)var3);
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Float var7 = new java.lang.Float((-1.0f));
    var6.empilha((java.lang.Object)var7);
    java.lang.Object var9 = var6.desempilha();
    boolean var10 = var6.vazia();
    var1.empilha((java.lang.Object)var10);
    java.lang.Object var12 = var1.desempilha();
    var0.empilha(var12);
    java.lang.Object var14 = var0.desempilha();
    boolean var15 = var0.vazia();
    boolean var16 = var0.vazia();
    int var17 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0f)+ "'", var9.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

}
