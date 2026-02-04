package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.Item var4 = var1.min();
    var1.copia(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    var4.copia(var2);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    var4.constroi();

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var5.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var5.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var6.constroi();

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var5.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    ds.Item var8 = var1.min();
    ds.Item var9 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    ds.Item var8 = var1.min();
    ds.Item var9 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    java.lang.Integer var7 = new java.lang.Integer(2);
    java.lang.Integer var8 = new java.lang.Integer(134);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var7, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var4.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    var8.constroi();

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    var11.copia(var6);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var12 = var11.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.Item var11 = var1.min();
    ds.FPHeapMin var12 = new ds.FPHeapMin(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    var11.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.refaz((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.Item var11 = var1.min();
    ds.Item var12 = var1.min();
    ds.FPHeapMin var13 = new ds.FPHeapMin(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var1.copia(var4);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    java.lang.Integer var5 = new java.lang.Integer(2);
    java.lang.Integer var6 = new java.lang.Integer(652);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.diminuiChave((int)var5, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.refaz((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    var12.copia(var6);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    var12.imprime();

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    ds.Item var8 = var1.min();
    ds.FPHeapMin var9 = new ds.FPHeapMin(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.refaz((int)var0, (int)var0);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var6.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var0, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.refaz((int)var4, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var14 = var13.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.Item var4 = var1.min();
    ds.Item var5 = var1.min();
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(2);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var6, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.Item var4 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var6);
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.refaz((int)var14, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var4.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(134);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var4.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(134);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var6, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    java.lang.Integer var5 = new java.lang.Integer(480);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Byte var7 = new java.lang.Byte((byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.diminuiChave((int)var5, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(134);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(134);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    ds.Item[] var9 = new ds.Item[] { };
    var8.copia(var9);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var9);
    var6.copia(var9);
    var4.copia(var9);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(134);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.imprime();

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    java.lang.Integer var4 = new java.lang.Integer(480);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(134);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var4, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    var1.imprime();

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(480);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.Item[] var7 = new ds.Item[] { };
    var6.copia(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.Item var4 = var1.min();
    ds.Item var5 = var1.min();
    java.lang.Integer var6 = new java.lang.Integer(480);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    java.lang.Double var9 = new java.lang.Double(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var6, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.Item var3 = var1.min();
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(134);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(134);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.Item[] var11 = new ds.Item[] { };
    var10.copia(var11);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var11);
    var8.copia(var11);
    var6.copia(var11);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var17 = new ds.FPHeapMin(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var4, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    java.lang.Integer var7 = new java.lang.Integer(652);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Object var9 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var7, var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    ds.Item var8 = var1.min();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.refaz((int)var2, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(652);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    java.lang.Character var9 = new java.lang.Character('#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var6, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Boolean var8 = new java.lang.Boolean(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var7, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var6.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    var11.imprime();
    java.lang.Integer var13 = new java.lang.Integer(100);
    java.lang.Integer var14 = new java.lang.Integer(134);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.diminuiChave((int)var13, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(134);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    var5.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(652);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var6.imprime();

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var3.constroi();
    java.lang.Integer var5 = new java.lang.Integer(2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    var3.refaz((int)var5, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(134);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var5, (int)var9);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    var1.constroi();

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    java.lang.Integer var12 = new java.lang.Integer(2);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var12);
    java.lang.Integer var14 = new java.lang.Integer(134);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.diminuiChave((int)var12, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.Item var3 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    var1.refaz((int)var3, (int)var5);
    var1.constroi();

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(480);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    ds.Item var3 = var1.min();
    var1.constroi();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.refaz((int)var2, (int)var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var6.constroi();

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    var1.copia(var4);
    java.lang.Integer var8 = new java.lang.Integer(480);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    java.lang.Integer var10 = new java.lang.Integer(134);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var8, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(480);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.Item var11 = var1.min();
    ds.Item var12 = var1.min();
    var1.imprime();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    ds.Item var4 = var1.min();
    ds.Item var5 = var1.min();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(134);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(134);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.Item var11 = var1.min();
    ds.Item var12 = var1.min();
    java.lang.Integer var13 = new java.lang.Integer(2);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    java.lang.Integer var15 = new java.lang.Integer(134);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var13, (int)var15);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

}
