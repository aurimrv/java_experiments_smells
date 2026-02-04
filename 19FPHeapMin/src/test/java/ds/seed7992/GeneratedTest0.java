package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed7992 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
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

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
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

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Long var3 = new java.lang.Long((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.copia(var0);

  }

  public void test5() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
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

  public void test8() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();

  }

  public void test10() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.constroi();

  }

  public void test11() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var3.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(65);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    var1.refaz((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(65);
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

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(65);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test15() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
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

  public void test16() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.imprime();
    var3.constroi();

  }

  public void test17() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.imprime();

  }

  public void test18() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(849);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(849);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.diminuiChave((int)var0, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(2);
    java.lang.Long var4 = new java.lang.Long(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(65);
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

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var5 = var1.min();
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(849);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test26() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();
    var2.copia(var0);

  }

  public void test27() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
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

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.copia(var2);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    var7.imprime();

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.constroi();
    var5.copia(var2);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var10 = var1.min();
    ds.FPHeapMin var11 = new ds.FPHeapMin(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var5.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
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
      ds.Item var8 = var5.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(849);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    ds.Item[] var3 = new ds.Item[] { };
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.refaz((int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    var4.copia(var0);

  }

  public void test44() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var4.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    var10.constroi();
    var10.copia(var4);

  }

  public void test46() throws Throwable {

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

  public void test47() throws Throwable {

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

  public void test48() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    var4.imprime();
    java.lang.Integer var6 = new java.lang.Integer(65);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.diminuiChave((int)var6, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    var4.imprime();

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.diminuiChave((int)var0, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var2);
    var7.constroi();

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var2);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var6.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var6.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var6.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

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

  public void test56() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(863);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(863);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(849);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    java.lang.Integer var11 = new java.lang.Integer(849);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var11);
    java.lang.Integer var13 = new java.lang.Integer(863);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.refaz((int)var11, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    var10.constroi();
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(849);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.refaz((int)var12, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    java.lang.Integer var5 = new java.lang.Integer(849);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(65);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    var1.refaz((int)var5, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
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

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
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

  public void test65() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.constroi();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(863);
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

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    var1.imprime();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
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

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(849);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.Item[] var7 = new ds.Item[] { };
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    var6.copia(var7);
    java.lang.Integer var10 = new java.lang.Integer(849);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    java.lang.Integer var12 = new java.lang.Integer(65);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var12);
    var6.refaz((int)var10, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var10);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Item[] var3 = new ds.Item[] { };
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.constroi();
    java.lang.Integer var7 = new java.lang.Integer(849);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Object var9 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var7, var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.constroi();

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.Item[] var5 = new ds.Item[] { };
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    var10.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var12 = var10.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    var10.constroi();
    var10.imprime();
    var10.imprime();

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.constroi();

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    java.lang.Integer var7 = new java.lang.Integer(65);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer(65);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.Item[] var11 = new ds.Item[] { };
    ds.FPHeapMin var12 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var11);
    var10.copia(var11);
    ds.Item var16 = var10.min();
    java.lang.Integer var17 = new java.lang.Integer(65);
    ds.FPHeapMin var18 = new ds.FPHeapMin(var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    var10.refaz((int)var17, (int)var19);
    ds.FPHeapMin var21 = new ds.FPHeapMin(var17);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.FPHeapMin var23 = new ds.FPHeapMin(var22);
    var8.refaz((int)var17, (int)var22);
    java.lang.Integer var25 = new java.lang.Integer(1);
    ds.FPHeapMin var26 = new ds.FPHeapMin(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var17, (int)var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(65);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(863);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var7 = var1.min();
    ds.Item var8 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    var1.imprime();
    java.lang.Integer var4 = new java.lang.Integer(849);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var4);
    java.lang.Integer var9 = new java.lang.Integer(100);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    var1.refaz((int)var4, (int)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    java.lang.Integer var7 = new java.lang.Integer(65);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    ds.Item[] var9 = new ds.Item[] { };
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var9);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var9);
    var8.copia(var9);
    ds.Item var14 = var8.min();
    java.lang.Integer var15 = new java.lang.Integer(65);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var15);
    java.lang.Integer var17 = new java.lang.Integer(0);
    var8.refaz((int)var15, (int)var17);
    ds.FPHeapMin var19 = new ds.FPHeapMin(var17);
    java.lang.Integer var20 = new java.lang.Integer(849);
    ds.FPHeapMin var21 = new ds.FPHeapMin(var20);
    java.lang.Integer var22 = new java.lang.Integer(65);
    ds.FPHeapMin var23 = new ds.FPHeapMin(var22);
    ds.Item[] var24 = new ds.Item[] { };
    ds.FPHeapMin var25 = new ds.FPHeapMin(var24);
    ds.FPHeapMin var26 = new ds.FPHeapMin(var24);
    ds.FPHeapMin var27 = new ds.FPHeapMin(var24);
    var23.copia(var24);
    var21.copia(var24);
    ds.FPHeapMin var30 = new ds.FPHeapMin(var24);
    var30.constroi();
    var30.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var17, (java.lang.Object)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var4);
    var3.copia(var4);
    var1.copia(var4);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var11 = var10.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(65);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(863);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(65);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(849);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(849);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item[] var6 = new ds.Item[] { };
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    var5.copia(var6);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var5.constroi();
    java.lang.Integer var7 = new java.lang.Integer(65);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer(849);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var7, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var6.imprime();
    java.lang.Integer var8 = new java.lang.Integer(65);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    java.lang.Integer var10 = new java.lang.Integer(65);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    ds.Item[] var12 = new ds.Item[] { };
    ds.FPHeapMin var13 = new ds.FPHeapMin(var12);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var12);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var12);
    var11.copia(var12);
    ds.Item var17 = var11.min();
    java.lang.Integer var18 = new java.lang.Integer(65);
    ds.FPHeapMin var19 = new ds.FPHeapMin(var18);
    java.lang.Integer var20 = new java.lang.Integer(0);
    var11.refaz((int)var18, (int)var20);
    ds.FPHeapMin var22 = new ds.FPHeapMin(var18);
    java.lang.Integer var23 = new java.lang.Integer(1);
    ds.FPHeapMin var24 = new ds.FPHeapMin(var23);
    var9.refaz((int)var18, (int)var23);
    java.lang.Integer var26 = new java.lang.Integer(849);
    ds.FPHeapMin var27 = new ds.FPHeapMin(var26);
    java.lang.Integer var28 = new java.lang.Integer(65);
    ds.FPHeapMin var29 = new ds.FPHeapMin(var28);
    ds.Item[] var30 = new ds.Item[] { };
    ds.FPHeapMin var31 = new ds.FPHeapMin(var30);
    ds.FPHeapMin var32 = new ds.FPHeapMin(var30);
    ds.FPHeapMin var33 = new ds.FPHeapMin(var30);
    var29.copia(var30);
    var27.copia(var30);
    ds.Item var36 = var27.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var23, (java.lang.Object)var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(849);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(0);
    var1.refaz((int)var3, (int)var4);

  }

}
