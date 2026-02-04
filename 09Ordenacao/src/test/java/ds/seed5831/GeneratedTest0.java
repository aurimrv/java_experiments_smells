package ds.seed5831;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5831 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Ordenacao var0 = new ds.Ordenacao();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var3, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(100);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var4, (int)var8);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { };
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var3, (int)var4, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var2, (int)var5);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(10);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var7, (int)var9);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var3, var4, var5};
    int[] var7 = new int[] { };
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var11, var12};
    int[] var14 = new int[] { };
    java.lang.Integer var15 = new java.lang.Integer(100);
    java.lang.Integer var16 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var13, (int)var15, (int)var18);
    ds.Ordenacao.mergeSort(var6, (int)var8, (int)var15);
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer((-1));
    java.lang.Integer var23 = new java.lang.Integer(1);
    int[] var24 = new int[] { var21, var22, var23};
    int[] var25 = new int[] { };
    java.lang.Integer var26 = new java.lang.Integer(100);
    java.lang.Integer var27 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var27);
    java.lang.Integer var29 = new java.lang.Integer(1);
    java.lang.Integer var30 = new java.lang.Integer(10);
    int[] var31 = new int[] { var29, var30};
    int[] var32 = new int[] { };
    java.lang.Integer var33 = new java.lang.Integer(100);
    java.lang.Integer var34 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var32, (int)var33, (int)var34);
    java.lang.Integer var36 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var31, (int)var33, (int)var36);
    ds.Ordenacao.mergeSort(var24, (int)var26, (int)var33);
    ds.Ordenacao.mergeSort(var2, (int)var15, (int)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var1, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var3, var4, var5};
    int[] var7 = new int[] { };
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var11, var12};
    int[] var14 = new int[] { };
    java.lang.Integer var15 = new java.lang.Integer(100);
    java.lang.Integer var16 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var13, (int)var15, (int)var18);
    ds.Ordenacao.mergeSort(var6, (int)var8, (int)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var2, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(100);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var8, var9, var10};
    int[] var12 = new int[] { };
    java.lang.Integer var13 = new java.lang.Integer(100);
    java.lang.Integer var14 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var16, var17};
    int[] var19 = new int[] { };
    java.lang.Integer var20 = new java.lang.Integer(100);
    java.lang.Integer var21 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var18, (int)var20, (int)var23);
    ds.Ordenacao.mergeSort(var11, (int)var13, (int)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var5, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    int[] var0 = new int[] { };
    int[] var1 = new int[] { };
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var1, (int)var2, (int)var3);
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(100);
    int[] var8 = new int[] { var5, var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer(10);
    int[] var11 = new int[] { var9, var10};
    int[] var12 = new int[] { };
    java.lang.Integer var13 = new java.lang.Integer(100);
    java.lang.Integer var14 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var11, (int)var13, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var8, (int)var16, (int)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var3, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    int[] var2 = new int[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var3, var4, var5};
    int[] var7 = new int[] { };
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var11, var12};
    int[] var14 = new int[] { };
    java.lang.Integer var15 = new java.lang.Integer(100);
    java.lang.Integer var16 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var13, (int)var15, (int)var18);
    ds.Ordenacao.mergeSort(var6, (int)var8, (int)var15);
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer((-1));
    java.lang.Integer var23 = new java.lang.Integer(1);
    int[] var24 = new int[] { var21, var22, var23};
    int[] var25 = new int[] { };
    java.lang.Integer var26 = new java.lang.Integer(100);
    java.lang.Integer var27 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var27);
    java.lang.Integer var29 = new java.lang.Integer(1);
    java.lang.Integer var30 = new java.lang.Integer(10);
    int[] var31 = new int[] { var29, var30};
    int[] var32 = new int[] { };
    java.lang.Integer var33 = new java.lang.Integer(100);
    java.lang.Integer var34 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var32, (int)var33, (int)var34);
    java.lang.Integer var36 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var31, (int)var33, (int)var36);
    ds.Ordenacao.mergeSort(var24, (int)var26, (int)var33);
    ds.Ordenacao.mergeSort(var2, (int)var15, (int)var26);
    java.lang.Integer var40 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var1, (int)var15, (int)var40);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(10);
    int[] var8 = new int[] { var6, var7};
    int[] var9 = new int[] { };
    java.lang.Integer var10 = new java.lang.Integer(100);
    java.lang.Integer var11 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var8, (int)var10, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var5, (int)var13, (int)var15);
    java.lang.Integer var17 = new java.lang.Integer(1);
    java.lang.Integer var18 = new java.lang.Integer((-1));
    java.lang.Integer var19 = new java.lang.Integer(1);
    int[] var20 = new int[] { var17, var18, var19};
    int[] var21 = new int[] { };
    java.lang.Integer var22 = new java.lang.Integer(100);
    java.lang.Integer var23 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(1);
    java.lang.Integer var26 = new java.lang.Integer(10);
    int[] var27 = new int[] { var25, var26};
    int[] var28 = new int[] { };
    java.lang.Integer var29 = new java.lang.Integer(100);
    java.lang.Integer var30 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var28, (int)var29, (int)var30);
    java.lang.Integer var32 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var27, (int)var29, (int)var32);
    ds.Ordenacao.mergeSort(var20, (int)var22, (int)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var15, (int)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var4, var5, var6};
    int[] var8 = new int[] { };
    java.lang.Integer var9 = new java.lang.Integer(100);
    java.lang.Integer var10 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer(10);
    int[] var14 = new int[] { var12, var13};
    int[] var15 = new int[] { };
    java.lang.Integer var16 = new java.lang.Integer(100);
    java.lang.Integer var17 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var14, (int)var16, (int)var19);
    ds.Ordenacao.mergeSort(var7, (int)var9, (int)var16);
    java.lang.Integer var22 = new java.lang.Integer((-1));
    java.lang.Integer var23 = new java.lang.Integer((-1));
    int[] var24 = new int[] { var22, var23};
    int[] var25 = new int[] { };
    java.lang.Integer var26 = new java.lang.Integer(1);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    java.lang.Integer var28 = new java.lang.Integer(1);
    int[] var29 = new int[] { var26, var27, var28};
    int[] var30 = new int[] { };
    java.lang.Integer var31 = new java.lang.Integer(100);
    java.lang.Integer var32 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(1);
    java.lang.Integer var35 = new java.lang.Integer(10);
    int[] var36 = new int[] { var34, var35};
    int[] var37 = new int[] { };
    java.lang.Integer var38 = new java.lang.Integer(100);
    java.lang.Integer var39 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var36, (int)var38, (int)var41);
    ds.Ordenacao.mergeSort(var29, (int)var31, (int)var38);
    java.lang.Integer var44 = new java.lang.Integer(1);
    java.lang.Integer var45 = new java.lang.Integer((-1));
    java.lang.Integer var46 = new java.lang.Integer(1);
    int[] var47 = new int[] { var44, var45, var46};
    int[] var48 = new int[] { };
    java.lang.Integer var49 = new java.lang.Integer(100);
    java.lang.Integer var50 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var48, (int)var49, (int)var50);
    java.lang.Integer var52 = new java.lang.Integer(1);
    java.lang.Integer var53 = new java.lang.Integer(10);
    int[] var54 = new int[] { var52, var53};
    int[] var55 = new int[] { };
    java.lang.Integer var56 = new java.lang.Integer(100);
    java.lang.Integer var57 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var55, (int)var56, (int)var57);
    java.lang.Integer var59 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var54, (int)var56, (int)var59);
    ds.Ordenacao.mergeSort(var47, (int)var49, (int)var56);
    ds.Ordenacao.mergeSort(var25, (int)var38, (int)var49);
    java.lang.Integer var63 = new java.lang.Integer(1);
    java.lang.Integer var64 = new java.lang.Integer(10);
    int[] var65 = new int[] { var63, var64};
    int[] var66 = new int[] { };
    java.lang.Integer var67 = new java.lang.Integer(100);
    java.lang.Integer var68 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var66, (int)var67, (int)var68);
    java.lang.Integer var70 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var65, (int)var67, (int)var70);
    ds.Ordenacao.mergeSort(var24, (int)var49, (int)var70);
    ds.Ordenacao.mergeSort(var3, (int)var9, (int)var70);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer(1);
    int[] var8 = new int[] { var5, var6, var7};
    int[] var9 = new int[] { };
    java.lang.Integer var10 = new java.lang.Integer(100);
    java.lang.Integer var11 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(10);
    int[] var15 = new int[] { var13, var14};
    int[] var16 = new int[] { };
    java.lang.Integer var17 = new java.lang.Integer(100);
    java.lang.Integer var18 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var15, (int)var17, (int)var20);
    ds.Ordenacao.mergeSort(var8, (int)var10, (int)var17);
    java.lang.Integer var23 = new java.lang.Integer(1);
    java.lang.Integer var24 = new java.lang.Integer((-1));
    java.lang.Integer var25 = new java.lang.Integer(1);
    int[] var26 = new int[] { var23, var24, var25};
    int[] var27 = new int[] { };
    java.lang.Integer var28 = new java.lang.Integer(100);
    java.lang.Integer var29 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var27, (int)var28, (int)var29);
    java.lang.Integer var31 = new java.lang.Integer(1);
    java.lang.Integer var32 = new java.lang.Integer(10);
    int[] var33 = new int[] { var31, var32};
    int[] var34 = new int[] { };
    java.lang.Integer var35 = new java.lang.Integer(100);
    java.lang.Integer var36 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var34, (int)var35, (int)var36);
    java.lang.Integer var38 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var33, (int)var35, (int)var38);
    ds.Ordenacao.mergeSort(var26, (int)var28, (int)var35);
    ds.Ordenacao.mergeSort(var4, (int)var17, (int)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var3, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(10);
    int[] var8 = new int[] { var6, var7};
    int[] var9 = new int[] { };
    java.lang.Integer var10 = new java.lang.Integer(100);
    java.lang.Integer var11 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var8, (int)var10, (int)var13);
    ds.Ordenacao.mergeSort(var4, (int)var5, (int)var10);
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var16, var17};
    int[] var19 = new int[] { };
    java.lang.Integer var20 = new java.lang.Integer(100);
    java.lang.Integer var21 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var18, (int)var20, (int)var23);
    ds.Ordenacao.mergeSort(var3, (int)var10, (int)var23);

  }

  public void test15() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(100);
    int[] var12 = new int[] { var10, var11};
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer(100);
    int[] var18 = new int[] { var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var20);
    ds.Ordenacao.mergeSort(var9, (int)var13, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var5, (int)var19);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(100);
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(0);
    java.lang.Integer var12 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(100);
    java.lang.Integer var15 = new java.lang.Integer(10);
    int[] var16 = new int[] { var14, var15};
    java.lang.Integer var17 = new java.lang.Integer(0);
    java.lang.Integer var18 = new java.lang.Integer(100);
    int[] var19 = new int[] { var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(0);
    java.lang.Integer var21 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer(100);
    int[] var25 = new int[] { var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var27);
    ds.Ordenacao.mergeSort(var16, (int)var20, (int)var26);
    ds.Ordenacao.mergeSort(var7, (int)var11, (int)var26);
    ds.Ordenacao.mergeSort(var3, (int)var4, (int)var26);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(100);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var7, var8};
    int[] var10 = new int[] { };
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var9, (int)var11, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var6, (int)var14, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(100);
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer(1);
    int[] var21 = new int[] { var18, var19, var20};
    int[] var22 = new int[] { };
    int[] var23 = new int[] { };
    java.lang.Integer var24 = new java.lang.Integer(100);
    java.lang.Integer var25 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var23, (int)var24, (int)var25);
    int[] var27 = new int[] { };
    java.lang.Integer var28 = new java.lang.Integer(100);
    java.lang.Integer var29 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var27, (int)var28, (int)var29);
    ds.Ordenacao.mergeSort(var22, (int)var24, (int)var28);
    java.lang.Integer var32 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var21, (int)var24, (int)var32);
    ds.Ordenacao.mergeSort(var2, (int)var16, (int)var32);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    int[] var3 = new int[] { };
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var4, var5};
    int[] var7 = new int[] { };
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var8, var9, var10};
    int[] var12 = new int[] { };
    java.lang.Integer var13 = new java.lang.Integer(100);
    java.lang.Integer var14 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var16, var17};
    int[] var19 = new int[] { };
    java.lang.Integer var20 = new java.lang.Integer(100);
    java.lang.Integer var21 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var18, (int)var20, (int)var23);
    ds.Ordenacao.mergeSort(var11, (int)var13, (int)var20);
    java.lang.Integer var26 = new java.lang.Integer(1);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    java.lang.Integer var28 = new java.lang.Integer(1);
    int[] var29 = new int[] { var26, var27, var28};
    int[] var30 = new int[] { };
    java.lang.Integer var31 = new java.lang.Integer(100);
    java.lang.Integer var32 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(1);
    java.lang.Integer var35 = new java.lang.Integer(10);
    int[] var36 = new int[] { var34, var35};
    int[] var37 = new int[] { };
    java.lang.Integer var38 = new java.lang.Integer(100);
    java.lang.Integer var39 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var36, (int)var38, (int)var41);
    ds.Ordenacao.mergeSort(var29, (int)var31, (int)var38);
    ds.Ordenacao.mergeSort(var7, (int)var20, (int)var31);
    java.lang.Integer var45 = new java.lang.Integer(1);
    java.lang.Integer var46 = new java.lang.Integer(10);
    int[] var47 = new int[] { var45, var46};
    int[] var48 = new int[] { };
    java.lang.Integer var49 = new java.lang.Integer(100);
    java.lang.Integer var50 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var48, (int)var49, (int)var50);
    java.lang.Integer var52 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var47, (int)var49, (int)var52);
    ds.Ordenacao.mergeSort(var6, (int)var31, (int)var52);
    java.lang.Integer var55 = new java.lang.Integer(0);
    java.lang.Integer var56 = new java.lang.Integer(100);
    int[] var57 = new int[] { var55, var56};
    java.lang.Integer var58 = new java.lang.Integer(0);
    java.lang.Integer var59 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var57, (int)var58, (int)var59);
    ds.Ordenacao.mergeSort(var3, (int)var31, (int)var58);
    java.lang.Integer var62 = new java.lang.Integer(0);
    java.lang.Integer var63 = new java.lang.Integer(0);
    int[] var64 = new int[] { var62, var63};
    java.lang.Integer var65 = new java.lang.Integer(0);
    java.lang.Integer var66 = new java.lang.Integer(100);
    int[] var67 = new int[] { var65, var66};
    java.lang.Integer var68 = new java.lang.Integer(0);
    java.lang.Integer var69 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var67, (int)var68, (int)var69);
    java.lang.Integer var71 = new java.lang.Integer(100);
    java.lang.Integer var72 = new java.lang.Integer(10);
    int[] var73 = new int[] { var71, var72};
    java.lang.Integer var74 = new java.lang.Integer(0);
    java.lang.Integer var75 = new java.lang.Integer(100);
    int[] var76 = new int[] { var74, var75};
    java.lang.Integer var77 = new java.lang.Integer(0);
    java.lang.Integer var78 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var76, (int)var77, (int)var78);
    java.lang.Integer var80 = new java.lang.Integer(0);
    java.lang.Integer var81 = new java.lang.Integer(100);
    int[] var82 = new int[] { var80, var81};
    java.lang.Integer var83 = new java.lang.Integer(0);
    java.lang.Integer var84 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var82, (int)var83, (int)var84);
    ds.Ordenacao.mergeSort(var73, (int)var77, (int)var83);
    ds.Ordenacao.mergeSort(var64, (int)var68, (int)var83);
    ds.Ordenacao.mergeSort(var2, (int)var58, (int)var83);

  }

}
