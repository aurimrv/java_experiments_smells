package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);

  }

  public void test4() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test7() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var2.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    ds.Item var3 = var1.min();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var5 = var1.min();
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test16() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var2.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    ds.Item var3 = var1.min();
    ds.Item var4 = var1.min();
    ds.Item[] var5 = new ds.Item[] { };
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test18() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var3.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(2);
    java.lang.Float var4 = new java.lang.Float(100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var5 = var1.min();
    ds.Item var6 = var1.min();
    ds.Item var7 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var3.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.copia(var2);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var0, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var0);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
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

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    var11.imprime();

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    var11.copia(var6);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    var12.constroi();

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    var12.copia(var6);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var6.copia(var2);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
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

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var7 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var13 = var12.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
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

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    java.lang.Integer var7 = new java.lang.Integer(731);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var7, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
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

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
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

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    java.lang.Integer var5 = new java.lang.Integer(222);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(100);
    var6.refaz((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(731);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var7, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(222);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    java.lang.Integer var15 = new java.lang.Integer(833);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.refaz((int)var13, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.constroi();

  }

  public void test51() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(324);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.Item[] var7 = new ds.Item[] { };
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    var6.copia(var7);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var7);
    ds.Item[] var11 = new ds.Item[] { };
    ds.FPHeapMin var12 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var11);
    var10.copia(var11);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var2.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var5.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(324);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.refaz((int)var13, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(222);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(100);
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    ds.Item[] var9 = new ds.Item[] { };
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    var8.copia(var9);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var4, (java.lang.Object)var12);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(731);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test60() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(222);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(100);
    var4.refaz((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var6, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test62() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    var2.constroi();
    java.lang.Integer var5 = new java.lang.Integer((-1));
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    var2.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var2.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var2.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.Item var3 = var2.min();
    java.lang.Integer var4 = new java.lang.Integer(731);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(833);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var4, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test66() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var2.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    java.lang.Integer var5 = new java.lang.Integer(731);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    ds.Item[] var9 = new ds.Item[] { };
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    var8.copia(var9);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var9);
    ds.Item[] var13 = new ds.Item[] { };
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var13);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var13);
    var12.copia(var13);
    ds.FPHeapMin var18 = new ds.FPHeapMin(var13);
    ds.FPHeapMin var19 = new ds.FPHeapMin(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var5, (java.lang.Object)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.constroi();
    java.lang.Integer var7 = new java.lang.Integer(833);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer(324);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var7, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    java.lang.Integer var3 = new java.lang.Integer(10);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.Item[] var5 = new ds.Item[] { };
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var3, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var2.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(100);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    java.lang.Integer var6 = new java.lang.Integer(731);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    java.lang.Integer var8 = new java.lang.Integer(731);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var8);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var6, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    java.lang.Integer var4 = new java.lang.Integer(731);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    java.lang.Character var8 = new java.lang.Character('#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var4, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
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

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
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

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    ds.Item var3 = var1.min();
    ds.Item var4 = var1.min();
    ds.Item var5 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(222);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(100);
    var4.refaz((int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    var2.refaz((int)var5, (int)var8);

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(833);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test82() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(324);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(222);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(731);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    java.lang.Integer var5 = new java.lang.Integer(222);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(100);
    var6.refaz((int)var7, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(731);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    java.lang.Integer var8 = new java.lang.Integer(731);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var8);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var8);
    var3.refaz((int)var4, (int)var8);

  }

  public void test85() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    var2.constroi();
    var2.imprime();

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var6);
    var12.imprime();

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(731);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(222);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(731);
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

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(324);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    var5.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var12 = var5.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

}
