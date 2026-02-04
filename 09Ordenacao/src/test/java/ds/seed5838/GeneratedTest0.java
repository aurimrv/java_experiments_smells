package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Ordenacao var0 = new ds.Ordenacao();

  }

  public void test2() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    int[] var2 = new int[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var4, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var7, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var4, (int)var8, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var10, (int)var12);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(100);
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(10);
    java.lang.Integer var9 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var5, (int)var9, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var9, (int)var13);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(10);
    int[] var12 = new int[] { var11};
    java.lang.Integer var13 = new java.lang.Integer(10);
    java.lang.Integer var14 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    java.lang.Integer var16 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var10, (int)var14, (int)var16);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var14);
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(1);
    int[] var21 = new int[] { var19, var20};
    java.lang.Integer var22 = new java.lang.Integer(10);
    java.lang.Integer var23 = new java.lang.Integer(100);
    java.lang.Integer var24 = new java.lang.Integer(10);
    int[] var25 = new int[] { var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(10);
    int[] var27 = new int[] { var26};
    java.lang.Integer var28 = new java.lang.Integer(10);
    java.lang.Integer var29 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var27, (int)var28, (int)var29);
    java.lang.Integer var31 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var25, (int)var29, (int)var31);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var14, (int)var22);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(10);
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var2, var3, var4};
    int[] var6 = new int[] { };
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(10);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(10);
    java.lang.Integer var13 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var11, (int)var12, (int)var13);
    ds.Ordenacao.mergeSort(var5, (int)var8, (int)var13);
    java.lang.Integer var16 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var13, (int)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    int[] var2 = new int[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(100);
    java.lang.Integer var7 = new java.lang.Integer(10);
    int[] var8 = new int[] { var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(100);
    java.lang.Integer var10 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var4, (int)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var4, (int)var8, (int)var10);
    java.lang.Integer var12 = new java.lang.Integer((-1));
    java.lang.Integer var13 = new java.lang.Integer(10);
    java.lang.Integer var14 = new java.lang.Integer(1);
    int[] var15 = new int[] { var12, var13, var14};
    int[] var16 = new int[] { };
    java.lang.Integer var17 = new java.lang.Integer(1);
    java.lang.Integer var18 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var16, (int)var17, (int)var18);
    java.lang.Integer var20 = new java.lang.Integer(10);
    int[] var21 = new int[] { var20};
    java.lang.Integer var22 = new java.lang.Integer(10);
    java.lang.Integer var23 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var23);
    ds.Ordenacao.mergeSort(var15, (int)var18, (int)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var10, (int)var18);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(100);
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    java.lang.Integer var11 = new java.lang.Integer((-1));
    int[] var12 = new int[] { var10, var11};
    java.lang.Integer var13 = new java.lang.Integer(10);
    int[] var14 = new int[] { var13};
    java.lang.Integer var15 = new java.lang.Integer(10);
    java.lang.Integer var16 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    java.lang.Integer var18 = new java.lang.Integer(100);
    java.lang.Integer var19 = new java.lang.Integer(10);
    int[] var20 = new int[] { var18, var19};
    java.lang.Integer var21 = new java.lang.Integer(100);
    java.lang.Integer var22 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var20, (int)var21, (int)var22);
    ds.Ordenacao.mergeSort(var12, (int)var16, (int)var22);
    ds.Ordenacao.mergeSort(var3, (int)var8, (int)var16);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(100);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(10);
    java.lang.Integer var14 = new java.lang.Integer(100);
    java.lang.Integer var15 = new java.lang.Integer(1);
    int[] var16 = new int[] { var13, var14, var15};
    int[] var17 = new int[] { };
    int[] var18 = new int[] { };
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var20);
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer((-1));
    java.lang.Integer var24 = new java.lang.Integer(0);
    int[] var25 = new int[] { var22, var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(100);
    int[] var27 = new int[] { var26};
    java.lang.Integer var28 = new java.lang.Integer(100);
    java.lang.Integer var29 = new java.lang.Integer(10);
    int[] var30 = new int[] { var28, var29};
    java.lang.Integer var31 = new java.lang.Integer(100);
    java.lang.Integer var32 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var30, (int)var31, (int)var32);
    java.lang.Integer var34 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var27, (int)var32, (int)var34);
    java.lang.Integer var36 = new java.lang.Integer(100);
    java.lang.Integer var37 = new java.lang.Integer(10);
    int[] var38 = new int[] { var36, var37};
    java.lang.Integer var39 = new java.lang.Integer(100);
    java.lang.Integer var40 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var38, (int)var39, (int)var40);
    ds.Ordenacao.mergeSort(var25, (int)var34, (int)var40);
    ds.Ordenacao.mergeSort(var17, (int)var19, (int)var40);
    int[] var44 = new int[] { };
    java.lang.Integer var45 = new java.lang.Integer(1);
    java.lang.Integer var46 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var44, (int)var45, (int)var46);
    ds.Ordenacao.mergeSort(var16, (int)var40, (int)var46);
    ds.Ordenacao.mergeSort(var6, (int)var10, (int)var40);
    int[] var50 = new int[] { };
    java.lang.Integer var51 = new java.lang.Integer(1);
    java.lang.Integer var52 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var50, (int)var51, (int)var52);
    ds.Ordenacao.mergeSort(var4, (int)var40, (int)var52);
    java.lang.Integer var55 = new java.lang.Integer(1);
    java.lang.Integer var56 = new java.lang.Integer(1);
    int[] var57 = new int[] { var55, var56};
    java.lang.Integer var58 = new java.lang.Integer(10);
    java.lang.Integer var59 = new java.lang.Integer(100);
    java.lang.Integer var60 = new java.lang.Integer(10);
    int[] var61 = new int[] { var59, var60};
    java.lang.Integer var62 = new java.lang.Integer(10);
    int[] var63 = new int[] { var62};
    java.lang.Integer var64 = new java.lang.Integer(10);
    java.lang.Integer var65 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var63, (int)var64, (int)var65);
    java.lang.Integer var67 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var61, (int)var65, (int)var67);
    ds.Ordenacao.mergeSort(var57, (int)var58, (int)var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var40, (int)var58);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(1);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(1);
    int[] var13 = new int[] { var10, var11, var12};
    int[] var14 = new int[] { };
    int[] var15 = new int[] { };
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer((-1));
    java.lang.Integer var21 = new java.lang.Integer(0);
    int[] var22 = new int[] { var19, var20, var21};
    java.lang.Integer var23 = new java.lang.Integer(100);
    int[] var24 = new int[] { var23};
    java.lang.Integer var25 = new java.lang.Integer(100);
    java.lang.Integer var26 = new java.lang.Integer(10);
    int[] var27 = new int[] { var25, var26};
    java.lang.Integer var28 = new java.lang.Integer(100);
    java.lang.Integer var29 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var27, (int)var28, (int)var29);
    java.lang.Integer var31 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var24, (int)var29, (int)var31);
    java.lang.Integer var33 = new java.lang.Integer(100);
    java.lang.Integer var34 = new java.lang.Integer(10);
    int[] var35 = new int[] { var33, var34};
    java.lang.Integer var36 = new java.lang.Integer(100);
    java.lang.Integer var37 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var35, (int)var36, (int)var37);
    ds.Ordenacao.mergeSort(var22, (int)var31, (int)var37);
    ds.Ordenacao.mergeSort(var14, (int)var16, (int)var37);
    int[] var41 = new int[] { };
    java.lang.Integer var42 = new java.lang.Integer(1);
    java.lang.Integer var43 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var41, (int)var42, (int)var43);
    ds.Ordenacao.mergeSort(var13, (int)var37, (int)var43);
    ds.Ordenacao.mergeSort(var4, (int)var8, (int)var43);
    int[] var47 = new int[] { };
    java.lang.Integer var48 = new java.lang.Integer(1);
    java.lang.Integer var49 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var47, (int)var48, (int)var49);
    ds.Ordenacao.mergeSort(var1, (int)var8, (int)var49);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(0);
    int[] var7 = new int[] { var6};
    java.lang.Integer var8 = new java.lang.Integer(100);
    java.lang.Integer var9 = new java.lang.Integer(10);
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer(100);
    java.lang.Integer var16 = new java.lang.Integer(1);
    int[] var17 = new int[] { var14, var15, var16};
    int[] var18 = new int[] { };
    int[] var19 = new int[] { };
    java.lang.Integer var20 = new java.lang.Integer(1);
    java.lang.Integer var21 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var19, (int)var20, (int)var21);
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer((-1));
    java.lang.Integer var25 = new java.lang.Integer(0);
    int[] var26 = new int[] { var23, var24, var25};
    java.lang.Integer var27 = new java.lang.Integer(100);
    int[] var28 = new int[] { var27};
    java.lang.Integer var29 = new java.lang.Integer(100);
    java.lang.Integer var30 = new java.lang.Integer(10);
    int[] var31 = new int[] { var29, var30};
    java.lang.Integer var32 = new java.lang.Integer(100);
    java.lang.Integer var33 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var31, (int)var32, (int)var33);
    java.lang.Integer var35 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var28, (int)var33, (int)var35);
    java.lang.Integer var37 = new java.lang.Integer(100);
    java.lang.Integer var38 = new java.lang.Integer(10);
    int[] var39 = new int[] { var37, var38};
    java.lang.Integer var40 = new java.lang.Integer(100);
    java.lang.Integer var41 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var39, (int)var40, (int)var41);
    ds.Ordenacao.mergeSort(var26, (int)var35, (int)var41);
    ds.Ordenacao.mergeSort(var18, (int)var20, (int)var41);
    int[] var45 = new int[] { };
    java.lang.Integer var46 = new java.lang.Integer(1);
    java.lang.Integer var47 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var45, (int)var46, (int)var47);
    ds.Ordenacao.mergeSort(var17, (int)var41, (int)var47);
    ds.Ordenacao.mergeSort(var7, (int)var11, (int)var41);
    int[] var51 = new int[] { };
    java.lang.Integer var52 = new java.lang.Integer(1);
    java.lang.Integer var53 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var51, (int)var52, (int)var53);
    ds.Ordenacao.mergeSort(var5, (int)var41, (int)var53);
    int[] var56 = new int[] { };
    int[] var57 = new int[] { };
    java.lang.Integer var58 = new java.lang.Integer(1);
    java.lang.Integer var59 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var57, (int)var58, (int)var59);
    java.lang.Integer var61 = new java.lang.Integer(0);
    java.lang.Integer var62 = new java.lang.Integer((-1));
    java.lang.Integer var63 = new java.lang.Integer(0);
    int[] var64 = new int[] { var61, var62, var63};
    java.lang.Integer var65 = new java.lang.Integer(100);
    int[] var66 = new int[] { var65};
    java.lang.Integer var67 = new java.lang.Integer(100);
    java.lang.Integer var68 = new java.lang.Integer(10);
    int[] var69 = new int[] { var67, var68};
    java.lang.Integer var70 = new java.lang.Integer(100);
    java.lang.Integer var71 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var69, (int)var70, (int)var71);
    java.lang.Integer var73 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var66, (int)var71, (int)var73);
    java.lang.Integer var75 = new java.lang.Integer(100);
    java.lang.Integer var76 = new java.lang.Integer(10);
    int[] var77 = new int[] { var75, var76};
    java.lang.Integer var78 = new java.lang.Integer(100);
    java.lang.Integer var79 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var77, (int)var78, (int)var79);
    ds.Ordenacao.mergeSort(var64, (int)var73, (int)var79);
    ds.Ordenacao.mergeSort(var56, (int)var58, (int)var79);
    ds.Ordenacao.mergeSort(var3, (int)var41, (int)var58);

  }

}
