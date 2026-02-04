package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.MaxMin2 var0 = new ds.MaxMin2();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = ds.MaxMin2.maxMin2(var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(100);
    int[] var4 = new int[] { var1, var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = ds.MaxMin2.maxMin2(var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var7 = ds.MaxMin2.maxMin2(var0, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = ds.MaxMin2.maxMin2(var5, (int)var6);
    int[] var8 = ds.MaxMin2.maxMin2(var3, (int)var6);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var3 = ds.MaxMin2.maxMin2(var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = ds.MaxMin2.maxMin2(var2, (int)var3);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin2.maxMin2(var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = ds.MaxMin2.maxMin2(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    int[] var4 = ds.MaxMin2.maxMin2(var2, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = ds.MaxMin2.maxMin2(var0, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer((-1));
    int[] var4 = ds.MaxMin2.maxMin2(var2, (int)var3);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(100);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = ds.MaxMin2.maxMin2(var4, (int)var5);
    int[] var7 = ds.MaxMin2.maxMin2(var2, (int)var5);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = ds.MaxMin2.maxMin2(var2, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer((-1));
    int[] var9 = ds.MaxMin2.maxMin2(var7, (int)var8);
    int[] var10 = ds.MaxMin2.maxMin2(var4, (int)var8);
    int[] var11 = ds.MaxMin2.maxMin2(var2, (int)var8);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer((-1));
    int[] var8 = ds.MaxMin2.maxMin2(var6, (int)var7);
    int[] var9 = ds.MaxMin2.maxMin2(var3, (int)var7);

  }

  public void test15() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(100);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    int[] var8 = ds.MaxMin2.maxMin2(var6, (int)var7);
    int[] var9 = ds.MaxMin2.maxMin2(var2, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var10 = ds.MaxMin2.maxMin2(var0, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = ds.MaxMin2.maxMin2(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(100);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = ds.MaxMin2.maxMin2(var7, (int)var8);
    int[] var10 = ds.MaxMin2.maxMin2(var5, (int)var8);
    int[] var11 = ds.MaxMin2.maxMin2(var3, (int)var8);
    int[] var12 = ds.MaxMin2.maxMin2(var1, (int)var8);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer((-1));
    int[] var11 = ds.MaxMin2.maxMin2(var9, (int)var10);
    int[] var12 = ds.MaxMin2.maxMin2(var6, (int)var10);
    int[] var13 = ds.MaxMin2.maxMin2(var2, (int)var10);

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = ds.MaxMin2.maxMin2(var9, (int)var10);
    int[] var12 = ds.MaxMin2.maxMin2(var5, (int)var10);
    int[] var13 = ds.MaxMin2.maxMin2(var3, (int)var10);

  }

  public void test20() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var8};
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer(10);
    int[] var12 = new int[] { var10, var11};
    java.lang.Integer var13 = new java.lang.Integer((-1));
    int[] var14 = ds.MaxMin2.maxMin2(var12, (int)var13);
    int[] var15 = ds.MaxMin2.maxMin2(var9, (int)var13);
    int[] var16 = ds.MaxMin2.maxMin2(var7, (int)var13);
    int[] var17 = ds.MaxMin2.maxMin2(var3, (int)var13);

  }

  public void test21() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(10);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var12};
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer(10);
    int[] var16 = new int[] { var14, var15};
    java.lang.Integer var17 = new java.lang.Integer((-1));
    int[] var18 = ds.MaxMin2.maxMin2(var16, (int)var17);
    int[] var19 = ds.MaxMin2.maxMin2(var13, (int)var17);
    int[] var20 = ds.MaxMin2.maxMin2(var11, (int)var17);
    int[] var21 = ds.MaxMin2.maxMin2(var9, (int)var17);
    int[] var22 = ds.MaxMin2.maxMin2(var5, (int)var17);
    int[] var23 = ds.MaxMin2.maxMin2(var1, (int)var17);

  }

  public void test22() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = ds.MaxMin2.maxMin2(var3, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var6 = ds.MaxMin2.maxMin2(var0, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(100);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    int[] var11 = new int[] { var8, var9, var10};
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var12};
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer(10);
    int[] var16 = new int[] { var14, var15};
    java.lang.Integer var17 = new java.lang.Integer((-1));
    int[] var18 = ds.MaxMin2.maxMin2(var16, (int)var17);
    int[] var19 = ds.MaxMin2.maxMin2(var13, (int)var17);
    int[] var20 = ds.MaxMin2.maxMin2(var11, (int)var17);
    int[] var21 = ds.MaxMin2.maxMin2(var7, (int)var17);
    int[] var22 = ds.MaxMin2.maxMin2(var3, (int)var17);

  }

  public void test24() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer((-1));
    int[] var8 = ds.MaxMin2.maxMin2(var6, (int)var7);
    int[] var9 = ds.MaxMin2.maxMin2(var3, (int)var7);
    int[] var10 = ds.MaxMin2.maxMin2(var1, (int)var7);

  }

}
