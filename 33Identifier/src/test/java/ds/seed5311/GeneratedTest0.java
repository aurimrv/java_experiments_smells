package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test10() throws Throwable {

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

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    boolean var13 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.String var5 = "hi!";
    boolean var6 = var0.validateIdentifier(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.valid_s((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.valid_s((char)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.String var7 = "hi!";
    boolean var8 = var0.validateIdentifier(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.String var19 = "hi!";
    boolean var20 = var0.validateIdentifier(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test21() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test27() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test30() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test31() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.String var13 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.validateIdentifier(var13);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test32() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test33() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.valid_s((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test34() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test35() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test36() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.String var17 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var0.validateIdentifier(var17);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test37() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('p');
    boolean var23 = var1.valid_f((char)var22);
    boolean var24 = var0.valid_f((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test38() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test39() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test40() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    boolean var25 = var0.valid_s((char)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test41() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test42() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    boolean var11 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test43() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    boolean var13 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test44() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('7');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.String var27 = "hi!";
    boolean var28 = var0.validateIdentifier(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test45() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test46() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.valid_s((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test47() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('7');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('F');
    boolean var28 = var0.valid_f((char)var27);
    java.lang.String var29 = "hi!";
    boolean var30 = var0.validateIdentifier(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test48() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test49() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test50() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('p');
    boolean var23 = var1.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('@');
    boolean var25 = var1.valid_f((char)var24);
    boolean var26 = var0.valid_s((char)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test51() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test52() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('7');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('F');
    boolean var28 = var0.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('=');
    boolean var30 = var0.valid_f((char)var29);
    ds.Identifier var31 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test53() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('7');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('F');
    boolean var28 = var0.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('=');
    boolean var30 = var0.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('y');
    boolean var32 = var0.valid_f((char)var31);
    java.lang.String var33 = "hi!";
    boolean var34 = var0.validateIdentifier(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test54() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test55() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.String var15 = "hi!";
    boolean var16 = var0.validateIdentifier(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test56() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test57() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test58() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test59() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test60() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test61() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('p');
    boolean var23 = var1.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('@');
    boolean var25 = var1.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('7');
    boolean var27 = var1.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('F');
    boolean var29 = var1.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('=');
    boolean var31 = var1.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('y');
    boolean var33 = var1.valid_f((char)var32);
    boolean var34 = var0.valid_s((char)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test62() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test63() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test64() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('c');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test65() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    boolean var21 = var0.valid_s((char)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test66() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('4');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.String var23 = "hi!";
    boolean var24 = var0.validateIdentifier(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test67() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var1.valid_f((char)var20);
    boolean var22 = var0.valid_s((char)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test68() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "z";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('c');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test69() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.valid_s((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test70() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test71() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test72() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('4');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    ds.Identifier var25 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test73() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('4');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test74() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test75() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_f((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test76() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('c');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test77() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "z";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('c');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
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

  public void test78() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test79() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test80() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test81() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test82() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('p');
    boolean var23 = var1.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('@');
    boolean var25 = var1.valid_f((char)var24);
    boolean var26 = var0.valid_f((char)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test83() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('c');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('Q');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test84() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test85() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test86() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('r');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.String var20 = "z";
    boolean var21 = var19.validateIdentifier(var20);
    boolean var22 = var0.validateIdentifier(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test87() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('9');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('p');
    boolean var23 = var1.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('@');
    boolean var25 = var1.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('7');
    boolean var27 = var1.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('F');
    boolean var29 = var1.valid_f((char)var28);
    boolean var30 = var0.valid_f((char)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test88() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test89() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test90() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test91() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test92() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test93() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('r');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test94() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('7');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('F');
    boolean var28 = var0.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('=');
    boolean var30 = var0.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('y');
    boolean var32 = var0.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('G');
    boolean var34 = var0.valid_f((char)var33);
    boolean var35 = var0.valid_s((char)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test95() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test96() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('c');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('Q');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('E');
    boolean var10 = var0.valid_f((char)var9);
    boolean var11 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test97() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('c');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('Q');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('E');
    boolean var10 = var0.valid_f((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test98() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.String var5 = "hi!";
    boolean var6 = var0.validateIdentifier(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test99() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test100() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "z";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('c');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('Q');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test101() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('7');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('Y');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('0');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('9');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('L');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('c');
    boolean var23 = var11.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('2');
    boolean var25 = var11.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('X');
    boolean var27 = var11.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('8');
    boolean var29 = var11.valid_f((char)var28);
    boolean var30 = var0.valid_f((char)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test102() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('7');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('F');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('8');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('F');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var1.valid_f((char)var22);
    boolean var24 = var0.valid_s((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test103() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('7');
    boolean var19 = var17.valid_s((char)var18);
    java.lang.Character var20 = new java.lang.Character('Y');
    boolean var21 = var17.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var17.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('9');
    boolean var25 = var17.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('L');
    boolean var27 = var17.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('c');
    boolean var29 = var17.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('2');
    boolean var31 = var17.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('X');
    boolean var33 = var17.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('8');
    boolean var35 = var17.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('6');
    boolean var37 = var17.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('p');
    boolean var39 = var17.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('@');
    boolean var41 = var17.valid_f((char)var40);
    java.lang.Character var42 = new java.lang.Character('7');
    boolean var43 = var17.valid_f((char)var42);
    boolean var44 = var0.valid_f((char)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test104() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('7');
    boolean var13 = var11.valid_s((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test105() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('r');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('7');
    boolean var23 = var21.valid_s((char)var22);
    java.lang.Character var24 = new java.lang.Character('l');
    boolean var25 = var21.valid_f((char)var24);
    ds.Identifier var26 = new ds.Identifier();
    java.lang.String var27 = "z";
    boolean var28 = var26.validateIdentifier(var27);
    boolean var29 = var21.validateIdentifier(var27);
    boolean var30 = var0.validateIdentifier(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test106() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('z');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var9.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('0');
    boolean var15 = var9.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('A');
    boolean var17 = var9.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('L');
    boolean var19 = var9.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('c');
    boolean var21 = var9.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('2');
    boolean var23 = var9.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('X');
    boolean var25 = var9.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('r');
    boolean var27 = var9.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('F');
    boolean var29 = var9.valid_f((char)var28);
    boolean var30 = var0.valid_s((char)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test107() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.String var5 = "hi!";
    boolean var6 = var0.validateIdentifier(var5);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test108() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('z');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('l');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('0');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('A');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('L');
    boolean var15 = var5.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('c');
    boolean var17 = var5.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('2');
    boolean var19 = var5.valid_f((char)var18);
    ds.Identifier var20 = new ds.Identifier();
    java.lang.Character var21 = new java.lang.Character('z');
    boolean var22 = var20.valid_s((char)var21);
    boolean var23 = var5.valid_s((char)var21);
    boolean var24 = var0.valid_s((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test109() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "z";
    boolean var4 = var2.validateIdentifier(var3);
    boolean var5 = var1.validateIdentifier(var3);
    boolean var6 = var0.validateIdentifier(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test110() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('7');
    boolean var21 = var19.valid_s((char)var20);
    java.lang.Character var22 = new java.lang.Character('l');
    boolean var23 = var19.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.String var25 = "z";
    boolean var26 = var24.validateIdentifier(var25);
    boolean var27 = var19.validateIdentifier(var25);
    boolean var28 = var0.validateIdentifier(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test111() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('p');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('@');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('7');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('F');
    boolean var28 = var0.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('=');
    boolean var30 = var0.valid_f((char)var29);
    ds.Identifier var31 = new ds.Identifier();
    java.lang.Character var32 = new java.lang.Character('N');
    boolean var33 = var31.valid_s((char)var32);
    java.lang.Character var34 = new java.lang.Character('Y');
    boolean var35 = var31.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('0');
    boolean var37 = var31.valid_f((char)var36);
    ds.Identifier var38 = new ds.Identifier();
    java.lang.Character var39 = new java.lang.Character('7');
    boolean var40 = var38.valid_s((char)var39);
    java.lang.Character var41 = new java.lang.Character('l');
    boolean var42 = var38.valid_f((char)var41);
    java.lang.Character var43 = new java.lang.Character('F');
    boolean var44 = var38.valid_f((char)var43);
    java.lang.Character var45 = new java.lang.Character('A');
    boolean var46 = var38.valid_f((char)var45);
    java.lang.String var47 = "hi!";
    boolean var48 = var38.validateIdentifier(var47);
    boolean var49 = var31.validateIdentifier(var47);
    boolean var50 = var0.validateIdentifier(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);

  }

  public void test112() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('z');
    boolean var4 = var2.valid_s((char)var3);
    java.lang.Character var5 = new java.lang.Character('l');
    boolean var6 = var2.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('0');
    boolean var8 = var2.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('A');
    boolean var10 = var2.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('L');
    boolean var12 = var2.valid_f((char)var11);
    boolean var13 = var1.valid_f((char)var11);
    boolean var14 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test113() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.String var14 = "hi!";
    boolean var15 = var1.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('z');
    boolean var19 = var17.valid_s((char)var18);
    java.lang.Character var20 = new java.lang.Character('l');
    boolean var21 = var17.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var17.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('A');
    boolean var25 = var17.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('L');
    boolean var27 = var17.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('c');
    boolean var29 = var17.valid_f((char)var28);
    java.lang.String var30 = "hi!";
    boolean var31 = var17.validateIdentifier(var30);
    boolean var32 = var0.validateIdentifier(var30);
    java.lang.Character var33 = new java.lang.Character(' ');
    boolean var34 = var0.valid_f((char)var33);
    java.lang.String var35 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var0.validateIdentifier(var35);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test114() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('Y');
    boolean var5 = var1.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('7');
    boolean var8 = var6.valid_s((char)var7);
    java.lang.Character var9 = new java.lang.Character('l');
    boolean var10 = var6.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('z');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('l');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('0');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('A');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('L');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('c');
    boolean var23 = var11.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('2');
    boolean var25 = var11.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('X');
    boolean var27 = var11.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('r');
    boolean var29 = var11.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('F');
    boolean var31 = var11.valid_f((char)var30);
    boolean var32 = var6.valid_s((char)var30);
    boolean var33 = var1.valid_s((char)var30);
    ds.Identifier var34 = new ds.Identifier();
    java.lang.Character var35 = new java.lang.Character('7');
    boolean var36 = var34.valid_s((char)var35);
    java.lang.Character var37 = new java.lang.Character('l');
    boolean var38 = var34.valid_f((char)var37);
    java.lang.Character var39 = new java.lang.Character('F');
    boolean var40 = var34.valid_f((char)var39);
    java.lang.Character var41 = new java.lang.Character('A');
    boolean var42 = var34.valid_f((char)var41);
    boolean var43 = var1.valid_s((char)var41);
    boolean var44 = var0.valid_f((char)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test115() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('9');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('7');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('Y');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('0');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('9');
    boolean var21 = var13.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('L');
    boolean var23 = var13.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('c');
    boolean var25 = var13.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('2');
    boolean var27 = var13.valid_f((char)var26);
    boolean var28 = var0.valid_s((char)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test116() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('z');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('l');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('0');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('A');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('L');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('c');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.String var14 = "hi!";
    boolean var15 = var1.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('z');
    boolean var19 = var17.valid_s((char)var18);
    java.lang.Character var20 = new java.lang.Character('l');
    boolean var21 = var17.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var17.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('A');
    boolean var25 = var17.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('L');
    boolean var27 = var17.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('c');
    boolean var29 = var17.valid_f((char)var28);
    java.lang.String var30 = "hi!";
    boolean var31 = var17.validateIdentifier(var30);
    boolean var32 = var0.validateIdentifier(var30);
    ds.Identifier var33 = new ds.Identifier();
    java.lang.Character var34 = new java.lang.Character('7');
    boolean var35 = var33.valid_s((char)var34);
    java.lang.Character var36 = new java.lang.Character('Y');
    boolean var37 = var33.valid_f((char)var36);
    java.lang.String var38 = "hi!";
    boolean var39 = var33.validateIdentifier(var38);
    java.lang.Character var40 = new java.lang.Character('#');
    boolean var41 = var33.valid_s((char)var40);
    boolean var42 = var0.valid_s((char)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test117() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('7');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('l');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('F');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character(' ');
    boolean var13 = var5.valid_s((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test118() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('7');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('l');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('F');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character(' ');
    boolean var13 = var5.valid_s((char)var12);
    java.lang.String var14 = "hi!";
    boolean var15 = var5.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('7');
    boolean var19 = var17.valid_s((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test119() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character(' ');
    boolean var8 = var0.valid_s((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('7');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('Y');
    boolean var13 = var9.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character('7');
    boolean var17 = var15.valid_s((char)var16);
    java.lang.Character var18 = new java.lang.Character('l');
    boolean var19 = var15.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('F');
    boolean var21 = var15.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('A');
    boolean var23 = var15.valid_f((char)var22);
    boolean var24 = var0.valid_f((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test120() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('7');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('Y');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('9');
    boolean var15 = var7.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('L');
    boolean var17 = var7.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('c');
    boolean var19 = var7.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('2');
    boolean var21 = var7.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('X');
    boolean var23 = var7.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('8');
    boolean var25 = var7.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('6');
    boolean var27 = var7.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('p');
    boolean var29 = var7.valid_f((char)var28);
    ds.Identifier var30 = new ds.Identifier();
    java.lang.Character var31 = new java.lang.Character('N');
    boolean var32 = var30.valid_s((char)var31);
    java.lang.Character var33 = new java.lang.Character('Y');
    boolean var34 = var30.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('0');
    boolean var36 = var30.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('A');
    boolean var38 = var30.valid_f((char)var37);
    boolean var39 = var7.valid_s((char)var37);
    boolean var40 = var0.valid_s((char)var37);
    ds.Identifier var41 = new ds.Identifier();
    java.lang.Character var42 = new java.lang.Character('7');
    boolean var43 = var41.valid_s((char)var42);
    java.lang.Character var44 = new java.lang.Character('Y');
    boolean var45 = var41.valid_f((char)var44);
    java.lang.Character var46 = new java.lang.Character('0');
    boolean var47 = var41.valid_f((char)var46);
    java.lang.Character var48 = new java.lang.Character('9');
    boolean var49 = var41.valid_f((char)var48);
    java.lang.Character var50 = new java.lang.Character('L');
    boolean var51 = var41.valid_f((char)var50);
    java.lang.Character var52 = new java.lang.Character('c');
    boolean var53 = var41.valid_f((char)var52);
    java.lang.Character var54 = new java.lang.Character('2');
    boolean var55 = var41.valid_f((char)var54);
    java.lang.Character var56 = new java.lang.Character('X');
    boolean var57 = var41.valid_f((char)var56);
    java.lang.Character var58 = new java.lang.Character('8');
    boolean var59 = var41.valid_f((char)var58);
    java.lang.Character var60 = new java.lang.Character('6');
    boolean var61 = var41.valid_f((char)var60);
    java.lang.Character var62 = new java.lang.Character('p');
    boolean var63 = var41.valid_f((char)var62);
    java.lang.Character var64 = new java.lang.Character('@');
    boolean var65 = var41.valid_f((char)var64);
    java.lang.Character var66 = new java.lang.Character('7');
    boolean var67 = var41.valid_f((char)var66);
    java.lang.Character var68 = new java.lang.Character('F');
    boolean var69 = var41.valid_f((char)var68);
    java.lang.Character var70 = new java.lang.Character('=');
    boolean var71 = var41.valid_f((char)var70);
    java.lang.Character var72 = new java.lang.Character('y');
    boolean var73 = var41.valid_f((char)var72);
    java.lang.Character var74 = new java.lang.Character('G');
    boolean var75 = var41.valid_f((char)var74);
    boolean var76 = var0.valid_f((char)var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);

  }

  public void test121() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "z";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('z');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('l');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('0');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('A');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('L');
    boolean var13 = var3.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('c');
    boolean var15 = var3.valid_f((char)var14);
    java.lang.String var16 = "hi!";
    boolean var17 = var3.validateIdentifier(var16);
    boolean var18 = var0.validateIdentifier(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test122() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('Y');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('7');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('Y');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('0');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('9');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('L');
    boolean var15 = var5.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('c');
    boolean var17 = var5.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('2');
    boolean var19 = var5.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('X');
    boolean var21 = var5.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('8');
    boolean var23 = var5.valid_f((char)var22);
    boolean var24 = var0.valid_s((char)var22);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.Character var26 = new java.lang.Character('7');
    boolean var27 = var25.valid_s((char)var26);
    java.lang.Character var28 = new java.lang.Character('l');
    boolean var29 = var25.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('F');
    boolean var31 = var25.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character(' ');
    boolean var33 = var25.valid_s((char)var32);
    java.lang.String var34 = "hi!";
    boolean var35 = var25.validateIdentifier(var34);
    boolean var36 = var0.validateIdentifier(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test123() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('z');
    boolean var4 = var2.valid_s((char)var3);
    java.lang.Character var5 = new java.lang.Character('l');
    boolean var6 = var2.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('0');
    boolean var8 = var2.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('A');
    boolean var10 = var2.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('L');
    boolean var12 = var2.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('c');
    boolean var14 = var2.valid_f((char)var13);
    java.lang.String var15 = "hi!";
    boolean var16 = var2.validateIdentifier(var15);
    boolean var17 = var1.validateIdentifier(var15);
    boolean var18 = var0.validateIdentifier(var15);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('7');
    boolean var21 = var19.valid_s((char)var20);
    boolean var22 = var0.valid_s((char)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test124() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('7');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('Y');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('0');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('9');
    boolean var21 = var13.valid_f((char)var20);
    boolean var22 = var0.valid_f((char)var20);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character('N');
    boolean var25 = var23.valid_s((char)var24);
    boolean var26 = var0.valid_f((char)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test125() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('7');
    boolean var6 = var4.valid_s((char)var5);
    java.lang.Character var7 = new java.lang.Character('l');
    boolean var8 = var4.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('F');
    boolean var10 = var4.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('A');
    boolean var12 = var4.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('L');
    boolean var14 = var4.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('c');
    boolean var16 = var4.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('2');
    boolean var18 = var4.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var4.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('8');
    boolean var22 = var4.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('F');
    boolean var24 = var4.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('4');
    boolean var26 = var4.valid_f((char)var25);
    boolean var27 = var3.valid_f((char)var25);
    boolean var28 = var0.valid_s((char)var25);
    ds.Identifier var29 = new ds.Identifier();
    java.lang.Character var30 = new java.lang.Character('7');
    boolean var31 = var29.valid_s((char)var30);
    java.lang.Character var32 = new java.lang.Character('l');
    boolean var33 = var29.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('F');
    boolean var35 = var29.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character(' ');
    boolean var37 = var29.valid_s((char)var36);
    java.lang.String var38 = "hi!";
    boolean var39 = var29.validateIdentifier(var38);
    boolean var40 = var0.validateIdentifier(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test126() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('z');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('0');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('7');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('Y');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('0');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('9');
    boolean var21 = var13.valid_f((char)var20);
    boolean var22 = var0.valid_f((char)var20);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character('z');
    boolean var25 = var23.valid_s((char)var24);
    java.lang.Character var26 = new java.lang.Character('l');
    boolean var27 = var23.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('0');
    boolean var29 = var23.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('A');
    boolean var31 = var23.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('L');
    boolean var33 = var23.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('c');
    boolean var35 = var23.valid_f((char)var34);
    ds.Identifier var36 = new ds.Identifier();
    java.lang.Character var37 = new java.lang.Character('7');
    boolean var38 = var36.valid_s((char)var37);
    java.lang.Character var39 = new java.lang.Character('Y');
    boolean var40 = var36.valid_f((char)var39);
    java.lang.Character var41 = new java.lang.Character('0');
    boolean var42 = var36.valid_f((char)var41);
    java.lang.Character var43 = new java.lang.Character('9');
    boolean var44 = var36.valid_f((char)var43);
    boolean var45 = var23.valid_f((char)var43);
    boolean var46 = var0.valid_s((char)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test127() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character(' ');
    boolean var8 = var0.valid_s((char)var7);
    java.lang.String var9 = "hi!";
    boolean var10 = var0.validateIdentifier(var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('7');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('Y');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('0');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('9');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('L');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('c');
    boolean var23 = var11.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    ds.Identifier var25 = new ds.Identifier();
    ds.Identifier var26 = new ds.Identifier();
    java.lang.Character var27 = new java.lang.Character('z');
    boolean var28 = var26.valid_s((char)var27);
    java.lang.Character var29 = new java.lang.Character('l');
    boolean var30 = var26.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('0');
    boolean var32 = var26.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('A');
    boolean var34 = var26.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('L');
    boolean var36 = var26.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('c');
    boolean var38 = var26.valid_f((char)var37);
    java.lang.String var39 = "hi!";
    boolean var40 = var26.validateIdentifier(var39);
    boolean var41 = var25.validateIdentifier(var39);
    boolean var42 = var24.validateIdentifier(var39);
    boolean var43 = var11.validateIdentifier(var39);
    boolean var44 = var0.validateIdentifier(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test128() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('7');
    boolean var4 = var2.valid_s((char)var3);
    java.lang.Character var5 = new java.lang.Character('l');
    boolean var6 = var2.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('F');
    boolean var8 = var2.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('A');
    boolean var10 = var2.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('L');
    boolean var12 = var2.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('c');
    boolean var14 = var2.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('2');
    boolean var16 = var2.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('X');
    boolean var18 = var2.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('8');
    boolean var20 = var2.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('F');
    boolean var22 = var2.valid_f((char)var21);
    boolean var23 = var1.valid_f((char)var21);
    boolean var24 = var0.valid_s((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test129() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('7');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('l');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('F');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('A');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('L');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('c');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('2');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('8');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('F');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('4');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character('7');
    boolean var25 = var23.valid_s((char)var24);
    java.lang.Character var26 = new java.lang.Character('l');
    boolean var27 = var23.valid_f((char)var26);
    ds.Identifier var28 = new ds.Identifier();
    java.lang.String var29 = "z";
    boolean var30 = var28.validateIdentifier(var29);
    boolean var31 = var23.validateIdentifier(var29);
    ds.Identifier var32 = new ds.Identifier();
    ds.Identifier var33 = new ds.Identifier();
    java.lang.Character var34 = new java.lang.Character('z');
    boolean var35 = var33.valid_s((char)var34);
    java.lang.Character var36 = new java.lang.Character('l');
    boolean var37 = var33.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('0');
    boolean var39 = var33.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('A');
    boolean var41 = var33.valid_f((char)var40);
    java.lang.Character var42 = new java.lang.Character('L');
    boolean var43 = var33.valid_f((char)var42);
    java.lang.Character var44 = new java.lang.Character('c');
    boolean var45 = var33.valid_f((char)var44);
    java.lang.String var46 = "hi!";
    boolean var47 = var33.validateIdentifier(var46);
    boolean var48 = var32.validateIdentifier(var46);
    boolean var49 = var23.validateIdentifier(var46);
    boolean var50 = var0.validateIdentifier(var46);
    ds.Identifier var51 = new ds.Identifier();
    ds.Identifier var52 = new ds.Identifier();
    java.lang.Character var53 = new java.lang.Character('N');
    boolean var54 = var52.valid_s((char)var53);
    java.lang.Character var55 = new java.lang.Character('Y');
    boolean var56 = var52.valid_f((char)var55);
    ds.Identifier var57 = new ds.Identifier();
    java.lang.Character var58 = new java.lang.Character('7');
    boolean var59 = var57.valid_s((char)var58);
    java.lang.Character var60 = new java.lang.Character('l');
    boolean var61 = var57.valid_f((char)var60);
    java.lang.Character var62 = new java.lang.Character('F');
    boolean var63 = var57.valid_f((char)var62);
    java.lang.Character var64 = new java.lang.Character(' ');
    boolean var65 = var57.valid_s((char)var64);
    boolean var66 = var52.valid_s((char)var64);
    boolean var67 = var51.valid_f((char)var64);
    boolean var68 = var0.valid_f((char)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

}
