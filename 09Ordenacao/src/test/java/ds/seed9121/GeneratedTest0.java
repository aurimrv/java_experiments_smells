package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Ordenacao var0 = new ds.Ordenacao();

  }

  public void test2() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var1, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var5, (int)var9, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(0);
    int[] var16 = new int[] { var13, var14, var15};
    java.lang.Integer var17 = new java.lang.Integer(100);
    java.lang.Integer var18 = new java.lang.Integer(1);
    int[] var19 = new int[] { var18};
    java.lang.Integer var20 = new java.lang.Integer(100);
    java.lang.Integer var21 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    ds.Ordenacao.mergeSort(var16, (int)var17, (int)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var11, (int)var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(100);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(100);
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(10);
    java.lang.Integer var12 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var12);
    java.lang.Integer var15 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var7, (int)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(1);
    int[] var10 = new int[] { var9};
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var3, (int)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    java.lang.Integer var12 = new java.lang.Integer(100);
    int[] var13 = new int[] { var11, var12};
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var15);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var15);
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer((-1));
    java.lang.Integer var20 = new java.lang.Integer(100);
    int[] var21 = new int[] { var18, var19, var20};
    java.lang.Integer var22 = new java.lang.Integer(1);
    java.lang.Integer var23 = new java.lang.Integer((-1));
    java.lang.Integer var24 = new java.lang.Integer(100);
    int[] var25 = new int[] { var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(10);
    java.lang.Integer var27 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var27);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var27);
    ds.Ordenacao.mergeSort(var5, (int)var10, (int)var27);
    java.lang.Integer var31 = new java.lang.Integer(1);
    java.lang.Integer var32 = new java.lang.Integer(1);
    java.lang.Integer var33 = new java.lang.Integer(0);
    int[] var34 = new int[] { var31, var32, var33};
    java.lang.Integer var35 = new java.lang.Integer(100);
    java.lang.Integer var36 = new java.lang.Integer(1);
    int[] var37 = new int[] { var36};
    java.lang.Integer var38 = new java.lang.Integer(100);
    java.lang.Integer var39 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var37, (int)var38, (int)var39);
    ds.Ordenacao.mergeSort(var34, (int)var35, (int)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var27, (int)var38);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var11);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int[] var15 = new int[] { var14};
    java.lang.Integer var16 = new java.lang.Integer(100);
    java.lang.Integer var17 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var6, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(100);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(0);
    int[] var15 = new int[] { var12, var13, var14};
    java.lang.Integer var16 = new java.lang.Integer(100);
    java.lang.Integer var17 = new java.lang.Integer(1);
    int[] var18 = new int[] { var17};
    java.lang.Integer var19 = new java.lang.Integer(100);
    java.lang.Integer var20 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var20);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var19);
    java.lang.Integer var23 = new java.lang.Integer(1);
    java.lang.Integer var24 = new java.lang.Integer(1);
    java.lang.Integer var25 = new java.lang.Integer(0);
    int[] var26 = new int[] { var23, var24, var25};
    java.lang.Integer var27 = new java.lang.Integer(100);
    java.lang.Integer var28 = new java.lang.Integer(1);
    int[] var29 = new int[] { var28};
    java.lang.Integer var30 = new java.lang.Integer(100);
    java.lang.Integer var31 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var29, (int)var30, (int)var31);
    ds.Ordenacao.mergeSort(var26, (int)var27, (int)var30);
    ds.Ordenacao.mergeSort(var11, (int)var16, (int)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var7, (int)var30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    int[] var0 = new int[] { };
    int[] var1 = new int[] { };
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var11);
    java.lang.Integer var14 = new java.lang.Integer(0);
    int[] var15 = new int[] { var14};
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(100);
    int[] var19 = new int[] { var16, var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(1);
    java.lang.Integer var21 = new java.lang.Integer((-1));
    java.lang.Integer var22 = new java.lang.Integer(100);
    int[] var23 = new int[] { var21, var22};
    java.lang.Integer var24 = new java.lang.Integer(10);
    java.lang.Integer var25 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var23, (int)var24, (int)var25);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var25);
    java.lang.Integer var28 = new java.lang.Integer(0);
    java.lang.Integer var29 = new java.lang.Integer((-1));
    java.lang.Integer var30 = new java.lang.Integer(100);
    int[] var31 = new int[] { var28, var29, var30};
    java.lang.Integer var32 = new java.lang.Integer(1);
    java.lang.Integer var33 = new java.lang.Integer((-1));
    java.lang.Integer var34 = new java.lang.Integer(100);
    int[] var35 = new int[] { var33, var34};
    java.lang.Integer var36 = new java.lang.Integer(10);
    java.lang.Integer var37 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var35, (int)var36, (int)var37);
    ds.Ordenacao.mergeSort(var31, (int)var32, (int)var37);
    ds.Ordenacao.mergeSort(var15, (int)var20, (int)var37);
    ds.Ordenacao.mergeSort(var1, (int)var11, (int)var37);
    java.lang.Integer var42 = new java.lang.Integer(1);
    java.lang.Integer var43 = new java.lang.Integer(1);
    java.lang.Integer var44 = new java.lang.Integer(0);
    int[] var45 = new int[] { var42, var43, var44};
    java.lang.Integer var46 = new java.lang.Integer(100);
    java.lang.Integer var47 = new java.lang.Integer(1);
    int[] var48 = new int[] { var47};
    java.lang.Integer var49 = new java.lang.Integer(100);
    java.lang.Integer var50 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var48, (int)var49, (int)var50);
    ds.Ordenacao.mergeSort(var45, (int)var46, (int)var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var11, (int)var49);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    int[] var0 = new int[] { };
    int[] var1 = new int[] { };
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var11);
    java.lang.Integer var14 = new java.lang.Integer(0);
    int[] var15 = new int[] { var14};
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(100);
    int[] var19 = new int[] { var16, var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(1);
    java.lang.Integer var21 = new java.lang.Integer((-1));
    java.lang.Integer var22 = new java.lang.Integer(100);
    int[] var23 = new int[] { var21, var22};
    java.lang.Integer var24 = new java.lang.Integer(10);
    java.lang.Integer var25 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var23, (int)var24, (int)var25);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var25);
    java.lang.Integer var28 = new java.lang.Integer(0);
    java.lang.Integer var29 = new java.lang.Integer((-1));
    java.lang.Integer var30 = new java.lang.Integer(100);
    int[] var31 = new int[] { var28, var29, var30};
    java.lang.Integer var32 = new java.lang.Integer(1);
    java.lang.Integer var33 = new java.lang.Integer((-1));
    java.lang.Integer var34 = new java.lang.Integer(100);
    int[] var35 = new int[] { var33, var34};
    java.lang.Integer var36 = new java.lang.Integer(10);
    java.lang.Integer var37 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var35, (int)var36, (int)var37);
    ds.Ordenacao.mergeSort(var31, (int)var32, (int)var37);
    ds.Ordenacao.mergeSort(var15, (int)var20, (int)var37);
    ds.Ordenacao.mergeSort(var1, (int)var11, (int)var37);
    java.lang.Integer var42 = new java.lang.Integer((-1));
    int[] var43 = new int[] { var42};
    java.lang.Integer var44 = new java.lang.Integer(1);
    java.lang.Integer var45 = new java.lang.Integer(1);
    java.lang.Integer var46 = new java.lang.Integer(0);
    int[] var47 = new int[] { var44, var45, var46};
    java.lang.Integer var48 = new java.lang.Integer(100);
    java.lang.Integer var49 = new java.lang.Integer(1);
    int[] var50 = new int[] { var49};
    java.lang.Integer var51 = new java.lang.Integer(100);
    java.lang.Integer var52 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var50, (int)var51, (int)var52);
    ds.Ordenacao.mergeSort(var47, (int)var48, (int)var51);
    java.lang.Integer var55 = new java.lang.Integer(1);
    java.lang.Integer var56 = new java.lang.Integer(1);
    java.lang.Integer var57 = new java.lang.Integer(0);
    int[] var58 = new int[] { var55, var56, var57};
    java.lang.Integer var59 = new java.lang.Integer(100);
    java.lang.Integer var60 = new java.lang.Integer(1);
    int[] var61 = new int[] { var60};
    java.lang.Integer var62 = new java.lang.Integer(100);
    java.lang.Integer var63 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var61, (int)var62, (int)var63);
    ds.Ordenacao.mergeSort(var58, (int)var59, (int)var62);
    ds.Ordenacao.mergeSort(var43, (int)var48, (int)var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var11, (int)var48);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer(100);
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer((-1));
    java.lang.Integer var13 = new java.lang.Integer(100);
    int[] var14 = new int[] { var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(10);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var16);
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var11, (int)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var2, (int)var11);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(0);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    int[] var11 = new int[] { };
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer((-1));
    java.lang.Integer var14 = new java.lang.Integer(100);
    int[] var15 = new int[] { var12, var13, var14};
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(100);
    int[] var19 = new int[] { var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(10);
    java.lang.Integer var21 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var21);
    java.lang.Integer var24 = new java.lang.Integer(0);
    int[] var25 = new int[] { var24};
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    java.lang.Integer var28 = new java.lang.Integer(100);
    int[] var29 = new int[] { var26, var27, var28};
    java.lang.Integer var30 = new java.lang.Integer(1);
    java.lang.Integer var31 = new java.lang.Integer((-1));
    java.lang.Integer var32 = new java.lang.Integer(100);
    int[] var33 = new int[] { var31, var32};
    java.lang.Integer var34 = new java.lang.Integer(10);
    java.lang.Integer var35 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var33, (int)var34, (int)var35);
    ds.Ordenacao.mergeSort(var29, (int)var30, (int)var35);
    java.lang.Integer var38 = new java.lang.Integer(0);
    java.lang.Integer var39 = new java.lang.Integer((-1));
    java.lang.Integer var40 = new java.lang.Integer(100);
    int[] var41 = new int[] { var38, var39, var40};
    java.lang.Integer var42 = new java.lang.Integer(1);
    java.lang.Integer var43 = new java.lang.Integer((-1));
    java.lang.Integer var44 = new java.lang.Integer(100);
    int[] var45 = new int[] { var43, var44};
    java.lang.Integer var46 = new java.lang.Integer(10);
    java.lang.Integer var47 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var45, (int)var46, (int)var47);
    ds.Ordenacao.mergeSort(var41, (int)var42, (int)var47);
    ds.Ordenacao.mergeSort(var25, (int)var30, (int)var47);
    ds.Ordenacao.mergeSort(var11, (int)var21, (int)var47);
    ds.Ordenacao.mergeSort(var5, (int)var9, (int)var21);
    java.lang.Integer var53 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var21, (int)var53);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer(0);
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(1);
    int[] var13 = new int[] { var12};
    java.lang.Integer var14 = new java.lang.Integer(100);
    java.lang.Integer var15 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var15);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var14);
    java.lang.Integer var18 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var6, (int)var14, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer((-1));
    int[] var21 = new int[] { var20};
    java.lang.Integer var22 = new java.lang.Integer(1);
    java.lang.Integer var23 = new java.lang.Integer(1);
    java.lang.Integer var24 = new java.lang.Integer(0);
    int[] var25 = new int[] { var22, var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(100);
    java.lang.Integer var27 = new java.lang.Integer(1);
    int[] var28 = new int[] { var27};
    java.lang.Integer var29 = new java.lang.Integer(100);
    java.lang.Integer var30 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var28, (int)var29, (int)var30);
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var29);
    java.lang.Integer var33 = new java.lang.Integer(1);
    java.lang.Integer var34 = new java.lang.Integer(1);
    java.lang.Integer var35 = new java.lang.Integer(0);
    int[] var36 = new int[] { var33, var34, var35};
    java.lang.Integer var37 = new java.lang.Integer(100);
    java.lang.Integer var38 = new java.lang.Integer(1);
    int[] var39 = new int[] { var38};
    java.lang.Integer var40 = new java.lang.Integer(100);
    java.lang.Integer var41 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var39, (int)var40, (int)var41);
    ds.Ordenacao.mergeSort(var36, (int)var37, (int)var40);
    ds.Ordenacao.mergeSort(var21, (int)var26, (int)var40);
    ds.Ordenacao.mergeSort(var3, (int)var14, (int)var40);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    java.lang.Integer var8 = new java.lang.Integer(100);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var11);
    int[] var14 = new int[] { };
    java.lang.Integer var15 = new java.lang.Integer((-1));
    java.lang.Integer var16 = new java.lang.Integer(100);
    int[] var17 = new int[] { var15, var16};
    java.lang.Integer var18 = new java.lang.Integer(10);
    java.lang.Integer var19 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var17, (int)var18, (int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var14, (int)var18, (int)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var11, (int)var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(1);
    int[] var10 = new int[] { var9};
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var11);
    java.lang.Integer var15 = new java.lang.Integer(1);
    int[] var16 = new int[] { var15};
    java.lang.Integer var17 = new java.lang.Integer(100);
    java.lang.Integer var18 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var16, (int)var17, (int)var18);
    ds.Ordenacao.mergeSort(var3, (int)var11, (int)var17);
    java.lang.Integer var21 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var0, (int)var17, (int)var21);

  }

  public void test16() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    java.lang.Integer var6 = new java.lang.Integer(100);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    java.lang.Integer var10 = new java.lang.Integer(100);
    int[] var11 = new int[] { var9, var10};
    java.lang.Integer var12 = new java.lang.Integer(10);
    java.lang.Integer var13 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var11, (int)var12, (int)var13);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var13);
    java.lang.Integer var16 = new java.lang.Integer(0);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(100);
    int[] var19 = new int[] { var16, var17, var18};
    java.lang.Integer var20 = new java.lang.Integer(1);
    java.lang.Integer var21 = new java.lang.Integer((-1));
    java.lang.Integer var22 = new java.lang.Integer(100);
    int[] var23 = new int[] { var21, var22};
    java.lang.Integer var24 = new java.lang.Integer(10);
    java.lang.Integer var25 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var23, (int)var24, (int)var25);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var25);
    ds.Ordenacao.mergeSort(var3, (int)var8, (int)var25);
    java.lang.Integer var29 = new java.lang.Integer(100);
    java.lang.Integer var30 = new java.lang.Integer(1);
    java.lang.Integer var31 = new java.lang.Integer(100);
    int[] var32 = new int[] { var29, var30, var31};
    java.lang.Integer var33 = new java.lang.Integer(1);
    int[] var34 = new int[] { var33};
    java.lang.Integer var35 = new java.lang.Integer(100);
    java.lang.Integer var36 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var34, (int)var35, (int)var36);
    java.lang.Integer var38 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var32, (int)var36, (int)var38);
    ds.Ordenacao.mergeSort(var1, (int)var25, (int)var38);

  }

  public void test17() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(0);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    java.lang.Integer var12 = new java.lang.Integer(100);
    int[] var13 = new int[] { var10, var11, var12};
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer((-1));
    java.lang.Integer var16 = new java.lang.Integer(100);
    int[] var17 = new int[] { var15, var16};
    java.lang.Integer var18 = new java.lang.Integer(10);
    java.lang.Integer var19 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var17, (int)var18, (int)var19);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var19);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var9, (int)var14, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(10);
    java.lang.Integer var25 = new java.lang.Integer(1);
    int[] var26 = new int[] { var24, var25};
    java.lang.Integer var27 = new java.lang.Integer(1);
    java.lang.Integer var28 = new java.lang.Integer(1);
    java.lang.Integer var29 = new java.lang.Integer(0);
    int[] var30 = new int[] { var27, var28, var29};
    java.lang.Integer var31 = new java.lang.Integer(100);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int[] var33 = new int[] { var32};
    java.lang.Integer var34 = new java.lang.Integer(100);
    java.lang.Integer var35 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var33, (int)var34, (int)var35);
    ds.Ordenacao.mergeSort(var30, (int)var31, (int)var34);
    java.lang.Integer var38 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var26, (int)var34, (int)var38);
    ds.Ordenacao.mergeSort(var5, (int)var14, (int)var38);
    java.lang.Integer var41 = new java.lang.Integer(0);
    int[] var42 = new int[] { var41};
    java.lang.Integer var43 = new java.lang.Integer(0);
    java.lang.Integer var44 = new java.lang.Integer((-1));
    java.lang.Integer var45 = new java.lang.Integer(100);
    int[] var46 = new int[] { var43, var44, var45};
    java.lang.Integer var47 = new java.lang.Integer(1);
    java.lang.Integer var48 = new java.lang.Integer((-1));
    java.lang.Integer var49 = new java.lang.Integer(100);
    int[] var50 = new int[] { var48, var49};
    java.lang.Integer var51 = new java.lang.Integer(10);
    java.lang.Integer var52 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var50, (int)var51, (int)var52);
    ds.Ordenacao.mergeSort(var46, (int)var47, (int)var52);
    java.lang.Integer var55 = new java.lang.Integer(0);
    java.lang.Integer var56 = new java.lang.Integer((-1));
    java.lang.Integer var57 = new java.lang.Integer(100);
    int[] var58 = new int[] { var55, var56, var57};
    java.lang.Integer var59 = new java.lang.Integer(1);
    java.lang.Integer var60 = new java.lang.Integer((-1));
    java.lang.Integer var61 = new java.lang.Integer(100);
    int[] var62 = new int[] { var60, var61};
    java.lang.Integer var63 = new java.lang.Integer(10);
    java.lang.Integer var64 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var62, (int)var63, (int)var64);
    ds.Ordenacao.mergeSort(var58, (int)var59, (int)var64);
    ds.Ordenacao.mergeSort(var42, (int)var47, (int)var64);
    ds.Ordenacao.mergeSort(var1, (int)var14, (int)var64);

  }

  public void test18() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(100);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var5, (int)var9, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    int[] var14 = new int[] { var13};
    java.lang.Integer var15 = new java.lang.Integer(100);
    java.lang.Integer var16 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var11, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(0);
    int[] var8 = new int[] { var5, var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(100);
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(100);
    java.lang.Integer var13 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var11, (int)var12, (int)var13);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var12);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int[] var17 = new int[] { var16};
    java.lang.Integer var18 = new java.lang.Integer(100);
    java.lang.Integer var19 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var17, (int)var18, (int)var19);
    ds.Ordenacao.mergeSort(var4, (int)var12, (int)var18);
    java.lang.Integer var22 = new java.lang.Integer(1);
    int[] var23 = new int[] { var22};
    java.lang.Integer var24 = new java.lang.Integer(0);
    java.lang.Integer var25 = new java.lang.Integer(1);
    int[] var26 = new int[] { var24, var25};
    java.lang.Integer var27 = new java.lang.Integer(1);
    java.lang.Integer var28 = new java.lang.Integer(1);
    java.lang.Integer var29 = new java.lang.Integer(0);
    int[] var30 = new int[] { var27, var28, var29};
    java.lang.Integer var31 = new java.lang.Integer(100);
    java.lang.Integer var32 = new java.lang.Integer(1);
    int[] var33 = new int[] { var32};
    java.lang.Integer var34 = new java.lang.Integer(100);
    java.lang.Integer var35 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var33, (int)var34, (int)var35);
    ds.Ordenacao.mergeSort(var30, (int)var31, (int)var34);
    java.lang.Integer var38 = new java.lang.Integer(1);
    int[] var39 = new int[] { var38};
    java.lang.Integer var40 = new java.lang.Integer(100);
    java.lang.Integer var41 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var39, (int)var40, (int)var41);
    ds.Ordenacao.mergeSort(var26, (int)var34, (int)var40);
    java.lang.Integer var44 = new java.lang.Integer(1);
    int[] var45 = new int[] { var44};
    java.lang.Integer var46 = new java.lang.Integer(100);
    java.lang.Integer var47 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var45, (int)var46, (int)var47);
    ds.Ordenacao.mergeSort(var23, (int)var34, (int)var47);
    ds.Ordenacao.mergeSort(var1, (int)var18, (int)var47);

  }

  public void test20() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    java.lang.Integer var7 = new java.lang.Integer(1);
    int[] var8 = new int[] { var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(0);
    int[] var12 = new int[] { var9, var10, var11};
    java.lang.Integer var13 = new java.lang.Integer(100);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int[] var15 = new int[] { var14};
    java.lang.Integer var16 = new java.lang.Integer(100);
    java.lang.Integer var17 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var17);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var16);
    java.lang.Integer var20 = new java.lang.Integer(1);
    int[] var21 = new int[] { var20};
    java.lang.Integer var22 = new java.lang.Integer(100);
    java.lang.Integer var23 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var23);
    ds.Ordenacao.mergeSort(var8, (int)var16, (int)var22);
    java.lang.Integer var26 = new java.lang.Integer(1);
    int[] var27 = new int[] { var26};
    java.lang.Integer var28 = new java.lang.Integer(100);
    java.lang.Integer var29 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var27, (int)var28, (int)var29);
    ds.Ordenacao.mergeSort(var5, (int)var16, (int)var29);
    ds.Ordenacao.mergeSort(var2, (int)var3, (int)var29);
    java.lang.Integer var33 = new java.lang.Integer(10);
    java.lang.Integer var34 = new java.lang.Integer(1);
    int[] var35 = new int[] { var33, var34};
    java.lang.Integer var36 = new java.lang.Integer(1);
    java.lang.Integer var37 = new java.lang.Integer(1);
    java.lang.Integer var38 = new java.lang.Integer(0);
    int[] var39 = new int[] { var36, var37, var38};
    java.lang.Integer var40 = new java.lang.Integer(100);
    java.lang.Integer var41 = new java.lang.Integer(1);
    int[] var42 = new int[] { var41};
    java.lang.Integer var43 = new java.lang.Integer(100);
    java.lang.Integer var44 = new java.lang.Integer(10);
    ds.Ordenacao.mergeSort(var42, (int)var43, (int)var44);
    ds.Ordenacao.mergeSort(var39, (int)var40, (int)var43);
    java.lang.Integer var47 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var35, (int)var43, (int)var47);
    ds.Ordenacao.mergeSort(var0, (int)var29, (int)var47);

  }

}
