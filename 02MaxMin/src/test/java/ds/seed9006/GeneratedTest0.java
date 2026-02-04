package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.MaxMin1 var0 = new ds.MaxMin1();

  }

  public void test2() throws Throwable {

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

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = ds.MaxMin1.maxMin1(var9, (int)var10);
    int[] var12 = ds.MaxMin1.maxMin1(var5, (int)var10);
    int[] var13 = ds.MaxMin1.maxMin1(var2, (int)var10);

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(0);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer((-1));
    int[] var9 = ds.MaxMin1.maxMin1(var7, (int)var8);
    int[] var10 = ds.MaxMin1.maxMin1(var4, (int)var8);
    int[] var11 = ds.MaxMin1.maxMin1(var1, (int)var8);

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = ds.MaxMin1.maxMin1(var5, (int)var6);
    int[] var8 = ds.MaxMin1.maxMin1(var1, (int)var6);

  }

  public void test6() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    int[] var9 = ds.MaxMin1.maxMin1(var7, (int)var8);
    int[] var10 = ds.MaxMin1.maxMin1(var3, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var11 = ds.MaxMin1.maxMin1(var0, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    int[] var9 = ds.MaxMin1.maxMin1(var7, (int)var8);
    int[] var10 = ds.MaxMin1.maxMin1(var3, (int)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var11 = ds.MaxMin1.maxMin1(var0, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = ds.MaxMin1.maxMin1(var1, (int)var2);

  }

  public void test9() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = ds.MaxMin1.maxMin1(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = ds.MaxMin1.maxMin1(var4, (int)var5);
    int[] var7 = ds.MaxMin1.maxMin1(var1, (int)var5);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    int[] var8 = ds.MaxMin1.maxMin1(var6, (int)var7);
    int[] var9 = ds.MaxMin1.maxMin1(var2, (int)var7);

  }

}
