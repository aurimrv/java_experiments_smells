package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.MaxMin1 var0 = new ds.MaxMin1();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin1.maxMin1(var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin1.maxMin1(var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = ds.MaxMin1.maxMin1(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var3 = ds.MaxMin1.maxMin1(var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = ds.MaxMin1.maxMin1(var3, (int)var4);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = ds.MaxMin1.maxMin1(var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    java.lang.Integer var6 = new java.lang.Integer(100);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer(10);
    int[] var11 = new int[] { var8, var9, var10};
    java.lang.Integer var12 = new java.lang.Integer(0);
    int[] var13 = ds.MaxMin1.maxMin1(var11, (int)var12);
    int[] var14 = ds.MaxMin1.maxMin1(var7, (int)var12);
    int[] var15 = ds.MaxMin1.maxMin1(var3, (int)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var16 = ds.MaxMin1.maxMin1(var0, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = ds.MaxMin1.maxMin1(var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    java.lang.Integer var6 = new java.lang.Integer(100);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer(10);
    int[] var11 = new int[] { var8, var9, var10};
    java.lang.Integer var12 = new java.lang.Integer(0);
    int[] var13 = ds.MaxMin1.maxMin1(var11, (int)var12);
    int[] var14 = ds.MaxMin1.maxMin1(var7, (int)var12);
    int[] var15 = ds.MaxMin1.maxMin1(var3, (int)var12);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = ds.MaxMin1.maxMin1(var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    int[] var11 = ds.MaxMin1.maxMin1(var9, (int)var10);
    int[] var12 = ds.MaxMin1.maxMin1(var5, (int)var10);
    int[] var13 = ds.MaxMin1.maxMin1(var1, (int)var10);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(10);
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var10, var11, var12};
    java.lang.Integer var14 = new java.lang.Integer(0);
    int[] var15 = ds.MaxMin1.maxMin1(var13, (int)var14);
    int[] var16 = ds.MaxMin1.maxMin1(var9, (int)var14);
    int[] var17 = ds.MaxMin1.maxMin1(var5, (int)var14);
    int[] var18 = ds.MaxMin1.maxMin1(var1, (int)var14);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(100);
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(10);
    java.lang.Integer var13 = new java.lang.Integer(10);
    int[] var14 = new int[] { var11, var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(0);
    int[] var16 = ds.MaxMin1.maxMin1(var14, (int)var15);
    int[] var17 = ds.MaxMin1.maxMin1(var10, (int)var15);
    int[] var18 = ds.MaxMin1.maxMin1(var6, (int)var15);
    int[] var19 = ds.MaxMin1.maxMin1(var2, (int)var15);

  }

  public void test15() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-1));
    java.lang.Integer var13 = new java.lang.Integer(100);
    int[] var14 = new int[] { var11, var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(10);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var15, var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(0);
    int[] var20 = ds.MaxMin1.maxMin1(var18, (int)var19);
    int[] var21 = ds.MaxMin1.maxMin1(var14, (int)var19);
    int[] var22 = ds.MaxMin1.maxMin1(var10, (int)var19);
    int[] var23 = ds.MaxMin1.maxMin1(var7, (int)var19);
    int[] var24 = ds.MaxMin1.maxMin1(var3, (int)var19);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = ds.MaxMin1.maxMin1(var7, (int)var8);
    int[] var10 = ds.MaxMin1.maxMin1(var4, (int)var8);
    int[] var11 = ds.MaxMin1.maxMin1(var1, (int)var8);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-1));
    java.lang.Integer var13 = new java.lang.Integer(100);
    int[] var14 = new int[] { var11, var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(10);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var15, var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(0);
    int[] var20 = ds.MaxMin1.maxMin1(var18, (int)var19);
    int[] var21 = ds.MaxMin1.maxMin1(var14, (int)var19);
    int[] var22 = ds.MaxMin1.maxMin1(var10, (int)var19);
    int[] var23 = ds.MaxMin1.maxMin1(var7, (int)var19);
    int[] var24 = ds.MaxMin1.maxMin1(var5, (int)var19);
    int[] var25 = ds.MaxMin1.maxMin1(var3, (int)var19);

  }

}
