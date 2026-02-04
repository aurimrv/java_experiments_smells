package ds.seed5831;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5831 in this file.
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
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    boolean var3 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
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

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
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

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('4');
    boolean var4 = var0.valid_f((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
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
    assertTrue(var9 == false);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

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
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
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
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
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

  public void test21() throws Throwable {

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

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
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
    assertTrue(var12 == true);

  }

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
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

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
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

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
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
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
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

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
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

  public void test30() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test31() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    boolean var13 = var0.validateIdentifier(var1);
    
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

  public void test32() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
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

  public void test33() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test34() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test35() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
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

  public void test36() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.validateIdentifier(var1);
    
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
    assertTrue(var15 == true);

  }

  public void test37() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test38() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test39() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('p');
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

  public void test40() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.validateIdentifier(var1);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test41() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test42() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('*');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test43() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
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
    assertTrue(var14 == true);

  }

  public void test44() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test45() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.validateIdentifier(var1);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test46() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('c');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.validateIdentifier(var1);
    
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
    assertTrue(var17 == true);

  }

  public void test47() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
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
    assertTrue(var12 == true);

  }

  public void test48() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
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

  public void test49() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    
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
    assertTrue(var14 == false);

  }

  public void test50() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('*');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('g');
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test51() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test52() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "+";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test53() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var0.validateIdentifier(var18);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test54() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test55() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('c');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.valid_s((char)var17);
    
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
    assertTrue(var19 == true);

  }

  public void test56() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('c');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    boolean var21 = var0.valid_s((char)var19);
    
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
    assertTrue(var21 == true);

  }

  public void test57() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test58() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('i');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test59() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test60() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('l');
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test61() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test62() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test63() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "+";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test64() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
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
    assertTrue(var12 == true);

  }

  public void test65() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
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

  public void test66() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('i');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('*');
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

  public void test67() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test68() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test69() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('c');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('n');
    boolean var22 = var0.valid_f((char)var21);
    boolean var23 = var0.validateIdentifier(var1);
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test70() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "ka8d7bjypluhny002v3y03yu80";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('d');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('y');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('1');
    boolean var11 = var3.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test71() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('n');
    boolean var22 = var0.valid_f((char)var21);
    boolean var23 = var0.valid_s((char)var21);
    
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
    assertTrue(var14 == false);
    
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

  }

  public void test72() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "ka8d7bjypluhny002v3y03yu80";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test73() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('p');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('c');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('u');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('h');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('n');
    boolean var23 = var1.valid_f((char)var22);
    boolean var24 = var0.valid_s((char)var22);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test74() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
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

  public void test75() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('7');
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

  public void test76() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('l');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('u');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test77() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('}');
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test78() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
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
    assertTrue(var10 == false);

  }

  public void test79() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('l');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test80() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('i');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('*');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('g');
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
    assertTrue(var10 == true);

  }

  public void test81() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('*');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('g');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
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

  public void test82() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('7');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.String var9 = "hi!";
    boolean var10 = var0.validateIdentifier(var9);
    
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

  public void test83() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('c');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('n');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('y');
    boolean var24 = var0.valid_f((char)var23);
    boolean var25 = var0.validateIdentifier(var1);
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test84() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
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
    assertTrue(var14 == true);

  }

  public void test85() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('n');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('y');
    boolean var24 = var0.valid_f((char)var23);
    ds.Identifier var25 = new ds.Identifier();
    
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
    assertTrue(var14 == false);
    
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

  public void test86() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('n');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('y');
    boolean var24 = var0.valid_f((char)var23);
    
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
    assertTrue(var14 == false);
    
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

  public void test87() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('k');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test88() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.valid_s((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test89() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    boolean var8 = var0.validateIdentifier(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test90() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('`');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('l');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('u');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('h');
    boolean var21 = var1.valid_f((char)var20);
    boolean var22 = var0.valid_s((char)var20);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test91() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "u6su";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character(' ');
    boolean var5 = var3.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test92() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('*');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('g');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('b');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.String var13 = "hi!";
    boolean var14 = var0.validateIdentifier(var13);
    
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
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test93() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('*');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('g');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('b');
    boolean var12 = var0.valid_f((char)var11);
    
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
    assertTrue(var12 == true);

  }

  public void test94() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
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

  public void test95() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('p');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('c');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('u');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('h');
    boolean var21 = var1.valid_f((char)var20);
    boolean var22 = var0.valid_s((char)var20);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test96() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('}');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test97() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('+');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('i');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('*');
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

  public void test98() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "hi!";
    boolean var11 = var9.validateIdentifier(var10);
    java.lang.Character var12 = new java.lang.Character('g');
    boolean var13 = var9.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('y');
    boolean var15 = var9.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('b');
    boolean var17 = var9.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('j');
    boolean var19 = var9.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('y');
    boolean var21 = var9.valid_f((char)var20);
    boolean var22 = var0.valid_f((char)var20);
    
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
    assertTrue(var22 == true);

  }

  public void test99() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character(' ');
    boolean var13 = var11.valid_f((char)var12);
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
    assertTrue(var14 == false);

  }

  public void test100() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('d');
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
    assertTrue(var4 == true);

  }

  public void test101() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('n');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.String var24 = "ka8d7bjypluhny002v3y03yu80";
    boolean var25 = var23.validateIdentifier(var24);
    boolean var26 = var0.validateIdentifier(var24);
    
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
    assertTrue(var14 == false);
    
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
    assertTrue(var26 == false);

  }

  public void test102() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    java.lang.Character var10 = new java.lang.Character('g');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('b');
    boolean var15 = var7.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('j');
    boolean var17 = var7.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('y');
    boolean var19 = var7.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
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

  public void test103() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('p');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "u6su";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var0.validateIdentifier(var16);
    
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
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test104() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.String var20 = "ka8d7bjypluhny002v3y03yu80";
    boolean var21 = var19.validateIdentifier(var20);
    boolean var22 = var0.validateIdentifier(var20);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.String var24 = "hi!";
    boolean var25 = var23.validateIdentifier(var24);
    java.lang.Character var26 = new java.lang.Character('d');
    boolean var27 = var23.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('y');
    boolean var29 = var23.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('1');
    boolean var31 = var23.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('y');
    boolean var33 = var23.valid_f((char)var32);
    ds.Identifier var34 = new ds.Identifier();
    java.lang.String var35 = "hi!";
    boolean var36 = var34.validateIdentifier(var35);
    java.lang.Character var37 = new java.lang.Character('g');
    boolean var38 = var34.valid_f((char)var37);
    java.lang.Character var39 = new java.lang.Character('y');
    boolean var40 = var34.valid_f((char)var39);
    java.lang.Character var41 = new java.lang.Character('b');
    boolean var42 = var34.valid_f((char)var41);
    java.lang.Character var43 = new java.lang.Character('j');
    boolean var44 = var34.valid_f((char)var43);
    java.lang.Character var45 = new java.lang.Character('y');
    boolean var46 = var34.valid_f((char)var45);
    java.lang.Character var47 = new java.lang.Character('`');
    boolean var48 = var34.valid_f((char)var47);
    java.lang.Character var49 = new java.lang.Character('l');
    boolean var50 = var34.valid_f((char)var49);
    java.lang.Character var51 = new java.lang.Character('u');
    boolean var52 = var34.valid_f((char)var51);
    ds.Identifier var53 = new ds.Identifier();
    java.lang.String var54 = "ka8d7bjypluhny002v3y03yu80";
    boolean var55 = var53.validateIdentifier(var54);
    boolean var56 = var34.validateIdentifier(var54);
    boolean var57 = var23.validateIdentifier(var54);
    boolean var58 = var0.validateIdentifier(var54);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test105() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('+');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('i');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('*');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('g');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var3.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    java.lang.Character var15 = new java.lang.Character('4');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character(' ');
    boolean var18 = var0.valid_s((char)var17);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test106() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('7');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test107() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('d');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('y');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('1');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var3.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('l');
    boolean var15 = var3.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('p');
    boolean var17 = var3.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('c');
    boolean var19 = var3.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('u');
    boolean var21 = var3.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('h');
    boolean var23 = var3.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('n');
    boolean var25 = var3.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('y');
    boolean var27 = var3.valid_f((char)var26);
    boolean var28 = var0.valid_s((char)var26);
    
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
    assertTrue(var28 == true);

  }

  public void test108() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "hi!";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('d');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('y');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('1');
    boolean var21 = var13.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('y');
    boolean var23 = var13.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('l');
    boolean var25 = var13.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('p');
    boolean var27 = var13.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('c');
    boolean var29 = var13.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('u');
    boolean var31 = var13.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('h');
    boolean var33 = var13.valid_f((char)var32);
    boolean var34 = var0.valid_s((char)var32);
    
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
    assertTrue(var12 == true);
    
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
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test109() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('}');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('h');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.Character var22 = new java.lang.Character(' ');
    boolean var23 = var21.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.Character var25 = new java.lang.Character(' ');
    boolean var26 = var24.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('g');
    boolean var28 = var24.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('y');
    boolean var30 = var24.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('1');
    boolean var32 = var24.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('y');
    boolean var34 = var24.valid_f((char)var33);
    ds.Identifier var35 = new ds.Identifier();
    java.lang.String var36 = "hi!";
    boolean var37 = var35.validateIdentifier(var36);
    boolean var38 = var24.validateIdentifier(var36);
    boolean var39 = var21.validateIdentifier(var36);
    boolean var40 = var0.validateIdentifier(var36);
    
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
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test110() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character(' ');
    boolean var5 = var3.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character(' ');
    boolean var8 = var6.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('g');
    boolean var10 = var6.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var6.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('1');
    boolean var14 = var6.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('y');
    boolean var16 = var6.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var6.validateIdentifier(var18);
    boolean var21 = var3.validateIdentifier(var18);
    boolean var22 = var0.validateIdentifier(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test111() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('u');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.String var20 = "ka8d7bjypluhny002v3y03yu80";
    boolean var21 = var19.validateIdentifier(var20);
    boolean var22 = var0.validateIdentifier(var20);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character(' ');
    boolean var25 = var23.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('d');
    boolean var27 = var23.valid_f((char)var26);
    ds.Identifier var28 = new ds.Identifier();
    java.lang.String var29 = "hi!";
    boolean var30 = var28.validateIdentifier(var29);
    java.lang.Character var31 = new java.lang.Character('g');
    boolean var32 = var28.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('y');
    boolean var34 = var28.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('b');
    boolean var36 = var28.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('j');
    boolean var38 = var28.valid_f((char)var37);
    java.lang.Character var39 = new java.lang.Character('y');
    boolean var40 = var28.valid_f((char)var39);
    java.lang.Character var41 = new java.lang.Character('`');
    boolean var42 = var28.valid_f((char)var41);
    java.lang.Character var43 = new java.lang.Character('l');
    boolean var44 = var28.valid_f((char)var43);
    boolean var45 = var23.valid_f((char)var43);
    boolean var46 = var0.valid_f((char)var43);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
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
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test112() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('l');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character(' ');
    boolean var19 = var17.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('d');
    boolean var21 = var17.valid_f((char)var20);
    ds.Identifier var22 = new ds.Identifier();
    java.lang.String var23 = "hi!";
    boolean var24 = var22.validateIdentifier(var23);
    java.lang.Character var25 = new java.lang.Character('g');
    boolean var26 = var22.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('y');
    boolean var28 = var22.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('b');
    boolean var30 = var22.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('j');
    boolean var32 = var22.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('y');
    boolean var34 = var22.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('`');
    boolean var36 = var22.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('l');
    boolean var38 = var22.valid_f((char)var37);
    boolean var39 = var17.valid_f((char)var37);
    ds.Identifier var40 = new ds.Identifier();
    java.lang.Character var41 = new java.lang.Character('+');
    boolean var42 = var40.valid_s((char)var41);
    boolean var43 = var17.valid_f((char)var41);
    boolean var44 = var0.valid_s((char)var41);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test113() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character(' ');
    boolean var9 = var7.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('d');
    boolean var11 = var7.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
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
    assertTrue(var12 == true);

  }

  public void test114() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "hi!";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('g');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('y');
    boolean var9 = var3.valid_f((char)var8);
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "hi!";
    boolean var12 = var10.validateIdentifier(var11);
    boolean var13 = var3.validateIdentifier(var11);
    boolean var14 = var0.validateIdentifier(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test115() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.String var9 = "hi!";
    boolean var10 = var8.validateIdentifier(var9);
    boolean var11 = var1.validateIdentifier(var9);
    boolean var12 = var0.validateIdentifier(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test116() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character(' ');
    boolean var5 = var3.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character(' ');
    boolean var8 = var6.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('g');
    boolean var10 = var6.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var6.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character(' ');
    boolean var15 = var13.valid_f((char)var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.Character var17 = new java.lang.Character(' ');
    boolean var18 = var16.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('g');
    boolean var20 = var16.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('y');
    boolean var22 = var16.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('1');
    boolean var24 = var16.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('y');
    boolean var26 = var16.valid_f((char)var25);
    ds.Identifier var27 = new ds.Identifier();
    java.lang.String var28 = "hi!";
    boolean var29 = var27.validateIdentifier(var28);
    boolean var30 = var16.validateIdentifier(var28);
    boolean var31 = var13.validateIdentifier(var28);
    boolean var32 = var6.validateIdentifier(var28);
    boolean var33 = var3.validateIdentifier(var28);
    java.lang.Character var34 = new java.lang.Character('a');
    boolean var35 = var3.valid_s((char)var34);
    boolean var36 = var0.valid_f((char)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test117() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character(' ');
    boolean var5 = var3.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.Character var7 = new java.lang.Character(' ');
    boolean var8 = var6.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('g');
    boolean var10 = var6.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var6.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('1');
    boolean var14 = var6.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('y');
    boolean var16 = var6.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var6.validateIdentifier(var18);
    boolean var21 = var3.validateIdentifier(var18);
    boolean var22 = var0.validateIdentifier(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test118() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('b');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('j');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('y');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('`');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character(' ');
    boolean var17 = var15.valid_f((char)var16);
    ds.Identifier var18 = new ds.Identifier();
    java.lang.Character var19 = new java.lang.Character(' ');
    boolean var20 = var18.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('g');
    boolean var22 = var18.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('y');
    boolean var24 = var18.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('1');
    boolean var26 = var18.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('y');
    boolean var28 = var18.valid_f((char)var27);
    ds.Identifier var29 = new ds.Identifier();
    java.lang.String var30 = "hi!";
    boolean var31 = var29.validateIdentifier(var30);
    boolean var32 = var18.validateIdentifier(var30);
    boolean var33 = var15.validateIdentifier(var30);
    boolean var34 = var0.validateIdentifier(var30);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test119() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    java.lang.Character var8 = new java.lang.Character('d');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('1');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('y');
    boolean var15 = var5.valid_f((char)var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.String var17 = "hi!";
    boolean var18 = var16.validateIdentifier(var17);
    java.lang.Character var19 = new java.lang.Character('g');
    boolean var20 = var16.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('y');
    boolean var22 = var16.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('b');
    boolean var24 = var16.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('j');
    boolean var26 = var16.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('y');
    boolean var28 = var16.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('`');
    boolean var30 = var16.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('l');
    boolean var32 = var16.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('u');
    boolean var34 = var16.valid_f((char)var33);
    ds.Identifier var35 = new ds.Identifier();
    java.lang.String var36 = "ka8d7bjypluhny002v3y03yu80";
    boolean var37 = var35.validateIdentifier(var36);
    boolean var38 = var16.validateIdentifier(var36);
    boolean var39 = var5.validateIdentifier(var36);
    boolean var40 = var0.validateIdentifier(var36);
    ds.Identifier var41 = new ds.Identifier();
    java.lang.Character var42 = new java.lang.Character(' ');
    boolean var43 = var41.valid_f((char)var42);
    java.lang.Character var44 = new java.lang.Character('g');
    boolean var45 = var41.valid_f((char)var44);
    java.lang.Character var46 = new java.lang.Character('y');
    boolean var47 = var41.valid_f((char)var46);
    java.lang.Character var48 = new java.lang.Character('b');
    boolean var49 = var41.valid_f((char)var48);
    ds.Identifier var50 = new ds.Identifier();
    java.lang.Character var51 = new java.lang.Character(' ');
    boolean var52 = var50.valid_f((char)var51);
    java.lang.Character var53 = new java.lang.Character('g');
    boolean var54 = var50.valid_f((char)var53);
    ds.Identifier var55 = new ds.Identifier();
    java.lang.String var56 = "hi!";
    boolean var57 = var55.validateIdentifier(var56);
    java.lang.Character var58 = new java.lang.Character('d');
    boolean var59 = var55.valid_f((char)var58);
    java.lang.Character var60 = new java.lang.Character('y');
    boolean var61 = var55.valid_f((char)var60);
    java.lang.Character var62 = new java.lang.Character('1');
    boolean var63 = var55.valid_f((char)var62);
    java.lang.Character var64 = new java.lang.Character('y');
    boolean var65 = var55.valid_f((char)var64);
    ds.Identifier var66 = new ds.Identifier();
    java.lang.String var67 = "hi!";
    boolean var68 = var66.validateIdentifier(var67);
    java.lang.Character var69 = new java.lang.Character('g');
    boolean var70 = var66.valid_f((char)var69);
    java.lang.Character var71 = new java.lang.Character('y');
    boolean var72 = var66.valid_f((char)var71);
    java.lang.Character var73 = new java.lang.Character('b');
    boolean var74 = var66.valid_f((char)var73);
    java.lang.Character var75 = new java.lang.Character('j');
    boolean var76 = var66.valid_f((char)var75);
    java.lang.Character var77 = new java.lang.Character('y');
    boolean var78 = var66.valid_f((char)var77);
    java.lang.Character var79 = new java.lang.Character('`');
    boolean var80 = var66.valid_f((char)var79);
    java.lang.Character var81 = new java.lang.Character('l');
    boolean var82 = var66.valid_f((char)var81);
    java.lang.Character var83 = new java.lang.Character('u');
    boolean var84 = var66.valid_f((char)var83);
    ds.Identifier var85 = new ds.Identifier();
    java.lang.String var86 = "ka8d7bjypluhny002v3y03yu80";
    boolean var87 = var85.validateIdentifier(var86);
    boolean var88 = var66.validateIdentifier(var86);
    boolean var89 = var55.validateIdentifier(var86);
    boolean var90 = var50.validateIdentifier(var86);
    boolean var91 = var41.validateIdentifier(var86);
    boolean var92 = var0.validateIdentifier(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test120() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character(' ');
    boolean var15 = var13.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    java.lang.Character var17 = new java.lang.Character('a');
    boolean var18 = var0.valid_s((char)var17);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test121() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('l');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character(' ');
    boolean var15 = var13.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "hi!";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var0.validateIdentifier(var18);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test122() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('g');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('y');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('1');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('y');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "hi!";
    boolean var13 = var11.validateIdentifier(var12);
    java.lang.Character var14 = new java.lang.Character('g');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('y');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('b');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('j');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('y');
    boolean var23 = var11.valid_f((char)var22);
    boolean var24 = var0.valid_f((char)var22);
    
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

  public void test123() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character(' ');
    boolean var17 = var15.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var15.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('y');
    boolean var21 = var15.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('1');
    boolean var23 = var15.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('y');
    boolean var25 = var15.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('y');
    boolean var27 = var15.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('`');
    boolean var29 = var15.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('l');
    boolean var31 = var15.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('}');
    boolean var33 = var15.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('h');
    boolean var35 = var15.valid_f((char)var34);
    boolean var36 = var0.valid_s((char)var34);
    
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
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test124() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "+";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test125() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('k');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('+');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('i');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('*');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('g');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var3.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
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

  public void test126() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('d');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('1');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('l');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('p');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('c');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('u');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('h');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('n');
    boolean var23 = var1.valid_f((char)var22);
    boolean var24 = var0.valid_f((char)var22);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.String var26 = "hi!";
    boolean var27 = var25.validateIdentifier(var26);
    java.lang.Character var28 = new java.lang.Character('d');
    boolean var29 = var25.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('y');
    boolean var31 = var25.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('1');
    boolean var33 = var25.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('y');
    boolean var35 = var25.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('l');
    boolean var37 = var25.valid_f((char)var36);
    boolean var38 = var0.valid_f((char)var36);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
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
    assertTrue(var38 == true);

  }

  public void test127() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('+');
    boolean var11 = var9.valid_s((char)var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.Character var13 = new java.lang.Character('+');
    boolean var14 = var12.valid_s((char)var13);
    java.lang.Character var15 = new java.lang.Character('i');
    boolean var16 = var12.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('*');
    boolean var18 = var12.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('g');
    boolean var20 = var12.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('y');
    boolean var22 = var12.valid_f((char)var21);
    boolean var23 = var9.valid_f((char)var21);
    boolean var24 = var0.valid_s((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test128() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('+');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('i');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    java.lang.Character var8 = new java.lang.Character('g');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var5.valid_f((char)var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "hi!";
    boolean var14 = var12.validateIdentifier(var13);
    boolean var15 = var5.validateIdentifier(var13);
    boolean var16 = var0.validateIdentifier(var13);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('k');
    boolean var19 = var17.valid_s((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test129() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "hi!";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('y');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('b');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('j');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    ds.Identifier var13 = new ds.Identifier();
    ds.Identifier var14 = new ds.Identifier();
    java.lang.Character var15 = new java.lang.Character(' ');
    boolean var16 = var14.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var14.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('y');
    boolean var20 = var14.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('b');
    boolean var22 = var14.valid_f((char)var21);
    boolean var23 = var13.valid_f((char)var21);
    boolean var24 = var0.valid_f((char)var21);
    
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
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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

  public void test130() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    java.lang.Character var3 = new java.lang.Character('d');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "hi!";
    boolean var7 = var5.validateIdentifier(var6);
    java.lang.Character var8 = new java.lang.Character('g');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('y');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('b');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('j');
    boolean var15 = var5.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('y');
    boolean var17 = var5.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('`');
    boolean var19 = var5.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('l');
    boolean var21 = var5.valid_f((char)var20);
    boolean var22 = var0.valid_f((char)var20);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.String var24 = "hi!";
    boolean var25 = var23.validateIdentifier(var24);
    java.lang.Character var26 = new java.lang.Character('g');
    boolean var27 = var23.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('y');
    boolean var29 = var23.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('b');
    boolean var31 = var23.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('j');
    boolean var33 = var23.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('y');
    boolean var35 = var23.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('`');
    boolean var37 = var23.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('l');
    boolean var39 = var23.valid_f((char)var38);
    ds.Identifier var40 = new ds.Identifier();
    java.lang.String var41 = "hi!";
    boolean var42 = var40.validateIdentifier(var41);
    java.lang.Character var43 = new java.lang.Character('d');
    boolean var44 = var40.valid_f((char)var43);
    java.lang.Character var45 = new java.lang.Character('y');
    boolean var46 = var40.valid_f((char)var45);
    java.lang.Character var47 = new java.lang.Character('1');
    boolean var48 = var40.valid_f((char)var47);
    java.lang.Character var49 = new java.lang.Character('y');
    boolean var50 = var40.valid_f((char)var49);
    java.lang.Character var51 = new java.lang.Character('l');
    boolean var52 = var40.valid_f((char)var51);
    ds.Identifier var53 = new ds.Identifier();
    java.lang.Character var54 = new java.lang.Character(' ');
    boolean var55 = var53.valid_f((char)var54);
    boolean var56 = var40.valid_s((char)var54);
    boolean var57 = var23.valid_f((char)var54);
    boolean var58 = var0.valid_f((char)var54);
    ds.Identifier var59 = new ds.Identifier();
    java.lang.Character var60 = new java.lang.Character(' ');
    boolean var61 = var59.valid_f((char)var60);
    java.lang.Character var62 = new java.lang.Character('g');
    boolean var63 = var59.valid_f((char)var62);
    boolean var64 = var0.valid_f((char)var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertTrue(var19 == false);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test131() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character(' ');
    boolean var3 = var1.valid_f((char)var2);
    java.lang.Character var4 = new java.lang.Character('g');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "hi!";
    boolean var9 = var7.validateIdentifier(var8);
    java.lang.Character var10 = new java.lang.Character('g');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('y');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('b');
    boolean var15 = var7.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('j');
    boolean var17 = var7.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('y');
    boolean var19 = var7.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('`');
    boolean var21 = var7.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('l');
    boolean var23 = var7.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('u');
    boolean var25 = var7.valid_f((char)var24);
    ds.Identifier var26 = new ds.Identifier();
    java.lang.String var27 = "hi!";
    boolean var28 = var26.validateIdentifier(var27);
    java.lang.Character var29 = new java.lang.Character('d');
    boolean var30 = var26.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('y');
    boolean var32 = var26.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('1');
    boolean var34 = var26.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('y');
    boolean var36 = var26.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('l');
    boolean var38 = var26.valid_f((char)var37);
    java.lang.Character var39 = new java.lang.Character('p');
    boolean var40 = var26.valid_f((char)var39);
    java.lang.Character var41 = new java.lang.Character('c');
    boolean var42 = var26.valid_f((char)var41);
    java.lang.Character var43 = new java.lang.Character('u');
    boolean var44 = var26.valid_f((char)var43);
    java.lang.Character var45 = new java.lang.Character('h');
    boolean var46 = var26.valid_f((char)var45);
    java.lang.Character var47 = new java.lang.Character('n');
    boolean var48 = var26.valid_f((char)var47);
    boolean var49 = var7.valid_f((char)var47);
    boolean var50 = var0.valid_f((char)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
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

}
