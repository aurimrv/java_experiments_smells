package ds.seed5831;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5831 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.constroi();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.max();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.refaz((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.refaz((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item[] var2 = new ds.Item[] { };
    var1.copia(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.max();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.refaz((int)var2, (int)var2);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(512);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var7 = var1.max();
    var3.copia(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var3.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(512);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var7 = var1.max();
    ds.FPHeapMax var8 = new ds.FPHeapMax(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.FPHeapMax var5 = new ds.FPHeapMax(var3);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Character var3 = new java.lang.Character('4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(652);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(652);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var1.max();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(652);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-331));
    var4.refaz((int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(71);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    var5.imprime();

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(354);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    ds.Item[] var9 = new ds.Item[] { };
    var8.copia(var9);
    var6.copia(var9);
    var4.copia(var9);
    var1.copia(var9);

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(354);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item[] var8 = new ds.Item[] { };
    var7.copia(var8);
    var5.copia(var8);
    var3.copia(var8);
    var1.copia(var8);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    var1.imprime();

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var3.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    ds.Item[] var7 = new ds.Item[] { };
    var6.copia(var7);
    var4.copia(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.refaz((int)var0, (int)var0);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var7 = var1.max();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    ds.Item var10 = var1.max();
    var5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(512);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    var4.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(354);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item[] var8 = new ds.Item[] { };
    var7.copia(var8);
    var5.copia(var8);
    var3.copia(var8);
    var1.copia(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var13 = var7.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(354);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item[] var8 = new ds.Item[] { };
    var7.copia(var8);
    var5.copia(var8);
    var3.copia(var8);
    var1.copia(var8);
    ds.Item var13 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.refaz((int)var6, (int)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(652);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(354);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    ds.Item[] var10 = new ds.Item[] { };
    var9.copia(var10);
    var7.copia(var10);
    var5.copia(var10);
    var3.copia(var10);
    var1.copia(var10);

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    var1.imprime();
    java.lang.Integer var8 = new java.lang.Integer(170);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var8, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(512);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(512);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(71);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(71);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var1.refaz((int)var2, (int)var4);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var2);
    java.lang.Integer var5 = new java.lang.Integer(354);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    ds.Item[] var9 = new ds.Item[] { };
    var8.copia(var9);
    var6.copia(var9);
    ds.Item var12 = var6.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(170);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(71);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var7 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(354);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item[] var8 = new ds.Item[] { };
    var7.copia(var8);
    var5.copia(var8);
    var3.copia(var8);
    var1.copia(var8);
    ds.Item var13 = var1.max();
    java.lang.Integer var14 = new java.lang.Integer(1);
    ds.FPHeapMax var15 = new ds.FPHeapMax(var14);
    java.lang.Short var16 = new java.lang.Short((short)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var14, (java.lang.Object)var16);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.max();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(354);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item[] var8 = new ds.Item[] { };
    var7.copia(var8);
    var5.copia(var8);
    var3.copia(var8);
    var1.copia(var8);
    var1.constroi();

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();
    var1.imprime();
    java.lang.Integer var7 = new java.lang.Integer(2);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    java.lang.Integer var9 = new java.lang.Integer(2);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var9);
    var1.refaz((int)var7, (int)var9);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(354);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Character var5 = new java.lang.Character('4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(652);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    var4.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    var1.imprime();
    java.lang.Integer var8 = new java.lang.Integer(2);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Integer var10 = new java.lang.Integer(2);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    var1.refaz((int)var8, (int)var10);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(2);
    ds.FPHeapMax var15 = new ds.FPHeapMax(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var13, (int)var14);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(512);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(512);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    var1.imprime();
    var1.constroi();

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    var1.imprime();
    var1.imprime();

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    java.lang.Integer var10 = new java.lang.Integer(354);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    ds.FPHeapMax var13 = new ds.FPHeapMax(var12);
    ds.Item[] var14 = new ds.Item[] { };
    var13.copia(var14);
    var11.copia(var14);
    var11.imprime();
    java.lang.Integer var18 = new java.lang.Integer(2);
    ds.FPHeapMax var19 = new ds.FPHeapMax(var18);
    java.lang.Integer var20 = new java.lang.Integer(2);
    ds.FPHeapMax var21 = new ds.FPHeapMax(var20);
    var11.refaz((int)var18, (int)var20);
    java.lang.Integer var23 = new java.lang.Integer(512);
    ds.FPHeapMax var24 = new ds.FPHeapMax(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var18, (int)var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(71);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    var1.constroi();

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.constroi();
    java.lang.Integer var4 = new java.lang.Integer(512);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-331));
    var5.refaz((int)var6, (int)var7);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var6);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var6);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.FPHeapMax var12 = new ds.FPHeapMax(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var6, (int)var11);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(652);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var7 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();
    var1.constroi();

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(170);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    java.lang.Integer var7 = new java.lang.Integer(512);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    java.lang.Integer var9 = new java.lang.Integer(512);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-331));
    var10.refaz((int)var11, (int)var12);
    ds.FPHeapMax var14 = new ds.FPHeapMax(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var7, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    var1.refaz((int)var3, (int)var5);
    var1.constroi();

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(512);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-331));
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var4, (int)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var2.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    var1.imprime();
    var1.imprime();
    java.lang.Integer var12 = new java.lang.Integer(495);
    ds.FPHeapMax var13 = new ds.FPHeapMax(var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    ds.FPHeapMax var15 = new ds.FPHeapMax(var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer((-331));
    var15.refaz((int)var16, (int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var12, (java.lang.Object)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.constroi();

  }

  public void test125() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.constroi();
    var1.constroi();

  }

  public void test126() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();
    var1.imprime();
    var1.constroi();

  }

  public void test127() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(170);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.constroi();
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(495);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var4, (int)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test128() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    java.lang.Integer var7 = new java.lang.Integer(495);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var7);
    java.lang.Integer var10 = new java.lang.Integer(354);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var7, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    var1.refaz((int)var3, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(354);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item[] var6 = new ds.Item[] { };
    var5.copia(var6);
    var3.copia(var6);
    var1.copia(var6);
    java.lang.Integer var10 = new java.lang.Integer(2);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    java.lang.Integer var12 = new java.lang.Integer(71);
    ds.FPHeapMax var13 = new ds.FPHeapMax(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var10, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(495);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(512);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-331));
    var4.refaz((int)var5, (int)var6);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var5);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var5);
    java.lang.Integer var10 = new java.lang.Integer(512);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer((-331));
    var11.refaz((int)var12, (int)var13);
    var1.refaz((int)var5, (int)var13);
    java.lang.Integer var16 = new java.lang.Integer(652);
    ds.FPHeapMax var17 = new ds.FPHeapMax(var16);
    ds.FPHeapMax var18 = new ds.FPHeapMax(var16);
    java.lang.Integer var19 = new java.lang.Integer(512);
    ds.FPHeapMax var20 = new ds.FPHeapMax(var19);
    ds.FPHeapMax var21 = new ds.FPHeapMax(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var16, (int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);

  }

  public void test134() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    ds.Item var7 = var1.max();
    var1.constroi();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test135() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);
    var3.constroi();

  }

  public void test136() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(652);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-331));
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-331));
    var1.refaz((int)var2, (int)var3);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var2);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var2);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(512);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.aumentaChave((int)var7, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(512);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(170);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var2);
    java.lang.Integer var6 = new java.lang.Integer(2);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item[] var4 = new ds.Item[] { };
    var3.copia(var4);
    var1.copia(var4);
    var1.imprime();
    ds.Item var8 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test141() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(354);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.constroi();

  }

  public void test142() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);
    ds.Item var4 = var3.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test143() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(71);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);

  }

  public void test144() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(354);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(71);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(652);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    ds.Item var4 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

}
