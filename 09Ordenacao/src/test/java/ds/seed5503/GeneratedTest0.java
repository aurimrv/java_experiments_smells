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

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var1, (int)var2);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    java.lang.Integer var2 = new java.lang.Integer(10);
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var4, (int)var5, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var1, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var2, (int)var3, (int)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    java.lang.Integer var7 = new java.lang.Integer(10);
    int[] var8 = new int[] { var6, var7};
    java.lang.Integer var9 = new java.lang.Integer(10);
    java.lang.Integer var10 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var4, (int)var9);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer((-1));
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(1);
    int[] var5 = new int[] { var4};
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var5, (int)var6, (int)var7);
    java.lang.Integer var9 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var3, (int)var7, (int)var9);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    java.lang.Integer var2 = new java.lang.Integer(10);
    int[] var3 = new int[] { var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var3, (int)var4, (int)var5);
    java.lang.Integer var7 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var4, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    java.lang.Integer var2 = new java.lang.Integer(100);
    java.lang.Integer var3 = new java.lang.Integer(0);
    int[] var4 = new int[] { var1, var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    int[] var7 = new int[] { var5, var6};
    int[] var8 = new int[] { };
    java.lang.Integer var9 = new java.lang.Integer(1);
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(1);
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var10, var11, var12};
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var15);
    ds.Ordenacao.mergeSort(var8, (int)var9, (int)var15);
    int[] var18 = new int[] { };
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(1);
    java.lang.Integer var21 = new java.lang.Integer(1);
    java.lang.Integer var22 = new java.lang.Integer(10);
    int[] var23 = new int[] { var20, var21, var22};
    java.lang.Integer var24 = new java.lang.Integer(1);
    java.lang.Integer var25 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var23, (int)var24, (int)var25);
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var25);
    ds.Ordenacao.mergeSort(var7, (int)var15, (int)var19);
    java.lang.Integer var29 = new java.lang.Integer(10);
    java.lang.Integer var30 = new java.lang.Integer(10);
    java.lang.Integer var31 = new java.lang.Integer(100);
    int[] var32 = new int[] { var29, var30, var31};
    java.lang.Integer var33 = new java.lang.Integer(1);
    int[] var34 = new int[] { var33};
    java.lang.Integer var35 = new java.lang.Integer(10);
    java.lang.Integer var36 = new java.lang.Integer(10);
    int[] var37 = new int[] { var35, var36};
    java.lang.Integer var38 = new java.lang.Integer(10);
    java.lang.Integer var39 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var37, (int)var38, (int)var39);
    java.lang.Integer var41 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var34, (int)var38, (int)var41);
    java.lang.Integer var43 = new java.lang.Integer((-1));
    java.lang.Integer var44 = new java.lang.Integer(100);
    int[] var45 = new int[] { var43, var44};
    java.lang.Integer var46 = new java.lang.Integer(1);
    int[] var47 = new int[] { var46};
    java.lang.Integer var48 = new java.lang.Integer(1);
    java.lang.Integer var49 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var47, (int)var48, (int)var49);
    java.lang.Integer var51 = new java.lang.Integer(10);
    java.lang.Integer var52 = new java.lang.Integer((-1));
    int[] var53 = new int[] { var51, var52};
    int[] var54 = new int[] { };
    java.lang.Integer var55 = new java.lang.Integer(1);
    java.lang.Integer var56 = new java.lang.Integer(1);
    java.lang.Integer var57 = new java.lang.Integer(1);
    java.lang.Integer var58 = new java.lang.Integer(10);
    int[] var59 = new int[] { var56, var57, var58};
    java.lang.Integer var60 = new java.lang.Integer(1);
    java.lang.Integer var61 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var59, (int)var60, (int)var61);
    ds.Ordenacao.mergeSort(var54, (int)var55, (int)var61);
    int[] var64 = new int[] { };
    java.lang.Integer var65 = new java.lang.Integer(1);
    java.lang.Integer var66 = new java.lang.Integer(1);
    java.lang.Integer var67 = new java.lang.Integer(1);
    java.lang.Integer var68 = new java.lang.Integer(10);
    int[] var69 = new int[] { var66, var67, var68};
    java.lang.Integer var70 = new java.lang.Integer(1);
    java.lang.Integer var71 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var69, (int)var70, (int)var71);
    ds.Ordenacao.mergeSort(var64, (int)var65, (int)var71);
    ds.Ordenacao.mergeSort(var53, (int)var61, (int)var65);
    ds.Ordenacao.mergeSort(var45, (int)var48, (int)var61);
    ds.Ordenacao.mergeSort(var32, (int)var41, (int)var48);
    ds.Ordenacao.mergeSort(var4, (int)var19, (int)var48);
    int[] var78 = new int[] { };
    java.lang.Integer var79 = new java.lang.Integer(1);
    java.lang.Integer var80 = new java.lang.Integer(1);
    java.lang.Integer var81 = new java.lang.Integer(1);
    java.lang.Integer var82 = new java.lang.Integer(10);
    int[] var83 = new int[] { var80, var81, var82};
    java.lang.Integer var84 = new java.lang.Integer(1);
    java.lang.Integer var85 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var83, (int)var84, (int)var85);
    ds.Ordenacao.mergeSort(var78, (int)var79, (int)var85);
    ds.Ordenacao.mergeSort(var0, (int)var48, (int)var85);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(100);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var4, (int)var5, (int)var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    java.lang.Integer var9 = new java.lang.Integer((-1));
    int[] var10 = new int[] { var8, var9};
    int[] var11 = new int[] { };
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer(1);
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(10);
    int[] var16 = new int[] { var13, var14, var15};
    java.lang.Integer var17 = new java.lang.Integer(1);
    java.lang.Integer var18 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var16, (int)var17, (int)var18);
    ds.Ordenacao.mergeSort(var11, (int)var12, (int)var18);
    int[] var21 = new int[] { };
    java.lang.Integer var22 = new java.lang.Integer(1);
    java.lang.Integer var23 = new java.lang.Integer(1);
    java.lang.Integer var24 = new java.lang.Integer(1);
    java.lang.Integer var25 = new java.lang.Integer(10);
    int[] var26 = new int[] { var23, var24, var25};
    java.lang.Integer var27 = new java.lang.Integer(1);
    java.lang.Integer var28 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var26, (int)var27, (int)var28);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var28);
    ds.Ordenacao.mergeSort(var10, (int)var18, (int)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var2, (int)var6, (int)var22);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    java.lang.Integer var4 = new java.lang.Integer(1);
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var3, var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(1);
    int[] var11 = new int[] { var10};
    java.lang.Integer var12 = new java.lang.Integer(1);
    java.lang.Integer var13 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var11, (int)var12, (int)var13);
    ds.Ordenacao.mergeSort(var2, (int)var7, (int)var12);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer((-1));
    java.lang.Integer var3 = new java.lang.Integer(100);
    int[] var4 = new int[] { var2, var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    int[] var6 = new int[] { var5};
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    java.lang.Integer var10 = new java.lang.Integer(10);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    int[] var12 = new int[] { var10, var11};
    int[] var13 = new int[] { };
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var15, var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var20);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var20);
    int[] var23 = new int[] { };
    java.lang.Integer var24 = new java.lang.Integer(1);
    java.lang.Integer var25 = new java.lang.Integer(1);
    java.lang.Integer var26 = new java.lang.Integer(1);
    java.lang.Integer var27 = new java.lang.Integer(10);
    int[] var28 = new int[] { var25, var26, var27};
    java.lang.Integer var29 = new java.lang.Integer(1);
    java.lang.Integer var30 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var28, (int)var29, (int)var30);
    ds.Ordenacao.mergeSort(var23, (int)var24, (int)var30);
    ds.Ordenacao.mergeSort(var12, (int)var20, (int)var24);
    ds.Ordenacao.mergeSort(var4, (int)var7, (int)var20);
    java.lang.Integer var35 = new java.lang.Integer((-1));
    java.lang.Integer var36 = new java.lang.Integer(100);
    int[] var37 = new int[] { var35, var36};
    java.lang.Integer var38 = new java.lang.Integer(1);
    int[] var39 = new int[] { var38};
    java.lang.Integer var40 = new java.lang.Integer(1);
    java.lang.Integer var41 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var39, (int)var40, (int)var41);
    java.lang.Integer var43 = new java.lang.Integer(10);
    java.lang.Integer var44 = new java.lang.Integer((-1));
    int[] var45 = new int[] { var43, var44};
    int[] var46 = new int[] { };
    java.lang.Integer var47 = new java.lang.Integer(1);
    java.lang.Integer var48 = new java.lang.Integer(1);
    java.lang.Integer var49 = new java.lang.Integer(1);
    java.lang.Integer var50 = new java.lang.Integer(10);
    int[] var51 = new int[] { var48, var49, var50};
    java.lang.Integer var52 = new java.lang.Integer(1);
    java.lang.Integer var53 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var51, (int)var52, (int)var53);
    ds.Ordenacao.mergeSort(var46, (int)var47, (int)var53);
    int[] var56 = new int[] { };
    java.lang.Integer var57 = new java.lang.Integer(1);
    java.lang.Integer var58 = new java.lang.Integer(1);
    java.lang.Integer var59 = new java.lang.Integer(1);
    java.lang.Integer var60 = new java.lang.Integer(10);
    int[] var61 = new int[] { var58, var59, var60};
    java.lang.Integer var62 = new java.lang.Integer(1);
    java.lang.Integer var63 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var61, (int)var62, (int)var63);
    ds.Ordenacao.mergeSort(var56, (int)var57, (int)var63);
    ds.Ordenacao.mergeSort(var45, (int)var53, (int)var57);
    ds.Ordenacao.mergeSort(var37, (int)var40, (int)var53);
    ds.Ordenacao.mergeSort(var1, (int)var20, (int)var40);

  }

  public void test11() throws Throwable {

    int[] var0 = new int[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    java.lang.Integer var2 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.mergeSort(var0, (int)var1, (int)var2);
      fail("Expected exception of type java.lang.StackOverflowError");
    } catch (java.lang.StackOverflowError e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int[] var1 = new int[] { var0};
    java.lang.Integer var2 = new java.lang.Integer(1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(1);
    java.lang.Integer var6 = new java.lang.Integer(1);
    java.lang.Integer var7 = new java.lang.Integer(1);
    java.lang.Integer var8 = new java.lang.Integer(10);
    int[] var9 = new int[] { var6, var7, var8};
    java.lang.Integer var10 = new java.lang.Integer(1);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var9, (int)var10, (int)var11);
    ds.Ordenacao.mergeSort(var4, (int)var5, (int)var10);
    ds.Ordenacao.mergeSort(var1, (int)var2, (int)var5);

  }

  public void test13() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    java.lang.Integer var1 = new java.lang.Integer(100);
    java.lang.Integer var2 = new java.lang.Integer(0);
    int[] var3 = new int[] { var0, var1, var2};
    java.lang.Integer var4 = new java.lang.Integer(10);
    java.lang.Integer var5 = new java.lang.Integer(10);
    int[] var6 = new int[] { var4, var5};
    java.lang.Integer var7 = new java.lang.Integer(10);
    java.lang.Integer var8 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var6, (int)var7, (int)var8);
    int[] var10 = new int[] { };
    java.lang.Integer var11 = new java.lang.Integer(100);
    java.lang.Integer var12 = new java.lang.Integer(10);
    int[] var13 = new int[] { var12};
    java.lang.Integer var14 = new java.lang.Integer(1);
    java.lang.Integer var15 = new java.lang.Integer(1);
    java.lang.Integer var16 = new java.lang.Integer(1);
    java.lang.Integer var17 = new java.lang.Integer(10);
    int[] var18 = new int[] { var15, var16, var17};
    java.lang.Integer var19 = new java.lang.Integer(1);
    java.lang.Integer var20 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var18, (int)var19, (int)var20);
    ds.Ordenacao.mergeSort(var13, (int)var14, (int)var19);
    ds.Ordenacao.mergeSort(var10, (int)var11, (int)var19);
    ds.Ordenacao.mergeSort(var3, (int)var8, (int)var19);

  }

  public void test14() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    java.lang.Integer var1 = new java.lang.Integer(1);
    int[] var2 = new int[] { var0, var1};
    java.lang.Integer var3 = new java.lang.Integer(1);
    int[] var4 = new int[] { var3};
    java.lang.Integer var5 = new java.lang.Integer(10);
    java.lang.Integer var6 = new java.lang.Integer(10);
    int[] var7 = new int[] { var5, var6};
    java.lang.Integer var8 = new java.lang.Integer(10);
    java.lang.Integer var9 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var7, (int)var8, (int)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var4, (int)var8, (int)var11);
    java.lang.Integer var13 = new java.lang.Integer(10);
    java.lang.Integer var14 = new java.lang.Integer(10);
    java.lang.Integer var15 = new java.lang.Integer(100);
    int[] var16 = new int[] { var13, var14, var15};
    java.lang.Integer var17 = new java.lang.Integer(1);
    int[] var18 = new int[] { var17};
    java.lang.Integer var19 = new java.lang.Integer(10);
    java.lang.Integer var20 = new java.lang.Integer(10);
    int[] var21 = new int[] { var19, var20};
    java.lang.Integer var22 = new java.lang.Integer(10);
    java.lang.Integer var23 = new java.lang.Integer(0);
    ds.Ordenacao.mergeSort(var21, (int)var22, (int)var23);
    java.lang.Integer var25 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var18, (int)var22, (int)var25);
    java.lang.Integer var27 = new java.lang.Integer((-1));
    java.lang.Integer var28 = new java.lang.Integer(100);
    int[] var29 = new int[] { var27, var28};
    java.lang.Integer var30 = new java.lang.Integer(1);
    int[] var31 = new int[] { var30};
    java.lang.Integer var32 = new java.lang.Integer(1);
    java.lang.Integer var33 = new java.lang.Integer((-1));
    ds.Ordenacao.mergeSort(var31, (int)var32, (int)var33);
    java.lang.Integer var35 = new java.lang.Integer(10);
    java.lang.Integer var36 = new java.lang.Integer((-1));
    int[] var37 = new int[] { var35, var36};
    int[] var38 = new int[] { };
    java.lang.Integer var39 = new java.lang.Integer(1);
    java.lang.Integer var40 = new java.lang.Integer(1);
    java.lang.Integer var41 = new java.lang.Integer(1);
    java.lang.Integer var42 = new java.lang.Integer(10);
    int[] var43 = new int[] { var40, var41, var42};
    java.lang.Integer var44 = new java.lang.Integer(1);
    java.lang.Integer var45 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var43, (int)var44, (int)var45);
    ds.Ordenacao.mergeSort(var38, (int)var39, (int)var45);
    int[] var48 = new int[] { };
    java.lang.Integer var49 = new java.lang.Integer(1);
    java.lang.Integer var50 = new java.lang.Integer(1);
    java.lang.Integer var51 = new java.lang.Integer(1);
    java.lang.Integer var52 = new java.lang.Integer(10);
    int[] var53 = new int[] { var50, var51, var52};
    java.lang.Integer var54 = new java.lang.Integer(1);
    java.lang.Integer var55 = new java.lang.Integer(1);
    ds.Ordenacao.mergeSort(var53, (int)var54, (int)var55);
    ds.Ordenacao.mergeSort(var48, (int)var49, (int)var55);
    ds.Ordenacao.mergeSort(var37, (int)var45, (int)var49);
    ds.Ordenacao.mergeSort(var29, (int)var32, (int)var45);
    ds.Ordenacao.mergeSort(var16, (int)var25, (int)var32);
    ds.Ordenacao.mergeSort(var2, (int)var11, (int)var32);

  }

}
