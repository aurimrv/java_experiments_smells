package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.MaxMin4 var0 = new ds.MaxMin4();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin4.maxMin4(var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin4.maxMin4(var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = ds.MaxMin4.maxMin4(var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var10 = ds.MaxMin4.maxMin4(var3, (int)var7, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = ds.MaxMin4.maxMin4(var5, (int)var6, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var9 = ds.MaxMin4.maxMin4(var2, (int)var3, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = ds.MaxMin4.maxMin4(var6, (int)var7, (int)var8);
    int[] var10 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var8);
    java.lang.Integer var11 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var12 = ds.MaxMin4.maxMin4(var0, (int)var8, (int)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var8 = ds.MaxMin4.maxMin4(var1, (int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(0);
    int[] var10 = ds.MaxMin4.maxMin4(var7, (int)var8, (int)var9);
    int[] var11 = ds.MaxMin4.maxMin4(var4, (int)var5, (int)var9);
    java.lang.Integer var12 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var13 = ds.MaxMin4.maxMin4(var1, (int)var9, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = ds.MaxMin4.maxMin4(var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var9 = ds.MaxMin4.maxMin4(var2, (int)var5, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin4.maxMin4(var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var7 = ds.MaxMin4.maxMin4(var0, (int)var1, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = ds.MaxMin4.maxMin4(var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var9 = ds.MaxMin4.maxMin4(var2, (int)var5, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin4.maxMin4(var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = ds.MaxMin4.maxMin4(var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var7 = ds.MaxMin4.maxMin4(var0, (int)var3, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var8 = ds.MaxMin4.maxMin4(var1, (int)var5, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin4.maxMin4(var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(0);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(1);
    int[] var10 = new int[] { var9};
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer(0);
    int[] var13 = ds.MaxMin4.maxMin4(var10, (int)var11, (int)var12);
    int[] var14 = ds.MaxMin4.maxMin4(var7, (int)var8, (int)var12);
    java.lang.Integer var15 = new java.lang.Integer(1);
    int[] var16 = ds.MaxMin4.maxMin4(var4, (int)var8, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var18 = ds.MaxMin4.maxMin4(var1, (int)var15, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(1);
    int[] var9 = new int[] { var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(0);
    int[] var12 = ds.MaxMin4.maxMin4(var9, (int)var10, (int)var11);
    int[] var13 = ds.MaxMin4.maxMin4(var6, (int)var7, (int)var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int[] var15 = ds.MaxMin4.maxMin4(var3, (int)var7, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(10);
    java.lang.Integer var17 = new java.lang.Integer(1);
    int[] var18 = new int[] { var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer(1);
    int[] var21 = new int[] { var20};
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(0);
    int[] var24 = ds.MaxMin4.maxMin4(var21, (int)var22, (int)var23);
    int[] var25 = ds.MaxMin4.maxMin4(var18, (int)var19, (int)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var26 = ds.MaxMin4.maxMin4(var0, (int)var14, (int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(1);
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    int[] var13 = new int[] { var11, var12};
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(1);
    int[] var16 = new int[] { var15};
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(0);
    int[] var19 = ds.MaxMin4.maxMin4(var16, (int)var17, (int)var18);
    int[] var20 = ds.MaxMin4.maxMin4(var13, (int)var14, (int)var18);
    java.lang.Integer var21 = new java.lang.Integer((-1));
    java.lang.Integer var22 = new java.lang.Integer(0);
    int[] var23 = new int[] { var21, var22};
    java.lang.Integer var24 = new java.lang.Integer(10);
    java.lang.Integer var25 = new java.lang.Integer(1);
    int[] var26 = new int[] { var24, var25};
    java.lang.Integer var27 = new java.lang.Integer(0);
    java.lang.Integer var28 = new java.lang.Integer(1);
    int[] var29 = new int[] { var28};
    java.lang.Integer var30 = new java.lang.Integer(0);
    java.lang.Integer var31 = new java.lang.Integer(0);
    int[] var32 = ds.MaxMin4.maxMin4(var29, (int)var30, (int)var31);
    int[] var33 = ds.MaxMin4.maxMin4(var26, (int)var27, (int)var31);
    java.lang.Integer var34 = new java.lang.Integer(1);
    int[] var35 = ds.MaxMin4.maxMin4(var23, (int)var27, (int)var34);
    int[] var36 = ds.MaxMin4.maxMin4(var10, (int)var18, (int)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var37 = ds.MaxMin4.maxMin4(var1, (int)var4, (int)var34);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = ds.MaxMin4.maxMin4(var6, (int)var7, (int)var8);
    int[] var10 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var8);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(100);
    java.lang.Integer var13 = new java.lang.Integer((-1));
    int[] var14 = new int[] { var11, var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int[] var17 = new int[] { var16};
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer(0);
    int[] var20 = ds.MaxMin4.maxMin4(var17, (int)var18, (int)var19);
    int[] var21 = ds.MaxMin4.maxMin4(var14, (int)var15, (int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var22 = ds.MaxMin4.maxMin4(var0, (int)var8, (int)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(1);
    int[] var9 = new int[] { var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(0);
    int[] var12 = ds.MaxMin4.maxMin4(var9, (int)var10, (int)var11);
    int[] var13 = ds.MaxMin4.maxMin4(var6, (int)var7, (int)var10);
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer((-1));
    int[] var16 = new int[] { var14, var15};
    java.lang.Integer var17 = new java.lang.Integer(10);
    java.lang.Integer var18 = new java.lang.Integer(1);
    int[] var19 = new int[] { var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(0);
    java.lang.Integer var21 = new java.lang.Integer(1);
    int[] var22 = new int[] { var21};
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer(0);
    int[] var25 = ds.MaxMin4.maxMin4(var22, (int)var23, (int)var24);
    int[] var26 = ds.MaxMin4.maxMin4(var19, (int)var20, (int)var24);
    java.lang.Integer var27 = new java.lang.Integer(1);
    java.lang.Integer var28 = new java.lang.Integer(100);
    java.lang.Integer var29 = new java.lang.Integer((-1));
    int[] var30 = new int[] { var27, var28, var29};
    java.lang.Integer var31 = new java.lang.Integer(1);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int[] var33 = new int[] { var32};
    java.lang.Integer var34 = new java.lang.Integer(0);
    java.lang.Integer var35 = new java.lang.Integer(0);
    int[] var36 = ds.MaxMin4.maxMin4(var33, (int)var34, (int)var35);
    int[] var37 = ds.MaxMin4.maxMin4(var30, (int)var31, (int)var34);
    int[] var38 = ds.MaxMin4.maxMin4(var16, (int)var24, (int)var34);
    int[] var39 = ds.MaxMin4.maxMin4(var2, (int)var10, (int)var34);
    java.lang.Integer var40 = new java.lang.Integer(1);
    int[] var41 = new int[] { var40};
    java.lang.Integer var42 = new java.lang.Integer(0);
    java.lang.Integer var43 = new java.lang.Integer(0);
    int[] var44 = ds.MaxMin4.maxMin4(var41, (int)var42, (int)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var45 = ds.MaxMin4.maxMin4(var0, (int)var34, (int)var43);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = ds.MaxMin4.maxMin4(var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(1);
    int[] var8 = new int[] { var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(0);
    int[] var14 = ds.MaxMin4.maxMin4(var11, (int)var12, (int)var13);
    int[] var15 = ds.MaxMin4.maxMin4(var8, (int)var9, (int)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var16 = ds.MaxMin4.maxMin4(var0, (int)var4, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = ds.MaxMin4.maxMin4(var2, (int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = ds.MaxMin4.maxMin4(var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(1);
    int[] var13 = new int[] { var12};
    java.lang.Integer var14 = new java.lang.Integer(0);
    java.lang.Integer var15 = new java.lang.Integer(0);
    int[] var16 = ds.MaxMin4.maxMin4(var13, (int)var14, (int)var15);
    int[] var17 = ds.MaxMin4.maxMin4(var10, (int)var11, (int)var14);
    int[] var18 = ds.MaxMin4.maxMin4(var1, (int)var5, (int)var14);

  }

  public void test27() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = ds.MaxMin4.maxMin4(var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(1);
    int[] var10 = ds.MaxMin4.maxMin4(var3, (int)var7, (int)var9);

  }

  public void test28() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(1);
    int[] var8 = new int[] { var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(0);
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(0);
    int[] var14 = ds.MaxMin4.maxMin4(var11, (int)var12, (int)var13);
    int[] var15 = ds.MaxMin4.maxMin4(var8, (int)var9, (int)var13);
    java.lang.Integer var16 = new java.lang.Integer((-1));
    java.lang.Integer var17 = new java.lang.Integer(0);
    int[] var18 = new int[] { var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(10);
    java.lang.Integer var20 = new java.lang.Integer(1);
    int[] var21 = new int[] { var19, var20};
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer(1);
    int[] var24 = new int[] { var23};
    java.lang.Integer var25 = new java.lang.Integer(0);
    java.lang.Integer var26 = new java.lang.Integer(0);
    int[] var27 = ds.MaxMin4.maxMin4(var24, (int)var25, (int)var26);
    int[] var28 = ds.MaxMin4.maxMin4(var21, (int)var22, (int)var26);
    java.lang.Integer var29 = new java.lang.Integer(1);
    int[] var30 = ds.MaxMin4.maxMin4(var18, (int)var22, (int)var29);
    int[] var31 = ds.MaxMin4.maxMin4(var5, (int)var13, (int)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var32 = ds.MaxMin4.maxMin4(var0, (int)var1, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(1);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(1);
    int[] var12 = new int[] { var11};
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(0);
    int[] var15 = ds.MaxMin4.maxMin4(var12, (int)var13, (int)var14);
    int[] var16 = ds.MaxMin4.maxMin4(var9, (int)var10, (int)var14);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(0);
    int[] var19 = new int[] { var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(10);
    java.lang.Integer var21 = new java.lang.Integer(1);
    int[] var22 = new int[] { var20, var21};
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer(1);
    int[] var25 = new int[] { var24};
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer(0);
    int[] var28 = ds.MaxMin4.maxMin4(var25, (int)var26, (int)var27);
    int[] var29 = ds.MaxMin4.maxMin4(var22, (int)var23, (int)var27);
    java.lang.Integer var30 = new java.lang.Integer(1);
    int[] var31 = ds.MaxMin4.maxMin4(var19, (int)var23, (int)var30);
    int[] var32 = ds.MaxMin4.maxMin4(var6, (int)var14, (int)var30);
    java.lang.Integer var33 = new java.lang.Integer(10);
    java.lang.Integer var34 = new java.lang.Integer((-1));
    int[] var35 = new int[] { var33, var34};
    java.lang.Integer var36 = new java.lang.Integer(1);
    int[] var37 = new int[] { var36};
    java.lang.Integer var38 = new java.lang.Integer(0);
    java.lang.Integer var39 = new java.lang.Integer(0);
    int[] var40 = ds.MaxMin4.maxMin4(var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    int[] var42 = new int[] { var41};
    java.lang.Integer var43 = new java.lang.Integer(0);
    java.lang.Integer var44 = new java.lang.Integer(0);
    int[] var45 = ds.MaxMin4.maxMin4(var42, (int)var43, (int)var44);
    int[] var46 = ds.MaxMin4.maxMin4(var35, (int)var38, (int)var43);
    int[] var47 = ds.MaxMin4.maxMin4(var2, (int)var30, (int)var38);

  }

}
