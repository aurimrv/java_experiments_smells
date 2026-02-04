package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
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

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
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
    assertTrue(var6 == false);

  }

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test11() throws Throwable {

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

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
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
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test21() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character(' ');
    boolean var4 = var0.valid_f((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test27() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test30() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test31() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
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
    assertTrue(var6 == false);

  }

  public void test32() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "643632814216";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test33() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test34() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test35() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test36() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('3');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test37() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test38() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('4');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('_');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('6');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('3');
    boolean var13 = var3.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test39() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test40() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('M');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test41() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "643632814216";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test42() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('M');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
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

  public void test43() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test44() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('3');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test45() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test46() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.String var7 = "hi!";
    boolean var8 = var0.validateIdentifier(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test47() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "g";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('+');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('=');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test48() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test49() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('M');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test50() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('M');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test51() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test52() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test53() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.valid_s((char)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test54() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test55() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.valid_s((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test56() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('`');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test57() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('M');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test58() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.String var9 = "hi!";
    boolean var10 = var0.validateIdentifier(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test59() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test60() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('3');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('1');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('.');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test61() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "643632814216";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test62() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.String var11 = "hi!";
    boolean var12 = var0.validateIdentifier(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test63() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test64() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('1');
    boolean var22 = var0.valid_f((char)var21);
    boolean var23 = var0.valid_s((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test65() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "g";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var0.validateIdentifier(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test66() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test67() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test68() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('M');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test69() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test70() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
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

  public void test71() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('3');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.valid_s((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test72() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    boolean var11 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test73() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('2');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "643632814216";
    boolean var15 = var13.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test74() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('}');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "g";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var0.validateIdentifier(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test75() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test76() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('}');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.String var20 = "643632814216";
    boolean var21 = var19.validateIdentifier(var20);
    boolean var22 = var0.validateIdentifier(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test77() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test78() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test79() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "643632814216";
    boolean var13 = var11.validateIdentifier(var12);
    boolean var14 = var0.validateIdentifier(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test80() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "643632814216";
    boolean var15 = var13.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test81() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('}');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    boolean var21 = var0.valid_s((char)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test82() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.valid_s((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test83() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('`');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('8');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test84() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test85() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('`');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test86() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('`');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test87() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('}');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('.');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test88() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test89() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('`');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('8');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test90() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test91() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('}');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('&');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test92() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test93() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('M');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test94() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.valid_s((char)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test95() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test96() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test97() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('M');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('3');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test98() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('1');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('!');
    boolean var24 = var0.valid_f((char)var23);
    boolean var25 = var0.valid_s((char)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test99() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('1');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('!');
    boolean var24 = var0.valid_f((char)var23);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.Character var26 = new java.lang.Character('6');
    boolean var27 = var25.valid_s((char)var26);
    java.lang.Character var28 = new java.lang.Character('4');
    boolean var29 = var25.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('_');
    boolean var31 = var25.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('6');
    boolean var33 = var25.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('3');
    boolean var35 = var25.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('^');
    boolean var37 = var25.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('_');
    boolean var39 = var25.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('1');
    boolean var41 = var25.valid_f((char)var40);
    java.lang.Character var42 = new java.lang.Character('.');
    boolean var43 = var25.valid_f((char)var42);
    java.lang.Character var44 = new java.lang.Character('2');
    boolean var45 = var25.valid_f((char)var44);
    java.lang.Character var46 = new java.lang.Character('1');
    boolean var47 = var25.valid_f((char)var46);
    java.lang.Character var48 = new java.lang.Character('!');
    boolean var49 = var25.valid_f((char)var48);
    boolean var50 = var0.valid_s((char)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test100() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('M');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('4');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('_');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('6');
    boolean var11 = var3.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test101() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('M');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('+');
    boolean var11 = var9.valid_s((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test102() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('+');
    boolean var21 = var19.valid_s((char)var20);
    java.lang.Character var22 = new java.lang.Character('=');
    boolean var23 = var19.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('_');
    boolean var25 = var19.valid_f((char)var24);
    boolean var26 = var0.valid_f((char)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test103() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test104() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('}');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test105() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test106() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('1');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character('M');
    boolean var25 = var23.valid_s((char)var24);
    java.lang.Character var26 = new java.lang.Character('4');
    boolean var27 = var23.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('_');
    boolean var29 = var23.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('6');
    boolean var31 = var23.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('3');
    boolean var33 = var23.valid_f((char)var32);
    boolean var34 = var0.valid_s((char)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test107() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('a');
    boolean var14 = var0.valid_f((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test108() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('g');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('4');
    boolean var9 = var5.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test109() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('+');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('4');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('_');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('6');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('>');
    boolean var15 = var5.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('^');
    boolean var17 = var5.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('_');
    boolean var19 = var5.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('}');
    boolean var21 = var5.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('.');
    boolean var23 = var5.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.Character var25 = new java.lang.Character('g');
    boolean var26 = var24.valid_s((char)var25);
    java.lang.Character var27 = new java.lang.Character('4');
    boolean var28 = var24.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('_');
    boolean var30 = var24.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('`');
    boolean var32 = var24.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('>');
    boolean var34 = var24.valid_f((char)var33);
    boolean var35 = var5.valid_s((char)var33);
    boolean var36 = var0.valid_f((char)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test110() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('6');
    boolean var10 = var8.valid_s((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var8.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var8.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('6');
    boolean var16 = var8.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('3');
    boolean var18 = var8.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('^');
    boolean var20 = var8.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('_');
    boolean var22 = var8.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('1');
    boolean var24 = var8.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('.');
    boolean var26 = var8.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('2');
    boolean var28 = var8.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('1');
    boolean var30 = var8.valid_f((char)var29);
    ds.Identifier var31 = new ds.Identifier();
    java.lang.Character var32 = new java.lang.Character('6');
    boolean var33 = var31.valid_s((char)var32);
    java.lang.Character var34 = new java.lang.Character('4');
    boolean var35 = var31.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('_');
    boolean var37 = var31.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('6');
    boolean var39 = var31.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('3');
    boolean var41 = var31.valid_f((char)var40);
    boolean var42 = var8.valid_f((char)var40);
    ds.Identifier var43 = new ds.Identifier();
    java.lang.String var44 = "643632814216";
    boolean var45 = var43.validateIdentifier(var44);
    boolean var46 = var8.validateIdentifier(var44);
    boolean var47 = var1.validateIdentifier(var44);
    boolean var48 = var0.validateIdentifier(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test111() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test112() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('_');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('6');
    boolean var15 = var7.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('3');
    boolean var17 = var7.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('^');
    boolean var19 = var7.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
    boolean var21 = var7.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('1');
    boolean var23 = var7.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('.');
    boolean var25 = var7.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('2');
    boolean var27 = var7.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('1');
    boolean var29 = var7.valid_f((char)var28);
    ds.Identifier var30 = new ds.Identifier();
    java.lang.Character var31 = new java.lang.Character('6');
    boolean var32 = var30.valid_s((char)var31);
    java.lang.Character var33 = new java.lang.Character('4');
    boolean var34 = var30.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('_');
    boolean var36 = var30.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('6');
    boolean var38 = var30.valid_f((char)var37);
    java.lang.Character var39 = new java.lang.Character('3');
    boolean var40 = var30.valid_f((char)var39);
    boolean var41 = var7.valid_f((char)var39);
    ds.Identifier var42 = new ds.Identifier();
    java.lang.String var43 = "643632814216";
    boolean var44 = var42.validateIdentifier(var43);
    boolean var45 = var7.validateIdentifier(var43);
    boolean var46 = var0.validateIdentifier(var43);
    ds.Identifier var47 = new ds.Identifier();
    java.lang.String var48 = "643632814216";
    boolean var49 = var47.validateIdentifier(var48);
    boolean var50 = var0.validateIdentifier(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test113() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('4');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('_');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('6');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('3');
    boolean var13 = var3.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('^');
    boolean var15 = var3.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('_');
    boolean var17 = var3.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('1');
    boolean var19 = var3.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('.');
    boolean var21 = var3.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('2');
    boolean var23 = var3.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('1');
    boolean var25 = var3.valid_f((char)var24);
    ds.Identifier var26 = new ds.Identifier();
    java.lang.Character var27 = new java.lang.Character('6');
    boolean var28 = var26.valid_s((char)var27);
    java.lang.Character var29 = new java.lang.Character('4');
    boolean var30 = var26.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('_');
    boolean var32 = var26.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('6');
    boolean var34 = var26.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('3');
    boolean var36 = var26.valid_f((char)var35);
    boolean var37 = var3.valid_f((char)var35);
    ds.Identifier var38 = new ds.Identifier();
    java.lang.String var39 = "643632814216";
    boolean var40 = var38.validateIdentifier(var39);
    boolean var41 = var3.validateIdentifier(var39);
    boolean var42 = var0.validateIdentifier(var39);
    ds.Identifier var43 = new ds.Identifier();
    java.lang.Character var44 = new java.lang.Character('g');
    boolean var45 = var43.valid_s((char)var44);
    java.lang.Character var46 = new java.lang.Character('4');
    boolean var47 = var43.valid_f((char)var46);
    boolean var48 = var0.valid_f((char)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test114() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('g');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test115() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('g');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('=');
    boolean var9 = var5.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('6');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('_');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('6');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('3');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('^');
    boolean var23 = var11.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.Character var25 = new java.lang.Character('6');
    boolean var26 = var24.valid_s((char)var25);
    java.lang.Character var27 = new java.lang.Character('4');
    boolean var28 = var24.valid_f((char)var27);
    java.lang.String var29 = "hi!";
    boolean var30 = var24.validateIdentifier(var29);
    boolean var31 = var11.validateIdentifier(var29);
    boolean var32 = var0.validateIdentifier(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test116() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('}');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('g');
    boolean var21 = var19.valid_s((char)var20);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var19.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('_');
    boolean var25 = var19.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('`');
    boolean var27 = var19.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('>');
    boolean var29 = var19.valid_f((char)var28);
    boolean var30 = var0.valid_s((char)var28);
    ds.Identifier var31 = new ds.Identifier();
    java.lang.Character var32 = new java.lang.Character('g');
    boolean var33 = var31.valid_s((char)var32);
    java.lang.Character var34 = new java.lang.Character('4');
    boolean var35 = var31.valid_f((char)var34);
    boolean var36 = var0.valid_f((char)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test117() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('g');
    boolean var12 = var10.valid_s((char)var11);
    java.lang.Character var13 = new java.lang.Character('4');
    boolean var14 = var10.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('_');
    boolean var16 = var10.valid_f((char)var15);
    boolean var17 = var9.valid_s((char)var15);
    boolean var18 = var0.valid_f((char)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test118() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "643632814216";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('g');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('=');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('_');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('`');
    boolean var13 = var5.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test119() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('1');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character('g');
    boolean var25 = var23.valid_s((char)var24);
    ds.Identifier var26 = new ds.Identifier();
    java.lang.Character var27 = new java.lang.Character('g');
    boolean var28 = var26.valid_s((char)var27);
    java.lang.Character var29 = new java.lang.Character('4');
    boolean var30 = var26.valid_f((char)var29);
    boolean var31 = var23.valid_f((char)var29);
    boolean var32 = var0.valid_s((char)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test120() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('g');
    boolean var12 = var10.valid_s((char)var11);
    java.lang.Character var13 = new java.lang.Character('4');
    boolean var14 = var10.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('_');
    boolean var16 = var10.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('`');
    boolean var18 = var10.valid_f((char)var17);
    boolean var19 = var9.valid_s((char)var17);
    boolean var20 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test121() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('+');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('_');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('6');
    boolean var15 = var7.valid_f((char)var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.String var17 = "643632814216";
    boolean var18 = var16.validateIdentifier(var17);
    boolean var19 = var7.validateIdentifier(var17);
    boolean var20 = var0.validateIdentifier(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test122() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var3.valid_s((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character('+');
    boolean var8 = var6.valid_s((char)var7);
    boolean var9 = var3.valid_f((char)var7);
    boolean var10 = var0.valid_s((char)var7);
    
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

  }

  public void test123() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('+');
    boolean var15 = var13.valid_s((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test124() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('+');
    boolean var4 = var2.valid_s((char)var3);
    boolean var5 = var1.valid_s((char)var3);
    boolean var6 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test125() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test126() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('>');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('^');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test127() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.String var5 = "hi!";
    boolean var6 = var0.validateIdentifier(var5);
    ds.Identifier var7 = new ds.Identifier();
    ds.Identifier var8 = new ds.Identifier();
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('g');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var9.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('_');
    boolean var15 = var9.valid_f((char)var14);
    boolean var16 = var8.valid_f((char)var14);
    boolean var17 = var7.valid_s((char)var14);
    ds.Identifier var18 = new ds.Identifier();
    java.lang.Character var19 = new java.lang.Character('6');
    boolean var20 = var18.valid_s((char)var19);
    java.lang.Character var21 = new java.lang.Character('4');
    boolean var22 = var18.valid_f((char)var21);
    boolean var23 = var7.valid_s((char)var21);
    boolean var24 = var0.valid_f((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test128() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('3');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('g');
    boolean var9 = var7.valid_s((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.Character var11 = new java.lang.Character('g');
    boolean var12 = var10.valid_s((char)var11);
    java.lang.Character var13 = new java.lang.Character('4');
    boolean var14 = var10.valid_f((char)var13);
    boolean var15 = var7.valid_f((char)var13);
    boolean var16 = var0.valid_s((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
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
    assertTrue(var16 == false);

  }

  public void test129() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('1');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('!');
    boolean var24 = var0.valid_f((char)var23);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.Character var26 = new java.lang.Character('g');
    boolean var27 = var25.valid_s((char)var26);
    ds.Identifier var28 = new ds.Identifier();
    java.lang.Character var29 = new java.lang.Character('g');
    boolean var30 = var28.valid_s((char)var29);
    java.lang.Character var31 = new java.lang.Character('4');
    boolean var32 = var28.valid_f((char)var31);
    boolean var33 = var25.valid_f((char)var31);
    boolean var34 = var0.valid_s((char)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test130() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.Character var5 = new java.lang.Character('+');
    boolean var6 = var4.valid_s((char)var5);
    java.lang.Character var7 = new java.lang.Character('4');
    boolean var8 = var4.valid_f((char)var7);
    boolean var9 = var3.valid_f((char)var7);
    boolean var10 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test131() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "g";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test132() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('6');
    boolean var21 = var19.valid_s((char)var20);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var19.valid_f((char)var22);
    boolean var24 = var0.valid_s((char)var22);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.Character var26 = new java.lang.Character('g');
    boolean var27 = var25.valid_s((char)var26);
    java.lang.Character var28 = new java.lang.Character('=');
    boolean var29 = var25.valid_f((char)var28);
    boolean var30 = var0.valid_s((char)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test133() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('g');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('`');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('3');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('2');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test134() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('6');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('6');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('_');
    boolean var17 = var11.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test135() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('2');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character('+');
    boolean var23 = var21.valid_s((char)var22);
    java.lang.Character var24 = new java.lang.Character('4');
    boolean var25 = var21.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('_');
    boolean var27 = var21.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('6');
    boolean var29 = var21.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('>');
    boolean var31 = var21.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('^');
    boolean var33 = var21.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('_');
    boolean var35 = var21.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('}');
    boolean var37 = var21.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('.');
    boolean var39 = var21.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('2');
    boolean var41 = var21.valid_f((char)var40);
    java.lang.Character var42 = new java.lang.Character('&');
    boolean var43 = var21.valid_f((char)var42);
    boolean var44 = var0.valid_f((char)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test136() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character(' ');
    boolean var20 = var0.valid_s((char)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test137() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('=');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('+');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('_');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('6');
    boolean var15 = var7.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('>');
    boolean var17 = var7.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('^');
    boolean var19 = var7.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test138() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('=');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('_');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('+');
    boolean var11 = var9.valid_s((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('+');
    boolean var15 = var13.valid_s((char)var14);
    java.lang.Character var16 = new java.lang.Character('=');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('_');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.String var20 = "hi!";
    boolean var21 = var13.validateIdentifier(var20);
    boolean var22 = var0.validateIdentifier(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test139() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "643632814216";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('+');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('6');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('4');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('3');
    boolean var13 = var7.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character('6');
    boolean var17 = var15.valid_s((char)var16);
    java.lang.Character var18 = new java.lang.Character('4');
    boolean var19 = var15.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
    boolean var21 = var15.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('6');
    boolean var23 = var15.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('3');
    boolean var25 = var15.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('^');
    boolean var27 = var15.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('_');
    boolean var29 = var15.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('1');
    boolean var31 = var15.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('.');
    boolean var33 = var15.valid_f((char)var32);
    boolean var34 = var0.valid_f((char)var32);
    
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test140() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('g');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('`');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test141() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('6');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('3');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('1');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.String var20 = "643632814216";
    boolean var21 = var19.validateIdentifier(var20);
    ds.Identifier var22 = new ds.Identifier();
    ds.Identifier var23 = new ds.Identifier();
    java.lang.String var24 = "643632814216";
    boolean var25 = var23.validateIdentifier(var24);
    boolean var26 = var22.validateIdentifier(var24);
    boolean var27 = var19.validateIdentifier(var24);
    boolean var28 = var0.validateIdentifier(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test142() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('6');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('4');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('_');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('6');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('3');
    boolean var15 = var5.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test143() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('_');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('>');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('^');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('_');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('}');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('.');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('g');
    boolean var21 = var19.valid_s((char)var20);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var19.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('_');
    boolean var25 = var19.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('`');
    boolean var27 = var19.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('>');
    boolean var29 = var19.valid_f((char)var28);
    boolean var30 = var0.valid_s((char)var28);
    ds.Identifier var31 = new ds.Identifier();
    ds.Identifier var32 = new ds.Identifier();
    java.lang.Character var33 = new java.lang.Character('6');
    boolean var34 = var32.valid_s((char)var33);
    java.lang.Character var35 = new java.lang.Character('4');
    boolean var36 = var32.valid_f((char)var35);
    java.lang.String var37 = "hi!";
    boolean var38 = var32.validateIdentifier(var37);
    boolean var39 = var31.validateIdentifier(var37);
    boolean var40 = var0.validateIdentifier(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

}
