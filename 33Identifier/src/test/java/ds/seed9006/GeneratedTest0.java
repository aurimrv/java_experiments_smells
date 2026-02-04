package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.String var3 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.validateIdentifier(var3);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('a');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.String var5 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.validateIdentifier(var5);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_s((char)var3);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var0.valid_s((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_s((char)var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var4.valid_s((char)var5);
    java.lang.Character var7 = new java.lang.Character('a');
    boolean var8 = var4.valid_f((char)var7);
    boolean var9 = var1.valid_s((char)var7);
    boolean var10 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('a');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    boolean var8 = var0.validateIdentifier(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var3.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('4');
    boolean var7 = var3.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('#');
    boolean var9 = var3.valid_s((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('a');
    boolean var13 = var11.valid_f((char)var12);
    ds.Identifier var14 = new ds.Identifier();
    java.lang.Character var15 = new java.lang.Character('a');
    boolean var16 = var14.valid_s((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('#');
    boolean var19 = var17.valid_f((char)var18);
    boolean var20 = var14.valid_f((char)var18);
    boolean var21 = var11.valid_s((char)var18);
    boolean var22 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var1.valid_s((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    java.lang.String var9 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.validateIdentifier(var9);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('a');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('a');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var9.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('#');
    boolean var15 = var9.valid_s((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('a');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    java.lang.String var9 = "hi!";
    boolean var10 = var0.validateIdentifier(var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('a');
    boolean var13 = var11.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var11.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var0.validateIdentifier(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_s((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('a');
    boolean var12 = var10.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('4');
    boolean var14 = var10.valid_f((char)var13);
    boolean var15 = var7.valid_s((char)var13);
    boolean var16 = var0.valid_f((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('a');
    boolean var13 = var7.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('a');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_s((char)var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var4.valid_s((char)var5);
    java.lang.Character var7 = new java.lang.Character('a');
    boolean var8 = var4.valid_f((char)var7);
    boolean var9 = var1.valid_s((char)var7);
    ds.Identifier var10 = new ds.Identifier();
    ds.Identifier var11 = new ds.Identifier();
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "hi!";
    boolean var14 = var12.validateIdentifier(var13);
    boolean var15 = var11.validateIdentifier(var13);
    boolean var16 = var10.validateIdentifier(var13);
    boolean var17 = var1.validateIdentifier(var13);
    boolean var18 = var0.validateIdentifier(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_s((char)var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var4.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('4');
    boolean var8 = var4.valid_f((char)var7);
    boolean var9 = var1.valid_s((char)var7);
    boolean var10 = var0.valid_s((char)var7);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('a');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var11.valid_s((char)var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.Character var17 = new java.lang.Character('a');
    boolean var18 = var16.valid_s((char)var17);
    java.lang.Character var19 = new java.lang.Character('a');
    boolean var20 = var16.valid_f((char)var19);
    boolean var21 = var11.valid_s((char)var19);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var11.valid_f((char)var22);
    boolean var24 = var0.valid_f((char)var22);
    java.lang.Character var25 = new java.lang.Character('a');
    boolean var26 = var0.valid_f((char)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character(' ');
    boolean var7 = var3.valid_s((char)var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('a');
    boolean var10 = var8.valid_s((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('#');
    boolean var13 = var11.valid_f((char)var12);
    boolean var14 = var8.valid_f((char)var12);
    boolean var15 = var3.valid_f((char)var12);
    boolean var16 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_s((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('a');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var5.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('a');
    boolean var15 = var13.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('4');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('a');
    boolean var19 = var13.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character(' ');
    boolean var4 = var0.valid_s((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('a');
    boolean var7 = var5.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('4');
    boolean var9 = var5.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    ds.Identifier var5 = new ds.Identifier();
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('a');
    boolean var8 = var6.valid_s((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('a');
    boolean var11 = var9.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var9.valid_f((char)var12);
    boolean var14 = var6.valid_s((char)var12);
    boolean var15 = var5.valid_s((char)var12);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.Character var17 = new java.lang.Character('a');
    boolean var18 = var16.valid_s((char)var17);
    java.lang.Character var19 = new java.lang.Character('4');
    boolean var20 = var16.valid_s((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('a');
    boolean var23 = var21.valid_s((char)var22);
    java.lang.Character var24 = new java.lang.Character('a');
    boolean var25 = var21.valid_f((char)var24);
    boolean var26 = var16.valid_s((char)var24);
    java.lang.Character var27 = new java.lang.Character('4');
    boolean var28 = var16.valid_f((char)var27);
    boolean var29 = var5.valid_f((char)var27);
    boolean var30 = var0.valid_s((char)var27);
    ds.Identifier var31 = new ds.Identifier();
    java.lang.Character var32 = new java.lang.Character('a');
    boolean var33 = var31.valid_s((char)var32);
    java.lang.Character var34 = new java.lang.Character('4');
    boolean var35 = var31.valid_s((char)var34);
    ds.Identifier var36 = new ds.Identifier();
    java.lang.Character var37 = new java.lang.Character('a');
    boolean var38 = var36.valid_s((char)var37);
    java.lang.Character var39 = new java.lang.Character('a');
    boolean var40 = var36.valid_f((char)var39);
    boolean var41 = var31.valid_s((char)var39);
    ds.Identifier var42 = new ds.Identifier();
    java.lang.Character var43 = new java.lang.Character('a');
    boolean var44 = var42.valid_s((char)var43);
    java.lang.Character var45 = new java.lang.Character('4');
    boolean var46 = var42.valid_s((char)var45);
    boolean var47 = var31.valid_s((char)var45);
    boolean var48 = var0.valid_f((char)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('#');
    boolean var3 = var1.valid_f((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    ds.Identifier var5 = new ds.Identifier();
    ds.Identifier var6 = new ds.Identifier();
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var6.validateIdentifier(var8);
    boolean var11 = var5.validateIdentifier(var8);
    boolean var12 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test21() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var4.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_s((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('#');
    boolean var12 = var10.valid_f((char)var11);
    boolean var13 = var7.valid_f((char)var11);
    boolean var14 = var4.valid_s((char)var11);
    boolean var15 = var1.valid_f((char)var11);
    boolean var16 = var0.valid_f((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
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

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_s((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('#');
    boolean var8 = var6.valid_f((char)var7);
    boolean var9 = var3.valid_f((char)var7);
    boolean var10 = var0.valid_s((char)var7);
    ds.Identifier var11 = new ds.Identifier();
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "hi!";
    boolean var14 = var12.validateIdentifier(var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character('a');
    boolean var17 = var15.valid_f((char)var16);
    ds.Identifier var18 = new ds.Identifier();
    java.lang.Character var19 = new java.lang.Character('a');
    boolean var20 = var18.valid_s((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('#');
    boolean var23 = var21.valid_f((char)var22);
    boolean var24 = var18.valid_f((char)var22);
    boolean var25 = var15.valid_s((char)var22);
    boolean var26 = var12.valid_f((char)var22);
    boolean var27 = var11.valid_s((char)var22);
    boolean var28 = var0.valid_s((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_s((char)var3);
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_s((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('a');
    boolean var12 = var10.valid_s((char)var11);
    java.lang.Character var13 = new java.lang.Character('a');
    boolean var14 = var10.valid_f((char)var13);
    boolean var15 = var7.valid_s((char)var13);
    java.lang.String var16 = "hi!";
    boolean var17 = var7.validateIdentifier(var16);
    boolean var18 = var0.validateIdentifier(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('a');
    boolean var4 = var2.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var2.valid_s((char)var5);
    boolean var7 = var1.valid_f((char)var5);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('a');
    boolean var10 = var8.valid_s((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var8.valid_s((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('a');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('a');
    boolean var17 = var13.valid_f((char)var16);
    boolean var18 = var8.valid_s((char)var16);
    boolean var19 = var1.valid_f((char)var16);
    boolean var20 = var0.valid_f((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var2.validateIdentifier(var4);
    boolean var7 = var1.validateIdentifier(var4);
    boolean var8 = var0.validateIdentifier(var4);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('a');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('a');
    boolean var13 = var9.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    java.lang.String var15 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var0.validateIdentifier(var15);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test27() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('a');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_s((char)var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.Character var13 = new java.lang.Character('a');
    boolean var14 = var12.valid_s((char)var13);
    java.lang.Character var15 = new java.lang.Character('a');
    boolean var16 = var12.valid_f((char)var15);
    boolean var17 = var7.valid_s((char)var15);
    boolean var18 = var0.valid_f((char)var15);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('a');
    boolean var21 = var19.valid_s((char)var20);
    ds.Identifier var22 = new ds.Identifier();
    java.lang.Character var23 = new java.lang.Character('a');
    boolean var24 = var22.valid_s((char)var23);
    java.lang.Character var25 = new java.lang.Character('a');
    boolean var26 = var22.valid_f((char)var25);
    boolean var27 = var19.valid_s((char)var25);
    boolean var28 = var0.valid_s((char)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('a');
    boolean var5 = var3.valid_s((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('a');
    boolean var8 = var6.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('4');
    boolean var10 = var6.valid_f((char)var9);
    boolean var11 = var3.valid_s((char)var9);
    boolean var12 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('a');
    boolean var3 = var1.valid_s((char)var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var4.valid_s((char)var5);
    java.lang.Character var7 = new java.lang.Character('a');
    boolean var8 = var4.valid_f((char)var7);
    boolean var9 = var1.valid_s((char)var7);
    java.lang.String var10 = "hi!";
    boolean var11 = var1.validateIdentifier(var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.Character var13 = new java.lang.Character('a');
    boolean var14 = var12.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('4');
    boolean var16 = var12.valid_f((char)var15);
    boolean var17 = var1.valid_s((char)var15);
    ds.Identifier var18 = new ds.Identifier();
    java.lang.Character var19 = new java.lang.Character('a');
    boolean var20 = var18.valid_s((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('a');
    boolean var23 = var21.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('4');
    boolean var25 = var21.valid_f((char)var24);
    boolean var26 = var18.valid_s((char)var24);
    boolean var27 = var1.valid_s((char)var24);
    boolean var28 = var0.valid_s((char)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

}
