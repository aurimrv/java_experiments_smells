package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
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

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(411);
    java.lang.Integer var3 = new java.lang.Integer((-164));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
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

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(411);
    java.lang.Integer var3 = new java.lang.Integer((-164));
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

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.refaz((int)var0, (int)var0);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    var1.refaz((int)var0, (int)var0);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    ds.Item var5 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(411);
    java.lang.Integer var3 = new java.lang.Integer((-164));
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

  public void test15() throws Throwable {

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

  public void test16() throws Throwable {

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

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(411);
    java.lang.Integer var3 = new java.lang.Integer((-164));
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.max();
    java.lang.Integer var6 = new java.lang.Integer(253);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.Item var8 = null;
    ds.Item[] var9 = new ds.Item[] { var8};
    var7.copia(var9);
    var1.copia(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
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

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

    java.lang.Integer var0 = new java.lang.Integer(424);
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

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(411);
    java.lang.Integer var3 = new java.lang.Integer((-164));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(264);
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

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.constroi();

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(391);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();

  }

  public void test35() throws Throwable {

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

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(253);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    ds.Item var5 = null;
    ds.Item[] var6 = new ds.Item[] { var5};
    var4.copia(var6);
    var1.copia(var6);

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);

  }

  public void test42() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();

  }

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
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

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(391);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    ds.Item var5 = var4.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(703);
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

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
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

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Long var3 = new java.lang.Long(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
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

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(13);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(13);
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

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    ds.Item var3 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test57() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    var3.constroi();

  }

  public void test58() throws Throwable {

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

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
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

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
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

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
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

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
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

  public void test67() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
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

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);

  }

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.FPHeapMax var3 = new ds.FPHeapMax(var0);

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(424);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(253);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    var5.copia(var7);
    var3.copia(var7);
    var1.copia(var7);

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var0, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(391);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    var4.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    ds.Item var3 = var1.max();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
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

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(817);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(634);
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

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(634);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(13);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var1.refaz((int)var2, (int)var4);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(817);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(634);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(264);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(703);
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

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(391);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(817);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var5.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(424);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(391);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.constroi();

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(161);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(391);
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

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(13);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(817);
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

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(13);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(634);
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

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(264);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Double var4 = new java.lang.Double(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(391);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(161);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    var5.constroi();
    ds.Item var7 = var5.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
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

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(424);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(253);
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

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(391);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(13);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    var6.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    var3.copia(var5);
    var1.copia(var5);
    ds.Item var8 = var1.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var9 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(253);
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

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
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

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(703);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Object var4 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(253);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var3);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(703);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(634);
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

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(817);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(817);
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

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test100() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(634);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(253);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var4);
    var1.refaz((int)var2, (int)var4);

  }

  public void test101() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(253);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(703);
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

  public void test102() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
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

  public void test103() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = var1.max();
    java.lang.Integer var3 = new java.lang.Integer(703);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(817);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    var1.refaz((int)var3, (int)var5);
    java.lang.Integer var8 = new java.lang.Integer(424);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Integer var10 = new java.lang.Integer(253);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    ds.FPHeapMax var12 = new ds.FPHeapMax(var10);
    var1.refaz((int)var8, (int)var10);
    java.lang.Integer var14 = new java.lang.Integer(161);
    ds.FPHeapMax var15 = new ds.FPHeapMax(var14);
    java.lang.Integer var16 = new java.lang.Integer(253);
    ds.FPHeapMax var17 = new ds.FPHeapMax(var16);
    ds.FPHeapMax var18 = new ds.FPHeapMax(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var14, (java.lang.Object)var16);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test104() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    java.lang.Integer var5 = new java.lang.Integer(703);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    java.lang.Integer var7 = new java.lang.Integer(264);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    ds.Item var9 = var8.max();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test105() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(253);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Object var5 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
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

  public void test107() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(424);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(391);
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

  public void test108() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(634);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(411);
    java.lang.Integer var5 = new java.lang.Integer((-164));
    var3.refaz((int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(634);
    ds.FPHeapMax var8 = new ds.FPHeapMax(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var5, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(634);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Short var4 = new java.lang.Short((short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();

  }

  public void test111() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.imprime();

  }

  public void test112() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(391);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(817);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    var6.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    var1.imprime();
    var1.imprime();

  }

  public void test114() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test115() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(703);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(703);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(264);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    var1.refaz((int)var3, (int)var5);

  }

  public void test117() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.constroi();

  }

  public void test118() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.imprime();
    java.lang.Integer var3 = new java.lang.Integer(391);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Character var5 = new java.lang.Character(' ');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(161);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    ds.Item var3 = var1.max();
    java.lang.Integer var4 = new java.lang.Integer(634);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(253);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var4, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test120() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(703);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(634);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    var1.copia(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var1.retiraMax();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    var1.constroi();

  }

  public void test123() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(817);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(634);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var2);
    java.lang.Object var5 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.imprime();
    java.lang.Integer var4 = new java.lang.Integer(817);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var4, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(264);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var3, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    ds.Item var3 = var2.max();
    java.lang.Integer var4 = new java.lang.Integer(391);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(264);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var4, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test127() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    java.lang.Integer var3 = new java.lang.Integer(253);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(13);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    var1.constroi();
    java.lang.Integer var3 = new java.lang.Integer(424);
    ds.FPHeapMax var4 = new ds.FPHeapMax(var3);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var3);
    java.lang.Integer var6 = new java.lang.Integer(817);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var3, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(634);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.constroi();
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(703);
    ds.FPHeapMax var6 = new ds.FPHeapMax(var5);
    ds.Item var7 = var6.max();
    java.lang.Integer var8 = new java.lang.Integer(703);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    java.lang.Integer var10 = new java.lang.Integer(817);
    ds.FPHeapMax var11 = new ds.FPHeapMax(var10);
    var6.refaz((int)var8, (int)var10);
    java.lang.Integer var13 = new java.lang.Integer(424);
    ds.FPHeapMax var14 = new ds.FPHeapMax(var13);
    java.lang.Integer var15 = new java.lang.Integer(253);
    ds.FPHeapMax var16 = new ds.FPHeapMax(var15);
    ds.FPHeapMax var17 = new ds.FPHeapMax(var15);
    var6.refaz((int)var13, (int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var4, (int)var13);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test130() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(264);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    ds.FPHeapMax var2 = new ds.FPHeapMax(var0);
    var2.imprime();
    java.lang.Integer var4 = new java.lang.Integer(703);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(424);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    java.lang.Integer var8 = new java.lang.Integer(253);
    ds.FPHeapMax var9 = new ds.FPHeapMax(var8);
    ds.Item var10 = null;
    ds.Item[] var11 = new ds.Item[] { var10};
    var9.copia(var11);
    var7.copia(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.aumentaChave((int)var4, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(253);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(703);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(0);
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

  public void test132() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(391);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(424);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(161);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(424);
    ds.FPHeapMax var1 = new ds.FPHeapMax(var0);
    java.lang.Integer var2 = new java.lang.Integer(391);
    ds.FPHeapMax var3 = new ds.FPHeapMax(var2);
    java.lang.Integer var4 = new java.lang.Integer(391);
    ds.FPHeapMax var5 = new ds.FPHeapMax(var4);
    java.lang.Integer var6 = new java.lang.Integer(264);
    ds.FPHeapMax var7 = new ds.FPHeapMax(var6);
    var3.refaz((int)var4, (int)var6);
    java.lang.Integer var9 = new java.lang.Integer(391);
    ds.FPHeapMax var10 = new ds.FPHeapMax(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.aumentaChave((int)var6, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
