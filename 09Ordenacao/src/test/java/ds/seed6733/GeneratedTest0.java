package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Ordenacao var0 = new ds.Ordenacao();

  }

  public void test2() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
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
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var1, (int)var2, (int)var3);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(10);
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var11);
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-1));
    java.lang.Integer var17 = new java.lang.Integer((-1));
    int[] var18 = new int[] { var15, var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(100);
    java.lang.Integer var20 = new java.lang.Integer(0);
    java.lang.Integer var21 = new java.lang.Integer(10);
    int[] var22 = new int[] { var20, var21};
    java.lang.Integer var23 = new java.lang.Integer(1);
    java.lang.Integer var24 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var22, (int)var23, (int)var24);
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var11, (int)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

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

  public void test6() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(100);
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var4, var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    java.lang.Integer var10 = new java.lang.Integer((-1));
    int[] var11 = new int[] { var8, var9, var10};
    java.lang.Integer var12 = new java.lang.Integer(100);
    java.lang.Integer var13 = new java.lang.Integer(0);
    java.lang.Integer var14 = new java.lang.Integer(10);
    int[] var15 = new int[] { var13, var14};
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var15, (int)var16, (int)var17);
    ds.Ordenacao.mergeSort(var11, (int)var12, (int)var16);
    java.lang.Integer var20 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var7, (int)var12, (int)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var3, (int)var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    int[] var0 = new int[] { };
    int[] var1 = new int[] { };
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(100);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(1);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var4, (int)var8, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var1, (int)var11, (int)var13);
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer((-1));
    int[] var17 = new int[] { var15, var16};
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer((-1));
    java.lang.Integer var20 = new java.lang.Integer((-1));
    int[] var21 = new int[] { var18, var19, var20};
    java.lang.Integer var22 = new java.lang.Integer(100);
    java.lang.Integer var23 = new java.lang.Integer(0);
    java.lang.Integer var24 = new java.lang.Integer(10);
    int[] var25 = new int[] { var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(1);
    java.lang.Integer var27 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var27);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var26);
    java.lang.Integer var30 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var17, (int)var22, (int)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var13, (int)var30);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(1);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(0);
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer((-1));
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(10);
    int[] var14 = new int[] { var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var15);
    java.lang.Integer var19 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var11, (int)var19);
    java.lang.Integer var21 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var3, (int)var11, (int)var21);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(0);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer((-1));
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(0);
    java.lang.Integer var9 = new java.lang.Integer(10);
    int[] var10 = new int[] { var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var12);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var11);
    java.lang.Integer var15 = new java.lang.Integer((-1));
    java.lang.Integer var16 = new java.lang.Integer(100);
    int[] var17 = new int[] { var15, var16};
    java.lang.Integer var18 = new java.lang.Integer(0);
    java.lang.Integer var19 = new java.lang.Integer(10);
    int[] var20 = new int[] { var18, var19};
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var20, (int)var21, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var17, (int)var21, (int)var24);
    ds.Ordenacao.mergeSort(var2, (int)var7, (int)var24);

  }

  public void test10() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer(10);
    int[] var5 = new int[] { var2, var3, var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(0);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    java.lang.Integer var9 = new java.lang.Integer((-1));
    int[] var10 = new int[] { var7, var8, var9};
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(0);
    java.lang.Integer var13 = new java.lang.Integer(10);
    int[] var14 = new int[] { var12, var13};
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var14, (int)var15, (int)var16);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var15);
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var15);
    ds.Ordenacao.mergeSort(var0, (int)var1, (int)var6);

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(100);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer((-1));
    java.lang.Integer var5 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var4, (int)var5);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer((-1));
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer((-1));
    java.lang.Integer var4 = new java.lang.Integer((-1));
    int[] var5 = new int[] { var3, var4};
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer(100);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    java.lang.Integer var12 = new java.lang.Integer((-1));
    int[] var13 = new int[] { var10, var11, var12};
    java.lang.Integer var14 = new java.lang.Integer(100);
    java.lang.Integer var15 = new java.lang.Integer(0);
    java.lang.Integer var16 = new java.lang.Integer(10);
    int[] var17 = new int[] { var15, var16};
    java.lang.Integer var18 = new java.lang.Integer(1);
    java.lang.Integer var19 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var17, (int)var18, (int)var19);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var18);
    java.lang.Integer var22 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var9, (int)var14, (int)var22);
    java.lang.Integer var24 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var5, (int)var14, (int)var24);
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer(10);
    int[] var28 = new int[] { var26, var27};
    java.lang.Integer var29 = new java.lang.Integer(1);
    java.lang.Integer var30 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var28, (int)var29, (int)var30);
    ds.Ordenacao.mergeSort(var2, (int)var24, (int)var29);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(0);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer((-1));
    int[] var8 = new int[] { var5, var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(100);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(10);
    int[] var12 = new int[] { var10, var11};
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var13);
    java.lang.Integer var17 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var4, (int)var9, (int)var17);
    java.lang.Integer var19 = new java.lang.Integer(0);
    java.lang.Integer var20 = new java.lang.Integer(100);
    int[] var21 = new int[] { var19, var20};
    java.lang.Integer var22 = new java.lang.Integer(0);
    java.lang.Integer var23 = new java.lang.Integer((-1));
    java.lang.Integer var24 = new java.lang.Integer((-1));
    int[] var25 = new int[] { var22, var23, var24};
    java.lang.Integer var26 = new java.lang.Integer(100);
    java.lang.Integer var27 = new java.lang.Integer(0);
    java.lang.Integer var28 = new java.lang.Integer(10);
    int[] var29 = new int[] { var27, var28};
    java.lang.Integer var30 = new java.lang.Integer(1);
    java.lang.Integer var31 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var29, (int)var30, (int)var31);
    ds.Ordenacao.mergeSort(var25, (int)var26, (int)var30);
    java.lang.Integer var34 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var21, (int)var26, (int)var34);
    ds.Ordenacao.mergeSort(var1, (int)var9, (int)var26);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int[] var1 = new int[] { var0};
    int[] var2 = new int[] { };
    int[] var3 = new int[] { };
    int[] var4 = new int[] { };
    java.lang.Integer var5 = new java.lang.Integer(0);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    java.lang.Integer var7 = new java.lang.Integer((-1));
    int[] var8 = new int[] { var5, var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(100);
    java.lang.Integer var10 = new java.lang.Integer(0);
    java.lang.Integer var11 = new java.lang.Integer(10);
    int[] var12 = new int[] { var10, var11};
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var12, (int)var13, (int)var14);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var13);
    java.lang.Integer var17 = new java.lang.Integer((-1));
    java.lang.Integer var18 = new java.lang.Integer(100);
    java.lang.Integer var19 = new java.lang.Integer(10);
    int[] var20 = new int[] { var17, var18, var19};
    java.lang.Integer var21 = new java.lang.Integer(0);
    java.lang.Integer var22 = new java.lang.Integer((-1));
    java.lang.Integer var23 = new java.lang.Integer((-1));
    int[] var24 = new int[] { var21, var22, var23};
    java.lang.Integer var25 = new java.lang.Integer(100);
    java.lang.Integer var26 = new java.lang.Integer(0);
    java.lang.Integer var27 = new java.lang.Integer(10);
    int[] var28 = new int[] { var26, var27};
    java.lang.Integer var29 = new java.lang.Integer(1);
    java.lang.Integer var30 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var28, (int)var29, (int)var30);
    ds.Ordenacao.mergeSort(var24, (int)var25, (int)var29);
    java.lang.Integer var33 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var20, (int)var25, (int)var33);
    ds.Ordenacao.mergeSort(var4, (int)var9, (int)var33);
    int[] var36 = new int[] { };
    java.lang.Integer var37 = new java.lang.Integer(0);
    java.lang.Integer var38 = new java.lang.Integer((-1));
    java.lang.Integer var39 = new java.lang.Integer((-1));
    int[] var40 = new int[] { var37, var38, var39};
    java.lang.Integer var41 = new java.lang.Integer(100);
    java.lang.Integer var42 = new java.lang.Integer(0);
    java.lang.Integer var43 = new java.lang.Integer(10);
    int[] var44 = new int[] { var42, var43};
    java.lang.Integer var45 = new java.lang.Integer(1);
    java.lang.Integer var46 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var44, (int)var45, (int)var46);
    ds.Ordenacao.mergeSort(var40, (int)var41, (int)var45);
    java.lang.Integer var49 = new java.lang.Integer((-1));
    java.lang.Integer var50 = new java.lang.Integer(100);
    java.lang.Integer var51 = new java.lang.Integer(10);
    int[] var52 = new int[] { var49, var50, var51};
    java.lang.Integer var53 = new java.lang.Integer(0);
    java.lang.Integer var54 = new java.lang.Integer((-1));
    java.lang.Integer var55 = new java.lang.Integer((-1));
    int[] var56 = new int[] { var53, var54, var55};
    java.lang.Integer var57 = new java.lang.Integer(100);
    java.lang.Integer var58 = new java.lang.Integer(0);
    java.lang.Integer var59 = new java.lang.Integer(10);
    int[] var60 = new int[] { var58, var59};
    java.lang.Integer var61 = new java.lang.Integer(1);
    java.lang.Integer var62 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var60, (int)var61, (int)var62);
    ds.Ordenacao.mergeSort(var56, (int)var57, (int)var61);
    java.lang.Integer var65 = new java.lang.Integer(100);
    ds.Ordenacao.mergeSort(var52, (int)var57, (int)var65);
    ds.Ordenacao.mergeSort(var36, (int)var41, (int)var65);
    ds.Ordenacao.mergeSort(var3, (int)var33, (int)var65);
    int[] var69 = new int[] { };
    java.lang.Integer var70 = new java.lang.Integer((-1));
    java.lang.Integer var71 = new java.lang.Integer(100);
    int[] var72 = new int[] { var70, var71};
    java.lang.Integer var73 = new java.lang.Integer(0);
    java.lang.Integer var74 = new java.lang.Integer(10);
    int[] var75 = new int[] { var73, var74};
    java.lang.Integer var76 = new java.lang.Integer(1);
    java.lang.Integer var77 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var75, (int)var76, (int)var77);
    java.lang.Integer var79 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var72, (int)var76, (int)var79);
    java.lang.Integer var81 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var69, (int)var79, (int)var81);
    ds.Ordenacao.mergeSort(var2, (int)var33, (int)var79);
    int[] var84 = new int[] { };
    java.lang.Integer var85 = new java.lang.Integer((-1));
    java.lang.Integer var86 = new java.lang.Integer(100);
    int[] var87 = new int[] { var85, var86};
    java.lang.Integer var88 = new java.lang.Integer(0);
    java.lang.Integer var89 = new java.lang.Integer(10);
    int[] var90 = new int[] { var88, var89};
    java.lang.Integer var91 = new java.lang.Integer(1);
    java.lang.Integer var92 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var90, (int)var91, (int)var92);
    java.lang.Integer var94 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var87, (int)var91, (int)var94);
    java.lang.Integer var96 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var84, (int)var94, (int)var96);
    ds.Ordenacao.mergeSort(var1, (int)var33, (int)var96);

  }

}
