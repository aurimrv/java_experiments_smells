package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.validateIdentifier(var1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    java.lang.String var7 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.validateIdentifier(var7);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('4');
    boolean var6 = var4.valid_s((char)var5);
    boolean var7 = var3.valid_f((char)var5);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.String var9 = "hi!";
    boolean var10 = var8.validateIdentifier(var9);
    boolean var11 = var3.validateIdentifier(var9);
    boolean var12 = var0.validateIdentifier(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var3.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "hi!";
    boolean var12 = var10.validateIdentifier(var11);
    boolean var13 = var7.validateIdentifier(var11);
    boolean var14 = var0.validateIdentifier(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('#');
    boolean var8 = var6.valid_s((char)var7);
    boolean var9 = var3.valid_s((char)var7);
    boolean var10 = var0.valid_f((char)var7);
    ds.Identifier var11 = new ds.Identifier();
    ds.Identifier var12 = new ds.Identifier();
    java.lang.Character var13 = new java.lang.Character('#');
    boolean var14 = var12.valid_s((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "hi!";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var12.validateIdentifier(var16);
    boolean var19 = var11.validateIdentifier(var16);
    boolean var20 = var0.validateIdentifier(var16);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.String var22 = "hi!";
    boolean var23 = var21.validateIdentifier(var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.String var25 = "hi!";
    boolean var26 = var24.validateIdentifier(var25);
    ds.Identifier var27 = new ds.Identifier();
    java.lang.String var28 = "hi!";
    boolean var29 = var27.validateIdentifier(var28);
    boolean var30 = var24.validateIdentifier(var28);
    boolean var31 = var21.validateIdentifier(var28);
    ds.Identifier var32 = new ds.Identifier();
    ds.Identifier var33 = new ds.Identifier();
    java.lang.Character var34 = new java.lang.Character('4');
    boolean var35 = var33.valid_s((char)var34);
    boolean var36 = var32.valid_f((char)var34);
    boolean var37 = var21.valid_s((char)var34);
    boolean var38 = var0.valid_s((char)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('4');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    boolean var8 = var0.validateIdentifier(var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "hi!";
    boolean var11 = var9.validateIdentifier(var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "hi!";
    boolean var14 = var12.validateIdentifier(var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "hi!";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var12.validateIdentifier(var16);
    boolean var19 = var9.validateIdentifier(var16);
    ds.Identifier var20 = new ds.Identifier();
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var21.valid_s((char)var22);
    boolean var24 = var20.valid_f((char)var22);
    boolean var25 = var9.valid_s((char)var22);
    boolean var26 = var0.valid_s((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('4');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    ds.Identifier var5 = new ds.Identifier();
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('4');
    boolean var8 = var6.valid_s((char)var7);
    boolean var9 = var5.valid_f((char)var7);
    boolean var10 = var0.valid_f((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "hi!";
    boolean var6 = var4.validateIdentifier(var5);
    boolean var7 = var1.validateIdentifier(var5);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.String var9 = "hi!";
    boolean var10 = var8.validateIdentifier(var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('#');
    boolean var13 = var11.valid_s((char)var12);
    boolean var14 = var8.valid_s((char)var12);
    boolean var15 = var1.valid_f((char)var12);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.Character var17 = new java.lang.Character('#');
    boolean var18 = var16.valid_s((char)var17);
    boolean var19 = var1.valid_f((char)var17);
    ds.Identifier var20 = new ds.Identifier();
    java.lang.Character var21 = new java.lang.Character('#');
    boolean var22 = var20.valid_s((char)var21);
    boolean var23 = var1.valid_s((char)var21);
    boolean var24 = var0.valid_s((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character(' ');
    boolean var4 = var2.valid_s((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('#');
    boolean var10 = var8.valid_s((char)var9);
    boolean var11 = var5.valid_s((char)var9);
    boolean var12 = var2.valid_f((char)var9);
    ds.Identifier var13 = new ds.Identifier();
    ds.Identifier var14 = new ds.Identifier();
    java.lang.Character var15 = new java.lang.Character('#');
    boolean var16 = var14.valid_s((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var14.validateIdentifier(var18);
    boolean var21 = var13.validateIdentifier(var18);
    boolean var22 = var2.validateIdentifier(var18);
    boolean var23 = var1.validateIdentifier(var18);
    boolean var24 = var0.validateIdentifier(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var4.valid_s((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var4.validateIdentifier(var8);
    boolean var11 = var3.validateIdentifier(var8);
    boolean var12 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "hi!";
    boolean var6 = var4.validateIdentifier(var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var4.validateIdentifier(var8);
    boolean var11 = var1.validateIdentifier(var8);
    ds.Identifier var12 = new ds.Identifier();
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var13.valid_s((char)var14);
    boolean var16 = var12.valid_f((char)var14);
    boolean var17 = var1.valid_s((char)var14);
    ds.Identifier var18 = new ds.Identifier();
    java.lang.Character var19 = new java.lang.Character(' ');
    boolean var20 = var18.valid_s((char)var19);
    boolean var21 = var1.valid_f((char)var19);
    boolean var22 = var0.valid_f((char)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('#');
    boolean var8 = var6.valid_s((char)var7);
    boolean var9 = var3.valid_s((char)var7);
    boolean var10 = var0.valid_f((char)var7);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_s((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('#');
    boolean var17 = var13.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_s((char)var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('4');
    boolean var6 = var4.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('#');
    boolean var12 = var10.valid_s((char)var11);
    boolean var13 = var7.valid_s((char)var11);
    boolean var14 = var4.valid_f((char)var11);
    boolean var15 = var1.valid_s((char)var11);
    boolean var16 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('4');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('#');
    boolean var8 = var6.valid_s((char)var7);
    boolean var9 = var3.valid_s((char)var7);
    boolean var10 = var0.valid_f((char)var7);
    ds.Identifier var11 = new ds.Identifier();
    ds.Identifier var12 = new ds.Identifier();
    java.lang.Character var13 = new java.lang.Character('#');
    boolean var14 = var12.valid_s((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "hi!";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var12.validateIdentifier(var16);
    boolean var19 = var11.validateIdentifier(var16);
    boolean var20 = var0.validateIdentifier(var16);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.String var22 = "hi!";
    boolean var23 = var21.validateIdentifier(var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.String var25 = "hi!";
    boolean var26 = var24.validateIdentifier(var25);
    boolean var27 = var21.validateIdentifier(var25);
    ds.Identifier var28 = new ds.Identifier();
    java.lang.String var29 = "hi!";
    boolean var30 = var28.validateIdentifier(var29);
    ds.Identifier var31 = new ds.Identifier();
    java.lang.Character var32 = new java.lang.Character('#');
    boolean var33 = var31.valid_s((char)var32);
    boolean var34 = var28.valid_s((char)var32);
    boolean var35 = var21.valid_f((char)var32);
    ds.Identifier var36 = new ds.Identifier();
    java.lang.Character var37 = new java.lang.Character('4');
    boolean var38 = var36.valid_s((char)var37);
    java.lang.Character var39 = new java.lang.Character('#');
    boolean var40 = var36.valid_f((char)var39);
    boolean var41 = var21.valid_f((char)var39);
    boolean var42 = var0.valid_f((char)var39);
    java.lang.String var43 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var44 = var0.validateIdentifier(var43);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.String var7 = "hi!";
    boolean var8 = var6.validateIdentifier(var7);
    boolean var9 = var3.validateIdentifier(var7);
    boolean var10 = var0.validateIdentifier(var7);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var11.valid_s((char)var12);
    ds.Identifier var14 = new ds.Identifier();
    java.lang.Character var15 = new java.lang.Character(' ');
    boolean var16 = var14.valid_s((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    ds.Identifier var20 = new ds.Identifier();
    java.lang.Character var21 = new java.lang.Character('#');
    boolean var22 = var20.valid_s((char)var21);
    boolean var23 = var17.valid_s((char)var21);
    boolean var24 = var14.valid_f((char)var21);
    ds.Identifier var25 = new ds.Identifier();
    ds.Identifier var26 = new ds.Identifier();
    java.lang.Character var27 = new java.lang.Character('#');
    boolean var28 = var26.valid_s((char)var27);
    ds.Identifier var29 = new ds.Identifier();
    java.lang.String var30 = "hi!";
    boolean var31 = var29.validateIdentifier(var30);
    boolean var32 = var26.validateIdentifier(var30);
    boolean var33 = var25.validateIdentifier(var30);
    boolean var34 = var14.validateIdentifier(var30);
    boolean var35 = var11.validateIdentifier(var30);
    boolean var36 = var0.validateIdentifier(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

}
