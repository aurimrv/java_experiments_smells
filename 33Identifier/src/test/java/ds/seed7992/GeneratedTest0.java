package ds.seed7992;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

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
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
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
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

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

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('b');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('a');
    boolean var4 = var0.valid_f((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
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
    assertTrue(var2 == false);

  }

  public void test21() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.String var7 = "1bc";
    boolean var8 = var6.validateIdentifier(var7);
    boolean var9 = var3.validateIdentifier(var7);
    boolean var10 = var0.validateIdentifier(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('1');
    boolean var7 = var5.valid_s((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('#');
    boolean var3 = var1.valid_f((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('1');
    boolean var10 = var8.valid_s((char)var9);
    boolean var11 = var7.valid_s((char)var9);
    boolean var12 = var0.valid_f((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "1bc";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('a');
    boolean var6 = var0.valid_f((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('b');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('1');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('b');
    boolean var13 = var9.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test27() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "1bc";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "1bc";
    boolean var13 = var11.validateIdentifier(var12);
    boolean var14 = var0.validateIdentifier(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('b');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('1');
    boolean var11 = var9.valid_s((char)var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "1bc";
    boolean var14 = var12.validateIdentifier(var13);
    boolean var15 = var9.validateIdentifier(var13);
    boolean var16 = var0.validateIdentifier(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('1');
    boolean var4 = var2.valid_s((char)var3);
    boolean var5 = var1.valid_f((char)var3);
    boolean var6 = var0.valid_f((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test30() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('b');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "1bc";
    boolean var12 = var10.validateIdentifier(var11);
    boolean var13 = var9.validateIdentifier(var11);
    boolean var14 = var0.validateIdentifier(var11);
    java.lang.Character var15 = new java.lang.Character('a');
    boolean var16 = var0.valid_s((char)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test31() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "1bc";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var6.valid_s((char)var7);
    java.lang.Character var9 = new java.lang.Character('b');
    boolean var10 = var6.valid_f((char)var9);
    boolean var11 = var3.valid_s((char)var9);
    boolean var12 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test32() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "1bc";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('b');
    boolean var11 = var7.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test33() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('b');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "1bc";
    boolean var12 = var10.validateIdentifier(var11);
    ds.Identifier var13 = new ds.Identifier();
    ds.Identifier var14 = new ds.Identifier();
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var14.valid_s((char)var15);
    java.lang.Character var17 = new java.lang.Character('b');
    boolean var18 = var14.valid_f((char)var17);
    boolean var19 = var13.valid_f((char)var17);
    boolean var20 = var10.valid_f((char)var17);
    boolean var21 = var9.valid_f((char)var17);
    boolean var22 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test34() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "1bc";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var7.valid_s((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('1');
    boolean var12 = var10.valid_s((char)var11);
    java.lang.Character var13 = new java.lang.Character('b');
    boolean var14 = var10.valid_f((char)var13);
    boolean var15 = var7.valid_s((char)var13);
    boolean var16 = var0.valid_f((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test35() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "1bc";
    boolean var7 = var5.validateIdentifier(var6);
    ds.Identifier var8 = new ds.Identifier();
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "1bc";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var8.validateIdentifier(var10);
    boolean var13 = var5.validateIdentifier(var10);
    boolean var14 = var0.validateIdentifier(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test36() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test37() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('1');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('b');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var7.valid_s((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test38() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "1bc";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('1');
    boolean var7 = var5.valid_s((char)var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('1');
    boolean var10 = var8.valid_s((char)var9);
    java.lang.Character var11 = new java.lang.Character('b');
    boolean var12 = var8.valid_f((char)var11);
    boolean var13 = var5.valid_s((char)var11);
    ds.Identifier var14 = new ds.Identifier();
    java.lang.String var15 = "1bc";
    boolean var16 = var14.validateIdentifier(var15);
    boolean var17 = var5.validateIdentifier(var15);
    boolean var18 = var0.validateIdentifier(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test39() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('1');
    boolean var7 = var5.valid_s((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "1bc";
    boolean var12 = var10.validateIdentifier(var11);
    ds.Identifier var13 = new ds.Identifier();
    ds.Identifier var14 = new ds.Identifier();
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var14.valid_s((char)var15);
    java.lang.Character var17 = new java.lang.Character('b');
    boolean var18 = var14.valid_f((char)var17);
    boolean var19 = var13.valid_f((char)var17);
    boolean var20 = var10.valid_f((char)var17);
    boolean var21 = var9.valid_f((char)var17);
    boolean var22 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test40() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "1bc";
    boolean var3 = var1.validateIdentifier(var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "1bc";
    boolean var6 = var4.validateIdentifier(var5);
    boolean var7 = var1.validateIdentifier(var5);
    boolean var8 = var0.validateIdentifier(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test41() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var7.valid_s((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test42() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('1');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('b');
    boolean var5 = var1.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.String var7 = "1bc";
    boolean var8 = var6.validateIdentifier(var7);
    boolean var9 = var1.validateIdentifier(var7);
    boolean var10 = var0.validateIdentifier(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test43() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var5.valid_f((char)var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('1');
    boolean var10 = var8.valid_s((char)var9);
    java.lang.Character var11 = new java.lang.Character('b');
    boolean var12 = var8.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('1');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('b');
    boolean var17 = var13.valid_f((char)var16);
    boolean var18 = var8.valid_f((char)var16);
    boolean var19 = var5.valid_f((char)var16);
    boolean var20 = var0.valid_f((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test44() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "1bc";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var7.valid_s((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "1bc";
    boolean var12 = var10.validateIdentifier(var11);
    boolean var13 = var7.validateIdentifier(var11);
    boolean var14 = var0.validateIdentifier(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test45() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "1bc";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    ds.Identifier var7 = new ds.Identifier();
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('1');
    boolean var10 = var8.valid_s((char)var9);
    java.lang.Character var11 = new java.lang.Character('b');
    boolean var12 = var8.valid_f((char)var11);
    boolean var13 = var7.valid_s((char)var11);
    boolean var14 = var6.valid_f((char)var11);
    boolean var15 = var3.valid_f((char)var11);
    boolean var16 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test46() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('1');
    boolean var7 = var5.valid_s((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('1');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('b');
    boolean var13 = var9.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test47() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('b');
    boolean var11 = var7.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test48() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('1');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('b');
    boolean var5 = var1.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var6.valid_s((char)var7);
    java.lang.Character var9 = new java.lang.Character('b');
    boolean var10 = var6.valid_f((char)var9);
    boolean var11 = var1.valid_f((char)var9);
    boolean var12 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test49() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('b');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('1');
    boolean var7 = var5.valid_s((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "1bc";
    boolean var11 = var9.validateIdentifier(var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "1bc";
    boolean var14 = var12.validateIdentifier(var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "1bc";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var12.validateIdentifier(var16);
    boolean var19 = var9.validateIdentifier(var16);
    boolean var20 = var0.validateIdentifier(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test50() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('1');
    boolean var4 = var2.valid_s((char)var3);
    boolean var5 = var1.valid_f((char)var3);
    boolean var6 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test51() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "1bc";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('1');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "1bc";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('1');
    boolean var13 = var11.valid_s((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character('1');
    boolean var17 = var15.valid_s((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test52() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('1');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('1');
    boolean var6 = var4.valid_s((char)var5);
    boolean var7 = var3.valid_f((char)var5);
    boolean var8 = var0.valid_s((char)var5);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "1bc";
    boolean var12 = var10.validateIdentifier(var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "1bc";
    boolean var15 = var13.validateIdentifier(var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.String var17 = "1bc";
    boolean var18 = var16.validateIdentifier(var17);
    boolean var19 = var13.validateIdentifier(var17);
    boolean var20 = var10.validateIdentifier(var17);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('1');
    boolean var23 = var21.valid_s((char)var22);
    java.lang.Character var24 = new java.lang.Character('b');
    boolean var25 = var21.valid_f((char)var24);
    boolean var26 = var10.valid_f((char)var24);
    boolean var27 = var9.valid_f((char)var24);
    boolean var28 = var0.valid_s((char)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

}
