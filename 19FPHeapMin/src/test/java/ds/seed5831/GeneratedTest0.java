package ds.seed5831;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5831 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

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

  public void test2() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    var2.copia(var1);

  }

  public void test3() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.refaz((int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    var2.constroi();
    var2.copia(var1);

  }

  public void test5() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var3.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var3.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
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

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    var6.imprime();

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
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

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.Item var6 = var1.min();
    var4.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test13() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var1);
    var3.imprime();
    var3.copia(var1);

  }

  public void test14() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var1);
    var3.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var5 = var3.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.refaz((int)var7, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    var6.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.diminuiChave((int)var2, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var9.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    var7.imprime();

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.Item var9 = var1.min();
    ds.FPHeapMin var10 = new ds.FPHeapMin(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    var7.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    var7.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var9 = var7.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.refaz((int)var10, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    var1.imprime();

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
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

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
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

  public void test32() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var9.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.refaz((int)var2, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    java.lang.Integer var10 = new java.lang.Integer(2);
    java.lang.Float var11 = new java.lang.Float(0.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.diminuiChave((int)var10, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    java.lang.Integer var9 = new java.lang.Integer(2);
    java.lang.Short var10 = new java.lang.Short((short)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.diminuiChave((int)var9, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var5);
    var1.copia(var5);

  }

  public void test38() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
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

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(861);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    ds.Item var6 = null;
    ds.Item[] var7 = new ds.Item[] { var6};
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    var5.copia(var7);
    var3.copia(var7);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var7);
    var1.copia(var7);

  }

  public void test40() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();

  }

  public void test41() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var9.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

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

  public void test43() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test44() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test45() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.refaz((int)var0, (int)var0);

  }

  public void test46() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    var10.imprime();

  }

  public void test47() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    var10.copia(var3);

  }

  public void test48() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var3, (java.lang.Object)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test50() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.diminuiChave((int)var0, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    var11.constroi();

  }

  public void test52() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    var6.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var8 = var6.min();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    java.lang.Integer var12 = new java.lang.Integer(2);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.diminuiChave((int)var12, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var9 = var8.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.refaz((int)var0, (int)var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var3);
    var12.copia(var3);

  }

  public void test57() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var1);
    var3.constroi();

  }

  public void test58() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    var11.copia(var3);

  }

  public void test59() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.insere(var2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var6.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(654);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Integer var4 = new java.lang.Integer(861);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
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

  public void test63() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    var7.constroi();
    java.lang.Integer var9 = new java.lang.Integer(861);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    java.lang.Integer var11 = new java.lang.Integer(489);
    java.lang.Integer var12 = new java.lang.Integer(939);
    var10.refaz((int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.refaz((int)var11, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.Item var9 = var1.min();
    ds.Item var10 = var1.min();
    java.lang.Integer var11 = new java.lang.Integer(654);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var11);
    java.lang.Integer var13 = new java.lang.Integer(654);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    ds.Item var15 = var14.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var11, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test65() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    java.lang.Integer var3 = new java.lang.Integer(654);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(654);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var3, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test66() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.refaz((int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    var2.constroi();
    java.lang.Integer var4 = new java.lang.Integer(861);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(654);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var4, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
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

  public void test69() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var10 = var9.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();
    var1.imprime();

  }

  public void test71() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(861);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(489);
    java.lang.Integer var8 = new java.lang.Integer(939);
    var6.refaz((int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(861);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    java.lang.Integer var12 = new java.lang.Integer(489);
    java.lang.Integer var13 = new java.lang.Integer(939);
    var11.refaz((int)var12, (int)var13);
    ds.Item var15 = var11.min();
    ds.Item var16 = var11.min();
    java.lang.Integer var17 = new java.lang.Integer(654);
    ds.FPHeapMin var18 = new ds.FPHeapMin(var17);
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.FPHeapMin var20 = new ds.FPHeapMin(var19);
    var11.refaz((int)var17, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var8, (java.lang.Object)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test72() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    ds.Item var6 = var1.min();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test73() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    ds.Item var3 = null;
    ds.Item[] var4 = new ds.Item[] { var3};
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var2);
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    java.lang.Short var8 = new java.lang.Short((short)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.diminuiChave((int)var6, (java.lang.Object)var8);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);

  }

  public void test77() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    java.lang.Integer var10 = new java.lang.Integer(100);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    java.lang.Integer var12 = new java.lang.Integer(861);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var12);
    java.lang.Integer var14 = new java.lang.Integer(489);
    java.lang.Integer var15 = new java.lang.Integer(939);
    var13.refaz((int)var14, (int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.refaz((int)var10, (int)var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    var11.imprime();

  }

  public void test79() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.Item var4 = null;
    ds.Item[] var5 = new ds.Item[] { var4};
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    var3.copia(var5);
    var1.copia(var5);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var5);
    java.lang.Integer var10 = new java.lang.Integer(861);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var10);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.refaz((int)var10, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.imprime();

  }

  public void test81() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    var2.constroi();
    java.lang.Integer var4 = new java.lang.Integer(861);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
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

  public void test82() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.constroi();

  }

  public void test83() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    var2.imprime();

  }

  public void test84() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);

  }

  public void test85() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(861);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var2);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var2);
    java.lang.Integer var5 = new java.lang.Integer(861);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var5);
    java.lang.Integer var7 = new java.lang.Integer(489);
    java.lang.Integer var8 = new java.lang.Integer(939);
    var6.refaz((int)var7, (int)var8);
    ds.Item var10 = var6.min();
    ds.Item var11 = var6.min();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var2, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test86() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    ds.Item var6 = var1.min();
    var1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test87() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    var1.constroi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var7 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    java.lang.Integer var6 = new java.lang.Integer(861);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var6);
    java.lang.Integer var8 = new java.lang.Integer(654);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var8);
    var5.refaz((int)var6, (int)var8);

  }

  public void test89() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    var1.constroi();
    java.lang.Integer var7 = new java.lang.Integer(861);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    java.lang.Integer var9 = new java.lang.Integer(654);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.diminuiChave((int)var7, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test90() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var6 = var5.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var4 = var1.retiraMin();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = null;
    ds.Item[] var3 = new ds.Item[] { var2};
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    var1.copia(var3);
    ds.FPHeapMin var6 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var7 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var3);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var3);
    java.lang.Integer var13 = new java.lang.Integer(654);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var13);
    ds.FPHeapMin var15 = new ds.FPHeapMin(var13);
    java.lang.Integer var16 = new java.lang.Integer(654);
    ds.FPHeapMin var17 = new ds.FPHeapMin(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.diminuiChave((int)var13, (java.lang.Object)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
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
    assertTrue(var5 == null);

  }

  public void test94() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(654);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var0);
    java.lang.Integer var4 = new java.lang.Integer(861);
    ds.FPHeapMin var5 = new ds.FPHeapMin(var4);
    java.lang.Integer var6 = new java.lang.Integer(489);
    java.lang.Integer var7 = new java.lang.Integer(939);
    var5.refaz((int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(861);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    java.lang.Integer var11 = new java.lang.Integer(489);
    java.lang.Integer var12 = new java.lang.Integer(939);
    var10.refaz((int)var11, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.refaz((int)var7, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.FPHeapMin var2 = new ds.FPHeapMin(var0);
    java.lang.Integer var3 = new java.lang.Integer(861);
    ds.FPHeapMin var4 = new ds.FPHeapMin(var3);
    java.lang.Integer var5 = new java.lang.Integer(489);
    java.lang.Integer var6 = new java.lang.Integer(939);
    var4.refaz((int)var5, (int)var6);
    ds.Item var8 = var4.min();
    java.lang.Integer var9 = new java.lang.Integer(861);
    ds.FPHeapMin var10 = new ds.FPHeapMin(var9);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var9);
    java.lang.Integer var12 = new java.lang.Integer(654);
    ds.FPHeapMin var13 = new ds.FPHeapMin(var12);
    ds.FPHeapMin var14 = new ds.FPHeapMin(var12);
    var4.refaz((int)var9, (int)var12);
    java.lang.Integer var16 = new java.lang.Integer(654);
    ds.FPHeapMin var17 = new ds.FPHeapMin(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.diminuiChave((int)var9, (java.lang.Object)var16);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);

  }

  public void test96() throws Throwable {

    ds.Item var0 = null;
    ds.Item[] var1 = new ds.Item[] { var0};
    ds.FPHeapMin var2 = new ds.FPHeapMin(var1);
    ds.FPHeapMin var3 = new ds.FPHeapMin(var1);
    var3.imprime();
    var3.constroi();

  }

  public void test97() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    java.lang.Integer var2 = new java.lang.Integer(489);
    java.lang.Integer var3 = new java.lang.Integer(939);
    var1.refaz((int)var2, (int)var3);
    ds.Item var5 = var1.min();
    ds.Item var6 = var1.min();
    java.lang.Integer var7 = new java.lang.Integer(861);
    ds.FPHeapMin var8 = new ds.FPHeapMin(var7);
    ds.FPHeapMin var9 = new ds.FPHeapMin(var7);
    java.lang.Integer var10 = new java.lang.Integer(654);
    ds.FPHeapMin var11 = new ds.FPHeapMin(var10);
    ds.FPHeapMin var12 = new ds.FPHeapMin(var10);
    var1.refaz((int)var7, (int)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test98() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    var1.constroi();
    ds.Item var3 = var1.min();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test99() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(861);
    ds.FPHeapMin var1 = new ds.FPHeapMin(var0);
    ds.Item var2 = var1.min();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

}
