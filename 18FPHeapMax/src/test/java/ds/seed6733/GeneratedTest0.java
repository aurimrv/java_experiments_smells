package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

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

  public void test2() throws Throwable {

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

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Byte var3 = new java.lang.Byte((byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
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

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
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

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
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

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(377);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-99));
    var4.refaz((int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.max();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
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

  public void test18() throws Throwable {

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

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
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

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test23() throws Throwable {

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

  public void test24() throws Throwable {

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

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.constroi();

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    ds.Item var3 = var1.max();
    var1.refaz((int)var0, (int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var0);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    ds.Item var5 = null;
    ds.Item[] var6 = new ds.Item[] { var5};
    var4.copia(var6);
    var1.copia(var6);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
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

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var3.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

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

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    var5.copia(var7);
    var3.copia(var7);
    var1.copia(var7);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    var5.copia(var7);
    var3.copia(var7);
    var1.copia(var7);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    var5.copia(var7);
    var3.copia(var7);
    var1.copia(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.insere(var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    var5.copia(var7);
    var3.copia(var7);
    var1.copia(var7);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(377);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(499);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item var8 = null;
    ds.Item[] var9 = new ds.Item[] { var8};
    var7.copia(var9);
    var5.copia(var9);
    var3.copia(var9);
    var1.copia(var9);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(377);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(499);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(2);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item var8 = null;
    ds.Item[] var9 = new ds.Item[] { var8};
    var7.copia(var9);
    var5.copia(var9);
    var3.copia(var9);
    var1.copia(var9);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    ds.Item var3 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    var4.imprime();
    ds.Item var6 = var4.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var3.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
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

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
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

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(2);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    var5.copia(var7);
    var3.copia(var7);
    var1.copia(var7);

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(377);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
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

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(377);
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

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(377);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(437);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-99));
    var4.refaz((int)var5, (int)var6);
    java.lang.Double var8 = new java.lang.Double(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var6, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(437);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(437);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var2);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
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

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.imprime();
    ds.Item var4 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(499);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(377);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    var8.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.constroi();

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(377);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var5, (int)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var3 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var9 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var1.refaz((int)var2, (int)var4);
    java.lang.Integer var7 = new java.lang.Integer(437);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var7, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(377);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-99));
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(499);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var4, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(437);
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

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(437);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
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

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.constroi();
    var2.constroi();

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    java.lang.Integer var8 = new java.lang.Integer(499);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    var9.refaz((int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(499);
    ds.FPHeapMax var14 = new ds.FPHeapMax(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var10, (int)var13);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(437);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(499);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    var3.refaz((int)var4, (int)var6);
    java.lang.Integer var9 = new java.lang.Integer(499);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var6, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    java.lang.Integer var6 = new java.lang.Integer(2);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    java.lang.Integer var8 = new java.lang.Integer(499);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
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

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var1.refaz((int)var2, (int)var4);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var4);
    java.lang.Integer var8 = new java.lang.Integer(499);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Short var10 = new java.lang.Short((short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.aumentaChave((int)var8, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);
    var3.imprime();

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(72);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    ds.Item var3 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(377);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(437);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-99));
    var1.refaz((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var5);
    java.lang.Integer var8 = new java.lang.Integer(377);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer((-99));
    var9.refaz((int)var10, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var5, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(499);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(437);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-99));
    var7.refaz((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.FPHeapMax var12 = new ds.FPHeapMax(var11);
    var5.refaz((int)var8, (int)var11);
    var1.refaz((int)var2, (int)var8);
    var1.imprime();

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var1.refaz((int)var2, (int)var3);
    var1.constroi();
    ds.Item var6 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.Item var3 = var2.max();
    var2.constroi();
    java.lang.Integer var5 = new java.lang.Integer(377);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(377);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-99));
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    ds.Item var3 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(2);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    ds.Item var5 = var1.max();
    java.lang.Integer var6 = new java.lang.Integer(2);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    var1.refaz((int)var6, (int)var8);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(499);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var1.refaz((int)var2, (int)var4);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var2);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(2);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(499);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(437);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-99));
    var7.refaz((int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.FPHeapMax var12 = new ds.FPHeapMax(var11);
    var5.refaz((int)var8, (int)var11);
    var1.refaz((int)var2, (int)var8);
    ds.FPHeapMax var15 = new ds.FPHeapMax(var2);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(377);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.Item var3 = var2.max();
    var2.constroi();
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(437);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-99));
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    var1.refaz((int)var4, (int)var7);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var4);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(499);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var1.refaz((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(499);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(2);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    ds.Item var9 = null;
    ds.Item[] var10 = new ds.Item[] { var9};
    var8.copia(var10);
    ds.Item var12 = var8.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

}
