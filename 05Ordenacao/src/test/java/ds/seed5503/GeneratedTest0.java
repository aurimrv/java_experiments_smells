package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Ordenacao var0 = new ds.Ordenacao();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var7, (int)var8);
    ds.Ordenacao.ordena(var5, (int)var8);
    ds.Ordenacao.ordena(var2, (int)var8);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var4, (int)var5);
    ds.Ordenacao.ordena(var3, (int)var5);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var8};
    java.lang.Integer var10 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var9, (int)var10);
    ds.Ordenacao.ordena(var7, (int)var10);
    ds.Ordenacao.ordena(var3, (int)var10);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var4, (int)var5);
    ds.Ordenacao.ordena(var3, (int)var5);

  }

  public void test14() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var2, (int)var3);
    ds.Ordenacao.ordena(var0, (int)var3);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Ordenacao.ordena(var3, (int)var4);
    ds.Ordenacao.ordena(var1, (int)var4);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var3, (int)var4);
    ds.Ordenacao.ordena(var1, (int)var4);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var11, (int)var12);
    ds.Ordenacao.ordena(var9, (int)var12);
    ds.Ordenacao.ordena(var6, (int)var12);
    ds.Ordenacao.ordena(var2, (int)var12);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    int[] var5 = new int[] { };
    java.lang.Integer var6 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var5, (int)var6);
    ds.Ordenacao.ordena(var4, (int)var6);
    ds.Ordenacao.ordena(var3, (int)var6);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var7, (int)var8);
    ds.Ordenacao.ordena(var5, (int)var8);
    ds.Ordenacao.ordena(var2, (int)var8);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.ordena(var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Ordenacao.ordena(var4, (int)var5);
    ds.Ordenacao.ordena(var3, (int)var5);

  }

  public void test22() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var3};
    int[] var5 = new int[] { };
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = new int[] { var6, var7, var8};
    int[] var10 = new int[] { };
    int[] var11 = new int[] { };
    java.lang.Integer var12 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var11, (int)var12);
    ds.Ordenacao.ordena(var10, (int)var12);
    ds.Ordenacao.ordena(var9, (int)var12);
    ds.Ordenacao.ordena(var5, (int)var12);
    ds.Ordenacao.ordena(var4, (int)var12);
    ds.Ordenacao.ordena(var2, (int)var12);

  }

  public void test23() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var2, (int)var3);
    ds.Ordenacao.ordena(var0, (int)var3);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = new int[] { var5, var6, var7};
    int[] var9 = new int[] { };
    int[] var10 = new int[] { };
    java.lang.Integer var11 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var10, (int)var11);
    ds.Ordenacao.ordena(var9, (int)var11);
    ds.Ordenacao.ordena(var8, (int)var11);
    ds.Ordenacao.ordena(var4, (int)var11);
    ds.Ordenacao.ordena(var3, (int)var11);

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    int[] var3 = new int[] { };
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Ordenacao.ordena(var3, (int)var4);
    ds.Ordenacao.ordena(var2, (int)var4);

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var4};
    int[] var6 = new int[] { };
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer(0);
    int[] var10 = new int[] { var7, var8, var9};
    int[] var11 = new int[] { };
    int[] var12 = new int[] { };
    java.lang.Integer var13 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var12, (int)var13);
    ds.Ordenacao.ordena(var11, (int)var13);
    ds.Ordenacao.ordena(var10, (int)var13);
    ds.Ordenacao.ordena(var6, (int)var13);
    ds.Ordenacao.ordena(var5, (int)var13);
    ds.Ordenacao.ordena(var3, (int)var13);

  }

  public void test27() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var4, var5, var6};
    int[] var8 = new int[] { };
    int[] var9 = new int[] { };
    java.lang.Integer var10 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var9, (int)var10);
    ds.Ordenacao.ordena(var8, (int)var10);
    ds.Ordenacao.ordena(var7, (int)var10);
    ds.Ordenacao.ordena(var3, (int)var10);
    ds.Ordenacao.ordena(var0, (int)var10);

  }

  public void test28() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var6, (int)var7);
    ds.Ordenacao.ordena(var4, (int)var7);
    ds.Ordenacao.ordena(var2, (int)var7);

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var5, (int)var6);
    ds.Ordenacao.ordena(var1, (int)var6);

  }

  public void test30() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    int[] var3 = new int[] { };
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var6};
    int[] var8 = new int[] { };
    java.lang.Integer var9 = new java.lang.Integer(100);
    int[] var10 = new int[] { var9};
    java.lang.Integer var11 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var10, (int)var11);
    ds.Ordenacao.ordena(var8, (int)var11);
    ds.Ordenacao.ordena(var7, (int)var11);
    ds.Ordenacao.ordena(var5, (int)var11);
    ds.Ordenacao.ordena(var3, (int)var11);
    ds.Ordenacao.ordena(var2, (int)var11);

  }

  public void test31() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(100);
    int[] var10 = new int[] { var7, var8, var9};
    int[] var11 = new int[] { };
    int[] var12 = new int[] { };
    java.lang.Integer var13 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var12, (int)var13);
    ds.Ordenacao.ordena(var11, (int)var13);
    ds.Ordenacao.ordena(var10, (int)var13);
    ds.Ordenacao.ordena(var6, (int)var13);
    ds.Ordenacao.ordena(var3, (int)var13);

  }

  public void test32() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var1};
    int[] var3 = new int[] { };
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Ordenacao.ordena(var3, (int)var4);
    ds.Ordenacao.ordena(var2, (int)var4);
    ds.Ordenacao.ordena(var0, (int)var4);

  }

  public void test33() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    int[] var7 = new int[] { var4, var5, var6};
    int[] var8 = new int[] { };
    java.lang.Integer var9 = new java.lang.Integer((-1));
    java.lang.Integer var10 = new java.lang.Integer(0);
    int[] var11 = new int[] { var9, var10};
    int[] var12 = new int[] { };
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(0);
    int[] var16 = new int[] { var13, var14, var15};
    int[] var17 = new int[] { };
    int[] var18 = new int[] { };
    java.lang.Integer var19 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var18, (int)var19);
    ds.Ordenacao.ordena(var17, (int)var19);
    ds.Ordenacao.ordena(var16, (int)var19);
    ds.Ordenacao.ordena(var12, (int)var19);
    ds.Ordenacao.ordena(var11, (int)var19);
    ds.Ordenacao.ordena(var8, (int)var19);
    ds.Ordenacao.ordena(var7, (int)var19);
    ds.Ordenacao.ordena(var3, (int)var19);

  }

  public void test34() throws Throwable {

    int[] var0 = new int[] { };
    int[] var1 = new int[] { };
    int[] var2 = new int[] { };
    int[] var3 = new int[] { };
    java.lang.Integer var4 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var3, (int)var4);
    ds.Ordenacao.ordena(var2, (int)var4);
    ds.Ordenacao.ordena(var1, (int)var4);
    ds.Ordenacao.ordena(var0, (int)var4);

  }

  public void test35() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Ordenacao.ordena(var9, (int)var10);
    ds.Ordenacao.ordena(var7, (int)var10);
    ds.Ordenacao.ordena(var5, (int)var10);
    ds.Ordenacao.ordena(var2, (int)var10);

  }

  public void test36() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = new int[] { var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(0);
    int[] var10 = new int[] { var9};
    int[] var11 = new int[] { };
    java.lang.Integer var12 = new java.lang.Integer(100);
    int[] var13 = new int[] { var12};
    java.lang.Integer var14 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var13, (int)var14);
    ds.Ordenacao.ordena(var11, (int)var14);
    ds.Ordenacao.ordena(var10, (int)var14);
    ds.Ordenacao.ordena(var8, (int)var14);
    ds.Ordenacao.ordena(var5, (int)var14);
    ds.Ordenacao.ordena(var1, (int)var14);

  }

  public void test37() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    int[] var2 = new int[] { };
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Ordenacao.ordena(var2, (int)var3);
    ds.Ordenacao.ordena(var1, (int)var3);

  }

  public void test38() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = new int[] { var4};
    int[] var6 = new int[] { };
    java.lang.Integer var7 = new java.lang.Integer(100);
    int[] var8 = new int[] { var7};
    java.lang.Integer var9 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var8, (int)var9);
    ds.Ordenacao.ordena(var6, (int)var9);
    ds.Ordenacao.ordena(var5, (int)var9);
    ds.Ordenacao.ordena(var3, (int)var9);
    ds.Ordenacao.ordena(var0, (int)var9);

  }

  public void test39() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = new int[] { var7};
    int[] var9 = new int[] { };
    java.lang.Integer var10 = new java.lang.Integer(100);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer((-1));
    ds.Ordenacao.ordena(var11, (int)var12);
    ds.Ordenacao.ordena(var9, (int)var12);
    ds.Ordenacao.ordena(var8, (int)var12);
    ds.Ordenacao.ordena(var6, (int)var12);
    ds.Ordenacao.ordena(var4, (int)var12);
    ds.Ordenacao.ordena(var3, (int)var12);

  }

}
