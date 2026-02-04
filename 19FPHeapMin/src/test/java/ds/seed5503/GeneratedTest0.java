package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test2() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

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

  public void test4() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
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

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test12() throws Throwable {

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

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test14() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var2.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.copia(var0);

  }

  public void test16() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(744);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.diminuiChave((int)var4, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var2.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

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

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test21() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.constroi();
    java.lang.Integer var5 = new java.lang.Integer(10);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.Item[] var3 = new ds.Item[] { };
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    var1.copia(var3);

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test25() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(314);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.refaz((int)var5, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    var4.constroi();

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Long var3 = new java.lang.Long(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.Item[] var3 = new ds.Item[] { };
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);

  }

  public void test29() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(744);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(591);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.refaz((int)var4, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.refaz((int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(105);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.refaz((int)var5, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.constroi();
    var3.copia(var0);

  }

  public void test33() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.copia(var0);

  }

  public void test34() throws Throwable {

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

  public void test35() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var4.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var6, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var5.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

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

  public void test40() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    var5.imprime();

  }

  public void test41() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var5.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Item[] var3 = new ds.Item[] { };
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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
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

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var2);

  }

  public void test46() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    var2.imprime();

  }

  public void test47() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(591);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(2);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var2);
    var1.copia(var2);

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var0, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var7 = var1.min();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test51() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    java.lang.Integer var7 = new java.lang.Integer(591);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.diminuiChave((int)var7, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var6.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    var6.copia(var0);

  }

  public void test54() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    var6.constroi();

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
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

  public void test57() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    java.lang.Integer var4 = new java.lang.Integer(591);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(591);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var4, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(744);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    java.lang.Integer var7 = new java.lang.Integer(314);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.diminuiChave((int)var4, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
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

  public void test60() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    java.lang.Integer var6 = new java.lang.Integer(744);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    java.lang.Integer var8 = new java.lang.Integer(2);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    var9.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var6, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

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

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.constroi();
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(0);
    var1.refaz((int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var8 = var1.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var9 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test64() throws Throwable {

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

  public void test65() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    var4.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var4.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(744);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    java.lang.Integer var7 = new java.lang.Integer(591);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.diminuiChave((int)var4, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    java.lang.Integer var6 = new java.lang.Integer(591);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    java.lang.Character var8 = new java.lang.Character('4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var6, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var6.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(591);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.Item[] var5 = new ds.Item[] { };
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(314);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(791);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(591);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(591);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var0);
    java.lang.Integer var7 = new java.lang.Integer(591);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var7);
    java.lang.Integer var10 = new java.lang.Integer(591);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var7, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    java.lang.Integer var3 = new java.lang.Integer(744);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    java.lang.Integer var6 = new java.lang.Integer(314);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.Item var3 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test76() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.constroi();
    var3.imprime();
    java.lang.Integer var6 = new java.lang.Integer(314);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    var7.constroi();
    java.lang.Integer var9 = new java.lang.Integer(2);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    var10.constroi();
    var10.constroi();
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(0);
    var10.refaz((int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    var7.refaz((int)var13, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(791);
    ds.FPHeapMin var19 = new ds.FPHeapMin(var18);
    var19.constroi();
    var19.constroi();
    java.lang.Integer var22 = new java.lang.Integer(2);
    ds.FPHeapMin var23 = new ds.FPHeapMin(var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    var19.refaz((int)var22, (int)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.refaz((int)var16, (int)var24);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
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
      ds.Item var8 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var8 = var1.min();
    ds.Item var9 = var1.min();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    ds.Item var8 = var1.min();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
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

  public void test83() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var3.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    var3.constroi();
    var3.constroi();
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(0);
    var3.refaz((int)var6, (int)var7);
    java.lang.Object var9 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var6, var9);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(591);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.Item[] var5 = new ds.Item[] { };
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(591);
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

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.constroi();
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(0);
    var1.refaz((int)var4, (int)var5);
    var1.constroi();

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();
    var2.constroi();

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(791);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.constroi();
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    var1.refaz((int)var4, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    java.lang.Integer var9 = new java.lang.Integer(744);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.Item[] var11 = new ds.Item[] { };
    ds.FPHeapMin var12 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var16 = new ds.FPHeapMin(var11);
    ds.FPHeapMin var17 = new ds.FPHeapMin(var11);
    var10.copia(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var8, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(591);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    java.lang.Integer var5 = new java.lang.Integer(2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var6.constroi();
    var6.constroi();
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer(0);
    var6.refaz((int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(591);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    var3.constroi();
    var3.imprime();
    java.lang.Integer var6 = new java.lang.Integer(791);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    var7.constroi();
    var7.constroi();
    java.lang.Integer var10 = new java.lang.Integer(2);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    var7.refaz((int)var10, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(591);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    var7.refaz((int)var14, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(591);
    ds.FPHeapMin var19 = new ds.FPHeapMin(var18);
    ds.Item[] var20 = new ds.Item[] { };
    ds.FPHeapMin var21 = new ds.FPHeapMin(var20);
    ds.FPHeapMin var22 = new ds.FPHeapMin(var20);
    ds.FPHeapMin var23 = new ds.FPHeapMin(var20);
    var19.copia(var20);
    ds.Item var25 = var19.min();
    var19.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.diminuiChave((int)var14, (java.lang.Object)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test98() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var0);
    var5.constroi();
    java.lang.Integer var7 = new java.lang.Integer((-1));
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.refaz((int)var7, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(791);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item[] var4 = new ds.Item[] { };
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var0);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    ds.Item var3 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(314);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var4.constroi();
    var4.constroi();
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(0);
    var4.refaz((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    var1.refaz((int)var7, (int)var10);
    var1.imprime();
    var1.imprime();

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item[] var2 = new ds.Item[] { };
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var2);
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(744);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);

  }

}
